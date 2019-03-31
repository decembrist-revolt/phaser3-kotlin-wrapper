@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
package org.decembrist.Phaser.Math.Interpolation

external object Interpolation {
    fun Bezier(v: Array<Number>, k: Number): Number = definedExternally
    fun CatmullRom(v: Array<Number>, k: Number): Number = definedExternally
    fun CubicBezier(t: Number, p0: Number, p1: Number, p2: Number, p3: Number): Number = definedExternally
    fun Linear(v: Array<Number>, k: Number): Number = definedExternally
    fun QuadraticBezier(t: Number, p0: Number, p1: Number, p2: Number): Number = definedExternally
    fun SmootherStep(t: Number, min: Number, max: Number): Number = definedExternally
    fun SmoothStep(t: Number, min: Number, max: Number): Number = definedExternally
}