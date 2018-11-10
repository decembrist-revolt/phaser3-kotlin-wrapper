@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Input.Mouse")]
package Phaser.Input.Mouse

import org.w3c.dom.events.MouseEvent

open external class MouseManager(inputManager: Phaser.Input.InputManager) {
    open var manager: Phaser.Input.InputManager = definedExternally
    open var capture: Boolean = definedExternally
    open var enabled: Boolean = definedExternally
    open var target: Any = definedExternally
    open var locked: Boolean = definedExternally
    open fun disableContextMenu(): MouseManager = definedExternally
    open fun requestPointerLock(): Unit = definedExternally
    open fun pointerLockChange(event: MouseEvent): Unit = definedExternally
    open fun releasePointerLock(): Unit = definedExternally
    open fun onMouseMove(event: MouseEvent): Unit = definedExternally
    open fun onMouseDown(event: MouseEvent): Unit = definedExternally
    open fun onMouseUp(event: MouseEvent): Unit = definedExternally
    open fun startListeners(): Unit = definedExternally
    open fun stopListeners(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
