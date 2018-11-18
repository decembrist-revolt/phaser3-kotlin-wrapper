@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Renderer.Canvas")]
package org.decembrist.Phaser.Renderer.Canvas

import org.decembrist.Phaser.Phaser
import org.decembrist.utils.RendererConfig
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLImageElement

open external class CanvasRenderer(game: Phaser.Game) {
    open var game: Phaser.Game = definedExternally
    open var type: Number = definedExternally
    open var drawCount: Number = definedExternally
    open var width: Number = definedExternally
    open var height: Number = definedExternally
    open var config: RendererConfig = definedExternally
    open var scaleMode: Number = definedExternally
    open var gameCanvas: HTMLCanvasElement = definedExternally
    open var gameContext: CanvasRenderingContext2D = definedExternally
    open var currentContext: CanvasRenderingContext2D = definedExternally
    open var blendModes: Array<Any> = definedExternally
    open var currentScaleMode: Number = definedExternally
    open var snapshotCallback: (snapshot: HTMLImageElement) -> Unit = definedExternally
    open var snapshotType: String = definedExternally
    open var snapshotEncoder: Number = definedExternally
    open fun init(): Unit = definedExternally
    open fun resize(width: Number, height: Number): Unit = definedExternally
    open fun onContextLost(callback: Function<*>): Unit = definedExternally
    open fun onContextRestored(callback: Function<*>): Unit = definedExternally
    open fun resetTransform(): Unit = definedExternally
    open fun setBlendMode(blendMode: Number): CanvasRenderer /* this */ = definedExternally
    open fun setContext(ctx: CanvasRenderingContext2D? = definedExternally /* null */): CanvasRenderer /* this */ = definedExternally
    open fun setAlpha(alpha: Number): CanvasRenderer /* this */ = definedExternally
    open fun preRender(): Unit = definedExternally
    open fun render(scene: Phaser.Scene, children: org.decembrist.Phaser.GameObjects.DisplayList, interpolationPercentage: Number, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
    open fun postRender(): Unit = definedExternally
    open fun snapshot(callback: (snapshot: HTMLImageElement) -> Unit, type: String, encoderOptions: Number): Unit = definedExternally
    open fun batchSprite(sprite: org.decembrist.Phaser.GameObjects.GameObject, frame: org.decembrist.Phaser.Textures.Frame, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix? = definedExternally /* null */): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
external fun GetBlendModes(): Array<Any> = definedExternally
external fun SetTransform(renderer: CanvasRenderer, ctx: CanvasRenderingContext2D, src: org.decembrist.Phaser.GameObjects.GameObject, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera, parentMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix? = definedExternally /* null */): Boolean = definedExternally
