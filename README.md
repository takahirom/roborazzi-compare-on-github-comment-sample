# Roborazzi compare snapshot comment on GitHub pull request sample

This is a sample repository to demonstrate how to use [Roborazzi](https://github.com/takahirom/roborazzi) to compare snapshots on GitHub pull requests.

Demo of the comment


## How to use

Please see .github/workflows for the workflow definition.

[StoreScreenshot.yml](.github%2Fworkflows%2FStoreScreenshot.yml) is the workflow to store the screenshot of the pull request.

[CompareScreenshot.yml](.github%2Fworkflows%2FCompareScreenshot.yml) is the workflow to compare the screenshot of the pull request with the one of the base branch.

[CompareScreenshotComment.yml](.github%2Fworkflows%2FCompareScreenshotComment.yml) is the workflow to comment the result of the comparison on the pull request.

## About The companion branch approach

The companion branch approach is a way to store the screenshot of the feature branches.
When a pull request is created, the screenshot of the feature branch is stored in the companion branch.
When the branch is outdated, the branch is deleted.