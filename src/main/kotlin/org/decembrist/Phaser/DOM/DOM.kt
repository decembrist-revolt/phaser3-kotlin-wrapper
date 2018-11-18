@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("DOM")]
package org.decembrist.Phaser.DOM

import org.decembrist.utils.FrameRequestCallback
import org.w3c.dom.HTMLElement

external fun AddToDOM(element: HTMLElement, parent: String? = definedExternally /* null */, overflowHidden: Boolean? = definedExternally /* null */): HTMLElement = definedExternally
external fun AddToDOM(element: HTMLElement, parent: HTMLElement? = definedExternally /* null */, overflowHidden: Boolean? = definedExternally /* null */): HTMLElement = definedExternally
external fun DOMContentLoaded(callback: () -> Unit): Unit = definedExternally
external fun ParseXML(data: String): dynamic /* DOMParser | ActiveXObject */ = definedExternally
external fun RemoveFromDOM(element: HTMLElement): Unit = definedExternally
open external class RequestAnimationFrame {
    open var isRunning: Boolean = definedExternally
    open var callback: FrameRequestCallback = definedExternally
    open var tick: Number = definedExternally
    open var isSetTimeOut: Boolean = definedExternally
    open var timeOutID: Number = definedExternally
    open var lastTime: Number = definedExternally
    open var step: FrameRequestCallback = definedExternally
    open var stepTimeout: Function<*> = definedExternally
    open fun start(callback: FrameRequestCallback, forceSetTimeOut: Boolean): Unit = definedExternally
    open fun stop(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
external fun AddToDOM(element: HTMLElement): HTMLElement = definedExternally
