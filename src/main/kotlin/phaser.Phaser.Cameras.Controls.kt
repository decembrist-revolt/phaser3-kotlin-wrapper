@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Cameras.Controls")]
package Phaser.Cameras.Controls

import FixedKeyControlConfig
import SmoothedKeyControlConfig

open external class FixedKeyControl(config: FixedKeyControlConfig) {
    open var camera: Phaser.Cameras.Scene2D.Camera = definedExternally
    open var left: Phaser.Input.Keyboard.Key = definedExternally
    open var right: Phaser.Input.Keyboard.Key = definedExternally
    open var up: Phaser.Input.Keyboard.Key = definedExternally
    open var down: Phaser.Input.Keyboard.Key = definedExternally
    open var zoomIn: Phaser.Input.Keyboard.Key = definedExternally
    open var zoomOut: Phaser.Input.Keyboard.Key = definedExternally
    open var zoomSpeed: Number = definedExternally
    open var speedX: Number = definedExternally
    open var speedY: Number = definedExternally
    open var active: Boolean = definedExternally
    open fun start(): FixedKeyControl = definedExternally
    open fun stop(): FixedKeyControl = definedExternally
    open fun setCamera(camera: Phaser.Cameras.Scene2D.Camera): FixedKeyControl = definedExternally
    open fun update(delta: Number): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
open external class SmoothedKeyControl(config: SmoothedKeyControlConfig) {
    open var camera: Phaser.Cameras.Scene2D.Camera = definedExternally
    open var left: Phaser.Input.Keyboard.Key = definedExternally
    open var right: Phaser.Input.Keyboard.Key = definedExternally
    open var up: Phaser.Input.Keyboard.Key = definedExternally
    open var down: Phaser.Input.Keyboard.Key = definedExternally
    open var zoomIn: Phaser.Input.Keyboard.Key = definedExternally
    open var zoomOut: Phaser.Input.Keyboard.Key = definedExternally
    open var zoomSpeed: Number = definedExternally
    open var accelX: Number = definedExternally
    open var accelY: Number = definedExternally
    open var dragX: Number = definedExternally
    open var dragY: Number = definedExternally
    open var maxSpeedX: Number = definedExternally
    open var maxSpeedY: Number = definedExternally
    open var active: Boolean = definedExternally
    open fun start(): SmoothedKeyControl = definedExternally
    open fun stop(): SmoothedKeyControl = definedExternally
    open fun setCamera(camera: Phaser.Cameras.Scene2D.Camera): SmoothedKeyControl = definedExternally
    open fun update(delta: Number): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
