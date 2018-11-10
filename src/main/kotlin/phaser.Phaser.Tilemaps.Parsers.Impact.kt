@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Tilemaps.Parsers.Impact")]
package Phaser.Tilemaps.Parsers.Impact

external fun ParseTileLayers(json: Any, insertNull: Boolean): Array<Any> = definedExternally
external fun ParseTilesets(json: Any): Array<Any> = definedExternally
external fun ParseWeltmeister(name: String, json: Any, insertNull: Boolean): Any = definedExternally
