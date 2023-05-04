# Roborazzi compare snapshot comment on GitHub pull request sample

This is a sample repository to demonstrate how to use [Roborazzi](https://github.com/takahirom/roborazzi) to compare snapshots on GitHub pull requests.

Demo of the comment

<img src="https://user-images.githubusercontent.com/1386930/236186333-08f17449-6664-4df0-81ba-6babec1ea706.png" width="600" />


## How to use

Please see .github/workflows for the workflow definition.

[StoreScreenshot.yml](.github%2Fworkflows%2FStoreScreenshot.yml) is the workflow to store the screenshot of the pull request.

[CompareScreenshot.yml](.github%2Fworkflows%2FCompareScreenshot.yml) is the workflow to compare the screenshot of the pull request with the one of the base branch.

[CompareScreenshotComment.yml](.github%2Fworkflows%2FCompareScreenshotComment.yml) is the workflow to comment the result of the comparison on the pull request.

## About The companion branch approach

The companion branch approach is a way to store the screenshot of the feature branches.
When a pull request is created, the screenshot of the feature branch is stored in the companion branch.
When the branch is outdated, the branch is deleted.

<img src="https://user-images.githubusercontent.com/1386930/236186355-2510b489-3165-4730-8126-4481fe4c12a8.png" width="600" />
