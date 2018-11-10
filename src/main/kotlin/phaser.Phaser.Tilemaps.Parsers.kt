@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Tilemaps.Parsers")]
package Phaser.Tilemaps.Parsers

external fun Parse(name: String, mapFormat: Number, data: String, tileWidth: Number, tileHeight: Number, insertNull: Boolean): Phaser.Tilemaps.MapData = definedExternally
external fun Parse(name: String, mapFormat: Number, data: Any?, tileWidth: Number, tileHeight: Number, insertNull: Boolean): Phaser.Tilemaps.MapData = definedExternally
external fun Parse(name: String, mapFormat: Number, data: Array<Array<Number>>, tileWidth: Number, tileHeight: Number, insertNull: Boolean): Phaser.Tilemaps.MapData = definedExternally
external fun Parse2DArray(name: String, data: Array<Array<Number>>, tileWidth: Number, tileHeight: Number, insertNull: Boolean): Phaser.Tilemaps.MapData = definedExternally
external fun ParseCSV(name: String, data: String, tileWidth: Number, tileHeight: Number, insertNull: Boolean): Phaser.Tilemaps.MapData = definedExternally
