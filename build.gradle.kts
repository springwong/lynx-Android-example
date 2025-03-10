// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply true
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}

dependencies {
    // lynx dependencies
    implementation(libs.lynx)
    implementation(libs.lynx.jssdk)
    implementation(libs.lynx.trace)
    implementation(libs.primjs)

    // integrating image-service
    implementation(libs.lynx.service.image)

    // image-service dependencies, if not added, images cannot be loaded; if the host APP needs to use other image libraries, you can customize the image-service and remove this dependency
    implementation(libs.fresco)
    implementation(libs.fresco.animated.gif)
    implementation(libs.fresco.animated.webp)
    implementation(libs.fresco.webpsupport)
    implementation(libs.fresco.animated.base)

    // integrating log-service
    implementation(libs.lynx.service.log)

    // integrating http-service
    implementation(libs.lynx.service.http)

    implementation(libs.okhttp)
}