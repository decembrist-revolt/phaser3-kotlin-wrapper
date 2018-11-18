package org.decembrist.utils

import org.decembrist.Phaser.Events.EventEmitter

enum class PhaserEvent(val eventName: String) {
    POINTER_DOWN("pointerdown"),
    POINTER_OVER("pointerover"),
    POINTER_OUT("pointerout");
}

fun <T: EventEmitter> T.onEvent(event: PhaserEvent, fn: T.(event: Any) -> Unit, context: Any? = undefined): EventEmitter {
    return on(event.eventName, { evt: Any ->
        fn(this, evt)
    }, context)
}

fun EventEmitter.onEvent(event: PhaserEvent, fn: Function<*>, context: Any? = undefined): EventEmitter {
    return on(event.eventName, fn, context)
}

fun <T: Config> T.toPhaserConfig(): T {
    asDynamic().hasOwnProperty = fun(property: String): Boolean {
        val ownProperties = js("Object.getOwnPropertyNames(this)")
            .unsafeCast<Array<String>>()
        return when {
            ownProperties.contains(property) -> true
            asDynamic()[property] != undefined -> true
            else -> false
        }
    }
    return this
}