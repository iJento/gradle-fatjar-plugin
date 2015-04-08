# Gradle FatJar Plugin
Plugin to add a fat jar task and configurations to a project

[![Build Status](https://travis-ci.org/iJento/gradle-fatjar-plugin.svg?branch=master)](https://travis-ci.org/iJento/gradle-fatjar-plugin)
 [ ![Download](https://api.bintray.com/packages/ijento/maven/gradle-fatjar-plugin/images/download.svg) ](https://bintray.com/ijento/maven/gradle-fatjar-plugin/_latestVersion)
[![Snapshot](http://img.shields.io/badge/current-0.1.0--SNAPSHOT-blue.svg)](https://github.com/iJento/gradle-fatjar-plugin/tree/master)
[![License](http://img.shields.io/badge/license-Apache_License_v2-lightgrey.svg)](#copyright-and-license)


## Contributors
* [Ollie Freeman](https://github.com/olliefreeman)

## Usage

The plugin is designed to be used by being added to a project. Currently the plugin is not available anywhere and will have to be checked out and installed into your Maven Local repository using `gradle build install`. 

Applying the plugin can then be done as follows:

```groovy
buildscript {
	repositories {
		mavenLocal()
	}
	dependencies {
		classpath group: 'com.github.ijento', name: 'gradle-fatjar-plugin', version: '0.1.0-SNAPSHOT'
	}
}

apply plugin: 'com.github.ijento.fatjar'
```

It will then it will add the following tasks to the root project and sub-projects respectively.

### Project Tasks


## Configuring

Property              | Type           | Default | Usage
--------              | ------         | ------  | ------ 
 

These can be set in the usual way using the extension `fatjar` as the example below:
```groovy
fatjar {
	
}
```

## Contributing
You are welcome to contribute to this project, please fork the repository, create a branch for your feature and then submit a pull request.

## Copyright and License
All versions of the gradle-fatjar-plugin are published under the [Apache License v2](https://github.com/iJento/gradle-fatjar-plugin/blob/master/LICENSE)
