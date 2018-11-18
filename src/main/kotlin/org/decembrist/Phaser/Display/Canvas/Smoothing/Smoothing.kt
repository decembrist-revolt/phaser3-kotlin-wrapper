@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Display.Canvas.Smoothing")]
package org.decembrist.Phaser.Display.Canvas.Smoothing

import org.khronos.webgl.WebGLRenderingContext
import org.w3c.dom.CanvasRenderingContext2D

external fun getPrefix(context: CanvasRenderingContext2D): String = definedExternally
external fun getPrefix(context: WebGLRenderingContext): String = definedExternally
external fun enable(context: CanvasRenderingContext2D): dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */ = definedExternally
external fun enable(context: WebGLRenderingContext): dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */ = definedExternally
external fun disable(context: CanvasRenderingContext2D): dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */ = definedExternally
external fun disable(context: WebGLRenderingContext): dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */ = definedExternally
external fun isEnabled(context: CanvasRenderingContext2D): Boolean = definedExternally
external fun isEnabled(context: WebGLRenderingContext): Boolean = definedExternally
