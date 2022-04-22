package ani.saikou.api

import ani.saikou.api.extension.IExtension
import ani.saikou.api.extension.IExtensionManager

/**
 * Saikou's API, to be used when creating extensions.
 *
 * @author xtrm
 * @since 0.1.0
 */
interface SaikouAPI {
    /**
     * The [IExtension] manager.
     */
    val extensionManager: IExtensionManager

    companion object {
        /**
         * SaikouAPI singleton instance.
         */
        lateinit var INSTANCE: SaikouAPI
    }
}
