# How to
## To get a Git project into your build:

Step 1. Add the JitPack repository to your build file
Add it in your settings.gradle.kts at the end of repositories:
``` kotlin
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
  }
}
```
Step 2. Add the dependency
``` kotlin
dependencies {
        implementation("com.github.hadiabedi:podcore:Tag")
}
```
[![](https://jitpack.io/v/hadiabedi/podcore.svg)](https://jitpack.io/#hadiabedi/podcore)
