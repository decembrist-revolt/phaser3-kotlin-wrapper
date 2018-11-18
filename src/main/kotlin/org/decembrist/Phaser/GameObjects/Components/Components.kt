@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("GameObjects.Components")]
package org.decembrist.Phaser.GameObjects.Components

import org.decembrist.Phaser.Geom.Geom
import org.decembrist.Phaser.Math.Vector2
import org.decembrist.Phaser.Phaser
import org.khronos.webgl.Float32Array
import org.w3c.dom.CanvasRenderingContext2D

external interface Alpha {
    fun clearAlpha(): Alpha /* this */
    fun setAlpha(topLeft: Number? = definedExternally /* null */, topRight: Number? = definedExternally /* null */, bottomLeft: Number? = definedExternally /* null */, bottomRight: Number? = definedExternally /* null */): Alpha /* this */
    var alpha: Number
    var alphaTopLeft: Number
    var alphaTopRight: Number
    var alphaBottomLeft: Number
    var alphaBottomRight: Number
}
external interface Animation {
    var parent: org.decembrist.Phaser.GameObjects.GameObject
    var animationManager: org.decembrist.Phaser.Animations.AnimationManager
    var isPlaying: Boolean
    var currentAnim: org.decembrist.Phaser.Animations.Animation
    var currentFrame: org.decembrist.Phaser.Animations.AnimationFrame
    var frameRate: Number
    var duration: Number
    var msPerFrame: Number
    var skipMissedFrames: Boolean
    var forward: Boolean
    var accumulator: Number
    var nextTick: Number
    var repeatCounter: Number
    var pendingRepeat: Boolean
    fun setDelay(value: Number? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject
    fun getDelay(): Number
    fun delayedPlay(delay: Number, key: String, startFrame: Number? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject
    fun getCurrentKey(): String
    fun load(key: String, startFrame: Number? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject
    fun pause(atFrame: org.decembrist.Phaser.Animations.AnimationFrame? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject
    fun resume(fromFrame: org.decembrist.Phaser.Animations.AnimationFrame? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject
    var isPaused: Boolean
    fun play(key: String, ignoreIfPlaying: Boolean? = definedExternally /* null */, startFrame: Number? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject
    fun playReverse(key: String, ignoreIfPlaying: Boolean? = definedExternally /* null */, startFrame: Number? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject
    fun _startAnimation(key: String, startFrame: Number? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject
    fun reverse(key: String): org.decembrist.Phaser.GameObjects.GameObject
    fun getProgress(): Number
    fun setProgress(value: Number? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject
    fun remove(key: String? = definedExternally /* null */, animation: org.decembrist.Phaser.Animations.Animation? = definedExternally /* null */)
    fun getRepeat(): Number
    fun setRepeat(value: Number): org.decembrist.Phaser.GameObjects.GameObject
    fun getRepeatDelay(): Number
    fun setRepeatDelay(value: Number): org.decembrist.Phaser.GameObjects.GameObject
    fun restart(includeDelay: Boolean? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject
    fun stop(): org.decembrist.Phaser.GameObjects.GameObject
    fun stopAfterDelay(delay: Number): org.decembrist.Phaser.GameObjects.GameObject
    fun stopOnRepeat(): org.decembrist.Phaser.GameObjects.GameObject
    fun stopOnFrame(delay: org.decembrist.Phaser.Animations.AnimationFrame): org.decembrist.Phaser.GameObjects.GameObject
    fun setTimeScale(value: Number? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject
    fun getTimeScale(): Number
    fun getTotalFrames(): Number
    fun update(time: Number, delta: Number)
    fun setCurrentFrame(animationFrame: org.decembrist.Phaser.Animations.AnimationFrame): org.decembrist.Phaser.GameObjects.GameObject
    fun setYoyo(value: Boolean? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject
    fun getYoyo(): Boolean
    fun destroy()
}
external interface BlendMode {
    var blendMode: dynamic /* String | Phaser.BlendModes */
    fun setBlendMode(value: String): BlendMode /* this */
    fun setBlendMode(value: Phaser.BlendModes): BlendMode /* this */
}
external interface ComputedSize {
    var width: Number
    var height: Number
    var displayWidth: Number
    var displayHeight: Number
    fun setSize(width: Number, height: Number): ComputedSize /* this */
    fun setDisplaySize(width: Number, height: Number): ComputedSize /* this */
}
external interface Crop {
    var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    var frame: org.decembrist.Phaser.Textures.Frame
    var isCropped: Boolean
    fun setCrop(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): Crop /* this */
    fun setCrop(x: Geom.Rectangle? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): Crop /* this */
    fun setCrop(): Crop /* this */
}
external interface Depth {
    var depth: Number
    fun setDepth(value: Number): Depth /* this */
}
external interface Flip {
    var flipX: Boolean
    var flipY: Boolean
    fun toggleFlipX(): Flip /* this */
    fun toggleFlipY(): Flip /* this */
    fun setFlipX(value: Boolean): Flip /* this */
    fun setFlipY(value: Boolean): Flip /* this */
    fun setFlip(x: Boolean, y: Boolean): Flip /* this */
    fun resetFlip(): Flip /* this */
}
external interface GetBounds {
    fun <O : Vector2> getCenter(output: O? = definedExternally /* null */): O
    fun <O : Vector2> getTopLeft(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O
    fun <O : Vector2> getTopRight(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O
    fun <O : Vector2> getBottomLeft(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O
    fun <O : Vector2> getBottomRight(output: O? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): O
    fun <O : Geom.Rectangle> getBounds(output: O? = definedExternally /* null */): O
    fun getCenter(output: Vector2? = definedExternally /* null */): Vector2
    fun getTopLeft(output: Vector2? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): Vector2
    fun getTopRight(output: Vector2? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): Vector2
    fun getBottomLeft(output: Vector2? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): Vector2
    fun getBottomRight(output: Vector2? = definedExternally /* null */, includeParent: Boolean? = definedExternally /* null */): Vector2
    fun getBounds(output: Geom.Rectangle? = definedExternally /* null */): Geom.Rectangle
}
external interface Mask {
    var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
    fun setMask(mask: org.decembrist.Phaser.Display.Masks.BitmapMask): Mask /* this */
    fun setMask(mask: org.decembrist.Phaser.Display.Masks.GeometryMask): Mask /* this */
    fun clearMask(destroyMask: Boolean? = definedExternally /* null */): Mask /* this */
    fun createBitmapMask(renderable: org.decembrist.Phaser.GameObjects.GameObject? = definedExternally /* null */): org.decembrist.Phaser.Display.Masks.BitmapMask
    fun createGeometryMask(graphics: org.decembrist.Phaser.GameObjects.Graphics? = definedExternally /* null */): org.decembrist.Phaser.Display.Masks.GeometryMask
}
external interface Origin {
    var originX: Number
    var originY: Number
    var displayOriginX: Number
    var displayOriginY: Number
    fun setOrigin(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): Origin /* this */
    fun setOriginFromFrame(): Origin /* this */
    fun setDisplayOrigin(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): Origin /* this */
    fun updateDisplayOrigin(): Origin /* this */
}
external interface Pipeline {
    var defaultPipeline: org.decembrist.Phaser.Renderer.WebGL.WebGLPipeline
    var pipeline: org.decembrist.Phaser.Renderer.WebGL.WebGLPipeline
    fun initPipeline(pipelineName: String? = definedExternally /* null */): Boolean
    fun setPipeline(pipelineName: String): Pipeline /* this */
    fun resetPipeline(): Boolean
    fun getPipelineName(): String
}
external interface ScaleMode {
    var scaleMode: Phaser.ScaleModes
    fun setScaleMode(value: Phaser.ScaleModes): ScaleMode /* this */
}
external interface ScrollFactor {
    var scrollFactorX: Number
    var scrollFactorY: Number
    fun setScrollFactor(x: Number, y: Number? = definedExternally /* null */): ScrollFactor /* this */
}
external interface Size {
    var width: Number
    var height: Number
    var displayWidth: Number
    var displayHeight: Number
    fun setSizeToFrame(frame: org.decembrist.Phaser.Textures.Frame): Size /* this */
    fun setSize(width: Number, height: Number): Size /* this */
    fun setDisplaySize(width: Number, height: Number): Size /* this */
}
external interface Texture {
    var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    var frame: org.decembrist.Phaser.Textures.Frame
    fun setTexture(key: String, frame: String? = definedExternally /* null */): Texture /* this */
    fun setTexture(key: String, frame: Number? = definedExternally /* null */): Texture /* this */
    fun setFrame(frame: String, updateSize: Boolean? = definedExternally /* null */, updateOrigin: Boolean? = definedExternally /* null */): Texture /* this */
    fun setFrame(frame: Number, updateSize: Boolean? = definedExternally /* null */, updateOrigin: Boolean? = definedExternally /* null */): Texture /* this */
    fun setTexture(key: String): Texture /* this */
}
external interface TextureCrop {
    var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    var frame: org.decembrist.Phaser.Textures.Frame
    var isCropped: Boolean
    fun setCrop(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): TextureCrop /* this */
    fun setCrop(x: Geom.Rectangle? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): TextureCrop /* this */
    fun setTexture(key: String, frame: String? = definedExternally /* null */): TextureCrop /* this */
    fun setTexture(key: String, frame: Number? = definedExternally /* null */): TextureCrop /* this */
    fun setFrame(frame: String, updateSize: Boolean? = definedExternally /* null */, updateOrigin: Boolean? = definedExternally /* null */): TextureCrop /* this */
    fun setFrame(frame: Number, updateSize: Boolean? = definedExternally /* null */, updateOrigin: Boolean? = definedExternally /* null */): TextureCrop /* this */
    fun setCrop(): TextureCrop /* this */
    fun setTexture(key: String): TextureCrop /* this */
}
external interface Tint {
    var tintFill: Boolean
    fun clearTint(): Tint /* this */
    fun setTint(topLeft: Number? = definedExternally /* null */, topRight: Number? = definedExternally /* null */, bottomLeft: Number? = definedExternally /* null */, bottomRight: Number? = definedExternally /* null */): Tint /* this */
    fun setTintFill(topLeft: Number? = definedExternally /* null */, topRight: Number? = definedExternally /* null */, bottomLeft: Number? = definedExternally /* null */, bottomRight: Number? = definedExternally /* null */): Tint /* this */
    var tintTopLeft: Number
    var tintTopRight: Number
    var tintBottomLeft: Number
    var tintBottomRight: Number
    var tint: Number
    var isTinted: Boolean
}
external interface ToJSON
external interface Transform {
    var x: Number
    var y: Number
    var z: Number
    var w: Number
    var scaleX: Number
    var scaleY: Number
    var angle: Number
    var rotation: Number
    fun setPosition(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, z: Number? = definedExternally /* null */, w: Number? = definedExternally /* null */): Transform /* this */
    fun setRandomPosition(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): Transform /* this */
    fun setRotation(radians: Number? = definedExternally /* null */): Transform /* this */
    fun setAngle(degrees: Number? = definedExternally /* null */): Transform /* this */
    fun setScale(x: Number, y: Number? = definedExternally /* null */): Transform /* this */
    fun setX(value: Number? = definedExternally /* null */): Transform /* this */
    fun setY(value: Number? = definedExternally /* null */): Transform /* this */
    fun setZ(value: Number? = definedExternally /* null */): Transform /* this */
    fun setW(value: Number? = definedExternally /* null */): Transform /* this */
    fun getLocalTransformMatrix(tempMatrix: TransformMatrix? = definedExternally /* null */): TransformMatrix
    fun getWorldTransformMatrix(tempMatrix: TransformMatrix? = definedExternally /* null */, parentMatrix: TransformMatrix? = definedExternally /* null */): TransformMatrix
}
open external class TransformMatrix(a: Number? = definedExternally /* null */, b: Number? = definedExternally /* null */, c: Number? = definedExternally /* null */, d: Number? = definedExternally /* null */, tx: Number? = definedExternally /* null */, ty: Number? = definedExternally /* null */) {
    open var matrix: Float32Array = definedExternally
    open var decomposedMatrix: Any = definedExternally
    open var a: Number = definedExternally
    open var b: Number = definedExternally
    open var c: Number = definedExternally
    open var d: Number = definedExternally
    open var e: Number = definedExternally
    open var f: Number = definedExternally
    open var tx: Number = definedExternally
    open var ty: Number = definedExternally
    open var rotation: Number = definedExternally
    open var scaleX: Number = definedExternally
    open var scaleY: Number = definedExternally
    open fun loadIdentity(): TransformMatrix /* this */ = definedExternally
    open fun translate(x: Number, y: Number): TransformMatrix /* this */ = definedExternally
    open fun scale(x: Number, y: Number): TransformMatrix /* this */ = definedExternally
    open fun rotate(angle: Number): TransformMatrix /* this */ = definedExternally
    open fun multiply(rhs: TransformMatrix, out: TransformMatrix? = definedExternally /* null */): TransformMatrix = definedExternally
    open fun multiplyWithOffset(src: TransformMatrix, offsetX: Number, offsetY: Number): TransformMatrix /* this */ = definedExternally
    open fun transform(a: Number, b: Number, c: Number, d: Number, tx: Number, ty: Number): TransformMatrix /* this */ = definedExternally
    open fun transformPoint(x: Number, y: Number, point: Any?): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
    open fun transformPoint(x: Number, y: Number, point: org.decembrist.Phaser.Math.Vector2): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
    open fun transformPoint(x: Number, y: Number, point: Geom.Point): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
    open fun invert(): TransformMatrix /* this */ = definedExternally
    open fun copyFrom(src: TransformMatrix): TransformMatrix /* this */ = definedExternally
    open fun copyFromArray(src: Array<Any>): TransformMatrix /* this */ = definedExternally
    open fun copyToContext(ctx: CanvasRenderingContext2D): CanvasRenderingContext2D = definedExternally
    open fun setToContext(ctx: CanvasRenderingContext2D): CanvasRenderingContext2D = definedExternally
    open fun copyToArray(out: Array<Any>? = definedExternally /* null */): Array<Any> = definedExternally
    open fun setTransform(a: Number, b: Number, c: Number, d: Number, tx: Number, ty: Number): TransformMatrix /* this */ = definedExternally
    open fun decomposeMatrix(): Any = definedExternally
    open fun applyITRS(x: Number, y: Number, rotation: Number, scaleX: Number, scaleY: Number): TransformMatrix /* this */ = definedExternally
    open fun applyInverse(x: Number, y: Number, output: org.decembrist.Phaser.Math.Vector2? = definedExternally /* null */): org.decembrist.Phaser.Math.Vector2 = definedExternally
    open fun getX(x: Number, y: Number): Number = definedExternally
    open fun getY(x: Number, y: Number): Number = definedExternally
    open fun getCSSMatrix(): String = definedExternally
    open fun destroy(): Unit = definedExternally
}
external interface Visible {
    var visible: Boolean
    fun setVisible(value: Boolean): Visible /* this */
}
