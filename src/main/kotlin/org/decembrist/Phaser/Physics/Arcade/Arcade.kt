@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Physics.Arcade")]
package org.decembrist.Phaser.Physics.Arcade

import org.decembrist.Phaser.Geom.Geom
import org.decembrist.Phaser.Math.Vector2
import org.decembrist.Phaser.Phaser
import org.decembrist.Phaser.Physics.Arcade.Components.Size
import org.decembrist.utils.*

open external class Image : org.decembrist.Phaser.GameObjects.Image, org.decembrist.Phaser.Physics.Arcade.Components.Acceleration, org.decembrist.Phaser.Physics.Arcade.Components.Angular, org.decembrist.Phaser.Physics.Arcade.Components.Bounce, org.decembrist.Phaser.Physics.Arcade.Components.Debug, org.decembrist.Phaser.Physics.Arcade.Components.Drag, org.decembrist.Phaser.Physics.Arcade.Components.Enable, org.decembrist.Phaser.Physics.Arcade.Components.Friction, org.decembrist.Phaser.Physics.Arcade.Components.Gravity, org.decembrist.Phaser.Physics.Arcade.Components.Immovable, org.decembrist.Phaser.Physics.Arcade.Components.Mass, org.decembrist.Phaser.Physics.Arcade.Components.Size, org.decembrist.Phaser.Physics.Arcade.Components.Velocity, org.decembrist.Phaser.GameObjects.Components.Alpha, org.decembrist.Phaser.GameObjects.Components.BlendMode, org.decembrist.Phaser.GameObjects.Components.Depth, org.decembrist.Phaser.GameObjects.Components.Flip, org.decembrist.Phaser.GameObjects.Components.GetBounds, org.decembrist.Phaser.GameObjects.Components.Origin, org.decembrist.Phaser.GameObjects.Components.Pipeline, org.decembrist.Phaser.GameObjects.Components.ScaleMode, org.decembrist.Phaser.GameObjects.Components.ScrollFactor, org.decembrist.Phaser.GameObjects.Components.Size, org.decembrist.Phaser.GameObjects.Components.Texture, org.decembrist.Phaser.GameObjects.Components.Tint, org.decembrist.Phaser.GameObjects.Components.Transform, org.decembrist.Phaser.GameObjects.Components.Visible {
    constructor(scene: Phaser.Scene, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */)

    override var body: dynamic /* Body | StaticBody */
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* String | Phaser.BlendModes */
    override var depth: Number
    override var flipX: Boolean
    override var flipY: Boolean
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override var defaultPipeline: org.decembrist.Phaser.Renderer.WebGL.WebGLPipeline
    override var pipeline: org.decembrist.Phaser.Renderer.WebGL.WebGLPipeline
    override var scaleMode: Phaser.ScaleModes
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: org.decembrist.Phaser.Textures.Frame
    override var isCropped: Boolean
    override var tintFill: Boolean
    override var tintTopLeft: Number
    override var tintTopRight: Number
    override var tintBottomLeft: Number
    override var tintBottomRight: Number
    override var tint: Number
    override var isTinted: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override var visible: Boolean
    override var debugShowBody: Boolean
    override var debugShowVelocity: Boolean
    override var debugBodyColor: Number
    override fun setSize(width: Number, height: Number, center: Boolean?): Size
    override fun clearAlpha(): Image /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Image /* this */ = definedExternally
    override fun setBlendMode(value: String): Image /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): Image /* this */ = definedExternally
    override fun setDepth(value: Number): Image /* this */ = definedExternally
    override fun toggleFlipX(): Image /* this */ = definedExternally
    override fun toggleFlipY(): Image /* this */ = definedExternally
    override fun setFlipX(value: Boolean): Image /* this */ = definedExternally
    override fun setFlipY(value: Boolean): Image /* this */ = definedExternally
    override fun setFlip(x: Boolean, y: Boolean): Image /* this */ = definedExternally
    override fun resetFlip(): Image /* this */ = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getCenter(output: O? /* null */): O = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getTopLeft(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getTopRight(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getBottomLeft(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getBottomRight(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Geom.Rectangle> getBounds(output: O? /* null */): O = definedExternally
    override fun getCenter(output: Vector2?): Vector2
    override fun getTopLeft(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getTopRight(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getBottomLeft(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getBottomRight(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getBounds(output: Geom.Rectangle?): Geom.Rectangle
    override fun setMask(mask: org.decembrist.Phaser.Display.Masks.BitmapMask): Image /* this */ = definedExternally
    override fun setMask(mask: org.decembrist.Phaser.Display.Masks.GeometryMask): Image /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Image /* this */ = definedExternally
    override fun createBitmapMask(renderable: org.decembrist.Phaser.GameObjects.GameObject?): org.decembrist.Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: org.decembrist.Phaser.GameObjects.Graphics?): org.decembrist.Phaser.Display.Masks.GeometryMask = definedExternally
    override fun setOrigin(x: Number?, y: Number?): Image /* this */ = definedExternally
    override fun setOriginFromFrame(): Image /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): Image /* this */ = definedExternally
    override fun updateDisplayOrigin(): Image /* this */ = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): Image /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): Image /* this */ = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Image /* this */ = definedExternally
    override fun setSizeToFrame(frame: org.decembrist.Phaser.Textures.Frame): Image /* this */ = definedExternally
    override fun setSize(width: Number, height: Number): Image /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Image /* this */ = definedExternally
    override fun setCrop(x: Number?, y: Number?, width: Number?, height: Number?): Image /* this */ = definedExternally
    override fun setCrop(x: Geom.Rectangle?, y: Number?, width: Number?, height: Number?): Image /* this */ = definedExternally
    override fun setTexture(key: String, frame: String?): Image /* this */ = definedExternally
    override fun setTexture(key: String, frame: Number?): Image /* this */ = definedExternally
    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): Image /* this */ = definedExternally
    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): Image /* this */ = definedExternally
    override fun clearTint(): Image /* this */ = definedExternally
    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Image /* this */ = definedExternally
    override fun setTintFill(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Image /* this */ = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Image /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Image /* this */ = definedExternally
    override fun setRotation(radians: Number?): Image /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Image /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Image /* this */ = definedExternally
    override fun setX(value: Number?): Image /* this */ = definedExternally
    override fun setY(value: Number?): Image /* this */ = definedExternally
    override fun setZ(value: Number?): Image /* this */ = definedExternally
    override fun setW(value: Number?): Image /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix?): org.decembrist.Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix?): org.decembrist.Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun setVisible(value: Boolean): Image /* this */ = definedExternally
    override fun setAcceleration(x: Number, y: Number?): Image /* this */ = definedExternally
    override fun setAccelerationX(value: Number): Image /* this */ = definedExternally
    override fun setAccelerationY(value: Number): Image /* this */ = definedExternally
    override fun setAngularVelocity(value: Number): Image /* this */ = definedExternally
    override fun setAngularAcceleration(value: Number): Image /* this */ = definedExternally
    override fun setAngularDrag(value: Number): Image /* this */ = definedExternally
    override fun setBounce(x: Number, y: Number?): Image /* this */ = definedExternally
    override fun setBounceX(value: Number): Image /* this */ = definedExternally
    override fun setBounceY(value: Number): Image /* this */ = definedExternally
    override fun setCollideWorldBounds(value: Boolean): Image /* this */ = definedExternally
    override fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): Image /* this */ = definedExternally
    override fun setDebugBodyColor(value: Number): Image /* this */ = definedExternally
    override fun setDrag(x: Number, y: Number?): Image /* this */ = definedExternally
    override fun setDragX(value: Number): Image /* this */ = definedExternally
    override fun setDragY(value: Number): Image /* this */ = definedExternally
    override fun setDamping(value: Boolean): Image /* this */ = definedExternally
    override fun enableBody(reset: Boolean, x: Number, y: Number, enableGameObject: Boolean, showGameObject: Boolean): Image /* this */ = definedExternally
    override fun disableBody(disableGameObject: Boolean?, hideGameObject: Boolean?): Image /* this */ = definedExternally
    override fun refreshBody(): Image /* this */ = definedExternally
    override fun setFriction(x: Number, y: Number?): Image /* this */ = definedExternally
    override fun setFrictionX(x: Number): Image /* this */ = definedExternally
    override fun setFrictionY(x: Number): Image /* this */ = definedExternally
    override fun setGravity(x: Number, y: Number?): Image /* this */ = definedExternally
    override fun setGravityX(x: Number): Image /* this */ = definedExternally
    override fun setGravityY(y: Number): Image /* this */ = definedExternally
    override fun setImmovable(value: Boolean?): Image /* this */ = definedExternally
    override fun setMass(value: Number): Image /* this */ = definedExternally
    override fun setOffset(x: Number, y: Number?): Image /* this */ = definedExternally
    override fun setCircle(radius: Number, offsetX: Number?, offsetY: Number?): Image /* this */ = definedExternally
    override fun setVelocity(x: Number, y: Number?): Image /* this */ = definedExternally
    override fun setVelocityX(x: Number): Image /* this */ = definedExternally
    override fun setVelocityY(y: Number): Image /* this */ = definedExternally
    override fun setMaxVelocity(x: Number, y: Number?): Image /* this */ = definedExternally
    override fun setCrop(): Image /* this */ = definedExternally
    override fun setTexture(key: String): Image /* this */ = definedExternally
}
open external class ArcadePhysics(scene: Phaser.Scene) {
    open var scene: Phaser.Scene = definedExternally
    open var systems: org.decembrist.Phaser.Scenes.Systems = definedExternally
    open var config: Any = definedExternally
    open var world: World = definedExternally
    open var add: Factory = definedExternally
    open fun getConfig(): Any = definedExternally
    open fun overlap(object1: () -> Unit, object2: (() -> Unit)? = definedExternally /* null */, collideCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Boolean = definedExternally
    open fun collide(object1: () -> Unit, object2: (() -> Unit)? = definedExternally /* null */, collideCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Boolean = definedExternally
    open fun pause(): World = definedExternally
    open fun resume(): World = definedExternally
    open fun accelerateTo(gameObject: org.decembrist.Phaser.GameObjects.GameObject, x: Number, y: Number, speed: Number? = definedExternally /* null */, xSpeedMax: Number? = definedExternally /* null */, ySpeedMax: Number? = definedExternally /* null */): Number = definedExternally
    open fun accelerateToObject(gameObject: org.decembrist.Phaser.GameObjects.GameObject, destination: org.decembrist.Phaser.GameObjects.GameObject, speed: Number? = definedExternally /* null */, xSpeedMax: Number? = definedExternally /* null */, ySpeedMax: Number? = definedExternally /* null */): Number = definedExternally
    open fun closest(source: Any): Body = definedExternally
    open fun furthest(source: Any): Body = definedExternally
    open fun moveTo(gameObject: org.decembrist.Phaser.GameObjects.GameObject, x: Number, y: Number, speed: Number? = definedExternally /* null */, maxTime: Number? = definedExternally /* null */): Number = definedExternally
    open fun moveToObject(gameObject: org.decembrist.Phaser.GameObjects.GameObject, destination: Any, speed: Number? = definedExternally /* null */, maxTime: Number? = definedExternally /* null */): Number = definedExternally
    open fun velocityFromAngle(angle: Number, speed: Number? = definedExternally /* null */, vec2: org.decembrist.Phaser.Math.Vector2? = definedExternally /* null */): org.decembrist.Phaser.Math.Vector2 = definedExternally
    open fun velocityFromRotation(rotation: Number, speed: Number? = definedExternally /* null */, vec2: org.decembrist.Phaser.Math.Vector2? = definedExternally /* null */): org.decembrist.Phaser.Math.Vector2 = definedExternally
    open fun shutdown(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
open external class Sprite : org.decembrist.Phaser.GameObjects.Sprite, org.decembrist.Phaser.Physics.Arcade.Components.Acceleration, org.decembrist.Phaser.Physics.Arcade.Components.Angular, org.decembrist.Phaser.Physics.Arcade.Components.Bounce, org.decembrist.Phaser.Physics.Arcade.Components.Debug, org.decembrist.Phaser.Physics.Arcade.Components.Drag, org.decembrist.Phaser.Physics.Arcade.Components.Enable, org.decembrist.Phaser.Physics.Arcade.Components.Friction, org.decembrist.Phaser.Physics.Arcade.Components.Gravity, org.decembrist.Phaser.Physics.Arcade.Components.Immovable, org.decembrist.Phaser.Physics.Arcade.Components.Mass, org.decembrist.Phaser.Physics.Arcade.Components.Size, org.decembrist.Phaser.Physics.Arcade.Components.Velocity, org.decembrist.Phaser.GameObjects.Components.Alpha, org.decembrist.Phaser.GameObjects.Components.BlendMode, org.decembrist.Phaser.GameObjects.Components.Depth, org.decembrist.Phaser.GameObjects.Components.Flip, org.decembrist.Phaser.GameObjects.Components.GetBounds, org.decembrist.Phaser.GameObjects.Components.Origin, org.decembrist.Phaser.GameObjects.Components.Pipeline, org.decembrist.Phaser.GameObjects.Components.ScaleMode, org.decembrist.Phaser.GameObjects.Components.ScrollFactor, org.decembrist.Phaser.GameObjects.Components.Size, org.decembrist.Phaser.GameObjects.Components.Texture, org.decembrist.Phaser.GameObjects.Components.Tint, org.decembrist.Phaser.GameObjects.Components.Transform, org.decembrist.Phaser.GameObjects.Components.Visible {
    constructor(scene: Phaser.Scene, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */)override var body: dynamic /* Body | StaticBody */

    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* String | Phaser.BlendModes */
    override var depth: Number
    override var flipX: Boolean
    override var flipY: Boolean
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override var defaultPipeline: org.decembrist.Phaser.Renderer.WebGL.WebGLPipeline
    override var pipeline: org.decembrist.Phaser.Renderer.WebGL.WebGLPipeline
    override var scaleMode: Phaser.ScaleModes
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: org.decembrist.Phaser.Textures.Frame
    override var isCropped: Boolean
    override var tintFill: Boolean
    override var tintTopLeft: Number
    override var tintTopRight: Number
    override var tintBottomLeft: Number
    override var tintBottomRight: Number
    override var tint: Number
    override var isTinted: Boolean
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override var visible: Boolean
    override var debugShowBody: Boolean
    override var debugShowVelocity: Boolean
    override var debugBodyColor: Number
    override fun setSize(width: Number, height: Number, center: Boolean?): Size
    override fun clearAlpha(): Sprite /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Sprite /* this */ = definedExternally
    override fun setBlendMode(value: String): Sprite /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): Sprite /* this */ = definedExternally
    override fun setDepth(value: Number): Sprite /* this */ = definedExternally
    override fun toggleFlipX(): Sprite /* this */ = definedExternally
    override fun toggleFlipY(): Sprite /* this */ = definedExternally
    override fun setFlipX(value: Boolean): Sprite /* this */ = definedExternally
    override fun setFlipY(value: Boolean): Sprite /* this */ = definedExternally
    override fun setFlip(x: Boolean, y: Boolean): Sprite /* this */ = definedExternally
    override fun resetFlip(): Sprite /* this */ = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getCenter(output: O? /* null */): O = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getTopLeft(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getTopRight(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getBottomLeft(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getBottomRight(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Geom.Rectangle> getBounds(output: O? /* null */): O = definedExternally
    override fun getCenter(output: Vector2?): Vector2
    override fun getTopLeft(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getTopRight(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getBottomLeft(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getBottomRight(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getBounds(output: Geom.Rectangle?): Geom.Rectangle
    override fun setMask(mask: org.decembrist.Phaser.Display.Masks.BitmapMask): Sprite /* this */ = definedExternally
    override fun setMask(mask: org.decembrist.Phaser.Display.Masks.GeometryMask): Sprite /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Sprite /* this */ = definedExternally
    override fun createBitmapMask(renderable: org.decembrist.Phaser.GameObjects.GameObject?): org.decembrist.Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: org.decembrist.Phaser.GameObjects.Graphics?): org.decembrist.Phaser.Display.Masks.GeometryMask = definedExternally
    override fun setOrigin(x: Number?, y: Number?): Sprite /* this */ = definedExternally
    override fun setOriginFromFrame(): Sprite /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): Sprite /* this */ = definedExternally
    override fun updateDisplayOrigin(): Sprite /* this */ = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): Sprite /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): Sprite /* this */ = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Sprite /* this */ = definedExternally
    override fun setSizeToFrame(frame: org.decembrist.Phaser.Textures.Frame): Sprite /* this */ = definedExternally
    override fun setSize(width: Number, height: Number): Sprite /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Sprite /* this */ = definedExternally
    override fun setCrop(x: Number?, y: Number?, width: Number?, height: Number?): Sprite /* this */ = definedExternally
    override fun setCrop(x: Geom.Rectangle?, y: Number?, width: Number?, height: Number?): Sprite /* this */ = definedExternally
    override fun setTexture(key: String, frame: String?): Sprite /* this */ = definedExternally
    override fun setTexture(key: String, frame: Number?): Sprite /* this */ = definedExternally
    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): Sprite /* this */ = definedExternally
    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): Sprite /* this */ = definedExternally
    override fun clearTint(): Sprite /* this */ = definedExternally
    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Sprite /* this */ = definedExternally
    override fun setTintFill(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Sprite /* this */ = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Sprite /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Sprite /* this */ = definedExternally
    override fun setRotation(radians: Number?): Sprite /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Sprite /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Sprite /* this */ = definedExternally
    override fun setX(value: Number?): Sprite /* this */ = definedExternally
    override fun setY(value: Number?): Sprite /* this */ = definedExternally
    override fun setZ(value: Number?): Sprite /* this */ = definedExternally
    override fun setW(value: Number?): Sprite /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix?): org.decembrist.Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix?): org.decembrist.Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun setVisible(value: Boolean): Sprite /* this */ = definedExternally
    override fun setAcceleration(x: Number, y: Number?): Sprite /* this */ = definedExternally
    override fun setAccelerationX(value: Number): Sprite /* this */ = definedExternally
    override fun setAccelerationY(value: Number): Sprite /* this */ = definedExternally
    override fun setAngularVelocity(value: Number): Sprite /* this */ = definedExternally
    override fun setAngularAcceleration(value: Number): Sprite /* this */ = definedExternally
    override fun setAngularDrag(value: Number): Sprite /* this */ = definedExternally
    override fun setBounce(x: Number, y: Number?): Sprite /* this */ = definedExternally
    override fun setBounceX(value: Number): Sprite /* this */ = definedExternally
    override fun setBounceY(value: Number): Sprite /* this */ = definedExternally
    override fun setCollideWorldBounds(value: Boolean): Sprite /* this */ = definedExternally
    override fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): Sprite /* this */ = definedExternally
    override fun setDebugBodyColor(value: Number): Sprite /* this */ = definedExternally
    override fun setDrag(x: Number, y: Number?): Sprite /* this */ = definedExternally
    override fun setDragX(value: Number): Sprite /* this */ = definedExternally
    override fun setDragY(value: Number): Sprite /* this */ = definedExternally
    override fun setDamping(value: Boolean): Sprite /* this */ = definedExternally
    override fun enableBody(reset: Boolean, x: Number, y: Number, enableGameObject: Boolean, showGameObject: Boolean): Sprite /* this */ = definedExternally
    override fun disableBody(disableGameObject: Boolean?, hideGameObject: Boolean?): Sprite /* this */ = definedExternally
    override fun refreshBody(): Sprite /* this */ = definedExternally
    override fun setFriction(x: Number, y: Number?): Sprite /* this */ = definedExternally
    override fun setFrictionX(x: Number): Sprite /* this */ = definedExternally
    override fun setFrictionY(x: Number): Sprite /* this */ = definedExternally
    override fun setGravity(x: Number, y: Number?): Sprite /* this */ = definedExternally
    override fun setGravityX(x: Number): Sprite /* this */ = definedExternally
    override fun setGravityY(y: Number): Sprite /* this */ = definedExternally
    override fun setImmovable(value: Boolean?): Sprite /* this */ = definedExternally
    override fun setMass(value: Number): Sprite /* this */ = definedExternally
    override fun setOffset(x: Number, y: Number?): Sprite /* this */ = definedExternally
    override fun setCircle(radius: Number, offsetX: Number?, offsetY: Number?): Sprite /* this */ = definedExternally
    override fun setVelocity(x: Number, y: Number?): Sprite /* this */ = definedExternally
    override fun setVelocityX(x: Number): Sprite /* this */ = definedExternally
    override fun setVelocityY(y: Number): Sprite /* this */ = definedExternally
    override fun setMaxVelocity(x: Number, y: Number?): Sprite /* this */ = definedExternally
    override fun setCrop(): Sprite /* this */ = definedExternally
    override fun setTexture(key: String): Sprite /* this */ = definedExternally
}
open external class Body(world: World, gameObject: org.decembrist.Phaser.GameObjects.GameObject) {
    open var world: World = definedExternally
    open var gameObject: org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    open var transform: Any = definedExternally
    open var debugShowBody: Boolean = definedExternally
    open var debugShowVelocity: Boolean = definedExternally
    open var debugBodyColor: Number = definedExternally
    open var enable: Boolean = definedExternally
    open var isCircle: Boolean = definedExternally
    open var radius: Number = definedExternally
    open var offset: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var position: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var prev: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var allowRotation: Boolean = definedExternally
    open var rotation: Number = definedExternally
    open var preRotation: Number = definedExternally
    open var width: Number = definedExternally
    open var height: Number = definedExternally
    open var sourceWidth: Number = definedExternally
    open var sourceHeight: Number = definedExternally
    open var halfWidth: Number = definedExternally
    open var halfHeight: Number = definedExternally
    open var center: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var velocity: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var newVelocity: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var deltaMax: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var acceleration: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var allowDrag: Boolean = definedExternally
    open var drag: dynamic /* Number | Phaser.Math.Vector2 */ = definedExternally
    open var allowGravity: Boolean = definedExternally
    open var gravity: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var bounce: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var worldBounce: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var onWorldBounds: Boolean = definedExternally
    open var onCollide: Boolean = definedExternally
    open var onOverlap: Boolean = definedExternally
    open var maxVelocity: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var friction: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var useDamping: Boolean = definedExternally
    open var angularVelocity: Number = definedExternally
    open var angularAcceleration: Number = definedExternally
    open var angularDrag: Number = definedExternally
    open var maxAngular: Number = definedExternally
    open var mass: Number = definedExternally
    open var angle: Number = definedExternally
    open var speed: Number = definedExternally
    open var facing: Number = definedExternally
    open var immovable: Boolean = definedExternally
    open var moves: Boolean = definedExternally
    open var customSeparateX: Boolean = definedExternally
    open var customSeparateY: Boolean = definedExternally
    open var overlapX: Number = definedExternally
    open var overlapY: Number = definedExternally
    open var overlapR: Number = definedExternally
    open var embedded: Boolean = definedExternally
    open var collideWorldBounds: Boolean = definedExternally
    open var checkCollision: ArcadeBodyCollision = definedExternally
    open var touching: ArcadeBodyCollision = definedExternally
    open var wasTouching: ArcadeBodyCollision = definedExternally
    open var blocked: ArcadeBodyCollision = definedExternally
    open var syncBounds: Boolean = definedExternally
    open var isMoving: Boolean = definedExternally
    open var stopVelocityOnCollide: Boolean = definedExternally
    open var physicsType: Number = definedExternally
    open fun updateBounds(): Unit = definedExternally
    open fun updateCenter(): Unit = definedExternally
    open fun update(delta: Number): Unit = definedExternally
    open fun postUpdate(resetDelta: Boolean): Unit = definedExternally
    open fun checkWorldBounds(): Boolean = definedExternally
    open fun setOffset(x: Number, y: Number? = definedExternally /* null */): Body = definedExternally
    open fun setSize(width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, center: Boolean? = definedExternally /* null */): Body = definedExternally
    open fun setCircle(radius: Number, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): Body = definedExternally
    open fun reset(x: Number, y: Number): Unit = definedExternally
    open fun stop(): Body = definedExternally
    open fun getBounds(obj: ArcadeBodyBounds): ArcadeBodyBounds = definedExternally
    open fun hitTest(x: Number, y: Number): Boolean = definedExternally
    open fun onFloor(): Boolean = definedExternally
    open fun onCeiling(): Boolean = definedExternally
    open fun onWall(): Boolean = definedExternally
    open fun deltaAbsX(): Number = definedExternally
    open fun deltaAbsY(): Number = definedExternally
    open fun deltaX(): Number = definedExternally
    open fun deltaY(): Number = definedExternally
    open fun deltaZ(): Number = definedExternally
    open fun destroy(): Unit = definedExternally
    open fun drawDebug(graphic: org.decembrist.Phaser.GameObjects.Graphics): Unit = definedExternally
    open fun willDrawDebug(): Boolean = definedExternally
    open fun setCollideWorldBounds(value: Boolean? = definedExternally /* null */): Body = definedExternally
    open fun setVelocity(x: Number, y: Number? = definedExternally /* null */): Body = definedExternally
    open fun setVelocityX(value: Number): Body = definedExternally
    open fun setVelocityY(value: Number): Body = definedExternally
    open fun setMaxVelocity(x: Number, y: Number? = definedExternally /* null */): Body = definedExternally
    open fun setBounce(x: Number, y: Number): Body = definedExternally
    open fun setBounceX(value: Number): Body = definedExternally
    open fun setBounceY(value: Number): Body = definedExternally
    open fun setAcceleration(x: Number, y: Number): Body = definedExternally
    open fun setAccelerationX(value: Number): Body = definedExternally
    open fun setAccelerationY(value: Number): Body = definedExternally
    open fun setAllowDrag(value: Boolean? = definedExternally /* null */): Body = definedExternally
    open fun setAllowGravity(value: Boolean? = definedExternally /* null */): Body = definedExternally
    open fun setAllowRotation(value: Boolean? = definedExternally /* null */): Body = definedExternally
    open fun setDrag(x: Number, y: Number): Body = definedExternally
    open fun setDragX(value: Number): Body = definedExternally
    open fun setDragY(value: Number): Body = definedExternally
    open fun setGravity(x: Number, y: Number): Body = definedExternally
    open fun setGravityX(value: Number): Body = definedExternally
    open fun setGravityY(value: Number): Body = definedExternally
    open fun setFriction(x: Number, y: Number): Body = definedExternally
    open fun setFrictionX(value: Number): Body = definedExternally
    open fun setFrictionY(value: Number): Body = definedExternally
    open fun setAngularVelocity(value: Number): Body = definedExternally
    open fun setAngularAcceleration(value: Number): Body = definedExternally
    open fun setAngularDrag(value: Number): Body = definedExternally
    open fun setMass(value: Number): Body = definedExternally
    open fun setImmovable(value: Boolean? = definedExternally /* null */): Body = definedExternally
    open var x: Number = definedExternally
    open var y: Number = definedExternally
    open var left: Number = definedExternally
    open var right: Number = definedExternally
    open var top: Number = definedExternally
    open var bottom: Number = definedExternally
}
open external class Collider(world: World, overlapOnly: Boolean, object1: () -> Unit, object2: () -> Unit, collideCallback: (object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any) {
    open var world: World = definedExternally
    open var name: String = definedExternally
    open var active: Boolean = definedExternally
    open var overlapOnly: Boolean = definedExternally
    open var object1: () -> Unit = definedExternally
    open var object2: () -> Unit = definedExternally
    open var collideCallback: (object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit = definedExternally
    open var processCallback: (object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit = definedExternally
    open var callbackContext: Any = definedExternally
    open fun setName(name: String): Collider = definedExternally
    open fun update(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
external var DYNAMIC_BODY: Number = definedExternally
external var STATIC_BODY: Number = definedExternally
external var GROUP: Number = definedExternally
external var TILEMAPLAYER: Number = definedExternally
external var FACING_NONE: Number = definedExternally
external var FACING_UP: Number = definedExternally
external var FACING_DOWN: Number = definedExternally
external var FACING_LEFT: Number = definedExternally
external var FACING_RIGHT: Number = definedExternally
external interface `T$7` {
    var collideWorldBounds: Boolean? get() = definedExternally; set(value) = definedExternally
    var accelerationX: Number? get() = definedExternally; set(value) = definedExternally
    var accelerationY: Number? get() = definedExternally; set(value) = definedExternally
    var allowDrag: Boolean? get() = definedExternally; set(value) = definedExternally
    var allowGravity: Boolean? get() = definedExternally; set(value) = definedExternally
    var allowRotation: Boolean? get() = definedExternally; set(value) = definedExternally
    var bounceX: Number? get() = definedExternally; set(value) = definedExternally
    var bounceY: Number? get() = definedExternally; set(value) = definedExternally
    var dragX: Number? get() = definedExternally; set(value) = definedExternally
    var dragY: Number? get() = definedExternally; set(value) = definedExternally
    var gravityX: Number? get() = definedExternally; set(value) = definedExternally
    var gravityY: Number? get() = definedExternally; set(value) = definedExternally
    var frictionX: Number? get() = definedExternally; set(value) = definedExternally
    var frictionY: Number? get() = definedExternally; set(value) = definedExternally
    var velocityX: Number? get() = definedExternally; set(value) = definedExternally
    var velocityY: Number? get() = definedExternally; set(value) = definedExternally
    var angularVelocity: Number? get() = definedExternally; set(value) = definedExternally
    var angularAcceleration: Number? get() = definedExternally; set(value) = definedExternally
    var angularDrag: Number? get() = definedExternally; set(value) = definedExternally
    var mass: Number? get() = definedExternally; set(value) = definedExternally
    var immovable: Boolean? get() = definedExternally; set(value) = definedExternally
}
open external class Factory(world: World) {
    open var world: World = definedExternally
    open var scene: Phaser.Scene = definedExternally
    open var sys: org.decembrist.Phaser.Scenes.Systems = definedExternally
    open fun collider(object1: org.decembrist.Phaser.GameObjects.GameObject, object2: dynamic /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */, collideCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Collider = definedExternally
    open fun collider(object1: Array<org.decembrist.Phaser.GameObjects.GameObject>, object2: dynamic /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */, collideCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Collider = definedExternally
    open fun collider(object1: org.decembrist.Phaser.GameObjects.Group, object2: dynamic /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */, collideCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Collider = definedExternally
    open fun collider(object1: Array<org.decembrist.Phaser.GameObjects.Group>, object2: dynamic /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */, collideCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Collider = definedExternally
    open fun overlap(object1: org.decembrist.Phaser.GameObjects.GameObject, object2: dynamic /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */, collideCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Collider = definedExternally
    open fun overlap(object1: Array<org.decembrist.Phaser.GameObjects.GameObject>, object2: dynamic /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */, collideCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Collider = definedExternally
    open fun overlap(object1: org.decembrist.Phaser.GameObjects.Group, object2: dynamic /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */, collideCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Collider = definedExternally
    open fun overlap(object1: Array<org.decembrist.Phaser.GameObjects.Group>, object2: dynamic /* Phaser.GameObjects.GameObject | Array<Phaser.GameObjects.GameObject> | Phaser.GameObjects.Group | Array<Phaser.GameObjects.Group> */, collideCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Collider = definedExternally
    open fun existing(gameObject: org.decembrist.Phaser.GameObjects.GameObject, isStatic: Boolean? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    open fun staticImage(x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */): Image = definedExternally
    open fun staticImage(x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */): Image = definedExternally
    open fun image(x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */): Image = definedExternally
    open fun image(x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */): Image = definedExternally
    open fun staticSprite(x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */): Sprite = definedExternally
    open fun staticSprite(x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */): Sprite = definedExternally
    open fun sprite(x: Number, y: Number, key: String, frame: String? = definedExternally /* null */): Sprite = definedExternally
    open fun sprite(x: Number, y: Number, key: String, frame: Number? = definedExternally /* null */): Sprite = definedExternally
    open fun staticGroup(children: Array<org.decembrist.Phaser.GameObjects.GameObject>? = definedExternally /* null */, config: GroupConfig? = definedExternally /* null */): StaticGroup = definedExternally
    open fun staticGroup(children: Array<org.decembrist.Phaser.GameObjects.GameObject>? = definedExternally /* null */, config: GroupCreateConfig? = definedExternally /* null */): StaticGroup = definedExternally
    open fun staticGroup(children: GroupConfig? = definedExternally /* null */, config: GroupConfig? = definedExternally /* null */): StaticGroup = definedExternally
    open fun staticGroup(children: GroupConfig? = definedExternally /* null */, config: GroupCreateConfig? = definedExternally /* null */): StaticGroup = definedExternally
    open fun staticGroup(children: GroupCreateConfig? = definedExternally /* null */, config: GroupConfig? = definedExternally /* null */): StaticGroup = definedExternally
    open fun staticGroup(children: GroupCreateConfig? = definedExternally /* null */, config: GroupCreateConfig? = definedExternally /* null */): StaticGroup = definedExternally
    open fun group(children: Array<org.decembrist.Phaser.GameObjects.GameObject>? = definedExternally /* null */, config: GroupCreateConfig? = definedExternally /* null */): Group = definedExternally
    open fun group(children: Array<org.decembrist.Phaser.GameObjects.GameObject>? = definedExternally /* null */, config: GroupConfig? /* GroupConfig & `T$7` */ = definedExternally /* null */): Group = definedExternally
    open fun group(children: GroupCreateConfig? = definedExternally /* null */, config: GroupCreateConfig? = definedExternally /* null */): Group = definedExternally
    open fun group(children: GroupCreateConfig? = definedExternally /* null */, config: GroupConfig? /* GroupConfig & `T$7` */ = definedExternally /* null */): Group = definedExternally
    open fun group(children: GroupConfig? /* GroupConfig & `T$7` */ = definedExternally /* null */, config: GroupCreateConfig? = definedExternally /* null */): Group = definedExternally
    open fun group(children: GroupConfig? /* GroupConfig & `T$7` */ = definedExternally /* null */, config: GroupConfig? /* GroupConfig & `T$7` */ = definedExternally /* null */): Group = definedExternally
    open fun destroy(): Unit = definedExternally
    open fun staticImage(x: Number, y: Number, texture: String): Image = definedExternally
    open fun image(x: Number, y: Number, texture: String): Image = definedExternally
    open fun staticSprite(x: Number, y: Number, texture: String): Sprite = definedExternally
    open fun sprite(x: Number, y: Number, key: String): Sprite = definedExternally
    open fun staticGroup(): StaticGroup = definedExternally
    open fun group(): Group = definedExternally
}
external fun GetOverlapX(body1: Body, body2: Body, overlapOnly: Boolean, bias: Number): Number = definedExternally
external fun GetOverlapY(body1: Body, body2: Body, overlapOnly: Boolean, bias: Number): Number = definedExternally
open external class Group : org.decembrist.Phaser.GameObjects.Group {
    constructor(world: World, scene: Phaser.Scene, children: Array<org.decembrist.Phaser.GameObjects.GameObject>? = definedExternally /* null */, config: GroupCreateConfig? = definedExternally /* null */)
    constructor(world: World, scene: Phaser.Scene, children: Array<org.decembrist.Phaser.GameObjects.GameObject>? = definedExternally /* null */, config: GroupConfig? /* GroupConfig & `T$7` */ = definedExternally /* null */)
    constructor(world: World, scene: Phaser.Scene, children: GroupCreateConfig? = definedExternally /* null */, config: GroupCreateConfig? = definedExternally /* null */)
    constructor(world: World, scene: Phaser.Scene, children: GroupCreateConfig? = definedExternally /* null */, config: GroupConfig? /* GroupConfig & `T$7` */ = definedExternally /* null */)
    constructor(world: World, scene: Phaser.Scene, children: GroupConfig? /* GroupConfig & `T$7` */ = definedExternally /* null */, config: GroupCreateConfig? = definedExternally /* null */)
    constructor(world: World, scene: Phaser.Scene, children: GroupConfig? /* GroupConfig & `T$7` */ = definedExternally /* null */, config: GroupConfig? /* GroupConfig & `T$7` */ = definedExternally /* null */)

    open var world: World
    override var classType: dynamic /* Image | Sprite */
    open var physicsType: Number
    open var defaults: PhysicsGroupDefaults
    open fun createCallbackHandler(child: org.decembrist.Phaser.GameObjects.GameObject): Unit = definedExternally
    open fun removeCallbackHandler(child: org.decembrist.Phaser.GameObjects.GameObject): Unit = definedExternally
    open fun setVelocity(x: Number, y: Number, step: Number? = definedExternally /* null */): Group = definedExternally
    open fun setVelocityX(value: Number, step: Number? = definedExternally /* null */): Group = definedExternally
    open fun setVelocityY(value: Number, step: Number? = definedExternally /* null */): Group = definedExternally
}
external fun SeparateX(body1: Body, body2: Body, overlapOnly: Boolean, bias: Number): Boolean = definedExternally
external fun SeparateY(body1: Body, body2: Body, overlapOnly: Boolean, bias: Number): Boolean = definedExternally
open external class StaticBody(world: World, gameObject: org.decembrist.Phaser.GameObjects.GameObject) {
    open var world: World = definedExternally
    open var gameObject: org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    open var debugShowBody: Boolean = definedExternally
    open var debugBodyColor: Number = definedExternally
    open var enable: Boolean = definedExternally
    open var isCircle: Boolean = definedExternally
    open var radius: Number = definedExternally
    open var offset: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var position: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var width: Number = definedExternally
    open var height: Number = definedExternally
    open var halfWidth: Number = definedExternally
    open var halfHeight: Number = definedExternally
    open var center: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var velocity: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var allowGravity: Boolean = definedExternally
    open var gravity: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var bounce: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var onWorldBounds: Boolean = definedExternally
    open var onCollide: Boolean = definedExternally
    open var onOverlap: Boolean = definedExternally
    open var mass: Number = definedExternally
    open var immovable: Boolean = definedExternally
    open var customSeparateX: Boolean = definedExternally
    open var customSeparateY: Boolean = definedExternally
    open var overlapX: Number = definedExternally
    open var overlapY: Number = definedExternally
    open var overlapR: Number = definedExternally
    open var embedded: Boolean = definedExternally
    open var collideWorldBounds: Boolean = definedExternally
    open var checkCollision: ArcadeBodyCollision = definedExternally
    open var touching: ArcadeBodyCollision = definedExternally
    open var wasTouching: ArcadeBodyCollision = definedExternally
    open var blocked: ArcadeBodyCollision = definedExternally
    open var physicsType: Number = definedExternally
    open fun setGameObject(gameObject: org.decembrist.Phaser.GameObjects.GameObject, update: Boolean? = definedExternally /* null */): StaticBody = definedExternally
    open fun updateFromGameObject(): StaticBody = definedExternally
    open fun setOffset(x: Number, y: Number): StaticBody = definedExternally
    open fun setSize(width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): StaticBody = definedExternally
    open fun setCircle(radius: Number, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): StaticBody = definedExternally
    open fun updateCenter(): Unit = definedExternally
    open fun reset(x: Number, y: Number): Unit = definedExternally
    open fun stop(): StaticBody = definedExternally
    open fun getBounds(obj: ArcadeBodyBounds): ArcadeBodyBounds = definedExternally
    open fun hitTest(x: Number, y: Number): Boolean = definedExternally
    open fun postUpdate(): Unit = definedExternally
    open fun deltaAbsX(): Number = definedExternally
    open fun deltaAbsY(): Number = definedExternally
    open fun deltaX(): Number = definedExternally
    open fun deltaY(): Number = definedExternally
    open fun deltaZ(): Number = definedExternally
    open fun destroy(): Unit = definedExternally
    open fun drawDebug(graphic: org.decembrist.Phaser.GameObjects.Graphics): Unit = definedExternally
    open fun willDrawDebug(): Boolean = definedExternally
    open fun setMass(value: Number): StaticBody = definedExternally
    open var x: Number = definedExternally
    open var y: Number = definedExternally
    open var left: Number = definedExternally
    open var right: Number = definedExternally
    open var top: Number = definedExternally
    open var bottom: Number = definedExternally
}
open external class StaticGroup : org.decembrist.Phaser.GameObjects.Group {
    constructor(world: World, scene: Phaser.Scene, children: Array<org.decembrist.Phaser.GameObjects.GameObject>? = definedExternally /* null */, config: GroupConfig? = definedExternally /* null */)
    constructor(world: World, scene: Phaser.Scene, children: Array<org.decembrist.Phaser.GameObjects.GameObject>? = definedExternally /* null */, config: GroupCreateConfig? = definedExternally /* null */)
    constructor(world: World, scene: Phaser.Scene, children: GroupConfig? = definedExternally /* null */, config: GroupConfig? = definedExternally /* null */)
    constructor(world: World, scene: Phaser.Scene, children: GroupConfig? = definedExternally /* null */, config: GroupCreateConfig? = definedExternally /* null */)
    constructor(world: World, scene: Phaser.Scene, children: GroupCreateConfig? = definedExternally /* null */, config: GroupConfig? = definedExternally /* null */)
    constructor(world: World, scene: Phaser.Scene, children: GroupCreateConfig? = definedExternally /* null */, config: GroupCreateConfig? = definedExternally /* null */)

    open var world: World
    open var physicsType: Number
    open fun createCallbackHandler(child: org.decembrist.Phaser.GameObjects.GameObject): Unit = definedExternally
    open fun removeCallbackHandler(child: org.decembrist.Phaser.GameObjects.GameObject): Unit = definedExternally
    open fun createMultipleCallbackHandler(entries: Array<org.decembrist.Phaser.GameObjects.GameObject>): Unit = definedExternally
    open fun refresh(): StaticGroup = definedExternally
}
open external class World(scene: Phaser.Scene, config: ArcadeWorldConfig) : org.decembrist.Phaser.Events.EventEmitter {
    open var scene: Phaser.Scene = definedExternally
    open var bodies: org.decembrist.Phaser.Structs.Set<Body> = definedExternally
    open var staticBodies: org.decembrist.Phaser.Structs.Set<StaticBody> = definedExternally
    open var pendingDestroy: org.decembrist.Phaser.Structs.Set<dynamic /* Body | StaticBody */> = definedExternally
    open var colliders: org.decembrist.Phaser.Structs.ProcessQueue<Collider> = definedExternally
    open var gravity: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var bounds: Geom.Rectangle = definedExternally
    open var checkCollision: CheckCollisionObject = definedExternally
    open var fps: Number = definedExternally
    open var stepsLastFrame: Number = definedExternally
    open var timeScale: Any = definedExternally
    open var OVERLAP_BIAS: Number = definedExternally
    open var TILE_BIAS: Number = definedExternally
    open var forceX: Boolean = definedExternally
    open var isPaused: Boolean = definedExternally
    open var drawDebug: Boolean = definedExternally
    open var debugGraphic: org.decembrist.Phaser.GameObjects.Graphics = definedExternally
    open var defaults: ArcadeWorldDefaults = definedExternally
    open var maxEntries: Number = definedExternally
    open var useTree: Boolean = definedExternally
    open var tree: org.decembrist.Phaser.Structs.RTree = definedExternally
    open var staticTree: org.decembrist.Phaser.Structs.RTree = definedExternally
    open var treeMinMax: ArcadeWorldTreeMinMax = definedExternally
    open fun enable(`object`: org.decembrist.Phaser.GameObjects.GameObject, bodyType: Number? = definedExternally /* null */): Unit = definedExternally
    open fun enable(`object`: Array<org.decembrist.Phaser.GameObjects.GameObject>, bodyType: Number? = definedExternally /* null */): Unit = definedExternally
    open fun enable(`object`: org.decembrist.Phaser.GameObjects.Group, bodyType: Number? = definedExternally /* null */): Unit = definedExternally
    open fun enable(`object`: Array<org.decembrist.Phaser.GameObjects.Group>, bodyType: Number? = definedExternally /* null */): Unit = definedExternally
    open fun enableBody(`object`: org.decembrist.Phaser.GameObjects.GameObject, bodyType: Number? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    open fun add(body: Body): dynamic /* Body | StaticBody */ = definedExternally
    open fun add(body: StaticBody): dynamic /* Body | StaticBody */ = definedExternally
    open fun disable(`object`: org.decembrist.Phaser.GameObjects.GameObject): Unit = definedExternally
    open fun disable(`object`: Array<org.decembrist.Phaser.GameObjects.GameObject>): Unit = definedExternally
    open fun disable(`object`: org.decembrist.Phaser.GameObjects.Group): Unit = definedExternally
    open fun disable(`object`: Array<org.decembrist.Phaser.GameObjects.Group>): Unit = definedExternally
    open fun disableBody(body: Body): Unit = definedExternally
    open fun disableBody(body: StaticBody): Unit = definedExternally
    open fun remove(body: Body): Unit = definedExternally
    open fun remove(body: StaticBody): Unit = definedExternally
    open fun createDebugGraphic(): org.decembrist.Phaser.GameObjects.Graphics = definedExternally
    open fun setBounds(x: Number, y: Number, width: Number, height: Number, checkLeft: Boolean? = definedExternally /* null */, checkRight: Boolean? = definedExternally /* null */, checkUp: Boolean? = definedExternally /* null */, checkDown: Boolean? = definedExternally /* null */): World = definedExternally
    open fun setBoundsCollision(left: Boolean? = definedExternally /* null */, right: Boolean? = definedExternally /* null */, up: Boolean? = definedExternally /* null */, down: Boolean? = definedExternally /* null */): World = definedExternally
    open fun pause(): World = definedExternally
    open fun resume(): World = definedExternally
    open fun addCollider(object1: () -> Unit, object2: () -> Unit, collideCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Collider = definedExternally
    open fun addOverlap(object1: () -> Unit, object2: () -> Unit, collideCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Collider = definedExternally
    open fun removeCollider(collider: Collider): World = definedExternally
    open fun setFPS(framerate: Number): World /* this */ = definedExternally
    open fun update(time: Number, delta: Number): Unit = definedExternally
    open fun step(delta: Number): Unit = definedExternally
    open fun postUpdate(): Unit = definedExternally
    open fun updateMotion(body: Body, delta: Number): Unit = definedExternally
    open fun computeAngularVelocity(body: Body, delta: Number): Unit = definedExternally
    open fun computeVelocity(body: Body, delta: Number): Unit = definedExternally
    open fun separate(body1: Body, body2: Body, processCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */, overlapOnly: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun separateCircle(body1: Body, body2: Body, overlapOnly: Boolean? = definedExternally /* null */, bias: Number? = definedExternally /* null */): Boolean = definedExternally
    open fun intersects(body1: Body, body2: Body): Boolean = definedExternally
    open fun circleBodyIntersects(circle: Body, body: Body): Boolean = definedExternally
    open fun overlap(object1: () -> Unit, object2: (() -> Unit)? = definedExternally /* null */, overlapCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Boolean = definedExternally
    open fun collide(object1: () -> Unit, object2: (() -> Unit)? = definedExternally /* null */, collideCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): Boolean = definedExternally
    open fun collideObjects(object1: () -> Unit, object2: (() -> Unit)? = definedExternally /* null */, collideCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */, overlapOnly: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun collideHandler(object1: () -> Unit, object2: (() -> Unit)? = definedExternally /* null */, collideCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, processCallback: ((object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */, overlapOnly: Boolean? = definedExternally /* null */): Boolean = definedExternally
    open fun collideSpriteVsSprite(sprite1: org.decembrist.Phaser.GameObjects.GameObject, sprite2: org.decembrist.Phaser.GameObjects.GameObject, collideCallback: (object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any, overlapOnly: Boolean): Boolean = definedExternally
    open fun collideSpriteVsGroup(sprite: org.decembrist.Phaser.GameObjects.GameObject, group: org.decembrist.Phaser.GameObjects.Group, collideCallback: (object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any, overlapOnly: Boolean): Boolean = definedExternally
    open fun collideGroupVsTilemapLayer(group: org.decembrist.Phaser.GameObjects.Group, tilemapLayer: org.decembrist.Phaser.Tilemaps.DynamicTilemapLayer, collideCallback: (object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any, overlapOnly: Boolean): Boolean = definedExternally
    open fun collideGroupVsTilemapLayer(group: org.decembrist.Phaser.GameObjects.Group, tilemapLayer: org.decembrist.Phaser.Tilemaps.StaticTilemapLayer, collideCallback: (object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any, overlapOnly: Boolean): Boolean = definedExternally
    open fun collideSpriteVsTilemapLayer(sprite: org.decembrist.Phaser.GameObjects.GameObject, tilemapLayer: org.decembrist.Phaser.Tilemaps.DynamicTilemapLayer, collideCallback: (object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any, overlapOnly: Boolean): Boolean = definedExternally
    open fun collideSpriteVsTilemapLayer(sprite: org.decembrist.Phaser.GameObjects.GameObject, tilemapLayer: org.decembrist.Phaser.Tilemaps.StaticTilemapLayer, collideCallback: (object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any, overlapOnly: Boolean): Boolean = definedExternally
    open fun collideGroupVsGroup(group1: org.decembrist.Phaser.GameObjects.Group, group2: org.decembrist.Phaser.GameObjects.Group, collideCallback: (object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit, processCallback: (object1: org.decembrist.Phaser.GameObjects.GameObject, object2: org.decembrist.Phaser.GameObjects.GameObject) -> Unit, callbackContext: Any, overlapOnly: Boolean): Boolean = definedExternally
    open fun wrap(`object`: Any, padding: Number? = definedExternally /* null */): Unit = definedExternally
    open fun wrapArray(objects: Array<Any>, padding: Number? = definedExternally /* null */): Unit = definedExternally
    open fun wrapObject(`object`: Any, padding: Number? = definedExternally /* null */): Unit = definedExternally
    override fun shutdown(): Unit = definedExternally
    override fun destroy(): Unit = definedExternally
}
