@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
package Phaser.Display

import HSVColorObject
import InputColorObject

@JsModule("phaser.Display.Color")
open external class PhaserColor(red: Number? = definedExternally /* null */, green: Number? = definedExternally /* null */, blue: Number? = definedExternally /* null */, alpha: Number? = definedExternally /* null */) {
    open var gl: Array<Number> = definedExternally
    open fun transparent(): PhaserColor = definedExternally
    open fun setTo(red: Number, green: Number, blue: Number, alpha: Number? = definedExternally /* null */, updateHSV: Boolean? = definedExternally /* null */): PhaserColor = definedExternally
    open fun setGLTo(red: Number, green: Number, blue: Number, alpha: Number? = definedExternally /* null */): PhaserColor = definedExternally
    open fun setFromRGB(color: InputColorObject): PhaserColor = definedExternally
    open fun setFromHSV(h: Number, s: Number, v: Number): PhaserColor = definedExternally
    open fun clone(): PhaserColor = definedExternally
    open fun gray(shade: Number): PhaserColor = definedExternally
    open fun random(min: Number? = definedExternally /* null */, max: Number? = definedExternally /* null */): PhaserColor = definedExternally
    open fun randomGray(min: Number? = definedExternally /* null */, max: Number? = definedExternally /* null */): PhaserColor = definedExternally
    open fun saturate(amount: Number): PhaserColor = definedExternally
    open fun desaturate(amount: Number): PhaserColor = definedExternally
    open fun lighten(amount: Number): PhaserColor = definedExternally
    open fun darken(amount: Number): PhaserColor = definedExternally
    open fun brighten(amount: Number): PhaserColor = definedExternally
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
        fun HexStringToColor(hex: String): PhaserColor = definedExternally
        fun HSLToColor(h: Number, s: Number, l: Number): PhaserColor = definedExternally
        fun HSVColorWheel(s: Number? = definedExternally /* null */, v: Number? = definedExternally /* null */): Array<() -> Unit> = definedExternally
        fun HSVToRGB(h: Number, s: Number, v: Number, out: (() -> Unit)? = definedExternally /* null */): dynamic /* () -> Unit | PhaserColor */ = definedExternally
        fun HSVToRGB(h: Number, s: Number, v: Number, out: PhaserColor? = definedExternally /* null */): dynamic /* () -> Unit | PhaserColor */ = definedExternally
        fun HueToComponent(p: Number, q: Number, t: Number): Number = definedExternally
        fun IntegerToColor(input: Number): PhaserColor = definedExternally
        fun IntegerToRGB(input: Number): () -> Unit = definedExternally
        fun ObjectToColor(input: InputColorObject): PhaserColor = definedExternally
        fun RandomRGB(min: Number? = definedExternally /* null */, max: Number? = definedExternally /* null */): PhaserColor = definedExternally
        fun RGBStringToColor(rgb: String): PhaserColor = definedExternally
        fun RGBToHSV(r: Number, g: Number, b: Number, out: PhaserColor? = definedExternally /* null */): dynamic /* PhaserColor | HSVColorObject */ = definedExternally
        fun RGBToHSV(r: Number, g: Number, b: Number, out: HSVColorObject? = definedExternally /* null */): dynamic /* PhaserColor | HSVColorObject */ = definedExternally
        fun RGBToString(r: Number, g: Number, b: Number, a: Number? = definedExternally /* null */, prefix: String? = definedExternally /* null */): String = definedExternally
        fun ValueToColor(input: String): PhaserColor = definedExternally
        fun ValueToColor(input: Number): PhaserColor = definedExternally
        fun ValueToColor(input: InputColorObject): PhaserColor = definedExternally
        fun HSVToRGB(h: Number, s: Number, v: Number): dynamic /* () -> Unit | PhaserColor */ = definedExternally
        fun RGBToHSV(r: Number, g: Number, b: Number): dynamic /* PhaserColor | HSVColorObject */ = definedExternally
    }
}
