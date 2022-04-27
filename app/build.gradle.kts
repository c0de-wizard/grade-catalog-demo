import util.libs

plugins {
    `android-app-plugin`
}

dependencies {

    // Add any other dependencies or projects here.

    implementation(libs.androidx.appCompat)
    implementation(libs.androidx.coreKtx)
    implementation(libs.compose.material)
    implementation(libs.compose.activity)
    implementation(libs.compose.ui.core)
    implementation(libs.compose.ui.tooling)
}