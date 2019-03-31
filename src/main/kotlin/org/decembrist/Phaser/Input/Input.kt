@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Input")]
package org.decembrist.Phaser.Input

import org.decembrist.Phaser.Geom.Geom
import org.decembrist.Phaser.Math.Math
import org.decembrist.Phaser.Phaser
import org.w3c.dom.HTMLCanvasElement

external var MOUSE_DOWN: Number = definedExternally
external var MOUSE_MOVE: Number = definedExternally
external var MOUSE_UP: Number = definedExternally
external var TOUCH_START: Number = definedExternally
external var TOUCH_MOVE: Number = definedExternally
external var TOUCH_END: Number = definedExternally
external var POINTER_LOCK_CHANGE: Number = definedExternally
external interface InteractiveObject {
    var gameObject: org.decembrist.Phaser.GameObjects.GameObject
    var enabled: Boolean
    var draggable: Boolean
    var dropZone: Boolean
    var cursor: dynamic /* String | Boolean */
    var target: org.decembrist.Phaser.GameObjects.GameObject
    var camera: org.decembrist.Phaser.Cameras.Scene2D.Camera
    var hitArea: Any
    var hitAreaCallback: (hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit
    var localX: Number
    var localY: Number
    var dragState: dynamic /* Number /* 0 */ | Number /* 1 */ | Number /* 2 */ */
    var dragStartX: Number
    var dragStartY: Number
    var dragX: Number
    var dragY: Number
}
external fun CreateInteractiveObject(gameObject: org.decembrist.Phaser.GameObjects.GameObject, hitArea: Any, hitAreaCallback: (hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit): org.decembrist.Phaser.Input.InteractiveObject = definedExternally
external fun CreatePixelPerfectHandler(textureManager: org.decembrist.Phaser.Textures.TextureManager, alphaTolerance: Number): Function<*> = definedExternally
open external class InputManager(game: Phaser.Game, config: Any) {
    open var game: Phaser.Game = definedExternally
    open var canvas: HTMLCanvasElement = definedExternally
    open var config: Any = definedExternally
    open var enabled: Boolean = definedExternally
    open var events: org.decembrist.Phaser.Events.EventEmitter = definedExternally
    open var queue: Array<Any> = definedExternally
    open var defaultCursor: String = definedExternally
    open var mouse: org.decembrist.Phaser.Input.Mouse.MouseManager = definedExternally
    open var touch: org.decembrist.Phaser.Input.Touch.TouchManager = definedExternally
    open var pointers: Array<Pointer> = definedExternally
    open var pointersTotal: Number = definedExternally
    open var mousePointer: Pointer = definedExternally
    open var activePointer: Pointer = definedExternally
    open var dirty: Boolean = definedExternally
    open var scale: Any = definedExternally
    open var globalTopOnly: Boolean = definedExternally
    open var ignoreEvents: Boolean = definedExternally
    open var bounds: Geom.Rectangle = definedExternally
    open fun boot(): Unit = definedExternally
    open fun updateBounds(): Unit = definedExternally
    open fun resize(): Unit = definedExternally
    open fun setDefaultCursor(cursor: String): Unit = definedExternally
    open fun addPointer(quantity: Number? = definedExternally /* null */): Array<Pointer> = definedExternally
    open fun addUpCallback(callback: Function<*>, isOnce: Boolean? = definedExternally /* null */): InputManager /* this */ = definedExternally
    open fun addDownCallback(callback: Function<*>, isOnce: Boolean? = definedExternally /* null */): InputManager /* this */ = definedExternally
    open fun addMoveCallback(callback: Function<*>, isOnce: Boolean? = definedExternally /* null */): InputManager /* this */ = definedExternally
    open fun hitTest(pointer: Pointer, gameObjects: Array<Any>, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera, output: Array<Any>? = definedExternally /* null */): Array<Any> = definedExternally
    open fun pointWithinHitArea(gameObject: org.decembrist.Phaser.GameObjects.GameObject, x: Number, y: Number): Boolean = definedExternally
    open fun pointWithinInteractiveObject(`object`: org.decembrist.Phaser.Input.InteractiveObject, x: Number, y: Number): Boolean = definedExternally
    open fun transformPointer(pointer: Pointer, pageX: Number, pageY: Number): Unit = definedExternally
    open fun transformX(pageX: Number): Number = definedExternally
    open fun transformY(pageY: Number): Number = definedExternally
    open fun getOffsetX(): Number = definedExternally
    open fun getOffsetY(): Number = definedExternally
    open fun getScaleX(): Number = definedExternally
    open fun getScaleY(): Number = definedExternally
    open fun destroy(): Unit = definedExternally
}
open external class InputPlugin(scene: Phaser.Scene) : org.decembrist.Phaser.Events.EventEmitter {
    open var gamepad: org.decembrist.Phaser.Input.Gamepad.GamepadPlugin = definedExternally
    open var scene: Phaser.Scene = definedExternally
    open var systems: org.decembrist.Phaser.Scenes.Systems = definedExternally
    open var settings: org.decembrist.Phaser.Scenes.Settings.Object = definedExternally
    open var manager: InputManager = definedExternally
    open var enabled: Boolean = definedExternally
    open var displayList: org.decembrist.Phaser.GameObjects.DisplayList = definedExternally
    open var cameras: org.decembrist.Phaser.Cameras.Scene2D.CameraManager = definedExternally
    open var mouse: org.decembrist.Phaser.Input.Mouse.MouseManager = definedExternally
    open var topOnly: Boolean = definedExternally
    open var pollRate: Number = definedExternally
    open var dragDistanceThreshold: Number = definedExternally
    open var dragTimeThreshold: Number = definedExternally
    open fun isActive(): Boolean = definedExternally
    open fun clear(gameObject: org.decembrist.Phaser.GameObjects.GameObject): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    open fun disable(gameObject: org.decembrist.Phaser.GameObjects.GameObject): Unit = definedExternally
    open fun enable(gameObject: org.decembrist.Phaser.GameObjects.GameObject, shape: org.decembrist.Phaser.Input.InputConfiguration? = definedExternally /* null */, callback: ((hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, dropZone: Boolean? = definedExternally /* null */): InputPlugin = definedExternally
    open fun enable(gameObject: org.decembrist.Phaser.GameObjects.GameObject, shape: Any? = definedExternally /* null */, callback: ((hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, dropZone: Boolean? = definedExternally /* null */): InputPlugin = definedExternally
    open fun hitTestPointer(pointer: Pointer): Array<org.decembrist.Phaser.GameObjects.GameObject> = definedExternally
    open fun setDraggable(gameObjects: org.decembrist.Phaser.GameObjects.GameObject, value: Boolean? = definedExternally /* null */): InputPlugin = definedExternally
    open fun setDraggable(gameObjects: Array<org.decembrist.Phaser.GameObjects.GameObject>, value: Boolean? = definedExternally /* null */): InputPlugin = definedExternally
    open fun makePixelPerfect(alphaTolerance: Number? = definedExternally /* null */): Function<*> = definedExternally
    open fun setHitArea(gameObjects: org.decembrist.Phaser.GameObjects.GameObject, shape: org.decembrist.Phaser.Input.InputConfiguration? = definedExternally /* null */, callback: ((hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
    open fun setHitArea(gameObjects: org.decembrist.Phaser.GameObjects.GameObject, shape: Any? = definedExternally /* null */, callback: ((hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
    open fun setHitArea(gameObjects: Array<org.decembrist.Phaser.GameObjects.GameObject>, shape: org.decembrist.Phaser.Input.InputConfiguration? = definedExternally /* null */, callback: ((hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
    open fun setHitArea(gameObjects: Array<org.decembrist.Phaser.GameObjects.GameObject>, shape: Any? = definedExternally /* null */, callback: ((hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
    open fun setHitAreaCircle(gameObjects: org.decembrist.Phaser.GameObjects.GameObject, x: Number, y: Number, radius: Number, callback: ((hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
    open fun setHitAreaCircle(gameObjects: Array<org.decembrist.Phaser.GameObjects.GameObject>, x: Number, y: Number, radius: Number, callback: ((hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
    open fun setHitAreaEllipse(gameObjects: org.decembrist.Phaser.GameObjects.GameObject, x: Number, y: Number, width: Number, height: Number, callback: ((hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
    open fun setHitAreaEllipse(gameObjects: Array<org.decembrist.Phaser.GameObjects.GameObject>, x: Number, y: Number, width: Number, height: Number, callback: ((hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
    open fun setHitAreaFromTexture(gameObjects: org.decembrist.Phaser.GameObjects.GameObject, callback: ((hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
    open fun setHitAreaFromTexture(gameObjects: Array<org.decembrist.Phaser.GameObjects.GameObject>, callback: ((hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
    open fun setHitAreaRectangle(gameObjects: org.decembrist.Phaser.GameObjects.GameObject, x: Number, y: Number, width: Number, height: Number, callback: ((hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
    open fun setHitAreaRectangle(gameObjects: Array<org.decembrist.Phaser.GameObjects.GameObject>, x: Number, y: Number, width: Number, height: Number, callback: ((hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
    open fun setHitAreaTriangle(gameObjects: org.decembrist.Phaser.GameObjects.GameObject, x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, callback: ((hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
    open fun setHitAreaTriangle(gameObjects: Array<org.decembrist.Phaser.GameObjects.GameObject>, x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, callback: ((hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */): InputPlugin = definedExternally
    open fun setPollAlways(): InputPlugin = definedExternally
    open fun setPollOnMove(): InputPlugin = definedExternally
    open fun setPollRate(value: Number): InputPlugin = definedExternally
    open fun setGlobalTopOnly(value: Boolean): InputPlugin = definedExternally
    open fun setTopOnly(value: Boolean): InputPlugin = definedExternally
    open fun sortGameObjects(gameObjects: Array<org.decembrist.Phaser.GameObjects.GameObject>): Array<org.decembrist.Phaser.GameObjects.GameObject> = definedExternally
    open fun stopPropagation(): InputPlugin = definedExternally
    open fun addUpCallback(callback: Function<*>, isOnce: Boolean? = definedExternally /* null */): InputPlugin /* this */ = definedExternally
    open fun addDownCallback(callback: Function<*>, isOnce: Boolean? = definedExternally /* null */): InputPlugin /* this */ = definedExternally
    open fun addMoveCallback(callback: Function<*>, isOnce: Boolean? = definedExternally /* null */): InputPlugin /* this */ = definedExternally
    open fun addPointer(quantity: Number? = definedExternally /* null */): Array<Pointer> = definedExternally
    open fun setDefaultCursor(cursor: String): InputPlugin = definedExternally
    open var x: Number = definedExternally
    open var y: Number = definedExternally
    open var mousePointer: Pointer = definedExternally
    open var activePointer: Pointer = definedExternally
    open var pointer1: Pointer = definedExternally
    open var pointer2: Pointer = definedExternally
    open var pointer3: Pointer = definedExternally
    open var pointer4: Pointer = definedExternally
    open var pointer5: Pointer = definedExternally
    open var pointer6: Pointer = definedExternally
    open var pointer7: Pointer = definedExternally
    open var pointer8: Pointer = definedExternally
    open var pointer9: Pointer = definedExternally
    open var pointer10: Pointer = definedExternally
    open var keyboard: org.decembrist.Phaser.Input.Keyboard.KeyboardPlugin = definedExternally
    open fun enable(gameObject: org.decembrist.Phaser.GameObjects.GameObject): InputPlugin = definedExternally
    open fun setHitArea(gameObjects: org.decembrist.Phaser.GameObjects.GameObject): InputPlugin = definedExternally
    open fun setHitArea(gameObjects: Array<org.decembrist.Phaser.GameObjects.GameObject>): InputPlugin = definedExternally
}
external interface InputConfiguration {
    var hitArea: Any? get() = definedExternally; set(value) = definedExternally
    var hitAreaCallback: Function<*>? get() = definedExternally; set(value) = definedExternally
    var draggable: Boolean? get() = definedExternally; set(value) = definedExternally
    var dropZone: Boolean? get() = definedExternally; set(value) = definedExternally
    var useHandCursor: Boolean? get() = definedExternally; set(value) = definedExternally
    var cursor: String? get() = definedExternally; set(value) = definedExternally
    var pixelPerfect: Boolean? get() = definedExternally; set(value) = definedExternally
    var alphaTolerance: Number? get() = definedExternally; set(value) = definedExternally
}
open external class Pointer(manager: InputManager, id: Number) {
    open var manager: InputManager = definedExternally
    open var id: Number = definedExternally
    open var event: dynamic /* MouseEvent | TouchEvent */ = definedExternally
    open var camera: org.decembrist.Phaser.Cameras.Scene2D.Camera = definedExternally
    open var buttons: Number = definedExternally
    open var position: Math.Vector2 = definedExternally
    open var prevPosition: Math.Vector2 = definedExternally
    open var worldX: Number = definedExternally
    open var worldY: Number = definedExternally
    open var downX: Number = definedExternally
    open var downY: Number = definedExternally
    open var downTime: Number = definedExternally
    open var upX: Number = definedExternally
    open var upY: Number = definedExternally
    open var upTime: Number = definedExternally
    open var primaryDown: Boolean = definedExternally
    open var dragState: Number = definedExternally
    open var isDown: Boolean = definedExternally
    open var dirty: Boolean = definedExternally
    open var justDown: Boolean = definedExternally
    open var justUp: Boolean = definedExternally
    open var justMoved: Boolean = definedExternally
    open var wasTouch: Boolean = definedExternally
    open var movementX: Number = definedExternally
    open var movementY: Number = definedExternally
    open var identifier: Number = definedExternally
    open var pointerId: Number = definedExternally
    open var active: Boolean = definedExternally
    open fun positionToCamera(camera: org.decembrist.Phaser.Cameras.Scene2D.Camera, output: Any? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 */ = definedExternally
    open fun positionToCamera(camera: org.decembrist.Phaser.Cameras.Scene2D.Camera, output: Math.Vector2? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 */ = definedExternally
    open fun noButtonDown(): Boolean = definedExternally
    open fun leftButtonDown(): Boolean = definedExternally
    open fun rightButtonDown(): Boolean = definedExternally
    open fun middleButtonDown(): Boolean = definedExternally
    open fun backButtonDown(): Boolean = definedExternally
    open fun forwardButtonDown(): Boolean = definedExternally
    open fun getDistance(): Number = definedExternally
    open fun getInterpolatedPosition(steps: Number? = definedExternally /* null */, out: Array<Any>? = definedExternally /* null */): Array<Any> = definedExternally
    open fun destroy(): Unit = definedExternally
    open var x: Number = definedExternally
    open var y: Number = definedExternally
    open fun positionToCamera(camera: org.decembrist.Phaser.Cameras.Scene2D.Camera): dynamic /* Any? | Phaser.Math.Vector2 */ = definedExternally
}
