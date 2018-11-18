package org.decembrist.utils

import org.decembrist.Phaser.Display.Display
import org.decembrist.Phaser.Phaser
import org.w3c.dom.*
import org.w3c.dom.events.EventTarget
import org.w3c.dom.events.UIEvent
import kotlin.js.Promise

external interface Config

external interface GridAlignConfig: Config {
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var cellWidth: Number? get() = definedExternally; set(value) = definedExternally
    var cellHeight: Number? get() = definedExternally; set(value) = definedExternally
    var position: Number? get() = definedExternally; set(value) = definedExternally
    var x: Number? get() = definedExternally; set(value) = definedExternally
    var y: Number? get() = definedExternally; set(value) = definedExternally
}

external interface JSONAnimation: Config {
    var key: String
    var type: String
    var frames: Array<JSONAnimationFrame>
    var frameRate: Number
    var duration: Number
    var skipMissedFrames: Boolean
    var delay: Number
    var repeat: Number
    var repeatDelay: Number
    var yoyo: Boolean
    var showOnStart: Boolean
    var hideOnComplete: Boolean
}

external interface AnimationFrameConfig: Config {
    var key: String
    var frame: dynamic /* String | Number */
    var duration: Number? get() = definedExternally; set(value) = definedExternally
    var visible: Boolean? get() = definedExternally; set(value) = definedExternally
}

external interface AnimationConfig: Config {
    var key: String? get() = definedExternally; set(value) = definedExternally
    var frames: Array<AnimationFrameConfig>? get() = definedExternally; set(value) = definedExternally
    var defaultTextureKey: String? get() = definedExternally; set(value) = definedExternally
    var frameRate: Number? get() = definedExternally; set(value) = definedExternally
    var duration: Number? get() = definedExternally; set(value) = definedExternally
    var skipMissedFrames: Boolean? get() = definedExternally; set(value) = definedExternally
    var delay: Number? get() = definedExternally; set(value) = definedExternally
    var repeat: Number? get() = definedExternally; set(value) = definedExternally
    var repeatDelay: Number? get() = definedExternally; set(value) = definedExternally
    var yoyo: Boolean? get() = definedExternally; set(value) = definedExternally
    var showOnStart: Boolean? get() = definedExternally; set(value) = definedExternally
    var hideOnComplete: Boolean? get() = definedExternally; set(value) = definedExternally
}

external interface JSONAnimationFrame: Config {
    var key: String
    var frame: dynamic /* String | Number */
    var duration: Number
}

external interface JSONAnimationManager: Config {
    var anims: Array<JSONAnimation>
    var globalTimeScale: Number
}

external interface GenerateFrameNamesConfig: Config {
    var prefix: String? get() = definedExternally; set(value) = definedExternally
    var start: Number? get() = definedExternally; set(value) = definedExternally
    var end: Number? get() = definedExternally; set(value) = definedExternally
    var suffix: String? get() = definedExternally; set(value) = definedExternally
    var zeroPad: Number? get() = definedExternally; set(value) = definedExternally
    var outputArray: Array<AnimationFrameConfig>? get() = definedExternally; set(value) = definedExternally
    var frames: Boolean? get() = definedExternally; set(value) = definedExternally
}

external interface GenerateFrameNumbersConfig: Config {
    var start: Number? get() = definedExternally; set(value) = definedExternally
    var end: Number? get() = definedExternally; set(value) = definedExternally
    var first: dynamic /* Number | Boolean */ get() = definedExternally; set(value) = definedExternally
    var outputArray: Array<AnimationFrameConfig>? get() = definedExternally; set(value) = definedExternally
    var frames: dynamic /* Boolean | Array<Number> */ get() = definedExternally; set(value) = definedExternally
}

external interface InputConfig: Config {
    var keyboard: dynamic /* Boolean | KeyboardInputConfig */ get() = definedExternally; set(value) = definedExternally
    var mouse: dynamic /* Boolean | MouseInputConfig */ get() = definedExternally; set(value) = definedExternally
    var touch: dynamic /* Boolean | TouchInputConfig */ get() = definedExternally; set(value) = definedExternally
    var gamepad: dynamic /* Boolean | GamepadInputConfig */ get() = definedExternally; set(value) = definedExternally
    var activePointers: Number? get() = definedExternally; set(value) = definedExternally
}

external interface MouseInputConfig: Config {
    var target: Any? get() = definedExternally; set(value) = definedExternally
    var capture: Boolean? get() = definedExternally; set(value) = definedExternally
}

external interface KeyboardInputConfig: Config {
    var target: Any? get() = definedExternally; set(value) = definedExternally
}

external interface TouchInputConfig: Config {
    var target: Any? get() = definedExternally; set(value) = definedExternally
    var capture: Boolean? get() = definedExternally; set(value) = definedExternally
}

external interface GamepadInputConfig: Config {
    var target: Any? get() = definedExternally; set(value) = definedExternally
}

external interface BannerConfig: Config {
    var hidePhaser: Boolean? get() = definedExternally; set(value) = definedExternally
    var text: String? get() = definedExternally; set(value) = definedExternally
    var background: Array<String>? get() = definedExternally; set(value) = definedExternally
}

external interface FPSConfig: Config {
    var min: Number? get() = definedExternally; set(value) = definedExternally
    var target: Number? get() = definedExternally; set(value) = definedExternally
    var forceSetTimeOut: Boolean? get() = definedExternally; set(value) = definedExternally
    var deltaHistory: Number? get() = definedExternally; set(value) = definedExternally
    var panicMax: Number? get() = definedExternally; set(value) = definedExternally
}

