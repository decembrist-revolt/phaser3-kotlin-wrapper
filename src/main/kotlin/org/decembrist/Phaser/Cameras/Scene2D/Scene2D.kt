@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Cameras.Scene2D") JsNonModule]
package org.decembrist.Phaser.Cameras.Scene2D

import org.decembrist.Phaser.Display.Display
import org.decembrist.Phaser.GameObjects.Components.Alpha
import org.decembrist.Phaser.Geom.Geom
import org.decembrist.Phaser.Phaser
import org.decembrist.utils.InputColorObject
import org.decembrist.utils.InputJSONCameraObject
import org.decembrist.utils.JSONCamera
import org.khronos.webgl.WebGLTexture
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement

open external class BaseCamera(x: Number, y: Number, width: Number, height: Number) : org.decembrist.Phaser.Events.EventEmitter, org.decembrist.Phaser.GameObjects.Components.Alpha, org.decembrist.Phaser.GameObjects.Components.Visible {
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Alpha
    open var scene: Phaser.Scene = definedExternally
    open var sceneManager: org.decembrist.Phaser.Scenes.SceneManager = definedExternally
    open var config: Any = definedExternally
    open var id: Number = definedExternally
    open var name: String = definedExternally
    open var resolution: Number = definedExternally
    open var roundPixels: Boolean = definedExternally
    override var visible: Boolean = definedExternally
    open var useBounds: Boolean = definedExternally
    open var worldView: Geom.Rectangle = definedExternally
    open var dirty: Boolean = definedExternally
    open var transparent: Boolean = definedExternally
    open var backgroundColor: Display.Color = definedExternally
    override var alpha: Number = definedExternally
    open var disableCull: Boolean = definedExternally
    open var midPoint: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var originX: Number = definedExternally
    open var originY: Number = definedExternally
    open fun setAlpha(value: Number? = definedExternally /* null */): BaseCamera /* this */ = definedExternally
    open fun setOrigin(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): BaseCamera /* this */ = definedExternally
    open fun getScroll(x: Number, y: Number, out: org.decembrist.Phaser.Math.Vector2? = definedExternally /* null */): org.decembrist.Phaser.Math.Vector2 = definedExternally
    open fun centerOn(x: Number, y: Number): BaseCamera = definedExternally
    open fun centerToBounds(): BaseCamera = definedExternally
    open fun centerToSize(): BaseCamera = definedExternally
    open fun <G : Array<org.decembrist.Phaser.GameObjects.GameObject>> cull(renderableObjects: G): G = definedExternally
    open fun <O : org.decembrist.Phaser.Math.Vector2> getWorldPoint(x: Number, y: Number, output: O? = definedExternally /* null */): O = definedExternally
    open fun ignore(entries: org.decembrist.Phaser.GameObjects.GameObject): BaseCamera = definedExternally
    open fun ignore(entries: Array<org.decembrist.Phaser.GameObjects.GameObject>): BaseCamera = definedExternally
    open fun ignore(entries: org.decembrist.Phaser.GameObjects.Group): BaseCamera = definedExternally
    open fun preRender(baseScale: Number, resolution: Number): Unit = definedExternally
    open fun clampX(x: Number): Number = definedExternally
    open fun clampY(y: Number): Number = definedExternally
    open fun removeBounds(): BaseCamera = definedExternally
    open fun setAngle(value: Number? = definedExternally /* null */): BaseCamera = definedExternally
    open fun setBackgroundColor(color: String? = definedExternally /* null */): BaseCamera = definedExternally
    open fun setBackgroundColor(color: Number? = definedExternally /* null */): BaseCamera = definedExternally
    open fun setBackgroundColor(color: InputColorObject? = definedExternally /* null */): BaseCamera = definedExternally
    open fun setBounds(x: Number, y: Number, width: Number, height: Number, centerOn: Boolean? = definedExternally /* null */): BaseCamera = definedExternally
    open fun setName(value: String? = definedExternally /* null */): BaseCamera = definedExternally
    open fun setPosition(x: Number, y: Number? = definedExternally /* null */): BaseCamera = definedExternally
    open fun setRotation(value: Number? = definedExternally /* null */): BaseCamera = definedExternally
    open fun setRoundPixels(value: Boolean): BaseCamera = definedExternally
    open fun setScene(scene: Phaser.Scene): BaseCamera = definedExternally
    open fun setScroll(x: Number, y: Number? = definedExternally /* null */): BaseCamera = definedExternally
    open fun setSize(width: Number, height: Number? = definedExternally /* null */): BaseCamera = definedExternally
    open fun setViewport(x: Number, y: Number, width: Number, height: Number? = definedExternally /* null */): BaseCamera = definedExternally
    open fun setZoom(value: Number? = definedExternally /* null */): BaseCamera = definedExternally
    override fun setVisible(value: Boolean): BaseCamera /* this */ = definedExternally
    open fun toJSON(): JSONCamera = definedExternally
    open fun update(time: Number, delta: Number): Unit = definedExternally
    override fun destroy(): Unit = definedExternally
    open var x: Number = definedExternally
    open var y: Number = definedExternally
    open var width: Number = definedExternally
    open var height: Number = definedExternally
    open var scrollX: Number = definedExternally
    open var scrollY: Number = definedExternally
    open var zoom: Number = definedExternally
    open var centerX: Number = definedExternally
    open var centerY: Number = definedExternally
    open var displayWidth: Number = definedExternally
    open var displayHeight: Number = definedExternally
    override fun clearAlpha(): BaseCamera /* this */ = definedExternally
    override var alphaTopLeft: Number = definedExternally
    override var alphaTopRight: Number = definedExternally
    override var alphaBottomLeft: Number = definedExternally
    override var alphaBottomRight: Number = definedExternally
    open fun setBackgroundColor(): BaseCamera = definedExternally
}
open external class Camera(x: Number, y: Number, width: Number, height: Number) : BaseCamera, org.decembrist.Phaser.GameObjects.Components.Flip, org.decembrist.Phaser.GameObjects.Components.Tint {
    open var inputEnabled: Boolean = definedExternally
    open var fadeEffect: org.decembrist.Phaser.Cameras.Scene2D.Effects.Fade = definedExternally
    open var flashEffect: org.decembrist.Phaser.Cameras.Scene2D.Effects.Flash = definedExternally
    open var shakeEffect: org.decembrist.Phaser.Cameras.Scene2D.Effects.Shake = definedExternally
    open var panEffect: org.decembrist.Phaser.Cameras.Scene2D.Effects.Pan = definedExternally
    open var zoomEffect: org.decembrist.Phaser.Cameras.Scene2D.Effects.Zoom = definedExternally
    open var lerp: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var followOffset: org.decembrist.Phaser.Math.Vector2 = definedExternally
    open var deadzone: Geom.Rectangle = definedExternally
    open var renderToTexture: Boolean = definedExternally
    open var canvas: HTMLCanvasElement = definedExternally
    open var context: CanvasRenderingContext2D = definedExternally
    open var framebuffer: WebGLTexture = definedExternally
    open var pipeline: Any = definedExternally
    open fun setRenderToTexture(pipeline: String? = definedExternally /* null */): Camera = definedExternally
    open fun setRenderToTexture(pipeline: org.decembrist.Phaser.Renderer.WebGL.WebGLPipeline? = definedExternally /* null */): Camera = definedExternally
    open fun setPipeline(pipeline: String? = definedExternally /* null */): Camera = definedExternally
    open fun setPipeline(pipeline: org.decembrist.Phaser.Renderer.WebGL.WebGLPipeline? = definedExternally /* null */): Camera = definedExternally
    open fun clearRenderToTexture(): Camera = definedExternally
    open fun setDeadzone(width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): Camera = definedExternally
    open fun fadeIn(duration: Number? = definedExternally /* null */, red: Number? = definedExternally /* null */, green: Number? = definedExternally /* null */, blue: Number? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): Camera = definedExternally
    open fun fadeOut(duration: Number? = definedExternally /* null */, red: Number? = definedExternally /* null */, green: Number? = definedExternally /* null */, blue: Number? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): Camera = definedExternally
    open fun fadeFrom(duration: Number? = definedExternally /* null */, red: Number? = definedExternally /* null */, green: Number? = definedExternally /* null */, blue: Number? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): Camera = definedExternally
    open fun fade(duration: Number? = definedExternally /* null */, red: Number? = definedExternally /* null */, green: Number? = definedExternally /* null */, blue: Number? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): Camera = definedExternally
    open fun flash(duration: Number? = definedExternally /* null */, red: Number? = definedExternally /* null */, green: Number? = definedExternally /* null */, blue: Number? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): Camera = definedExternally
    open fun shake(duration: Number? = definedExternally /* null */, intensity: Number? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, context: Any? = definedExternally /* null */): Camera = definedExternally
    open fun pan(x: Number, y: Number, duration: Number? = definedExternally /* null */, ease: String? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: ((camera: Camera, progress: Number, x: Number, y: Number) -> Unit)? = definedExternally /* null */, context: Any? = definedExternally /* null */): Camera = definedExternally
    open fun pan(x: Number, y: Number, duration: Number? = definedExternally /* null */, ease: Function<*>? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: ((camera: Camera, progress: Number, x: Number, y: Number) -> Unit)? = definedExternally /* null */, context: Any? = definedExternally /* null */): Camera = definedExternally
    open fun zoomTo(zoom: Number, duration: Number? = definedExternally /* null */, ease: String? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: ((camera: Camera, progress: Number, x: Number, y: Number) -> Unit)? = definedExternally /* null */, context: Any? = definedExternally /* null */): Camera = definedExternally
    open fun zoomTo(zoom: Number, duration: Number? = definedExternally /* null */, ease: Function<*>? = definedExternally /* null */, force: Boolean? = definedExternally /* null */, callback: ((camera: Camera, progress: Number, x: Number, y: Number) -> Unit)? = definedExternally /* null */, context: Any? = definedExternally /* null */): Camera = definedExternally
    override fun preRender(baseScale: Number, resolution: Number): Unit = definedExternally
    open fun setLerp(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): Camera /* this */ = definedExternally
    open fun setFollowOffset(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): Camera /* this */ = definedExternally
    open fun startFollow(target: Any?, roundPixels: Boolean? = definedExternally /* null */, lerpX: Number? = definedExternally /* null */, lerpY: Number? = definedExternally /* null */, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): Camera /* this */ = definedExternally
    open fun startFollow(target: org.decembrist.Phaser.GameObjects.GameObject, roundPixels: Boolean? = definedExternally /* null */, lerpX: Number? = definedExternally /* null */, lerpY: Number? = definedExternally /* null */, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): Camera /* this */ = definedExternally
    open fun stopFollow(): Camera = definedExternally
    open fun resetFX(): Camera = definedExternally
    override fun update(time: Number, delta: Number): Unit = definedExternally
    override fun destroy(): Unit = definedExternally
    override fun clearAlpha(): Camera /* this */ = definedExternally
    override var alphaTopLeft: Number = definedExternally
    override var alphaTopRight: Number = definedExternally
    override var alphaBottomLeft: Number = definedExternally
    override var alphaBottomRight: Number = definedExternally
    override var flipX: Boolean = definedExternally
    override var flipY: Boolean = definedExternally
    override fun toggleFlipX(): Camera /* this */ = definedExternally
    override fun toggleFlipY(): Camera /* this */ = definedExternally
    override fun setFlipX(value: Boolean): Camera /* this */ = definedExternally
    override fun setFlipY(value: Boolean): Camera /* this */ = definedExternally
    override fun setFlip(x: Boolean, y: Boolean): Camera /* this */ = definedExternally
    override fun resetFlip(): Camera /* this */ = definedExternally
    override var tintFill: Boolean = definedExternally
    override fun clearTint(): Camera /* this */ = definedExternally
    override fun setTint(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Camera /* this */ = definedExternally
    override fun setTintFill(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Camera /* this */ = definedExternally
    override var tintTopLeft: Number = definedExternally
    override var tintTopRight: Number = definedExternally
    override var tintBottomLeft: Number = definedExternally
    override var tintBottomRight: Number = definedExternally
    override var tint: Number = definedExternally
    override var isTinted: Boolean = definedExternally
    open fun setRenderToTexture(): Camera = definedExternally
    open fun setPipeline(): Camera = definedExternally
    open fun pan(x: Number, y: Number): Camera = definedExternally
    open fun zoomTo(zoom: Number): Camera = definedExternally
}
open external class CameraManager(scene: Phaser.Scene) {
    open var scene: Phaser.Scene = definedExternally
    open var systems: org.decembrist.Phaser.Scenes.Systems = definedExternally
    open var roundPixels: Boolean = definedExternally
    open var cameras: Array<Camera> = definedExternally
    open var main: Camera = definedExternally
    open var baseScale: Number = definedExternally
    open fun add(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, makeMain: Boolean? = definedExternally /* null */, name: String? = definedExternally /* null */): Camera = definedExternally
    open fun addExisting(camera: Camera, makeMain: Boolean? = definedExternally /* null */): Camera = definedExternally
    open fun getTotal(isVisible: Boolean? = definedExternally /* null */): Number = definedExternally
    open fun fromJSON(config: InputJSONCameraObject): CameraManager = definedExternally
    open fun fromJSON(config: Array<InputJSONCameraObject>): CameraManager = definedExternally
    open fun getCamera(name: String): Camera = definedExternally
    open fun getCamerasBelowPointer(pointer: org.decembrist.Phaser.Input.Pointer): Array<Camera> = definedExternally
    open fun remove(camera: Camera): Number = definedExternally
    open fun remove(camera: Array<Camera>): Number = definedExternally
    open fun render(renderer: org.decembrist.Phaser.Renderer.Canvas.CanvasRenderer, children: Array<org.decembrist.Phaser.GameObjects.GameObject>, interpolation: Number): Unit = definedExternally
    open fun render(renderer: org.decembrist.Phaser.Renderer.WebGL.WebGLRenderer, children: Array<org.decembrist.Phaser.GameObjects.GameObject>, interpolation: Number): Unit = definedExternally
    open fun resetAll(): Camera = definedExternally
    open fun update(timestep: Number, delta: Number): Unit = definedExternally
    open fun resize(width: Number, height: Number): Unit = definedExternally
}
