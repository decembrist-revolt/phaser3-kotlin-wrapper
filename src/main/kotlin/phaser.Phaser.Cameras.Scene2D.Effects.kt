@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Cameras.Scene2D.Effects")]
package Phaser.Cameras.Scene2D.Effects

import org.w3c.dom.CanvasRenderingContext2D

open external class Fade(camera: Phaser.Cameras.Scene2D.Camera) {
    open var camera: Phaser.Cameras.Scene2D.Camera = definedExternally
    open var isRunning: Boolean = definedExternally
    open var isComplete: Boolean = definedExternally
    open var direction: Boolean = definedExternally
    open var duration: Number = definedExternally
    open var progress: Number = definedExternally
    open fun start(direction: Boolean? = definedExternally /* null */, duration: Number? = definedExternally /* null */, red: Number? = definedExternally /* null */, green: Number? = definedExternally /* null */, blue: Number? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: ((camera: Phaser.Cameras.Scene2D.Camera, progress: Number) -> Unit)? = definedExternally /* null */, context: Any? = definedExternally /* null */): Phaser.Cameras.Scene2D.Camera = definedExternally
    open fun update(time: Number, delta: Number): Unit = definedExternally
    open fun postRenderCanvas(ctx: CanvasRenderingContext2D): Boolean = definedExternally
    open fun postRenderWebGL(pipeline: Phaser.Renderer.WebGL.Pipelines.TextureTintPipeline, getTintFunction: Function<*>): Boolean = definedExternally
    open fun effectComplete(): Unit = definedExternally
    open fun reset(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
open external class Flash(camera: Phaser.Cameras.Scene2D.Camera) {
    open var camera: Phaser.Cameras.Scene2D.Camera = definedExternally
    open var isRunning: Boolean = definedExternally
    open var duration: Number = definedExternally
    open var progress: Number = definedExternally
    open fun start(duration: Number? = definedExternally /* null */, red: Number? = definedExternally /* null */, green: Number? = definedExternally /* null */, blue: Number? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: ((camera: Phaser.Cameras.Scene2D.Camera, progress: Number) -> Unit)? = definedExternally /* null */, context: Any? = definedExternally /* null */): Phaser.Cameras.Scene2D.Camera = definedExternally
    open fun update(time: Number, delta: Number): Unit = definedExternally
    open fun postRenderCanvas(ctx: CanvasRenderingContext2D): Boolean = definedExternally
    open fun postRenderWebGL(pipeline: Phaser.Renderer.WebGL.Pipelines.TextureTintPipeline, getTintFunction: Function<*>): Boolean = definedExternally
    open fun effectComplete(): Unit = definedExternally
    open fun reset(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
open external class Pan(camera: Phaser.Cameras.Scene2D.Camera) {
    open var camera: Phaser.Cameras.Scene2D.Camera = definedExternally
    open var isRunning: Boolean = definedExternally
    open var duration: Number = definedExternally
    open var source: Phaser.Math.Vector2 = definedExternally
    open var current: Phaser.Math.Vector2 = definedExternally
    open var destination: Phaser.Math.Vector2 = definedExternally
    open var ease: Function<*> = definedExternally
    open var progress: Number = definedExternally
    open fun start(x: Number, y: Number, duration: Number? = definedExternally /* null */, ease: String? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: ((camera: Phaser.Cameras.Scene2D.Camera, progress: Number, x: Number, y: Number) -> Unit)? = definedExternally /* null */, context: Any? = definedExternally /* null */): Phaser.Cameras.Scene2D.Camera = definedExternally
    open fun start(x: Number, y: Number, duration: Number? = definedExternally /* null */, ease: Function<*>? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: ((camera: Phaser.Cameras.Scene2D.Camera, progress: Number, x: Number, y: Number) -> Unit)? = definedExternally /* null */, context: Any? = definedExternally /* null */): Phaser.Cameras.Scene2D.Camera = definedExternally
    open fun update(time: Number, delta: Number): Unit = definedExternally
    open fun effectComplete(): Unit = definedExternally
    open fun reset(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
    open fun start(x: Number, y: Number): Phaser.Cameras.Scene2D.Camera = definedExternally
}
open external class Shake(camera: Phaser.Cameras.Scene2D.Camera) {
    open var camera: Phaser.Cameras.Scene2D.Camera = definedExternally
    open var isRunning: Boolean = definedExternally
    open var duration: Number = definedExternally
    open var intensity: Phaser.Math.Vector2 = definedExternally
    open var progress: Number = definedExternally
    open fun start(duration: Number? = definedExternally /* null */, intensity: Number? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: ((camera: Phaser.Cameras.Scene2D.Camera, progress: Number) -> Unit)? = definedExternally /* null */, context: Any? = definedExternally /* null */): Phaser.Cameras.Scene2D.Camera = definedExternally
    open fun preRender(): Unit = definedExternally
    open fun update(time: Number, delta: Number): Unit = definedExternally
    open fun effectComplete(): Unit = definedExternally
    open fun reset(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
open external class Zoom(camera: Phaser.Cameras.Scene2D.Camera) {
    open var camera: Phaser.Cameras.Scene2D.Camera = definedExternally
    open var isRunning: Boolean = definedExternally
    open var duration: Number = definedExternally
    open var source: Number = definedExternally
    open var destination: Number = definedExternally
    open var ease: Function<*> = definedExternally
    open var progress: Number = definedExternally
    open fun start(zoom: Number, duration: Number? = definedExternally /* null */, ease: String? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: ((camera: Phaser.Cameras.Scene2D.Camera, progress: Number, zoom: Number) -> Unit)? = definedExternally /* null */, context: Any? = definedExternally /* null */): Phaser.Cameras.Scene2D.Camera = definedExternally
    open fun start(zoom: Number, duration: Number? = definedExternally /* null */, ease: Function<*>? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: ((camera: Phaser.Cameras.Scene2D.Camera, progress: Number, zoom: Number) -> Unit)? = definedExternally /* null */, context: Any? = definedExternally /* null */): Phaser.Cameras.Scene2D.Camera = definedExternally
    open fun update(time: Number, delta: Number): Unit = definedExternally
    open fun effectComplete(): Unit = definedExternally
    open fun reset(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
    open fun start(zoom: Number): Phaser.Cameras.Scene2D.Camera = definedExternally
}
