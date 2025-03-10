// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}

dependencies {
    // lynx dependencies
    implementation("org.lynxsdk.lynx:lynx:3.2.0-rc.0")
    implementation("org.lynxsdk.lynx:lynx-jssdk:3.2.0-rc.0")
    implementation("org.lynxsdk.lynx:lynx-trace:3.2.0-rc.0")
    implementation("org.lynxsdk.lynx:primjs:2.11.1-rc.0")

    // integrating image-service
    implementation("org.lynxsdk.lynx:lynx-service-image:3.2.0-rc.0")

    // image-service dependencies, if not added, images cannot be loaded; if the host APP needs to use other image libraries, you can customize the image-service and remove this dependency
    implementation("com.facebook.fresco:fresco:2.3.0")
    implementation("com.facebook.fresco:animated-gif:2.3.0")
    implementation("com.facebook.fresco:animated-webp:2.3.0")
    implementation("com.facebook.fresco:webpsupport:2.3.0")
    implementation("com.facebook.fresco:animated-base:2.3.0")

    // integrating log-service
    implementation("org.lynxsdk.lynx:lynx-service-log:3.2.0-rc.0")

    // integrating http-service
    implementation("org.lynxsdk.lynx:lynx-service-http:3.2.0-rc.0")

    implementation("com.squareup.okhttp3:okhttp:4.9.0")
}