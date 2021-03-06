@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Animations")]
package org.decembrist.Phaser.Animations

import org.decembrist.Phaser.Phaser
import org.decembrist.utils.*

open external class Animation(manager: AnimationManager, key: String, config: AnimationConfig) {
    open var manager: AnimationManager = definedExternally
    open var key: String = definedExternally
    open var type: String = definedExternally
    open var frames: Array<AnimationFrame> = definedExternally
    open var frameRate: Number = definedExternally
    open var duration: Number = definedExternally
    open var msPerFrame: Number = definedExternally
    open var skipMissedFrames: Boolean = definedExternally
    open var delay: Number = definedExternally
    open var repeat: Number = definedExternally
    open var repeatDelay: Number = definedExternally
    open var yoyo: Boolean = definedExternally
    open var showOnStart: Boolean = definedExternally
    open var hideOnComplete: Boolean = definedExternally
    open var paused: Boolean = definedExternally
    open fun addFrame(config: String): Animation = definedExternally
    open fun addFrame(config: Array<AnimationFrameConfig>): Animation = definedExternally
    open fun addFrameAt(index: Number, config: String): Animation = definedExternally
    open fun addFrameAt(index: Number, config: Array<AnimationFrameConfig>): Animation = definedExternally
    open fun checkFrame(index: Number): Boolean = definedExternally
    open fun completeAnimation(component: org.decembrist.Phaser.GameObjects.Components.Animation): Unit = definedExternally
    open fun getFirstTick(component: org.decembrist.Phaser.GameObjects.Components.Animation, includeDelay: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun getFrameAt(index: Number): AnimationFrame = definedExternally
    open fun getFrames(textureManager: org.decembrist.Phaser.Textures.TextureManager, frames: String, defaultTextureKey: String? = definedExternally /* null */): Array<AnimationFrame> = definedExternally
    open fun getFrames(textureManager: org.decembrist.Phaser.Textures.TextureManager, frames: Array<AnimationFrameConfig>, defaultTextureKey: String? = definedExternally /* null */): Array<AnimationFrame> = definedExternally
    open fun getNextTick(component: org.decembrist.Phaser.GameObjects.Components.Animation): Unit = definedExternally
    open fun getFrameByProgress(value: Number): AnimationFrame = definedExternally
    open fun nextFrame(component: org.decembrist.Phaser.GameObjects.Components.Animation): Unit = definedExternally
    open fun getLastFrame(): AnimationFrame = definedExternally
    open fun previousFrame(component: org.decembrist.Phaser.GameObjects.Components.Animation): Unit = definedExternally
    open fun removeFrame(frame: AnimationFrame): Animation = definedExternally
    open fun removeFrameAt(index: Number): Animation = definedExternally
    open fun repeatAnimation(component: org.decembrist.Phaser.GameObjects.Components.Animation): Unit = definedExternally
    open fun setFrame(component: org.decembrist.Phaser.GameObjects.Components.Animation): Unit = definedExternally
    open fun toJSON(): JSONAnimation = definedExternally
    open fun updateFrameSequence(): Animation = definedExternally
    open fun pause(): Animation = definedExternally
    open fun resume(): Animation = definedExternally
    open fun destroy(): Unit = definedExternally
}
open external class AnimationFrame {
    constructor(textureKey: String, textureFrame: String, index: Number, frame: org.decembrist.Phaser.Textures.Frame)
    constructor(textureKey: String, textureFrame: Number, index: Number, frame: org.decembrist.Phaser.Textures.Frame)

    open var textureKey: String
    open var textureFrame: dynamic /* String | Number */
    open var index: Number
    open var frame: org.decembrist.Phaser.Textures.Frame
    open var isFirst: Boolean
    open var isLast: Boolean
    open var prevFrame: AnimationFrame
    open var nextFrame: AnimationFrame
    open var duration: Number
    open var progress: Number
    open fun toJSON(): JSONAnimationFrame = definedExternally
    open fun destroy(): Unit = definedExternally
}
open external class AnimationManager(game: Phaser.Game) : org.decembrist.Phaser.Events.EventEmitter {
    open var game: Phaser.Game = definedExternally
    open var textureManager: org.decembrist.Phaser.Textures.TextureManager = definedExternally
    open var globalTimeScale: Number = definedExternally
    open var anims: org.decembrist.Phaser.Structs.Map<String, Animation> = definedExternally
    open var paused: Boolean = definedExternally
    open var name: String = definedExternally
    open fun boot(): Unit = definedExternally
    open fun add(key: String, animation: Animation): AnimationManager = definedExternally
    open fun create(config: AnimationConfig): Animation = definedExternally
    open fun fromJSON(data: String, clearCurrentAnimations: Boolean? = definedExternally /* null */): Array<Animation> = definedExternally
    open fun fromJSON(data: JSONAnimation, clearCurrentAnimations: Boolean? = definedExternally /* null */): Array<Animation> = definedExternally
    open fun fromJSON(data: JSONAnimationManager, clearCurrentAnimations: Boolean? = definedExternally /* null */): Array<Animation> = definedExternally
    open fun generateFrameNames(key: String, config: GenerateFrameNamesConfig? = definedExternally /* null */): Array<AnimationFrameConfig> = definedExternally
    open fun generateFrameNumbers(key: String, config: GenerateFrameNumbersConfig): Array<AnimationFrameConfig> = definedExternally
    open fun get(key: String): Animation = definedExternally
    open fun load(child: org.decembrist.Phaser.GameObjects.GameObject, key: String, startFrame: String? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    open fun load(child: org.decembrist.Phaser.GameObjects.GameObject, key: String, startFrame: Number? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    open fun pauseAll(): AnimationManager = definedExternally
    open fun play(key: String, child: org.decembrist.Phaser.GameObjects.GameObject): AnimationManager = definedExternally
    open fun play(key: String, child: Array<org.decembrist.Phaser.GameObjects.GameObject>): AnimationManager = definedExternally
    open fun remove(key: String): Animation = definedExternally
    open fun resumeAll(): AnimationManager = definedExternally
    open fun <G : Array<org.decembrist.Phaser.GameObjects.GameObject>> staggerPlay(key: String, children: org.decembrist.Phaser.GameObjects.GameObject, stagger: Number? = definedExternally /* null */): G = definedExternally
    open fun <G : Array<org.decembrist.Phaser.GameObjects.GameObject>> staggerPlay(key: String, children: Array<org.decembrist.Phaser.GameObjects.GameObject>, stagger: Number? = definedExternally /* null */): G = definedExternally
    open fun toJSON(key: String): JSONAnimationManager = definedExternally
    override fun destroy(): Unit = definedExternally
    open fun load(child: org.decembrist.Phaser.GameObjects.GameObject, key: String): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
}
