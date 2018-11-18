@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Physics.Impact.Components")]
package org.decembrist.Phaser.Physics.Impact.Components

external interface Acceleration {
    fun setAccelerationX(x: Number): Acceleration /* this */
    fun setAccelerationY(y: Number): Acceleration /* this */
    fun setAcceleration(x: Number, y: Number): Acceleration /* this */
}
external interface BodyScale {
    fun setBodySize(width: Number, height: Number? = definedExternally /* null */): BodyScale /* this */
    fun setBodyScale(scaleX: Number, scaleY: Number? = definedExternally /* null */): BodyScale /* this */
}
external interface BodyType {
    fun getBodyType(): Number
    fun setTypeNone(): org.decembrist.Phaser.GameObjects.GameObject
    fun setTypeA(): org.decembrist.Phaser.GameObjects.GameObject
    fun setTypeB(): org.decembrist.Phaser.GameObjects.GameObject
}
external interface Bounce {
    fun setBounce(value: Number): org.decembrist.Phaser.GameObjects.GameObject
    fun setMinBounceVelocity(value: Number): org.decembrist.Phaser.GameObjects.GameObject
    var bounce: Number
}
external interface CheckAgainst {
    fun setAvsB(): org.decembrist.Phaser.GameObjects.GameObject
    fun setBvsA(): org.decembrist.Phaser.GameObjects.GameObject
    fun setCheckAgainstNone(): org.decembrist.Phaser.GameObjects.GameObject
    fun setCheckAgainstA(): org.decembrist.Phaser.GameObjects.GameObject
    fun setCheckAgainstB(): org.decembrist.Phaser.GameObjects.GameObject
    var checkAgainst: Number
}
external interface Collides {
    fun setCollideCallback(callback: (body: org.decembrist.Phaser.Physics.Impact.Body, other: org.decembrist.Phaser.Physics.Impact.Body, axis: String) -> Unit, scope: Any): org.decembrist.Phaser.GameObjects.GameObject
    fun setCollidesNever(): org.decembrist.Phaser.GameObjects.GameObject
    fun setLiteCollision(): org.decembrist.Phaser.GameObjects.GameObject
    fun setPassiveCollision(): org.decembrist.Phaser.GameObjects.GameObject
    fun setActiveCollision(): org.decembrist.Phaser.GameObjects.GameObject
    fun setFixedCollision(): org.decembrist.Phaser.GameObjects.GameObject
    var collides: Number
}
external interface Debug {
    fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): org.decembrist.Phaser.GameObjects.GameObject
    fun setDebugBodyColor(value: Number): org.decembrist.Phaser.GameObjects.GameObject
    var debugShowBody: Boolean
    var debugShowVelocity: Boolean
    var debugBodyColor: Number
}
external interface Friction {
    fun setFrictionX(x: Number): org.decembrist.Phaser.GameObjects.GameObject
    fun setFrictionY(y: Number): org.decembrist.Phaser.GameObjects.GameObject
    fun setFriction(x: Number, y: Number): org.decembrist.Phaser.GameObjects.GameObject
}
external interface Gravity {
    fun setGravity(value: Number): org.decembrist.Phaser.GameObjects.GameObject
    var gravity: Number
}
external interface Offset {
    fun setOffset(x: Number, y: Number, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject
}
external interface SetGameObject {
    fun setGameObject(gameObject: org.decembrist.Phaser.GameObjects.GameObject, sync: Boolean? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject
    fun syncGameObject(): org.decembrist.Phaser.GameObjects.GameObject
}
external interface Velocity {
    fun setVelocityX(x: Number): Velocity /* this */
    fun setVelocityY(y: Number): Velocity /* this */
    fun setVelocity(x: Number, y: Number? = definedExternally /* null */): Velocity /* this */
    fun setMaxVelocity(x: Number, y: Number? = definedExternally /* null */): Velocity /* this */
}
