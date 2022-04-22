package ani.saikou.api.extension

import ani.saikou.api.SaikouAPI
import ani.saikou.api.log.ILogger

/**
 * Extension default interface.
 *
 * @author xtrm
 * @since 0.1.0
 */
interface IExtension {
    /**
     * The extension logger.
     */
    val logger: ILogger
        get() = SaikouAPI.INSTANCE.extensionManager.getLogger(this)

    /**
     * This extension's metadata.
     */
    val metadata: ExtensionMetadata
        get() = SaikouAPI.INSTANCE.extensionManager.getMetadata(this)

    /**
     * Initialization function, called when the extension is loaded.
     *
     * @since 0.1.0
     * @return `true` if initialization is successful, `false` otherwise
     */
    fun onLoad(): Boolean = true

    /**
     * Function called when the extension is enabled,
     * either manually or at app startup.
     *
     * **Implementation Note**: This could also be used for update checking.
     *
     * @return `true` if the extension was enabled, `false` otherwise
     */
    fun onEnable(): Boolean = true

    /**
     * Function called when the extension is disabled,
     * either manually or at app shutdown.
     *
     * @return `true` if the extension was disabled, `false` otherwise
     */
    fun onDisable(): Boolean = true
}
