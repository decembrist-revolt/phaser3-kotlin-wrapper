@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Display.Canvas.CanvasPool")]
package org.decembrist.Phaser.Display.Canvas.CanvasPool

import org.w3c.dom.HTMLCanvasElement

external fun create(parent: Any, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, canvasType: Number? = definedExternally /* null */, selfParent: Boolean? = definedExternally /* null */): HTMLCanvasElement = definedExternally
external fun create2D(parent: Any, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): HTMLCanvasElement = definedExternally
external fun createWebGL(parent: Any, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): HTMLCanvasElement = definedExternally
external fun first(canvasType: Number? = definedExternally /* null */): HTMLCanvasElement = definedExternally
external fun remove(parent: Any): Unit = definedExternally
external fun total(): Number = definedExternally
external fun free(): Number = definedExternally
external fun disableSmoothing(): Unit = definedExternally
external fun enableSmoothing(): Unit = definedExternally
