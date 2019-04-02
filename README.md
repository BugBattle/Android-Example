# BugBattle-Android 
[![](https://jitpack.io/v/BoehlerBrothers/bugbattle-android-sdk.svg)](https://jitpack.io/#BoehlerBrothers/bugbattle-android-sdk)

The easiest way to integrate BugBattle into your apps is by using the BugBattle Android SDK! This article explains the basic steps to integrate this library to your personal project. 😃

## Add BugBattle from JitPack
Open your app in your preferred  development tool, for e.g. Android Studio.

**Add the repository**

As already mentioned  it’s very simple to include. Add the following repository to your root build.gradle, to get access to the JitPack repository.
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

**Add the dependency**

In the same file ( build.gradle ) add the dependency to include the library. 
```
dependencies {
    ...
    implementation 'com.github.BoehlerBrothers:bugbattle-android-sdk:1.1'
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
    BugBattle.initialise(MainActivity.class, "API KEY", BugBattleActivationMethod.SHAKE);            
} 
```
Add the initialise method to your main activity . Your API key can be found in the project settings within BugBattle. The second parameter is, how the bug report flow is started. There are two ways to activate the flow. The first option is to activate the flow by shaking the device. 
```
BugBattleActivationMethod.SHAKE
```
The second approach is to invoke the following method. This method can be used if the following activation method is passed.
```
BugBattleActivationMethod.SHAKE
```
The following method starts the flow, which is also invoked by the shake gesture. To start the flow use this method:
```
BugBattle.startBugReporting()
```
Now you are ready to go 😄
