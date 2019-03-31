package org.decembrist.utils

import org.decembrist.Phaser.Events.EventEmitter
import org.decembrist.Phaser.Physics.Arcade.DYNAMIC_BODY
import org.decembrist.Phaser.Physics.Arcade.Factory
import org.decembrist.Phaser.Physics.Arcade.Sprite

enum class PhaserEvent(val eventName: String) {
    POINTER_DOWN("pointerdown"),
    POINTER_OVER("pointerover"),
    POINTER_OUT("pointerout");
}

fun <T : EventEmitter> T.onEvent(
    event: PhaserEvent,
    fn: T.(event: Any) -> Unit,
    context: Any? = undefined
): EventEmitter {
    return on(event.eventName, { evt: Any ->
        fn(this, evt)
    }, context)
}

fun EventEmitter.onEvent(event: PhaserEvent, fn: Function<*>, context: Any? = undefined): EventEmitter {
    return on(event.eventName, fn, context)
}

fun <T : Config> T.toPhaserConfig(): T {
    asDynamic().hasOwnProperty = fun(property: String): Boolean {
        val ownProperties = js("Object.getOwnPropertyNames(this)")
            .unsafeCast<Array<String>>()
        return when {
            ownProperties.contains(property) -> true
            asDynamic()[property] != undefined -> {
                asDynamic()[property] = configSubFields(this, property)
                true
            }
            else -> false
        }
    }
    return this
}

private fun configSubFields(obj: Any, property: String): dynamic {
    val value = obj.asDynamic()[property]
    return if (js("typeof value === \"object\"") as Boolean) {
        if (js("value instanceof Array") as Boolean) {
            obj.asDynamic()[property] = value.map { el, index ->
                configSubFields(value, index)
            }
        } else {
            return if (!(js("value instanceof Function") as Boolean)) {
                value.unsafeCast<Config>().toPhaserConfig()
            } else {
                value
            }
        }
    } else value
}

fun <T : Factory> T.sprite(sprite: Sprite) {
    sys.displayList.add(sprite)
    sys.updateList.add(sprite)
    world.enable(sprite, DYNAMIC_BODY)
}