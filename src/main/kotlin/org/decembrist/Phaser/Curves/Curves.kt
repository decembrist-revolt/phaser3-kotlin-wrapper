@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Curves") JsNonModule]
package org.decembrist.Phaser.Curves

import org.decembrist.Phaser.Geom.Geom
import org.decembrist.Phaser.Math.Math
import org.decembrist.utils.EllipseCurveConfig
import org.decembrist.utils.JSONCurve
import org.decembrist.utils.JSONEllipseCurve
import org.decembrist.utils.JSONPath

open external class CubicBezier : Curve {
    constructor(p0: Math.Vector2, p1: Math.Vector2, p2: Math.Vector2, p3: Math.Vector2)
    constructor(p0: Array<Math.Vector2>, p1: Math.Vector2, p2: Math.Vector2, p3: Math.Vector2)
    open var p0: Math.Vector2
    open var p1: Math.Vector2
    open var p2: Math.Vector2
    open var p3: Math.Vector2
    override fun <O : Math.Vector2> getStartPoint(out: O? /* null */): O = definedExternally
    open fun getResolution(divisions: Number): Number = definedExternally
    open fun <O : Math.Vector2> getPoint(t: Number, out: O? = definedExternally /* null */): O = definedExternally
    override fun <G : org.decembrist.Phaser.GameObjects.Graphics> draw(graphics: G, pointsTotal: Number? /* null */): G = definedExternally
    open fun toJSON(): JSONCurve = definedExternally
    companion object {
        fun fromJSON(data: JSONCurve): CubicBezier = definedExternally
    }
}
open external class Curve(type: String) {
    open var type: String = definedExternally
    open var defaultDivisions: Number = definedExternally
    open var arcLengthDivisions: Number = definedExternally
    open var cacheArcLengths: Array<Number> = definedExternally
    open var needsUpdate: Boolean = definedExternally
    open var active: Boolean = definedExternally
    open fun <G : org.decembrist.Phaser.GameObjects.Graphics> draw(graphics: G, pointsTotal: Number? = definedExternally /* null */): G = definedExternally
    open fun getBounds(out: Geom.Rectangle? = definedExternally /* null */, accuracy: Number? = definedExternally /* null */): Geom.Rectangle = definedExternally
    open fun getDistancePoints(distance: Number): Array<Geom.Point> = definedExternally
    open fun getEndPoint(out: Math.Vector2? = definedExternally /* null */): Math.Vector2 = definedExternally
    open fun getLength(): Number = definedExternally
    open fun getLengths(divisions: Number? = definedExternally /* null */): Array<Number> = definedExternally
    open fun <O : Math.Vector2> getPointAt(u: Number, out: O? = definedExternally /* null */): O = definedExternally
    open fun getPoints(divisions: Number? = definedExternally /* null */): Array<Math.Vector2> = definedExternally
    open fun <O : Math.Vector2> getRandomPoint(out: O? = definedExternally /* null */): O = definedExternally
    open fun getSpacedPoints(divisions: Number? = definedExternally /* null */): Array<Math.Vector2> = definedExternally
    open fun <O : Math.Vector2> getStartPoint(out: O? = definedExternally /* null */): O = definedExternally
    open fun <O : Math.Vector2> getTangent(t: Number, out: O? = definedExternally /* null */): O = definedExternally
    open fun <O : Math.Vector2> getTangentAt(u: Number, out: O? = definedExternally /* null */): O = definedExternally
    open fun getTFromDistance(distance: Number, divisions: Number? = definedExternally /* null */): Number = definedExternally
    open fun getUtoTmapping(u: Number, distance: Number, divisions: Number? = definedExternally /* null */): Number = definedExternally
    open fun updateArcLengths(): Unit = definedExternally
}
open external class Ellipse : Curve {
    constructor(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, xRadius: Number? = definedExternally /* null */, yRadius: Number? = definedExternally /* null */, startAngle: Number? = definedExternally /* null */, endAngle: Number? = definedExternally /* null */, clockwise: Boolean? = definedExternally /* null */, rotation: Number? = definedExternally /* null */)
    constructor(x: EllipseCurveConfig? = definedExternally /* null */, y: Number? = definedExternally /* null */, xRadius: Number? = definedExternally /* null */, yRadius: Number? = definedExternally /* null */, startAngle: Number? = definedExternally /* null */, endAngle: Number? = definedExternally /* null */, clockwise: Boolean? = definedExternally /* null */, rotation: Number? = definedExternally /* null */)

    open var p0: Math.Vector2
    open var x: Number
    open var y: Number
    open var xRadius: Number
    open var yRadius: Number
    open var startAngle: Number
    open var endAngle: Number
    open var clockwise: Boolean
    open var angle: Number
    open var rotation: Number
    override fun <O : Math.Vector2> getStartPoint(out: O? /* null */): O = definedExternally
    open fun getResolution(divisions: Number): Number = definedExternally
    open fun <O : Math.Vector2> getPoint(t: Number, out: O? = definedExternally /* null */): O = definedExternally
    open fun setXRadius(value: Number): Ellipse = definedExternally
    open fun setYRadius(value: Number): Ellipse = definedExternally
    open fun setWidth(value: Number): Ellipse = definedExternally
    open fun setHeight(value: Number): Ellipse = definedExternally
    open fun setStartAngle(value: Number): Ellipse = definedExternally
    open fun setEndAngle(value: Number): Ellipse = definedExternally
    open fun setClockwise(value: Boolean): Ellipse = definedExternally
    open fun setRotation(value: Number): Ellipse = definedExternally
    open fun toJSON(): JSONEllipseCurve = definedExternally
    companion object {
        fun fromJSON(data: JSONEllipseCurve): Ellipse = definedExternally
    }
}
open external class Line : Curve {
    constructor(p0: Array<Number>, p1: Math.Vector2? = definedExternally /* null */)
    constructor(p0: Math.Vector2, p1: Math.Vector2? = definedExternally /* null */)
    open var p0: Math.Vector2
    open var p1: Math.Vector2
    open fun <O : Geom.Rectangle> getBounds(out: O? = definedExternally /* null */): O = definedExternally
    override fun <O : Math.Vector2> getStartPoint(out: O? /* null */): O = definedExternally
    open fun getResolution(divisions: Number? = definedExternally /* null */): Number = definedExternally
    open fun <O : Math.Vector2> getPoint(t: Number, out: O? = definedExternally /* null */): O = definedExternally
    override fun <O : Math.Vector2> getPointAt(u: Number, out: O? /* null */): O = definedExternally
    open fun <O : Math.Vector2> getTangent(): O = definedExternally
    open fun <G : org.decembrist.Phaser.GameObjects.Graphics> draw(graphics: G): G = definedExternally
    open fun toJSON(): JSONCurve = definedExternally
    companion object {
        fun fromJSON(data: JSONCurve): Line = definedExternally
    }
}
open external class MoveTo(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */) {
    open var active: Boolean = definedExternally
    open var p0: Math.Vector2 = definedExternally
    open fun <O : Math.Vector2> getPoint(t: Number, out: O? = definedExternally /* null */): O = definedExternally
    open fun <O : Math.Vector2> getPointAt(u: Number, out: O? = definedExternally /* null */): O = definedExternally
    open fun getResolution(): Number = definedExternally
    open fun getLength(): Number = definedExternally
    open fun toJSON(): JSONCurve = definedExternally
}
open external class Path(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */) {
    open var name: String = definedExternally
    open var curves: Array<Curve> = definedExternally
    open var cacheLengths: Array<Number> = definedExternally
    open var autoClose: Boolean = definedExternally
    open var startPoint: Math.Vector2 = definedExternally
    open fun add(curve: Curve): Path = definedExternally
    open fun circleTo(radius: Number, clockwise: Boolean? = definedExternally /* null */, rotation: Number? = definedExternally /* null */): Path = definedExternally
    open fun closePath(): Path = definedExternally
    open fun cubicBezierTo(x: Number, y: Number, control1X: Number, control1Y: Number? = definedExternally /* null */, control2X: Number? = definedExternally /* null */, control2Y: Number? = definedExternally /* null */): Path = definedExternally
    open fun cubicBezierTo(x: Number, y: Number, control1X: Math.Vector2, control1Y: Number? = definedExternally /* null */, control2X: Number? = definedExternally /* null */, control2Y: Number? = definedExternally /* null */): Path = definedExternally
    open fun cubicBezierTo(x: Number, y: Math.Vector2, control1X: Number, control1Y: Number? = definedExternally /* null */, control2X: Number? = definedExternally /* null */, control2Y: Number? = definedExternally /* null */): Path = definedExternally
    open fun cubicBezierTo(x: Number, y: Math.Vector2, control1X: Math.Vector2, control1Y: Number? = definedExternally /* null */, control2X: Number? = definedExternally /* null */, control2Y: Number? = definedExternally /* null */): Path = definedExternally
    open fun cubicBezierTo(x: Math.Vector2, y: Number, control1X: Number, control1Y: Number? = definedExternally /* null */, control2X: Number? = definedExternally /* null */, control2Y: Number? = definedExternally /* null */): Path = definedExternally
    open fun cubicBezierTo(x: Math.Vector2, y: Number, control1X: Math.Vector2, control1Y: Number? = definedExternally /* null */, control2X: Number? = definedExternally /* null */, control2Y: Number? = definedExternally /* null */): Path = definedExternally
    open fun cubicBezierTo(x: Math.Vector2, y: Math.Vector2, control1X: Number, control1Y: Number? = definedExternally /* null */, control2X: Number? = definedExternally /* null */, control2Y: Number? = definedExternally /* null */): Path = definedExternally
    open fun cubicBezierTo(x: Math.Vector2, y: Math.Vector2, control1X: Math.Vector2, control1Y: Number? = definedExternally /* null */, control2X: Number? = definedExternally /* null */, control2Y: Number? = definedExternally /* null */): Path = definedExternally
    open fun quadraticBezierTo(x: Number, y: Number? = definedExternally /* null */, controlX: Number? = definedExternally /* null */, controlY: Number? = definedExternally /* null */): Path = definedExternally
    open fun quadraticBezierTo(x: Array<Math.Vector2>, y: Number? = definedExternally /* null */, controlX: Number? = definedExternally /* null */, controlY: Number? = definedExternally /* null */): Path = definedExternally
    open fun <G : org.decembrist.Phaser.GameObjects.Graphics> draw(graphics: org.decembrist.Phaser.GameObjects.Graphics, pointsTotal: Number? = definedExternally /* null */): G = definedExternally
    open fun ellipseTo(xRadius: Number, yRadius: Number, startAngle: Number, endAngle: Number, clockwise: Boolean, rotation: Number): Path = definedExternally
    open fun fromJSON(data: Any): Path = definedExternally
    open fun <O : Math.Vector2> getBounds(out: O? = definedExternally /* null */, accuracy: Number? = definedExternally /* null */): O = definedExternally
    open fun getCurveLengths(): Array<Number> = definedExternally
    open fun <O : Math.Vector2> getEndPoint(out: O? = definedExternally /* null */): O = definedExternally
    open fun getLength(): Number = definedExternally
    open fun <O : Math.Vector2> getPoint(t: Number, out: O? = definedExternally /* null */): O = definedExternally
    open fun getPoints(divisions: Number? = definedExternally /* null */): Array<Math.Vector2> = definedExternally
    open fun <O : Math.Vector2> getRandomPoint(out: O? = definedExternally /* null */): O = definedExternally
    open fun getSpacedPoints(divisions: Number? = definedExternally /* null */): Array<Math.Vector2> = definedExternally
    open fun <O : Math.Vector2> getStartPoint(out: O? = definedExternally /* null */): O = definedExternally
    open fun lineTo(x: Number, y: Number? = definedExternally /* null */): Path = definedExternally
    open fun lineTo(x: Math.Vector2, y: Number? = definedExternally /* null */): Path = definedExternally
    open fun splineTo(points: Array<Math.Vector2>): Path = definedExternally
    open fun moveTo(x: Number, y: Number): Path = definedExternally
    open fun toJSON(): JSONPath = definedExternally
    open fun updateArcLengths(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
open external class QuadraticBezier : Curve {
    constructor(p0: Array<Number>, p1: Math.Vector2, p2: Math.Vector2)
    constructor(p0: Math.Vector2, p1: Math.Vector2, p2: Math.Vector2)
    open var p0: Math.Vector2
    open var p1: Math.Vector2
    open var p2: Math.Vector2
    override fun <O : Math.Vector2> getStartPoint(out: O? /* null */): O = definedExternally
    open fun getResolution(divisions: Number): Number = definedExternally
    open fun <O : Math.Vector2> getPoint(t: Number, out: O? = definedExternally /* null */): O = definedExternally
    override fun <G : org.decembrist.Phaser.GameObjects.Graphics> draw(graphics: G, pointsTotal: Number? /* null */): G = definedExternally
    open fun toJSON(): JSONCurve = definedExternally
    companion object {
        fun fromJSON(data: JSONCurve): QuadraticBezier = definedExternally
    }
}
open external class Spline(points: Array<Math.Vector2>? = definedExternally /* null */) : Curve {
    open var points: Array<Math.Vector2> = definedExternally
    open fun addPoints(points: Array<Number>): Spline = definedExternally
    open fun addPoints(points: Array<Math.Vector2>): Spline = definedExternally
    open fun addPoints(points: Array<Array<Number>>): Spline = definedExternally
    open fun addPoint(x: Number, y: Number): Math.Vector2 = definedExternally
    override fun <O : Math.Vector2> getStartPoint(out: O? /* null */): O = definedExternally
    open fun getResolution(divisions: Number): Number = definedExternally
    open fun <O : Math.Vector2> getPoint(t: Number, out: O? = definedExternally /* null */): O = definedExternally
    open fun toJSON(): JSONCurve = definedExternally
    companion object {
        fun fromJSON(data: JSONCurve): Spline = definedExternally
    }
}