external interface RenderConfig: Config {
    var antialias: Boolean? get() = definedExternally; set(value) = definedExternally
    var pixelArt: Boolean? get() = definedExternally; set(value) = definedExternally
    var autoResize: Boolean? get() = definedExternally; set(value) = definedExternally
    var roundPixels: Boolean? get() = definedExternally; set(value) = definedExternally
    var transparent: Boolean? get() = definedExternally; set(value) = definedExternally
    var clearBeforeRender: Boolean? get() = definedExternally; set(value) = definedExternally
    var premultipliedAlpha: Boolean? get() = definedExternally; set(value) = definedExternally
    var preserveDrawingBuffer: Boolean? get() = definedExternally; set(value) = definedExternally
    var failIfMajorPerformanceCaveat: Boolean? get() = definedExternally; set(value) = definedExternally
    var powerPreference: String? get() = definedExternally; set(value) = definedExternally
    var batchSize: Number? get() = definedExternally; set(value) = definedExternally
}

external interface ScaleConfig: Config {
    var width: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var height: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var zoom: Number? get() = definedExternally; set(value) = definedExternally
    var resolution: Number? get() = definedExternally; set(value) = definedExternally
    var parent: dynamic /* String | HTMLElement */ get() = definedExternally; set(value) = definedExternally
    var mode: Number? get() = definedExternally; set(value) = definedExternally
    var minWidth: Number? get() = definedExternally; set(value) = definedExternally
    var minHeight: Number? get() = definedExternally; set(value) = definedExternally
    var maxWidth: Number? get() = definedExternally; set(value) = definedExternally
    var maxHeight: Number? get() = definedExternally; set(value) = definedExternally
}

