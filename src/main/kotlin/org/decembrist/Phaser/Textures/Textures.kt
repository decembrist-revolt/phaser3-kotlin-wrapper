@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Textures") JsNonModule]
package org.decembrist.Phaser.Textures

import org.decembrist.Phaser.Display.Display
import org.decembrist.Phaser.Phaser
import org.decembrist.utils.SpriteSheetConfig
import org.decembrist.utils.SpriteSheetFromAtlasConfig
import org.khronos.webgl.ArrayBuffer
import org.khronos.webgl.Uint32Array
import org.khronos.webgl.Uint8ClampedArray
import org.khronos.webgl.WebGLTexture
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLImageElement
import org.w3c.dom.ImageData

open external class CanvasTexture(manager: CanvasTexture, key: String, source: HTMLCanvasElement, width: Number, height: Number) : Texture {
    open var canvas: HTMLCanvasElement = definedExternally
    open var context: CanvasRenderingContext2D = definedExternally
    open var width: Number = definedExternally
    open var height: Number = definedExternally
    open var imageData: ImageData = definedExternally
    open var data: Uint8ClampedArray = definedExternally
    open var pixels: Uint32Array = definedExternally
    open var buffer: ArrayBuffer = definedExternally
    open fun update(): CanvasTexture = definedExternally
    open fun draw(x: Number, y: Number, source: HTMLCanvasElement): CanvasTexture = definedExternally
    open fun draw(x: Number, y: Number, source: HTMLImageElement): CanvasTexture = definedExternally
    open fun getPixel(x: Number, y: Number, out: Display.Color? = definedExternally /* null */): Display.Color = definedExternally
    open fun refresh(): CanvasTexture = definedExternally
    open fun getCanvas(): HTMLCanvasElement = definedExternally
    open fun getContext(): CanvasRenderingContext2D = definedExternally
    open fun clear(): CanvasTexture = definedExternally
    open fun setSize(width: Number, height: Number? = definedExternally /* null */): CanvasTexture = definedExternally
}
external enum class FilterMode {
    LINEAR,
    NEAREST
}
open external class Frame {
    constructor(texture: Texture, name: String, sourceIndex: Number, x: Number, y: Number, width: Number, height: Number)
    constructor(texture: Texture, name: Number, sourceIndex: Number, x: Number, y: Number, width: Number, height: Number)

    open var texture: Texture
    open var name: String
    open var source: TextureSource
    open var sourceIndex: Number
    open var glTexture: WebGLTexture
    open var cutX: Number
    open var cutY: Number
    open var cutWidth: Number
    open var cutHeight: Number
    open var x: Number
    open var y: Number
    open var width: Number
    open var height: Number
    open var halfWidth: Number
    open var halfHeight: Number
    open var centerX: Number
    open var centerY: Number
    open var pivotX: Number
    open var pivotY: Number
    open var customPivot: Boolean
    open var rotated: Boolean
    open var autoRound: Number
    open var customData: Any
    open var u0: Number
    open var v0: Number
    open var u1: Number
    open var v1: Number
    open var realWidth: Number
    open var realHeight: Number
    open var radius: Number
    open var trimmed: Boolean
    open var canvasData: Any
    open fun setSize(width: Number, height: Number, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): Frame = definedExternally
    open fun setTrim(actualWidth: Number, actualHeight: Number, destX: Number, destY: Number, destWidth: Number, destHeight: Number): Frame = definedExternally
    open fun setCropUVs(crop: Any, x: Number, y: Number, width: Number, height: Number, flipX: Boolean, flipY: Boolean): Any = definedExternally
    open fun updateCropUVs(crop: Any, flipX: Boolean, flipY: Boolean): Any = definedExternally
    open fun updateUVs(): Frame = definedExternally
    open fun updateUVsInverted(): Frame = definedExternally
    open fun clone(): Frame = definedExternally
    open fun destroy(): Unit = definedExternally
}
external var LINEAR: Any = definedExternally
external var NEAREST: Any = definedExternally
open external class Texture {
    constructor(manager: TextureManager, key: String, source: Array<HTMLImageElement>, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */)
    constructor(manager: TextureManager, key: String, source: Array<HTMLCanvasElement>, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */)

    open var manager: TextureManager
    open var key: String
    open var source: Array<TextureSource>
    open var dataSource: Array<Any>
    open var frames: Any
    open var customData: Any
    open var firstFrame: String
    open var frameTotal: Number
    open fun add(name: String, sourceIndex: Number, x: Number, y: Number, width: Number, height: Number): Frame = definedExternally
    open fun add(name: Number, sourceIndex: Number, x: Number, y: Number, width: Number, height: Number): Frame = definedExternally
    open fun has(name: String): Boolean = definedExternally
    open fun get(name: String? = definedExternally /* null */): Frame = definedExternally
    open fun get(name: Number? = definedExternally /* null */): Frame = definedExternally
    open fun getTextureSourceIndex(source: TextureSource): Number = definedExternally
    open fun getFramesFromTextureSource(sourceIndex: Number, includeBase: Boolean? = definedExternally /* null */): Array<Frame> = definedExternally
    open fun getFrameNames(includeBase: Boolean? = definedExternally /* null */): Array<String> = definedExternally
    open fun getSourceImage(name: String? = definedExternally /* null */): dynamic /* HTMLCanvasElement | Phaser.GameObjects.RenderTexture | HTMLImageElement */ = definedExternally
    open fun getSourceImage(name: Number? = definedExternally /* null */): dynamic /* HTMLCanvasElement | Phaser.GameObjects.RenderTexture | HTMLImageElement */ = definedExternally
    open fun getDataSourceImage(name: String? = definedExternally /* null */): dynamic /* HTMLCanvasElement | HTMLImageElement */ = definedExternally
    open fun getDataSourceImage(name: Number? = definedExternally /* null */): dynamic /* HTMLCanvasElement | HTMLImageElement */ = definedExternally
    open fun setDataSource(data: HTMLCanvasElement): Unit = definedExternally
    open fun setDataSource(data: HTMLImageElement): Unit = definedExternally
    open fun setFilter(filterMode: FilterMode): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
    open fun get(): Frame = definedExternally
    open fun getSourceImage(): dynamic /* HTMLCanvasElement | Phaser.GameObjects.RenderTexture | HTMLImageElement */ = definedExternally
    open fun getDataSourceImage(): dynamic /* HTMLCanvasElement | HTMLImageElement */ = definedExternally
}
open external class TextureManager(game: Phaser.Game) : org.decembrist.Phaser.Events.EventEmitter {
    open var game: Phaser.Game = definedExternally
    open var name: String = definedExternally
    open var list: Any = definedExternally
    open fun checkKey(key: String): Boolean = definedExternally
    open fun remove(key: String): TextureManager = definedExternally
    open fun remove(key: Texture): TextureManager = definedExternally
    open fun addBase64(key: String, data: Any): TextureManager /* this */ = definedExternally
    open fun getBase64(key: String, frame: String? = definedExternally /* null */, type: String? = definedExternally /* null */, encoderOptions: Number? = definedExternally /* null */): String = definedExternally
    open fun getBase64(key: String, frame: Number? = definedExternally /* null */, type: String? = definedExternally /* null */, encoderOptions: Number? = definedExternally /* null */): String = definedExternally
    open fun addImage(key: String, source: HTMLImageElement, dataSource: HTMLImageElement? = definedExternally /* null */): Texture = definedExternally
    open fun addRenderTexture(key: String, renderTexture: org.decembrist.Phaser.GameObjects.RenderTexture): Texture = definedExternally
    open fun generate(key: String, config: Any): Texture = definedExternally
    open fun createCanvas(key: String, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): CanvasTexture = definedExternally
    open fun addCanvas(key: String, source: HTMLCanvasElement, skipCache: Boolean? = definedExternally /* null */): CanvasTexture = definedExternally
    open fun addAtlas(key: String, source: HTMLImageElement, data: Any, dataSource: HTMLImageElement? = definedExternally /* null */): Texture = definedExternally
    open fun addAtlasJSONArray(key: String, source: HTMLImageElement, data: Any?, dataSource: HTMLImageElement? = definedExternally /* null */): Texture = definedExternally
    open fun addAtlasJSONArray(key: String, source: HTMLImageElement, data: Array<Any?>, dataSource: HTMLImageElement? = definedExternally /* null */): Texture = definedExternally
    open fun addAtlasJSONArray(key: String, source: Array<HTMLImageElement>, data: Any?, dataSource: HTMLImageElement? = definedExternally /* null */): Texture = definedExternally
    open fun addAtlasJSONArray(key: String, source: Array<HTMLImageElement>, data: Array<Any?>, dataSource: HTMLImageElement? = definedExternally /* null */): Texture = definedExternally
    open fun addAtlasJSONHash(key: String, source: HTMLImageElement, data: Any, dataSource: HTMLImageElement? = definedExternally /* null */): Texture = definedExternally
    open fun addAtlasXML(key: String, source: HTMLImageElement, data: Any, dataSource: HTMLImageElement? = definedExternally /* null */): Texture = definedExternally
    open fun addUnityAtlas(key: String, source: HTMLImageElement, data: Any, dataSource: HTMLImageElement? = definedExternally /* null */): Texture = definedExternally
    open fun addSpriteSheet(key: String, source: HTMLImageElement, config: SpriteSheetConfig): Texture = definedExternally
    open fun addSpriteSheetFromAtlas(key: String, config: SpriteSheetFromAtlasConfig): Texture = definedExternally
    open fun create(key: String, source: HTMLImageElement, width: Number, height: Number): Texture = definedExternally
    open fun exists(key: String): Boolean = definedExternally
    open fun get(key: String): Texture = definedExternally
    open fun cloneFrame(key: String, frame: String): Frame = definedExternally
    open fun cloneFrame(key: String, frame: Number): Frame = definedExternally
    open fun getFrame(key: String, frame: String? = definedExternally /* null */): Frame = definedExternally
    open fun getFrame(key: String, frame: Number? = definedExternally /* null */): Frame = definedExternally
    open fun getTextureKeys(): Array<String> = definedExternally
    open fun getPixel(x: Number, y: Number, key: String, frame: String): Display.Color = definedExternally
    open fun getPixel(x: Number, y: Number, key: String, frame: Number): Display.Color = definedExternally
    open fun getPixelAlpha(x: Number, y: Number, key: String, frame: String): Number = definedExternally
    open fun getPixelAlpha(x: Number, y: Number, key: String, frame: Number): Number = definedExternally
    open fun setTexture(gameObject: org.decembrist.Phaser.GameObjects.GameObject, key: String, frame: String): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    open fun setTexture(gameObject: org.decembrist.Phaser.GameObjects.GameObject, key: String, frame: Number): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    open fun renameTexture(currentKey: String, newKey: String): Boolean = definedExternally
    open fun each(callback: (texture: Texture, args: Any) -> Unit, scope: Any, vararg args: Any): Unit = definedExternally
    override fun destroy(): Unit = definedExternally
    open fun getBase64(key: String): String = definedExternally
    open fun getFrame(key: String): Frame = definedExternally
}
open external class TextureSource {
    constructor(texture: Texture, source: HTMLCanvasElement, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */)
    constructor(texture: Texture, source: HTMLImageElement, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */)

    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */
    open var texture: Texture
    open var source: dynamic /* HTMLCanvasElement | Phaser.GameObjects.RenderTexture | HTMLImageElement */
    open var image: dynamic /* HTMLCanvasElement | HTMLImageElement */
    open var compressionAlgorithm: Number
    open var resolution: Number
    open var width: Number
    open var height: Number
    open var scaleMode: Number
    open var isCanvas: Boolean
    open var isRenderTexture: Boolean
    open var isPowerOf2: Boolean
    open var glTexture: WebGLTexture
    open fun init(game: Phaser.Game): Unit = definedExternally
    open fun setFilter(filterMode: FilterMode): Unit = definedExternally
    open fun update(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
