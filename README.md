# Shared Library For Jenkins
##(jenkins_sharedlibrary)

This is a basic shared library for Jenkins (see [Jenkins docu](https://jenkins.io/doc/book/pipeline/shared-libraries/)).

It can be used as template for individual Shared Libraries to extend Jenkins build pipelines.

Its focus is on showing how to overwrite parts of the Jenkins pipeline like `sh()`, or `stage{}`.

### Usage
Add the Shared Library in Jenkins: *Manage Jenkins » Configure System » Global Pipeline Libraries*.
* Select a name like *utils*.
* Check *Load implicitly*.
* Add GitHub Repo: *https://github.com/datze/jenkins_shared_library.git*

The scripts in `/vars` are *Global Variables*. To make them available in pipeline scripts, just add `@Library('the-name-you-gave-it-in-the-jenkins-config')`.