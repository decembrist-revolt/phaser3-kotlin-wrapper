@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Physics.Arcade.Components")]
package Phaser.Physics.Arcade.Components

external interface Acceleration {
    fun setAcceleration(x: Number, y: Number? = definedExternally /* null */): Acceleration /* this */
    fun setAccelerationX(value: Number): Acceleration /* this */
    fun setAccelerationY(value: Number): Acceleration /* this */
}
external interface Angular {
    fun setAngularVelocity(value: Number): Angular /* this */
    fun setAngularAcceleration(value: Number): Angular /* this */
    fun setAngularDrag(value: Number): Angular /* this */
}
external interface Bounce {
    fun setBounce(x: Number, y: Number? = definedExternally /* null */): Bounce /* this */
    fun setBounceX(value: Number): Bounce /* this */
    fun setBounceY(value: Number): Bounce /* this */
    fun setCollideWorldBounds(value: Boolean): Bounce /* this */
}
external interface Debug {
    fun setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Number): Debug /* this */
    fun setDebugBodyColor(value: Number): Debug /* this */
    var debugShowBody: Boolean
    var debugShowVelocity: Boolean
    var debugBodyColor: Number
}
external interface Drag {
    fun setDrag(x: Number, y: Number? = definedExternally /* null */): Drag /* this */
    fun setDragX(value: Number): Drag /* this */
    fun setDragY(value: Number): Drag /* this */
    fun setDamping(value: Boolean): Drag /* this */
}
external interface Enable {
    fun enableBody(reset: Boolean, x: Number, y: Number, enableGameObject: Boolean, showGameObject: Boolean): Enable /* this */
    fun disableBody(disableGameObject: Boolean? = definedExternally /* null */, hideGameObject: Boolean? = definedExternally /* null */): Enable /* this */
    fun refreshBody(): Enable /* this */
}
external interface Friction {
    fun setFriction(x: Number, y: Number? = definedExternally /* null */): Friction /* this */
    fun setFrictionX(x: Number): Friction /* this */
    fun setFrictionY(x: Number): Friction /* this */
}
external interface Gravity {
    fun setGravity(x: Number, y: Number? = definedExternally /* null */): Gravity /* this */
    fun setGravityX(x: Number): Gravity /* this */
    fun setGravityY(y: Number): Gravity /* this */
}
external interface Immovable {
    fun setImmovable(value: Boolean? = definedExternally /* null */): Immovable /* this */
}
external interface Mass {
    fun setMass(value: Number): Mass /* this */
}
external interface Size {
    fun setOffset(x: Number, y: Number? = definedExternally /* null */): Size /* this */
    fun setSize(width: Number, height: Number, center: Boolean? = definedExternally /* null */): Size /* this */
    fun setCircle(radius: Number, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): Size /* this */
}
external interface Velocity {
    fun setVelocity(x: Number, y: Number? = definedExternally /* null */): Velocity /* this */
    fun setVelocityX(x: Number): Velocity /* this */
    fun setVelocityY(y: Number): Velocity /* this */
    fun setMaxVelocity(x: Number, y: Number? = definedExternally /* null */): Velocity /* this */
}
