@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Utils.String")]
package Phaser.Utils.String

external fun Format(string: String, values: Array<Any>): String = definedExternally
external fun Pad(str: String, len: Number? = definedExternally /* null */, pad: String? = definedExternally /* null */, dir: Number? = definedExternally /* null */): String = definedExternally
external fun ReverseString(string: String): String = definedExternally
external fun UppercaseFirst(str: String): String = definedExternally
external fun UUID(): String = definedExternally
