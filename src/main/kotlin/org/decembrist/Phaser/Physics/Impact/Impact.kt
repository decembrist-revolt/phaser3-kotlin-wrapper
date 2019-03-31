@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Physics.Impact") JsNonModule]
package org.decembrist.Phaser.Physics.Impact

import org.decembrist.Phaser.Display.Display
import org.decembrist.Phaser.Geom.Geom
import org.decembrist.Phaser.Math.Math
import org.decembrist.Phaser.Phaser
import org.decembrist.utils.JSONImpactBody

open external class Body(world: World, x: Number, y: Number, sx: Number? = definedExternally /* null */, sy: Number? = definedExternally /* null */) {
    open var world: World = definedExternally
    open var gameObject: org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    open var enabled: Boolean = definedExternally
    open var parent: dynamic /* ImpactBody | ImpactImage | ImpactSprite */ = definedExternally
    open var id: Number = definedExternally
    open var name: String = definedExternally
    open var size: Any = definedExternally
    open var offset: Any = definedExternally
    open var pos: Any = definedExternally
    open var last: Any = definedExternally
    open var vel: Any = definedExternally
    open var accel: Any = definedExternally
    open var friction: Any = definedExternally
    open var maxVel: Any = definedExternally
    open var standing: Boolean = definedExternally
    open var gravityFactor: Number = definedExternally
    open var bounciness: Number = definedExternally
    open var minBounceVelocity: Number = definedExternally
    open var accelGround: Number = definedExternally
    open var accelAir: Number = definedExternally
    open var jumpSpeed: Number = definedExternally
    open var type: TYPE = definedExternally
    open var checkAgainst: TYPE = definedExternally
    open var collides: COLLIDES = definedExternally
    open var debugShowBody: Boolean = definedExternally
    open var debugShowVelocity: Boolean = definedExternally
    open var debugBodyColor: Number = definedExternally
    open var updateCallback: (body: Body) -> Unit = definedExternally
    open var slopeStanding: Any = definedExternally
    open fun reset(x: Number, y: Number): Unit = definedExternally
    open fun update(delta: Number): Unit = definedExternally
    open fun drawDebug(graphic: org.decembrist.Phaser.GameObjects.Graphics): Unit = definedExternally
    open fun willDrawDebug(): Boolean = definedExternally
    open fun skipHash(): Boolean = definedExternally
    open fun touches(other: Body): Boolean = definedExternally
    open fun resetSize(x: Number, y: Number, width: Number, height: Number): Body = definedExternally
    open fun toJSON(): JSONImpactBody = definedExternally
    open fun fromJSON(config: Any): Unit = definedExternally
    open fun check(other: Body): Unit = definedExternally
    open fun collideWith(other: Body, axis: String): Unit = definedExternally
    open fun handleMovementTrace(res: Number): Boolean = definedExternally
    open fun destroy(): Unit = definedExternally
}
external enum class COLLIDES {
    NEVER,
    LITE,
    PASSIVE,
    ACTIVE,
    FIXED
}
open external class CollisionMap(tilesize: Number? = definedExternally /* null */, data: Array<Any>? = definedExternally /* null */) {
    open var tilesize: Number = definedExternally
    open var data: Array<Any> = definedExternally
    open var width: Number = definedExternally
    open var height: Number = definedExternally
    open var lastSlope: Number = definedExternally
    open var tiledef: Any = definedExternally
    open fun trace(x: Number, y: Number, vx: Number, vy: Number, objectWidth: Number, objectHeight: Number): Boolean = definedExternally
    open fun step(res: Any, x: Number, y: Number, vx: Number, vy: Number, width: Number, height: Number, rvx: Number, rvy: Number, step: Number): Unit = definedExternally
    open fun checkDef(res: Any, t: Number, x: Number, y: Number, vx: Number, vy: Number, width: Number, height: Number, tileX: Number, tileY: Number): Boolean = definedExternally
}
open external class Factory(world: World) {
    open var world: World = definedExternally
    open var sys: org.decembrist.Phaser.Scenes.Systems = definedExternally
    open fun body(x: Number, y: Number, width: Number, height: Number): ImpactBody = definedExternally
    open fun existing(gameObject: org.decembrist.Phaser.GameObjects.GameObject): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    open fun image(x: Number, y: Number, key: String, frame: String? = definedExternally /* null */): ImpactImage = definedExternally
    open fun image(x: Number, y: Number, key: String, frame: Number? = definedExternally /* null */): ImpactImage = definedExternally
    open fun sprite(x: Number, y: Number, key: String, frame: String? = definedExternally /* null */): ImpactSprite = definedExternally
    open fun sprite(x: Number, y: Number, key: String, frame: Number? = definedExternally /* null */): ImpactSprite = definedExternally
    open fun destroy(): Unit = definedExternally
    open fun image(x: Number, y: Number, key: String): ImpactImage = definedExternally
    open fun sprite(x: Number, y: Number, key: String): ImpactSprite = definedExternally
}
external fun GetVelocity(delta: Number, vel: Number, accel: Number, friction: Number, max: Number): Number = definedExternally
open external class ImpactBody(world: World, x: Number, y: Number, width: Number, height: Number) : org.decembrist.Phaser.Physics.Impact.Components.Acceleration, org.decembrist.Phaser.Physics.Impact.Components.BodyScale, org.decembrist.Phaser.Physics.Impact.Components.BodyType, org.decembrist.Phaser.Physics.Impact.Components.Bounce, org.decembrist.Phaser.Physics.Impact.Components.CheckAgainst, org.decembrist.Phaser.Physics.Impact.Components.Collides, org.decembrist.Phaser.Physics.Impact.Components.Debug, org.decembrist.Phaser.Physics.Impact.Components.Friction, org.decembrist.Phaser.Physics.Impact.Components.Gravity, org.decembrist.Phaser.Physics.Impact.Components.Offset, org.decembrist.Phaser.Physics.Impact.Components.SetGameObject, org.decembrist.Phaser.Physics.Impact.Components.Velocity {
    open var body: Body = definedExternally
    open var size: Any = definedExternally
    open var offset: Any = definedExternally
    open var vel: Any = definedExternally
    open var accel: Any = definedExternally
    open var friction: Any = definedExternally
    open var maxVel: Any = definedExternally
    override fun setAccelerationX(x: Number): ImpactBody /* this */ = definedExternally
    override fun setAccelerationY(y: Number): ImpactBody /* this */ = definedExternally
    override fun setAcceleration(x: Number, y: Number): ImpactBody /* this */ = definedExternally
    override fun setBodySize(width: Number, height: Number?): ImpactBody /* this */ = definedExternally
    override fun setBodyScale(scaleX: Number, scaleY: Number?): ImpactBody /* this */ = definedExternally
    override fun getBodyType(): Number = definedExternally
    override fun setTypeNone(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setTypeA(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setTypeB(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setBounce(value: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setMinBounceVelocity(value: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override var bounce: Number = definedExternally
    override fun setAvsB(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setBvsA(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setCheckAgainstNone(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setCheckAgainstA(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setCheckAgainstB(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override var checkAgainst: Number = definedExternally
    override fun setCollideCallback(callback: (body: Body, other: Body, axis: String) -> Unit, scope: Any): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setCollidesNever(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setLiteCollision(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setPassiveCollision(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setActiveCollision(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setFixedCollision(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override var collides: Number = definedExternally
    override fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setDebugBodyColor(value: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override var debugShowBody: Boolean = definedExternally
    override var debugShowVelocity: Boolean = definedExternally
    override var debugBodyColor: Number = definedExternally
    override fun setFrictionX(x: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setFrictionY(y: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setFriction(x: Number, y: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setGravity(value: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override var gravity: Number = definedExternally
    override fun setOffset(x: Number, y: Number, width: Number?, height: Number?): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setGameObject(gameObject: org.decembrist.Phaser.GameObjects.GameObject, sync: Boolean?): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun syncGameObject(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setVelocityX(x: Number): ImpactBody /* this */ = definedExternally
    override fun setVelocityY(y: Number): ImpactBody /* this */ = definedExternally
    override fun setVelocity(x: Number, y: Number?): ImpactBody /* this */ = definedExternally
    override fun setMaxVelocity(x: Number, y: Number?): ImpactBody /* this */ = definedExternally
}
open external class ImpactImage : org.decembrist.Phaser.GameObjects.Image, org.decembrist.Phaser.Physics.Impact.Components.Acceleration, org.decembrist.Phaser.Physics.Impact.Components.BodyScale, org.decembrist.Phaser.Physics.Impact.Components.BodyType, org.decembrist.Phaser.Physics.Impact.Components.Bounce, org.decembrist.Phaser.Physics.Impact.Components.CheckAgainst, org.decembrist.Phaser.Physics.Impact.Components.Collides, org.decembrist.Phaser.Physics.Impact.Components.Debug, org.decembrist.Phaser.Physics.Impact.Components.Friction, org.decembrist.Phaser.Physics.Impact.Components.Gravity, org.decembrist.Phaser.Physics.Impact.Components.Offset, org.decembrist.Phaser.Physics.Impact.Components.SetGameObject, org.decembrist.Phaser.Physics.Impact.Components.Velocity, org.decembrist.Phaser.GameObjects.Components.Alpha, org.decembrist.Phaser.GameObjects.Components.BlendMode, org.decembrist.Phaser.GameObjects.Components.Depth, org.decembrist.Phaser.GameObjects.Components.Flip, org.decembrist.Phaser.GameObjects.Components.GetBounds, org.decembrist.Phaser.GameObjects.Components.Origin, org.decembrist.Phaser.GameObjects.Components.Pipeline, org.decembrist.Phaser.GameObjects.Components.ScaleMode, org.decembrist.Phaser.GameObjects.Components.ScrollFactor, org.decembrist.Phaser.GameObjects.Components.Size, org.decembrist.Phaser.GameObjects.Components.Texture, org.decembrist.Phaser.GameObjects.Components.Tint, org.decembrist.Phaser.GameObjects.Components.Transform, org.decembrist.Phaser.GameObjects.Components.Visible {
    constructor(world: World, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */)
    constructor(world: World, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */)

    override var body: Body
    open var size: Any
    open var offset: Any
    open var vel: Any
    open var accel: Any
    open var friction: Any
    open var maxVel: Any
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
    override var bounce: Number
    override var checkAgainst: Number
    override var collides: Number
    override var debugShowBody: Boolean
    override var debugShowVelocity: Boolean
    override var debugBodyColor: Number
    override var gravity: Number
    override fun clearAlpha(): ImpactImage /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): ImpactImage /* this */ = definedExternally
    override fun setBlendMode(value: String): ImpactImage /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): ImpactImage /* this */ = definedExternally
    override fun setDepth(value: Number): ImpactImage /* this */ = definedExternally
    override fun toggleFlipX(): ImpactImage /* this */ = definedExternally
    override fun toggleFlipY(): ImpactImage /* this */ = definedExternally
    override fun setFlipX(value: Boolean): ImpactImage /* this */ = definedExternally
    override fun setFlipY(value: Boolean): ImpactImage /* this */ = definedExternally
    override fun setFlip(x: Boolean, y: Boolean): ImpactImage /* this */ = definedExternally
    override fun resetFlip(): ImpactImage /* this */ = definedExternally
    override fun <O : Math.Vector2> getCenter(output: O? /* null */): O = definedExternally
    override fun <O : Math.Vector2> getTopLeft(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Math.Vector2> getTopRight(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Math.Vector2> getBottomLeft(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Math.Vector2> getBottomRight(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Geom.Rectangle> getBounds(output: O? /* null */): O = definedExternally
    override fun getCenter(output: Math.Vector2?): Math.Vector2
    override fun getTopLeft(output: Math.Vector2?, includeParent: Boolean?): Math.Vector2
    override fun getTopRight(output: Math.Vector2?, includeParent: Boolean?): Math.Vector2
    override fun getBottomLeft(output: Math.Vector2?, includeParent: Boolean?): Math.Vector2
    override fun getBottomRight(output: Math.Vector2?, includeParent: Boolean?): Math.Vector2
    override fun getBounds(output: Geom.Rectangle?): Geom.Rectangle
    override fun setMask(mask: Display.Masks.BitmapMask): ImpactImage /* this */ = definedExternally
    override fun setMask(mask: Display.Masks.GeometryMask): ImpactImage /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): ImpactImage /* this */ = definedExternally
    override fun createBitmapMask(renderable: org.decembrist.Phaser.GameObjects.GameObject?): Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: org.decembrist.Phaser.GameObjects.Graphics?): Display.Masks.GeometryMask = definedExternally
    override fun setOrigin(x: Number?, y: Number?): ImpactImage /* this */ = definedExternally
    override fun setOriginFromFrame(): ImpactImage /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): ImpactImage /* this */ = definedExternally
    override fun updateDisplayOrigin(): ImpactImage /* this */ = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): ImpactImage /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): ImpactImage /* this */ = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): ImpactImage /* this */ = definedExternally
    override fun setSizeToFrame(frame: org.decembrist.Phaser.Textures.Frame): ImpactImage /* this */ = definedExternally
    override fun setSize(width: Number, height: Number): ImpactImage /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): ImpactImage /* this */ = definedExternally
    override fun setCrop(x: Number?, y: Number?, width: Number?, height: Number?): ImpactImage /* this */ = definedExternally
    override fun setCrop(x: Geom.Rectangle?, y: Number?, width: Number?, height: Number?): ImpactImage /* this */ = definedExternally
    override fun setTexture(key: String, frame: String?): ImpactImage /* this */ = definedExternally
    override fun setTexture(key: String, frame: Number?): ImpactImage /* this */ = definedExternally
    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): ImpactImage /* this */ = definedExternally
    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): ImpactImage /* this */ = definedExternally
    override fun clearTint(): ImpactImage /* this */ = definedExternally
    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): ImpactImage /* this */ = definedExternally
    override fun setTintFill(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): ImpactImage /* this */ = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): ImpactImage /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): ImpactImage /* this */ = definedExternally
    override fun setRotation(radians: Number?): ImpactImage /* this */ = definedExternally
    override fun setAngle(degrees: Number?): ImpactImage /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): ImpactImage /* this */ = definedExternally
    override fun setX(value: Number?): ImpactImage /* this */ = definedExternally
    override fun setY(value: Number?): ImpactImage /* this */ = definedExternally
    override fun setZ(value: Number?): ImpactImage /* this */ = definedExternally
    override fun setW(value: Number?): ImpactImage /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix?): org.decembrist.Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix?): org.decembrist.Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun setVisible(value: Boolean): ImpactImage /* this */ = definedExternally
    override fun setAccelerationX(x: Number): ImpactImage /* this */ = definedExternally
    override fun setAccelerationY(y: Number): ImpactImage /* this */ = definedExternally
    override fun setAcceleration(x: Number, y: Number): ImpactImage /* this */ = definedExternally
    override fun setBodySize(width: Number, height: Number?): ImpactImage /* this */ = definedExternally
    override fun setBodyScale(scaleX: Number, scaleY: Number?): ImpactImage /* this */ = definedExternally
    override fun getBodyType(): Number = definedExternally
    override fun setTypeNone(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setTypeA(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setTypeB(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setBounce(value: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setMinBounceVelocity(value: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setAvsB(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setBvsA(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setCheckAgainstNone(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setCheckAgainstA(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setCheckAgainstB(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setCollideCallback(callback: (body: Body, other: Body, axis: String) -> Unit, scope: Any): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setCollidesNever(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setLiteCollision(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setPassiveCollision(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setActiveCollision(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setFixedCollision(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setDebugBodyColor(value: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setFrictionX(x: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setFrictionY(y: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setFriction(x: Number, y: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setGravity(value: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setOffset(x: Number, y: Number, width: Number?, height: Number?): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setGameObject(gameObject: org.decembrist.Phaser.GameObjects.GameObject, sync: Boolean?): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun syncGameObject(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setVelocityX(x: Number): ImpactImage /* this */ = definedExternally
    override fun setVelocityY(y: Number): ImpactImage /* this */ = definedExternally
    override fun setVelocity(x: Number, y: Number?): ImpactImage /* this */ = definedExternally
    override fun setMaxVelocity(x: Number, y: Number?): ImpactImage /* this */ = definedExternally
    override fun setCrop(): ImpactImage /* this */ = definedExternally
    override fun setTexture(key: String): ImpactImage /* this */ = definedExternally
}
open external class ImpactPhysics(scene: Phaser.Scene) {
    open var scene: Phaser.Scene = definedExternally
    open var systems: org.decembrist.Phaser.Scenes.Systems = definedExternally
    open var config: Any = definedExternally
    open var world: World = definedExternally
    open var add: Factory = definedExternally
    open fun getConfig(): Any = definedExternally
    open fun pause(): World = definedExternally
    open fun resume(): World = definedExternally
}
open external class ImpactSprite : org.decembrist.Phaser.GameObjects.Sprite, org.decembrist.Phaser.Physics.Impact.Components.Acceleration, org.decembrist.Phaser.Physics.Impact.Components.BodyScale, org.decembrist.Phaser.Physics.Impact.Components.BodyType, org.decembrist.Phaser.Physics.Impact.Components.Bounce, org.decembrist.Phaser.Physics.Impact.Components.CheckAgainst, org.decembrist.Phaser.Physics.Impact.Components.Collides, org.decembrist.Phaser.Physics.Impact.Components.Debug, org.decembrist.Phaser.Physics.Impact.Components.Friction, org.decembrist.Phaser.Physics.Impact.Components.Gravity, org.decembrist.Phaser.Physics.Impact.Components.Offset, org.decembrist.Phaser.Physics.Impact.Components.SetGameObject, org.decembrist.Phaser.Physics.Impact.Components.Velocity, org.decembrist.Phaser.GameObjects.Components.Alpha, org.decembrist.Phaser.GameObjects.Components.BlendMode, org.decembrist.Phaser.GameObjects.Components.Depth, org.decembrist.Phaser.GameObjects.Components.Flip, org.decembrist.Phaser.GameObjects.Components.GetBounds, org.decembrist.Phaser.GameObjects.Components.Origin, org.decembrist.Phaser.GameObjects.Components.Pipeline, org.decembrist.Phaser.GameObjects.Components.ScaleMode, org.decembrist.Phaser.GameObjects.Components.ScrollFactor, org.decembrist.Phaser.GameObjects.Components.Size, org.decembrist.Phaser.GameObjects.Components.Texture, org.decembrist.Phaser.GameObjects.Components.Tint, org.decembrist.Phaser.GameObjects.Components.Transform, org.decembrist.Phaser.GameObjects.Components.Visible {
    constructor(world: World, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */)
    constructor(world: World, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */)

    override var body: Body
    open var size: Any
    open var offset: Any
    open var vel: Any
    open var accel: Any
    open var friction: Any
    open var maxVel: Any
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
    override var bounce: Number
    override var checkAgainst: Number
    override var collides: Number
    override var debugShowBody: Boolean
    override var debugShowVelocity: Boolean
    override var debugBodyColor: Number
    override var gravity: Number
    override fun clearAlpha(): ImpactSprite /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): ImpactSprite /* this */ = definedExternally
    override fun setBlendMode(value: String): ImpactSprite /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): ImpactSprite /* this */ = definedExternally
    override fun setDepth(value: Number): ImpactSprite /* this */ = definedExternally
    override fun toggleFlipX(): ImpactSprite /* this */ = definedExternally
    override fun toggleFlipY(): ImpactSprite /* this */ = definedExternally
    override fun setFlipX(value: Boolean): ImpactSprite /* this */ = definedExternally
    override fun setFlipY(value: Boolean): ImpactSprite /* this */ = definedExternally
    override fun setFlip(x: Boolean, y: Boolean): ImpactSprite /* this */ = definedExternally
    override fun resetFlip(): ImpactSprite /* this */ = definedExternally
    override fun <O : Math.Vector2> getCenter(output: O? /* null */): O = definedExternally
    override fun <O : Math.Vector2> getTopLeft(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Math.Vector2> getTopRight(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Math.Vector2> getBottomLeft(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Math.Vector2> getBottomRight(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Geom.Rectangle> getBounds(output: O? /* null */): O = definedExternally
    override fun getCenter(output: Math.Vector2?): Math.Vector2
    override fun getTopLeft(output: Math.Vector2?, includeParent: Boolean?): Math.Vector2
    override fun getTopRight(output: Math.Vector2?, includeParent: Boolean?): Math.Vector2
    override fun getBottomLeft(output: Math.Vector2?, includeParent: Boolean?): Math.Vector2
    override fun getBottomRight(output: Math.Vector2?, includeParent: Boolean?): Math.Vector2
    override fun getBounds(output: Geom.Rectangle?): Geom.Rectangle
    override fun setMask(mask: Display.Masks.BitmapMask): ImpactSprite /* this */ = definedExternally
    override fun setMask(mask: Display.Masks.GeometryMask): ImpactSprite /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): ImpactSprite /* this */ = definedExternally
    override fun createBitmapMask(renderable: org.decembrist.Phaser.GameObjects.GameObject?): Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: org.decembrist.Phaser.GameObjects.Graphics?): Display.Masks.GeometryMask = definedExternally
    override fun setOrigin(x: Number?, y: Number?): ImpactSprite /* this */ = definedExternally
    override fun setOriginFromFrame(): ImpactSprite /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): ImpactSprite /* this */ = definedExternally
    override fun updateDisplayOrigin(): ImpactSprite /* this */ = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): ImpactSprite /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): ImpactSprite /* this */ = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): ImpactSprite /* this */ = definedExternally
    override fun setSizeToFrame(frame: org.decembrist.Phaser.Textures.Frame): ImpactSprite /* this */ = definedExternally
    override fun setSize(width: Number, height: Number): ImpactSprite /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): ImpactSprite /* this */ = definedExternally
    override fun setCrop(x: Number?, y: Number?, width: Number?, height: Number?): ImpactSprite /* this */ = definedExternally
    override fun setCrop(x: Geom.Rectangle?, y: Number?, width: Number?, height: Number?): ImpactSprite /* this */ = definedExternally
    override fun setTexture(key: String, frame: String?): ImpactSprite /* this */ = definedExternally
    override fun setTexture(key: String, frame: Number?): ImpactSprite /* this */ = definedExternally
    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): ImpactSprite /* this */ = definedExternally
    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): ImpactSprite /* this */ = definedExternally
    override fun clearTint(): ImpactSprite /* this */ = definedExternally
    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): ImpactSprite /* this */ = definedExternally
    override fun setTintFill(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): ImpactSprite /* this */ = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): ImpactSprite /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): ImpactSprite /* this */ = definedExternally
    override fun setRotation(radians: Number?): ImpactSprite /* this */ = definedExternally
    override fun setAngle(degrees: Number?): ImpactSprite /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): ImpactSprite /* this */ = definedExternally
    override fun setX(value: Number?): ImpactSprite /* this */ = definedExternally
    override fun setY(value: Number?): ImpactSprite /* this */ = definedExternally
    override fun setZ(value: Number?): ImpactSprite /* this */ = definedExternally
    override fun setW(value: Number?): ImpactSprite /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix?): org.decembrist.Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix?): org.decembrist.Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun setVisible(value: Boolean): ImpactSprite /* this */ = definedExternally
    override fun setAccelerationX(x: Number): ImpactSprite /* this */ = definedExternally
    override fun setAccelerationY(y: Number): ImpactSprite /* this */ = definedExternally
    override fun setAcceleration(x: Number, y: Number): ImpactSprite /* this */ = definedExternally
    override fun setBodySize(width: Number, height: Number?): ImpactSprite /* this */ = definedExternally
    override fun setBodyScale(scaleX: Number, scaleY: Number?): ImpactSprite /* this */ = definedExternally
    override fun getBodyType(): Number = definedExternally
    override fun setTypeNone(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setTypeA(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setTypeB(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setBounce(value: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setMinBounceVelocity(value: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setAvsB(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setBvsA(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setCheckAgainstNone(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setCheckAgainstA(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setCheckAgainstB(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setCollideCallback(callback: (body: Body, other: Body, axis: String) -> Unit, scope: Any): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setCollidesNever(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setLiteCollision(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setPassiveCollision(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setActiveCollision(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setFixedCollision(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setDebugBodyColor(value: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setFrictionX(x: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setFrictionY(y: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setFriction(x: Number, y: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setGravity(value: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setOffset(x: Number, y: Number, width: Number?, height: Number?): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setGameObject(gameObject: org.decembrist.Phaser.GameObjects.GameObject, sync: Boolean?): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun syncGameObject(): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    override fun setVelocityX(x: Number): ImpactSprite /* this */ = definedExternally
    override fun setVelocityY(y: Number): ImpactSprite /* this */ = definedExternally
    override fun setVelocity(x: Number, y: Number?): ImpactSprite /* this */ = definedExternally
    override fun setMaxVelocity(x: Number, y: Number?): ImpactSprite /* this */ = definedExternally
    override fun setCrop(): ImpactSprite /* this */ = definedExternally
    override fun setTexture(key: String): ImpactSprite /* this */ = definedExternally
}
external fun SeperateX(world: World, left: Body, right: Body, weak: Body? = definedExternally /* null */): Unit = definedExternally
external fun SeperateY(world: World, top: Body, bottom: Body, weak: Body? = definedExternally /* null */): Unit = definedExternally
external fun Solver(world: World, bodyA: Body, bodyB: Body): Unit = definedExternally
external enum class TYPE {
    NONE,
    A,
    B,
    BOTH
}
external fun UpdateMotion(body: Body, res: Any): Unit = definedExternally
external interface WorldConfig {
    var gravity: Number? get() = definedExternally; set(value) = definedExternally
    var cellSize: Number? get() = definedExternally; set(value) = definedExternally
    var timeScale: Number? get() = definedExternally; set(value) = definedExternally
    var maxStep: Number? get() = definedExternally; set(value) = definedExternally
    var debug: Boolean? get() = definedExternally; set(value) = definedExternally
    var maxVelocity: Number? get() = definedExternally; set(value) = definedExternally
    var debugShowBody: Boolean? get() = definedExternally; set(value) = definedExternally
    var debugShowVelocity: Boolean? get() = definedExternally; set(value) = definedExternally
    var debugBodyColor: Number? get() = definedExternally; set(value) = definedExternally
    var debugVelocityColor: Number? get() = definedExternally; set(value) = definedExternally
    var maxVelocityX: Number? get() = definedExternally; set(value) = definedExternally
    var maxVelocityY: Number? get() = definedExternally; set(value) = definedExternally
    var minBounceVelocity: Number? get() = definedExternally; set(value) = definedExternally
    var gravityFactor: Number? get() = definedExternally; set(value) = definedExternally
    var bounciness: Number? get() = definedExternally; set(value) = definedExternally
    var setBounds: dynamic /* Boolean | Any? */ get() = definedExternally; set(value) = definedExternally
}
external interface WorldDefaults {
    var debugShowBody: Boolean
    var debugShowVelocity: Boolean
    var bodyDebugColor: Number
    var velocityDebugColor: Number
    var maxVelocityX: Number
    var maxVelocityY: Number
    var minBounceVelocity: Number
    var gravityFactor: Number
    var bounciness: Number
}
external interface WorldWalls {
    var left: Body
    var right: Body
    var top: Body
    var bottom: Body
}
open external class World(scene: Phaser.Scene, config: org.decembrist.Phaser.Physics.Impact.WorldConfig) : org.decembrist.Phaser.Events.EventEmitter {
    open var scene: Phaser.Scene = definedExternally
    open var bodies: org.decembrist.Phaser.Structs.Set<Body> = definedExternally
    open var gravity: Number = definedExternally
    open var cellSize: Number = definedExternally
    open var collisionMap: CollisionMap = definedExternally
    open var timeScale: Number = definedExternally
    open var maxStep: Number = definedExternally
    open var enabled: Boolean = definedExternally
    open var drawDebug: Boolean = definedExternally
    open var debugGraphic: org.decembrist.Phaser.GameObjects.Graphics = definedExternally
    open var defaults: org.decembrist.Phaser.Physics.Impact.WorldDefaults = definedExternally
    open var walls: org.decembrist.Phaser.Physics.Impact.WorldWalls = definedExternally
    open var delta: Number = definedExternally
    open fun setCollisionMap(key: String, tileSize: Number): CollisionMap = definedExternally
    open fun setCollisionMap(key: Array<Array<Number>>, tileSize: Number): CollisionMap = definedExternally
    open fun setCollisionMapFromTilemapLayer(tilemapLayer: org.decembrist.Phaser.Tilemaps.DynamicTilemapLayer, options: Any? = definedExternally /* null */): CollisionMap = definedExternally
    open fun setCollisionMapFromTilemapLayer(tilemapLayer: org.decembrist.Phaser.Tilemaps.StaticTilemapLayer, options: Any? = definedExternally /* null */): CollisionMap = definedExternally
    open fun setBounds(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, thickness: Number? = definedExternally /* null */, left: Boolean? = definedExternally /* null */, right: Boolean? = definedExternally /* null */, top: Boolean? = definedExternally /* null */, bottom: Boolean? = definedExternally /* null */): World = definedExternally
    open fun updateWall(add: Boolean, position: String, x: Number, y: Number, width: Number, height: Number): Unit = definedExternally
    open fun createDebugGraphic(): org.decembrist.Phaser.GameObjects.Graphics = definedExternally
    open fun getNextID(): Number = definedExternally
    open fun create(x: Number, y: Number, sizeX: Number, sizeY: Number): Body = definedExternally
    open fun remove(`object`: Body): Unit = definedExternally
    open fun pause(): World = definedExternally
    open fun resume(): World = definedExternally
    open fun update(time: Number, delta: Number): Unit = definedExternally
    open fun checkHash(body: Body, hash: Any, size: Number): Unit = definedExternally
    open fun checkBodies(bodyA: Body, bodyB: Body): Unit = definedExternally
    open fun setCollidesNever(bodies: Array<Body>): World = definedExternally
    open fun setLite(bodies: Array<Body>): World = definedExternally
    open fun setPassive(bodies: Array<Body>): World = definedExternally
    open fun setActive(bodies: Array<Body>): World = definedExternally
    open fun setFixed(bodies: Array<Body>): World = definedExternally
    open fun setTypeNone(bodies: Array<Body>): World = definedExternally
    open fun setTypeA(bodies: Array<Body>): World = definedExternally
    open fun setTypeB(bodies: Array<Body>): World = definedExternally
    open fun setAvsB(bodies: Array<Body>): World = definedExternally
    open fun setBvsA(bodies: Array<Body>): World = definedExternally
    open fun setCheckAgainstNone(bodies: Array<Body>): World = definedExternally
    open fun setCheckAgainstA(bodies: Array<Body>): World = definedExternally
    open fun setCheckAgainstB(bodies: Array<Body>): World = definedExternally
    override fun shutdown(): Unit = definedExternally
    override fun destroy(): Unit = definedExternally
}
