object Coordinates {
    const val NAME = "saikou-api"
    const val DESC = "Saikou's API, to be used when creating extensions."
    const val VENDOR = "xtrm"

    const val GIT_HOST = "github.com"
    const val REPO_ID = "xtrm-en/$NAME"

    const val GROUP = "me.xtrm.saikou"
    const val VERSION = "0.1.0"
}

object Pom {
    val licenses = arrayOf(
        License("ISC License", "https://opensource.org/licenses/ISC")
    )
    val developers = arrayOf(
        Developer("xtrm")
    )
}

data class License(val name: String, val url: String, val distribution: String = "repo")
data class Developer(val id: String, val name: String = id)
