@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Math.Interpolation")]
package Phaser.Math.Interpolation

external fun Bezier(v: Array<Number>, k: Number): Number = definedExternally
external fun CatmullRom(v: Array<Number>, k: Number): Number = definedExternally
external fun CubicBezier(t: Number, p0: Number, p1: Number, p2: Number, p3: Number): Number = definedExternally
external fun Linear(v: Array<Number>, k: Number): Number = definedExternally
external fun QuadraticBezier(t: Number, p0: Number, p1: Number, p2: Number): Number = definedExternally
external fun SmootherStep(t: Number, min: Number, max: Number): Number = definedExternally
external fun SmoothStep(t: Number, min: Number, max: Number): Number = definedExternally
