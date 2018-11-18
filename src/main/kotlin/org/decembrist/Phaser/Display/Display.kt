@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "EXTERNAL_DELEGATION",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE"
)
@file:[JsModule("phaser")]

package org.decembrist.Phaser.Display

import org.decembrist.Phaser.Phaser
import org.decembrist.utils.HSVColorObject
import org.decembrist.utils.InputColorObject
import org.khronos.webgl.WebGLFramebuffer
import org.khronos.webgl.WebGLTexture

external object Display {

    open class Color(
        red: Number? = definedExternally /* null */,
        green: Number? = definedExternally /* null */,
        blue: Number? = definedExternally /* null */,
        alpha: Number? = definedExternally /* null */
    ) {
        open var gl: Array<Number> = definedExternally
        open fun transparent(): Color = definedExternally
        open fun setTo(
            red: Number,
            green: Number,
            blue: Number,
            alpha: Number? = definedExternally /* null */,
            updateHSV: Boolean? = definedExternally /* null */
        ): Color = definedExternally

        open fun setGLTo(
            red: Number,
            green: Number,
            blue: Number,
            alpha: Number? = definedExternally /* null */
        ): Color = definedExternally

        open fun setFromRGB(color: InputColorObject): Color = definedExternally
        open fun setFromHSV(h: Number, s: Number, v: Number): Color = definedExternally
        open fun clone(): Color = definedExternally
        open fun gray(shade: Number): Color = definedExternally
        open fun random(
            min: Number? = definedExternally /* null */,
            max: Number? = definedExternally /* null */
        ): Color = definedExternally

        open fun randomGray(
            min: Number? = definedExternally /* null */,
            max: Number? = definedExternally /* null */
        ): Color = definedExternally

        open fun saturate(amount: Number): Color = definedExternally
        open fun desaturate(amount: Number): Color = definedExternally
        open fun lighten(amount: Number): Color = definedExternally
        open fun darken(amount: Number): Color = definedExternally
        open fun brighten(amount: Number): Color = definedExternally
        open var color: Number = definedExternally
        open var color32: Number = definedExternally
        open var rgba: String = definedExternally
        open var redGL: Number = definedExternally
        open var greenGL: Number = definedExternally
        open var blueGL: Number = definedExternally
        open var alphaGL: Number = definedExternally
        open var red: Number = definedExternally
        open var green: Number = definedExternally
        open var blue: Number = definedExternally
        open var alpha: Number = definedExternally
        open var h: Number = definedExternally
        open var s: Number = definedExternally
        open var v: Number = definedExternally

        companion object {
            fun ColorToRGBA(color: Number): () -> Unit = definedExternally
            fun ComponentToHex(color: Number): String = definedExternally
            fun GetColor(red: Number, green: Number, blue: Number): Number = definedExternally
            fun GetColor32(red: Number, green: Number, blue: Number, alpha: Number): Number = definedExternally
            fun HexStringToColor(hex: String): Color = definedExternally
            fun HSLToColor(h: Number, s: Number, l: Number): Color = definedExternally
            fun HSVColorWheel(
                s: Number? = definedExternally /* null */,
                v: Number? = definedExternally /* null */
            ): Array<() -> Unit> = definedExternally

            fun HSVToRGB(
                h: Number,
                s: Number,
                v: Number,
                out: (() -> Unit)? = definedExternally /* null */
            ): dynamic /* () -> Unit | Color */ = definedExternally

            fun HSVToRGB(
                h: Number,
                s: Number,
                v: Number,
                out: Color? = definedExternally /* null */
            ): dynamic /* () -> Unit | Color */ = definedExternally

            fun HueToComponent(p: Number, q: Number, t: Number): Number = definedExternally
            fun IntegerToColor(input: Number): Color = definedExternally
            fun IntegerToRGB(input: Number): () -> Unit = definedExternally
            fun ObjectToColor(input: InputColorObject): Color = definedExternally
            fun RandomRGB(
                min: Number? = definedExternally /* null */,
                max: Number? = definedExternally /* null */
            ): Color = definedExternally

            fun RGBStringToColor(rgb: String): Color = definedExternally
            fun RGBToHSV(
                r: Number,
                g: Number,
                b: Number,
                out: Color? = definedExternally /* null */
            ): dynamic /* Color | HSVColorObject */ = definedExternally

            fun RGBToHSV(
                r: Number,
                g: Number,
                b: Number,
                out: HSVColorObject? = definedExternally /* null */
            ): dynamic /* Color | HSVColorObject */ = definedExternally

            fun RGBToString(
                r: Number,
                g: Number,
                b: Number,
                a: Number? = definedExternally /* null */,
                prefix: String? = definedExternally /* null */
            ): String = definedExternally

            fun ValueToColor(input: String): Color = definedExternally
            fun ValueToColor(input: Number): Color = definedExternally
            fun ValueToColor(input: InputColorObject): Color = definedExternally
            fun HSVToRGB(h: Number, s: Number, v: Number): dynamic /* () -> Unit | Color */ = definedExternally
            fun RGBToHSV(r: Number, g: Number, b: Number): dynamic /* Color | HSVColorObject */ = definedExternally
        }
    }

    object Align {
        var TOP_LEFT: Number = definedExternally
        var TOP_CENTER: Number = definedExternally
        var TOP_RIGHT: Number = definedExternally
        var LEFT_TOP: Number = definedExternally
        var LEFT_CENTER: Number = definedExternally
        var LEFT_BOTTOM: Number = definedExternally
        var CENTER: Number = definedExternally
        var RIGHT_TOP: Number = definedExternally
        var RIGHT_CENTER: Number = definedExternally
        var RIGHT_BOTTOM: Number = definedExternally
        var BOTTOM_LEFT: Number = definedExternally
        var BOTTOM_CENTER: Number = definedExternally
        var BOTTOM_RIGHT: Number = definedExternally

        object In {
            fun <G : org.decembrist.Phaser.GameObjects.GameObject> BottomCenter(
                gameObject: G,
                alignIn: org.decembrist.Phaser.GameObjects.GameObject,
                offsetX: Number? = definedExternally /* null */,
                offsetY: Number? = definedExternally /* null */
            ): G = definedExternally

            fun <G : org.decembrist.Phaser.GameObjects.GameObject> BottomLeft(
                gameObject: G,
                alignIn: org.decembrist.Phaser.GameObjects.GameObject,
                offsetX: Number? = definedExternally /* null */,
                offsetY: Number? = definedExternally /* null */
            ): G = definedExternally

            fun <G : org.decembrist.Phaser.GameObjects.GameObject> BottomRight(
                gameObject: G,
                alignIn: org.decembrist.Phaser.GameObjects.GameObject,
                offsetX: Number? = definedExternally /* null */,
                offsetY: Number? = definedExternally /* null */
            ): G = definedExternally

            fun <G : org.decembrist.Phaser.GameObjects.GameObject> Center(
                gameObject: G,
                alignIn: org.decembrist.Phaser.GameObjects.GameObject,
                offsetX: Number? = definedExternally /* null */,
                offsetY: Number? = definedExternally /* null */
            ): G = definedExternally

            fun <G : org.decembrist.Phaser.GameObjects.GameObject> LeftCenter(
                gameObject: G,
                alignIn: org.decembrist.Phaser.GameObjects.GameObject,
                offsetX: Number? = definedExternally /* null */,
                offsetY: Number? = definedExternally /* null */
            ): G = definedExternally

            fun <G : org.decembrist.Phaser.GameObjects.GameObject> QuickSet(
                child: G,
                alignIn: org.decembrist.Phaser.GameObjects.GameObject,
                position: Number,
                offsetX: Number? = definedExternally /* null */,
                offsetY: Number? = definedExternally /* null */
            ): G = definedExternally

            fun <G : org.decembrist.Phaser.GameObjects.GameObject> RightCenter(
                gameObject: G,
                alignIn: org.decembrist.Phaser.GameObjects.GameObject,
                offsetX: Number? = definedExternally /* null */,
                offsetY: Number? = definedExternally /* null */
            ): G = definedExternally

            fun <G : org.decembrist.Phaser.GameObjects.GameObject> TopCenter(
                gameObject: G,
                alignIn: org.decembrist.Phaser.GameObjects.GameObject,
                offsetX: Number? = definedExternally /* null */,
                offsetY: Number? = definedExternally /* null */
            ): G = definedExternally

            fun <G : org.decembrist.Phaser.GameObjects.GameObject> TopLeft(
                gameObject: G,
                alignIn: org.decembrist.Phaser.GameObjects.GameObject,
                offsetX: Number? = definedExternally /* null */,
                offsetY: Number? = definedExternally /* null */
            ): G = definedExternally

            fun <G : org.decembrist.Phaser.GameObjects.GameObject> TopRight(
                gameObject: G,
                alignIn: org.decembrist.Phaser.GameObjects.GameObject,
                offsetX: Number? = definedExternally /* null */,
                offsetY: Number? = definedExternally /* null */
            ): G = definedExternally
        }

        object To {
            fun <G : org.decembrist.Phaser.GameObjects.GameObject> BottomCenter(gameObject: G, alignTo: org.decembrist.Phaser.GameObjects.GameObject, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): G = definedExternally
            fun <G : org.decembrist.Phaser.GameObjects.GameObject> BottomLeft(gameObject: G, alignTo: org.decembrist.Phaser.GameObjects.GameObject, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): G = definedExternally
            fun <G : org.decembrist.Phaser.GameObjects.GameObject> BottomRight(gameObject: G, alignTo: org.decembrist.Phaser.GameObjects.GameObject, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): G = definedExternally
            fun <G : org.decembrist.Phaser.GameObjects.GameObject> LeftBottom(gameObject: G, alignTo: org.decembrist.Phaser.GameObjects.GameObject, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): G = definedExternally
            fun <G : org.decembrist.Phaser.GameObjects.GameObject> LeftCenter(gameObject: G, alignTo: org.decembrist.Phaser.GameObjects.GameObject, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): G = definedExternally
            fun <G : org.decembrist.Phaser.GameObjects.GameObject> LeftTop(gameObject: G, alignTo: org.decembrist.Phaser.GameObjects.GameObject, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): G = definedExternally
            fun <G : org.decembrist.Phaser.GameObjects.GameObject> RightBottom(gameObject: G, alignTo: org.decembrist.Phaser.GameObjects.GameObject, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): G = definedExternally
            fun <G : org.decembrist.Phaser.GameObjects.GameObject> RightCenter(gameObject: G, alignTo: org.decembrist.Phaser.GameObjects.GameObject, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): G = definedExternally
            fun <G : org.decembrist.Phaser.GameObjects.GameObject> RightTop(gameObject: G, alignTo: org.decembrist.Phaser.GameObjects.GameObject, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): G = definedExternally
            fun <G : org.decembrist.Phaser.GameObjects.GameObject> TopCenter(gameObject: G, alignTo: org.decembrist.Phaser.GameObjects.GameObject, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): G = definedExternally
            fun <G : org.decembrist.Phaser.GameObjects.GameObject> TopLeft(gameObject: G, alignTo: org.decembrist.Phaser.GameObjects.GameObject, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): G = definedExternally
            fun <G : org.decembrist.Phaser.GameObjects.GameObject> TopRight(gameObject: G, alignTo: org.decembrist.Phaser.GameObjects.GameObject, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): G = definedExternally
        }
    }

    object Bounds {
        fun <G : org.decembrist.Phaser.GameObjects.GameObject> CenterOn(gameObject: G, x: Number, y: Number): G = definedExternally
        fun GetBottom(gameObject: org.decembrist.Phaser.GameObjects.GameObject): Number = definedExternally
        fun GetCenterX(gameObject: org.decembrist.Phaser.GameObjects.GameObject): Number = definedExternally
        fun GetCenterY(gameObject: org.decembrist.Phaser.GameObjects.GameObject): Number = definedExternally
        fun GetLeft(gameObject: org.decembrist.Phaser.GameObjects.GameObject): Number = definedExternally
        fun GetOffsetX(gameObject: org.decembrist.Phaser.GameObjects.GameObject): Number = definedExternally
        fun GetOffsetY(gameObject: org.decembrist.Phaser.GameObjects.GameObject): Number = definedExternally
        fun GetRight(gameObject: org.decembrist.Phaser.GameObjects.GameObject): Number = definedExternally
        fun GetTop(gameObject: org.decembrist.Phaser.GameObjects.GameObject): Number = definedExternally
        fun <G : org.decembrist.Phaser.GameObjects.GameObject> SetBottom(gameObject: G, value: Number): G = definedExternally
        fun <G : org.decembrist.Phaser.GameObjects.GameObject> SetCenterX(gameObject: G, x: Number): G = definedExternally
        fun <G : org.decembrist.Phaser.GameObjects.GameObject> SetCenterY(gameObject: G, y: Number): G = definedExternally
        fun <G : org.decembrist.Phaser.GameObjects.GameObject> SetLeft(gameObject: G, value: Number): G = definedExternally
        fun <G : org.decembrist.Phaser.GameObjects.GameObject> SetRight(gameObject: G, value: Number): G = definedExternally
        fun <G : org.decembrist.Phaser.GameObjects.GameObject> SetTop(gameObject: G, value: Number): G = definedExternally
    }

    object Masks {
        open class BitmapMask(scene: Phaser.Scene, renderable: org.decembrist.Phaser.GameObjects.GameObject) {
            open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */ = definedExternally
            open var bitmapMask: org.decembrist.Phaser.GameObjects.GameObject = definedExternally
            open var maskTexture: WebGLTexture = definedExternally
            open var mainTexture: WebGLTexture = definedExternally
            open var dirty: Boolean = definedExternally
            open var mainFramebuffer: WebGLFramebuffer = definedExternally
            open var maskFramebuffer: WebGLFramebuffer = definedExternally
            open var invertAlpha: Boolean = definedExternally
            open fun setBitmap(renderable: org.decembrist.Phaser.GameObjects.GameObject): Unit = definedExternally
            open fun preRenderWebGL(renderer: org.decembrist.Phaser.Renderer.Canvas.CanvasRenderer, maskedObject: org.decembrist.Phaser.GameObjects.GameObject, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
            open fun preRenderWebGL(renderer: org.decembrist.Phaser.Renderer.WebGL.WebGLRenderer, maskedObject: org.decembrist.Phaser.GameObjects.GameObject, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
            open fun postRenderWebGL(renderer: org.decembrist.Phaser.Renderer.Canvas.CanvasRenderer): Unit = definedExternally
            open fun postRenderWebGL(renderer: org.decembrist.Phaser.Renderer.WebGL.WebGLRenderer): Unit = definedExternally
            open fun preRenderCanvas(renderer: org.decembrist.Phaser.Renderer.Canvas.CanvasRenderer, mask: org.decembrist.Phaser.GameObjects.GameObject, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
            open fun preRenderCanvas(renderer: org.decembrist.Phaser.Renderer.WebGL.WebGLRenderer, mask: org.decembrist.Phaser.GameObjects.GameObject, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
            open fun postRenderCanvas(renderer: org.decembrist.Phaser.Renderer.Canvas.CanvasRenderer): Unit = definedExternally
            open fun postRenderCanvas(renderer: org.decembrist.Phaser.Renderer.WebGL.WebGLRenderer): Unit = definedExternally
            open fun destroy(): Unit = definedExternally
        }
        open class GeometryMask(scene: Phaser.Scene, graphicsGeometry: org.decembrist.Phaser.GameObjects.Graphics) {
            open var geometryMask: org.decembrist.Phaser.GameObjects.Graphics = definedExternally
            open fun setShape(graphicsGeometry: org.decembrist.Phaser.GameObjects.Graphics): Unit = definedExternally
            open fun preRenderWebGL(renderer: org.decembrist.Phaser.Renderer.WebGL.WebGLRenderer, mask: org.decembrist.Phaser.GameObjects.GameObject, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
            open fun postRenderWebGL(renderer: org.decembrist.Phaser.Renderer.WebGL.WebGLRenderer): Unit = definedExternally
            open fun preRenderCanvas(renderer: org.decembrist.Phaser.Renderer.Canvas.CanvasRenderer, mask: org.decembrist.Phaser.GameObjects.GameObject, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
            open fun postRenderCanvas(renderer: org.decembrist.Phaser.Renderer.Canvas.CanvasRenderer): Unit = definedExternally
            open fun destroy(): Unit = definedExternally
        }
    }
}