external interface CallbacksConfig: Config {
    var preBoot: ((game: Phaser.Game) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var postBoot: ((game: Phaser.Game) -> Unit)? get() = definedExternally; set(value) = definedExternally
}

external interface LoaderConfig: Config {
    var baseURL: String? get() = definedExternally; set(value) = definedExternally
    var path: String? get() = definedExternally; set(value) = definedExternally
    var maxParallelDownloads: Number? get() = definedExternally; set(value) = definedExternally
    var crossOrigin: String? get() = definedExternally; set(value) = definedExternally
    var responseType: String? get() = definedExternally; set(value) = definedExternally
    var async: Boolean? get() = definedExternally; set(value) = definedExternally
    var user: String? get() = definedExternally; set(value) = definedExternally
    var password: String? get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
}

external interface DOMContainerConfig: Config {
    var createContainer: Boolean? get() = definedExternally; set(value) = definedExternally
    var behindCanvas: Boolean? get() = definedExternally; set(value) = definedExternally
}

external interface ImagesConfig: Config {
    var default: String? get() = definedExternally; set(value) = definedExternally
    var missing: String? get() = definedExternally; set(value) = definedExternally
}

external interface PhysicsConfig: Config {
    var default: String? get() = definedExternally; set(value) = definedExternally
    var arcade: ArcadeWorldConfig? get() = definedExternally; set(value) = definedExternally
    var impact: org.decembrist.Phaser.Physics.Impact.WorldConfig? get() = definedExternally; set(value) = definedExternally
    var matter: Any? get() = definedExternally; set(value) = definedExternally
}

external interface PluginObjectItem: Config {
    var key: String? get() = definedExternally; set(value) = definedExternally
    var plugin: Any? get() = definedExternally; set(value) = definedExternally
    var start: Boolean? get() = definedExternally; set(value) = definedExternally
    var systemKey: String? get() = definedExternally; set(value) = definedExternally
    var sceneKey: String? get() = definedExternally; set(value) = definedExternally
    var data: Any? get() = definedExternally; set(value) = definedExternally
}

external interface PluginObject: Config {
    val global: Array<PluginObjectItem>? get() = definedExternally
    val scene: Array<PluginObjectItem>? get() = definedExternally
    val default: Array<String>? get() = definedExternally
    val defaultMerge: Array<String>? get() = definedExternally
}

external interface GameConfig: Config {
    var width: Number? /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var height: Number? /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var zoom: Number? get() = definedExternally; set(value) = definedExternally
    var resolution: Number? get() = definedExternally; set(value) = definedExternally
    var type: Number? get() = definedExternally; set(value) = definedExternally
    var parent: dynamic /* String | HTMLElement */ get() = definedExternally; set(value) = definedExternally
    var canvas: HTMLCanvasElement? get() = definedExternally; set(value) = definedExternally
    var canvasStyle: String? get() = definedExternally; set(value) = definedExternally
    var context: CanvasRenderingContext2D? get() = definedExternally; set(value) = definedExternally
    var scene: Array<JsClass<out Phaser.Scene>>? get() = definedExternally; set(value) = definedExternally
    var seed: Array<String>? get() = definedExternally; set(value) = definedExternally
    var title: String? get() = definedExternally; set(value) = definedExternally
    var url: String? get() = definedExternally; set(value) = definedExternally
    var version: String? get() = definedExternally; set(value) = definedExternally
    var autoFocus: Boolean? get() = definedExternally; set(value) = definedExternally
    var input: dynamic /* Boolean | InputConfig */ get() = definedExternally; set(value) = definedExternally
    var disableContextMenu: Boolean? get() = definedExternally; set(value) = definedExternally
    var banner: dynamic /* Boolean | BannerConfig */ get() = definedExternally; set(value) = definedExternally
    var dom: DOMContainerConfig? get() = definedExternally; set(value) = definedExternally
    var fps: FPSConfig? get() = definedExternally; set(value) = definedExternally
    var render: RenderConfig? get() = definedExternally; set(value) = definedExternally
    var backgroundColor: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var callbacks: CallbacksConfig? get() = definedExternally; set(value) = definedExternally
    var loader: LoaderConfig? get() = definedExternally; set(value) = definedExternally
    var images: ImagesConfig? get() = definedExternally; set(value) = definedExternally
    var physics: Any? get() = definedExternally; set(value) = definedExternally
    var plugins: dynamic /* Array<PluginObjectItem> | PluginObject */ get() = definedExternally; set(value) = definedExternally
}

external interface JSONCameraBounds: Config {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
}

external interface JSONCamera: Config {
    var name: String
    var x: Number
    var y: Number
    var width: Number
    var height: Number
    var zoom: Number
    var rotation: Number
    var roundPixels: Boolean
    var scrollX: Number
    var scrollY: Number
    var backgroundColor: String
    var bounds: JSONCameraBounds? get() = definedExternally; set(value) = definedExternally
}

external interface InputJSONCameraObject: Config {
    var name: String? get() = definedExternally; set(value) = definedExternally
    var x: Number? get() = definedExternally; set(value) = definedExternally
    var y: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var zoom: Number? get() = definedExternally; set(value) = definedExternally
    var rotation: Number? get() = definedExternally; set(value) = definedExternally
    var roundPixels: Boolean? get() = definedExternally; set(value) = definedExternally
    var scrollX: Number? get() = definedExternally; set(value) = definedExternally
    var scrollY: Number? get() = definedExternally; set(value) = definedExternally
    var backgroundColor: dynamic /* String | Boolean */ get() = definedExternally; set(value) = definedExternally
    var bounds: Any? get() = definedExternally; set(value) = definedExternally
}

external interface FixedKeyControlConfig: Config {
    var camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? get() = definedExternally; set(value) = definedExternally
    var left: org.decembrist.Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
    var right: org.decembrist.Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
    var up: org.decembrist.Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
    var down: org.decembrist.Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
    var zoomIn: org.decembrist.Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
    var zoomOut: org.decembrist.Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
    var zoomSpeed: Number? get() = definedExternally; set(value) = definedExternally
    var speed: dynamic /* Number | Any */ get() = definedExternally; set(value) = definedExternally
}

external interface SmoothedKeyControlConfig: Config {
    var camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? get() = definedExternally; set(value) = definedExternally
    var left: org.decembrist.Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
    var right: org.decembrist.Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
    var up: org.decembrist.Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
    var zoomIn: org.decembrist.Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
    var zoomOut: org.decembrist.Phaser.Input.Keyboard.Key? get() = definedExternally; set(value) = definedExternally
    var zoomSpeed: Number? get() = definedExternally; set(value) = definedExternally
    var acceleration: dynamic /* Number | Any */ get() = definedExternally; set(value) = definedExternally
    var drag: dynamic /* Number | Any */ get() = definedExternally; set(value) = definedExternally
    var maxSpeed: dynamic /* Number | Any */ get() = definedExternally; set(value) = definedExternally
}

external interface GenerateTextureConfig: Config {
    var data: Array<Any>? get() = definedExternally; set(value) = definedExternally
    var canvas: HTMLCanvasElement? get() = definedExternally; set(value) = definedExternally
    var palette: Palette? get() = definedExternally; set(value) = definedExternally
    var pixelWidth: Number? get() = definedExternally; set(value) = definedExternally
    var pixelHeight: Number? get() = definedExternally; set(value) = definedExternally
    var resizeCanvas: Boolean? get() = definedExternally; set(value) = definedExternally
    var clearCanvas: Boolean? get() = definedExternally; set(value) = definedExternally
    var preRender: ((canvas: HTMLCanvasElement, context: CanvasRenderingContext2D) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var postRender: ((canvas: HTMLCanvasElement, context: CanvasRenderingContext2D) -> Unit)? get() = definedExternally; set(value) = definedExternally
}

external interface Palette: Config {
    var A: String
    var B: String
    var C: String
    var D: String
    var E: String
    var F: String
}

external interface JSONEllipseCurve: Config {
    var type: String
    var x: Number
    var y: Number
    var xRadius: Number
    var yRadius: Number
    var startAngle: Number
    var endAngle: Number
    var clockwise: Boolean
    var rotation: Number
}

external interface EllipseCurveConfig: Config {
    var x: Number? get() = definedExternally; set(value) = definedExternally
    var y: Number? get() = definedExternally; set(value) = definedExternally
    var xRadius: Number? get() = definedExternally; set(value) = definedExternally
    var yRadius: Number? get() = definedExternally; set(value) = definedExternally
    var startAngle: Number? get() = definedExternally; set(value) = definedExternally
    var endAngle: Number? get() = definedExternally; set(value) = definedExternally
    var clockwise: Boolean? get() = definedExternally; set(value) = definedExternally
    var rotation: Number? get() = definedExternally; set(value) = definedExternally
}

external interface JSONCurve: Config {
    var type: String
    var points: Array<Number>
}

external interface JSONPath: Config {
    var type: String
    var x: Number
    var y: Number
    var autoClose: Boolean
    var curves: Array<JSONCurve>
}

external interface InputColorObject: Config {
    var r: Number? get() = definedExternally; set(value) = definedExternally
    var g: Number? get() = definedExternally; set(value) = definedExternally
    var b: Number? get() = definedExternally; set(value) = definedExternally
    var a: Number? get() = definedExternally; set(value) = definedExternally
}

external interface HSVColorObject: Config {
    var h: Number
    var s: Number
    var v: Number
}

external interface DisplayCallbackConfig: Config {
    var tint: Any
    var index: Number
    var charCode: Number
    var x: Number
    var y: Number
    var scale: Number
    var rotation: Number
    var data: Any
}

external interface BitmapTextSize: Config {
    var global: GlobalBitmapTextSize
    var local: LocalBitmapTextSize
}

external interface GlobalBitmapTextSize: Config {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
}

external interface LocalBitmapTextSize: Config {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
}

external interface `T$0` {
    operator fun get(key: String): Number?
    operator fun set(key: String, value: Number)
}

external interface BitmapFontCharacterData: Config {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
    var centerX: Number
    var centerY: Number
    var xOffset: Number
    var yOffset: Number
    var data: Any
    var kerning: `T$0`
}

external interface `T$1` {
    operator fun get(key: Number): BitmapFontCharacterData?
    operator fun set(key: Number, value: BitmapFontCharacterData)
}

external interface BitmapFontData: Config {
    var font: String
    var size: Number
    var lineHeight: Number
    var retroFont: Boolean
    var chars: `T$1`
}

external interface GameObjectConfig: Config {
    var x: Number? get() = definedExternally; set(value) = definedExternally
    var y: Number? get() = definedExternally; set(value) = definedExternally
    var depth: Number? get() = definedExternally; set(value) = definedExternally
    var flipX: Boolean? get() = definedExternally; set(value) = definedExternally
    var flipY: Boolean? get() = definedExternally; set(value) = definedExternally
    var scale: dynamic /* Number | Any? */ get() = definedExternally; set(value) = definedExternally
    var scrollFactor: dynamic /* Number | Any? */ get() = definedExternally; set(value) = definedExternally
    var rotation: Number? get() = definedExternally; set(value) = definedExternally
    var angle: Number? get() = definedExternally; set(value) = definedExternally
    var alpha: Number? get() = definedExternally; set(value) = definedExternally
    var origin: dynamic /* Number | Any? */ get() = definedExternally; set(value) = definedExternally
    var scaleMode: Number? get() = definedExternally; set(value) = definedExternally
    var blendMode: Number? get() = definedExternally; set(value) = definedExternally
    var visible: Boolean? get() = definedExternally; set(value) = definedExternally
    var add: Boolean? get() = definedExternally; set(value) = definedExternally
}

external interface JSONGameObject: Config {
    var name: String
    var type: String
    var x: Number
    var y: Number
    var scale: Any
    var origin: Any
    var flipX: Boolean
    var flipY: Boolean
    var rotation: Number
    var alpha: Number
    var visible: Boolean
    var scaleMode: Number
    var blendMode: dynamic /* String | Number */
    var textureKey: String
    var frameKey: String
    var data: Any
}

external interface GraphicsLineStyle: Config {
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var color: Number? get() = definedExternally; set(value) = definedExternally
    var alpha: Number? get() = definedExternally; set(value) = definedExternally
}

external interface GraphicsFillStyle: Config {
    var color: Number? get() = definedExternally; set(value) = definedExternally
    var alpha: Number? get() = definedExternally; set(value) = definedExternally
}

external interface GraphicsStyles: Config {
    var lineStyle: GraphicsLineStyle? get() = definedExternally; set(value) = definedExternally
    var fillStyle: GraphicsFillStyle? get() = definedExternally; set(value) = definedExternally
}

external interface GroupConfig: Config {
    var classType: Any? get() = definedExternally; set(value) = definedExternally
    var active: Boolean? get() = definedExternally; set(value) = definedExternally
    var maxSize: Number? get() = definedExternally; set(value) = definedExternally
    var defaultKey: String? get() = definedExternally; set(value) = definedExternally
    var defaultFrame: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var runChildUpdate: Boolean? get() = definedExternally; set(value) = definedExternally
    var createCallback: ((item: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var removeCallback: ((item: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var createMultipleCallback: ((items: Array<org.decembrist.Phaser.GameObjects.GameObject>) -> Unit)? get() = definedExternally; set(value) = definedExternally
}

external interface GroupCreateConfig: Config {
    var classType: Any? get() = definedExternally; set(value) = definedExternally
    var key: String? get() = definedExternally; set(value) = definedExternally
    var frame: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
    var visible: Boolean? get() = definedExternally; set(value) = definedExternally
    var active: Boolean? get() = definedExternally; set(value) = definedExternally
    var repeat: Number? get() = definedExternally; set(value) = definedExternally
    var randomKey: Boolean? get() = definedExternally; set(value) = definedExternally
    var randomFrame: Boolean? get() = definedExternally; set(value) = definedExternally
    var yoyo: Boolean? get() = definedExternally; set(value) = definedExternally
    var frameQuantity: Number? get() = definedExternally; set(value) = definedExternally
    var max: Number? get() = definedExternally; set(value) = definedExternally
    var setXY: Any? get() = definedExternally; set(value) = definedExternally
    var setRotation: Any? get() = definedExternally; set(value) = definedExternally
    var setScale: Any? get() = definedExternally; set(value) = definedExternally
    var setAlpha: Any? get() = definedExternally; set(value) = definedExternally
    var hitArea: Any? get() = definedExternally; set(value) = definedExternally
    var hitAreaCallback: ((hitArea: Any, x: Number, y: Number, gameObject: org.decembrist.Phaser.GameObjects.GameObject) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var gridAlign: dynamic /* Boolean | GridAlignConfig */ get() = definedExternally; set(value) = definedExternally
}

external interface EmitterOpRandomConfig: Config {
    var random: Array<Number>
}

external interface EmitterOpRandomMinMaxConfig: Config {
    var min: Number
    var max: Number
}

external interface EmitterOpRandomStartEndConfig: Config {
    var start: Number
    var end: Number
    var random: Boolean
}

external interface EmitterOpEaseConfig: Config {
    var start: Number
    var end: Number
    var ease: String? get() = definedExternally; set(value) = definedExternally
}

external interface EmitterOpSteppedConfig: Config {
    var start: Number
    var end: Number
    var steps: Number
}

external interface EmitterOpCustomEmitConfig: Config {
    var onEmit: (particle: org.decembrist.Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit
}

external interface EmitterOpCustomUpdateConfig {
    var onEmit: ((particle: org.decembrist.Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit)? get() = definedExternally; set(value) = definedExternally
    var onUpdate: (particle: org.decembrist.Phaser.GameObjects.Particles.Particle, key: String, t: Number, value: Number) -> Unit
}

external interface GravityWellConfig: Config {
    var x: Number? get() = definedExternally; set(value) = definedExternally
    var y: Number? get() = definedExternally; set(value) = definedExternally
    var power: Number? get() = definedExternally; set(value) = definedExternally
    var epsilon: Number? get() = definedExternally; set(value) = definedExternally
    var gravity: Number? get() = definedExternally; set(value) = definedExternally
}

external interface ParticleEmitterBounds: Config {
    var x: Number
    var y: Number
    var width: Number
    var height: Number
}

external interface ParticleEmitterBoundsAlt: Config {
    var x: Number
    var y: Number
    var w: Number
    var h: Number
}

external interface ParticleEmitterDeathZoneConfig: Config {
    var source: DeathZoneSource
    var type: String? get() = definedExternally; set(value) = definedExternally
}

external interface ParticleEmitterEdgeZoneConfig: Config {
    var source: EdgeZoneSource
    var type: String
    var quantity: Number
    var stepRate: Number? get() = definedExternally; set(value) = definedExternally
    var yoyo: Boolean? get() = definedExternally; set(value) = definedExternally
    var seamless: Boolean? get() = definedExternally; set(value) = definedExternally
}

external interface ParticleEmitterRandomZoneConfig: Config {
    var source: RandomZoneSource
    var type: String? get() = definedExternally; set(value) = definedExternally
}

external interface ParticleEmitterConfig: Config {
    var active: Boolean? get() = definedExternally; set(value) = definedExternally
    var blendMode: Number? get() = definedExternally; set(value) = definedExternally
    var callbackScope: Any? get() = definedExternally; set(value) = definedExternally
    var collideBottom: Boolean? get() = definedExternally; set(value) = definedExternally
    var collideLeft: Boolean? get() = definedExternally; set(value) = definedExternally
    var collideRight: Boolean? get() = definedExternally; set(value) = definedExternally
    var collideTop: Boolean? get() = definedExternally; set(value) = definedExternally
    var deathCallback: Boolean? get() = definedExternally; set(value) = definedExternally
    var deathCallbackScope: Any? get() = definedExternally; set(value) = definedExternally
    var emitCallback: Function<*>? get() = definedExternally; set(value) = definedExternally
    var emitCallbackScope: Any? get() = definedExternally; set(value) = definedExternally
    var follow: org.decembrist.Phaser.GameObjects.GameObject? get() = definedExternally; set(value) = definedExternally
    var frequency: Number? get() = definedExternally; set(value) = definedExternally
    var gravityX: Number? get() = definedExternally; set(value) = definedExternally
    var gravityY: Number? get() = definedExternally; set(value) = definedExternally
    var maxParticles: Number? get() = definedExternally; set(value) = definedExternally
    var name: String? get() = definedExternally; set(value) = definedExternally
    var on: Boolean? get() = definedExternally; set(value) = definedExternally
    var particleBringToTop: Boolean? get() = definedExternally; set(value) = definedExternally
    var particleClass: org.decembrist.Phaser.GameObjects.Particles.Particle? get() = definedExternally; set(value) = definedExternally
    var radial: Boolean? get() = definedExternally; set(value) = definedExternally
    var timeScale: Number? get() = definedExternally; set(value) = definedExternally
    var trackVisible: Boolean? get() = definedExternally; set(value) = definedExternally
    var visible: Boolean? get() = definedExternally; set(value) = definedExternally
    var accelerationX: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var accelerationY: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var alpha: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, t: Number, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var angle: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var bounce: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var delay: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var lifespan: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var maxVelocityX: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var maxVelocityY: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var moveToX: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var moveToY: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var quantity: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var rotate: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, t: Number, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var scale: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, t: Number, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var scaleX: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, t: Number, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var scaleY: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, t: Number, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var speed: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var speedX: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var speedY: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var tint: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var x: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var y: dynamic /* Number | Any? | Array<Number> | (particle: Phaser.GameObjects.Particles.Particle, key: String, value: Number) -> Unit */ get() = definedExternally; set(value) = definedExternally
    var emitZone: Any? get() = definedExternally; set(value) = definedExternally
    var bounds: dynamic /* ParticleEmitterBounds | ParticleEmitterBoundsAlt */ get() = definedExternally; set(value) = definedExternally
    var followOffset: Any? get() = definedExternally; set(value) = definedExternally
    var frames: dynamic /* String | Number | Array<Number> | Array<String> | Phaser.Textures.Frame | Array<Phaser.Textures.Frame> | ParticleEmitterFrameConfig */ get() = definedExternally; set(value) = definedExternally
}

external interface ParticleEmitterFrameConfig: Config {
    var frames: dynamic /* String | Number | Array<Number> | Array<String> | Phaser.Textures.Frame | Array<Phaser.Textures.Frame> */ get() = definedExternally; set(value) = definedExternally
    var cycle: Boolean? get() = definedExternally; set(value) = definedExternally
    var quantity: Number? get() = definedExternally; set(value) = definedExternally
}

external interface DeathZoneSource: Config {
    var contains: (x: Number, y: Number) -> Unit
}

external interface EdgeZoneSource: Config {
    var getPoints: (quantity: Number, stepRate: Number? /*= null*/) -> Unit
}

external interface RandomZoneSource: Config {
    var getRandomPoint: (point: org.decembrist.Phaser.Math.Vector2) -> Unit
}

external interface PathConfig: Config {
    var duration: Number
    var from: Number
    var to: Number
    var positionOnPath: Boolean? get() = definedExternally; set(value) = definedExternally
    var rotateToPath: Boolean? get() = definedExternally; set(value) = definedExternally
    var rotationOffset: Number? get() = definedExternally; set(value) = definedExternally
    var verticalAdjust: Boolean? get() = definedExternally; set(value) = definedExternally
}

external interface RenderTextureConfig: Config {
    var x: Number? get() = definedExternally; set(value) = definedExternally
    var y: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
}

external interface BitmapTextMetrics: Config {
    var ascent: Number
    var descent: Number
    var fontSize: Number
}

external interface Pad: Config {
    var id: String
    var index: Number
}

external interface InputPluginContainer: Config {
    var key: String
    var plugin: Function<*>
    var mapping: String? get() = definedExternally; set(value) = definedExternally
}

external interface KeyComboConfig: Config {
    var resetOnWrongKey: Boolean? get() = definedExternally; set(value) = definedExternally
    var maxKeyDelay: Number? get() = definedExternally; set(value) = definedExternally
    var resetOnMatch: Boolean? get() = definedExternally; set(value) = definedExternally
    var deleteOnMatch: Boolean? get() = definedExternally; set(value) = definedExternally
}

external interface FileConfig: Config {
    var type: String
    var key: String
    var url: String? get() = definedExternally; set(value) = definedExternally
    var path: String? get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var responseType: dynamic /* String /* "" */ | String /* "arraybuffer" */ | String /* "blob" */ | String /* "document" */ | String /* "json" */ | String /* "text" */ */ get() = definedExternally; set(value) = definedExternally
    var xhrSettings: dynamic /* Boolean | XHRSettingsObject */ get() = definedExternally; set(value) = definedExternally
    var config: Any? get() = definedExternally; set(value) = definedExternally
}

external interface XHRSettingsObject: Config {
    var responseType: dynamic /* String /* "" */ | String /* "arraybuffer" */ | String /* "blob" */ | String /* "document" */ | String /* "json" */ | String /* "text" */ */
    var async: Boolean? get() = definedExternally; set(value) = definedExternally
    var user: String? get() = definedExternally; set(value) = definedExternally
    var password: String? get() = definedExternally; set(value) = definedExternally
    var timeout: Number? get() = definedExternally; set(value) = definedExternally
    var header: String? get() = definedExternally; set(value) = definedExternally
    var headerValue: String? get() = definedExternally; set(value) = definedExternally
    var requestedWith: String? get() = definedExternally; set(value) = definedExternally
    var overrideMimeType: String? get() = definedExternally; set(value) = definedExternally
}

external interface SinCosTable: Config {
    var sin: Number
    var cos: Number
    var length: Number
}

external interface Vector2Like: Config {
    var x: Number
    var y: Number
}

external interface ArcadeBodyBounds: Config {
    var x: Number
    var y: Number
    var right: Number
    var bottom: Number
}

external interface ArcadeBodyCollision: Config {
    var none: Boolean
    var up: Boolean
    var down: Boolean
    var left: Boolean
    var right: Boolean
}

external interface PhysicsGroupDefaults: Config {
    var setCollideWorldBounds: Boolean
    var setAccelerationX: Number
    var setAccelerationY: Number
    var setAllowDrag: Boolean
    var setAllowGravity: Boolean
    var setAllowRotation: Boolean
    var setBounceX: Number
    var setBounceY: Number
    var setDragX: Number
    var setDragY: Number
    var setGravityX: Number
    var setGravityY: Number
    var setFrictionX: Number
    var setFrictionY: Number
    var setVelocityX: Number
    var setVelocityY: Number
    var setAngularVelocity: Number
    var setAngularAcceleration: Number
    var setAngularDrag: Number
    var setMass: Number
    var setImmovable: Boolean
}

external interface ArcadeWorldConfig: Config {
    var fps: Number? get() = definedExternally; set(value) = definedExternally
    var timeScale: Number? get() = definedExternally; set(value) = definedExternally
    var gravity: Any? get() = definedExternally; set(value) = definedExternally
    var x: Number? get() = definedExternally; set(value) = definedExternally
    var y: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var checkCollision: Any? get() = definedExternally; set(value) = definedExternally
    var overlapBias: Number? get() = definedExternally; set(value) = definedExternally
    var tileBias: Number? get() = definedExternally; set(value) = definedExternally
    var forceX: Boolean? get() = definedExternally; set(value) = definedExternally
    var isPaused: Boolean? get() = definedExternally; set(value) = definedExternally
    var debug: Boolean? get() = definedExternally; set(value) = definedExternally
    var debugShowBody: Boolean? get() = definedExternally; set(value) = definedExternally
    var debugShowStaticBody: Boolean? get() = definedExternally; set(value) = definedExternally
    var debugShowVelocity: Boolean? get() = definedExternally; set(value) = definedExternally
    var debugBodyColor: Number? get() = definedExternally; set(value) = definedExternally
    var debugStaticBodyColor: Number? get() = definedExternally; set(value) = definedExternally
    var debugVelocityColor: Number? get() = definedExternally; set(value) = definedExternally
    var maxEntries: Number? get() = definedExternally; set(value) = definedExternally
    var useTree: Boolean? get() = definedExternally; set(value) = definedExternally
}

external interface CheckCollisionObject: Config {
    var up: Boolean
    var down: Boolean
    var left: Boolean
    var right: Boolean
}

external interface ArcadeWorldDefaults: Config {
    var debugShowBody: Boolean
    var debugShowStaticBody: Boolean
    var debugShowVelocity: Boolean
    var bodyDebugColor: Number
    var staticBodyDebugColor: Number
    var velocityDebugColor: Number
}

external interface ArcadeWorldTreeMinMax: Config {
    var minX: Number
    var minY: Number
    var maxX: Number
    var maxY: Number
}

external interface JSONImpactBody: Config {
    var name: String
    var size: Any
    var pos: Any
    var vel: Any
    var accel: Any
    var friction: Any
    var maxVel: Any
    var gravityFactor: Number
    var bounciness: Number
    var minBounceVelocity: Number
    var type: org.decembrist.Phaser.Physics.Impact.TYPE
    var checkAgainst: org.decembrist.Phaser.Physics.Impact.TYPE
    var collides: org.decembrist.Phaser.Physics.Impact.COLLIDES
}

external interface CorePluginContainer: Config {
    var key: String
    var plugin: Function<*>
    var mapping: String? get() = definedExternally; set(value) = definedExternally
    var custom: Boolean? get() = definedExternally; set(value) = definedExternally
}

external interface CustomPluginContainer: Config {
    var key: String
    var plugin: Function<*>
}

external interface GlobalPlugin: Config {
    var key: String
    var plugin: Function<*>
    var active: Boolean? get() = definedExternally; set(value) = definedExternally
    var mapping: String? get() = definedExternally; set(value) = definedExternally
}

external interface RendererConfig: Config {
    var clearBeforeRender: Boolean
    var antialias: Boolean
    var backgroundColor: Display.Color
    var resolution: Number
    var autoResize: Boolean
    var roundPixels: Boolean
}

external interface ModelViewProjection: Config {
    var modelMatrixDirty: Any
    var viewMatrixDirty: Any
    var projectionMatrixDirty: Any
    var modelMatrix: Any
    var viewMatrix: Any
    var projectionMatrix: Any
    fun mvpInit()
    fun mvpUpdate()
    fun modelIdentity()
    fun modelScale()
    fun modelTranslate()
    fun modelRotateX()
    fun modelRotateY()
    fun modelRotateZ()
    fun viewIdentity()
    fun viewScale()
    fun viewTranslate()
    fun viewRotateX()
    fun viewRotateY()
    fun viewRotateZ()
    fun viewLoad2D()
    fun viewLoad()
    fun projIdentity()
    fun projOrtho()
    fun projPersp()
}

external interface SnapshotState: Config {
    var callback: (snapshot: HTMLImageElement) -> Unit
    var type: String
    var encoder: Number
}

external interface SoundConfig: Config {
    var mute: Boolean? get() = definedExternally; set(value) = definedExternally
    var volume: Number? get() = definedExternally; set(value) = definedExternally
    var rate: Number? get() = definedExternally; set(value) = definedExternally
    var detune: Number? get() = definedExternally; set(value) = definedExternally
    var seek: Number? get() = definedExternally; set(value) = definedExternally
    var loop: Boolean? get() = definedExternally; set(value) = definedExternally
    var delay: Number? get() = definedExternally; set(value) = definedExternally
}

external interface SoundMarker: Config {
    var name: String
    var start: Number? get() = definedExternally; set(value) = definedExternally
    var duration: Number? get() = definedExternally; set(value) = definedExternally
    var config: SoundConfig? get() = definedExternally; set(value) = definedExternally
}

external interface SpriteSheetConfig: Config {
    var frameWidth: Number
    var frameHeight: Number? get() = definedExternally; set(value) = definedExternally
    var startFrame: Number? get() = definedExternally; set(value) = definedExternally
    var endFrame: Number? get() = definedExternally; set(value) = definedExternally
    var margin: Number? get() = definedExternally; set(value) = definedExternally
    var spacing: Number? get() = definedExternally; set(value) = definedExternally
}

external interface SpriteSheetFromAtlasConfig: Config {
    var atlas: String
    var frame: String
    var frameWidth: Number
    var frameHeight: Number? get() = definedExternally; set(value) = definedExternally
    var startFrame: Number? get() = definedExternally; set(value) = definedExternally
    var endFrame: Number? get() = definedExternally; set(value) = definedExternally
    var margin: Number? get() = definedExternally; set(value) = definedExternally
    var spacing: Number? get() = definedExternally; set(value) = definedExternally
}

external interface GetTilesWithinFilteringOptions: Config {
    var isNotEmpty: Boolean? get() = definedExternally; set(value) = definedExternally
    var isColliding: Boolean? get() = definedExternally; set(value) = definedExternally
    var hasInterestingFace: Boolean? get() = definedExternally; set(value) = definedExternally
}

external interface TilemapConfig: Config {
    var key: String? get() = definedExternally; set(value) = definedExternally
    var data: Array<Array<Number>>? get() = definedExternally; set(value) = definedExternally
    var tileWidth: Number? get() = definedExternally; set(value) = definedExternally
    var tileHeight: Number? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var insertNull: Boolean? get() = definedExternally; set(value) = definedExternally
}

external interface TimerEventConfig: Config {
    var delay: Number? get() = definedExternally; set(value) = definedExternally
    var repeat: Number? get() = definedExternally; set(value) = definedExternally
    var loop: Boolean? get() = definedExternally; set(value) = definedExternally
    var callback: Function<*>? get() = definedExternally; set(value) = definedExternally
    var callbackScope: Any? get() = definedExternally; set(value) = definedExternally
    var args: Array<Any>? get() = definedExternally; set(value) = definedExternally
    var timeScale: Number? get() = definedExternally; set(value) = definedExternally
    var startAt: Number? get() = definedExternally; set(value) = definedExternally
    var paused: Boolean? get() = definedExternally; set(value) = definedExternally
}

external interface TweenDataGenConfig: Config {
    var delay: Function<*>
    var duration: Function<*>
    var hold: Function<*>
    var repeat: Function<*>
    var repeatDelay: Function<*>
}

external interface AdInstance: Config {
    var instance: Any
    var placementID: String
    var shown: Boolean
    var video: Boolean
}

external interface LeaderboardScore: Config {
    var score: Number
    var scoreFormatted: String
    var timestamp: Number
    var rank: Number
    var data: String
    var playerName: String
    var playerPhotoURL: String
    var playerID: String
}

external interface Product: Config {
    var title: String? get() = definedExternally; set(value) = definedExternally
    var productID: String? get() = definedExternally; set(value) = definedExternally
    var description: String? get() = definedExternally; set(value) = definedExternally
    var imageURI: String? get() = definedExternally; set(value) = definedExternally
    var price: String? get() = definedExternally; set(value) = definedExternally
    var priceCurrencyCode: String? get() = definedExternally; set(value) = definedExternally
}

external interface Purchase: Config {
    var developerPayload: String? get() = definedExternally; set(value) = definedExternally
    var paymentID: String? get() = definedExternally; set(value) = definedExternally
    var productID: String? get() = definedExternally; set(value) = definedExternally
    var purchaseTime: String? get() = definedExternally; set(value) = definedExternally
    var purchaseToken: String? get() = definedExternally; set(value) = definedExternally
    var signedRequest: String? get() = definedExternally; set(value) = definedExternally
}

external interface FrameRequestCallback: Config {
    operator fun invoke(time: Number)
}

external interface TouchList: Config {
    val length: Number
    fun item(index: Number): Touch?
}

external interface GamepadHapticActuator: Config {
    val type: dynamic
    fun pulse(value: Number, duration: Number): Promise<Boolean>;
}

external interface AudioContext: Config {
    val baseLatency: Number
    val outputLatency: Number
}

external class TouchEvent : UIEvent, Config {
    val altKey: Boolean
    val changedTouches: TouchList
    val ctrlKey: Boolean
    val metaKey: Boolean
    val shiftKey: Boolean
    val targetTouches: TouchList
    val touches: TouchList
}

external class MouseEvent : UIEvent, Config {
    val altKey: Boolean
    val button: Number
    val buttons: Number
    val clientX: Number
    val clientY: Number
    val ctrlKey: Boolean
    /** @deprecated */
    val fromElement: Element
    val layerX: Number
    val layerY: Number
    val metaKey: Boolean
    val movementX: Number
    val movementY: Number
    val offsetX: Number
    val offsetY: Number
    val pageX: Number
    val pageY: Number
    val relatedTarget: EventTarget
    val screenX: Number
    val screenY: Number
    val shiftKey: Boolean
    /** @deprecated */
    val toElement: Element
    /** @deprecated */
    val which: Number
    val x: Number
    val y: Number
    fun getModifierState(keyArg: String): Boolean
    fun initMouseEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean, viewArg: Window, detailArg: Number, screenXArg: Number, screenYArg: Number, clientXArg: Number, clientYArg: Number, ctrlKeyArg: Boolean, altKeyArg: Boolean, shiftKeyArg: Boolean, metaKeyArg: Boolean, buttonArg: Number, relatedTargetArg: EventTarget?)
}