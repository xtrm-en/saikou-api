package ani.saikou.api.extension

import ani.saikou.api.log.ILogger

/**
 * [IExtension] Manager.
 *
 * @author xtrm
 * @since 0.1.0
 */
interface IExtensionManager {
    /**
     * Provides the [ExtensionMetadata]
     * for the specified [extension].
     *
     * @param extension the [IExtension]
     *
     * @return the [ExtensionMetadata]
     */
    fun getMetadata(extension: IExtension): ExtensionMetadata

    /**
     * Provides the custom [ILogger] implementation
     * for the specified [extension].
     *
     * @param extension the [IExtension].
     *
     * @return [ILogger] instance.
     */
    fun getLogger(extension: IExtension): ILogger
}
