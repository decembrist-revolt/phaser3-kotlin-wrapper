@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
package org.decembrist.Phaser.Math.Fuzzy

external object Fuzzy {
    fun Ceil(value: Number, epsilon: Number? = definedExternally /* null */): Number = definedExternally
    fun Equal(a: Number, b: Number, epsilon: Number? = definedExternally /* null */): Boolean = definedExternally
    fun Floor(value: Number, epsilon: Number? = definedExternally /* null */): Number = definedExternally
    fun GreaterThan(a: Number, b: Number, epsilon: Number? = definedExternally /* null */): Boolean = definedExternally
    fun LessThan(a: Number, b: Number, epsilon: Number? = definedExternally /* null */): Boolean = definedExternally
}