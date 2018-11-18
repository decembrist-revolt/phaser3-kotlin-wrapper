@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Math.Angle")]
package org.decembrist.Phaser.Math.Angle

import org.decembrist.Phaser.Geom.Geom

external fun Between(x1: Number, y1: Number, x2: Number, y2: Number): Number = definedExternally
external fun BetweenPoints(point1: Any?, point2: Any?): Number = definedExternally
external fun BetweenPoints(point1: Any?, point2: Geom.Point): Number = definedExternally
external fun BetweenPoints(point1: Geom.Point, point2: Any?): Number = definedExternally
external fun BetweenPoints(point1: Geom.Point, point2: Geom.Point): Number = definedExternally
external fun BetweenPointsY(point1: Any?, point2: Any?): Number = definedExternally
external fun BetweenPointsY(point1: Any?, point2: Geom.Point): Number = definedExternally
external fun BetweenPointsY(point1: Geom.Point, point2: Any?): Number = definedExternally
external fun BetweenPointsY(point1: Geom.Point, point2: Geom.Point): Number = definedExternally
external fun BetweenY(x1: Number, y1: Number, x2: Number, y2: Number): Number = definedExternally
external fun Normalize(angle: Number): Number = definedExternally
external fun Reverse(angle: Number): Number = definedExternally
external fun RotateTo(currentAngle: Number, targetAngle: Number, lerp: Number? = definedExternally /* null */): Number = definedExternally
external fun ShortestBetween(angle1: Number, angle2: Number): Number = definedExternally
external fun Wrap(angle: Number): Number = definedExternally
external fun WrapDegrees(angle: Number): Number = definedExternally
