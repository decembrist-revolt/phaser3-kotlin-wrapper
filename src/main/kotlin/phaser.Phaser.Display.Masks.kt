@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Display.Masks")]
package Phaser.Display.Masks

import org.khronos.webgl.WebGLFramebuffer
import org.khronos.webgl.WebGLTexture

open external class BitmapMask(scene: Phaser.Scene, renderable: Phaser.GameObjects.GameObject) {
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */ = definedExternally
    open var bitmapMask: Phaser.GameObjects.GameObject = definedExternally
    open var maskTexture: WebGLTexture = definedExternally
    open var mainTexture: WebGLTexture = definedExternally
    open var dirty: Boolean = definedExternally
    open var mainFramebuffer: WebGLFramebuffer = definedExternally
    open var maskFramebuffer: WebGLFramebuffer = definedExternally
    open var invertAlpha: Boolean = definedExternally
    open fun setBitmap(renderable: Phaser.GameObjects.GameObject): Unit = definedExternally
    open fun preRenderWebGL(renderer: Phaser.Renderer.Canvas.CanvasRenderer, maskedObject: Phaser.GameObjects.GameObject, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
    open fun preRenderWebGL(renderer: Phaser.Renderer.WebGL.WebGLRenderer, maskedObject: Phaser.GameObjects.GameObject, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
    open fun postRenderWebGL(renderer: Phaser.Renderer.Canvas.CanvasRenderer): Unit = definedExternally
    open fun postRenderWebGL(renderer: Phaser.Renderer.WebGL.WebGLRenderer): Unit = definedExternally
    open fun preRenderCanvas(renderer: Phaser.Renderer.Canvas.CanvasRenderer, mask: Phaser.GameObjects.GameObject, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
    open fun preRenderCanvas(renderer: Phaser.Renderer.WebGL.WebGLRenderer, mask: Phaser.GameObjects.GameObject, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
    open fun postRenderCanvas(renderer: Phaser.Renderer.Canvas.CanvasRenderer): Unit = definedExternally
    open fun postRenderCanvas(renderer: Phaser.Renderer.WebGL.WebGLRenderer): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
open external class GeometryMask(scene: Phaser.Scene, graphicsGeometry: Phaser.GameObjects.Graphics) {
    open var geometryMask: Phaser.GameObjects.Graphics = definedExternally
    open fun setShape(graphicsGeometry: Phaser.GameObjects.Graphics): Unit = definedExternally
    open fun preRenderWebGL(renderer: Phaser.Renderer.WebGL.WebGLRenderer, mask: Phaser.GameObjects.GameObject, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
    open fun postRenderWebGL(renderer: Phaser.Renderer.WebGL.WebGLRenderer): Unit = definedExternally
    open fun preRenderCanvas(renderer: Phaser.Renderer.Canvas.CanvasRenderer, mask: Phaser.GameObjects.GameObject, camera: Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
    open fun postRenderCanvas(renderer: Phaser.Renderer.Canvas.CanvasRenderer): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
