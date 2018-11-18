@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Utils.Objects")]
package org.decembrist.Phaser.Utils.Objects

external fun Clone(obj: Any): Any = definedExternally
external fun Extend(): Any = definedExternally
external fun GetAdvancedValue(source: Any, key: String, defaultValue: Any): Any = definedExternally
external fun GetFastValue(source: Any, key: String, defaultValue: Any? = definedExternally /* null */): Any = definedExternally
external fun GetMinMaxValue(source: Any, key: String, min: Number, max: Number, defaultValue: Number): Number = definedExternally
external fun GetValue(source: Any, key: String, defaultValue: Any): Any = definedExternally
external fun HasAll(source: Any, keys: Array<String>): Boolean = definedExternally
external fun HasAny(source: Any, keys: Array<String>): Boolean = definedExternally
external fun HasValue(source: Any, key: String): Boolean = definedExternally
external fun IsPlainObject(obj: Any): Boolean = definedExternally
external fun Merge(obj1: Any, obj2: Any): Any = definedExternally
external fun MergeRight(obj1: Any, obj2: Any): Any = definedExternally
