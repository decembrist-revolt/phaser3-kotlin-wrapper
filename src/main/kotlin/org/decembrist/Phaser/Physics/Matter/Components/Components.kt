@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Physics.Matter.Components")]
package org.decembrist.Phaser.Physics.Matter.Components

external interface Bounce {
    fun setBounce(value: Number): org.decembrist.Phaser.GameObjects.GameObject
}
external interface Collision {
    fun setCollisionCategory(value: Number): org.decembrist.Phaser.GameObjects.GameObject
    fun setCollisionGroup(value: Number): org.decembrist.Phaser.GameObjects.GameObject
    fun setCollidesWith(categories: Number): org.decembrist.Phaser.GameObjects.GameObject
    fun setCollidesWith(categories: Array<Number>): org.decembrist.Phaser.GameObjects.GameObject
}
external interface Force {
    fun applyForce(force: org.decembrist.Phaser.Math.Vector2): org.decembrist.Phaser.GameObjects.GameObject
    fun applyForceFrom(position: org.decembrist.Phaser.Math.Vector2, force: org.decembrist.Phaser.Math.Vector2): org.decembrist.Phaser.GameObjects.GameObject
    fun thrust(speed: Number): org.decembrist.Phaser.GameObjects.GameObject
    fun thrustLeft(speed: Number): org.decembrist.Phaser.GameObjects.GameObject
    fun thrustRight(speed: Number): org.decembrist.Phaser.GameObjects.GameObject
    fun thrustBack(speed: Number): org.decembrist.Phaser.GameObjects.GameObject
}
external interface Friction {
    fun setFriction(value: Number, air: Number? = definedExternally /* null */, fstatic: Number? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject
    fun setFrictionAir(value: Number): org.decembrist.Phaser.GameObjects.GameObject
    fun setFrictionStatic(value: Number): org.decembrist.Phaser.GameObjects.GameObject
}
external interface Gravity {
    fun setIgnoreGravity(value: Boolean): org.decembrist.Phaser.GameObjects.GameObject
}
external interface Mass {
    fun setMass(value: Number): org.decembrist.Phaser.GameObjects.GameObject
    fun setDensity(value: Number): org.decembrist.Phaser.GameObjects.GameObject
    var centerOfMass: Any
}
external interface Sensor {
    fun setSensor(value: Boolean): org.decembrist.Phaser.GameObjects.GameObject
    fun isSensor(): Boolean
}
external interface SetBody {
    fun setRectangle(width: Number, height: Number, options: Any): org.decembrist.Phaser.GameObjects.GameObject
    fun setCircle(radius: Number, options: Any): org.decembrist.Phaser.GameObjects.GameObject
    fun setPolygon(radius: Number, sides: Number, options: Any): org.decembrist.Phaser.GameObjects.GameObject
    fun setTrapezoid(width: Number, height: Number, slope: Number, options: Any): org.decembrist.Phaser.GameObjects.GameObject
    fun setExistingBody(body: org.decembrist.MatterJS.Body, addToWorld: Boolean? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject
    fun setBody(config: Any, options: Any): org.decembrist.Phaser.GameObjects.GameObject
}
external interface Sleep {
    fun setSleepThreshold(value: Number? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject
    fun setSleepEvents(start: Boolean, end: Boolean): org.decembrist.Phaser.GameObjects.GameObject
    fun setSleepStartEvent(value: Boolean): org.decembrist.Phaser.GameObjects.GameObject
    fun setSleepEndEvent(value: Boolean): org.decembrist.Phaser.GameObjects.GameObject
}
external interface Static {
    fun setStatic(value: Boolean): org.decembrist.Phaser.GameObjects.GameObject
    fun isStatic(): Boolean
}
external interface Transform {
    var x: Number
    var y: Number
    var scaleX: Number
    var scaleY: Number
    var angle: Number
    var rotation: Number
    fun setPosition(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */): Transform /* this */
    fun setRotation(radians: Number? /* null */): Transform /* this */
    fun setFixedRotation(): Transform /* this */
    fun setAngle(degrees: Number? /* null */): Transform /* this */
    fun setScale(x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, point: org.decembrist.Phaser.Math.Vector2? = definedExternally /* null */): Transform /* this */
}
external interface Velocity {
    fun setAngularVelocity(value: Number): org.decembrist.Phaser.GameObjects.GameObject
    fun setVelocityX(x: Number): org.decembrist.Phaser.GameObjects.GameObject
    fun setVelocityY(y: Number): org.decembrist.Phaser.GameObjects.GameObject
    fun setVelocity(x: Number, y: Number? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject
}
