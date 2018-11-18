@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Input.Touch")]
package org.decembrist.Phaser.Input.Touch

import org.decembrist.utils.TouchEvent

open external class TouchManager(inputManager: org.decembrist.Phaser.Input.InputManager) {
    open var manager: org.decembrist.Phaser.Input.InputManager = definedExternally
    open var capture: Boolean = definedExternally
    open var enabled: Boolean = definedExternally
    open var target: Any = definedExternally
    open fun onTouchStart(event: TouchEvent): Unit = definedExternally
    open fun onTouchMove(event: TouchEvent): Unit = definedExternally
    open fun onTouchEnd(event: TouchEvent): Unit = definedExternally
    open fun startListeners(): Unit = definedExternally
    open fun stopListeners(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
