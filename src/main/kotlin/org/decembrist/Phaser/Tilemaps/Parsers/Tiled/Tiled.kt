@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Tilemaps.Parsers.Tiled")]
package org.decembrist.Phaser.Tilemaps.Parsers.Tiled

external fun AssignTileProperties(mapData: org.decembrist.Phaser.Tilemaps.MapData): Unit = definedExternally
external fun Base64Decode(data: Any): Array<Any> = definedExternally
external fun BuildTilesetIndex(mapData: org.decembrist.Phaser.Tilemaps.MapData): Array<Any> = definedExternally
external fun ParseGID(gid: Number): Any = definedExternally
external fun ParseImageLayers(json: Any): Array<Any> = definedExternally
external fun ParseJSONTiled(name: String, json: Any, insertNull: Boolean): org.decembrist.Phaser.Tilemaps.MapData = definedExternally
external fun ParseObject(tiledObject: Any, offsetX: Number? = definedExternally /* null */, offsetY: Number? = definedExternally /* null */): Any = definedExternally
external fun ParseObjectLayers(json: Any): Array<Any> = definedExternally
external fun ParseTileLayers(json: Any, insertNull: Boolean): Array<Any> = definedExternally
external fun ParseTilesets(json: Any): Any = definedExternally
external fun Pick(`object`: Any, keys: Array<Any>): Any = definedExternally
