@file:JsModule("phaser")

package org.decembrist.Phaser.Geom

external object Geom {

    open class Circle(
        x: Number? = definedExternally /* null */,
        y: Number? = definedExternally /* null */,
        radius: Number? = definedExternally /* null */
    ) {
        open var x: Number = definedExternally
        open var y: Number = definedExternally
        open fun contains(x: Number, y: Number): Boolean = definedExternally
        open fun <O : Geom.Point> getPoint(
            position: Number,
            out: O? = definedExternally /* null */
        ): O = definedExternally

        open fun <O : Array<Geom.Point>> getPoints(
            quantity: Number,
            stepRate: Number? = definedExternally /* null */,
            output: O? = definedExternally /* null */
        ): O = definedExternally

        open fun <O : Geom.Point> getRandomPoint(point: O? = definedExternally /* null */): O =
            definedExternally

        open fun setTo(
            x: Number? = definedExternally /* null */,
            y: Number? = definedExternally /* null */,
            radius: Number? = definedExternally /* null */
        ): Geom.Circle = definedExternally

        open fun setEmpty(): Geom.Circle = definedExternally
        open fun setPosition(
            x: Number? = definedExternally /* null */,
            y: Number? = definedExternally /* null */
        ): Geom.Circle = definedExternally

        open fun isEmpty(): Boolean = definedExternally
        open var radius: Number = definedExternally
        open var diameter: Number = definedExternally
        open var left: Number = definedExternally
        open var right: Number = definedExternally
        open var top: Number = definedExternally
        open var bottom: Number = definedExternally

        companion object {
            fun Area(circle: Geom.Circle): Number = definedExternally
            fun Circumference(circle: Geom.Circle): Number = definedExternally
            fun <O : Geom.Point> CircumferencePoint(
                circle: Geom.Circle,
                angle: Number,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun Clone(source: Any?): Geom.Circle = definedExternally
            fun Clone(source: Geom.Circle): Geom.Circle = definedExternally
            fun Contains(circle: Geom.Circle, x: Number, y: Number): Boolean = definedExternally
            fun ContainsPoint(circle: Geom.Circle, point: Any?): Boolean = definedExternally
            fun ContainsPoint(
                circle: Geom.Circle,
                point: Geom.Point
            ): Boolean = definedExternally

            fun ContainsRect(circle: Geom.Circle, rect: Any?): Boolean = definedExternally
            fun ContainsRect(
                circle: Geom.Circle,
                rect: Geom.Rectangle
            ): Boolean = definedExternally

            fun <O : Geom.Circle> CopyFrom(
                source: Geom.Circle,
                dest: O
            ): O = definedExternally

            fun Equals(
                circle: Geom.Circle,
                toCompare: Geom.Circle
            ): Boolean = definedExternally

            fun <O : Geom.Rectangle> GetBounds(
                circle: Geom.Circle,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Geom.Point> GetPoint(
                circle: Geom.Circle,
                position: Number,
                out: O? = definedExternally /* null */
            ): O =
                definedExternally

            fun GetPoints(
                circle: Geom.Circle,
                quantity: Number,
                stepRate: Number? = definedExternally /* null */,
                output: Array<Any>? = definedExternally /* null */
            ): Array<Geom.Point> = definedExternally

            fun <O : Geom.Circle> Offset(circle: O, x: Number, y: Number): O = definedExternally
            fun <O : Geom.Circle> OffsetPoint(circle: O, point: Any?): O = definedExternally
            fun <O : Geom.Circle> OffsetPoint(
                circle: O,
                point: Geom.Point
            ): O = definedExternally

            fun <O : Geom.Point> Random(
                circle: Geom.Circle,
                out: O? = definedExternally /* null */
            ): O = definedExternally
        }
    }

    open class Ellipse(
        x: Number? = definedExternally /* null */,
        y: Number? = definedExternally /* null */,
        width: Number? = definedExternally /* null */,
        height: Number? = definedExternally /* null */
    ) {
        open var x: Number = definedExternally
        open var y: Number = definedExternally
        open var width: Number = definedExternally
        open var height: Number = definedExternally
        open fun contains(x: Number, y: Number): Boolean = definedExternally
        open fun <O : Geom.Point> getPoint(
            position: Number,
            out: O? = definedExternally /* null */
        ): O = definedExternally

        open fun getPoints(
            quantity: Number,
            stepRate: Number? = definedExternally /* null */,
            output: Array<Any>? = definedExternally /* null */
        ): Array<Geom.Point> = definedExternally

        open fun <O : Geom.Point> getRandomPoint(point: O? = definedExternally /* null */): O =
            definedExternally

        open fun setTo(x: Number, y: Number, width: Number, height: Number): Geom.Ellipse =
            definedExternally

        open fun setEmpty(): Geom.Ellipse = definedExternally
        open fun setPosition(x: Number, y: Number): Geom.Ellipse = definedExternally
        open fun setSize(
            width: Number,
            height: Number? = definedExternally /* null */
        ): Geom.Ellipse = definedExternally

        open fun isEmpty(): Boolean = definedExternally
        open fun getMinorRadius(): Number = definedExternally
        open fun getMajorRadius(): Number = definedExternally
        open var left: Number = definedExternally
        open var right: Number = definedExternally
        open var top: Number = definedExternally
        open var bottom: Number = definedExternally

        companion object {
            fun Area(ellipse: Geom.Ellipse): Number = definedExternally
            fun Circumference(ellipse: Geom.Ellipse): Number = definedExternally
            fun <O : Geom.Point> CircumferencePoint(
                ellipse: Geom.Ellipse,
                angle: Number,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun Clone(source: Geom.Ellipse): Geom.Ellipse =
                definedExternally

            fun Contains(ellipse: Geom.Ellipse, x: Number, y: Number): Boolean = definedExternally
            fun ContainsPoint(ellipse: Geom.Ellipse, point: Any?): Boolean = definedExternally
            fun ContainsPoint(
                ellipse: Geom.Ellipse,
                point: Geom.Point
            ): Boolean = definedExternally

            fun ContainsRect(ellipse: Geom.Ellipse, rect: Any?): Boolean = definedExternally
            fun ContainsRect(
                ellipse: Geom.Ellipse,
                rect: Geom.Rectangle
            ): Boolean = definedExternally

            fun <O : Geom.Ellipse> CopyFrom(
                source: Geom.Ellipse,
                dest: O
            ): O = definedExternally

            fun Equals(
                ellipse: Geom.Ellipse,
                toCompare: Geom.Ellipse
            ): Boolean = definedExternally

            fun <O : Geom.Rectangle> GetBounds(
                ellipse: Geom.Ellipse,
                out: O? = definedExternally /* null */
            ): O =
                definedExternally

            fun <O : Geom.Point> GetPoint(
                ellipse: Geom.Ellipse,
                position: Number,
                out: O? = definedExternally /* null */
            ): O =
                definedExternally

            fun <O : Array<Geom.Point>> GetPoints(
                ellipse: Geom.Ellipse,
                quantity: Number,
                stepRate: Number? = definedExternally /* null */,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Geom.Ellipse> Offset(ellipse: O, x: Number, y: Number): O = definedExternally
            fun <O : Geom.Ellipse> OffsetPoint(ellipse: O, point: Any?): O = definedExternally
            fun <O : Geom.Ellipse> OffsetPoint(
                ellipse: O,
                point: Geom.Point
            ): O = definedExternally

            fun <O : Geom.Point> Random(
                ellipse: Geom.Ellipse,
                out: O? = definedExternally /* null */
            ): O = definedExternally
        }
    }

    open class Line(
        x1: Number? = definedExternally /* null */,
        y1: Number? = definedExternally /* null */,
        x2: Number? = definedExternally /* null */,
        y2: Number? = definedExternally /* null */
    ) {
        open var x1: Number = definedExternally
        open var y1: Number = definedExternally
        open var x2: Number = definedExternally
        open var y2: Number = definedExternally
        open fun <O : Geom.Point> getPoint(
            position: Number,
            output: O? = definedExternally /* null */
        ): O =
            definedExternally

        open fun <O : Geom.Point> getPoints(
            quantity: Number,
            stepRate: Number? = definedExternally /* null */,
            output: O? = definedExternally /* null */
        ): O = definedExternally

        open fun <O : Geom.Point> getRandomPoint(point: O? = definedExternally /* null */): O =
            definedExternally

        open fun setTo(
            x1: Number? = definedExternally /* null */,
            y1: Number? = definedExternally /* null */,
            x2: Number? = definedExternally /* null */,
            y2: Number? = definedExternally /* null */
        ): Geom.Line = definedExternally

        open fun <O : org.decembrist.Phaser.Math.Vector2> getPointA(vec2: O? = definedExternally /* null */): O =
            definedExternally

        open fun <O : org.decembrist.Phaser.Math.Vector2> getPointB(vec2: O? = definedExternally /* null */): O =
            definedExternally

        open var left: Number = definedExternally
        open var right: Number = definedExternally
        open var top: Number = definedExternally
        open var bottom: Number = definedExternally

        companion object {
            fun Angle(line: Geom.Line): Number = definedExternally
            fun BresenhamPoints(
                line: Geom.Line,
                stepRate: Number? = definedExternally /* null */,
                results: Array<Any>? = definedExternally /* null */
            ): Array<Any?> = definedExternally

            fun CenterOn(line: Geom.Line, x: Number, y: Number): Geom.Line =
                definedExternally

            fun Clone(source: Geom.Line): Geom.Line = definedExternally
            fun <O : Geom.Line> CopyFrom(source: Geom.Line, dest: O): O =
                definedExternally

            fun Equals(line: Geom.Line, toCompare: Geom.Line): Boolean =
                definedExternally

            fun <O : Geom.Point> GetMidPoint(
                line: Geom.Line,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Geom.Point> GetNormal(
                line: Geom.Line,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Geom.Point> GetPoint(
                line: Geom.Line,
                position: Number,
                out: O? = definedExternally /* null */
            ): O =
                definedExternally

            fun <O : Array<Geom.Point>> GetPoints(
                line: Geom.Line,
                quantity: Number,
                stepRate: Number? = definedExternally /* null */,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun Height(line: Geom.Line): Number = definedExternally
            fun Length(line: Geom.Line): Number = definedExternally
            fun NormalAngle(line: Geom.Line): Number = definedExternally
            fun NormalX(line: Geom.Line): Number = definedExternally
            fun NormalY(line: Geom.Line): Number = definedExternally
            fun <O : Geom.Line> Offset(line: O, x: Number, y: Number): O = definedExternally
            fun PerpSlope(line: Geom.Line): Number = definedExternally
            fun <O : Geom.Point> Random(
                line: Geom.Line,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun ReflectAngle(lineA: Geom.Line, lineB: Geom.Line): Number =
                definedExternally

            fun <O : Geom.Line> Rotate(line: O, angle: Number): O = definedExternally
            fun <O : Geom.Line> RotateAroundPoint(line: O, point: Any?, angle: Number): O =
                definedExternally

            fun <O : Geom.Line> RotateAroundPoint(
                line: O,
                point: Geom.Point,
                angle: Number
            ): O = definedExternally

            fun <O : Geom.Line> RotateAroundXY(line: O, x: Number, y: Number, angle: Number): O =
                definedExternally

            fun <O : Geom.Line> SetToAngle(
                line: O,
                x: Number,
                y: Number,
                angle: Number,
                length: Number
            ): O =
                definedExternally

            fun Slope(line: Geom.Line): Number = definedExternally
            fun Width(line: Geom.Line): Number = definedExternally
        }
    }

    open class Point(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */) {
        open var x: Number = definedExternally
        open var y: Number = definedExternally
        open fun setTo(
            x: Number? = definedExternally /* null */,
            y: Number? = definedExternally /* null */
        ): Geom.Point =
            definedExternally

        companion object {
            fun <O : Geom.Point> Ceil(point: O): O = definedExternally
            fun Clone(source: Geom.Point): Geom.Point = definedExternally
            fun <O : Geom.Point> CopyFrom(source: Geom.Point, dest: O): O =
                definedExternally

            fun Equals(point: Geom.Point, toCompare: Geom.Point): Boolean =
                definedExternally

            fun <O : Geom.Point> Floor(point: O): O = definedExternally
            fun <O : Geom.Point> GetCentroid(
                points: Array<Geom.Point>,
                out: O? = definedExternally /* null */
            ): O =
                definedExternally

            fun GetMagnitude(point: Geom.Point): Number = definedExternally
            fun GetMagnitudeSq(point: Geom.Point): Number = definedExternally
            fun <O : Geom.Rectangle> GetRectangleFromPoints(
                points: Array<Geom.Point>,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Geom.Point> Interpolate(
                pointA: Geom.Point,
                pointB: Geom.Point,
                t: Number? = definedExternally /* null */,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Geom.Point> Invert(point: O): O = definedExternally
            fun <O : Geom.Point> Negative(
                point: Geom.Point,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Geom.Point> Project(
                pointA: Geom.Point,
                pointB: Geom.Point,
                out: O? = definedExternally /* null */
            ): O =
                definedExternally

            fun <O : Geom.Point> ProjectUnit(
                pointA: Geom.Point,
                pointB: Geom.Point,
                out: O? = definedExternally /* null */
            ): O =
                definedExternally

            fun <O : Geom.Point> SetMagnitude(point: O, magnitude: Number): O = definedExternally
        }
    }

    open class Polygon(points: Array<Geom.Point>? = definedExternally /* null */) {
        open var area: Number = definedExternally
        open var points: Array<Geom.Point> = definedExternally
        open fun contains(x: Number, y: Number): Boolean = definedExternally
        open fun setTo(points: Array<Any>): Geom.Polygon = definedExternally
        open fun calculateArea(): Number = definedExternally
        open fun getPoints(
            quantity: Number,
            stepRate: Number? = definedExternally /* null */,
            output: Array<Any>? = definedExternally /* null */
        ): Array<Geom.Point> = definedExternally

        companion object {
            fun Clone(polygon: Geom.Polygon): Geom.Polygon =
                definedExternally

            fun Contains(polygon: Geom.Polygon, x: Number, y: Number): Boolean = definedExternally
            fun ContainsPoint(
                polygon: Geom.Polygon,
                point: Geom.Point
            ): Boolean = definedExternally

            fun <O : Geom.Rectangle> GetAABB(
                polygon: Geom.Polygon,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Array<Number>> GetNumberArray(
                polygon: Geom.Polygon,
                output: O? = definedExternally /* null */
            ): O =
                definedExternally

            fun GetPoints(
                polygon: Geom.Polygon,
                quantity: Number,
                stepRate: Number? = definedExternally /* null */,
                output: Array<Any>? = definedExternally /* null */
            ): Array<Geom.Point> = definedExternally

            fun Perimeter(polygon: Geom.Polygon): Number = definedExternally
            fun <O : Geom.Polygon> Reverse(polygon: O): O = definedExternally
            fun <O : Geom.Polygon> Smooth(polygon: O): O = definedExternally
        }
    }

    open class Rectangle(
        x: Number? = definedExternally /* null */,
        y: Number? = definedExternally /* null */,
        width: Number? = definedExternally /* null */,
        height: Number? = definedExternally /* null */
    ) {
        open var x: Number = definedExternally
        open var y: Number = definedExternally
        open var width: Number = definedExternally
        open var height: Number = definedExternally
        open fun contains(x: Number, y: Number): Boolean = definedExternally
        open fun <O : Geom.Point> getPoint(
            position: Number,
            output: O? = definedExternally /* null */
        ): O =
            definedExternally

        open fun <O : Array<Geom.Point>> getPoints(
            quantity: Number,
            stepRate: Number? = definedExternally /* null */,
            output: O? = definedExternally /* null */
        ): O = definedExternally

        open fun <O : Geom.Point> getRandomPoint(point: O? = definedExternally /* null */): O =
            definedExternally

        open fun setTo(x: Number, y: Number, width: Number, height: Number): Geom.Rectangle =
            definedExternally

        open fun setEmpty(): Geom.Rectangle = definedExternally
        open fun setPosition(
            x: Number,
            y: Number? = definedExternally /* null */
        ): Geom.Rectangle = definedExternally

        open fun setSize(
            width: Number,
            height: Number? = definedExternally /* null */
        ): Geom.Rectangle = definedExternally

        open fun isEmpty(): Boolean = definedExternally
        open fun <O : Geom.Line> getLineA(line: O? = definedExternally /* null */): O =
            definedExternally

        open fun <O : Geom.Line> getLineB(line: O? = definedExternally /* null */): O =
            definedExternally

        open fun <O : Geom.Line> getLineC(line: O? = definedExternally /* null */): O =
            definedExternally

        open fun <O : Geom.Line> getLineD(line: O? = definedExternally /* null */): O =
            definedExternally

        open var left: Number = definedExternally
        open var right: Number = definedExternally
        open var top: Number = definedExternally
        open var bottom: Number = definedExternally
        open var centerX: Number = definedExternally
        open var centerY: Number = definedExternally

        companion object {
            fun Area(rect: Geom.Rectangle): Number = definedExternally
            fun <O : Geom.Rectangle> Ceil(rect: O): O = definedExternally
            fun <O : Geom.Rectangle> CeilAll(rect: O): O = definedExternally
            fun <O : Geom.Rectangle> CenterOn(rect: O, x: Number, y: Number): O =
                definedExternally

            fun Clone(source: Geom.Rectangle): Geom.Rectangle =
                definedExternally

            fun Contains(rect: Geom.Rectangle, x: Number, y: Number): Boolean = definedExternally
            fun ContainsPoint(
                rect: Geom.Rectangle,
                point: Geom.Point
            ): Boolean = definedExternally

            fun ContainsRect(
                rectA: Geom.Rectangle,
                rectB: Geom.Rectangle
            ): Boolean = definedExternally

            fun <O : Geom.Rectangle> CopyFrom(
                source: Geom.Rectangle,
                dest: O
            ): O = definedExternally

            fun Decompose(
                rect: Geom.Rectangle,
                out: Array<Any>? = definedExternally /* null */
            ): Array<Any> =
                definedExternally

            fun Equals(
                rect: Geom.Rectangle,
                toCompare: Geom.Rectangle
            ): Boolean = definedExternally

            fun <O : Geom.Rectangle> FitInside(
                target: O,
                source: Geom.Rectangle
            ): O = definedExternally

            fun <O : Geom.Rectangle> FitOutside(
                target: O,
                source: Geom.Rectangle
            ): O = definedExternally

            fun <O : Geom.Rectangle> Floor(rect: O): O = definedExternally
            fun <O : Geom.Rectangle> FloorAll(rect: O): O = definedExternally
            fun <O : Geom.Rectangle> FromPoints(
                points: Array<Any>,
                out: O? = definedExternally /* null */
            ): O =
                definedExternally

            fun GetAspectRatio(rect: Geom.Rectangle): Number = definedExternally
            fun <O : Geom.Point> GetCenter(
                rect: Geom.Rectangle,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Geom.Point> GetPoint(
                rectangle: Geom.Rectangle,
                position: Number,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Array<Geom.Point>> GetPoints(
                rectangle: Geom.Rectangle,
                step: Number,
                quantity: Number,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Geom.Point> GetSize(
                rect: Geom.Rectangle,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Geom.Rectangle> Inflate(rect: O, x: Number, y: Number): O = definedExternally
            fun <O : Geom.Rectangle> Intersection(
                rectA: Geom.Rectangle,
                rectB: Geom.Rectangle,
                out: Geom.Rectangle? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Array<Geom.Point>> MarchingAnts(
                rect: Geom.Rectangle,
                step: Number,
                quantity: Number,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Geom.Rectangle> MergePoints(
                target: O,
                points: Array<Geom.Point>
            ): O = definedExternally

            fun <O : Geom.Rectangle> MergeRect(
                target: O,
                source: Geom.Rectangle
            ): O = definedExternally

            fun <O : Geom.Rectangle> MergeXY(target: O, x: Number, y: Number): O =
                definedExternally

            fun <O : Geom.Rectangle> Offset(rect: O, x: Number, y: Number): O = definedExternally
            fun <O : Geom.Rectangle> OffsetPoint(
                rect: O,
                point: org.decembrist.Phaser.Math.Vector2
            ): O = definedExternally

            fun <O : Geom.Rectangle> OffsetPoint(
                rect: O,
                point: Geom.Point
            ): O = definedExternally

            fun Overlaps(
                rectA: Geom.Rectangle,
                rectB: Geom.Rectangle
            ): Boolean = definedExternally

            fun Perimeter(rect: Geom.Rectangle): Number = definedExternally
            fun <O : Geom.Point> PerimeterPoint(
                rectangle: Geom.Rectangle,
                angle: Number,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Geom.Point> Random(rect: Geom.Rectangle, out: O): O =
                definedExternally

            fun <O : Geom.Point> RandomOutside(
                outer: Geom.Rectangle,
                inner: Geom.Rectangle,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Geom.Rectangle> Scale(rect: O, x: Number, y: Number): O = definedExternally
            fun <O : Geom.Rectangle> Union(
                rectA: Geom.Rectangle,
                rectB: Geom.Rectangle,
                out: O? = definedExternally /* null */
            ): O =
                definedExternally
        }
    }

    open class Triangle(
        x1: Number? = definedExternally /* null */,
        y1: Number? = definedExternally /* null */,
        x2: Number? = definedExternally /* null */,
        y2: Number? = definedExternally /* null */,
        x3: Number? = definedExternally /* null */,
        y3: Number? = definedExternally /* null */
    ) {
        open var x1: Number = definedExternally
        open var y1: Number = definedExternally
        open var x2: Number = definedExternally
        open var y2: Number = definedExternally
        open var x3: Number = definedExternally
        open var y3: Number = definedExternally
        open fun contains(x: Number, y: Number): Boolean = definedExternally
        open fun <O : Geom.Point> getPoint(
            position: Number,
            output: O? = definedExternally /* null */
        ): O =
            definedExternally

        open fun <O : Array<Geom.Point>> getPoints(
            quantity: Number,
            stepRate: Number? = definedExternally /* null */,
            output: O? = definedExternally /* null */
        ): O = definedExternally

        open fun <O : Geom.Point> getRandomPoint(point: O? = definedExternally /* null */): O =
            definedExternally

        open fun setTo(
            x1: Number? = definedExternally /* null */,
            y1: Number? = definedExternally /* null */,
            x2: Number? = definedExternally /* null */,
            y2: Number? = definedExternally /* null */,
            x3: Number? = definedExternally /* null */,
            y3: Number? = definedExternally /* null */
        ): Geom.Triangle = definedExternally

        open fun <O : Geom.Line> getLineA(line: O? = definedExternally /* null */): O =
            definedExternally

        open fun <O : Geom.Line> getLineB(line: O? = definedExternally /* null */): O =
            definedExternally

        open fun <O : Geom.Line> getLineC(line: O? = definedExternally /* null */): O =
            definedExternally

        open var left: Number = definedExternally
        open var right: Number = definedExternally
        open var top: Number = definedExternally
        open var bottom: Number = definedExternally

        companion object {
            fun Area(triangle: Geom.Triangle): Number = definedExternally
            fun BuildEquilateral(x: Number, y: Number, length: Number): Geom.Triangle =
                definedExternally

            fun <O : Array<Geom.Triangle>> BuildFromPolygon(
                data: Array<Any>,
                holes: Array<Any>? = definedExternally /* null */,
                scaleX: Number? = definedExternally /* null */,
                scaleY: Number? = definedExternally /* null */,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun BuildRight(x: Number, y: Number, width: Number, height: Number): Geom.Triangle =
                definedExternally

            fun <O : Geom.Triangle> CenterOn(
                triangle: O,
                x: Number,
                y: Number,
                centerFunc: ((triangle: Geom.Triangle) -> Unit)? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Geom.Point> Centroid(
                triangle: Geom.Triangle,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : org.decembrist.Phaser.Math.Vector2> CircumCenter(
                triangle: Geom.Triangle,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Geom.Circle> CircumCircle(
                triangle: Geom.Triangle,
                out: O? = definedExternally /* null */
            ): O =
                definedExternally

            fun Clone(source: Geom.Triangle): Geom.Triangle =
                definedExternally

            fun Contains(triangle: Geom.Triangle, x: Number, y: Number): Boolean =
                definedExternally

            fun ContainsArray(
                triangle: Geom.Triangle,
                points: Array<Geom.Point>,
                returnFirst: Boolean? = definedExternally /* null */,
                out: Array<Any>? = definedExternally /* null */
            ): Array<Geom.Point> = definedExternally

            fun ContainsPoint(
                triangle: Geom.Triangle,
                point: Geom.Point
            ): Boolean = definedExternally

            fun <O : Geom.Triangle> CopyFrom(
                source: Geom.Triangle,
                dest: O
            ): O = definedExternally

            fun Decompose(
                triangle: Geom.Triangle,
                out: Array<Any>? = definedExternally /* null */
            ): Array<Any> =
                definedExternally

            fun Equals(
                triangle: Geom.Triangle,
                toCompare: Geom.Triangle
            ): Boolean = definedExternally

            fun <O : Geom.Point> GetPoint(
                triangle: Geom.Triangle,
                position: Number,
                out: O? = definedExternally /* null */
            ): O =
                definedExternally

            fun <O : Geom.Point> GetPoints(
                triangle: Geom.Triangle,
                quantity: Number,
                stepRate: Number,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Geom.Point> InCenter(
                triangle: Geom.Triangle,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Geom.Triangle> Offset(triangle: O, x: Number, y: Number): O =
                definedExternally

            fun Perimeter(triangle: Geom.Triangle): Number = definedExternally
            fun <O : Geom.Point> Random(
                triangle: Geom.Triangle,
                out: O? = definedExternally /* null */
            ): O = definedExternally

            fun <O : Geom.Triangle> Rotate(triangle: O, angle: Number): O = definedExternally
            fun <O : Geom.Triangle> RotateAroundPoint(
                triangle: O,
                point: Geom.Point,
                angle: Number
            ): O = definedExternally

            fun <O : Geom.Triangle> RotateAroundXY(
                triangle: O,
                x: Number,
                y: Number,
                angle: Number
            ): O = definedExternally
        }
    }

}




