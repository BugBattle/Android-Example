# BugBattle-Android 
[ ![Download](https://api.bintray.com/packages/bugbattle/BugBattle-Android/BugBattle-Android-SDK/images/download.svg) ](https://bintray.com/bugbattle/BugBattle-Android/BugBattle-Android-SDK/_latestVersion) [![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://github.com/BugBattle/Android-SDK/graphs/commit-activity) [![Documentation Status](https://readthedocs.org/projects/ansicolortags/badge/?version=latest)](https://docs.bugbattle.io)

The easiest way to integrate BugBattle into your apps is by using the BugBattle Android SDK! This article explains the basic steps to integrate this library to your personal project. 😃

## Add BugBattle 
Open your app in your preferred  development tool, for e.g. Android Studio.

**Add the dependency**

In the same file ( build.gradle ) add the dependency to include the library. 
```
dependencies {
    ...
    implementation 'io.bugbattle:Bugbattle-Android-SDK:3.3.9'
}
```
( don't forget to synchronise your includes 😄)

By adding this, you are ready to use the library in your app. Let's carry on with the initialisation 🎉


**Initialise the SDK**

Open your preferred development tool and add the following to your main class.

```
import bugbattle.io.bugbattle.BugBattle;  
import bugbattle.io.bugbattle.BugBattleActivationMethod; 
```
This two includes are everything you need.
```
@Override      
protected void onCreate(Bundle savedInstanceState) {          
    .... 
    BugBattle.initialise("apikey", BugBattleActivationMethod.SHAKE, this);     
} 
```
Add the initialise method to your main activity . Your API key can be found in the project settings within BugBattle. The second parameter is, how the bug report flow is started. There are several activation methodes:
```
BugBattleActivationMethod.SHAKE // Shake the phone to activate

BugBattleActivationMethod.NONE // disable gesture

BugBattleActivationMethod.THREE_FINGER_DOUBLE_TAB // double tap with three fingers to activate

BugBattleActivationMethod.SCREENSHOT // open bugbattle on physically create screenshot

```
The following method starts the flow, which is also invoked by the shake gesture. To start the flow use this method:
```
BugBattle.startBugReporting()
```
Now you are ready to go 😄

**Language**

Sets the default language of the BugBattle reporting flow. Overrides the system default language. The parameter is formatted as Alpha-2 code.  
https://en.wikipedia.org/wiki/List_of_ISO_3166_country_codes

Supported languages are:
- en
- fr
- it
- es
- de

```js
BugBattle.setLanguage("en");
```
