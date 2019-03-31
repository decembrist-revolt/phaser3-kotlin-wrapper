@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Input.Gamepad")]
package org.decembrist.Phaser.Input.Gamepad

import org.decembrist.Phaser.Math.Math
import org.decembrist.Phaser.Phaser
import org.decembrist.utils.GamepadHapticActuator
import org.decembrist.utils.Pad

open external class Axis(pad: Gamepad, index: Number) {
    open var pad: Gamepad = definedExternally
    open var events: org.decembrist.Phaser.Events.EventEmitter = definedExternally
    open var index: Number = definedExternally
    open var value: Number = definedExternally
    open var threshold: Number = definedExternally
    open fun getValue(): Number = definedExternally
    open fun destroy(): Unit = definedExternally
}
open external class Button(pad: Gamepad, index: Number) {
    open var pad: Gamepad = definedExternally
    open var events: org.decembrist.Phaser.Events.EventEmitter = definedExternally
    open var index: Number = definedExternally
    open var value: Number = definedExternally
    open var threshold: Number = definedExternally
    open var pressed: Boolean = definedExternally
    open fun destroy(): Unit = definedExternally
}
open external class Gamepad(manager: GamepadPlugin, pad: Pad) : org.decembrist.Phaser.Events.EventEmitter {
    open var manager: GamepadPlugin = definedExternally
    open var pad: Any = definedExternally
    open var id: String = definedExternally
    open var index: Number = definedExternally
    open var buttons: Array<Button> = definedExternally
    open var axes: Array<Axis> = definedExternally
    open var vibration: GamepadHapticActuator = definedExternally
    open var leftStick: Math.Vector2 = definedExternally
    open var rightStick: Math.Vector2 = definedExternally
    open fun getAxisTotal(): Number = definedExternally
    open fun getAxisValue(index: Number): Number = definedExternally
    open fun setAxisThreshold(value: Number): Unit = definedExternally
    open fun getButtonTotal(): Number = definedExternally
    open fun getButtonValue(index: Number): Number = definedExternally
    open fun isButtonDown(index: Number): Boolean = definedExternally
    override fun destroy(): Unit = definedExternally
    open var connected: Boolean = definedExternally
    open var timestamp: Number = definedExternally
    open var left: Boolean = definedExternally
    open var right: Boolean = definedExternally
    open var up: Boolean = definedExternally
    open var down: Boolean = definedExternally
    open var A: Boolean = definedExternally
    open var Y: Boolean = definedExternally
    open var X: Boolean = definedExternally
    open var B: Boolean = definedExternally
    open var L1: Number = definedExternally
    open var L2: Number = definedExternally
    open var R1: Number = definedExternally
    open var R2: Number = definedExternally
}
open external class GamepadPlugin(sceneInputPlugin: org.decembrist.Phaser.Input.InputPlugin) : org.decembrist.Phaser.Events.EventEmitter {
    open var scene: Phaser.Scene = definedExternally
    open var settings: org.decembrist.Phaser.Scenes.Settings.Object = definedExternally
    open var sceneInputPlugin: org.decembrist.Phaser.Input.InputPlugin = definedExternally
    open var enabled: Boolean = definedExternally
    open var target: Any = definedExternally
    open var gamepads: Array<Gamepad> = definedExternally
    open fun isActive(): Boolean = definedExternally
    open fun disconnectAll(): Unit = definedExternally
    open fun getAll(): Array<Gamepad> = definedExternally
    open fun getPad(index: Number): Gamepad = definedExternally
    open var total: Number = definedExternally
    open var pad1: Gamepad = definedExternally
    open var pad2: Gamepad = definedExternally
    open var pad3: Gamepad = definedExternally
    open var pad4: Gamepad = definedExternally
}
