buildscript{
    repositories{
        google()
        mavenCentral()
    }
    dependencies{
        classpath("com.android.tools.build:gradle:8.0.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.44.2")
    }
}
tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}





//buildscript {
//    ext {
//        compose_version = '1.4.2'
//    }
//    dependencies {
//        classpath "com.google.dagger:hilt-android-gradle-plugin:2.44.2"
//    }
//}// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
//    id 'com.android.application' version '8.0.0' apply false
//    id 'com.android.library' version '8.0.0' apply false
//    id 'org.jetbrains.kotlin.android' version '1.8.21' apply false
//}
//
//task clean(type: Delete) {
//    delete rootProject.buildDir
//}