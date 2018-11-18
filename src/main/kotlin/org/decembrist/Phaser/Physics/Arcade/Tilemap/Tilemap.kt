@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Physics.Arcade.Tilemap")]
package org.decembrist.Phaser.Physics.Arcade.Tilemap

import org.decembrist.Phaser.Geom.Geom

external fun ProcessTileCallbacks(tile: org.decembrist.Phaser.Tilemaps.Tilemap, sprite: org.decembrist.Phaser.GameObjects.Sprite): Boolean = definedExternally
external fun ProcessTileSeparationX(body: org.decembrist.Phaser.Physics.Arcade.Body, x: Number): Unit = definedExternally
external fun ProcessTileSeparationY(body: org.decembrist.Phaser.Physics.Arcade.Body, y: Number): Unit = definedExternally
external fun SeparateTile(i: Number, body: org.decembrist.Phaser.Physics.Arcade.Body, tile: org.decembrist.Phaser.Tilemaps.Tile, tileWorldRect: Geom.Rectangle, tilemapLayer: org.decembrist.Phaser.Tilemaps.DynamicTilemapLayer, tileBias: Number): Boolean = definedExternally
external fun SeparateTile(i: Number, body: org.decembrist.Phaser.Physics.Arcade.Body, tile: org.decembrist.Phaser.Tilemaps.Tile, tileWorldRect: Geom.Rectangle, tilemapLayer: org.decembrist.Phaser.Tilemaps.StaticTilemapLayer, tileBias: Number): Boolean = definedExternally
external fun TileCheckX(body: org.decembrist.Phaser.Physics.Arcade.Body, tile: org.decembrist.Phaser.Tilemaps.Tile, tileLeft: Number, tileRight: Number, tileBias: Number): Number = definedExternally
external fun TileCheckY(body: org.decembrist.Phaser.Physics.Arcade.Body, tile: org.decembrist.Phaser.Tilemaps.Tile, tileTop: Number, tileBottom: Number, tileBias: Number): Number = definedExternally
external fun TileIntersectsBody(tileWorldRect: Any, body: org.decembrist.Phaser.Physics.Arcade.Body): Boolean = definedExternally
