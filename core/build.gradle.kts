plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    // maven
    id("maven-publish")
}

android {
    namespace = "ir.radservices.core"
    compileSdk = 35

    defaultConfig {
        minSdk = 26

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }

}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}

publishing {

    publications {

        register<MavenPublication>("release") {

            groupId = "ir.radservices.core"
            artifactId = "podcore"
            version = "0.0.2"

            afterEvaluate {

                from(
                    components["release"]
                )
            }
        }
    }
}