@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Physics.Matter")]
package Phaser.Physics.Matter

import Phaser.Math.Vector2
import Phaser.Physics.Matter.Components.Transform

open external class Factory(world: World) {
    open var world: World = definedExternally
    open var scene: Phaser.Scene = definedExternally
    open var sys: Phaser.Scenes.Systems = definedExternally
    open fun rectangle(x: Number, y: Number, width: Number, height: Number, options: Any): MatterJS.Body = definedExternally
    open fun trapezoid(x: Number, y: Number, width: Number, height: Number, slope: Number, options: Any): MatterJS.Body = definedExternally
    open fun circle(x: Number, y: Number, radius: Number, options: Any, maxSides: Number): MatterJS.Body = definedExternally
    open fun polygon(x: Number, y: Number, sides: Number, radius: Number, options: Any): MatterJS.Body = definedExternally
    open fun fromVertices(x: Number, y: Number, vertexSets: Array<Any>, options: Any, flagInternal: Boolean, removeCollinear: Boolean, minimumArea: Number): MatterJS.Body = definedExternally
    open fun imageStack(key: String, frame: String, x: Number, y: Number, columns: Number, rows: Number, columnGap: Number? = definedExternally /* null */, rowGap: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */): MatterJS.Composite = definedExternally
    open fun imageStack(key: String, frame: Number, x: Number, y: Number, columns: Number, rows: Number, columnGap: Number? = definedExternally /* null */, rowGap: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */): MatterJS.Composite = definedExternally
    open fun stack(x: Number, y: Number, columns: Number, rows: Number, columnGap: Number, rowGap: Number, callback: Function<*>): MatterJS.Composite = definedExternally
    open fun pyramid(x: Number, y: Number, columns: Number, rows: Number, columnGap: Number, rowGap: Number, callback: Function<*>): MatterJS.Composite = definedExternally
    open fun chain(composite: MatterJS.Composite, xOffsetA: Number, yOffsetA: Number, xOffsetB: Number, yOffsetB: Number, options: Any): MatterJS.Composite = definedExternally
    open fun mesh(composite: MatterJS.Composite, columns: Number, rows: Number, crossBrace: Boolean, options: Any): MatterJS.Composite = definedExternally
    open fun newtonsCradle(x: Number, y: Number, number: Number, size: Number, length: Number): MatterJS.Composite = definedExternally
    open fun car(x: Number, y: Number, width: Number, height: Number, wheelSize: Number): MatterJS.Composite = definedExternally
    open fun softBody(x: Number, y: Number, columns: Number, rows: Number, columnGap: Number, rowGap: Number, crossBrace: Boolean, particleRadius: Number, particleOptions: Any, constraintOptions: Any): MatterJS.Composite = definedExternally
    open fun joint(bodyA: MatterJS.Body, bodyB: MatterJS.Body, length: Number, stiffness: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */): MatterJS.Constraint = definedExternally
    open fun spring(bodyA: MatterJS.Body, bodyB: MatterJS.Body, length: Number, stiffness: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */): MatterJS.Constraint = definedExternally
    open fun constraint(bodyA: MatterJS.Body, bodyB: MatterJS.Body, length: Number, stiffness: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */): MatterJS.Constraint = definedExternally
    open fun worldConstraint(bodyB: MatterJS.Body, length: Number, stiffness: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */): MatterJS.Constraint = definedExternally
    open fun mouseSpring(options: Any): MatterJS.Constraint = definedExternally
    open fun pointerConstraint(options: Any): MatterJS.Constraint = definedExternally
    open fun image(x: Number, y: Number, key: String, frame: String? = definedExternally /* null */, options: Any? = definedExternally /* null */): Image = definedExternally
    open fun image(x: Number, y: Number, key: String, frame: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */): Image = definedExternally
    open fun tileBody(tile: Phaser.Tilemaps.Tile, options: Any): TileBody = definedExternally
    open fun sprite(x: Number, y: Number, key: String, frame: String? = definedExternally /* null */, options: Any? = definedExternally /* null */): Sprite = definedExternally
    open fun sprite(x: Number, y: Number, key: String, frame: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */): Sprite = definedExternally
    open fun gameObject(gameObject: Phaser.GameObjects.GameObject, options: Any): Phaser.GameObjects.GameObject = definedExternally
    open fun destroy(): Unit = definedExternally
    open fun image(x: Number, y: Number, key: String): Image = definedExternally
    open fun sprite(x: Number, y: Number, key: String): Sprite = definedExternally
}
external fun MatterGameObject(world: World, gameObject: Phaser.GameObjects.GameObject, options: Any): Phaser.GameObjects.GameObject = definedExternally
open external class Image : Phaser.GameObjects.Image, Phaser.Physics.Matter.Components.Bounce, Phaser.Physics.Matter.Components.Collision, Phaser.Physics.Matter.Components.Force, Phaser.Physics.Matter.Components.Friction, Phaser.Physics.Matter.Components.Gravity, Phaser.Physics.Matter.Components.Mass, Phaser.Physics.Matter.Components.Sensor, Phaser.Physics.Matter.Components.SetBody, Phaser.Physics.Matter.Components.Sleep, Phaser.Physics.Matter.Components.Static, Phaser.Physics.Matter.Components.Transform, Phaser.Physics.Matter.Components.Velocity, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Size, Phaser.GameObjects.Components.Texture, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
    constructor(world: World, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */, options: Any? = definedExternally /* null */)
    constructor(world: World, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */)

    open var world: World
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
    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline
    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline
    override var scaleMode: Phaser.ScaleModes
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Phaser.Textures.Frame
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
    override var centerOfMass: Any
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
    override fun <O : Phaser.Math.Vector2> getCenter(output: O? /* null */): O = definedExternally
    override fun <O : Phaser.Math.Vector2> getTopLeft(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Phaser.Math.Vector2> getTopRight(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Phaser.Math.Vector2> getBottomLeft(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Phaser.Math.Vector2> getBottomRight(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O? /* null */): O = definedExternally
    override fun getCenter(output: Vector2?): Vector2
    override fun getTopLeft(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getTopRight(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getBottomLeft(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getBottomRight(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getBounds(output: Phaser.Geom.Rectangle?): Phaser.Geom.Rectangle
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): Image /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): Image /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Image /* this */ = definedExternally
    override fun createBitmapMask(renderable: Phaser.GameObjects.GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Phaser.GameObjects.Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
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
    override fun setSizeToFrame(frame: Phaser.Textures.Frame): Image /* this */ = definedExternally
    override fun setSize(width: Number, height: Number): Image /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Image /* this */ = definedExternally
    override fun setCrop(x: Number?, y: Number?, width: Number?, height: Number?): Image /* this */ = definedExternally
    override fun setCrop(x: Phaser.Geom.Rectangle?, y: Number?, width: Number?, height: Number?): Image /* this */ = definedExternally
    override fun setTexture(key: String, frame: String?): Image /* this */ = definedExternally
    override fun setTexture(key: String, frame: Number?): Image /* this */ = definedExternally
    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): Image /* this */ = definedExternally
    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): Image /* this */ = definedExternally
    override fun clearTint(): Image /* this */ = definedExternally
    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Image /* this */ = definedExternally
    override fun setTintFill(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Image /* this */ = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Image /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Image /* this */ = definedExternally
    override fun setPosition(x: Number?, y: Number?): Transform
    override fun setScale(x: Number?, y: Number?, point: Vector2?): Transform
    override fun setRotation(radians: Number?): Image /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Image /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Image /* this */ = definedExternally
    override fun setX(value: Number?): Image /* this */ = definedExternally
    override fun setY(value: Number?): Image /* this */ = definedExternally
    override fun setZ(value: Number?): Image /* this */ = definedExternally
    override fun setW(value: Number?): Image /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun setVisible(value: Boolean): Image /* this */ = definedExternally
    override fun setBounce(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setCollisionCategory(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setCollisionGroup(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setCollidesWith(categories: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setCollidesWith(categories: Array<Number>): Phaser.GameObjects.GameObject = definedExternally
    override fun applyForce(force: Phaser.Math.Vector2): Phaser.GameObjects.GameObject = definedExternally
    override fun applyForceFrom(position: Phaser.Math.Vector2, force: Phaser.Math.Vector2): Phaser.GameObjects.GameObject = definedExternally
    override fun thrust(speed: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun thrustLeft(speed: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun thrustRight(speed: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun thrustBack(speed: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setFriction(value: Number, air: Number?, fstatic: Number?): Phaser.GameObjects.GameObject = definedExternally
    override fun setFrictionAir(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setFrictionStatic(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setIgnoreGravity(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
    override fun setMass(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setDensity(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setSensor(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
    override fun isSensor(): Boolean = definedExternally
    override fun setRectangle(width: Number, height: Number, options: Any): Phaser.GameObjects.GameObject = definedExternally
    override fun setCircle(radius: Number, options: Any): Phaser.GameObjects.GameObject = definedExternally
    override fun setPolygon(radius: Number, sides: Number, options: Any): Phaser.GameObjects.GameObject = definedExternally
    override fun setTrapezoid(width: Number, height: Number, slope: Number, options: Any): Phaser.GameObjects.GameObject = definedExternally
    override fun setExistingBody(body: MatterJS.Body, addToWorld: Boolean?): Phaser.GameObjects.GameObject = definedExternally
    override fun setBody(config: Any, options: Any): Phaser.GameObjects.GameObject = definedExternally
    override fun setSleepThreshold(value: Number?): Phaser.GameObjects.GameObject = definedExternally
    override fun setSleepEvents(start: Boolean, end: Boolean): Phaser.GameObjects.GameObject = definedExternally
    override fun setSleepStartEvent(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
    override fun setSleepEndEvent(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
    override fun setStatic(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
    override fun isStatic(): Boolean = definedExternally
    override fun setFixedRotation(): Image /* this */ = definedExternally
    override fun setAngularVelocity(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setVelocityX(x: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setVelocityY(y: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setVelocity(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
    override fun setCrop(): Image /* this */ = definedExternally
    override fun setTexture(key: String): Image /* this */ = definedExternally
}
open external class MatterPhysics(scene: Phaser.Scene) {
    open var scene: Phaser.Scene = definedExternally
    open var systems: Phaser.Scenes.Systems = definedExternally
    open var config: Any = definedExternally
    open var world: World = definedExternally
    open var add: Factory = definedExternally
    open var verts: MatterJS.Vertices = definedExternally
    open fun getConfig(): Any = definedExternally
    open fun enableAttractorPlugin(): MatterPhysics = definedExternally
    open fun enableWrapPlugin(): MatterPhysics = definedExternally
    open fun pause(): World = definedExternally
    open fun resume(): World = definedExternally
    open fun set60Hz(): MatterPhysics = definedExternally
    open fun set30Hz(): MatterPhysics = definedExternally
    open fun step(delta: Number? = definedExternally /* null */, correction: Number? = definedExternally /* null */): Unit = definedExternally
}
open external class Sprite : Phaser.GameObjects.Sprite, Phaser.Physics.Matter.Components.Bounce, Phaser.Physics.Matter.Components.Collision, Phaser.Physics.Matter.Components.Force, Phaser.Physics.Matter.Components.Friction, Phaser.Physics.Matter.Components.Gravity, Phaser.Physics.Matter.Components.Mass, Phaser.Physics.Matter.Components.Sensor, Phaser.Physics.Matter.Components.SetBody, Phaser.Physics.Matter.Components.Sleep, Phaser.Physics.Matter.Components.Static, Phaser.Physics.Matter.Components.Transform, Phaser.Physics.Matter.Components.Velocity, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Size, Phaser.GameObjects.Components.Texture, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
    constructor(world: World, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */, options: Any? = definedExternally /* null */)
    constructor(world: World, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */, options: Any? = definedExternally /* null */)

    open var world: World
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
    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline
    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline
    override var scaleMode: Phaser.ScaleModes
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Phaser.Textures.Frame
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
    override var centerOfMass: Any
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
    override fun <O : Phaser.Math.Vector2> getCenter(output: O? /* null */): O = definedExternally
    override fun <O : Phaser.Math.Vector2> getTopLeft(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Phaser.Math.Vector2> getTopRight(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Phaser.Math.Vector2> getBottomLeft(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Phaser.Math.Vector2> getBottomRight(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Phaser.Geom.Rectangle> getBounds(output: O? /* null */): O = definedExternally
    override fun getCenter(output: Vector2?): Vector2
    override fun getTopLeft(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getTopRight(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getBottomLeft(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getBottomRight(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getBounds(output: Phaser.Geom.Rectangle?): Phaser.Geom.Rectangle
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): Sprite /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): Sprite /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Sprite /* this */ = definedExternally
    override fun createBitmapMask(renderable: Phaser.GameObjects.GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Phaser.GameObjects.Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
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
    override fun setSizeToFrame(frame: Phaser.Textures.Frame): Sprite /* this */ = definedExternally
    override fun setSize(width: Number, height: Number): Sprite /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Sprite /* this */ = definedExternally
    override fun setCrop(x: Number?, y: Number?, width: Number?, height: Number?): Sprite /* this */ = definedExternally
    override fun setCrop(x: Phaser.Geom.Rectangle?, y: Number?, width: Number?, height: Number?): Sprite /* this */ = definedExternally
    override fun setTexture(key: String, frame: String?): Sprite /* this */ = definedExternally
    override fun setTexture(key: String, frame: Number?): Sprite /* this */ = definedExternally
    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): Sprite /* this */ = definedExternally
    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): Sprite /* this */ = definedExternally
    override fun clearTint(): Sprite /* this */ = definedExternally
    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Sprite /* this */ = definedExternally
    override fun setTintFill(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Sprite /* this */ = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Sprite /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Sprite /* this */ = definedExternally
    override fun setPosition(x: Number?, y: Number?): Transform
    override fun setScale(x: Number?, y: Number?, point: Vector2?): Transform
    override fun setRotation(radians: Number?): Sprite /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Sprite /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Sprite /* this */ = definedExternally
    override fun setX(value: Number?): Sprite /* this */ = definedExternally
    override fun setY(value: Number?): Sprite /* this */ = definedExternally
    override fun setZ(value: Number?): Sprite /* this */ = definedExternally
    override fun setW(value: Number?): Sprite /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun setVisible(value: Boolean): Sprite /* this */ = definedExternally
    override fun setBounce(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setCollisionCategory(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setCollisionGroup(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setCollidesWith(categories: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setCollidesWith(categories: Array<Number>): Phaser.GameObjects.GameObject = definedExternally
    override fun applyForce(force: Phaser.Math.Vector2): Phaser.GameObjects.GameObject = definedExternally
    override fun applyForceFrom(position: Phaser.Math.Vector2, force: Phaser.Math.Vector2): Phaser.GameObjects.GameObject = definedExternally
    override fun thrust(speed: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun thrustLeft(speed: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun thrustRight(speed: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun thrustBack(speed: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setFriction(value: Number, air: Number?, fstatic: Number?): Phaser.GameObjects.GameObject = definedExternally
    override fun setFrictionAir(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setFrictionStatic(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setIgnoreGravity(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
    override fun setMass(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setDensity(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setSensor(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
    override fun isSensor(): Boolean = definedExternally
    override fun setRectangle(width: Number, height: Number, options: Any): Phaser.GameObjects.GameObject = definedExternally
    override fun setCircle(radius: Number, options: Any): Phaser.GameObjects.GameObject = definedExternally
    override fun setPolygon(radius: Number, sides: Number, options: Any): Phaser.GameObjects.GameObject = definedExternally
    override fun setTrapezoid(width: Number, height: Number, slope: Number, options: Any): Phaser.GameObjects.GameObject = definedExternally
    override fun setExistingBody(body: MatterJS.Body, addToWorld: Boolean?): Phaser.GameObjects.GameObject = definedExternally
    override fun setBody(config: Any, options: Any): Phaser.GameObjects.GameObject = definedExternally
    override fun setSleepThreshold(value: Number?): Phaser.GameObjects.GameObject = definedExternally
    override fun setSleepEvents(start: Boolean, end: Boolean): Phaser.GameObjects.GameObject = definedExternally
    override fun setSleepStartEvent(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
    override fun setSleepEndEvent(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
    override fun setStatic(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
    override fun isStatic(): Boolean = definedExternally
    override fun setFixedRotation(): Sprite /* this */ = definedExternally
    override fun setAngularVelocity(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setVelocityX(x: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setVelocityY(y: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setVelocity(x: Number, y: Number?): Phaser.GameObjects.GameObject = definedExternally
    override fun setCrop(): Sprite /* this */ = definedExternally
    override fun setTexture(key: String): Sprite /* this */ = definedExternally
}
open external class TileBody(world: World, tile: Phaser.Tilemaps.Tile, options: Any? = definedExternally /* null */) : Phaser.Physics.Matter.Components.Bounce, Phaser.Physics.Matter.Components.Collision, Phaser.Physics.Matter.Components.Friction, Phaser.Physics.Matter.Components.Gravity, Phaser.Physics.Matter.Components.Mass, Phaser.Physics.Matter.Components.Sensor, Phaser.Physics.Matter.Components.Sleep, Phaser.Physics.Matter.Components.Static {
    open var tile: Phaser.Tilemaps.Tile = definedExternally
    open var world: World = definedExternally
    open fun setFromTileRectangle(options: Any? = definedExternally /* null */): TileBody = definedExternally
    open fun setFromTileCollision(options: Any? = definedExternally /* null */): TileBody = definedExternally
    open fun setBody(body: MatterJS.Body, addToWorld: Boolean? = definedExternally /* null */): TileBody = definedExternally
    open fun removeBody(): TileBody = definedExternally
    open fun destroy(): TileBody = definedExternally
    override fun setBounce(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setCollisionCategory(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setCollisionGroup(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setCollidesWith(categories: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setCollidesWith(categories: Array<Number>): Phaser.GameObjects.GameObject = definedExternally
    override fun setFriction(value: Number, air: Number?, fstatic: Number?): Phaser.GameObjects.GameObject = definedExternally
    override fun setFrictionAir(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setFrictionStatic(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setIgnoreGravity(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
    override fun setMass(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override fun setDensity(value: Number): Phaser.GameObjects.GameObject = definedExternally
    override var centerOfMass: Any = definedExternally
    override fun setSensor(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
    override fun isSensor(): Boolean = definedExternally
    override fun setSleepThreshold(value: Number?): Phaser.GameObjects.GameObject = definedExternally
    override fun setSleepEvents(start: Boolean, end: Boolean): Phaser.GameObjects.GameObject = definedExternally
    override fun setSleepStartEvent(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
    override fun setSleepEndEvent(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
    override fun setStatic(value: Boolean): Phaser.GameObjects.GameObject = definedExternally
    override fun isStatic(): Boolean = definedExternally
}
open external class PointerConstraint(scene: Phaser.Scene, world: World, options: Any) {
    open var scene: Phaser.Scene = definedExternally
    open var world: World = definedExternally
    open var camera: Phaser.Cameras.Scene2D.Camera = definedExternally
    open var pointer: Phaser.Input.Pointer = definedExternally
    open var active: Boolean = definedExternally
    open var position: Phaser.Math.Vector2 = definedExternally
    open var constraint: Any = definedExternally
    open fun onDown(pointer: Phaser.Input.Pointer): Unit = definedExternally
    open fun onUp(): Unit = definedExternally
    open fun getBodyPart(body: MatterJS.Body, position: Phaser.Math.Vector2): Boolean = definedExternally
    open fun update(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
open external class World(scene: Phaser.Scene, config: Any) : Phaser.Events.EventEmitter {
    open var scene: Phaser.Scene = definedExternally
    open var engine: MatterJS.Engine = definedExternally
    open var localWorld: MatterJS.World = definedExternally
    open var walls: Any = definedExternally
    open var enabled: Boolean = definedExternally
    open var correction: Number = definedExternally
    open var getDelta: Function<*> = definedExternally
    open var autoUpdate: Boolean = definedExternally
    open var drawDebug: Boolean = definedExternally
    open var debugGraphic: Phaser.GameObjects.Graphics = definedExternally
    open var defaults: Any = definedExternally
    open fun setEventsProxy(): Unit = definedExternally
    open fun setBounds(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, thickness: Number? = definedExternally /* null */, left: Boolean? = definedExternally /* null */, right: Boolean? = definedExternally /* null */, top: Boolean? = definedExternally /* null */, bottom: Boolean? = definedExternally /* null */): World = definedExternally
    open fun updateWall(add: Boolean, position: String, x: Number, y: Number, width: Number, height: Number): Unit = definedExternally
    open fun createDebugGraphic(): Phaser.GameObjects.Graphics = definedExternally
    open fun disableGravity(): World = definedExternally
    open fun setGravity(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, scale: Number? = definedExternally /* null */): World = definedExternally
    open fun create(x: Number, y: Number, width: Number, height: Number, options: Any): MatterJS.Body = definedExternally
    open fun add(`object`: Any?): World = definedExternally
    open fun add(`object`: Array<Any?>): World = definedExternally
    open fun remove(`object`: Any, deep: Boolean): World = definedExternally
    open fun removeConstraint(constraint: MatterJS.Constraint, deep: Boolean): World = definedExternally
    open fun convertTilemapLayer(tilemapLayer: Phaser.Tilemaps.DynamicTilemapLayer, options: Any? = definedExternally /* null */): World = definedExternally
    open fun convertTilemapLayer(tilemapLayer: Phaser.Tilemaps.StaticTilemapLayer, options: Any? = definedExternally /* null */): World = definedExternally
    open fun convertTiles(tiles: Array<Phaser.Tilemaps.Tile>, options: Any? = definedExternally /* null */): World = definedExternally
    open fun nextGroup(isNonColliding: Boolean): Number = definedExternally
    open fun nextCategory(): Number = definedExternally
    open fun pause(): World = definedExternally
    open fun resume(): World = definedExternally
    open fun update(time: Number, delta: Number): Unit = definedExternally
    open fun step(delta: Number? = definedExternally /* null */, correction: Number? = definedExternally /* null */): Unit = definedExternally
    open fun update60Hz(): Number = definedExternally
    open fun update30Hz(): Number = definedExternally
    open fun fromPath(path: String, points: Array<Any>): Array<Any> = definedExternally
    override fun shutdown(): Unit = definedExternally
    override fun destroy(): Unit = definedExternally
}
