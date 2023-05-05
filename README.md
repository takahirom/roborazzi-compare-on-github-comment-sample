# Roborazzi compare snapshot comment on GitHub pull request sample

This is a sample repository to demonstrate how to use [Roborazzi](https://github.com/takahirom/roborazzi) to compare snapshots on GitHub pull requests.

Example of the comment

<img src="https://user-images.githubusercontent.com/1386930/236186333-08f17449-6664-4df0-81ba-6babec1ea706.png" width="600" />

https://github.com/takahirom/roborazzi-compare-on-github-comment-sample/pull/1#issuecomment-1534555809

## How to use

Please refer to the .github/workflows directory for the workflow definitions.

[StoreScreenshot.yml](.github%2Fworkflows%2FStoreScreenshot.yml) is the workflow to store the screenshot of the pull request.

[CompareScreenshot.yml](.github%2Fworkflows%2FCompareScreenshot.yml) is the workflow to compare the screenshot of the pull request with the one of the base branch.

[CompareScreenshotComment.yml](.github%2Fworkflows%2FCompareScreenshotComment.yml) is the workflow to comment the result of the comparison on the pull request.

## About the companion branch approach

[The companion branch approach](https://github.com/DroidKaigi/conference-app-2022/pull/616) is a way to store the screenshot of the feature branches.
When a pull request is created, the screenshot of the feature branch is stored in the companion branch.
When the branch is outdated, the branch is deleted.
This approach allows users to see changes of the screenshot of the feature branch on pull requests.
And it also saves the cost of the storage because the screenshot of the outdated branches are deleted.

<img src="https://user-images.githubusercontent.com/1386930/236188326-ddd617ae-b216-476c-9d92-e36ad02a2670.png" width="600" />

### Why not use GitHub Actions artifacts?

GitHub Actions artifacts is a good way to store the screenshot.
However, it is not easy to see the changes of the screenshot on pull requests because the artifacts are stored as a zip file.
It seems LFS has [the same problem](https://github.com/git-lfs/git-lfs/issues/1342).

### Why not commit the screenshot to the feature branch?

It is also a good way to store the screenshot.
However, the stored screenshot is not deleted and remains in the repository because Git keeps the history of the commits.