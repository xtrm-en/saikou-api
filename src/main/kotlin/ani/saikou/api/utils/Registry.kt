package ani.saikou.api.utils

/**
 * Registry interface.
 *
 * @param T the type of the registry.
 */
open class Registry<T: Named> {
    /**
     * Underlying registry.
     *
     * Maps the name ([String]) to the object itself ([T]).
     */
    private val registry: MutableMap<String, T> =
        mutableMapOf()

    operator fun get(name: String): T? =
        registry[name]

    operator fun get(index: Int): T? =
        registry[keys()[index]]

    operator fun set(name: String, provider: T?) {
        provider?.let {
            registry[name] = it
        } ?: run {
            registry.remove(name)
        }
    }

    operator fun plusAssign(provider: T) {
        registry[provider.name] = provider
    }

    operator fun minusAssign(provider: T) {
        registry.remove(provider.name)
    }

    fun keys(): List<String> =
        registry.keys.toList().sortedBy { it }

    fun values(): Collection<T> =
        registry.values
}
