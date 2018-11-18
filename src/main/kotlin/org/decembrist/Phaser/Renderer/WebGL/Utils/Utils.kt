@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Renderer.WebGL.Utils")]
package org.decembrist.Phaser.Renderer.WebGL.Utils

import org.khronos.webgl.WebGLRenderingContext

external fun getTintFromFloats(r: Number, g: Number, b: Number, a: Number): Number = definedExternally
external fun getTintAppendFloatAlpha(rgb: Number, a: Number): Number = definedExternally
external fun getTintAppendFloatAlphaAndSwap(rgb: Number, a: Number): Number = definedExternally
external fun getFloatsFromUintRGB(rgb: Number): Array<Any> = definedExternally
external fun getComponentCount(attributes: Array<Any>, glContext: WebGLRenderingContext): Number = definedExternally
