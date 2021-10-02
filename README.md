# API AUTOMATION GOREST

Description:
`API AUTOMATION GOREST` is a project to Automate API in https://gorest.co.in/

System Under Test:
1. User

Features:
1. REST API using rest-assured
2. Junit
3. Cucumber

## Prerequisites
* [JDK 8](https://tecadmin.net/install-java-macos/)
* [Git](https://git-scm.com/downloads)
* [Intellij IDEA](https://www.jetbrains.com/idea/download/)
* [Gradle](https://gradle.org/install/)

## Getting started
1. Clone the repository
2. Wait Until Gradle Task Success
3. Copy .env.example to .env
4. Login into https://gorest.co.in/ , and get your credentials.
5. Copy your access token to .env

## Intellij Plugin
### Cucumber for Java
Add IntelliJ Cucumber for Java plugin:
* Open `Preferences`
* Go to `Plugins > Marketplace`
* Search for `Cucumber for Java` and Install

## Running the Test

    > ./gradlew cucumber test -P=@automated-api-gorest

### Specific Running Test
* Execute Method Get
  > ./gradlew cucumber test -P=@Get

* Execute Method Post
  > ./gradlew cucumber test -P=@Post

* Execute Method Delete
  > ./gradlew cucumber test -P=@Delete

* Execute Method Put
  > ./gradlew cucumber test -P=@Put

## Report
* Find the reporting file on `build/customreport/overview-features.html`
* Open the reporting file in browser
