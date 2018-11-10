@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("GameObjects.Particles")]
package Phaser.GameObjects.Particles

import GravityWellConfig
import ParticleEmitterBounds
import ParticleEmitterBoundsAlt
import ParticleEmitterConfig
import ParticleEmitterDeathZoneConfig
import ParticleEmitterEdgeZoneConfig
import ParticleEmitterFrameConfig
import ParticleEmitterRandomZoneConfig

open external class EmitterOp(config: ParticleEmitterConfig, key: String, defaultValue: Number, emitOnly: Boolean? = definedExternally /* null */) {
    open var propertyKey: String = definedExternally
    open var propertyValue: Number = definedExternally
    open var defaultValue: Number = definedExternally
    open var steps: Number = definedExternally
    open var counter: Number = definedExternally
    open var start: Number = definedExternally
    open var end: Number = definedExternally
    open var ease: Function<*> = definedExternally
    open var emitOnly: Boolean = definedExternally
    open var onEmit: (particle: Particle, key: String, value: Number) -> Unit = definedExternally
    open var onUpdate: (particle: Particle, key: String, t: Number, value: Number) -> Unit = definedExternally
    open fun loadConfig(config: ParticleEmitterConfig? = definedExternally /* null */, newKey: String? = definedExternally /* null */): Unit = definedExternally
    open fun toJSON(): Any = definedExternally
    open fun onChange(value: Number): EmitterOp = definedExternally
    open fun setMethods(): EmitterOp = definedExternally
    open fun has(`object`: Any, key: String): Boolean = definedExternally
    open fun hasBoth(`object`: Any, key1: String, key2: String): Boolean = definedExternally
    open fun hasEither(`object`: Any, key1: String, key2: String): Boolean = definedExternally
    open fun defaultEmit(particle: Particle, key: String, value: Number? = definedExternally /* null */): Number = definedExternally
    open fun defaultUpdate(particle: Particle, key: String, t: Number, value: Number): Number = definedExternally
    open fun staticValueEmit(): Number = definedExternally
    open fun staticValueUpdate(): Number = definedExternally
    open fun randomStaticValueEmit(): Number = definedExternally
    open fun randomRangedValueEmit(particle: Particle, key: String): Number = definedExternally
    open fun steppedEmit(): Number = definedExternally
    open fun easedValueEmit(particle: Particle, key: String): Number = definedExternally
    open fun easeValueUpdate(particle: Particle, key: String, t: Number): Number = definedExternally
}
open external class GravityWell {
    constructor(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, power: Number? = definedExternally /* null */, epsilon: Number? = definedExternally /* null */, gravity: Number? = definedExternally /* null */)
    constructor(x: GravityWellConfig? = definedExternally /* null */, y: Number? = definedExternally /* null */, power: Number? = definedExternally /* null */, epsilon: Number? = definedExternally /* null */, gravity: Number? = definedExternally /* null */)

    open var x: Number
    open var y: Number
    open var active: Boolean
    open var power: Number
    open var epsilon: Number
    open fun update(particle: Particle, delta: Number, step: Number): Unit = definedExternally
}
open external class Particle(emitter: ParticleEmitter) {
    open var emitter: ParticleEmitter = definedExternally
    open var frame: Phaser.Textures.Frame = definedExternally
    open var index: Number = definedExternally
    open var x: Number = definedExternally
    open var y: Number = definedExternally
    open var velocityX: Number = definedExternally
    open var velocityY: Number = definedExternally
    open var accelerationX: Number = definedExternally
    open var accelerationY: Number = definedExternally
    open var maxVelocityX: Number = definedExternally
    open var maxVelocityY: Number = definedExternally
    open var bounce: Number = definedExternally
    open var scaleX: Number = definedExternally
    open var scaleY: Number = definedExternally
    open var alpha: Number = definedExternally
    open var angle: Number = definedExternally
    open var rotation: Number = definedExternally
    open var tint: Number = definedExternally
    open var life: Number = definedExternally
    open var lifeCurrent: Number = definedExternally
    open var delayCurrent: Number = definedExternally
    open var lifeT: Number = definedExternally
    open var data: Any = definedExternally
    open fun isAlive(): Boolean = definedExternally
    open fun fire(x: Number, y: Number): Unit = definedExternally
    open fun computeVelocity(emitter: ParticleEmitter, delta: Number, step: Number, processors: Array<Any>): Unit = definedExternally
    open fun checkBounds(emitter: ParticleEmitter): Unit = definedExternally
    open fun update(delta: Number, step: Number, processors: Array<Any>): Boolean = definedExternally
}
open external class ParticleEmitter(manager: ParticleEmitterManager, config: ParticleEmitterConfig) : Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Mask, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Visible {
    open var manager: ParticleEmitterManager = definedExternally
    open var texture: Phaser.Textures.Texture = definedExternally
    open var frames: Array<Phaser.Textures.Frame> = definedExternally
    open var defaultFrame: Phaser.Textures.Frame = definedExternally
    open var configFastMap: Any = definedExternally
    open var configOpMap: Any = definedExternally
    open var name: String = definedExternally
    open var particleClass: Particle = definedExternally
    open var x: EmitterOp = definedExternally
    open var y: EmitterOp = definedExternally
    open var radial: Boolean = definedExternally
    open var gravityX: Number = definedExternally
    open var gravityY: Number = definedExternally
    open var acceleration: Boolean = definedExternally
    open var accelerationX: EmitterOp = definedExternally
    open var accelerationY: EmitterOp = definedExternally
    open var maxVelocityX: EmitterOp = definedExternally
    open var maxVelocityY: EmitterOp = definedExternally
    open var speedX: EmitterOp = definedExternally
    open var speedY: EmitterOp = definedExternally
    open var moveTo: Boolean = definedExternally
    open var moveToX: EmitterOp = definedExternally
    open var moveToY: EmitterOp = definedExternally
    open var bounce: EmitterOp = definedExternally
    open var scaleX: EmitterOp = definedExternally
    open var scaleY: EmitterOp = definedExternally
    open var tint: EmitterOp = definedExternally
    open var alpha: EmitterOp = definedExternally
    open var lifespan: EmitterOp = definedExternally
    open var angle: EmitterOp = definedExternally
    open var rotate: EmitterOp = definedExternally
    open var emitCallback: (particle: Particle, emitter: ParticleEmitter) -> Unit = definedExternally
    open var emitCallbackScope: Any = definedExternally
    open var deathCallback: (particle: Particle) -> Unit = definedExternally
    open var deathCallbackScope: Any = definedExternally
    open var maxParticles: Number = definedExternally
    open var quantity: EmitterOp = definedExternally
    open var delay: EmitterOp = definedExternally
    open var frequency: Number = definedExternally
    open var on: Boolean = definedExternally
    open var particleBringToTop: Boolean = definedExternally
    open var timeScale: Number = definedExternally
    open var emitZone: dynamic /* Phaser.GameObjects.Particles.Zones.EdgeZone | Phaser.GameObjects.Particles.Zones.RandomZone */ = definedExternally
    open var deathZone: Phaser.GameObjects.Particles.Zones.DeathZone = definedExternally
    open var bounds: Phaser.Geom.Rectangle = definedExternally
    open var collideLeft: Boolean = definedExternally
    open var collideRight: Boolean = definedExternally
    open var collideTop: Boolean = definedExternally
    open var collideBottom: Boolean = definedExternally
    open var active: Boolean = definedExternally
    override var visible: Boolean = definedExternally
    override var blendMode: Number = definedExternally
    open var follow: Phaser.GameObjects.GameObject = definedExternally
    open var followOffset: Phaser.Math.Vector2 = definedExternally
    open var trackVisible: Boolean = definedExternally
    open var currentFrame: Number = definedExternally
    open var randomFrame: Boolean = definedExternally
    open var frameQuantity: Number = definedExternally
    open fun fromJSON(config: ParticleEmitterConfig): ParticleEmitter = definedExternally
    open fun toJSON(output: Any? = definedExternally /* null */): Any = definedExternally
    open fun startFollow(target: Phaser.GameObjects.GameObject, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */, trackVisible: Boolean? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun stopFollow(): ParticleEmitter = definedExternally
    open fun getFrame(): Phaser.Textures.Frame = definedExternally
    open fun setFrame(frames: String, pickRandom: Boolean? = definedExternally /* null */, quantity: Number? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun setFrame(frames: Number, pickRandom: Boolean? = definedExternally /* null */, quantity: Number? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun setFrame(frames: Array<Any>, pickRandom: Boolean? = definedExternally /* null */, quantity: Number? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun setFrame(frames: ParticleEmitterFrameConfig, pickRandom: Boolean? = definedExternally /* null */, quantity: Number? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun setRadial(value: Boolean? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun setPosition(x: Number, y: dynamic /* Number | Any? | Array<Number> | (particle: Particle, key: String, value: Number) -> Unit */): ParticleEmitter = definedExternally
    open fun setPosition(x: Any?, y: dynamic /* Number | Any? | Array<Number> | (particle: Particle, key: String, value: Number) -> Unit */): ParticleEmitter = definedExternally
    open fun setPosition(x: Array<Number>, y: dynamic /* Number | Any? | Array<Number> | (particle: Particle, key: String, value: Number) -> Unit */): ParticleEmitter = definedExternally
    open fun setPosition(x: (particle: Particle, key: String, value: Number) -> Unit, y: dynamic /* Number | Any? | Array<Number> | (particle: Particle, key: String, value: Number) -> Unit */): ParticleEmitter = definedExternally
    open fun setBounds(x: Number, y: Number, width: Number, height: Number): ParticleEmitter = definedExternally
    open fun setBounds(x: ParticleEmitterBounds, y: Number, width: Number, height: Number): ParticleEmitter = definedExternally
    open fun setBounds(x: ParticleEmitterBoundsAlt, y: Number, width: Number, height: Number): ParticleEmitter = definedExternally
    open fun setSpeedX(value: Number): ParticleEmitter = definedExternally
    open fun setSpeedX(value: Any?): ParticleEmitter = definedExternally
    open fun setSpeedX(value: Array<Number>): ParticleEmitter = definedExternally
    open fun setSpeedX(value: (particle: Particle, key: String, value: Number) -> Unit): ParticleEmitter = definedExternally
    open fun setSpeedY(value: Number): ParticleEmitter = definedExternally
    open fun setSpeedY(value: Any?): ParticleEmitter = definedExternally
    open fun setSpeedY(value: Array<Number>): ParticleEmitter = definedExternally
    open fun setSpeedY(value: (particle: Particle, key: String, value: Number) -> Unit): ParticleEmitter = definedExternally
    open fun setSpeed(value: Number): ParticleEmitter = definedExternally
    open fun setSpeed(value: Any?): ParticleEmitter = definedExternally
    open fun setSpeed(value: Array<Number>): ParticleEmitter = definedExternally
    open fun setSpeed(value: (particle: Particle, key: String, value: Number) -> Unit): ParticleEmitter = definedExternally
    open fun setScaleX(value: Number): ParticleEmitter = definedExternally
    open fun setScaleX(value: Any?): ParticleEmitter = definedExternally
    open fun setScaleX(value: Array<Number>): ParticleEmitter = definedExternally
    open fun setScaleX(value: (particle: Particle, key: String, t: Number, value: Number) -> Unit): ParticleEmitter = definedExternally
    open fun setScaleY(value: Number): ParticleEmitter = definedExternally
    open fun setScaleY(value: Any?): ParticleEmitter = definedExternally
    open fun setScaleY(value: Array<Number>): ParticleEmitter = definedExternally
    open fun setScaleY(value: (particle: Particle, key: String, t: Number, value: Number) -> Unit): ParticleEmitter = definedExternally
    open fun setScale(value: Number): ParticleEmitter = definedExternally
    open fun setScale(value: Any?): ParticleEmitter = definedExternally
    open fun setScale(value: Array<Number>): ParticleEmitter = definedExternally
    open fun setScale(value: (particle: Particle, key: String, t: Number, value: Number) -> Unit): ParticleEmitter = definedExternally
    open fun setGravityX(value: Number): ParticleEmitter = definedExternally
    open fun setGravityY(value: Number): ParticleEmitter = definedExternally
    open fun setGravity(x: Number, y: Number): ParticleEmitter = definedExternally
    open fun setAlpha(value: Number): ParticleEmitter = definedExternally
    open fun setAlpha(value: Any?): ParticleEmitter = definedExternally
    open fun setAlpha(value: Array<Number>): ParticleEmitter = definedExternally
    open fun setAlpha(value: (particle: Particle, key: String, t: Number, value: Number) -> Unit): ParticleEmitter = definedExternally
    open fun setEmitterAngle(value: Number): ParticleEmitter = definedExternally
    open fun setEmitterAngle(value: Any?): ParticleEmitter = definedExternally
    open fun setEmitterAngle(value: Array<Number>): ParticleEmitter = definedExternally
    open fun setEmitterAngle(value: (particle: Particle, key: String, value: Number) -> Unit): ParticleEmitter = definedExternally
    open fun setAngle(value: Number): ParticleEmitter = definedExternally
    open fun setAngle(value: Any?): ParticleEmitter = definedExternally
    open fun setAngle(value: Array<Number>): ParticleEmitter = definedExternally
    open fun setAngle(value: (particle: Particle, key: String, value: Number) -> Unit): ParticleEmitter = definedExternally
    open fun setLifespan(value: Number): ParticleEmitter = definedExternally
    open fun setLifespan(value: Any?): ParticleEmitter = definedExternally
    open fun setLifespan(value: Array<Number>): ParticleEmitter = definedExternally
    open fun setLifespan(value: (particle: Particle, key: String, value: Number) -> Unit): ParticleEmitter = definedExternally
    open fun setQuantity(quantity: Number): ParticleEmitter = definedExternally
    open fun setQuantity(quantity: Any?): ParticleEmitter = definedExternally
    open fun setQuantity(quantity: Array<Number>): ParticleEmitter = definedExternally
    open fun setQuantity(quantity: (particle: Particle, key: String, value: Number) -> Unit): ParticleEmitter = definedExternally
    open fun setFrequency(frequency: Number, quantity: Number? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun setFrequency(frequency: Number, quantity: Any? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun setFrequency(frequency: Number, quantity: Array<Number>? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun setFrequency(frequency: Number, quantity: ((particle: Particle, key: String, value: Number) -> Unit)? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun setEmitZone(zoneConfig: ParticleEmitterEdgeZoneConfig? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun setEmitZone(zoneConfig: ParticleEmitterRandomZoneConfig? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun setDeathZone(zoneConfig: ParticleEmitterDeathZoneConfig? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun reserve(particleCount: Number): ParticleEmitter = definedExternally
    open fun getAliveParticleCount(): Number = definedExternally
    open fun getDeadParticleCount(): Number = definedExternally
    open fun getParticleCount(): Number = definedExternally
    open fun atLimit(): Boolean = definedExternally
    open fun onParticleEmit(callback: (particle: Particle, emitter: ParticleEmitter) -> Unit, context: Any? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun onParticleDeath(callback: (particle: Particle) -> Unit, context: Any? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun killAll(): ParticleEmitter = definedExternally
    open fun forEachAlive(callback: (particle: Particle, emitter: ParticleEmitter) -> Unit, context: Any): ParticleEmitter = definedExternally
    open fun forEachDead(callback: (particle: Particle, emitter: ParticleEmitter) -> Unit, context: Any): ParticleEmitter = definedExternally
    open fun start(): ParticleEmitter = definedExternally
    open fun stop(): ParticleEmitter = definedExternally
    open fun pause(): ParticleEmitter = definedExternally
    open fun resume(): ParticleEmitter = definedExternally
    open fun depthSort(): ParticleEmitter = definedExternally
    open fun flow(frequency: Number, count: Number? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun flow(frequency: Number, count: Any? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun flow(frequency: Number, count: Array<Number>? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun flow(frequency: Number, count: ((particle: Particle, key: String, value: Number) -> Unit)? = definedExternally /* null */): ParticleEmitter = definedExternally
    open fun explode(count: Number, x: Number, y: Number): Particle = definedExternally
    open fun emitParticleAt(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, count: Number? = definedExternally /* null */): Particle = definedExternally
    open fun emitParticle(count: Number? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): Particle = definedExternally
    open fun preUpdate(time: Number, delta: Number): Unit = definedExternally
    open fun depthSortCallback(a: Any, b: Any): Number = definedExternally
    open fun indexSortCallback(a: Any, b: Any): Number = definedExternally
    override fun setBlendMode(value: String): ParticleEmitter /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): ParticleEmitter /* this */ = definedExternally
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): ParticleEmitter /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): ParticleEmitter /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): ParticleEmitter /* this */ = definedExternally
    override fun createBitmapMask(renderable: Phaser.GameObjects.GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Phaser.GameObjects.Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override var scrollFactorX: Number = definedExternally
    override var scrollFactorY: Number = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): ParticleEmitter /* this */ = definedExternally
    override fun setVisible(value: Boolean): ParticleEmitter /* this */ = definedExternally
    open fun setFrequency(frequency: Number): ParticleEmitter = definedExternally
    open fun setEmitZone(): ParticleEmitter = definedExternally
    open fun flow(frequency: Number): ParticleEmitter = definedExternally
}
open external class ParticleEmitterManager : Phaser.GameObjects.GameObject, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
    constructor(scene: Phaser.Scene, texture: String, frame: String? = definedExternally /* null */, emitters: ParticleEmitterConfig? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, texture: String, frame: String? = definedExternally /* null */, emitters: Array<ParticleEmitterConfig>? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, texture: String, frame: Number? = definedExternally /* null */, emitters: ParticleEmitterConfig? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, texture: String, frame: Number? = definedExternally /* null */, emitters: Array<ParticleEmitterConfig>? = definedExternally /* null */)

    open var timeScale: Number
    open var texture: Phaser.Textures.Texture
    open var frame: Phaser.Textures.Frame
    open var frameNames: Array<String>
    open var emitters: Phaser.Structs.List<ParticleEmitter>
    open var wells: Phaser.Structs.List<GravityWell>
    override var depth: Number
    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline
    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override var visible: Boolean
    open fun setTexture(key: String, frame: String? = definedExternally /* null */): ParticleEmitterManager = definedExternally
    open fun setTexture(key: String, frame: Number? = definedExternally /* null */): ParticleEmitterManager = definedExternally
    open fun setFrame(frame: String? = definedExternally /* null */): ParticleEmitterManager = definedExternally
    open fun setFrame(frame: Number? = definedExternally /* null */): ParticleEmitterManager = definedExternally
    open fun setEmitterFrames(frames: Phaser.Textures.Frame, emitter: ParticleEmitter): ParticleEmitterManager = definedExternally
    open fun setEmitterFrames(frames: Array<Phaser.Textures.Frame>, emitter: ParticleEmitter): ParticleEmitterManager = definedExternally
    open fun addEmitter(emitter: ParticleEmitter): ParticleEmitter = definedExternally
    open fun createEmitter(config: ParticleEmitterConfig): ParticleEmitter = definedExternally
    open fun addGravityWell(well: GravityWell): GravityWell = definedExternally
    open fun createGravityWell(config: GravityWellConfig): GravityWell = definedExternally
    open fun emitParticle(count: Number? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): ParticleEmitterManager = definedExternally
    open fun emitParticleAt(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, count: Number? = definedExternally /* null */): ParticleEmitterManager = definedExternally
    open fun pause(): ParticleEmitterManager = definedExternally
    open fun resume(): ParticleEmitterManager = definedExternally
    open fun getProcessors(): Array<GravityWell> = definedExternally
    open fun preUpdate(time: Number, delta: Number): Unit = definedExternally
    override fun setDepth(value: Number): ParticleEmitterManager /* this */ = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): ParticleEmitterManager /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): ParticleEmitterManager /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): ParticleEmitterManager /* this */ = definedExternally
    override fun setRotation(radians: Number?): ParticleEmitterManager /* this */ = definedExternally
    override fun setAngle(degrees: Number?): ParticleEmitterManager /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): ParticleEmitterManager /* this */ = definedExternally
    override fun setX(value: Number?): ParticleEmitterManager /* this */ = definedExternally
    override fun setY(value: Number?): ParticleEmitterManager /* this */ = definedExternally
    override fun setZ(value: Number?): ParticleEmitterManager /* this */ = definedExternally
    override fun setW(value: Number?): ParticleEmitterManager /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun setVisible(value: Boolean): ParticleEmitterManager /* this */ = definedExternally
    open fun setTexture(key: String): ParticleEmitterManager = definedExternally
    open fun setFrame(): ParticleEmitterManager = definedExternally
}
