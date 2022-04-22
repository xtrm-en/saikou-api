private const val kotlinVersion = "1.6.20"

object Plugins {
    const val KOTLIN = kotlinVersion
    const val GRGIT = "4.1.1" // old version for jgit to work on Java 8
    const val KTLINT = "10.2.1"
    const val DOKKA = "1.6.20"
    const val NEXUS_PUBLISH = "1.0.0"
}

object Dependencies {
    const val KOTLIN = kotlinVersion
    const val NICEHTTP = "0.1.3"
//    const val OKHTTP = "4.9.3"
//    const val JSOUP = "1.14.3"
    const val KT_SERIALIZATION_JSON = "1.3.2"
    const val KT_COROUTINES = "1.6.0-native-mt"

    val kotlinModules = arrayOf("stdlib")
}

object Repositories {
    val mavenUrls = arrayOf(
        "https://jitpack.io/",
    )
}
