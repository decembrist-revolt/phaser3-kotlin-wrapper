@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Display.Color.Interpolate")]
package org.decembrist.Phaser.Display.Color.Interpolate

import org.decembrist.Phaser.Display.Display

external fun RGBWithRGB(r1: Number, g1: Number, b1: Number, r2: Number, g2: Number, b2: Number, length: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */): () -> Unit = definedExternally
external fun ColorWithColor(color1: Display.Color, color2: Display.Color, length: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */): () -> Unit = definedExternally
external fun ColorWithRGB(color1: Display.Color, r: Number, g: Number, b: Number, length: Number? = definedExternally /* null */, index: Number? = definedExternally /* null */): () -> Unit = definedExternally
