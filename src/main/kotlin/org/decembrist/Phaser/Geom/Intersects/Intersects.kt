@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "EXTERNAL_DELEGATION",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE"
)
@file:[JsModule("phaser") JsQualifier("Geom.Intersects")]

package org.decembrist.Phaser.Geom.Intersects

import org.decembrist.Phaser.Geom.Geom

external fun CircleToCircle(
    circleA: Geom.Circle,
    circleB: Geom.Circle
): Boolean = definedExternally

external fun CircleToRectangle(
    circle: Geom.Circle,
    rect: Geom.Rectangle
): Boolean = definedExternally

external fun <O : Geom.Rectangle> GetRectangleIntersection(
    rectA: Geom.Rectangle,
    rectB: Geom.Rectangle,
    output: O? = definedExternally /* null */
): O = definedExternally

external fun LineToCircle(
    line: Geom.Line,
    circle: Geom.Circle,
    nearest: Geom.Point? = definedExternally /* null */
): Boolean = definedExternally

external fun LineToLine(
    line1: Geom.Line,
    line2: Geom.Line,
    out: Geom.Point? = definedExternally /* null */
): Boolean = definedExternally

external fun LineToRectangle(line: Geom.Line, rect: Any?): Boolean = definedExternally
external fun LineToRectangle(
    line: Geom.Line,
    rect: Geom.Rectangle
): Boolean = definedExternally

external fun PointToLine(point: Geom.Point, line: Geom.Line): Boolean =
    definedExternally

external fun PointToLineSegment(
    point: Geom.Point,
    line: Geom.Line
): Boolean = definedExternally

external fun RectangleToRectangle(
    rectA: Geom.Rectangle,
    rectB: Geom.Rectangle
): Boolean = definedExternally

external fun RectangleToTriangle(
    rect: Geom.Rectangle,
    triangle: Geom.Triangle
): Boolean = definedExternally

external fun RectangleToValues(
    rect: Geom.Rectangle,
    left: Number,
    right: Number,
    top: Number,
    bottom: Number,
    tolerance: Number? = definedExternally /* null */
): Boolean = definedExternally

external fun TriangleToCircle(
    triangle: Geom.Triangle,
    circle: Geom.Circle
): Boolean = definedExternally

external fun TriangleToLine(
    triangle: Geom.Triangle,
    line: Geom.Line
): Boolean = definedExternally

external fun TriangleToTriangle(
    triangleA: Geom.Triangle,
    triangleB: Geom.Triangle
): Boolean = definedExternally
