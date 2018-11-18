@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Renderer.WebGL.Pipelines") JsNonModule]
package org.decembrist.Phaser.Renderer.WebGL.Pipelines

import org.decembrist.Phaser.Phaser
import org.khronos.webgl.Float32Array
import org.khronos.webgl.Uint32Array
import org.khronos.webgl.WebGLTexture

open external class BitmapMaskPipeline(config: Any) : org.decembrist.Phaser.Renderer.WebGL.WebGLPipeline {
    open var vertexViewF32: Float32Array = definedExternally
    open var maxQuads: Number = definedExternally
    open var resolutionDirty: Boolean = definedExternally
    override fun onBind(): BitmapMaskPipeline /* this */ = definedExternally
    override fun resize(width: Number, height: Number, resolution: Number): BitmapMaskPipeline /* this */ = definedExternally
    open fun beginMask(mask: org.decembrist.Phaser.GameObjects.GameObject, maskedObject: org.decembrist.Phaser.GameObjects.GameObject, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera): Unit = definedExternally
    open fun endMask(mask: org.decembrist.Phaser.GameObjects.GameObject): Unit = definedExternally
}
open external class ForwardDiffuseLightPipeline(config: Any) : TextureTintPipeline {
    override fun onRender(scene: Phaser.Scene, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera): ForwardDiffuseLightPipeline /* this */ = definedExternally
    open fun setNormalMap(gameObject: org.decembrist.Phaser.GameObjects.GameObject): Unit = definedExternally
    open fun batchSprite(sprite: org.decembrist.Phaser.GameObjects.Sprite, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
}
open external class TextureTintPipeline(config: Any) : org.decembrist.Phaser.Renderer.WebGL.WebGLPipeline {
    open fun batchTexture(gameObject: org.decembrist.Phaser.GameObjects.GameObject, texture: WebGLTexture, textureWidth: Number, textureHeight: Number, srcX: Number, srcY: Number, srcWidth: Number, srcHeight: Number, scaleX: Number, scaleY: Number, rotation: Number, flipX: Boolean, flipY: Boolean, scrollFactorX: Number, scrollFactorY: Number, displayOriginX: Number, displayOriginY: Number, frameX: Number, frameY: Number, frameWidth: Number, frameHeight: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintBR: Number, tintEffect: Number, uOffset: Number, vOffset: Number, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
    open var vertexViewF32: Float32Array = definedExternally
    open var vertexViewU32: Uint32Array = definedExternally
    open var maxQuads: Number = definedExternally
    override fun onBind(): TextureTintPipeline /* this */ = definedExternally
    override fun resize(width: Number, height: Number, resolution: Number): TextureTintPipeline /* this */ = definedExternally
    open fun setTexture2D(texture: WebGLTexture, textureUnit: Number): TextureTintPipeline = definedExternally
    override fun flush(): TextureTintPipeline /* this */ = definedExternally
    open fun batchSprite(sprite: org.decembrist.Phaser.GameObjects.Sprite, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix? = definedExternally /* null */): Unit = definedExternally
    open fun batchSprite(sprite: org.decembrist.Phaser.GameObjects.Image, camera: org.decembrist.Phaser.Cameras.Scene2D.Camera, parentTransformMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix? = definedExternally /* null */): Unit = definedExternally
    open fun batchQuad(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, u0: Number, v0: Number, u1: Number, v1: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintBR: Number, tintEffect: Number): Boolean = definedExternally
    open fun batchQuad(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, u0: Number, v0: Number, u1: Number, v1: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintBR: Number, tintEffect: Boolean): Boolean = definedExternally
    open fun batchTri(x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, u0: Number, v0: Number, u1: Number, v1: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintEffect: Number): Boolean = definedExternally
    open fun batchTri(x1: Number, y1: Number, x2: Number, y2: Number, x3: Number, y3: Number, u0: Number, v0: Number, u1: Number, v1: Number, tintTL: Number, tintTR: Number, tintBL: Number, tintEffect: Boolean): Boolean = definedExternally
    open fun batchTextureFrame(frame: org.decembrist.Phaser.Textures.Frame, x: Number, y: Number, tint: Number, alpha: Number, transformMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix, parentTransformMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix? = definedExternally /* null */): Unit = definedExternally
    open fun drawFillRect(x: Number, y: Number, width: Number, height: Number, color: Number, alpha: Number): Unit = definedExternally
    open fun batchFillRect(x: Number, y: Number, width: Number, height: Number, currentMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix, parentMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
    open fun batchFillTriangle(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number, currentMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix, parentMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
    open fun batchStrokeTriangle(x0: Number, y0: Number, x1: Number, y1: Number, x2: Number, y2: Number, lineWidth: Number, currentMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix, parentMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
    open fun batchFillPath(path: Array<Any>, currentMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix, parentMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
    open fun batchStrokePath(path: Array<Any>, lineWidth: Number, pathOpen: Boolean, currentMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix, parentMatrix: org.decembrist.Phaser.GameObjects.Components.TransformMatrix): Unit = definedExternally
    open fun batchLine(ax: Number, ay: Number, bx: Number, by: Number, aLineWidth: Number, bLineWidth: Number, currentMatrix: Float32Array): Unit = definedExternally
}
