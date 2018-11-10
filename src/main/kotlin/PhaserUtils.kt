import Phaser.Events.EventEmitter

enum class PhaserEvent(val eventName: String) {
    POINTER_DOWN("pointerdown"),
    POINTER_OVER("pointerover"),
    POINTER_OUT("pointerout");
}

fun EventEmitter.onEvent(event: PhaserEvent, fn: Function<*>, context: Any? = undefined): EventEmitter {
    return on(event.eventName, fn, context)
}

fun <T> config(obj: T): T {
    obj.asDynamic().hasOwnProperty = fun(property: String): Boolean {
        val ownProperties = js("Object.getOwnPropertyNames(this)")
            .unsafeCast<Array<String>>()
        return when {
            ownProperties.contains(property) -> true
            obj.asDynamic()[property] != undefined -> true
            else -> false
        }
    }
    return obj
}