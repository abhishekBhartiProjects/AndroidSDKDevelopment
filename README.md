# AndroidSDKDevelopment
This is a simple sdk example. It is mainy to test and experiment what all we can do with sdk.

![alt text](https://github.com/abhishekBhartiProjects/AndroidSDKDevelopment/blob/master/integration_guideline.png)

## Add JitPack repository to your build file
allprojects {

	repositories {
		maven { url 'https://jitpack.io' }
	}
	
}

## Add the dependency
dependencies {

	        implementation 'com.github.abhishekBhartiProjects:AndroidSDKDevelopment:0.1.0'

}
