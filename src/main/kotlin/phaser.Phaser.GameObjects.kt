@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("GameObjects") JsNonModule]
package Phaser.GameObjects

import BitmapFontData
import BitmapTextMetrics
import BitmapTextSize
import DisplayCallbackConfig
import GameObjectConfig
import GraphicsStyles
import GroupConfig
import GroupCreateConfig
import JSONGameObject
import ParticleEmitterConfig
import PathConfig
import Phaser.Math.Vector2
import RenderTextureConfig
import TilemapConfig
import org.khronos.webgl.Float32Array
import org.khronos.webgl.Uint32Array
import org.khronos.webgl.WebGLFramebuffer
import org.khronos.webgl.WebGLRenderingContext
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLElement

open external class DynamicBitmapText : BitmapText {
    constructor(scene: Phaser.Scene, x: Number, y: Number, font: String, text: String? = definedExternally /* null */, size: Number? = definedExternally /* null */, align: Number? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, x: Number, y: Number, font: String, text: Array<String>? = definedExternally /* null */, size: Number? = definedExternally /* null */, align: Number? = definedExternally /* null */)

    open var scrollX: Number
    open var scrollY: Number
    open var cropWidth: Number
    open var cropHeight: Number
    open var displayCallback: (display: DisplayCallbackConfig) -> Unit
    open var callbackData: DisplayCallbackConfig
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* String | Phaser.BlendModes */
    override var depth: Number
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
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Phaser.Textures.Frame
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
    open fun setSize(width: Number, height: Number): DynamicBitmapText = definedExternally
    open fun setDisplayCallback(callback: (display: DisplayCallbackConfig) -> Unit): DynamicBitmapText = definedExternally
    open fun setScrollX(value: Number): DynamicBitmapText = definedExternally
    open fun setScrollY(value: Number): DynamicBitmapText = definedExternally
    override fun clearAlpha(): DynamicBitmapText /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): DynamicBitmapText /* this */ = definedExternally
    override fun setBlendMode(value: String): DynamicBitmapText /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): DynamicBitmapText /* this */ = definedExternally
    override fun setDepth(value: Number): DynamicBitmapText /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): DynamicBitmapText /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): DynamicBitmapText /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): DynamicBitmapText /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override fun setOrigin(x: Number?, y: Number?): DynamicBitmapText /* this */ = definedExternally
    override fun setOriginFromFrame(): DynamicBitmapText /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): DynamicBitmapText /* this */ = definedExternally
    override fun updateDisplayOrigin(): DynamicBitmapText /* this */ = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): DynamicBitmapText /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): DynamicBitmapText /* this */ = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): DynamicBitmapText /* this */ = definedExternally
    override fun setTexture(key: String, frame: String?): DynamicBitmapText /* this */ = definedExternally
    override fun setTexture(key: String, frame: Number?): DynamicBitmapText /* this */ = definedExternally
    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): DynamicBitmapText /* this */ = definedExternally
    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): DynamicBitmapText /* this */ = definedExternally
    override fun clearTint(): DynamicBitmapText /* this */ = definedExternally
    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): DynamicBitmapText /* this */ = definedExternally
    override fun setTintFill(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): DynamicBitmapText /* this */ = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): DynamicBitmapText /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): DynamicBitmapText /* this */ = definedExternally
    override fun setRotation(radians: Number?): DynamicBitmapText /* this */ = definedExternally
    override fun setAngle(degrees: Number?): DynamicBitmapText /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): DynamicBitmapText /* this */ = definedExternally
    override fun setX(value: Number?): DynamicBitmapText /* this */ = definedExternally
    override fun setY(value: Number?): DynamicBitmapText /* this */ = definedExternally
    override fun setZ(value: Number?): DynamicBitmapText /* this */ = definedExternally
    override fun setW(value: Number?): DynamicBitmapText /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun setVisible(value: Boolean): DynamicBitmapText /* this */ = definedExternally
    override fun setTexture(key: String): DynamicBitmapText /* this */ = definedExternally
}
external interface `T$3` {
    var font: String
    var text: String
    var fontSize: Number
    var letterSpacing: Number
    var align: Number
}
open external class BitmapText : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Mask, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Texture, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
    constructor(scene: Phaser.Scene, x: Number, y: Number, font: String, text: String? = definedExternally /* null */, size: Number? = definedExternally /* null */, align: Number? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, x: Number, y: Number, font: String, text: Array<String>? = definedExternally /* null */, size: Number? = definedExternally /* null */, align: Number? = definedExternally /* null */)

    open var font: String
    open var fontData: BitmapFontData
    open var align: Number
    open var text: String
    open var fontSize: Number
    open var letterSpacing: Number
    open var width: Number
    open var height: Number
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* String | Phaser.BlendModes */
    override var depth: Number
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
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Phaser.Textures.Frame
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
    open fun setLeftAlign(): BitmapText /* this */ = definedExternally
    open fun setCenterAlign(): BitmapText /* this */ = definedExternally
    open fun setRightAlign(): BitmapText /* this */ = definedExternally
    open fun setFontSize(size: Number): BitmapText /* this */ = definedExternally
    open fun setLetterSpacing(spacing: Number? = definedExternally /* null */): BitmapText /* this */ = definedExternally
    open fun setText(value: String): BitmapText /* this */ = definedExternally
    open fun setText(value: Array<String>): BitmapText /* this */ = definedExternally
    open fun getTextBounds(round: Boolean? = definedExternally /* null */): BitmapTextSize = definedExternally
    open fun setFont(font: String, size: Number? = definedExternally /* null */, align: Number? = definedExternally /* null */): BitmapText /* this */ = definedExternally
    override fun toJSON(): JSONGameObject /* JSONGameObject & `T$3` */ = definedExternally
    override fun clearAlpha(): BitmapText /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): BitmapText /* this */ = definedExternally
    override fun setBlendMode(value: String): BitmapText /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): BitmapText /* this */ = definedExternally
    override fun setDepth(value: Number): BitmapText /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): BitmapText /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): BitmapText /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): BitmapText /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override fun setOrigin(x: Number?, y: Number?): BitmapText /* this */ = definedExternally
    override fun setOriginFromFrame(): BitmapText /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): BitmapText /* this */ = definedExternally
    override fun updateDisplayOrigin(): BitmapText /* this */ = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): BitmapText /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): BitmapText /* this */ = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): BitmapText /* this */ = definedExternally
    override fun setTexture(key: String, frame: String?): BitmapText /* this */ = definedExternally
    override fun setTexture(key: String, frame: Number?): BitmapText /* this */ = definedExternally
    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): BitmapText /* this */ = definedExternally
    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): BitmapText /* this */ = definedExternally
    override fun clearTint(): BitmapText /* this */ = definedExternally
    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): BitmapText /* this */ = definedExternally
    override fun setTintFill(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): BitmapText /* this */ = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): BitmapText /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): BitmapText /* this */ = definedExternally
    override fun setRotation(radians: Number?): BitmapText /* this */ = definedExternally
    override fun setAngle(degrees: Number?): BitmapText /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): BitmapText /* this */ = definedExternally
    override fun setX(value: Number?): BitmapText /* this */ = definedExternally
    override fun setY(value: Number?): BitmapText /* this */ = definedExternally
    override fun setZ(value: Number?): BitmapText /* this */ = definedExternally
    override fun setW(value: Number?): BitmapText /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun setVisible(value: Boolean): BitmapText /* this */ = definedExternally
    companion object {
        var ALIGN_LEFT: Number = definedExternally
        var ALIGN_CENTER: Number = definedExternally
        var ALIGN_RIGHT: Number = definedExternally
    }
    override fun setTexture(key: String): BitmapText /* this */ = definedExternally
}
open external class Blitter : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Mask, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Size, Phaser.GameObjects.Components.Texture, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
    constructor(scene: Phaser.Scene, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, texture: String? = definedExternally /* null */, frame: String? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, texture: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */)

    open var children: Phaser.Structs.List<Phaser.GameObjects.Blitter.Bob>
    open var dirty: Boolean
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* String | Phaser.BlendModes */
    override var depth: Number
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */
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
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override var visible: Boolean
    open fun create(x: Number, y: Number, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */, index: Number? = definedExternally /* null */): Phaser.GameObjects.Blitter.Bob = definedExternally
    open fun create(x: Number, y: Number, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */, index: Number? = definedExternally /* null */): Phaser.GameObjects.Blitter.Bob = definedExternally
    open fun create(x: Number, y: Number, frame: Phaser.Textures.Frame? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */, index: Number? = definedExternally /* null */): Phaser.GameObjects.Blitter.Bob = definedExternally
    open fun createFromCallback(callback: (bob: Phaser.GameObjects.Blitter.Bob, index: Number) -> Unit, quantity: Number, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
    open fun createFromCallback(callback: (bob: Phaser.GameObjects.Blitter.Bob, index: Number) -> Unit, quantity: Number, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
    open fun createFromCallback(callback: (bob: Phaser.GameObjects.Blitter.Bob, index: Number) -> Unit, quantity: Number, frame: Array<Number>? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
    open fun createFromCallback(callback: (bob: Phaser.GameObjects.Blitter.Bob, index: Number) -> Unit, quantity: Number, frame: Array<String>? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
    open fun createFromCallback(callback: (bob: Phaser.GameObjects.Blitter.Bob, index: Number) -> Unit, quantity: Number, frame: Phaser.Textures.Frame? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
    open fun createFromCallback(callback: (bob: Phaser.GameObjects.Blitter.Bob, index: Number) -> Unit, quantity: Number, frame: Array<Phaser.Textures.Frame>? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
    open fun createMultiple(quantity: Number, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
    open fun createMultiple(quantity: Number, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
    open fun createMultiple(quantity: Number, frame: Array<Number>? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
    open fun createMultiple(quantity: Number, frame: Array<String>? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
    open fun createMultiple(quantity: Number, frame: Phaser.Textures.Frame? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
    open fun createMultiple(quantity: Number, frame: Array<Phaser.Textures.Frame>? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
    open fun childCanRender(child: Phaser.GameObjects.Blitter.Bob): Boolean = definedExternally
    open fun getRenderList(): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
    open fun clear(): Unit = definedExternally
    open fun preDestroy(): Unit = definedExternally
    override fun clearAlpha(): Blitter /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Blitter /* this */ = definedExternally
    override fun setBlendMode(value: String): Blitter /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): Blitter /* this */ = definedExternally
    override fun setDepth(value: Number): Blitter /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): Blitter /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): Blitter /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Blitter /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): Blitter /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): Blitter /* this */ = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Blitter /* this */ = definedExternally
    override fun setSizeToFrame(frame: Phaser.Textures.Frame): Blitter /* this */ = definedExternally
    override fun setSize(width: Number, height: Number): Blitter /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Blitter /* this */ = definedExternally
    override fun setTexture(key: String, frame: String?): Blitter /* this */ = definedExternally
    override fun setTexture(key: String, frame: Number?): Blitter /* this */ = definedExternally
    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): Blitter /* this */ = definedExternally
    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): Blitter /* this */ = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Blitter /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Blitter /* this */ = definedExternally
    override fun setRotation(radians: Number?): Blitter /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Blitter /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Blitter /* this */ = definedExternally
    override fun setX(value: Number?): Blitter /* this */ = definedExternally
    override fun setY(value: Number?): Blitter /* this */ = definedExternally
    override fun setZ(value: Number?): Blitter /* this */ = definedExternally
    override fun setW(value: Number?): Blitter /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun setVisible(value: Boolean): Blitter /* this */ = definedExternally
    open class Bob {
        constructor(blitter: Phaser.GameObjects.Blitter, x: Number, y: Number, frame: String, visible: Boolean)
        constructor(blitter: Phaser.GameObjects.Blitter, x: Number, y: Number, frame: Number, visible: Boolean)

        open var parent: Phaser.GameObjects.Blitter
        open var x: Number
        open var y: Number
        open var frame: Phaser.Textures.Frame
        open var data: Any
        open var flipX: Boolean
        open var flipY: Boolean
        open var visible: Boolean
        open var alpha: Number
        open fun setFrame(frame: String? = definedExternally /* null */): Bob = definedExternally
        open fun setFrame(frame: Number? = definedExternally /* null */): Bob = definedExternally
        open fun setFrame(frame: Phaser.Textures.Frame? = definedExternally /* null */): Bob = definedExternally
        open fun resetFlip(): Bob = definedExternally
        open fun reset(x: Number, y: Number, frame: String? = definedExternally /* null */): Bob = definedExternally
        open fun reset(x: Number, y: Number, frame: Number? = definedExternally /* null */): Bob = definedExternally
        open fun reset(x: Number, y: Number, frame: Phaser.Textures.Frame? = definedExternally /* null */): Bob = definedExternally
        open fun setFlipX(value: Boolean): Bob = definedExternally
        open fun setFlipY(value: Boolean): Bob = definedExternally
        open fun setFlip(x: Boolean, y: Boolean): Bob = definedExternally
        open fun setVisible(value: Boolean): Bob = definedExternally
        open fun setAlpha(value: Number): Bob = definedExternally
        open fun destroy(): Unit = definedExternally
        open fun setFrame(): Bob = definedExternally
        open fun reset(x: Number, y: Number): Bob = definedExternally
    }
    open fun create(x: Number, y: Number): Phaser.GameObjects.Blitter.Bob = definedExternally
    open fun createFromCallback(callback: (bob: Phaser.GameObjects.Blitter.Bob, index: Number) -> Unit, quantity: Number): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
    open fun createMultiple(quantity: Number): Array<Phaser.GameObjects.Blitter.Bob> = definedExternally
    override fun setTexture(key: String): Blitter /* this */ = definedExternally
}
external fun BuildGameObject(scene: Phaser.Scene, gameObject: GameObject, config: GameObjectConfig): GameObject = definedExternally
external fun BuildGameObjectAnimation(sprite: Sprite, config: Any): Sprite = definedExternally
open external class Container(scene: Phaser.Scene, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, children: Array<GameObject>? = definedExternally /* null */) : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.ComputedSize, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Mask, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
    open var list: Array<GameObject> = definedExternally
    open var exclusive: Boolean = definedExternally
    open var maxSize: Number = definedExternally
    open var position: Number = definedExternally
    open var localTransform: Phaser.GameObjects.Components.TransformMatrix = definedExternally
    open var originX: Number = definedExternally
    open var originY: Number = definedExternally
    open var displayOriginX: Number = definedExternally
    open var displayOriginY: Number = definedExternally
    open fun setExclusive(value: Boolean? = definedExternally /* null */): Container = definedExternally
    open fun getBounds(output: Phaser.Geom.Rectangle? = definedExternally /* null */): Phaser.Geom.Rectangle = definedExternally
    open fun pointToContainer(source: Any?, output: Any? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
    open fun pointToContainer(source: Any?, output: Phaser.Math.Vector2? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
    open fun pointToContainer(source: Any?, output: Phaser.Geom.Point? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
    open fun pointToContainer(source: Phaser.Math.Vector2, output: Any? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
    open fun pointToContainer(source: Phaser.Math.Vector2, output: Phaser.Math.Vector2? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
    open fun pointToContainer(source: Phaser.Math.Vector2, output: Phaser.Geom.Point? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
    open fun pointToContainer(source: Phaser.Geom.Point, output: Any? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
    open fun pointToContainer(source: Phaser.Geom.Point, output: Phaser.Math.Vector2? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
    open fun pointToContainer(source: Phaser.Geom.Point, output: Phaser.Geom.Point? = definedExternally /* null */): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
    open fun getBoundsTransformMatrix(): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    open fun add(child: GameObject): Container = definedExternally
    open fun add(child: Array<GameObject>): Container = definedExternally
    open fun addAt(child: GameObject, index: Number? = definedExternally /* null */): Container = definedExternally
    open fun addAt(child: Array<GameObject>, index: Number? = definedExternally /* null */): Container = definedExternally
    open fun getAt(index: Number): GameObject = definedExternally
    open fun getIndex(child: GameObject): Number = definedExternally
    open fun sort(property: String): Container = definedExternally
    open fun getByName(name: String): GameObject = definedExternally
    open fun getRandom(startIndex: Number? = definedExternally /* null */, length: Number? = definedExternally /* null */): GameObject = definedExternally
    open fun getFirst(property: String? = definedExternally /* null */, value: Any? = definedExternally /* null */, startIndex: Number? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): GameObject = definedExternally
    open fun getAll(property: String? = definedExternally /* null */, value: Any? = definedExternally /* null */, startIndex: Number? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Array<GameObject> = definedExternally
    open fun count(property: String, value: Any, startIndex: Number? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Number = definedExternally
    open fun swap(child1: GameObject, child2: GameObject): Container = definedExternally
    open fun moveTo(child: GameObject, index: Number): Container = definedExternally
    open fun remove(child: GameObject, destroyChild: Boolean? = definedExternally /* null */): Container = definedExternally
    open fun remove(child: Array<GameObject>, destroyChild: Boolean? = definedExternally /* null */): Container = definedExternally
    open fun removeAt(index: Number, destroyChild: Boolean? = definedExternally /* null */): Container = definedExternally
    open fun removeBetween(startIndex: Number? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */, destroyChild: Boolean? = definedExternally /* null */): Container = definedExternally
    open fun removeAll(destroyChild: Boolean? = definedExternally /* null */): Container = definedExternally
    open fun bringToTop(child: GameObject): Container = definedExternally
    open fun sendToBack(child: GameObject): Container = definedExternally
    open fun moveUp(child: GameObject): Container = definedExternally
    open fun moveDown(child: GameObject): Container = definedExternally
    open fun reverse(): Container = definedExternally
    open fun shuffle(): Container = definedExternally
    open fun replace(oldChild: GameObject, newChild: GameObject, destroyChild: Boolean? = definedExternally /* null */): Container = definedExternally
    open fun exists(child: GameObject): Boolean = definedExternally
    open fun setAll(property: String, value: Any, startIndex: Number? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Container = definedExternally
    open fun each(callback: Function<*>, context: Any? = definedExternally /* null */, vararg args: Any): Container = definedExternally
    open fun iterate(callback: Function<*>, context: Any? = definedExternally /* null */, vararg args: Any): Container = definedExternally
    open var length: Number = definedExternally
    open var first: GameObject = definedExternally
    open var last: GameObject = definedExternally
    open var next: GameObject = definedExternally
    open var previous: GameObject = definedExternally
    open fun preDestroy(): Unit = definedExternally
    override fun clearAlpha(): Container /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Container /* this */ = definedExternally
    override var alpha: Number = definedExternally
    override var alphaTopLeft: Number = definedExternally
    override var alphaTopRight: Number = definedExternally
    override var alphaBottomLeft: Number = definedExternally
    override var alphaBottomRight: Number = definedExternally
    override var blendMode: dynamic /* String | Phaser.BlendModes */ = definedExternally
    override fun setBlendMode(value: String): Container /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): Container /* this */ = definedExternally
    override var width: Number = definedExternally
    override var height: Number = definedExternally
    override var displayWidth: Number = definedExternally
    override var displayHeight: Number = definedExternally
    override fun setSize(width: Number, height: Number): Container /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Container /* this */ = definedExternally
    override var depth: Number = definedExternally
    override fun setDepth(value: Number): Container /* this */ = definedExternally
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): Container /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): Container /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Container /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override var scrollFactorX: Number = definedExternally
    override var scrollFactorY: Number = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Container /* this */ = definedExternally
    override var x: Number = definedExternally
    override var y: Number = definedExternally
    override var z: Number = definedExternally
    override var w: Number = definedExternally
    override var scaleX: Number = definedExternally
    override var scaleY: Number = definedExternally
    override var angle: Number = definedExternally
    override var rotation: Number = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Container /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Container /* this */ = definedExternally
    override fun setRotation(radians: Number?): Container /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Container /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Container /* this */ = definedExternally
    override fun setX(value: Number?): Container /* this */ = definedExternally
    override fun setY(value: Number?): Container /* this */ = definedExternally
    override fun setZ(value: Number?): Container /* this */ = definedExternally
    override fun setW(value: Number?): Container /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override var visible: Boolean = definedExternally
    override fun setVisible(value: Boolean): Container /* this */ = definedExternally
    open fun pointToContainer(source: Any?): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
    open fun pointToContainer(source: Phaser.Math.Vector2): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
    open fun pointToContainer(source: Phaser.Geom.Point): dynamic /* Any? | Phaser.Math.Vector2 | Phaser.Geom.Point */ = definedExternally
}
open external class DisplayList(scene: Phaser.Scene) : Phaser.Structs.List<GameObject> {
    open var sortChildrenFlag: Boolean = definedExternally
    open var scene: Phaser.Scene = definedExternally
    open var systems: Phaser.Scenes.Systems = definedExternally
    open fun queueDepthSort(): Unit = definedExternally
    open fun depthSort(): Unit = definedExternally
    open fun sortByDepth(childA: GameObject, childB: GameObject): Number = definedExternally
    open fun sortGameObjects(gameObjects: Array<GameObject>): Array<Any> = definedExternally
    open fun getTopGameObject(gameObjects: Array<GameObject>): GameObject = definedExternally
    open fun getChildren(): Array<GameObject> = definedExternally
}
open external class DOMElement : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.ComputedSize, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
    constructor(scene: Phaser.Scene, x: Number, y: Number, element: String? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, x: Number, y: Number, element: HTMLElement? = definedExternally /* null */)

    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* String | Phaser.BlendModes */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override var depth: Number
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override var visible: Boolean
    open fun willRender(): Boolean = definedExternally
    override fun clearAlpha(): DOMElement /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): DOMElement /* this */ = definedExternally
    override fun setBlendMode(value: String): DOMElement /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): DOMElement /* this */ = definedExternally
    override fun setSize(width: Number, height: Number): DOMElement /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): DOMElement /* this */ = definedExternally
    override fun setDepth(value: Number): DOMElement /* this */ = definedExternally
    override fun setOrigin(x: Number?, y: Number?): DOMElement /* this */ = definedExternally
    override fun setOriginFromFrame(): DOMElement /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): DOMElement /* this */ = definedExternally
    override fun updateDisplayOrigin(): DOMElement /* this */ = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): DOMElement /* this */ = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): DOMElement /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): DOMElement /* this */ = definedExternally
    override fun setRotation(radians: Number?): DOMElement /* this */ = definedExternally
    override fun setAngle(degrees: Number?): DOMElement /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): DOMElement /* this */ = definedExternally
    override fun setX(value: Number?): DOMElement /* this */ = definedExternally
    override fun setY(value: Number?): DOMElement /* this */ = definedExternally
    override fun setZ(value: Number?): DOMElement /* this */ = definedExternally
    override fun setW(value: Number?): DOMElement /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun setVisible(value: Boolean): DOMElement /* this */ = definedExternally
}
open external class GameObject(scene: Phaser.Scene, type: String) : Phaser.Events.EventEmitter {
    open var scene: Phaser.Scene = definedExternally
    open var type: String = definedExternally
    open var parentContainer: Container = definedExternally
    open var name: String = definedExternally
    open var active: Boolean = definedExternally
    open var tabIndex: Number = definedExternally
    open var data: Phaser.Data.DataManager = definedExternally
    open var renderFlags: Number = definedExternally
    open var cameraFilter: Number = definedExternally
    open var input: Phaser.Input.InteractiveObject = definedExternally
    open var body: dynamic /* Any? | Phaser.Physics.Arcade.Body | Phaser.Physics.Impact.Body */ = definedExternally
    open var ignoreDestroy: Boolean = definedExternally
    open fun setActive(value: Boolean): GameObject /* this */ = definedExternally
    open fun setName(value: String): GameObject /* this */ = definedExternally
    open fun setDataEnabled(): GameObject /* this */ = definedExternally
    open fun setData(key: String, data: Any): GameObject /* this */ = definedExternally
    open fun setData(key: Any?, data: Any): GameObject /* this */ = definedExternally
    open fun getData(key: String): Any = definedExternally
    open fun getData(key: Array<String>): Any = definedExternally
    open fun <O: GameObject, U: Any> setInteractive(shape: O? = definedExternally /* null */, callback: ((rect: U, x: Number, y: Number) -> Boolean) = definedExternally /* null */, dropZone: Boolean? = definedExternally /* null */): GameObject /* this */ = definedExternally
    open fun setInteractive(shape: Phaser.Input.InputConfiguration? = definedExternally /* null */, callback: ((hitArea: Any, x: Number, y: Number, gameObject: GameObject) -> Unit)? = definedExternally /* null */, dropZone: Boolean? = definedExternally /* null */): GameObject /* this */ = definedExternally
    open fun setInteractive(shape: Any? = definedExternally /* null */, callback: ((hitArea: Any, x: Number, y: Number, gameObject: GameObject) -> Unit)? = definedExternally /* null */, dropZone: Boolean? = definedExternally /* null */): GameObject /* this */ = definedExternally
    open fun disableInteractive(): GameObject /* this */ = definedExternally
    open fun removeInteractive(): GameObject /* this */ = definedExternally
    open fun update(vararg args: Any): Unit = definedExternally
    open fun toJSON(): JSONGameObject = definedExternally
    open fun willRender(camera: Phaser.Cameras.Scene2D.Camera): Boolean = definedExternally
    open fun getIndexList(): Array<Number> = definedExternally
    open fun destroy(fromScene: Boolean? = definedExternally /* null */): Unit = definedExternally
    companion object {
        var RENDER_MASK: Number = definedExternally
    }
    open fun setInteractive(): GameObject /* this */ = definedExternally
}
external interface `T$4` {
    var font: String? get() = definedExternally; set(value) = definedExternally
    var text: String? get() = definedExternally; set(value) = definedExternally
    var size: dynamic /* Number | Boolean */ get() = definedExternally; set(value) = definedExternally
}
external interface `T$5` {
    var key: String? get() = definedExternally; set(value) = definedExternally
    var frame: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
}
open external class GameObjectCreator(scene: Phaser.Scene) {
    open fun dynamicBitmapText(config: GameObjectConfig /* GameObjectConfig & `T$4` */, addToScene: Boolean? = definedExternally /* null */): DynamicBitmapText = definedExternally
    open fun bitmapText(config: GameObjectConfig /* GameObjectConfig & `T$4` */, addToScene: Boolean? = definedExternally /* null */): BitmapText = definedExternally
    open fun blitter(config: Any, addToScene: Boolean? = definedExternally /* null */): Blitter = definedExternally
    open fun container(config: Any, addToScene: Boolean? = definedExternally /* null */): Container = definedExternally
    open var scene: Phaser.Scene = definedExternally
    open var systems: Phaser.Scenes.Systems = definedExternally
    open var displayList: DisplayList = definedExternally
    open fun graphics(config: Any, addToScene: Boolean? = definedExternally /* null */): Graphics = definedExternally
    open fun group(config: GroupConfig): Group = definedExternally
    open fun image(config: Any, addToScene: Boolean? = definedExternally /* null */): Image = definedExternally
    open fun mesh(config: Any, addToScene: Boolean? = definedExternally /* null */): Mesh = definedExternally
    open fun particles(config: Any, addToScene: Boolean? = definedExternally /* null */): Phaser.GameObjects.Particles.ParticleEmitterManager = definedExternally
    open fun quad(config: Any, addToScene: Boolean? = definedExternally /* null */): Quad = definedExternally
    open fun renderTexture(config: RenderTextureConfig, addToScene: Boolean? = definedExternally /* null */): RenderTexture = definedExternally
    open fun sprite(config: GameObjectConfig /* GameObjectConfig & `T$5` */, addToScene: Boolean? = definedExternally /* null */): Sprite = definedExternally
    open fun text(config: Any, addToScene: Boolean? = definedExternally /* null */): Text = definedExternally
    open fun tileSprite(config: TileSprite, addToScene: Boolean? = definedExternally /* null */): TileSprite = definedExternally
    open fun zone(config: Any): Zone = definedExternally
    open fun tilemap(config: TilemapConfig? = definedExternally /* null */): Phaser.Tilemaps.Tilemap = definedExternally
    open fun tween(config: Any): Phaser.Tweens.Tween = definedExternally
}
external interface `T$6` {
    var x: Number? get() = definedExternally; set(value) = definedExternally
    var y: Number? get() = definedExternally; set(value) = definedExternally
}
open external class GameObjectFactory(scene: Phaser.Scene) {
    open fun path(x: Number, y: Number): Phaser.Curves.Path = definedExternally
    open fun dynamicBitmapText(x: Number, y: Number, font: String, text: String? = definedExternally /* null */, size: Number? = definedExternally /* null */): DynamicBitmapText = definedExternally
    open fun dynamicBitmapText(x: Number, y: Number, font: String, text: Array<String>? = definedExternally /* null */, size: Number? = definedExternally /* null */): DynamicBitmapText = definedExternally
    open fun bitmapText(x: Number, y: Number, font: String, text: String? = definedExternally /* null */, size: Number? = definedExternally /* null */, align: Number? = definedExternally /* null */): BitmapText = definedExternally
    open fun bitmapText(x: Number, y: Number, font: String, text: Array<String>? = definedExternally /* null */, size: Number? = definedExternally /* null */, align: Number? = definedExternally /* null */): BitmapText = definedExternally
    open fun blitter(x: Number, y: Number, key: String, frame: String? = definedExternally /* null */): Blitter = definedExternally
    open fun blitter(x: Number, y: Number, key: String, frame: Number? = definedExternally /* null */): Blitter = definedExternally
    open fun container(x: Number, y: Number, children: GameObject? = definedExternally /* null */): Container = definedExternally
    open fun container(x: Number, y: Number, children: Array<GameObject>? = definedExternally /* null */): Container = definedExternally
    open fun dom(x: Number, y: Number, element: String): DOMElement = definedExternally
    open var scene: Phaser.Scene = definedExternally
    open var systems: Phaser.Scenes.Systems = definedExternally
    open var displayList: DisplayList = definedExternally
    open fun existing(child: GameObject): GameObject = definedExternally
    open fun graphics(config: GraphicsStyles? /* GraphicsStyles & `T$6` */ = definedExternally /* null */): Graphics = definedExternally
    open fun group(children: Array<GameObject>? = definedExternally /* null */, config: GroupConfig? = definedExternally /* null */): Group = definedExternally
    open fun group(children: GroupConfig? = definedExternally /* null */, config: GroupConfig? = definedExternally /* null */): Group = definedExternally
    open fun group(children: Array<GroupConfig>? = definedExternally /* null */, config: GroupConfig? = definedExternally /* null */): Group = definedExternally
    open fun image(x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */): Image = definedExternally
    open fun image(x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */): Image = definedExternally
    open fun mesh(x: Number, y: Number, vertices: Array<Number>, uv: Array<Number>, colors: Array<Number>, alphas: Array<Number>, texture: String, frame: String? = definedExternally /* null */): Mesh = definedExternally
    open fun mesh(x: Number, y: Number, vertices: Array<Number>, uv: Array<Number>, colors: Array<Number>, alphas: Array<Number>, texture: String, frame: Number? = definedExternally /* null */): Mesh = definedExternally
    open fun particles(texture: String, frame: String? = definedExternally /* null */, emitters: ParticleEmitterConfig? = definedExternally /* null */): Phaser.GameObjects.Particles.ParticleEmitterManager = definedExternally
    open fun particles(texture: String, frame: String? = definedExternally /* null */, emitters: Array<ParticleEmitterConfig>? = definedExternally /* null */): Phaser.GameObjects.Particles.ParticleEmitterManager = definedExternally
    open fun particles(texture: String, frame: Number? = definedExternally /* null */, emitters: ParticleEmitterConfig? = definedExternally /* null */): Phaser.GameObjects.Particles.ParticleEmitterManager = definedExternally
    open fun particles(texture: String, frame: Number? = definedExternally /* null */, emitters: Array<ParticleEmitterConfig>? = definedExternally /* null */): Phaser.GameObjects.Particles.ParticleEmitterManager = definedExternally
    open fun particles(texture: String, frame: Any? = definedExternally /* null */, emitters: ParticleEmitterConfig? = definedExternally /* null */): Phaser.GameObjects.Particles.ParticleEmitterManager = definedExternally
    open fun particles(texture: String, frame: Any? = definedExternally /* null */, emitters: Array<ParticleEmitterConfig>? = definedExternally /* null */): Phaser.GameObjects.Particles.ParticleEmitterManager = definedExternally
    open fun follower(path: Phaser.Curves.Path, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */): PathFollower = definedExternally
    open fun follower(path: Phaser.Curves.Path, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */): PathFollower = definedExternally
    open fun quad(x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */): Quad = definedExternally
    open fun quad(x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */): Quad = definedExternally
    open fun renderTexture(x: Number, y: Number, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): RenderTexture = definedExternally
    open fun arc(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, radius: Number? = definedExternally /* null */, startAngle: Number? = definedExternally /* null */, endAngle: Number? = definedExternally /* null */, anticlockwise: Boolean? = definedExternally /* null */, fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */): Arc = definedExternally
    open fun circle(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, radius: Number? = definedExternally /* null */, fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */): Arc = definedExternally
    open fun curve(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, curve: Phaser.Curves.Curve? = definedExternally /* null */, fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */): Curve = definedExternally
    open fun ellipse(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */): Ellipse = definedExternally
    open fun grid(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, cellWidth: Number? = definedExternally /* null */, cellHeight: Number? = definedExternally /* null */, fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */, outlineFillColor: Number? = definedExternally /* null */, outlineFillAlpha: Number? = definedExternally /* null */): Grid = definedExternally
    open fun isobox(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, size: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, fillTop: Number? = definedExternally /* null */, fillLeft: Number? = definedExternally /* null */, fillRight: Number? = definedExternally /* null */): IsoBox = definedExternally
    open fun isotriangle(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, size: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, reversed: Boolean? = definedExternally /* null */, fillTop: Number? = definedExternally /* null */, fillLeft: Number? = definedExternally /* null */, fillRight: Number? = definedExternally /* null */): IsoTriangle = definedExternally
    open fun line(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, x1: Number? = definedExternally /* null */, y1: Number? = definedExternally /* null */, x2: Number? = definedExternally /* null */, y2: Number? = definedExternally /* null */, strokeColor: Number? = definedExternally /* null */, strokeAlpha: Number? = definedExternally /* null */): Line = definedExternally
    open fun polygon(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, points: Any? = definedExternally /* null */, fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */): Polygon = definedExternally
    open fun rectangle(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */): Rectangle = definedExternally
    open fun star(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, points: Number? = definedExternally /* null */, innerRadius: Number? = definedExternally /* null */, outerRadius: Number? = definedExternally /* null */, fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */): Star = definedExternally
    open fun triangle(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, x1: Number? = definedExternally /* null */, y1: Number? = definedExternally /* null */, x2: Number? = definedExternally /* null */, y2: Number? = definedExternally /* null */, x3: Number? = definedExternally /* null */, y3: Number? = definedExternally /* null */, fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */): Triangle = definedExternally
    open fun sprite(x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */): Sprite = definedExternally
    open fun sprite(x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */): Sprite = definedExternally
    open fun text(x: Number, y: Number, text: String, style: Any? = definedExternally /* null */): Text = definedExternally
    open fun text(x: Number, y: Number, text: Array<String>, style: Any? = definedExternally /* null */): Text = definedExternally
    open fun tileSprite(x: Number, y: Number, width: Number, height: Number, texture: String, frame: String? = definedExternally /* null */): TileSprite = definedExternally
    open fun tileSprite(x: Number, y: Number, width: Number, height: Number, texture: String, frame: Number? = definedExternally /* null */): TileSprite = definedExternally
    open fun zone(x: Number, y: Number, width: Number, height: Number): Zone = definedExternally
    open fun tilemap(key: String? = definedExternally /* null */, tileWidth: Number? = definedExternally /* null */, tileHeight: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, data: Array<Array<Number>>? = definedExternally /* null */, insertNull: Boolean? = definedExternally /* null */): Phaser.Tilemaps.Tilemap = definedExternally
    open fun tween(config: Any): Phaser.Tweens.Tween = definedExternally
    open fun dynamicBitmapText(x: Number, y: Number, font: String): DynamicBitmapText = definedExternally
    open fun bitmapText(x: Number, y: Number, font: String): BitmapText = definedExternally
    open fun blitter(x: Number, y: Number, key: String): Blitter = definedExternally
    open fun container(x: Number, y: Number): Container = definedExternally
    open fun group(): Group = definedExternally
    open fun image(x: Number, y: Number, texture: String): Image = definedExternally
    open fun mesh(x: Number, y: Number, vertices: Array<Number>, uv: Array<Number>, colors: Array<Number>, alphas: Array<Number>, texture: String): Mesh = definedExternally
    open fun particles(texture: String): Phaser.GameObjects.Particles.ParticleEmitterManager = definedExternally
    open fun follower(path: Phaser.Curves.Path, x: Number, y: Number, texture: String): PathFollower = definedExternally
    open fun quad(x: Number, y: Number, texture: String): Quad = definedExternally
    open fun sprite(x: Number, y: Number, texture: String): Sprite = definedExternally
    open fun tileSprite(x: Number, y: Number, width: Number, height: Number, texture: String): TileSprite = definedExternally
}
open external class Graphics(scene: Phaser.Scene, options: GraphicsStyles? /* GraphicsStyles & `T$6` */ = definedExternally /* null */) : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Mask, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible, Phaser.GameObjects.Components.ScrollFactor {
    open var displayOriginX: Number = definedExternally
    open var displayOriginY: Number = definedExternally
    open var commandBuffer: Array<Any> = definedExternally
    open var defaultFillColor: Number = definedExternally
    open var defaultFillAlpha: Number = definedExternally
    open var defaultStrokeWidth: Number = definedExternally
    open var defaultStrokeColor: Number = definedExternally
    open var defaultStrokeAlpha: Number = definedExternally
    open fun setDefaultStyles(options: GraphicsStyles): Graphics = definedExternally
    open fun lineStyle(lineWidth: Number, color: Number, alpha: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun fillStyle(color: Number, alpha: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun fillGradientStyle(topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number, alpha: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun lineGradientStyle(lineWidth: Number, topLeft: Number, topRight: Number, bottomLeft: Number, bottomRight: Number, alpha: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun setTexture(key: String? = definedExternally /* null */, frame: String? = definedExternally /* null */, mode: Number? = definedExternally /* null */): Graphics /* this */ = definedExternally
    open fun setTexture(key: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */, mode: Number? = definedExternally /* null */): Graphics /* this */ = definedExternally
    open fun beginPath(): Graphics = definedExternally
    open fun closePath(): Graphics = definedExternally
    open fun fillPath(): Graphics = definedExternally
    open fun strokePath(): Graphics = definedExternally
    open fun fillCircleShape(circle: Phaser.Geom.Circle): Graphics = definedExternally
    open fun strokeCircleShape(circle: Phaser.Geom.Circle): Graphics = definedExternally
    open fun fillCircle(x: Number, y: Number, radius: Number): Graphics = definedExternally
    open fun strokeCircle(x: Number, y: Number, radius: Number): Graphics = definedExternally
    open fun fillRectShape(rect: Phaser.Geom.Rectangle): Graphics = definedExternally
    open fun strokeRectShape(rect: Phaser.Geom.Rectangle): Graphics = definedExternally
    open fun fillRect(x: Number, y: Number, width: Number, height: Number): Graphics = definedExternally
    open fun strokeRect(x: Number, y: Number, width: Number, height: Number): Graphics = definedExternally
    open fun fillRoundedRect(x: Number, y: Number, width: Number, height: Number, radius: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun strokeRoundedRect(x: Number, y: Number, width: Number, height: Number, radius: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun fillPointShape(point: Any?, size: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun fillPointShape(point: Phaser.Math.Vector2, size: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun fillPointShape(point: Phaser.Geom.Point, size: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun fillPoint(x: Number, y: Number, size: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun fillTriangleShape(triangle: Phaser.Geom.Triangle): Graphics = definedExternally
    open fun strokeTriangleShape(triangle: Phaser.Geom.Triangle): Graphics = definedExternally
    open fun fillTriangle(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number): Graphics = definedExternally
    open fun strokeTriangle(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number): Graphics = definedExternally
    open fun strokeLineShape(line: Phaser.Geom.Line): Graphics = definedExternally
    open fun lineBetween(x1: Number, y1: Number, x2: Number, y2: Number): Graphics = definedExternally
    open fun lineTo(x: Number, y: Number): Graphics = definedExternally
    open fun moveTo(x: Number, y: Number): Graphics = definedExternally
    open fun lineFxTo(x: Number, y: Number, width: Number, rgb: Number): Graphics = definedExternally
    open fun moveFxTo(x: Number, y: Number, width: Number, rgb: Number): Graphics = definedExternally
    open fun strokePoints(points: Array<Any>, autoClose: Boolean? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun strokePoints(points: Array<Phaser.Geom.Point>, autoClose: Boolean? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun fillPoints(points: Array<Any>, autoClose: Boolean? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun fillPoints(points: Array<Phaser.Geom.Point>, autoClose: Boolean? = definedExternally /* null */, endIndex: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun strokeEllipseShape(ellipse: Phaser.Geom.Ellipse, smoothness: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun strokeEllipse(x: Number, y: Number, width: Number, height: Number, smoothness: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun fillEllipseShape(ellipse: Phaser.Geom.Ellipse, smoothness: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun fillEllipse(x: Number, y: Number, width: Number, height: Number, smoothness: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun arc(x: Number, y: Number, radius: Number, startAngle: Number, endAngle: Number, anticlockwise: Boolean? = definedExternally /* null */, overshoot: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun slice(x: Number, y: Number, radius: Number, startAngle: Number, endAngle: Number, anticlockwise: Boolean? = definedExternally /* null */, overshoot: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun save(): Graphics = definedExternally
    open fun restore(): Graphics = definedExternally
    open fun translate(x: Number, y: Number): Graphics = definedExternally
    open fun scale(x: Number, y: Number): Graphics = definedExternally
    open fun rotate(radians: Number): Graphics = definedExternally
    open fun clear(): Graphics = definedExternally
    open fun generateTexture(key: String, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun generateTexture(key: HTMLCanvasElement, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): Graphics = definedExternally
    open fun preDestroy(): Unit = definedExternally
    override fun clearAlpha(): Graphics /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Graphics /* this */ = definedExternally
    override var alpha: Number = definedExternally
    override var alphaTopLeft: Number = definedExternally
    override var alphaTopRight: Number = definedExternally
    override var alphaBottomLeft: Number = definedExternally
    override var alphaBottomRight: Number = definedExternally
    override var blendMode: dynamic /* String | Phaser.BlendModes */ = definedExternally
    override fun setBlendMode(value: String): Graphics /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): Graphics /* this */ = definedExternally
    override var depth: Number = definedExternally
    override fun setDepth(value: Number): Graphics /* this */ = definedExternally
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): Graphics /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): Graphics /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Graphics /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): Graphics /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override var x: Number = definedExternally
    override var y: Number = definedExternally
    override var z: Number = definedExternally
    override var w: Number = definedExternally
    override var scaleX: Number = definedExternally
    override var scaleY: Number = definedExternally
    override var angle: Number = definedExternally
    override var rotation: Number = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Graphics /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Graphics /* this */ = definedExternally
    override fun setRotation(radians: Number?): Graphics /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Graphics /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Graphics /* this */ = definedExternally
    override fun setX(value: Number?): Graphics /* this */ = definedExternally
    override fun setY(value: Number?): Graphics /* this */ = definedExternally
    override fun setZ(value: Number?): Graphics /* this */ = definedExternally
    override fun setW(value: Number?): Graphics /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override var visible: Boolean = definedExternally
    override fun setVisible(value: Boolean): Graphics /* this */ = definedExternally
    override var scrollFactorX: Number = definedExternally
    override var scrollFactorY: Number = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Graphics /* this */ = definedExternally
    companion object {
        var TargetCamera: Phaser.Cameras.Scene2D.Camera = definedExternally
    }
    open fun setTexture(): Graphics /* this */ = definedExternally
}
open external class Group {
    constructor(scene: Phaser.Scene, children: Array<GameObject>? = definedExternally /* null */, config: GroupConfig? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, children: Array<GameObject>? = definedExternally /* null */, config: GroupCreateConfig? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, children: GroupConfig? = definedExternally /* null */, config: GroupConfig? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, children: GroupConfig? = definedExternally /* null */, config: GroupCreateConfig? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, children: GroupCreateConfig? = definedExternally /* null */, config: GroupConfig? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, children: GroupCreateConfig? = definedExternally /* null */, config: GroupCreateConfig? = definedExternally /* null */)

    open var scene: Phaser.Scene
    open var children: Phaser.Structs.Set<GameObject>
    open var isParent: Boolean
    open var classType: Any
    open var active: Boolean
    open var maxSize: Number
    open var defaultKey: String
    open var defaultFrame: dynamic /* String | Number */
    open var runChildUpdate: Boolean
    open var createCallback: (item: GameObject) -> Unit
    open var removeCallback: (item: GameObject) -> Unit
    open var createMultipleCallback: (items: Array<GameObject>) -> Unit
    open fun create(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */, active: Boolean? = definedExternally /* null */): Any = definedExternally
    open fun create(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */, active: Boolean? = definedExternally /* null */): Any = definedExternally
    open fun createMultiple(config: GroupCreateConfig): Array<Any> = definedExternally
    open fun createMultiple(config: Array<GroupCreateConfig>): Array<Any> = definedExternally
    open fun createFromConfig(options: GroupCreateConfig): Array<Any> = definedExternally
    open fun preUpdate(time: Number, delta: Number): Unit = definedExternally
    open fun add(child: GameObject, addToScene: Boolean? = definedExternally /* null */): Group = definedExternally
    open fun addMultiple(children: Array<GameObject>, addToScene: Boolean? = definedExternally /* null */): Group = definedExternally
    open fun remove(child: GameObject, removeFromScene: Boolean? = definedExternally /* null */, destroyChild: Boolean? = definedExternally /* null */): Group = definedExternally
    open fun clear(removeFromScene: Boolean? = definedExternally /* null */, destroyChild: Boolean? = definedExternally /* null */): Group = definedExternally
    open fun contains(child: GameObject): Boolean = definedExternally
    open fun getChildren(): Array<GameObject> = definedExternally
    open fun getLength(): Number = definedExternally
    open fun getFirst(state: Boolean? = definedExternally /* null */, createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Any = definedExternally
    open fun getFirst(state: Boolean? = definedExternally /* null */, createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Any = definedExternally
    open fun getFirstNth(nth: Number, state: Boolean? = definedExternally /* null */, createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Any = definedExternally
    open fun getFirstNth(nth: Number, state: Boolean? = definedExternally /* null */, createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Any = definedExternally
    open fun getLast(state: Boolean? = definedExternally /* null */, createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Any = definedExternally
    open fun getLast(state: Boolean? = definedExternally /* null */, createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Any = definedExternally
    open fun getLastNth(nth: Number, state: Boolean? = definedExternally /* null */, createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Any = definedExternally
    open fun getLastNth(nth: Number, state: Boolean? = definedExternally /* null */, createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Any = definedExternally
    open fun get(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Any = definedExternally
    open fun get(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Any = definedExternally
    open fun getFirstAlive(createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Any = definedExternally
    open fun getFirstAlive(createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Any = definedExternally
    open fun getFirstDead(createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: String? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Any = definedExternally
    open fun getFirstDead(createIfNull: Boolean? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, key: String? = definedExternally /* null */, frame: Number? = definedExternally /* null */, visible: Boolean? = definedExternally /* null */): Any = definedExternally
    open fun playAnimation(key: String, startFrame: String? = definedExternally /* null */): Group = definedExternally
    open fun isFull(): Boolean = definedExternally
    open fun countActive(value: Boolean? = definedExternally /* null */): Number = definedExternally
    open fun getTotalUsed(): Number = definedExternally
    open fun getTotalFree(): Number = definedExternally
    open fun setDepth(value: Number, step: Number): Group = definedExternally
    open fun kill(gameObject: GameObject): Unit = definedExternally
    open fun killAndHide(gameObject: GameObject): Unit = definedExternally
    open fun toggleVisible(): Group = definedExternally
    open fun destroy(destroyChildren: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun create(): Any = definedExternally
    open fun getFirst(): Any = definedExternally
    open fun getFirstNth(nth: Number): Any = definedExternally
    open fun getLast(): Any = definedExternally
    open fun getLastNth(nth: Number): Any = definedExternally
    open fun get(): Any = definedExternally
    open fun getFirstAlive(): Any = definedExternally
    open fun getFirstDead(): Any = definedExternally
}
open external class Image : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Mask, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Size, Phaser.GameObjects.Components.TextureCrop, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
    constructor(scene: Phaser.Scene, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */)

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
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
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
    override fun setCrop(): Image /* this */ = definedExternally
    override fun setTexture(key: String): Image /* this */ = definedExternally
}
open external class Light(x: Number, y: Number, radius: Number, r: Number, g: Number, b: Number, intensity: Number) {
    open var x: Number = definedExternally
    open var y: Number = definedExternally
    open var radius: Number = definedExternally
    open var r: Number = definedExternally
    open var g: Number = definedExternally
    open var b: Number = definedExternally
    open var intensity: Number = definedExternally
    open var scrollFactorX: Number = definedExternally
    open var scrollFactorY: Number = definedExternally
    open fun set(x: Number, y: Number, radius: Number, r: Number, g: Number, b: Number, intensity: Number): Light = definedExternally
    open fun setScrollFactor(x: Number, y: Number): Light = definedExternally
    open fun setColor(rgb: Number): Light = definedExternally
    open fun setIntensity(intensity: Number): Light = definedExternally
    open fun setPosition(x: Number, y: Number): Light = definedExternally
    open fun setRadius(radius: Number): Light = definedExternally
}
open external class LightsManager {
    open var lightPool: Array<Light> = definedExternally
    open var lights: Array<Light> = definedExternally
    open var culledLights: Array<Light> = definedExternally
    open var ambientColor: Any = definedExternally
    open var active: Boolean = definedExternally
    open fun enable(): LightsManager = definedExternally
    open fun disable(): LightsManager = definedExternally
    open fun cull(camera: Phaser.Cameras.Scene2D.Camera): Array<Light> = definedExternally
    open fun forEachLight(callback: (light: Light) -> Unit): LightsManager = definedExternally
    open fun setAmbientColor(rgb: Number): LightsManager = definedExternally
    open fun getMaxVisibleLights(): Number = definedExternally
    open fun getLightCount(): Number = definedExternally
    open fun addLight(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, radius: Number? = definedExternally /* null */, rgb: Number? = definedExternally /* null */, intensity: Number? = definedExternally /* null */): Light = definedExternally
    open fun removeLight(light: Light): LightsManager = definedExternally
    open fun shutdown(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
open external class LightsPlugin(scene: Phaser.Scene) : LightsManager {
    open var scene: Phaser.Scene = definedExternally
    open var systems: Phaser.Scenes.Systems = definedExternally
    open fun boot(): Unit = definedExternally
    override fun destroy(): Unit = definedExternally
}
open external class Mesh : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Mask, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.Size, Phaser.GameObjects.Components.Texture, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible, Phaser.GameObjects.Components.ScrollFactor {
    constructor(scene: Phaser.Scene, x: Number, y: Number, vertices: Array<Number>, uv: Array<Number>, colors: Array<Number>, alphas: Array<Number>, texture: String, frame: String? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, x: Number, y: Number, vertices: Array<Number>, uv: Array<Number>, colors: Array<Number>, alphas: Array<Number>, texture: String, frame: Number? = definedExternally /* null */)

    open var vertices: Float32Array
    open var uv: Float32Array
    open var colors: Uint32Array
    open var alphas: Float32Array
    open var tintFill: Boolean
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
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Phaser.Textures.Frame
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override var visible: Boolean
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override fun clearAlpha(): Mesh /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Mesh /* this */ = definedExternally
    override fun setBlendMode(value: String): Mesh /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): Mesh /* this */ = definedExternally
    override fun setDepth(value: Number): Mesh /* this */ = definedExternally
    override fun toggleFlipX(): Mesh /* this */ = definedExternally
    override fun toggleFlipY(): Mesh /* this */ = definedExternally
    override fun setFlipX(value: Boolean): Mesh /* this */ = definedExternally
    override fun setFlipY(value: Boolean): Mesh /* this */ = definedExternally
    override fun setFlip(x: Boolean, y: Boolean): Mesh /* this */ = definedExternally
    override fun resetFlip(): Mesh /* this */ = definedExternally
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
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): Mesh /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): Mesh /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Mesh /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override fun setOrigin(x: Number?, y: Number?): Mesh /* this */ = definedExternally
    override fun setOriginFromFrame(): Mesh /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): Mesh /* this */ = definedExternally
    override fun updateDisplayOrigin(): Mesh /* this */ = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): Mesh /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): Mesh /* this */ = definedExternally
    override fun setSizeToFrame(frame: Phaser.Textures.Frame): Mesh /* this */ = definedExternally
    override fun setSize(width: Number, height: Number): Mesh /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Mesh /* this */ = definedExternally
    override fun setTexture(key: String, frame: String?): Mesh /* this */ = definedExternally
    override fun setTexture(key: String, frame: Number?): Mesh /* this */ = definedExternally
    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): Mesh /* this */ = definedExternally
    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): Mesh /* this */ = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Mesh /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Mesh /* this */ = definedExternally
    override fun setRotation(radians: Number?): Mesh /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Mesh /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Mesh /* this */ = definedExternally
    override fun setX(value: Number?): Mesh /* this */ = definedExternally
    override fun setY(value: Number?): Mesh /* this */ = definedExternally
    override fun setZ(value: Number?): Mesh /* this */ = definedExternally
    override fun setW(value: Number?): Mesh /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun setVisible(value: Boolean): Mesh /* this */ = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Mesh /* this */ = definedExternally
    override fun setTexture(key: String): Mesh /* this */ = definedExternally
}
open external class PathFollower : Sprite {
    constructor(scene: Phaser.Scene, path: Phaser.Curves.Path, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, path: Phaser.Curves.Path, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */)

    open var path: Phaser.Curves.Path
    open var rotateToPath: Boolean
    open var pathRotationVerticalAdjust: Boolean
    open var pathRotationOffset: Number
    open var pathOffset: Phaser.Math.Vector2
    open var pathVector: Phaser.Math.Vector2
    open var pathTween: Phaser.Tweens.Tween
    open var pathConfig: PathConfig
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
    open fun setPath(path: Phaser.Curves.Path, config: PathConfig? = definedExternally /* null */): PathFollower = definedExternally
    open fun setRotateToPath(value: Boolean, offset: Number? = definedExternally /* null */, verticalAdjust: Boolean? = definedExternally /* null */): PathFollower = definedExternally
    open fun isFollowing(): Boolean = definedExternally
    open fun startFollow(config: Number? = definedExternally /* null */, startAt: Number? = definedExternally /* null */): PathFollower = definedExternally
    open fun startFollow(config: PathConfig? = definedExternally /* null */, startAt: Number? = definedExternally /* null */): PathFollower = definedExternally
    open fun pauseFollow(): PathFollower = definedExternally
    open fun resumeFollow(): PathFollower = definedExternally
    open fun stopFollow(): PathFollower = definedExternally
    override fun preUpdate(time: Number, delta: Number): Unit = definedExternally
    override fun clearAlpha(): PathFollower /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): PathFollower /* this */ = definedExternally
    override fun setBlendMode(value: String): PathFollower /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): PathFollower /* this */ = definedExternally
    override fun setDepth(value: Number): PathFollower /* this */ = definedExternally
    override fun toggleFlipX(): PathFollower /* this */ = definedExternally
    override fun toggleFlipY(): PathFollower /* this */ = definedExternally
    override fun setFlipX(value: Boolean): PathFollower /* this */ = definedExternally
    override fun setFlipY(value: Boolean): PathFollower /* this */ = definedExternally
    override fun setFlip(x: Boolean, y: Boolean): PathFollower /* this */ = definedExternally
    override fun resetFlip(): PathFollower /* this */ = definedExternally
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
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): PathFollower /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): PathFollower /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): PathFollower /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override fun setOrigin(x: Number?, y: Number?): PathFollower /* this */ = definedExternally
    override fun setOriginFromFrame(): PathFollower /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): PathFollower /* this */ = definedExternally
    override fun updateDisplayOrigin(): PathFollower /* this */ = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): PathFollower /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): PathFollower /* this */ = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): PathFollower /* this */ = definedExternally
    override fun setSizeToFrame(frame: Phaser.Textures.Frame): PathFollower /* this */ = definedExternally
    override fun setSize(width: Number, height: Number): PathFollower /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): PathFollower /* this */ = definedExternally
    override fun setCrop(x: Number?, y: Number?, width: Number?, height: Number?): PathFollower /* this */ = definedExternally
    override fun setCrop(x: Phaser.Geom.Rectangle?, y: Number?, width: Number?, height: Number?): PathFollower /* this */ = definedExternally
    override fun setTexture(key: String, frame: String?): PathFollower /* this */ = definedExternally
    override fun setTexture(key: String, frame: Number?): PathFollower /* this */ = definedExternally
    override fun setFrame(frame: String, updateSize: Boolean?, updateOrigin: Boolean?): PathFollower /* this */ = definedExternally
    override fun setFrame(frame: Number, updateSize: Boolean?, updateOrigin: Boolean?): PathFollower /* this */ = definedExternally
    override fun clearTint(): PathFollower /* this */ = definedExternally
    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): PathFollower /* this */ = definedExternally
    override fun setTintFill(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): PathFollower /* this */ = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): PathFollower /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): PathFollower /* this */ = definedExternally
    override fun setRotation(radians: Number?): PathFollower /* this */ = definedExternally
    override fun setAngle(degrees: Number?): PathFollower /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): PathFollower /* this */ = definedExternally
    override fun setX(value: Number?): PathFollower /* this */ = definedExternally
    override fun setY(value: Number?): PathFollower /* this */ = definedExternally
    override fun setZ(value: Number?): PathFollower /* this */ = definedExternally
    override fun setW(value: Number?): PathFollower /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun setVisible(value: Boolean): PathFollower /* this */ = definedExternally
    open fun startFollow(): PathFollower = definedExternally
    override fun setCrop(): PathFollower /* this */ = definedExternally
    override fun setTexture(key: String): PathFollower /* this */ = definedExternally
}
open external class Quad : Mesh {
    constructor(scene: Phaser.Scene, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */)

    open var topLeftX: Number
    open var topLeftY: Number
    open var topRightX: Number
    open var topRightY: Number
    open var bottomLeftX: Number
    open var bottomLeftY: Number
    open var bottomRightX: Number
    open var bottomRightY: Number
    open var topLeftAlpha: Number
    open var topRightAlpha: Number
    open var bottomLeftAlpha: Number
    open var bottomRightAlpha: Number
    open var topLeftColor: Number
    open var topRightColor: Number
    open var bottomLeftColor: Number
    open var bottomRightColor: Number
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
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Phaser.Textures.Frame
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override var visible: Boolean
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    open fun setFrame(frame: String): Quad /* this */ = definedExternally
    open fun setFrame(frame: Number): Quad /* this */ = definedExternally
    open fun setTopLeft(x: Number, y: Number): Quad = definedExternally
    open fun setTopRight(x: Number, y: Number): Quad = definedExternally
    open fun setBottomLeft(x: Number, y: Number): Quad = definedExternally
    open fun setBottomRight(x: Number, y: Number): Quad = definedExternally
    open fun resetPosition(): Quad = definedExternally
    open fun resetAlpha(): Quad = definedExternally
    open fun resetColors(): Quad = definedExternally
    open fun reset(): Quad = definedExternally
    override fun clearAlpha(): Quad /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Quad /* this */ = definedExternally
    override fun setBlendMode(value: String): Quad /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): Quad /* this */ = definedExternally
    override fun setDepth(value: Number): Quad /* this */ = definedExternally
    override fun toggleFlipX(): Quad /* this */ = definedExternally
    override fun toggleFlipY(): Quad /* this */ = definedExternally
    override fun setFlipX(value: Boolean): Quad /* this */ = definedExternally
    override fun setFlipY(value: Boolean): Quad /* this */ = definedExternally
    override fun setFlip(x: Boolean, y: Boolean): Quad /* this */ = definedExternally
    override fun resetFlip(): Quad /* this */ = definedExternally
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
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): Quad /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): Quad /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Quad /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override fun setOrigin(x: Number?, y: Number?): Quad /* this */ = definedExternally
    override fun setOriginFromFrame(): Quad /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): Quad /* this */ = definedExternally
    override fun updateDisplayOrigin(): Quad /* this */ = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): Quad /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): Quad /* this */ = definedExternally
    override fun setSizeToFrame(frame: Phaser.Textures.Frame): Quad /* this */ = definedExternally
    override fun setSize(width: Number, height: Number): Quad /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Quad /* this */ = definedExternally
    override fun setTexture(key: String, frame: String?): Quad /* this */ = definedExternally
    override fun setTexture(key: String, frame: Number?): Quad /* this */ = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Quad /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Quad /* this */ = definedExternally
    override fun setRotation(radians: Number?): Quad /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Quad /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Quad /* this */ = definedExternally
    override fun setX(value: Number?): Quad /* this */ = definedExternally
    override fun setY(value: Number?): Quad /* this */ = definedExternally
    override fun setZ(value: Number?): Quad /* this */ = definedExternally
    override fun setW(value: Number?): Quad /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun setVisible(value: Boolean): Quad /* this */ = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Quad /* this */ = definedExternally
    override fun setTexture(key: String): Quad /* this */ = definedExternally
}
open external class RenderTexture(scene: Phaser.Scene, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */) : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.ComputedSize, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Mask, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */ = definedExternally
    open var textureManager: Phaser.Textures.TextureManager = definedExternally
    open var globalTint: Number = definedExternally
    open var globalAlpha: Number = definedExternally
    open var canvas: HTMLCanvasElement = definedExternally
    open var context: CanvasRenderingContext2D = definedExternally
    open var framebuffer: WebGLFramebuffer = definedExternally
    open var texture: Phaser.Textures.Texture = definedExternally
    open var frame: Phaser.Textures.Frame = definedExternally
    open var camera: Phaser.Cameras.Scene2D.BaseCamera = definedExternally
    open var dirty: Boolean = definedExternally
    open var gl: WebGLRenderingContext = definedExternally
    open fun resize(width: Number, height: Number? = definedExternally /* null */): RenderTexture /* this */ = definedExternally
    open fun setGlobalTint(tint: Number): RenderTexture /* this */ = definedExternally
    open fun setGlobalAlpha(alpha: Number): RenderTexture /* this */ = definedExternally
    open fun saveTexture(key: String): Phaser.Textures.Texture = definedExternally
    open fun fill(rgb: Number, alpha: Number? = definedExternally /* null */): RenderTexture /* this */ = definedExternally
    open fun clear(): RenderTexture /* this */ = definedExternally
    open fun draw(entries: Any, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, alpha: Number? = definedExternally /* null */, tint: Number? = definedExternally /* null */): RenderTexture /* this */ = definedExternally
    open fun drawFrame(key: String, frame: String? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, alpha: Number? = definedExternally /* null */, tint: Number? = definedExternally /* null */): RenderTexture /* this */ = definedExternally
    open fun drawFrame(key: String, frame: Number? = definedExternally /* null */, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, alpha: Number? = definedExternally /* null */, tint: Number? = definedExternally /* null */): RenderTexture /* this */ = definedExternally
    open fun preDestroy(): Unit = definedExternally
    override fun clearAlpha(): RenderTexture /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): RenderTexture /* this */ = definedExternally
    override var alpha: Number = definedExternally
    override var alphaTopLeft: Number = definedExternally
    override var alphaTopRight: Number = definedExternally
    override var alphaBottomLeft: Number = definedExternally
    override var alphaBottomRight: Number = definedExternally
    override var blendMode: dynamic /* String | Phaser.BlendModes */ = definedExternally
    override fun setBlendMode(value: String): RenderTexture /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): RenderTexture /* this */ = definedExternally
    override var width: Number = definedExternally
    override var height: Number = definedExternally
    override var displayWidth: Number = definedExternally
    override var displayHeight: Number = definedExternally
    override fun setSize(width: Number, height: Number): RenderTexture /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): RenderTexture /* this */ = definedExternally
    override var depth: Number = definedExternally
    override fun setDepth(value: Number): RenderTexture /* this */ = definedExternally
    override var flipX: Boolean = definedExternally
    override var flipY: Boolean = definedExternally
    override fun toggleFlipX(): RenderTexture /* this */ = definedExternally
    override fun toggleFlipY(): RenderTexture /* this */ = definedExternally
    override fun setFlipX(value: Boolean): RenderTexture /* this */ = definedExternally
    override fun setFlipY(value: Boolean): RenderTexture /* this */ = definedExternally
    override fun setFlip(x: Boolean, y: Boolean): RenderTexture /* this */ = definedExternally
    override fun resetFlip(): RenderTexture /* this */ = definedExternally
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
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): RenderTexture /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): RenderTexture /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): RenderTexture /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override var originX: Number = definedExternally
    override var originY: Number = definedExternally
    override var displayOriginX: Number = definedExternally
    override var displayOriginY: Number = definedExternally
    override fun setOrigin(x: Number?, y: Number?): RenderTexture /* this */ = definedExternally
    override fun setOriginFromFrame(): RenderTexture /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): RenderTexture /* this */ = definedExternally
    override fun updateDisplayOrigin(): RenderTexture /* this */ = definedExternally
    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): RenderTexture /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override var scaleMode: Phaser.ScaleModes = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): RenderTexture /* this */ = definedExternally
    override var scrollFactorX: Number = definedExternally
    override var scrollFactorY: Number = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): RenderTexture /* this */ = definedExternally
    override var tintFill: Boolean = definedExternally
    override fun clearTint(): RenderTexture /* this */ = definedExternally
    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): RenderTexture /* this */ = definedExternally
    override fun setTintFill(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): RenderTexture /* this */ = definedExternally
    override var tintTopLeft: Number = definedExternally
    override var tintTopRight: Number = definedExternally
    override var tintBottomLeft: Number = definedExternally
    override var tintBottomRight: Number = definedExternally
    override var tint: Number = definedExternally
    override var isTinted: Boolean = definedExternally
    override var x: Number = definedExternally
    override var y: Number = definedExternally
    override var z: Number = definedExternally
    override var w: Number = definedExternally
    override var scaleX: Number = definedExternally
    override var scaleY: Number = definedExternally
    override var angle: Number = definedExternally
    override var rotation: Number = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): RenderTexture /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): RenderTexture /* this */ = definedExternally
    override fun setRotation(radians: Number?): RenderTexture /* this */ = definedExternally
    override fun setAngle(degrees: Number?): RenderTexture /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): RenderTexture /* this */ = definedExternally
    override fun setX(value: Number?): RenderTexture /* this */ = definedExternally
    override fun setY(value: Number?): RenderTexture /* this */ = definedExternally
    override fun setZ(value: Number?): RenderTexture /* this */ = definedExternally
    override fun setW(value: Number?): RenderTexture /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override var visible: Boolean = definedExternally
    override fun setVisible(value: Boolean): RenderTexture /* this */ = definedExternally
    open fun drawFrame(key: String): RenderTexture /* this */ = definedExternally
}
open external class Arc(scene: Phaser.Scene, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, radius: Number? = definedExternally /* null */, startAngle: Number? = definedExternally /* null */, endAngle: Number? = definedExternally /* null */, anticlockwise: Boolean? = definedExternally /* null */, fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */) : Shape {
    open var iterations: Number = definedExternally
    open var radius: Number = definedExternally
    open var startAngle: Number = definedExternally
    open var endAngle: Number = definedExternally
    open var anticlockwise: Boolean = definedExternally
    open fun setRadius(value: Number): Arc /* this */ = definedExternally
    open fun setIterations(value: Number): Arc /* this */ = definedExternally
    open fun setStartAngle(value: Number): Arc /* this */ = definedExternally
    open fun setEndAngle(value: Number): Arc /* this */ = definedExternally
    override fun clearAlpha(): Arc /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Arc /* this */ = definedExternally
    override var alpha: Number = definedExternally
    override var alphaTopLeft: Number = definedExternally
    override var alphaTopRight: Number = definedExternally
    override var alphaBottomLeft: Number = definedExternally
    override var alphaBottomRight: Number = definedExternally
    override var blendMode: dynamic /* String | Phaser.BlendModes */ = definedExternally
    override fun setBlendMode(value: String): Arc /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): Arc /* this */ = definedExternally
    override var width: Number = definedExternally
    override var height: Number = definedExternally
    override var displayWidth: Number = definedExternally
    override var displayHeight: Number = definedExternally
    override fun setSize(width: Number, height: Number): Arc /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Arc /* this */ = definedExternally
    override var depth: Number = definedExternally
    override fun setDepth(value: Number): Arc /* this */ = definedExternally
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
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): Arc /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): Arc /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Arc /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override var originX: Number = definedExternally
    override var originY: Number = definedExternally
    override var displayOriginX: Number = definedExternally
    override var displayOriginY: Number = definedExternally
    override fun setOrigin(x: Number?, y: Number?): Arc /* this */ = definedExternally
    override fun setOriginFromFrame(): Arc /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): Arc /* this */ = definedExternally
    override fun updateDisplayOrigin(): Arc /* this */ = definedExternally
    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): Arc /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override var scaleMode: Phaser.ScaleModes = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): Arc /* this */ = definedExternally
    override var scrollFactorX: Number = definedExternally
    override var scrollFactorY: Number = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Arc /* this */ = definedExternally
    override var x: Number = definedExternally
    override var y: Number = definedExternally
    override var z: Number = definedExternally
    override var w: Number = definedExternally
    override var scaleX: Number = definedExternally
    override var scaleY: Number = definedExternally
    override var angle: Number = definedExternally
    override var rotation: Number = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Arc /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Arc /* this */ = definedExternally
    override fun setRotation(radians: Number?): Arc /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Arc /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Arc /* this */ = definedExternally
    override fun setX(value: Number?): Arc /* this */ = definedExternally
    override fun setY(value: Number?): Arc /* this */ = definedExternally
    override fun setZ(value: Number?): Arc /* this */ = definedExternally
    override fun setW(value: Number?): Arc /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override var visible: Boolean = definedExternally
    override fun setVisible(value: Boolean): Arc /* this */ = definedExternally
}
open external class Curve(scene: Phaser.Scene, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, curve: Phaser.Curves.Curve? = definedExternally /* null */, fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */) : Shape {
    open var smoothness: Number = definedExternally
    open fun setSmoothness(value: Number): Curve /* this */ = definedExternally
    override fun clearAlpha(): Curve /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Curve /* this */ = definedExternally
    override var alpha: Number = definedExternally
    override var alphaTopLeft: Number = definedExternally
    override var alphaTopRight: Number = definedExternally
    override var alphaBottomLeft: Number = definedExternally
    override var alphaBottomRight: Number = definedExternally
    override var blendMode: dynamic /* String | Phaser.BlendModes */ = definedExternally
    override fun setBlendMode(value: String): Curve /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): Curve /* this */ = definedExternally
    override var width: Number = definedExternally
    override var height: Number = definedExternally
    override var displayWidth: Number = definedExternally
    override var displayHeight: Number = definedExternally
    override fun setSize(width: Number, height: Number): Curve /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Curve /* this */ = definedExternally
    override var depth: Number = definedExternally
    override fun setDepth(value: Number): Curve /* this */ = definedExternally
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
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): Curve /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): Curve /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Curve /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override var originX: Number = definedExternally
    override var originY: Number = definedExternally
    override var displayOriginX: Number = definedExternally
    override var displayOriginY: Number = definedExternally
    override fun setOrigin(x: Number?, y: Number?): Curve /* this */ = definedExternally
    override fun setOriginFromFrame(): Curve /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): Curve /* this */ = definedExternally
    override fun updateDisplayOrigin(): Curve /* this */ = definedExternally
    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): Curve /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override var scaleMode: Phaser.ScaleModes = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): Curve /* this */ = definedExternally
    override var scrollFactorX: Number = definedExternally
    override var scrollFactorY: Number = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Curve /* this */ = definedExternally
    override var x: Number = definedExternally
    override var y: Number = definedExternally
    override var z: Number = definedExternally
    override var w: Number = definedExternally
    override var scaleX: Number = definedExternally
    override var scaleY: Number = definedExternally
    override var angle: Number = definedExternally
    override var rotation: Number = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Curve /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Curve /* this */ = definedExternally
    override fun setRotation(radians: Number?): Curve /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Curve /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Curve /* this */ = definedExternally
    override fun setX(value: Number?): Curve /* this */ = definedExternally
    override fun setY(value: Number?): Curve /* this */ = definedExternally
    override fun setZ(value: Number?): Curve /* this */ = definedExternally
    override fun setW(value: Number?): Curve /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override var visible: Boolean = definedExternally
    override fun setVisible(value: Boolean): Curve /* this */ = definedExternally
}
open external class Ellipse(scene: Phaser.Scene, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */) : Shape {
    open var smoothness: Number = definedExternally
    override fun setSize(width: Number, height: Number): Ellipse /* this */ = definedExternally
    open fun setSmoothness(value: Number): Ellipse /* this */ = definedExternally
    override fun clearAlpha(): Ellipse /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Ellipse /* this */ = definedExternally
    override var alpha: Number = definedExternally
    override var alphaTopLeft: Number = definedExternally
    override var alphaTopRight: Number = definedExternally
    override var alphaBottomLeft: Number = definedExternally
    override var alphaBottomRight: Number = definedExternally
    override var blendMode: dynamic /* String | Phaser.BlendModes */ = definedExternally
    override fun setBlendMode(value: String): Ellipse /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): Ellipse /* this */ = definedExternally
    override var width: Number = definedExternally
    override var height: Number = definedExternally
    override var displayWidth: Number = definedExternally
    override var displayHeight: Number = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Ellipse /* this */ = definedExternally
    override var depth: Number = definedExternally
    override fun setDepth(value: Number): Ellipse /* this */ = definedExternally
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
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): Ellipse /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): Ellipse /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Ellipse /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override var originX: Number = definedExternally
    override var originY: Number = definedExternally
    override var displayOriginX: Number = definedExternally
    override var displayOriginY: Number = definedExternally
    override fun setOrigin(x: Number?, y: Number?): Ellipse /* this */ = definedExternally
    override fun setOriginFromFrame(): Ellipse /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): Ellipse /* this */ = definedExternally
    override fun updateDisplayOrigin(): Ellipse /* this */ = definedExternally
    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): Ellipse /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override var scaleMode: Phaser.ScaleModes = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): Ellipse /* this */ = definedExternally
    override var scrollFactorX: Number = definedExternally
    override var scrollFactorY: Number = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Ellipse /* this */ = definedExternally
    override var x: Number = definedExternally
    override var y: Number = definedExternally
    override var z: Number = definedExternally
    override var w: Number = definedExternally
    override var scaleX: Number = definedExternally
    override var scaleY: Number = definedExternally
    override var angle: Number = definedExternally
    override var rotation: Number = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Ellipse /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Ellipse /* this */ = definedExternally
    override fun setRotation(radians: Number?): Ellipse /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Ellipse /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Ellipse /* this */ = definedExternally
    override fun setX(value: Number?): Ellipse /* this */ = definedExternally
    override fun setY(value: Number?): Ellipse /* this */ = definedExternally
    override fun setZ(value: Number?): Ellipse /* this */ = definedExternally
    override fun setW(value: Number?): Ellipse /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override var visible: Boolean = definedExternally
    override fun setVisible(value: Boolean): Ellipse /* this */ = definedExternally
}
open external class Grid(scene: Phaser.Scene, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, cellWidth: Number? = definedExternally /* null */, cellHeight: Number? = definedExternally /* null */, fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */, outlineFillColor: Number? = definedExternally /* null */, outlineFillAlpha: Number? = definedExternally /* null */) : Shape {
    open var cellWidth: Number = definedExternally
    open var cellHeight: Number = definedExternally
    open var showCells: Boolean = definedExternally
    open var outlineFillColor: Number = definedExternally
    open var outlineFillAlpha: Number = definedExternally
    open var showOutline: Boolean = definedExternally
    open var showAltCells: Boolean = definedExternally
    open var altFillColor: Number = definedExternally
    open var altFillAlpha: Number = definedExternally
    override fun setFillStyle(fillColor: Number?, fillAlpha: Number?): Grid /* this */ = definedExternally
    open fun setAltFillStyle(fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */): Grid /* this */ = definedExternally
    open fun setOutlineStyle(fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */): Grid /* this */ = definedExternally
    override fun clearAlpha(): Grid /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Grid /* this */ = definedExternally
    override var alpha: Number = definedExternally
    override var alphaTopLeft: Number = definedExternally
    override var alphaTopRight: Number = definedExternally
    override var alphaBottomLeft: Number = definedExternally
    override var alphaBottomRight: Number = definedExternally
    override var blendMode: dynamic /* String | Phaser.BlendModes */ = definedExternally
    override fun setBlendMode(value: String): Grid /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): Grid /* this */ = definedExternally
    override var width: Number = definedExternally
    override var height: Number = definedExternally
    override var displayWidth: Number = definedExternally
    override var displayHeight: Number = definedExternally
    override fun setSize(width: Number, height: Number): Grid /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Grid /* this */ = definedExternally
    override var depth: Number = definedExternally
    override fun setDepth(value: Number): Grid /* this */ = definedExternally
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
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): Grid /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): Grid /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Grid /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override var originX: Number = definedExternally
    override var originY: Number = definedExternally
    override var displayOriginX: Number = definedExternally
    override var displayOriginY: Number = definedExternally
    override fun setOrigin(x: Number?, y: Number?): Grid /* this */ = definedExternally
    override fun setOriginFromFrame(): Grid /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): Grid /* this */ = definedExternally
    override fun updateDisplayOrigin(): Grid /* this */ = definedExternally
    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): Grid /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override var scaleMode: Phaser.ScaleModes = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): Grid /* this */ = definedExternally
    override var scrollFactorX: Number = definedExternally
    override var scrollFactorY: Number = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Grid /* this */ = definedExternally
    override var x: Number = definedExternally
    override var y: Number = definedExternally
    override var z: Number = definedExternally
    override var w: Number = definedExternally
    override var scaleX: Number = definedExternally
    override var scaleY: Number = definedExternally
    override var angle: Number = definedExternally
    override var rotation: Number = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Grid /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Grid /* this */ = definedExternally
    override fun setRotation(radians: Number?): Grid /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Grid /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Grid /* this */ = definedExternally
    override fun setX(value: Number?): Grid /* this */ = definedExternally
    override fun setY(value: Number?): Grid /* this */ = definedExternally
    override fun setZ(value: Number?): Grid /* this */ = definedExternally
    override fun setW(value: Number?): Grid /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override var visible: Boolean = definedExternally
    override fun setVisible(value: Boolean): Grid /* this */ = definedExternally
}
open external class IsoBox(scene: Phaser.Scene, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, size: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, fillTop: Number? = definedExternally /* null */, fillLeft: Number? = definedExternally /* null */, fillRight: Number? = definedExternally /* null */) : Shape {
    open var projection: Number = definedExternally
    open var fillTop: Number = definedExternally
    open var fillLeft: Number = definedExternally
    open var fillRight: Number = definedExternally
    open var showTop: Boolean = definedExternally
    open var showLeft: Boolean = definedExternally
    open var showRight: Boolean = definedExternally
    open fun setProjection(value: Number): IsoBox /* this */ = definedExternally
    open fun setFaces(showTop: Boolean? = definedExternally /* null */, showLeft: Boolean? = definedExternally /* null */, showRight: Boolean? = definedExternally /* null */): IsoBox /* this */ = definedExternally
    open fun setFillStyle(fillTop: Number? = definedExternally /* null */, fillLeft: Number? = definedExternally /* null */, fillRight: Number? = definedExternally /* null */): IsoBox /* this */ = definedExternally
    override fun clearAlpha(): IsoBox /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): IsoBox /* this */ = definedExternally
    override var alpha: Number = definedExternally
    override var alphaTopLeft: Number = definedExternally
    override var alphaTopRight: Number = definedExternally
    override var alphaBottomLeft: Number = definedExternally
    override var alphaBottomRight: Number = definedExternally
    override var blendMode: dynamic /* String | Phaser.BlendModes */ = definedExternally
    override fun setBlendMode(value: String): IsoBox /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): IsoBox /* this */ = definedExternally
    override var width: Number = definedExternally
    override var height: Number = definedExternally
    override var displayWidth: Number = definedExternally
    override var displayHeight: Number = definedExternally
    override fun setSize(width: Number, height: Number): IsoBox /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): IsoBox /* this */ = definedExternally
    override var depth: Number = definedExternally
    override fun setDepth(value: Number): IsoBox /* this */ = definedExternally
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
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): IsoBox /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): IsoBox /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): IsoBox /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override var originX: Number = definedExternally
    override var originY: Number = definedExternally
    override var displayOriginX: Number = definedExternally
    override var displayOriginY: Number = definedExternally
    override fun setOrigin(x: Number?, y: Number?): IsoBox /* this */ = definedExternally
    override fun setOriginFromFrame(): IsoBox /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): IsoBox /* this */ = definedExternally
    override fun updateDisplayOrigin(): IsoBox /* this */ = definedExternally
    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): IsoBox /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override var scaleMode: Phaser.ScaleModes = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): IsoBox /* this */ = definedExternally
    override var scrollFactorX: Number = definedExternally
    override var scrollFactorY: Number = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): IsoBox /* this */ = definedExternally
    override var x: Number = definedExternally
    override var y: Number = definedExternally
    override var z: Number = definedExternally
    override var w: Number = definedExternally
    override var scaleX: Number = definedExternally
    override var scaleY: Number = definedExternally
    override var angle: Number = definedExternally
    override var rotation: Number = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): IsoBox /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): IsoBox /* this */ = definedExternally
    override fun setRotation(radians: Number?): IsoBox /* this */ = definedExternally
    override fun setAngle(degrees: Number?): IsoBox /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): IsoBox /* this */ = definedExternally
    override fun setX(value: Number?): IsoBox /* this */ = definedExternally
    override fun setY(value: Number?): IsoBox /* this */ = definedExternally
    override fun setZ(value: Number?): IsoBox /* this */ = definedExternally
    override fun setW(value: Number?): IsoBox /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override var visible: Boolean = definedExternally
    override fun setVisible(value: Boolean): IsoBox /* this */ = definedExternally
}
open external class IsoTriangle(scene: Phaser.Scene, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, size: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, reversed: Boolean? = definedExternally /* null */, fillTop: Number? = definedExternally /* null */, fillLeft: Number? = definedExternally /* null */, fillRight: Number? = definedExternally /* null */) : Shape {
    open var projection: Number = definedExternally
    open var fillTop: Number = definedExternally
    open var fillLeft: Number = definedExternally
    open var fillRight: Number = definedExternally
    open var showTop: Boolean = definedExternally
    open var showLeft: Boolean = definedExternally
    open var showRight: Boolean = definedExternally
    open var isReversed: Boolean = definedExternally
    open fun setProjection(value: Number): IsoTriangle /* this */ = definedExternally
    open fun setReversed(reversed: Boolean): IsoTriangle /* this */ = definedExternally
    open fun setFaces(showTop: Boolean? = definedExternally /* null */, showLeft: Boolean? = definedExternally /* null */, showRight: Boolean? = definedExternally /* null */): IsoTriangle /* this */ = definedExternally
    open fun setFillStyle(fillTop: Number? = definedExternally /* null */, fillLeft: Number? = definedExternally /* null */, fillRight: Number? = definedExternally /* null */): IsoTriangle /* this */ = definedExternally
    override fun clearAlpha(): IsoTriangle /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): IsoTriangle /* this */ = definedExternally
    override var alpha: Number = definedExternally
    override var alphaTopLeft: Number = definedExternally
    override var alphaTopRight: Number = definedExternally
    override var alphaBottomLeft: Number = definedExternally
    override var alphaBottomRight: Number = definedExternally
    override var blendMode: dynamic /* String | Phaser.BlendModes */ = definedExternally
    override fun setBlendMode(value: String): IsoTriangle /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): IsoTriangle /* this */ = definedExternally
    override var width: Number = definedExternally
    override var height: Number = definedExternally
    override var displayWidth: Number = definedExternally
    override var displayHeight: Number = definedExternally
    override fun setSize(width: Number, height: Number): IsoTriangle /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): IsoTriangle /* this */ = definedExternally
    override var depth: Number = definedExternally
    override fun setDepth(value: Number): IsoTriangle /* this */ = definedExternally
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
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): IsoTriangle /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): IsoTriangle /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): IsoTriangle /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override var originX: Number = definedExternally
    override var originY: Number = definedExternally
    override var displayOriginX: Number = definedExternally
    override var displayOriginY: Number = definedExternally
    override fun setOrigin(x: Number?, y: Number?): IsoTriangle /* this */ = definedExternally
    override fun setOriginFromFrame(): IsoTriangle /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): IsoTriangle /* this */ = definedExternally
    override fun updateDisplayOrigin(): IsoTriangle /* this */ = definedExternally
    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): IsoTriangle /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override var scaleMode: Phaser.ScaleModes = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): IsoTriangle /* this */ = definedExternally
    override var scrollFactorX: Number = definedExternally
    override var scrollFactorY: Number = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): IsoTriangle /* this */ = definedExternally
    override var x: Number = definedExternally
    override var y: Number = definedExternally
    override var z: Number = definedExternally
    override var w: Number = definedExternally
    override var scaleX: Number = definedExternally
    override var scaleY: Number = definedExternally
    override var angle: Number = definedExternally
    override var rotation: Number = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): IsoTriangle /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): IsoTriangle /* this */ = definedExternally
    override fun setRotation(radians: Number?): IsoTriangle /* this */ = definedExternally
    override fun setAngle(degrees: Number?): IsoTriangle /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): IsoTriangle /* this */ = definedExternally
    override fun setX(value: Number?): IsoTriangle /* this */ = definedExternally
    override fun setY(value: Number?): IsoTriangle /* this */ = definedExternally
    override fun setZ(value: Number?): IsoTriangle /* this */ = definedExternally
    override fun setW(value: Number?): IsoTriangle /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override var visible: Boolean = definedExternally
    override fun setVisible(value: Boolean): IsoTriangle /* this */ = definedExternally
}
open external class Line(scene: Phaser.Scene, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, x1: Number? = definedExternally /* null */, y1: Number? = definedExternally /* null */, x2: Number? = definedExternally /* null */, y2: Number? = definedExternally /* null */, strokeColor: Number? = definedExternally /* null */, strokeAlpha: Number? = definedExternally /* null */) : Shape {
    override var lineWidth: Number = definedExternally
    open fun setLineWidth(startWidth: Number, endWidth: Number? = definedExternally /* null */): Line /* this */ = definedExternally
    open fun setTo(x1: Number? = definedExternally /* null */, y1: Number? = definedExternally /* null */, x2: Number? = definedExternally /* null */, y2: Number? = definedExternally /* null */): Line /* this */ = definedExternally
    override fun clearAlpha(): Line /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Line /* this */ = definedExternally
    override var alpha: Number = definedExternally
    override var alphaTopLeft: Number = definedExternally
    override var alphaTopRight: Number = definedExternally
    override var alphaBottomLeft: Number = definedExternally
    override var alphaBottomRight: Number = definedExternally
    override var blendMode: dynamic /* String | Phaser.BlendModes */ = definedExternally
    override fun setBlendMode(value: String): Line /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): Line /* this */ = definedExternally
    override var width: Number = definedExternally
    override var height: Number = definedExternally
    override var displayWidth: Number = definedExternally
    override var displayHeight: Number = definedExternally
    override fun setSize(width: Number, height: Number): Line /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Line /* this */ = definedExternally
    override var depth: Number = definedExternally
    override fun setDepth(value: Number): Line /* this */ = definedExternally
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
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): Line /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): Line /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Line /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override var originX: Number = definedExternally
    override var originY: Number = definedExternally
    override var displayOriginX: Number = definedExternally
    override var displayOriginY: Number = definedExternally
    override fun setOrigin(x: Number?, y: Number?): Line /* this */ = definedExternally
    override fun setOriginFromFrame(): Line /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): Line /* this */ = definedExternally
    override fun updateDisplayOrigin(): Line /* this */ = definedExternally
    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): Line /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override var scaleMode: Phaser.ScaleModes = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): Line /* this */ = definedExternally
    override var scrollFactorX: Number = definedExternally
    override var scrollFactorY: Number = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Line /* this */ = definedExternally
    override var x: Number = definedExternally
    override var y: Number = definedExternally
    override var z: Number = definedExternally
    override var w: Number = definedExternally
    override var scaleX: Number = definedExternally
    override var scaleY: Number = definedExternally
    override var angle: Number = definedExternally
    override var rotation: Number = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Line /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Line /* this */ = definedExternally
    override fun setRotation(radians: Number?): Line /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Line /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Line /* this */ = definedExternally
    override fun setX(value: Number?): Line /* this */ = definedExternally
    override fun setY(value: Number?): Line /* this */ = definedExternally
    override fun setZ(value: Number?): Line /* this */ = definedExternally
    override fun setW(value: Number?): Line /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override var visible: Boolean = definedExternally
    override fun setVisible(value: Boolean): Line /* this */ = definedExternally
}
open external class Polygon(scene: Phaser.Scene, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, points: Any? = definedExternally /* null */, fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */) : Shape {
    open fun smooth(iterations: Number? = definedExternally /* null */): Polygon /* this */ = definedExternally
    override fun clearAlpha(): Polygon /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Polygon /* this */ = definedExternally
    override var alpha: Number = definedExternally
    override var alphaTopLeft: Number = definedExternally
    override var alphaTopRight: Number = definedExternally
    override var alphaBottomLeft: Number = definedExternally
    override var alphaBottomRight: Number = definedExternally
    override var blendMode: dynamic /* String | Phaser.BlendModes */ = definedExternally
    override fun setBlendMode(value: String): Polygon /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): Polygon /* this */ = definedExternally
    override var width: Number = definedExternally
    override var height: Number = definedExternally
    override var displayWidth: Number = definedExternally
    override var displayHeight: Number = definedExternally
    override fun setSize(width: Number, height: Number): Polygon /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Polygon /* this */ = definedExternally
    override var depth: Number = definedExternally
    override fun setDepth(value: Number): Polygon /* this */ = definedExternally
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
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): Polygon /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): Polygon /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Polygon /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override var originX: Number = definedExternally
    override var originY: Number = definedExternally
    override var displayOriginX: Number = definedExternally
    override var displayOriginY: Number = definedExternally
    override fun setOrigin(x: Number?, y: Number?): Polygon /* this */ = definedExternally
    override fun setOriginFromFrame(): Polygon /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): Polygon /* this */ = definedExternally
    override fun updateDisplayOrigin(): Polygon /* this */ = definedExternally
    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): Polygon /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override var scaleMode: Phaser.ScaleModes = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): Polygon /* this */ = definedExternally
    override var scrollFactorX: Number = definedExternally
    override var scrollFactorY: Number = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Polygon /* this */ = definedExternally
    override var x: Number = definedExternally
    override var y: Number = definedExternally
    override var z: Number = definedExternally
    override var w: Number = definedExternally
    override var scaleX: Number = definedExternally
    override var scaleY: Number = definedExternally
    override var angle: Number = definedExternally
    override var rotation: Number = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Polygon /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Polygon /* this */ = definedExternally
    override fun setRotation(radians: Number?): Polygon /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Polygon /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Polygon /* this */ = definedExternally
    override fun setX(value: Number?): Polygon /* this */ = definedExternally
    override fun setY(value: Number?): Polygon /* this */ = definedExternally
    override fun setZ(value: Number?): Polygon /* this */ = definedExternally
    override fun setW(value: Number?): Polygon /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override var visible: Boolean = definedExternally
    override fun setVisible(value: Boolean): Polygon /* this */ = definedExternally
}
open external class Rectangle(scene: Phaser.Scene, x: Number, y: Number, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */) : Shape {
    override fun clearAlpha(): Rectangle /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Rectangle /* this */ = definedExternally
    override var alpha: Number = definedExternally
    override var alphaTopLeft: Number = definedExternally
    override var alphaTopRight: Number = definedExternally
    override var alphaBottomLeft: Number = definedExternally
    override var alphaBottomRight: Number = definedExternally
    override var blendMode: dynamic /* String | Phaser.BlendModes */ = definedExternally
    override fun setBlendMode(value: String): Rectangle /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): Rectangle /* this */ = definedExternally
    override var width: Number = definedExternally
    override var height: Number = definedExternally
    override var displayWidth: Number = definedExternally
    override var displayHeight: Number = definedExternally
    override fun setSize(width: Number, height: Number): Rectangle /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Rectangle /* this */ = definedExternally
    override var depth: Number = definedExternally
    override fun setDepth(value: Number): Rectangle /* this */ = definedExternally
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
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): Rectangle /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): Rectangle /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Rectangle /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override var originX: Number = definedExternally
    override var originY: Number = definedExternally
    override var displayOriginX: Number = definedExternally
    override var displayOriginY: Number = definedExternally
    override fun setOrigin(x: Number?, y: Number?): Rectangle /* this */ = definedExternally
    override fun setOriginFromFrame(): Rectangle /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): Rectangle /* this */ = definedExternally
    override fun updateDisplayOrigin(): Rectangle /* this */ = definedExternally
    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): Rectangle /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override var scaleMode: Phaser.ScaleModes = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): Rectangle /* this */ = definedExternally
    override var scrollFactorX: Number = definedExternally
    override var scrollFactorY: Number = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Rectangle /* this */ = definedExternally
    override var x: Number = definedExternally
    override var y: Number = definedExternally
    override var z: Number = definedExternally
    override var w: Number = definedExternally
    override var scaleX: Number = definedExternally
    override var scaleY: Number = definedExternally
    override var angle: Number = definedExternally
    override var rotation: Number = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Rectangle /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Rectangle /* this */ = definedExternally
    override fun setRotation(radians: Number?): Rectangle /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Rectangle /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Rectangle /* this */ = definedExternally
    override fun setX(value: Number?): Rectangle /* this */ = definedExternally
    override fun setY(value: Number?): Rectangle /* this */ = definedExternally
    override fun setZ(value: Number?): Rectangle /* this */ = definedExternally
    override fun setW(value: Number?): Rectangle /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override var visible: Boolean = definedExternally
    override fun setVisible(value: Boolean): Rectangle /* this */ = definedExternally
}
open external class Shape(scene: Phaser.Scene, type: String? = definedExternally /* null */, data: Any? = definedExternally /* null */) : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.ComputedSize, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Mask, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
    override var data: Phaser.Data.DataManager = definedExternally
    open var pathData: Array<Number> = definedExternally
    open var pathIndexes: Array<Number> = definedExternally
    open var fillColor: Number = definedExternally
    open var fillAlpha: Number = definedExternally
    open var strokeColor: Number = definedExternally
    open var strokeAlpha: Number = definedExternally
    open var lineWidth: Number = definedExternally
    open var isFilled: Boolean = definedExternally
    open var isStroked: Boolean = definedExternally
    open var closePath: Boolean = definedExternally
    open fun setFillStyle(color: Number? = definedExternally /* null */, alpha: Number? = definedExternally /* null */): Shape /* this */ = definedExternally
    open fun setStrokeStyle(color: Number? = definedExternally /* null */, alpha: Number? = definedExternally /* null */): Shape /* this */ = definedExternally
    open fun setClosePath(value: Boolean): Shape /* this */ = definedExternally
    open fun preDestroy(): Unit = definedExternally
    override fun clearAlpha(): Shape /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Shape /* this */ = definedExternally
    override var alpha: Number = definedExternally
    override var alphaTopLeft: Number = definedExternally
    override var alphaTopRight: Number = definedExternally
    override var alphaBottomLeft: Number = definedExternally
    override var alphaBottomRight: Number = definedExternally
    override var blendMode: dynamic /* String | Phaser.BlendModes */ = definedExternally
    override fun setBlendMode(value: String): Shape /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): Shape /* this */ = definedExternally
    override var width: Number = definedExternally
    override var height: Number = definedExternally
    override var displayWidth: Number = definedExternally
    override var displayHeight: Number = definedExternally
    override fun setSize(width: Number, height: Number): Shape /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Shape /* this */ = definedExternally
    override var depth: Number = definedExternally
    override fun setDepth(value: Number): Shape /* this */ = definedExternally
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
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): Shape /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): Shape /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Shape /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override var originX: Number = definedExternally
    override var originY: Number = definedExternally
    override var displayOriginX: Number = definedExternally
    override var displayOriginY: Number = definedExternally
    override fun setOrigin(x: Number?, y: Number?): Shape /* this */ = definedExternally
    override fun setOriginFromFrame(): Shape /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): Shape /* this */ = definedExternally
    override fun updateDisplayOrigin(): Shape /* this */ = definedExternally
    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): Shape /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override var scaleMode: Phaser.ScaleModes = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): Shape /* this */ = definedExternally
    override var scrollFactorX: Number = definedExternally
    override var scrollFactorY: Number = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Shape /* this */ = definedExternally
    override var x: Number = definedExternally
    override var y: Number = definedExternally
    override var z: Number = definedExternally
    override var w: Number = definedExternally
    override var scaleX: Number = definedExternally
    override var scaleY: Number = definedExternally
    override var angle: Number = definedExternally
    override var rotation: Number = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Shape /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Shape /* this */ = definedExternally
    override fun setRotation(radians: Number?): Shape /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Shape /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Shape /* this */ = definedExternally
    override fun setX(value: Number?): Shape /* this */ = definedExternally
    override fun setY(value: Number?): Shape /* this */ = definedExternally
    override fun setZ(value: Number?): Shape /* this */ = definedExternally
    override fun setW(value: Number?): Shape /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override var visible: Boolean = definedExternally
    override fun setVisible(value: Boolean): Shape /* this */ = definedExternally
}
open external class Star(scene: Phaser.Scene, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, points: Number? = definedExternally /* null */, innerRadius: Number? = definedExternally /* null */, outerRadius: Number? = definedExternally /* null */, fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */) : Shape {
    open fun setPoints(value: Number): Star /* this */ = definedExternally
    open fun setInnerRadius(value: Number): Star /* this */ = definedExternally
    open fun setOuterRadius(value: Number): Star /* this */ = definedExternally
    open var points: Number = definedExternally
    open var innerRadius: Number = definedExternally
    open var outerRadius: Number = definedExternally
    override fun clearAlpha(): Star /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Star /* this */ = definedExternally
    override var alpha: Number = definedExternally
    override var alphaTopLeft: Number = definedExternally
    override var alphaTopRight: Number = definedExternally
    override var alphaBottomLeft: Number = definedExternally
    override var alphaBottomRight: Number = definedExternally
    override var blendMode: dynamic /* String | Phaser.BlendModes */ = definedExternally
    override fun setBlendMode(value: String): Star /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): Star /* this */ = definedExternally
    override var width: Number = definedExternally
    override var height: Number = definedExternally
    override var displayWidth: Number = definedExternally
    override var displayHeight: Number = definedExternally
    override fun setSize(width: Number, height: Number): Star /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Star /* this */ = definedExternally
    override var depth: Number = definedExternally
    override fun setDepth(value: Number): Star /* this */ = definedExternally
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
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): Star /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): Star /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Star /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override var originX: Number = definedExternally
    override var originY: Number = definedExternally
    override var displayOriginX: Number = definedExternally
    override var displayOriginY: Number = definedExternally
    override fun setOrigin(x: Number?, y: Number?): Star /* this */ = definedExternally
    override fun setOriginFromFrame(): Star /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): Star /* this */ = definedExternally
    override fun updateDisplayOrigin(): Star /* this */ = definedExternally
    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): Star /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override var scaleMode: Phaser.ScaleModes = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): Star /* this */ = definedExternally
    override var scrollFactorX: Number = definedExternally
    override var scrollFactorY: Number = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Star /* this */ = definedExternally
    override var x: Number = definedExternally
    override var y: Number = definedExternally
    override var z: Number = definedExternally
    override var w: Number = definedExternally
    override var scaleX: Number = definedExternally
    override var scaleY: Number = definedExternally
    override var angle: Number = definedExternally
    override var rotation: Number = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Star /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Star /* this */ = definedExternally
    override fun setRotation(radians: Number?): Star /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Star /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Star /* this */ = definedExternally
    override fun setX(value: Number?): Star /* this */ = definedExternally
    override fun setY(value: Number?): Star /* this */ = definedExternally
    override fun setZ(value: Number?): Star /* this */ = definedExternally
    override fun setW(value: Number?): Star /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override var visible: Boolean = definedExternally
    override fun setVisible(value: Boolean): Star /* this */ = definedExternally
}
open external class Triangle(scene: Phaser.Scene, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, x1: Number? = definedExternally /* null */, y1: Number? = definedExternally /* null */, x2: Number? = definedExternally /* null */, y2: Number? = definedExternally /* null */, x3: Number? = definedExternally /* null */, y3: Number? = definedExternally /* null */, fillColor: Number? = definedExternally /* null */, fillAlpha: Number? = definedExternally /* null */) : Shape {
    open fun setTo(x1: Number? = definedExternally /* null */, y1: Number? = definedExternally /* null */, x2: Number? = definedExternally /* null */, y2: Number? = definedExternally /* null */, x3: Number? = definedExternally /* null */, y3: Number? = definedExternally /* null */): Triangle /* this */ = definedExternally
    override fun clearAlpha(): Triangle /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Triangle /* this */ = definedExternally
    override var alpha: Number = definedExternally
    override var alphaTopLeft: Number = definedExternally
    override var alphaTopRight: Number = definedExternally
    override var alphaBottomLeft: Number = definedExternally
    override var alphaBottomRight: Number = definedExternally
    override var blendMode: dynamic /* String | Phaser.BlendModes */ = definedExternally
    override fun setBlendMode(value: String): Triangle /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): Triangle /* this */ = definedExternally
    override var width: Number = definedExternally
    override var height: Number = definedExternally
    override var displayWidth: Number = definedExternally
    override var displayHeight: Number = definedExternally
    override fun setSize(width: Number, height: Number): Triangle /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Triangle /* this */ = definedExternally
    override var depth: Number = definedExternally
    override fun setDepth(value: Number): Triangle /* this */ = definedExternally
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
    override var mask: dynamic /* Phaser.Display.Masks.BitmapMask | Phaser.Display.Masks.GeometryMask */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): Triangle /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): Triangle /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Triangle /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override var originX: Number = definedExternally
    override var originY: Number = definedExternally
    override var displayOriginX: Number = definedExternally
    override var displayOriginY: Number = definedExternally
    override fun setOrigin(x: Number?, y: Number?): Triangle /* this */ = definedExternally
    override fun setOriginFromFrame(): Triangle /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): Triangle /* this */ = definedExternally
    override fun updateDisplayOrigin(): Triangle /* this */ = definedExternally
    override var defaultPipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override var pipeline: Phaser.Renderer.WebGL.WebGLPipeline = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): Triangle /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override var scaleMode: Phaser.ScaleModes = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): Triangle /* this */ = definedExternally
    override var scrollFactorX: Number = definedExternally
    override var scrollFactorY: Number = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Triangle /* this */ = definedExternally
    override var x: Number = definedExternally
    override var y: Number = definedExternally
    override var z: Number = definedExternally
    override var w: Number = definedExternally
    override var scaleX: Number = definedExternally
    override var scaleY: Number = definedExternally
    override var angle: Number = definedExternally
    override var rotation: Number = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Triangle /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Triangle /* this */ = definedExternally
    override fun setRotation(radians: Number?): Triangle /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Triangle /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Triangle /* this */ = definedExternally
    override fun setX(value: Number?): Triangle /* this */ = definedExternally
    override fun setY(value: Number?): Triangle /* this */ = definedExternally
    override fun setZ(value: Number?): Triangle /* this */ = definedExternally
    override fun setW(value: Number?): Triangle /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override var visible: Boolean = definedExternally
    override fun setVisible(value: Boolean): Triangle /* this */ = definedExternally
}
open external class Sprite : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Mask, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Size, Phaser.GameObjects.Components.TextureCrop, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
    constructor(scene: Phaser.Scene, x: Number, y: Number, texture: String, frame: String? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, x: Number, y: Number, texture: String, frame: Number? = definedExternally /* null */)

    open var anims: Phaser.GameObjects.Components.Animation
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
    open fun preUpdate(time: Number, delta: Number): Unit = definedExternally
    open fun play(key: String, ignoreIfPlaying: Boolean? = definedExternally /* null */, startFrame: Number? = definedExternally /* null */): Sprite = definedExternally
    override fun toJSON(): JSONGameObject = definedExternally
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
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
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
    override fun setCrop(): Sprite /* this */ = definedExternally
    override fun setTexture(key: String): Sprite /* this */ = definedExternally
}
open external class Text : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.ComputedSize, Phaser.GameObjects.Components.Crop, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Mask, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
    constructor(scene: Phaser.Scene, x: Number, y: Number, text: String, style: Any)
    constructor(scene: Phaser.Scene, x: Number, y: Number, text: Array<String>, style: Any)

    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var canvas: HTMLCanvasElement
    open var context: CanvasRenderingContext2D
    open var style: Phaser.GameObjects.Text.TextStyle
    open var autoRound: Boolean
    open var splitRegExp: Any
    open var padding: Any
    override var width: Number
    override var height: Number
    open var lineSpacing: Number
    open var dirty: Boolean
    open var text: String
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* String | Phaser.BlendModes */
    override var displayWidth: Number
    override var displayHeight: Number
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Phaser.Textures.Frame
    override var isCropped: Boolean
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
    open fun initRTL(): Unit = definedExternally
    open fun runWordWrap(text: String): String = definedExternally
    open fun advancedWordWrap(text: String, context: CanvasRenderingContext2D, wordWrapWidth: Number): String = definedExternally
    open fun basicWordWrap(text: String, context: CanvasRenderingContext2D, wordWrapWidth: Number): String = definedExternally
    open fun getWrappedText(text: String): Array<String> = definedExternally
    open fun setText(value: String): Text = definedExternally
    open fun setText(value: Array<String>): Text = definedExternally
    open fun setStyle(style: Any): Text = definedExternally
    open fun setFont(font: String): Text = definedExternally
    open fun setFontFamily(family: String): Text = definedExternally
    open fun setFontSize(size: Number): Text = definedExternally
    open fun setFontStyle(style: String): Text = definedExternally
    open fun setFixedSize(width: Number, height: Number): Text = definedExternally
    open fun setBackgroundColor(color: String): Text = definedExternally
    open fun setFill(color: String): Text = definedExternally
    open fun setColor(color: String): Text = definedExternally
    open fun setStroke(color: String, thickness: Number): Text = definedExternally
    open fun setShadow(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, color: String? = definedExternally /* null */, blur: Number? = definedExternally /* null */, shadowStroke: Boolean? = definedExternally /* null */, shadowFill: Boolean? = definedExternally /* null */): Text = definedExternally
    open fun setShadowOffset(x: Number, y: Number): Text = definedExternally
    open fun setShadowColor(color: String): Text = definedExternally
    open fun setShadowBlur(blur: Number): Text = definedExternally
    open fun setShadowStroke(enabled: Boolean): Text = definedExternally
    open fun setShadowFill(enabled: Boolean): Text = definedExternally
    open fun setWordWrapWidth(width: Number, useAdvancedWrap: Boolean? = definedExternally /* null */): Text = definedExternally
    open fun setWordWrapCallback(callback: (text: String, textObject: Text) -> Unit, scope: Any? = definedExternally /* null */): Text = definedExternally
    open fun setAlign(align: String): Text = definedExternally
    open fun setResolution(value: Number): Text = definedExternally
    open fun setLineSpacing(value: Number): Text = definedExternally
    open fun setPadding(left: Number, top: Number, right: Number, bottom: Number): Text = definedExternally
    open fun setPadding(left: Any?, top: Number, right: Number, bottom: Number): Text = definedExternally
    open fun setMaxLines(max: Number? = definedExternally /* null */): Text = definedExternally
    open fun updateText(): Text = definedExternally
    open fun getTextMetrics(): Any = definedExternally
    override fun toJSON(): JSONGameObject = definedExternally
    open fun preDestroy(): Unit = definedExternally
    override fun clearAlpha(): Text /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Text /* this */ = definedExternally
    override fun setBlendMode(value: String): Text /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): Text /* this */ = definedExternally
    override fun setSize(width: Number, height: Number): Text /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): Text /* this */ = definedExternally
    override fun setCrop(x: Number?, y: Number?, width: Number?, height: Number?): Text /* this */ = definedExternally
    override fun setCrop(x: Phaser.Geom.Rectangle?, y: Number?, width: Number?, height: Number?): Text /* this */ = definedExternally
    override fun setDepth(value: Number): Text /* this */ = definedExternally
    override fun toggleFlipX(): Text /* this */ = definedExternally
    override fun toggleFlipY(): Text /* this */ = definedExternally
    override fun setFlipX(value: Boolean): Text /* this */ = definedExternally
    override fun setFlipY(value: Boolean): Text /* this */ = definedExternally
    override fun setFlip(x: Boolean, y: Boolean): Text /* this */ = definedExternally
    override fun resetFlip(): Text /* this */ = definedExternally
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
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): Text /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): Text /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): Text /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override fun setOrigin(x: Number?, y: Number?): Text /* this */ = definedExternally
    override fun setOriginFromFrame(): Text /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): Text /* this */ = definedExternally
    override fun updateDisplayOrigin(): Text /* this */ = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): Text /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): Text /* this */ = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Text /* this */ = definedExternally
    override fun clearTint(): Text /* this */ = definedExternally
    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Text /* this */ = definedExternally
    override fun setTintFill(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Text /* this */ = definedExternally
    override var visible: Boolean = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Text /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Text /* this */ = definedExternally
    override fun setRotation(radians: Number?): Text /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Text /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Text /* this */ = definedExternally
    override fun setX(value: Number?): Text /* this */ = definedExternally
    override fun setY(value: Number?): Text /* this */ = definedExternally
    override fun setZ(value: Number?): Text /* this */ = definedExternally
    override fun setW(value: Number?): Text /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun setVisible(value: Boolean): Text /* this */ = definedExternally
    companion object {
        fun GetTextSize(text: Text, size: BitmapTextMetrics, lines: Array<Any>): Any = definedExternally
        fun MeasureText(textStyle: Phaser.GameObjects.Text.TextStyle): Any = definedExternally
    }
    open class TextStyle(text: Phaser.GameObjects.Text, style: Any) {
        open var parent: Phaser.GameObjects.Text = definedExternally
        open var fontFamily: String = definedExternally
        open var fontSize: String = definedExternally
        open var fontStyle: String = definedExternally
        open var backgroundColor: String = definedExternally
        open var color: String = definedExternally
        open var stroke: String = definedExternally
        open var strokeThickness: Number = definedExternally
        open var shadowOffsetX: Number = definedExternally
        open var shadowOffsetY: Number = definedExternally
        open var shadowColor: String = definedExternally
        open var shadowBlur: Number = definedExternally
        open var shadowStroke: Boolean = definedExternally
        open var shadowFill: Boolean = definedExternally
        open var align: String = definedExternally
        open var maxLines: Number = definedExternally
        open var fixedWidth: Number = definedExternally
        open var fixedHeight: Number = definedExternally
        open var resolution: Number = definedExternally
        open var rtl: Boolean = definedExternally
        open var testString: String = definedExternally
        open var baselineX: Number = definedExternally
        open var baselineY: Number = definedExternally
        open fun setStyle(style: Any, updateText: Boolean? = definedExternally /* null */, setDefaults: Boolean? = definedExternally /* null */): Phaser.GameObjects.Text = definedExternally
        open fun syncFont(canvas: HTMLCanvasElement, context: CanvasRenderingContext2D): Unit = definedExternally
        open fun syncStyle(canvas: HTMLCanvasElement, context: CanvasRenderingContext2D): Unit = definedExternally
        open fun syncShadow(context: CanvasRenderingContext2D, enabled: Boolean): Unit = definedExternally
        open fun update(recalculateMetrics: Boolean): Phaser.GameObjects.Text = definedExternally
        open fun setFont(font: String): Phaser.GameObjects.Text = definedExternally
        open fun setFont(font: Any?): Phaser.GameObjects.Text = definedExternally
        open fun setFontFamily(family: String): Phaser.GameObjects.Text = definedExternally
        open fun setFontStyle(style: String): Phaser.GameObjects.Text = definedExternally
        open fun setFontSize(size: String): Phaser.GameObjects.Text = definedExternally
        open fun setFontSize(size: Number): Phaser.GameObjects.Text = definedExternally
        open fun setTestString(string: String): Phaser.GameObjects.Text = definedExternally
        open fun setFixedSize(width: Number, height: Number): Phaser.GameObjects.Text = definedExternally
        open fun setBackgroundColor(color: String): Phaser.GameObjects.Text = definedExternally
        open fun setFill(color: String): Phaser.GameObjects.Text = definedExternally
        open fun setColor(color: String): Phaser.GameObjects.Text = definedExternally
        open fun setResolution(value: Number): Phaser.GameObjects.Text = definedExternally
        open fun setStroke(color: String, thickness: Number): Phaser.GameObjects.Text = definedExternally
        open fun setShadow(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, color: String? = definedExternally /* null */, blur: Number? = definedExternally /* null */, shadowStroke: Boolean? = definedExternally /* null */, shadowFill: Boolean? = definedExternally /* null */): Phaser.GameObjects.Text = definedExternally
        open fun setShadowOffset(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): Phaser.GameObjects.Text = definedExternally
        open fun setShadowColor(color: String? = definedExternally /* null */): Phaser.GameObjects.Text = definedExternally
        open fun setShadowBlur(blur: Number? = definedExternally /* null */): Phaser.GameObjects.Text = definedExternally
        open fun setShadowStroke(enabled: Boolean): Phaser.GameObjects.Text = definedExternally
        open fun setShadowFill(enabled: Boolean): Phaser.GameObjects.Text = definedExternally
        open fun setWordWrapWidth(width: Number, useAdvancedWrap: Boolean? = definedExternally /* null */): Phaser.GameObjects.Text = definedExternally
        open fun setWordWrapCallback(callback: (text: String, textObject: Phaser.GameObjects.Text) -> Unit, scope: Any? = definedExternally /* null */): Phaser.GameObjects.Text = definedExternally
        open fun setAlign(align: String): Phaser.GameObjects.Text = definedExternally
        open fun setMaxLines(max: Number? = definedExternally /* null */): Phaser.GameObjects.Text = definedExternally
        open fun getTextMetrics(): BitmapTextMetrics = definedExternally
        open fun toJSON(): Any = definedExternally
        open fun destroy(): Unit = definedExternally
    }
    override fun setCrop(): Text /* this */ = definedExternally
}
open external class TileSprite : GameObject, Phaser.GameObjects.Components.Alpha, Phaser.GameObjects.Components.BlendMode, Phaser.GameObjects.Components.ComputedSize, Phaser.GameObjects.Components.Crop, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.Flip, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Mask, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.Pipeline, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Tint, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.Visible {
    constructor(scene: Phaser.Scene, x: Number, y: Number, width: Number, height: Number, textureKey: String, frameKey: String? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, x: Number, y: Number, width: Number, height: Number, textureKey: String, frameKey: Number? = definedExternally /* null */)

    open var dirty: Boolean
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var canvas: HTMLCanvasElement
    open var context: CanvasRenderingContext2D
    override var texture: dynamic /* Phaser.Textures.Texture | Phaser.Textures.CanvasTexture */
    override var frame: Phaser.Textures.Frame
    open var potWidth: Number
    open var potHeight: Number
    open var fillCanvas: HTMLCanvasElement
    open var fillContext: CanvasRenderingContext2D
    open var fillPattern: dynamic /* WebGLTexture | CanvasPattern */
    open var tilePositionX: Number
    open var tilePositionY: Number
    open var tileScaleX: Number
    open var tileScaleY: Number
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* String | Phaser.BlendModes */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override var isCropped: Boolean
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
    open fun setTexture(key: String, frame: String? = definedExternally /* null */): TileSprite /* this */ = definedExternally
    open fun setTexture(key: String, frame: Number? = definedExternally /* null */): TileSprite /* this */ = definedExternally
    open fun setFrame(frame: String, updateSize: Boolean? = definedExternally /* null */, updateOrigin: Boolean? = definedExternally /* null */): TileSprite /* this */ = definedExternally
    open fun setFrame(frame: Number, updateSize: Boolean? = definedExternally /* null */, updateOrigin: Boolean? = definedExternally /* null */): TileSprite /* this */ = definedExternally
    open fun setTilePosition(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): TileSprite /* this */ = definedExternally
    open fun setTileScale(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): TileSprite /* this */ = definedExternally
    open fun preDestroy(): Unit = definedExternally
    override fun clearAlpha(): TileSprite /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): TileSprite /* this */ = definedExternally
    override fun setBlendMode(value: String): TileSprite /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): TileSprite /* this */ = definedExternally
    override fun setSize(width: Number, height: Number): TileSprite /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): TileSprite /* this */ = definedExternally
    override fun setCrop(x: Number?, y: Number?, width: Number?, height: Number?): TileSprite /* this */ = definedExternally
    override fun setCrop(x: Phaser.Geom.Rectangle?, y: Number?, width: Number?, height: Number?): TileSprite /* this */ = definedExternally
    override fun setDepth(value: Number): TileSprite /* this */ = definedExternally
    override fun toggleFlipX(): TileSprite /* this */ = definedExternally
    override fun toggleFlipY(): TileSprite /* this */ = definedExternally
    override fun setFlipX(value: Boolean): TileSprite /* this */ = definedExternally
    override fun setFlipY(value: Boolean): TileSprite /* this */ = definedExternally
    override fun setFlip(x: Boolean, y: Boolean): TileSprite /* this */ = definedExternally
    override fun resetFlip(): TileSprite /* this */ = definedExternally
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
    override fun setMask(mask: Phaser.Display.Masks.BitmapMask): TileSprite /* this */ = definedExternally
    override fun setMask(mask: Phaser.Display.Masks.GeometryMask): TileSprite /* this */ = definedExternally
    override fun clearMask(destroyMask: Boolean?): TileSprite /* this */ = definedExternally
    override fun createBitmapMask(renderable: GameObject?): Phaser.Display.Masks.BitmapMask = definedExternally
    override fun createGeometryMask(graphics: Graphics?): Phaser.Display.Masks.GeometryMask = definedExternally
    override fun setOrigin(x: Number?, y: Number?): TileSprite /* this */ = definedExternally
    override fun setOriginFromFrame(): TileSprite /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): TileSprite /* this */ = definedExternally
    override fun updateDisplayOrigin(): TileSprite /* this */ = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): TileSprite /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): TileSprite /* this */ = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): TileSprite /* this */ = definedExternally
    override fun clearTint(): TileSprite /* this */ = definedExternally
    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): TileSprite /* this */ = definedExternally
    override fun setTintFill(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): TileSprite /* this */ = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): TileSprite /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): TileSprite /* this */ = definedExternally
    override fun setRotation(radians: Number?): TileSprite /* this */ = definedExternally
    override fun setAngle(degrees: Number?): TileSprite /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): TileSprite /* this */ = definedExternally
    override fun setX(value: Number?): TileSprite /* this */ = definedExternally
    override fun setY(value: Number?): TileSprite /* this */ = definedExternally
    override fun setZ(value: Number?): TileSprite /* this */ = definedExternally
    override fun setW(value: Number?): TileSprite /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun setVisible(value: Boolean): TileSprite /* this */ = definedExternally
    open fun setTexture(key: String): TileSprite /* this */ = definedExternally
    override fun setCrop(): TileSprite /* this */ = definedExternally
}
open external class UpdateList(scene: Phaser.Scene) {
    open var scene: Phaser.Scene = definedExternally
    open var systems: Phaser.Scenes.Systems = definedExternally
    open fun add(child: GameObject): GameObject = definedExternally
    open fun preUpdate(): Unit = definedExternally
    open fun update(time: Number, delta: Number): Unit = definedExternally
    open fun remove(child: GameObject): GameObject = definedExternally
    open fun removeAll(): UpdateList = definedExternally
    open fun shutdown(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
    open var length: Number = definedExternally
}
open external class Zone(scene: Phaser.Scene, x: Number, y: Number, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */) : GameObject, Phaser.GameObjects.Components.Depth, Phaser.GameObjects.Components.GetBounds, Phaser.GameObjects.Components.Origin, Phaser.GameObjects.Components.ScaleMode, Phaser.GameObjects.Components.Transform, Phaser.GameObjects.Components.ScrollFactor, Phaser.GameObjects.Components.Visible {
    open var width: Number = definedExternally
    open var height: Number = definedExternally
    open var blendMode: Number = definedExternally
    open var displayWidth: Number = definedExternally
    open var displayHeight: Number = definedExternally
    open fun setSize(width: Number, height: Number, resizeInput: Boolean? = definedExternally /* null */): Zone = definedExternally
    open fun setDisplaySize(width: Number, height: Number): Zone = definedExternally
    open fun setCircleDropZone(radius: Number): Zone = definedExternally
    open fun setRectangleDropZone(width: Number, height: Number): Zone = definedExternally
    open fun setDropZone(shape: Any, callback: (hitArea: Any, x: Number, y: Number, gameObject: GameObject) -> Unit): Zone = definedExternally
    override var depth: Number = definedExternally
    override fun setDepth(value: Number): Zone /* this */ = definedExternally
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
    override var originX: Number = definedExternally
    override var originY: Number = definedExternally
    override var displayOriginX: Number = definedExternally
    override var displayOriginY: Number = definedExternally
    override fun setOrigin(x: Number?, y: Number?): Zone /* this */ = definedExternally
    override fun setOriginFromFrame(): Zone /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): Zone /* this */ = definedExternally
    override fun updateDisplayOrigin(): Zone /* this */ = definedExternally
    override var scaleMode: Phaser.ScaleModes = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): Zone /* this */ = definedExternally
    override var x: Number = definedExternally
    override var y: Number = definedExternally
    override var z: Number = definedExternally
    override var w: Number = definedExternally
    override var scaleX: Number = definedExternally
    override var scaleY: Number = definedExternally
    override var angle: Number = definedExternally
    override var rotation: Number = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): Zone /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): Zone /* this */ = definedExternally
    override fun setRotation(radians: Number?): Zone /* this */ = definedExternally
    override fun setAngle(degrees: Number?): Zone /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): Zone /* this */ = definedExternally
    override fun setX(value: Number?): Zone /* this */ = definedExternally
    override fun setY(value: Number?): Zone /* this */ = definedExternally
    override fun setZ(value: Number?): Zone /* this */ = definedExternally
    override fun setW(value: Number?): Zone /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: Phaser.GameObjects.Components.TransformMatrix?): Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override var scrollFactorX: Number = definedExternally
    override var scrollFactorY: Number = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): Zone /* this */ = definedExternally
    override var visible: Boolean = definedExternally
    override fun setVisible(value: Boolean): Zone /* this */ = definedExternally
}
