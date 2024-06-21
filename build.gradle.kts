plugins {
    alias(libs.plugins.multiplatform).apply(false)
    alias(libs.plugins.kotlin.android).apply(false)
    alias(libs.plugins.android.library).apply(false)
    alias(libs.plugins.cocoapods).apply(false)
    alias(libs.plugins.compose.plugin).apply(false)
    alias(libs.plugins.compose.compiler).apply(false)
    alias(libs.plugins.android.application).apply(false)
    alias(libs.plugins.buildKonfig).apply(false)
}

subprojects {
    group = "ru.sulgik.mapkit"
}