@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Renderer.Snapshot")]
package Phaser.Renderer.Snapshot

import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLImageElement

external fun Canvas(canvas: HTMLCanvasElement, type: String? = definedExternally /* null */, encoderOptions: Number? = definedExternally /* null */): HTMLImageElement = definedExternally
external fun WebGL(sourceCanvas: HTMLCanvasElement, type: String? = definedExternally /* null */, encoderOptions: Number? = definedExternally /* null */): HTMLImageElement = definedExternally
