pluginManagement {
    repositories {
//        google {
//            content {
//                includeGroupByRegex("com\\.android.*")
//                includeGroupByRegex("com\\.google.*")
//                includeGroupByRegex("androidx.*")
//            }
//        }
//        mavenCentral()
        maven(url = "https://artifactory.internal.cba/artifactory/android-dev/") {
            name = "artifactory"
            // Searches for <name>Username/Password, in this case 'artifactoryUsername/Password'
            credentials(PasswordCredentials::class)
        }
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
//        google()
//        mavenCentral()
        maven(url = "https://artifactory.internal.cba/artifactory/android-dev/") {
            name = "artifactory"
            // Searches for <name>Username/Password, in this case 'artifactoryUsername/Password'
            credentials(PasswordCredentials::class)
        }
    }
}

rootProject.name = "My Test Application"
include(":app")
 