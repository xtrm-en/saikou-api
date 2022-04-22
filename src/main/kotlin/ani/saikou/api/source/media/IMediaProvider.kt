package ani.saikou.api.source.media

import ani.saikou.api.utils.Named

/**
 * Abstract media provider.
 *
 * @author xtrm
 * @since 1.2.0
 */
interface IMediaProvider: Named {
    /**
     * Does this provider contain adult-rated content.
     */
    val isAdult: Boolean

    /**
     * The media type that this provider supports.
     */
    val mediaType: MediaType
}
