# BugBattle-Android 
[ ![Download](https://api.bintray.com/packages/bugbattle/BugBattle-Android/BugBattle-Android-SDK/images/download.svg) ](https://bintray.com/bugbattle/BugBattle-Android/BugBattle-Android-SDK/_latestVersion) [![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://github.com/BugBattle/Android-SDK/graphs/commit-activity) [![Documentation Status](https://readthedocs.org/projects/ansicolortags/badge/?version=latest)](https://docs.bugbattle.io)

The easiest way to integrate BugBattle into your apps is by using the BugBattle Android SDK! This article explains the basic steps to integrate this library to your personal project. 😃

## Add BugBattle from JitPack
Open your app in your preferred  development tool, for e.g. Android Studio.

**Add the dependency**

In the same file ( build.gradle ) add the dependency to include the library. 
```
dependencies {
    ...
    implementation 'io.bugbattle:Bugbattle-Android-SDK:3.0.28'
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
Add the initialise method to your main activity . Your API key can be found in the project settings within BugBattle. The second parameter is, how the bug report flow is started. There are two ways to activate the flow. The first option is to activate the flow by shaking the device. 
```
BugBattleActivationMethod.SHAKE
```
The second approach is to invoke the following method. This method can be used if the following activation method is passed.
```
BugBattleActivationMethod.NONE
```
The third version is a double tap with three fingers. It can be used, if the shake gesture is already in use.
```
BugBattleActivationMethod.THREE_FINGER_DOUBLE_TAB
```
The following method starts the flow, which is also invoked by the shake gesture. To start the flow use this method:
```
BugBattle.startBugReporting()
```
Now you are ready to go 😄
