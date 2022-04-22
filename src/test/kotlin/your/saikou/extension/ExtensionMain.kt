package your.saikou.extension

import ani.saikou.api.extension.IExtension

/**
 * Example extension main class
 *
 * @author xtrm
 * @since 0.1.0
 */
class ExtensionMain: IExtension {
    override fun onEnable(): Boolean {
        logger.info("")

        return true
    }

    override fun onDisable(): Boolean {


        return true
    }
}
