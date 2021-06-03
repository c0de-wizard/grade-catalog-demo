// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories.applyDefault()
}

allprojects {
    repositories.applyDefault()
}

tasks {
    register("clean",Delete::class){
        delete(rootProject.buildDir)
    }
}