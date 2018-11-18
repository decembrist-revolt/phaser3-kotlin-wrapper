@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Boot")]
package org.decembrist.Phaser.Boot

import org.decembrist.Phaser.Display.Display
import org.decembrist.Phaser.Phaser
import org.decembrist.utils.FPSConfig
import org.decembrist.utils.GameConfig
import org.w3c.dom.HTMLCanvasElement

open external class Config(GameConfig: GameConfig? = definedExternally /* null */) {
    open var width: Number = definedExternally
    open var height: Number = definedExternally
    open var zoom: Number = definedExternally
    open var resolution: Number = definedExternally
    open var parent: Any = definedExternally
    open var scaleMode: Any = definedExternally
    open var renderType: Number = definedExternally
    open var canvas: HTMLCanvasElement = definedExternally
    open var context: dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */ = definedExternally
    open var canvasStyle: String = definedExternally
    open var sceneConfig: Any = definedExternally
    open var seed: Array<String> = definedExternally
    open var gameTitle: String = definedExternally
    open var gameURL: String = definedExternally
    open var gameVersion: String = definedExternally
    open var autoFocus: Boolean = definedExternally
    open var domCreateContainer: Boolean = definedExternally
    open var domBehindCanvas: Boolean = definedExternally
    open var inputKeyboard: Boolean = definedExternally
    open var inputKeyboardEventTarget: Any = definedExternally
    open var inputMouse: dynamic /* Boolean | Any? */ = definedExternally
    open var inputMouseEventTarget: Any = definedExternally
    open var inputMouseCapture: Boolean = definedExternally
    open var inputTouch: Boolean = definedExternally
    open var inputTouchEventTarget: Any = definedExternally
    open var inputTouchCapture: Boolean = definedExternally
    open var inputActivePointers: Number = definedExternally
    open var inputGamepad: Boolean = definedExternally
    open var inputGamepadEventTarget: Any = definedExternally
    open var disableContextMenu: Boolean = definedExternally
    open var audio: Any = definedExternally
    open var hideBanner: Boolean = definedExternally
    open var hidePhaser: Boolean = definedExternally
    open var bannerTextColor: String = definedExternally
    open var bannerBackgroundColor: Array<String> = definedExternally
    open var fps: FPSConfig = definedExternally
    open var autoResize: Boolean = definedExternally
    open var antialias: Boolean = definedExternally
    open var roundPixels: Boolean = definedExternally
    open var pixelArt: Boolean = definedExternally
    open var transparent: Boolean = definedExternally
    open var clearBeforeRender: Boolean = definedExternally
    open var premultipliedAlpha: Boolean = definedExternally
    open var preserveDrawingBuffer: Boolean = definedExternally
    open var failIfMajorPerformanceCaveat: Boolean = definedExternally
    open var powerPreference: String = definedExternally
    open var batchSize: Number = definedExternally
    open var backgroundColor: Display.Color = definedExternally
    open var preBoot: (game: Phaser.Game) -> Unit = definedExternally
    open var postBoot: (game: Phaser.Game) -> Unit = definedExternally
    open var physics: Any = definedExternally
    open var defaultPhysicsSystem: Boolean = definedExternally
    open var loaderBaseURL: String = definedExternally
    open var loaderPath: String = definedExternally
    open var loaderMaxParallelDownloads: Number = definedExternally
    open var loaderCrossOrigin: String? = definedExternally
    open var loaderResponseType: String = definedExternally
    open var loaderAsync: Boolean = definedExternally
    open var loaderUser: String = definedExternally
    open var loaderPassword: String = definedExternally
    open var loaderTimeout: Number = definedExternally
    open var installGlobalPlugins: Any = definedExternally
    open var installScenePlugins: Any = definedExternally
    open var defaultPlugins: Any = definedExternally
    open var defaultImage: String = definedExternally
    open var missingImage: String = definedExternally
}
external fun CreateRenderer(game: Phaser.Game): Unit = definedExternally
external fun DebugHeader(game: Phaser.Game): Unit = definedExternally
open external class ScaleManager(game: Phaser.Game, config: Any) {
    open var game: Phaser.Game = definedExternally
    open fun destroy(): Unit = definedExternally
}
open external class TimeStep(game: Phaser.Game, config: FPSConfig) {
    open var game: Phaser.Game = definedExternally
    open var raf: org.decembrist.Phaser.DOM.RequestAnimationFrame = definedExternally
    open var started: Boolean = definedExternally
    open var running: Boolean = definedExternally
    open var minFps: Number = definedExternally
    open var targetFps: Number = definedExternally
    open var actualFps: Number = definedExternally
    open var nextFpsUpdate: Number = definedExternally
    open var framesThisSecond: Number = definedExternally
    open var callback: (time: Number, average: Number, interpolation: Number) -> Unit = definedExternally
    open var forceSetTimeOut: Boolean = definedExternally
    open var time: Number = definedExternally
    open var startTime: Number = definedExternally
    open var lastTime: Number = definedExternally
    open var frame: Number = definedExternally
    open var inFocus: Boolean = definedExternally
    open var delta: Number = definedExternally
    open var deltaIndex: Number = definedExternally
    open var deltaHistory: Array<Number> = definedExternally
    open var deltaSmoothingMax: Number = definedExternally
    open var panicMax: Number = definedExternally
    open var rawDelta: Number = definedExternally
    open fun blur(): Unit = definedExternally
    open fun focus(): Unit = definedExternally
    open fun pause(): Unit = definedExternally
    open fun resume(): Unit = definedExternally
    open fun resetDelta(): Unit = definedExternally
    open fun start(callback: (time: Number, average: Number, interpolation: Number) -> Unit): Unit = definedExternally
    open fun step(time: Number): Unit = definedExternally
    open fun tick(): Unit = definedExternally
    open fun sleep(): Unit = definedExternally
    open fun wake(seamless: Boolean? = definedExternally /* null */): Unit = definedExternally
    open fun stop(): TimeStep = definedExternally
    open fun destroy(): Unit = definedExternally
}
external fun VisibilityHandler(game: Phaser.Game): Unit = definedExternally
