@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Tilemaps") JsNonModule]
package org.decembrist.Phaser.Tilemaps

import org.decembrist.Phaser.Geom.Geom
import org.decembrist.Phaser.Math.Vector2
import org.decembrist.Phaser.Phaser
import org.decembrist.utils.GameObjectConfig
import org.khronos.webgl.WebGLTexture

external interface `T$11` {
    var key: String? get() = definedExternally; set(value) = definedExternally
    var frame: dynamic /* String | Number */ get() = definedExternally; set(value) = definedExternally
}
open external class DynamicTilemapLayer : org.decembrist.Phaser.GameObjects.GameObject, org.decembrist.Phaser.GameObjects.Components.Alpha, org.decembrist.Phaser.GameObjects.Components.BlendMode, org.decembrist.Phaser.GameObjects.Components.ComputedSize, org.decembrist.Phaser.GameObjects.Components.Depth, org.decembrist.Phaser.GameObjects.Components.Flip, org.decembrist.Phaser.GameObjects.Components.GetBounds, org.decembrist.Phaser.GameObjects.Components.Origin, org.decembrist.Phaser.GameObjects.Components.Pipeline, org.decembrist.Phaser.GameObjects.Components.ScaleMode, org.decembrist.Phaser.GameObjects.Components.ScrollFactor, org.decembrist.Phaser.GameObjects.Components.Transform, org.decembrist.Phaser.GameObjects.Components.Visible {
    constructor(scene: Phaser.Scene, tilemap: Tilemap, layerIndex: Number, tileset: String, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, tilemap: Tilemap, layerIndex: Number, tileset: Array<String>, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, tilemap: Tilemap, layerIndex: Number, tileset: Tileset, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, tilemap: Tilemap, layerIndex: Number, tileset: Array<Tileset>, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */)

    open var isTilemap: Boolean
    open var tilemap: Tilemap
    open var layerIndex: Number
    open var layer: LayerData
    open var tileset: Array<Tileset>
    open var culledTiles: Array<Any>
    open var skipCull: Boolean
    open var tilesDrawn: Number
    open var tilesTotal: Number
    open var cullPaddingX: Number
    open var cullPaddingY: Number
    open var cullCallback: Function<*>
    open var gidMap: Array<Tileset>
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* String | Phaser.BlendModes */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override var depth: Number
    override var flipX: Boolean
    override var flipY: Boolean
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override var defaultPipeline: org.decembrist.Phaser.Renderer.WebGL.WebGLPipeline
    override var pipeline: org.decembrist.Phaser.Renderer.WebGL.WebGLPipeline
    override var scaleMode: Phaser.ScaleModes
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override var visible: Boolean
    open fun setRenderOrder(renderOrder: String): DynamicTilemapLayer /* this */ = definedExternally
    open fun setRenderOrder(renderOrder: Number): DynamicTilemapLayer /* this */ = definedExternally
    open fun calculateFacesAt(tileX: Number, tileY: Number): DynamicTilemapLayer = definedExternally
    open fun calculateFacesWithin(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun createFromTiles(indexes: Number, replacements: Number, spriteConfig: GameObjectConfig /* GameObjectConfig & `T$11` */, scene: Phaser.Scene? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<org.decembrist.Phaser.GameObjects.Sprite> = definedExternally
    open fun createFromTiles(indexes: Number, replacements: Array<Any>, spriteConfig: GameObjectConfig /* GameObjectConfig & `T$11` */, scene: Phaser.Scene? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<org.decembrist.Phaser.GameObjects.Sprite> = definedExternally
    open fun createFromTiles(indexes: Array<Any>, replacements: Number, spriteConfig: GameObjectConfig /* GameObjectConfig & `T$11` */, scene: Phaser.Scene? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<org.decembrist.Phaser.GameObjects.Sprite> = definedExternally
    open fun createFromTiles(indexes: Array<Any>, replacements: Array<Any>, spriteConfig: GameObjectConfig /* GameObjectConfig & `T$11` */, scene: Phaser.Scene? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<org.decembrist.Phaser.GameObjects.Sprite> = definedExternally
    open fun cull(camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun copy(srcTileX: Number, srcTileY: Number, width: Number, height: Number, destTileX: Number, destTileY: Number, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    override fun destroy(): Unit = definedExternally
    open fun fill(index: Number, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun filterTiles(callback: Function<*>, context: Any? = definedExternally /* null */, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun findByIndex(index: Number, skip: Number? = definedExternally /* null */, reverse: Boolean? = definedExternally /* null */): Tile = definedExternally
    open fun findTile(callback: (value: Tile, index: Number, array: Array<Tile>) -> Unit, context: Any? = definedExternally /* null */, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */): Tile = definedExternally
    open fun forEachTile(callback: (value: Tile, index: Number, array: Array<Tile>) -> Unit, context: Any? = definedExternally /* null */, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun getTileAt(tileX: Number, tileY: Number, nonNull: Boolean? = definedExternally /* null */): Tile = definedExternally
    open fun getTileAtWorldXY(worldX: Number, worldY: Number, nonNull: Boolean? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Tile = definedExternally
    open fun getTilesWithin(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun getTilesWithinShape(shape: Geom.Circle, filteringOptions: Any? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun getTilesWithinShape(shape: Geom.Line, filteringOptions: Any? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun getTilesWithinShape(shape: Geom.Rectangle, filteringOptions: Any? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun getTilesWithinShape(shape: Geom.Triangle, filteringOptions: Any? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun getTilesWithinWorldXY(worldX: Number, worldY: Number, width: Number, height: Number, filteringOptions: Any? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun hasTileAt(tileX: Number, tileY: Number): Boolean = definedExternally
    open fun hasTileAtWorldXY(worldX: Number, worldY: Number, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Boolean = definedExternally
    open fun putTileAt(tile: Number, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */): Tile = definedExternally
    open fun putTileAt(tile: Tile, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */): Tile = definedExternally
    open fun putTileAtWorldXY(tile: Number, worldX: Number, worldY: Number, recalculateFaces: Boolean? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Tile = definedExternally
    open fun putTileAtWorldXY(tile: Tile, worldX: Number, worldY: Number, recalculateFaces: Boolean? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Tile = definedExternally
    open fun putTilesAt(tile: Array<Number>, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun putTilesAt(tile: Array<Array<Number>>, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun putTilesAt(tile: Array<Tile>, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun putTilesAt(tile: Array<Array<Tile>>, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun randomize(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, indexes: Array<Number>? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun removeTileAt(tileX: Number, tileY: Number, replaceWithNull: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): Tile = definedExternally
    open fun removeTileAtWorldXY(worldX: Number, worldY: Number, replaceWithNull: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Tile = definedExternally
    open fun renderDebug(graphics: org.decembrist.Phaser.GameObjects.Graphics, styleConfig: Any): DynamicTilemapLayer = definedExternally
    open fun replaceByIndex(findIndex: Number, newIndex: Number, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun setSkipCull(value: Boolean? = definedExternally /* null */): DynamicTilemapLayer /* this */ = definedExternally
    open fun setCullPadding(paddingX: Number? = definedExternally /* null */, paddingY: Number? = definedExternally /* null */): DynamicTilemapLayer /* this */ = definedExternally
    open fun setCollision(indexes: Number, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun setCollision(indexes: Array<Any>, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun setCollisionBetween(start: Number, stop: Number, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun setCollisionByProperty(properties: Any, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun setCollisionByExclusion(indexes: Array<Number>, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun setCollisionFromCollisionGroup(collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun setTileIndexCallback(indexes: Number, callback: Function<*>, callbackContext: Any): DynamicTilemapLayer = definedExternally
    open fun setTileIndexCallback(indexes: Array<Any>, callback: Function<*>, callbackContext: Any): DynamicTilemapLayer = definedExternally
    open fun setTileLocationCallback(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, callback: Function<*>? = definedExternally /* null */, callbackContext: Any? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun shuffle(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun swapByIndex(tileA: Number, tileB: Number, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun tileToWorldX(tileX: Number, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
    open fun tileToWorldY(tileY: Number, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
    open fun tileToWorldXY(tileX: Number, tileY: Number, point: org.decembrist.Phaser.Math.Vector2? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): org.decembrist.Phaser.Math.Vector2 = definedExternally
    open fun weightedRandomize(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, weightedIndexes: Array<Any?>? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun worldToTileX(worldX: Number, snapToFloor: Boolean? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
    open fun worldToTileY(worldY: Number, snapToFloor: Boolean? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
    open fun worldToTileXY(worldX: Number, worldY: Number, snapToFloor: Boolean? = definedExternally /* null */, point: org.decembrist.Phaser.Math.Vector2? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): org.decembrist.Phaser.Math.Vector2 = definedExternally
    override fun clearAlpha(): DynamicTilemapLayer /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): DynamicTilemapLayer /* this */ = definedExternally
    override fun setBlendMode(value: String): DynamicTilemapLayer /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): DynamicTilemapLayer /* this */ = definedExternally
    override fun setSize(width: Number, height: Number): DynamicTilemapLayer /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): DynamicTilemapLayer /* this */ = definedExternally
    override fun setDepth(value: Number): DynamicTilemapLayer /* this */ = definedExternally
    override fun toggleFlipX(): DynamicTilemapLayer /* this */ = definedExternally
    override fun toggleFlipY(): DynamicTilemapLayer /* this */ = definedExternally
    override fun setFlipX(value: Boolean): DynamicTilemapLayer /* this */ = definedExternally
    override fun setFlipY(value: Boolean): DynamicTilemapLayer /* this */ = definedExternally
    override fun setFlip(x: Boolean, y: Boolean): DynamicTilemapLayer /* this */ = definedExternally
    override fun resetFlip(): DynamicTilemapLayer /* this */ = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getCenter(output: O? /* null */): O = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getTopLeft(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getTopRight(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getBottomLeft(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getBottomRight(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Geom.Rectangle> getBounds(output: O? /* null */): O = definedExternally
    override fun getCenter(output: Vector2?): Vector2
    override fun getTopLeft(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getTopRight(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getBottomLeft(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getBottomRight(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getBounds(output: Geom.Rectangle?): Geom.Rectangle
    override fun setOrigin(x: Number?, y: Number?): DynamicTilemapLayer /* this */ = definedExternally
    override fun setOriginFromFrame(): DynamicTilemapLayer /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): DynamicTilemapLayer /* this */ = definedExternally
    override fun updateDisplayOrigin(): DynamicTilemapLayer /* this */ = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): DynamicTilemapLayer /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): DynamicTilemapLayer /* this */ = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): DynamicTilemapLayer /* this */ = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): DynamicTilemapLayer /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): DynamicTilemapLayer /* this */ = definedExternally
    override fun setRotation(radians: Number?): DynamicTilemapLayer /* this */ = definedExternally
    override fun setAngle(degrees: Number?): DynamicTilemapLayer /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): DynamicTilemapLayer /* this */ = definedExternally
    override fun setX(value: Number?): DynamicTilemapLayer /* this */ = definedExternally
    override fun setY(value: Number?): DynamicTilemapLayer /* this */ = definedExternally
    override fun setZ(value: Number?): DynamicTilemapLayer /* this */ = definedExternally
    override fun setW(value: Number?): DynamicTilemapLayer /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix?): org.decembrist.Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix?): org.decembrist.Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun setVisible(value: Boolean): DynamicTilemapLayer /* this */ = definedExternally
}
open external class ImageCollection(name: String, firstgid: Number, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, margin: Number? = definedExternally /* null */, spacing: Number? = definedExternally /* null */, properties: Any? = definedExternally /* null */) {
    open var name: String = definedExternally
    open var firstgid: Number = definedExternally
    open var imageWidth: Number = definedExternally
    open var imageHeight: Number = definedExternally
    open var imageMarge: Number = definedExternally
    open var imageSpacing: Number = definedExternally
    open var properties: Any = definedExternally
    open var images: Array<Any> = definedExternally
    open var total: Number = definedExternally
    open fun containsImageIndex(imageIndex: Number): Boolean = definedExternally
    open fun addImage(gid: Number, image: String): ImageCollection = definedExternally
}
open external class LayerData(config: Any? = definedExternally /* null */) {
    open var name: String = definedExternally
    open var x: Number = definedExternally
    open var y: Number = definedExternally
    open var width: Number = definedExternally
    open var height: Number = definedExternally
    open var tileWidth: Number = definedExternally
    open var tileHeight: Number = definedExternally
    open var baseTileWidth: Number = definedExternally
    open var baseTileHeight: Number = definedExternally
    open var widthInPixels: Number = definedExternally
    open var heightInPixels: Number = definedExternally
    open var alpha: Number = definedExternally
    open var visible: Boolean = definedExternally
    open var properties: Any = definedExternally
    open var indexes: Array<Any> = definedExternally
    open var collideIndexes: Array<Any> = definedExternally
    open var callbacks: Array<Any> = definedExternally
    open var bodies: Array<Any> = definedExternally
    open var data: Array<Any> = definedExternally
    open var tilemapLayer: dynamic /* DynamicTilemapLayer | StaticTilemapLayer */ = definedExternally
}
open external class MapData(config: Any? = definedExternally /* null */) {
    open var name: String = definedExternally
    open var width: Number = definedExternally
    open var height: Number = definedExternally
    open var tileWidth: Number = definedExternally
    open var tileHeight: Number = definedExternally
    open var widthInPixels: Number = definedExternally
    open var heightInPixels: Number = definedExternally
    open var format: Number = definedExternally
    open var orientation: String = definedExternally
    open var renderOrder: String = definedExternally
    open var version: String = definedExternally
    open var properties: Any = definedExternally
    open var layers: Array<Any> = definedExternally
    open var images: Array<Any> = definedExternally
    open var objects: Any = definedExternally
    open var collision: Any = definedExternally
    open var tilesets: Array<Any> = definedExternally
    open var imageCollections: Array<Any> = definedExternally
    open var tiles: Array<Any> = definedExternally
}
open external class ObjectLayer(config: Any? = definedExternally /* null */) {
    open var name: String = definedExternally
    open var opacity: Number = definedExternally
    open var properties: Any = definedExternally
    open var propertyTypes: Any = definedExternally
    open var type: String = definedExternally
    open var visible: Boolean = definedExternally
    open var objects: Array<org.decembrist.Phaser.GameObjects.GameObject> = definedExternally
}
external fun ParseToTilemap(scene: Phaser.Scene, key: String? = definedExternally /* null */, tileWidth: Number? = definedExternally /* null */, tileHeight: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, data: Array<Array<Number>>? = definedExternally /* null */, insertNull: Boolean? = definedExternally /* null */): Tilemap = definedExternally
open external class StaticTilemapLayer : org.decembrist.Phaser.GameObjects.GameObject, org.decembrist.Phaser.GameObjects.Components.Alpha, org.decembrist.Phaser.GameObjects.Components.BlendMode, org.decembrist.Phaser.GameObjects.Components.ComputedSize, org.decembrist.Phaser.GameObjects.Components.Depth, org.decembrist.Phaser.GameObjects.Components.Flip, org.decembrist.Phaser.GameObjects.Components.GetBounds, org.decembrist.Phaser.GameObjects.Components.Origin, org.decembrist.Phaser.GameObjects.Components.Pipeline, org.decembrist.Phaser.GameObjects.Components.ScaleMode, org.decembrist.Phaser.GameObjects.Components.Transform, org.decembrist.Phaser.GameObjects.Components.Visible, org.decembrist.Phaser.GameObjects.Components.ScrollFactor {
    constructor(scene: Phaser.Scene, tilemap: Tilemap, layerIndex: Number, tileset: String, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, tilemap: Tilemap, layerIndex: Number, tileset: Array<String>, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, tilemap: Tilemap, layerIndex: Number, tileset: Tileset, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */)
    constructor(scene: Phaser.Scene, tilemap: Tilemap, layerIndex: Number, tileset: Array<Tileset>, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */)

    open var isTilemap: Boolean
    open var tilemap: Tilemap
    open var layerIndex: Number
    open var layer: LayerData
    open var tileset: Array<Tileset>
    open var culledTiles: Array<Any>
    open var skipCull: Boolean
    open var tilesDrawn: Number
    open var tilesTotal: Number
    open var cullPaddingX: Number
    open var cullPaddingY: Number
    open var cullCallback: Function<*>
    open var gidMap: Array<Tileset>
    override var alpha: Number
    override var alphaTopLeft: Number
    override var alphaTopRight: Number
    override var alphaBottomLeft: Number
    override var alphaBottomRight: Number
    override var blendMode: dynamic /* String | Phaser.BlendModes */
    override var width: Number
    override var height: Number
    override var displayWidth: Number
    override var displayHeight: Number
    override var depth: Number
    override var flipX: Boolean
    override var flipY: Boolean
    override var originX: Number
    override var originY: Number
    override var displayOriginX: Number
    override var displayOriginY: Number
    override var defaultPipeline: org.decembrist.Phaser.Renderer.WebGL.WebGLPipeline
    override var pipeline: org.decembrist.Phaser.Renderer.WebGL.WebGLPipeline
    override var scaleMode: Phaser.ScaleModes
    override var x: Number
    override var y: Number
    override var z: Number
    override var w: Number
    override var scaleX: Number
    override var scaleY: Number
    override var angle: Number
    override var rotation: Number
    override var visible: Boolean
    override var scrollFactorX: Number
    override var scrollFactorY: Number
    open fun upload(camera: org.decembrist.Phaser.Cameras.Scene2D.Camera, tilesetIndex: Number): StaticTilemapLayer = definedExternally
    open fun setRenderOrder(renderOrder: String): StaticTilemapLayer /* this */ = definedExternally
    open fun setRenderOrder(renderOrder: Number): StaticTilemapLayer /* this */ = definedExternally
    open fun calculateFacesAt(tileX: Number, tileY: Number): StaticTilemapLayer = definedExternally
    open fun calculateFacesWithin(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */): StaticTilemapLayer = definedExternally
    open fun createFromTiles(indexes: Number, replacements: Number, spriteConfig: GameObjectConfig /* GameObjectConfig & `T$11` */, scene: Phaser.Scene? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<org.decembrist.Phaser.GameObjects.Sprite> = definedExternally
    open fun createFromTiles(indexes: Number, replacements: Array<Any>, spriteConfig: GameObjectConfig /* GameObjectConfig & `T$11` */, scene: Phaser.Scene? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<org.decembrist.Phaser.GameObjects.Sprite> = definedExternally
    open fun createFromTiles(indexes: Array<Any>, replacements: Number, spriteConfig: GameObjectConfig /* GameObjectConfig & `T$11` */, scene: Phaser.Scene? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<org.decembrist.Phaser.GameObjects.Sprite> = definedExternally
    open fun createFromTiles(indexes: Array<Any>, replacements: Array<Any>, spriteConfig: GameObjectConfig /* GameObjectConfig & `T$11` */, scene: Phaser.Scene? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<org.decembrist.Phaser.GameObjects.Sprite> = definedExternally
    open fun cull(camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun setSkipCull(value: Boolean? = definedExternally /* null */): StaticTilemapLayer /* this */ = definedExternally
    open fun setCullPadding(paddingX: Number? = definedExternally /* null */, paddingY: Number? = definedExternally /* null */): StaticTilemapLayer /* this */ = definedExternally
    open fun findByIndex(index: Number, skip: Number? = definedExternally /* null */, reverse: Boolean? = definedExternally /* null */): Tile = definedExternally
    open fun findTile(callback: Function<*>, context: Any? = definedExternally /* null */, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */): Tile = definedExternally
    open fun filterTiles(callback: Function<*>, context: Any? = definedExternally /* null */, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun forEachTile(callback: Function<*>, context: Any? = definedExternally /* null */, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */): StaticTilemapLayer = definedExternally
    open fun getTileAt(tileX: Number, tileY: Number, nonNull: Boolean? = definedExternally /* null */): Tile = definedExternally
    open fun getTileAtWorldXY(worldX: Number, worldY: Number, nonNull: Boolean? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Tile = definedExternally
    open fun getTilesWithin(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun getTilesWithinWorldXY(worldX: Number, worldY: Number, width: Number, height: Number, filteringOptions: Any? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun getTilesWithinShape(shape: Geom.Circle, filteringOptions: Any? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun getTilesWithinShape(shape: Geom.Line, filteringOptions: Any? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun getTilesWithinShape(shape: Geom.Rectangle, filteringOptions: Any? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun getTilesWithinShape(shape: Geom.Triangle, filteringOptions: Any? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun hasTileAt(tileX: Number, tileY: Number): Boolean = definedExternally
    open fun hasTileAtWorldXY(worldX: Number, worldY: Number, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Boolean = definedExternally
    open fun renderDebug(graphics: org.decembrist.Phaser.GameObjects.Graphics, styleConfig: Any): StaticTilemapLayer = definedExternally
    open fun setCollision(indexes: Number, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): StaticTilemapLayer = definedExternally
    open fun setCollision(indexes: Array<Any>, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): StaticTilemapLayer = definedExternally
    open fun setCollisionBetween(start: Number, stop: Number, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): StaticTilemapLayer = definedExternally
    open fun setCollisionByProperty(properties: Any, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): StaticTilemapLayer = definedExternally
    open fun setCollisionByExclusion(indexes: Array<Number>, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): StaticTilemapLayer = definedExternally
    open fun setTileIndexCallback(indexes: Number, callback: Function<*>, callbackContext: Any): StaticTilemapLayer = definedExternally
    open fun setTileIndexCallback(indexes: Array<Any>, callback: Function<*>, callbackContext: Any): StaticTilemapLayer = definedExternally
    open fun setCollisionFromCollisionGroup(collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): StaticTilemapLayer = definedExternally
    open fun setTileLocationCallback(tileX: Number, tileY: Number, width: Number, height: Number, callback: Function<*>, callbackContext: Any? = definedExternally /* null */): StaticTilemapLayer = definedExternally
    open fun tileToWorldX(tileX: Number, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
    open fun tileToWorldY(tileY: Number, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
    open fun tileToWorldXY(tileX: Number, tileY: Number, point: org.decembrist.Phaser.Math.Vector2? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): org.decembrist.Phaser.Math.Vector2 = definedExternally
    open fun worldToTileX(worldX: Number, snapToFloor: Boolean? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
    open fun worldToTileY(worldY: Number, snapToFloor: Boolean? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
    open fun worldToTileXY(worldX: Number, worldY: Number, snapToFloor: Boolean? = definedExternally /* null */, point: org.decembrist.Phaser.Math.Vector2? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): org.decembrist.Phaser.Math.Vector2 = definedExternally
    override fun destroy(): Unit = definedExternally
    override fun clearAlpha(): StaticTilemapLayer /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): StaticTilemapLayer /* this */ = definedExternally
    override fun setBlendMode(value: String): StaticTilemapLayer /* this */ = definedExternally
    override fun setBlendMode(value: Phaser.BlendModes): StaticTilemapLayer /* this */ = definedExternally
    override fun setSize(width: Number, height: Number): StaticTilemapLayer /* this */ = definedExternally
    override fun setDisplaySize(width: Number, height: Number): StaticTilemapLayer /* this */ = definedExternally
    override fun setDepth(value: Number): StaticTilemapLayer /* this */ = definedExternally
    override fun toggleFlipX(): StaticTilemapLayer /* this */ = definedExternally
    override fun toggleFlipY(): StaticTilemapLayer /* this */ = definedExternally
    override fun setFlipX(value: Boolean): StaticTilemapLayer /* this */ = definedExternally
    override fun setFlipY(value: Boolean): StaticTilemapLayer /* this */ = definedExternally
    override fun setFlip(x: Boolean, y: Boolean): StaticTilemapLayer /* this */ = definedExternally
    override fun resetFlip(): StaticTilemapLayer /* this */ = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getCenter(output: O? /* null */): O = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getTopLeft(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getTopRight(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getBottomLeft(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : org.decembrist.Phaser.Math.Vector2> getBottomRight(output: O? /* null */, includeParent: Boolean? /* null */): O = definedExternally
    override fun <O : Geom.Rectangle> getBounds(output: O? /* null */): O = definedExternally
    override fun getCenter(output: Vector2?): Vector2
    override fun getTopLeft(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getTopRight(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getBottomLeft(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getBottomRight(output: Vector2?, includeParent: Boolean?): Vector2
    override fun getBounds(output: Geom.Rectangle?): Geom.Rectangle
    override fun setOrigin(x: Number?, y: Number?): StaticTilemapLayer /* this */ = definedExternally
    override fun setOriginFromFrame(): StaticTilemapLayer /* this */ = definedExternally
    override fun setDisplayOrigin(x: Number?, y: Number?): StaticTilemapLayer /* this */ = definedExternally
    override fun updateDisplayOrigin(): StaticTilemapLayer /* this */ = definedExternally
    override fun initPipeline(pipelineName: String?): Boolean = definedExternally
    override fun setPipeline(pipelineName: String): StaticTilemapLayer /* this */ = definedExternally
    override fun resetPipeline(): Boolean = definedExternally
    override fun getPipelineName(): String = definedExternally
    override fun setScaleMode(value: Phaser.ScaleModes): StaticTilemapLayer /* this */ = definedExternally
    override fun setPosition(x: Number?, y: Number?, z: Number?, w: Number?): StaticTilemapLayer /* this */ = definedExternally
    override fun setRandomPosition(x: Number?, y: Number?, width: Number?, height: Number?): StaticTilemapLayer /* this */ = definedExternally
    override fun setRotation(radians: Number?): StaticTilemapLayer /* this */ = definedExternally
    override fun setAngle(degrees: Number?): StaticTilemapLayer /* this */ = definedExternally
    override fun setScale(x: Number, y: Number?): StaticTilemapLayer /* this */ = definedExternally
    override fun setX(value: Number?): StaticTilemapLayer /* this */ = definedExternally
    override fun setY(value: Number?): StaticTilemapLayer /* this */ = definedExternally
    override fun setZ(value: Number?): StaticTilemapLayer /* this */ = definedExternally
    override fun setW(value: Number?): StaticTilemapLayer /* this */ = definedExternally
    override fun getLocalTransformMatrix(tempMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix?): org.decembrist.Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun getWorldTransformMatrix(tempMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix?, parentMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix?): org.decembrist.Phaser.GameObjects.Components.TransformMatrix = definedExternally
    override fun setVisible(value: Boolean): StaticTilemapLayer /* this */ = definedExternally
    override fun setScrollFactor(x: Number, y: Number?): StaticTilemapLayer /* this */ = definedExternally
}
open external class Tile(layer: LayerData, index: Number, x: Number, y: Number, width: Number, height: Number, baseWidth: Number, baseHeight: Number) : org.decembrist.Phaser.GameObjects.Components.Alpha, org.decembrist.Phaser.GameObjects.Components.Flip, org.decembrist.Phaser.GameObjects.Components.Visible {
    open var layer: LayerData = definedExternally
    open var index: Number = definedExternally
    open var x: Number = definedExternally
    open var y: Number = definedExternally
    open var width: Number = definedExternally
    open var height: Number = definedExternally
    open var baseWidth: Number = definedExternally
    open var baseHeight: Number = definedExternally
    open var pixelX: Number = definedExternally
    open var pixelY: Number = definedExternally
    open var properties: Any = definedExternally
    open var rotation: Number = definedExternally
    open var collideLeft: Boolean = definedExternally
    open var collideRight: Boolean = definedExternally
    open var collideUp: Boolean = definedExternally
    open var collideDown: Boolean = definedExternally
    open var faceLeft: Boolean = definedExternally
    open var faceRight: Boolean = definedExternally
    open var faceTop: Boolean = definedExternally
    open var faceBottom: Boolean = definedExternally
    open var collisionCallback: Function<*> = definedExternally
    open var collisionCallbackContext: Any = definedExternally
    open var tint: Number = definedExternally
    open var physics: Any = definedExternally
    open fun containsPoint(x: Number, y: Number): Boolean = definedExternally
    open fun copy(tile: Tile): Tile = definedExternally
    open fun getCollisionGroup(): Any = definedExternally
    open fun getTileData(): Any = definedExternally
    open fun getLeft(camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
    open fun getRight(camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
    open fun getTop(camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
    open fun getBottom(camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
    open fun getBounds(camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, output: Any? = definedExternally /* null */): dynamic /* Any? | Phaser.Geom.Rectangle */ = definedExternally
    open fun getCenterX(camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
    open fun getCenterY(camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */): Number = definedExternally
    open fun destroy(): Unit = definedExternally
    open fun intersects(x: Number, y: Number, right: Number, bottom: Number): Boolean = definedExternally
    open fun isInteresting(collides: Boolean, faces: Boolean): Boolean = definedExternally
    open fun resetCollision(recalculateFaces: Boolean? = definedExternally /* null */): Tile = definedExternally
    open fun resetFaces(): Tile = definedExternally
    open fun setCollision(left: Boolean, right: Boolean? = definedExternally /* null */, up: Boolean? = definedExternally /* null */, down: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */): Tile = definedExternally
    open fun setCollisionCallback(callback: Function<*>, context: Any): Tile = definedExternally
    open fun setSize(tileWidth: Number, tileHeight: Number, baseWidth: Number, baseHeight: Number): Tile = definedExternally
    open fun updatePixelXY(): Tile = definedExternally
    open var canCollide: Boolean = definedExternally
    open var collides: Boolean = definedExternally
    open var hasInterestingFace: Boolean = definedExternally
    open var tileset: Tileset = definedExternally
    open var tilemapLayer: dynamic /* DynamicTilemapLayer | StaticTilemapLayer */ = definedExternally
    open var tilemap: Tilemap = definedExternally
    override fun clearAlpha(): Tile /* this */ = definedExternally
    override fun setAlpha(topLeft: Number?, topRight: Number?, bottomLeft: Number?, bottomRight: Number?): Tile /* this */ = definedExternally
    override var alpha: Number = definedExternally
    override var alphaTopLeft: Number = definedExternally
    override var alphaTopRight: Number = definedExternally
    override var alphaBottomLeft: Number = definedExternally
    override var alphaBottomRight: Number = definedExternally
    override var flipX: Boolean = definedExternally
    override var flipY: Boolean = definedExternally
    override fun toggleFlipX(): Tile /* this */ = definedExternally
    override fun toggleFlipY(): Tile /* this */ = definedExternally
    override fun setFlipX(value: Boolean): Tile /* this */ = definedExternally
    override fun setFlipY(value: Boolean): Tile /* this */ = definedExternally
    override fun setFlip(x: Boolean, y: Boolean): Tile /* this */ = definedExternally
    override fun resetFlip(): Tile /* this */ = definedExternally
    override var visible: Boolean = definedExternally
    override fun setVisible(value: Boolean): Tile /* this */ = definedExternally
}
open external class Tilemap(scene: Phaser.Scene, mapData: MapData) {
    open var scene: Phaser.Scene = definedExternally
    open var tileWidth: Number = definedExternally
    open var tileHeight: Number = definedExternally
    open var width: Number = definedExternally
    open var height: Number = definedExternally
    open var orientation: String = definedExternally
    open var renderOrder: String = definedExternally
    open var format: Number = definedExternally
    open var version: Number = definedExternally
    open var properties: Any = definedExternally
    open var widthInPixels: Number = definedExternally
    open var heightInPixels: Number = definedExternally
    open var imageCollections: Array<ImageCollection> = definedExternally
    open var images: Array<Any> = definedExternally
    open var layers: Array<LayerData> = definedExternally
    open var tilesets: Array<Tileset> = definedExternally
    open var objects: Array<ObjectLayer> = definedExternally
    open var currentLayerIndex: Number = definedExternally
    open fun setRenderOrder(renderOrder: String): Tilemap /* this */ = definedExternally
    open fun setRenderOrder(renderOrder: Number): Tilemap /* this */ = definedExternally
    open fun addTilesetImage(tilesetName: String, key: String? = definedExternally /* null */, tileWidth: Number? = definedExternally /* null */, tileHeight: Number? = definedExternally /* null */, tileMargin: Number? = definedExternally /* null */, tileSpacing: Number? = definedExternally /* null */, gid: Number? = definedExternally /* null */): Tileset = definedExternally
    open fun convertLayerToStatic(layer: String? = definedExternally /* null */): StaticTilemapLayer = definedExternally
    open fun convertLayerToStatic(layer: Number? = definedExternally /* null */): StaticTilemapLayer = definedExternally
    open fun convertLayerToStatic(layer: DynamicTilemapLayer? = definedExternally /* null */): StaticTilemapLayer = definedExternally
    open fun copy(srcTileX: Number, srcTileY: Number, width: Number, height: Number, destTileX: Number, destTileY: Number, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun createBlankDynamicLayer(name: String, tileset: String, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, tileWidth: Number? = definedExternally /* null */, tileHeight: Number? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun createBlankDynamicLayer(name: String, tileset: Array<String>, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, tileWidth: Number? = definedExternally /* null */, tileHeight: Number? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun createBlankDynamicLayer(name: String, tileset: Tileset, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, tileWidth: Number? = definedExternally /* null */, tileHeight: Number? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun createBlankDynamicLayer(name: String, tileset: Array<Tileset>, x: Number? = definedExternally /* null */, y: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, tileWidth: Number? = definedExternally /* null */, tileHeight: Number? = definedExternally /* null */): DynamicTilemapLayer = definedExternally
    open fun createDynamicLayer(layerID: String, tileset: String, x: Number, y: Number): DynamicTilemapLayer = definedExternally
    open fun createDynamicLayer(layerID: String, tileset: Array<String>, x: Number, y: Number): DynamicTilemapLayer = definedExternally
    open fun createDynamicLayer(layerID: String, tileset: Tileset, x: Number, y: Number): DynamicTilemapLayer = definedExternally
    open fun createDynamicLayer(layerID: String, tileset: Array<Tileset>, x: Number, y: Number): DynamicTilemapLayer = definedExternally
    open fun createDynamicLayer(layerID: Number, tileset: String, x: Number, y: Number): DynamicTilemapLayer = definedExternally
    open fun createDynamicLayer(layerID: Number, tileset: Array<String>, x: Number, y: Number): DynamicTilemapLayer = definedExternally
    open fun createDynamicLayer(layerID: Number, tileset: Tileset, x: Number, y: Number): DynamicTilemapLayer = definedExternally
    open fun createDynamicLayer(layerID: Number, tileset: Array<Tileset>, x: Number, y: Number): DynamicTilemapLayer = definedExternally
    open fun createFromObjects(name: String, id: String, spriteConfig: GameObjectConfig /* GameObjectConfig & `T$11` */, scene: Phaser.Scene? = definedExternally /* null */): Array<org.decembrist.Phaser.GameObjects.Sprite> = definedExternally
    open fun createFromObjects(name: String, id: Number, spriteConfig: GameObjectConfig /* GameObjectConfig & `T$11` */, scene: Phaser.Scene? = definedExternally /* null */): Array<org.decembrist.Phaser.GameObjects.Sprite> = definedExternally
    open fun createFromTiles(indexes: Number, replacements: Number, spriteConfig: GameObjectConfig /* GameObjectConfig & `T$11` */, scene: Phaser.Scene? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<org.decembrist.Phaser.GameObjects.Sprite> = definedExternally
    open fun createFromTiles(indexes: Number, replacements: Array<Any>, spriteConfig: GameObjectConfig /* GameObjectConfig & `T$11` */, scene: Phaser.Scene? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<org.decembrist.Phaser.GameObjects.Sprite> = definedExternally
    open fun createFromTiles(indexes: Array<Any>, replacements: Number, spriteConfig: GameObjectConfig /* GameObjectConfig & `T$11` */, scene: Phaser.Scene? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<org.decembrist.Phaser.GameObjects.Sprite> = definedExternally
    open fun createFromTiles(indexes: Array<Any>, replacements: Array<Any>, spriteConfig: GameObjectConfig /* GameObjectConfig & `T$11` */, scene: Phaser.Scene? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<org.decembrist.Phaser.GameObjects.Sprite> = definedExternally
    open fun createStaticLayer(layerID: String, tileset: String, x: Number, y: Number): StaticTilemapLayer = definedExternally
    open fun createStaticLayer(layerID: String, tileset: Array<String>, x: Number, y: Number): StaticTilemapLayer = definedExternally
    open fun createStaticLayer(layerID: String, tileset: Tileset, x: Number, y: Number): StaticTilemapLayer = definedExternally
    open fun createStaticLayer(layerID: String, tileset: Array<Tileset>, x: Number, y: Number): StaticTilemapLayer = definedExternally
    open fun createStaticLayer(layerID: Number, tileset: String, x: Number, y: Number): StaticTilemapLayer = definedExternally
    open fun createStaticLayer(layerID: Number, tileset: Array<String>, x: Number, y: Number): StaticTilemapLayer = definedExternally
    open fun createStaticLayer(layerID: Number, tileset: Tileset, x: Number, y: Number): StaticTilemapLayer = definedExternally
    open fun createStaticLayer(layerID: Number, tileset: Array<Tileset>, x: Number, y: Number): StaticTilemapLayer = definedExternally
    open fun destroy(): Unit = definedExternally
    open fun fill(index: Number, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun filterObjects(objectLayer: String, callback: (value: org.decembrist.Phaser.GameObjects.GameObject, index: Number, array: Array<org.decembrist.Phaser.GameObjects.GameObject>) -> Unit, context: Any? = definedExternally /* null */): Array<org.decembrist.Phaser.GameObjects.GameObject> = definedExternally
    open fun filterObjects(objectLayer: ObjectLayer, callback: (value: org.decembrist.Phaser.GameObjects.GameObject, index: Number, array: Array<org.decembrist.Phaser.GameObjects.GameObject>) -> Unit, context: Any? = definedExternally /* null */): Array<org.decembrist.Phaser.GameObjects.GameObject> = definedExternally
    open fun filterTiles(callback: Function<*>, context: Any? = definedExternally /* null */, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun findByIndex(index: Number, skip: Number? = definedExternally /* null */, reverse: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
    open fun findObject(objectLayer: String, callback: (value: org.decembrist.Phaser.GameObjects.GameObject, index: Number, array: Array<org.decembrist.Phaser.GameObjects.GameObject>) -> Unit, context: Any? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    open fun findObject(objectLayer: ObjectLayer, callback: (value: org.decembrist.Phaser.GameObjects.GameObject, index: Number, array: Array<org.decembrist.Phaser.GameObjects.GameObject>) -> Unit, context: Any? = definedExternally /* null */): org.decembrist.Phaser.GameObjects.GameObject = definedExternally
    open fun findTile(callback: (value: Tile, index: Number, array: Array<Tile>) -> Unit, context: Any? = definedExternally /* null */, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
    open fun forEachTile(callback: (value: Tile, index: Number, array: Array<Tile>) -> Unit, context: Any? = definedExternally /* null */, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun getImageIndex(name: String): Number = definedExternally
    open fun getIndex(location: Array<Any>, name: String): Number = definedExternally
    open fun getLayer(layer: String? = definedExternally /* null */): LayerData = definedExternally
    open fun getLayer(layer: Number? = definedExternally /* null */): LayerData = definedExternally
    open fun getLayer(layer: DynamicTilemapLayer? = definedExternally /* null */): LayerData = definedExternally
    open fun getLayer(layer: StaticTilemapLayer? = definedExternally /* null */): LayerData = definedExternally
    open fun getObjectLayer(name: String? = definedExternally /* null */): ObjectLayer = definedExternally
    open fun getLayerIndex(layer: String? = definedExternally /* null */): Number = definedExternally
    open fun getLayerIndex(layer: Number? = definedExternally /* null */): Number = definedExternally
    open fun getLayerIndex(layer: DynamicTilemapLayer? = definedExternally /* null */): Number = definedExternally
    open fun getLayerIndex(layer: StaticTilemapLayer? = definedExternally /* null */): Number = definedExternally
    open fun getLayerIndexByName(name: String): Number = definedExternally
    open fun getTileAt(tileX: Number, tileY: Number, nonNull: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
    open fun getTileAtWorldXY(worldX: Number, worldY: Number, nonNull: Boolean? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
    open fun getTilesWithin(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, filteringOptions: Any? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun getTilesWithinShape(shape: Geom.Circle, filteringOptions: Any? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun getTilesWithinShape(shape: Geom.Line, filteringOptions: Any? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun getTilesWithinShape(shape: Geom.Rectangle, filteringOptions: Any? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun getTilesWithinShape(shape: Geom.Triangle, filteringOptions: Any? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun getTilesWithinWorldXY(worldX: Number, worldY: Number, width: Number, height: Number, filteringOptions: Any? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Array<Tile> = definedExternally
    open fun getTileset(name: String): Tileset = definedExternally
    open fun getTilesetIndex(name: String): Number = definedExternally
    open fun hasTileAt(tileX: Number, tileY: Number, layer: LayerData? = definedExternally /* null */): Boolean = definedExternally
    open fun hasTileAtWorldXY(worldX: Number, worldY: Number, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Boolean = definedExternally
    open var layer: LayerData = definedExternally
    open fun putTileAt(tile: Number, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
    open fun putTileAt(tile: Tile, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
    open fun putTileAtWorldXY(tile: Number, worldX: Number, worldY: Number, recalculateFaces: Boolean? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
    open fun putTileAtWorldXY(tile: Tile, worldX: Number, worldY: Number, recalculateFaces: Boolean? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
    open fun putTilesAt(tile: Array<Number>, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun putTilesAt(tile: Array<Array<Number>>, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun putTilesAt(tile: Array<Tile>, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun putTilesAt(tile: Array<Array<Tile>>, tileX: Number, tileY: Number, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun randomize(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, indexes: Array<Number>? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun calculateFacesAt(tileX: Number, tileY: Number, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun calculateFacesWithin(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun removeAllLayers(): Tilemap = definedExternally
    open fun removeTileAt(tileX: Number, tileY: Number, replaceWithNull: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
    open fun removeTileAtWorldXY(worldX: Number, worldY: Number, replaceWithNull: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tile = definedExternally
    open fun renderDebug(graphics: org.decembrist.Phaser.GameObjects.Graphics, styleConfig: Any, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun replaceByIndex(findIndex: Number, newIndex: Number, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun setCollision(indexes: Number, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun setCollision(indexes: Array<Any>, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun setCollisionBetween(start: Number, stop: Number, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun setCollisionByProperty(properties: Any, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun setCollisionByExclusion(indexes: Array<Number>, collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun setCollisionFromCollisionGroup(collides: Boolean? = definedExternally /* null */, recalculateFaces: Boolean? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun setTileIndexCallback(indexes: Number, callback: Function<*>, callbackContext: Any, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun setTileIndexCallback(indexes: Array<Any>, callback: Function<*>, callbackContext: Any, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun setTileLocationCallback(tileX: Number, tileY: Number, width: Number, height: Number, callback: Function<*>, callbackContext: Any? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun setLayer(layer: String? = definedExternally /* null */): Tilemap = definedExternally
    open fun setLayer(layer: Number? = definedExternally /* null */): Tilemap = definedExternally
    open fun setLayer(layer: DynamicTilemapLayer? = definedExternally /* null */): Tilemap = definedExternally
    open fun setLayer(layer: StaticTilemapLayer? = definedExternally /* null */): Tilemap = definedExternally
    open fun setBaseTileSize(tileWidth: Number, tileHeight: Number): Tilemap = definedExternally
    open fun setLayerTileSize(tileWidth: Number, tileHeight: Number, layer: String? = definedExternally /* null */): Tilemap = definedExternally
    open fun setLayerTileSize(tileWidth: Number, tileHeight: Number, layer: Number? = definedExternally /* null */): Tilemap = definedExternally
    open fun setLayerTileSize(tileWidth: Number, tileHeight: Number, layer: DynamicTilemapLayer? = definedExternally /* null */): Tilemap = definedExternally
    open fun setLayerTileSize(tileWidth: Number, tileHeight: Number, layer: StaticTilemapLayer? = definedExternally /* null */): Tilemap = definedExternally
    open fun shuffle(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun swapByIndex(tileA: Number, tileB: Number, tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun tileToWorldX(tileX: Number, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Number = definedExternally
    open fun tileToWorldY(tileY: Number, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Number = definedExternally
    open fun tileToWorldXY(tileX: Number, tileY: Number, point: org.decembrist.Phaser.Math.Vector2? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): org.decembrist.Phaser.Math.Vector2 = definedExternally
    open fun weightedRandomize(tileX: Number? = definedExternally /* null */, tileY: Number? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, weightedIndexes: Array<Any?>? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Tilemap = definedExternally
    open fun worldToTileX(worldX: Number, snapToFloor: Boolean? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Number = definedExternally
    open fun worldToTileY(worldY: Number, snapToFloor: Boolean? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): Number = definedExternally
    open fun worldToTileXY(worldX: Number, worldY: Number, snapToFloor: Boolean? = definedExternally /* null */, point: org.decembrist.Phaser.Math.Vector2? = definedExternally /* null */, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera? = definedExternally /* null */, layer: LayerData? = definedExternally /* null */): org.decembrist.Phaser.Math.Vector2 = definedExternally
    open fun convertLayerToStatic(): StaticTilemapLayer = definedExternally
    open fun getLayer(): LayerData = definedExternally
    open fun getLayerIndex(): Number = definedExternally
    open fun setLayer(): Tilemap = definedExternally
    open fun setLayerTileSize(tileWidth: Number, tileHeight: Number): Tilemap = definedExternally
}
open external class Tileset(name: String, firstgid: Number, tileWidth: Number? = definedExternally /* null */, tileHeight: Number? = definedExternally /* null */, tileMargin: Number? = definedExternally /* null */, tileSpacing: Number? = definedExternally /* null */, tileProperties: Any? = definedExternally /* null */, tileData: Any? = definedExternally /* null */) {
    open var name: String = definedExternally
    open var firstgid: Number = definedExternally
    open var tileWidth: Number = definedExternally
    open var tileHeight: Number = definedExternally
    open var tileMargin: Number = definedExternally
    open var tileSpacing: Number = definedExternally
    open var tileProperties: Any = definedExternally
    open var tileData: Any = definedExternally
    open var image: org.decembrist.Phaser.Textures.Texture = definedExternally
    open var glTexture: WebGLTexture = definedExternally
    open var rows: Number = definedExternally
    open var columns: Number = definedExternally
    open var total: Number = definedExternally
    open var texCoordinates: Array<Any?> = definedExternally
    open fun getTileProperties(tileIndex: Number): Any? = definedExternally
    open fun getTileData(tileIndex: Number): Any? = definedExternally
    open fun getTileCollisionGroup(tileIndex: Number): Any = definedExternally
    open fun containsTileIndex(tileIndex: Number): Boolean = definedExternally
    open fun getTileTextureCoordinates(tileIndex: Number): Any = definedExternally
    open fun setImage(texture: org.decembrist.Phaser.Textures.Texture): Tileset = definedExternally
    open fun setTileSize(tileWidth: Number? = definedExternally /* null */, tileHeight: Number? = definedExternally /* null */): Tileset = definedExternally
    open fun setSpacing(margin: Number? = definedExternally /* null */, spacing: Number? = definedExternally /* null */): Tileset = definedExternally
    open fun updateTileData(imageWidth: Number, imageHeight: Number): Tileset = definedExternally
}
