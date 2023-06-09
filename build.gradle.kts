buildscript{
    repositories{
        google()
        mavenCentral()
    }
    dependencies{
        classpath("com.android.tools.build:gradle:7.1.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.40.5")
    }
}
tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}

/*
buildscript {
    ext {
        compose_version = '1.1.1'
    }
    dependencies {
        classpath "com.google.dagger:hilt-android-gradle-plugin:2.40.5"
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id 'com.android.application' version '7.1.0' apply false
    id 'com.android.library' version '7.1.0' apply false
    id 'org.jetbrains.kotlin.android' version '1.6.10' apply false
}
 */
