@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Physics.Arcade.Tilemap")]
package Phaser.Physics.Arcade.Tilemap

external fun ProcessTileCallbacks(tile: Phaser.Tilemaps.Tilemap, sprite: Phaser.GameObjects.Sprite): Boolean = definedExternally
external fun ProcessTileSeparationX(body: Phaser.Physics.Arcade.Body, x: Number): Unit = definedExternally
external fun ProcessTileSeparationY(body: Phaser.Physics.Arcade.Body, y: Number): Unit = definedExternally
external fun SeparateTile(i: Number, body: Phaser.Physics.Arcade.Body, tile: Phaser.Tilemaps.Tile, tileWorldRect: Phaser.Geom.Rectangle, tilemapLayer: Phaser.Tilemaps.DynamicTilemapLayer, tileBias: Number): Boolean = definedExternally
external fun SeparateTile(i: Number, body: Phaser.Physics.Arcade.Body, tile: Phaser.Tilemaps.Tile, tileWorldRect: Phaser.Geom.Rectangle, tilemapLayer: Phaser.Tilemaps.StaticTilemapLayer, tileBias: Number): Boolean = definedExternally
external fun TileCheckX(body: Phaser.Physics.Arcade.Body, tile: Phaser.Tilemaps.Tile, tileLeft: Number, tileRight: Number, tileBias: Number): Number = definedExternally
external fun TileCheckY(body: Phaser.Physics.Arcade.Body, tile: Phaser.Tilemaps.Tile, tileTop: Number, tileBottom: Number, tileBias: Number): Number = definedExternally
external fun TileIntersectsBody(tileWorldRect: Any, body: Phaser.Physics.Arcade.Body): Boolean = definedExternally
