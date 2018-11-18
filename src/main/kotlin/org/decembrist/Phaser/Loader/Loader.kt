@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Loader") JsNonModule]
package org.decembrist.Phaser.Loader

import org.decembrist.Phaser.Phaser
import org.decembrist.utils.FileConfig
import org.decembrist.utils.XHRSettingsObject
import org.w3c.dom.HTMLImageElement
import org.w3c.files.Blob
import org.w3c.xhr.ProgressEvent
import org.w3c.xhr.XMLHttpRequest

external var LOADER_IDLE: Number = definedExternally
external var LOADER_LOADING: Number = definedExternally
external var LOADER_PROCESSING: Number = definedExternally
external var LOADER_COMPLETE: Number = definedExternally
external var LOADER_SHUTDOWN: Number = definedExternally
external var LOADER_DESTROYED: Number = definedExternally
external var FILE_PENDING: Number = definedExternally
external var FILE_LOADING: Number = definedExternally
external var FILE_LOADED: Number = definedExternally
external var FILE_FAILED: Number = definedExternally
external var FILE_PROCESSING: Number = definedExternally
external var FILE_ERRORED: Number = definedExternally
external var FILE_COMPLETE: Number = definedExternally
external var FILE_DESTROYED: Number = definedExternally
external var FILE_POPULATED: Number = definedExternally
open external class File(loader: LoaderPlugin, fileConfig: FileConfig) {
    open var loader: LoaderPlugin = definedExternally
    open var cache: dynamic /* Phaser.Textures.TextureManager | Phaser.Cache.BaseCache */ = definedExternally
    open var type: String = definedExternally
    open var key: String = definedExternally
    open var url: String = definedExternally
    open var src: String = definedExternally
    open var xhrSettings: XHRSettingsObject = definedExternally
    open var xhrLoader: XMLHttpRequest = definedExternally
    open var state: Number = definedExternally
    open var bytesTotal: Number = definedExternally
    open var bytesLoaded: Number = definedExternally
    open var percentComplete: Number = definedExternally
    open var crossOrigin: String? = definedExternally
    open var data: Any = definedExternally
    open var config: Any = definedExternally
    open var multiFile: MultiFile = definedExternally
    open var linkFile: File = definedExternally
    open fun setLink(fileB: File): Unit = definedExternally
    open fun resetXHR(): Unit = definedExternally
    open fun load(): Unit = definedExternally
    open fun onLoad(xhr: XMLHttpRequest, event: ProgressEvent): Unit = definedExternally
    open fun onError(event: ProgressEvent): Unit = definedExternally
    open fun onProgress(event: ProgressEvent): Unit = definedExternally
    open fun onProcess(): Unit = definedExternally
    open fun onProcessComplete(): Unit = definedExternally
    open fun onProcessError(): Unit = definedExternally
    open fun hasCacheConflict(): Boolean = definedExternally
    open fun addToCache(): Unit = definedExternally
    open fun pendingDestroy(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
    companion object {
        fun createObjectURL(image: HTMLImageElement, blob: Blob, defaultType: String): Unit = definedExternally
        fun revokeObjectURL(image: HTMLImageElement): Unit = definedExternally
    }
}
external fun GetURL(file: File, baseURL: String): String = definedExternally
open external class LoaderPlugin(scene: Phaser.Scene) : org.decembrist.Phaser.Events.EventEmitter {
    open fun animation(key: String, url: String? = definedExternally /* null */, dataKey: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun animation(key: org.decembrist.Phaser.Loader.FileTypes.JSONFileConfig, url: String? = definedExternally /* null */, dataKey: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun animation(key: Array<org.decembrist.Phaser.Loader.FileTypes.JSONFileConfig>, url: String? = definedExternally /* null */, dataKey: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun atlas(key: String, textureURL: String? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun atlas(key: String, textureURL: Array<String>? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun atlas(key: org.decembrist.Phaser.Loader.FileTypes.AtlasJSONFileConfig, textureURL: String? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun atlas(key: org.decembrist.Phaser.Loader.FileTypes.AtlasJSONFileConfig, textureURL: Array<String>? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun atlas(key: Array<org.decembrist.Phaser.Loader.FileTypes.AtlasJSONFileConfig>, textureURL: String? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun atlas(key: Array<org.decembrist.Phaser.Loader.FileTypes.AtlasJSONFileConfig>, textureURL: Array<String>? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun atlasXML(key: String, textureURL: String? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun atlasXML(key: String, textureURL: Array<String>? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun atlasXML(key: org.decembrist.Phaser.Loader.FileTypes.AtlasXMLFileConfig, textureURL: String? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun atlasXML(key: org.decembrist.Phaser.Loader.FileTypes.AtlasXMLFileConfig, textureURL: Array<String>? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun atlasXML(key: Array<org.decembrist.Phaser.Loader.FileTypes.AtlasXMLFileConfig>, textureURL: String? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun atlasXML(key: Array<org.decembrist.Phaser.Loader.FileTypes.AtlasXMLFileConfig>, textureURL: Array<String>? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun audio(key: String, urls: String? = definedExternally /* null */, config: Any? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun audio(key: String, urls: Array<String>? = definedExternally /* null */, config: Any? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun audio(key: org.decembrist.Phaser.Loader.FileTypes.AudioFileConfig, urls: String? = definedExternally /* null */, config: Any? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun audio(key: org.decembrist.Phaser.Loader.FileTypes.AudioFileConfig, urls: Array<String>? = definedExternally /* null */, config: Any? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun audio(key: Array<org.decembrist.Phaser.Loader.FileTypes.AudioFileConfig>, urls: String? = definedExternally /* null */, config: Any? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun audio(key: Array<org.decembrist.Phaser.Loader.FileTypes.AudioFileConfig>, urls: Array<String>? = definedExternally /* null */, config: Any? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun audioSprite(key: String, jsonURL: String, audioURL: String? = definedExternally /* null */, audioConfig: Any? = definedExternally /* null */, audioXhrSettings: XHRSettingsObject? = definedExternally /* null */, jsonXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun audioSprite(key: String, jsonURL: String, audioURL: Array<String>? = definedExternally /* null */, audioConfig: Any? = definedExternally /* null */, audioXhrSettings: XHRSettingsObject? = definedExternally /* null */, jsonXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun audioSprite(key: org.decembrist.Phaser.Loader.FileTypes.AudioSpriteFileConfig, jsonURL: String, audioURL: String? = definedExternally /* null */, audioConfig: Any? = definedExternally /* null */, audioXhrSettings: XHRSettingsObject? = definedExternally /* null */, jsonXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun audioSprite(key: org.decembrist.Phaser.Loader.FileTypes.AudioSpriteFileConfig, jsonURL: String, audioURL: Array<String>? = definedExternally /* null */, audioConfig: Any? = definedExternally /* null */, audioXhrSettings: XHRSettingsObject? = definedExternally /* null */, jsonXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun audioSprite(key: Array<org.decembrist.Phaser.Loader.FileTypes.AudioSpriteFileConfig>, jsonURL: String, audioURL: String? = definedExternally /* null */, audioConfig: Any? = definedExternally /* null */, audioXhrSettings: XHRSettingsObject? = definedExternally /* null */, jsonXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun audioSprite(key: Array<org.decembrist.Phaser.Loader.FileTypes.AudioSpriteFileConfig>, jsonURL: String, audioURL: Array<String>? = definedExternally /* null */, audioConfig: Any? = definedExternally /* null */, audioXhrSettings: XHRSettingsObject? = definedExternally /* null */, jsonXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun binary(key: String, url: String? = definedExternally /* null */, dataType: Any? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun binary(key: org.decembrist.Phaser.Loader.FileTypes.BinaryFileConfig, url: String? = definedExternally /* null */, dataType: Any? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun binary(key: Array<org.decembrist.Phaser.Loader.FileTypes.BinaryFileConfig>, url: String? = definedExternally /* null */, dataType: Any? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun bitmapFont(key: String, textureURL: String? = definedExternally /* null */, fontDataURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, fontDataXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun bitmapFont(key: String, textureURL: Array<String>? = definedExternally /* null */, fontDataURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, fontDataXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun bitmapFont(key: org.decembrist.Phaser.Loader.FileTypes.BitmapFontFileConfig, textureURL: String? = definedExternally /* null */, fontDataURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, fontDataXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun bitmapFont(key: org.decembrist.Phaser.Loader.FileTypes.BitmapFontFileConfig, textureURL: Array<String>? = definedExternally /* null */, fontDataURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, fontDataXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun bitmapFont(key: Array<org.decembrist.Phaser.Loader.FileTypes.BitmapFontFileConfig>, textureURL: String? = definedExternally /* null */, fontDataURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, fontDataXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun bitmapFont(key: Array<org.decembrist.Phaser.Loader.FileTypes.BitmapFontFileConfig>, textureURL: Array<String>? = definedExternally /* null */, fontDataURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, fontDataXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun glsl(key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun glsl(key: org.decembrist.Phaser.Loader.FileTypes.GLSLFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun glsl(key: Array<org.decembrist.Phaser.Loader.FileTypes.GLSLFileConfig>, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun html(key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun html(key: org.decembrist.Phaser.Loader.FileTypes.HTMLFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun html(key: Array<org.decembrist.Phaser.Loader.FileTypes.HTMLFileConfig>, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun htmlTexture(key: String, url: String? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun htmlTexture(key: org.decembrist.Phaser.Loader.FileTypes.HTMLTextureFileConfig, url: String? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun htmlTexture(key: Array<org.decembrist.Phaser.Loader.FileTypes.HTMLTextureFileConfig>, url: String? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun image(key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun image(key: String, url: Array<String>? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun image(key: org.decembrist.Phaser.Loader.FileTypes.ImageFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun image(key: org.decembrist.Phaser.Loader.FileTypes.ImageFileConfig, url: Array<String>? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun image(key: Array<org.decembrist.Phaser.Loader.FileTypes.ImageFileConfig>, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun image(key: Array<org.decembrist.Phaser.Loader.FileTypes.ImageFileConfig>, url: Array<String>? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun json(key: String, url: String? = definedExternally /* null */, dataKey: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun json(key: org.decembrist.Phaser.Loader.FileTypes.JSONFileConfig, url: String? = definedExternally /* null */, dataKey: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun json(key: Array<org.decembrist.Phaser.Loader.FileTypes.JSONFileConfig>, url: String? = definedExternally /* null */, dataKey: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun multiatlas(key: String, atlasURL: String? = definedExternally /* null */, path: String? = definedExternally /* null */, baseURL: String? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun multiatlas(key: org.decembrist.Phaser.Loader.FileTypes.MultiAtlasFileConfig, atlasURL: String? = definedExternally /* null */, path: String? = definedExternally /* null */, baseURL: String? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun multiatlas(key: Array<org.decembrist.Phaser.Loader.FileTypes.MultiAtlasFileConfig>, atlasURL: String? = definedExternally /* null */, path: String? = definedExternally /* null */, baseURL: String? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun pack(key: String, url: String? = definedExternally /* null */, dataKey: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun pack(key: org.decembrist.Phaser.Loader.FileTypes.PackFileConfig, url: String? = definedExternally /* null */, dataKey: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun pack(key: Array<org.decembrist.Phaser.Loader.FileTypes.PackFileConfig>, url: String? = definedExternally /* null */, dataKey: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun plugin(key: String, url: String? = definedExternally /* null */, start: Boolean? = definedExternally /* null */, mapping: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun plugin(key: String, url: Function<*>? = definedExternally /* null */, start: Boolean? = definedExternally /* null */, mapping: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun plugin(key: org.decembrist.Phaser.Loader.FileTypes.PluginFileConfig, url: String? = definedExternally /* null */, start: Boolean? = definedExternally /* null */, mapping: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun plugin(key: org.decembrist.Phaser.Loader.FileTypes.PluginFileConfig, url: Function<*>? = definedExternally /* null */, start: Boolean? = definedExternally /* null */, mapping: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun plugin(key: Array<org.decembrist.Phaser.Loader.FileTypes.PluginFileConfig>, url: String? = definedExternally /* null */, start: Boolean? = definedExternally /* null */, mapping: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun plugin(key: Array<org.decembrist.Phaser.Loader.FileTypes.PluginFileConfig>, url: Function<*>? = definedExternally /* null */, start: Boolean? = definedExternally /* null */, mapping: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun scenePlugin(key: String, url: String? = definedExternally /* null */, systemKey: String? = definedExternally /* null */, sceneKey: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun scenePlugin(key: String, url: Function<*>? = definedExternally /* null */, systemKey: String? = definedExternally /* null */, sceneKey: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun scenePlugin(key: org.decembrist.Phaser.Loader.FileTypes.ScenePluginFileConfig, url: String? = definedExternally /* null */, systemKey: String? = definedExternally /* null */, sceneKey: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun scenePlugin(key: org.decembrist.Phaser.Loader.FileTypes.ScenePluginFileConfig, url: Function<*>? = definedExternally /* null */, systemKey: String? = definedExternally /* null */, sceneKey: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun scenePlugin(key: Array<org.decembrist.Phaser.Loader.FileTypes.ScenePluginFileConfig>, url: String? = definedExternally /* null */, systemKey: String? = definedExternally /* null */, sceneKey: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun scenePlugin(key: Array<org.decembrist.Phaser.Loader.FileTypes.ScenePluginFileConfig>, url: Function<*>? = definedExternally /* null */, systemKey: String? = definedExternally /* null */, sceneKey: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun script(key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun script(key: org.decembrist.Phaser.Loader.FileTypes.ScriptFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun script(key: Array<org.decembrist.Phaser.Loader.FileTypes.ScriptFileConfig>, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun spritesheet(key: String, url: String? = definedExternally /* null */, frameConfig: org.decembrist.Phaser.Loader.FileTypes.ImageFrameConfig? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun spritesheet(key: org.decembrist.Phaser.Loader.FileTypes.SpriteSheetFileConfig, url: String? = definedExternally /* null */, frameConfig: org.decembrist.Phaser.Loader.FileTypes.ImageFrameConfig? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun spritesheet(key: Array<org.decembrist.Phaser.Loader.FileTypes.SpriteSheetFileConfig>, url: String? = definedExternally /* null */, frameConfig: org.decembrist.Phaser.Loader.FileTypes.ImageFrameConfig? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun svg(key: String, url: String? = definedExternally /* null */, svgConfig: org.decembrist.Phaser.Loader.FileTypes.SVGSizeConfig? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun svg(key: org.decembrist.Phaser.Loader.FileTypes.SVGFileConfig, url: String? = definedExternally /* null */, svgConfig: org.decembrist.Phaser.Loader.FileTypes.SVGSizeConfig? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun svg(key: Array<org.decembrist.Phaser.Loader.FileTypes.SVGFileConfig>, url: String? = definedExternally /* null */, svgConfig: org.decembrist.Phaser.Loader.FileTypes.SVGSizeConfig? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun text(key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun text(key: org.decembrist.Phaser.Loader.FileTypes.TextFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun text(key: Array<org.decembrist.Phaser.Loader.FileTypes.TextFileConfig>, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun tilemapCSV(key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun tilemapCSV(key: org.decembrist.Phaser.Loader.FileTypes.TilemapCSVFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun tilemapCSV(key: Array<org.decembrist.Phaser.Loader.FileTypes.TilemapCSVFileConfig>, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun tilemapImpact(key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun tilemapImpact(key: org.decembrist.Phaser.Loader.FileTypes.TilemapImpactFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun tilemapImpact(key: Array<org.decembrist.Phaser.Loader.FileTypes.TilemapImpactFileConfig>, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun tilemapTiledJSON(key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun tilemapTiledJSON(key: org.decembrist.Phaser.Loader.FileTypes.TilemapJSONFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun tilemapTiledJSON(key: Array<org.decembrist.Phaser.Loader.FileTypes.TilemapJSONFileConfig>, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun unityAtlas(key: String, textureURL: String? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun unityAtlas(key: String, textureURL: Array<String>? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun unityAtlas(key: org.decembrist.Phaser.Loader.FileTypes.UnityAtlasFileConfig, textureURL: String? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun unityAtlas(key: org.decembrist.Phaser.Loader.FileTypes.UnityAtlasFileConfig, textureURL: Array<String>? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun unityAtlas(key: Array<org.decembrist.Phaser.Loader.FileTypes.UnityAtlasFileConfig>, textureURL: String? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun unityAtlas(key: Array<org.decembrist.Phaser.Loader.FileTypes.UnityAtlasFileConfig>, textureURL: Array<String>? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun xml(key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun xml(key: org.decembrist.Phaser.Loader.FileTypes.XMLFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun xml(key: Array<org.decembrist.Phaser.Loader.FileTypes.XMLFileConfig>, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */): LoaderPlugin = definedExternally
    open var scene: Phaser.Scene = definedExternally
    open var systems: org.decembrist.Phaser.Scenes.Systems = definedExternally
    open var cacheManager: org.decembrist.Phaser.Cache.CacheManager = definedExternally
    open var textureManager: org.decembrist.Phaser.Textures.TextureManager = definedExternally
    open var prefix: String = definedExternally
    open var path: String = definedExternally
    open var baseURL: String = definedExternally
    open var maxParallelDownloads: Number = definedExternally
    open var xhr: XHRSettingsObject = definedExternally
    open var crossOrigin: String = definedExternally
    open var totalToLoad: Number = definedExternally
    open var progress: Number = definedExternally
    open var list: org.decembrist.Phaser.Structs.Set<File> = definedExternally
    open var inflight: org.decembrist.Phaser.Structs.Set<File> = definedExternally
    open var queue: org.decembrist.Phaser.Structs.Set<File> = definedExternally
    open var totalFailed: Number = definedExternally
    open var totalComplete: Number = definedExternally
    open var state: Number = definedExternally
    open fun setBaseURL(url: String? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun setPath(path: String? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun setPrefix(prefix: String? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun setCORS(crossOrigin: String? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun addFile(file: File): Unit = definedExternally
    open fun addFile(file: Array<File>): Unit = definedExternally
    open fun keyExists(file: File): Boolean = definedExternally
    open fun addPack(data: Any, packKey: String? = definedExternally /* null */): Boolean = definedExternally
    open fun isLoading(): Boolean = definedExternally
    open fun isReady(): Boolean = definedExternally
    open fun start(): Unit = definedExternally
    open fun updateProgress(): Unit = definedExternally
    open fun update(): Unit = definedExternally
    open fun nextFile(file: File, success: Boolean): Unit = definedExternally
    open fun fileProcessComplete(file: File): Unit = definedExternally
    open fun loadComplete(): Unit = definedExternally
    open fun flagForRemoval(file: File): Unit = definedExternally
    open fun saveJSON(data: Any, filename: String? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun save(data: Any, filename: String? = definedExternally /* null */, filetype: String? = definedExternally /* null */): LoaderPlugin = definedExternally
    open fun reset(): Unit = definedExternally
    open fun atlas(key: String): LoaderPlugin = definedExternally
    open fun atlas(key: org.decembrist.Phaser.Loader.FileTypes.AtlasJSONFileConfig): LoaderPlugin = definedExternally
    open fun atlas(key: Array<org.decembrist.Phaser.Loader.FileTypes.AtlasJSONFileConfig>): LoaderPlugin = definedExternally
    open fun atlasXML(key: String): LoaderPlugin = definedExternally
    open fun atlasXML(key: org.decembrist.Phaser.Loader.FileTypes.AtlasXMLFileConfig): LoaderPlugin = definedExternally
    open fun atlasXML(key: Array<org.decembrist.Phaser.Loader.FileTypes.AtlasXMLFileConfig>): LoaderPlugin = definedExternally
    open fun audio(key: String): LoaderPlugin = definedExternally
    open fun audio(key: org.decembrist.Phaser.Loader.FileTypes.AudioFileConfig): LoaderPlugin = definedExternally
    open fun audio(key: Array<org.decembrist.Phaser.Loader.FileTypes.AudioFileConfig>): LoaderPlugin = definedExternally
    open fun audioSprite(key: String, jsonURL: String): LoaderPlugin = definedExternally
    open fun audioSprite(key: org.decembrist.Phaser.Loader.FileTypes.AudioSpriteFileConfig, jsonURL: String): LoaderPlugin = definedExternally
    open fun audioSprite(key: Array<org.decembrist.Phaser.Loader.FileTypes.AudioSpriteFileConfig>, jsonURL: String): LoaderPlugin = definedExternally
    open fun bitmapFont(key: String): LoaderPlugin = definedExternally
    open fun bitmapFont(key: org.decembrist.Phaser.Loader.FileTypes.BitmapFontFileConfig): LoaderPlugin = definedExternally
    open fun bitmapFont(key: Array<org.decembrist.Phaser.Loader.FileTypes.BitmapFontFileConfig>): LoaderPlugin = definedExternally
    open fun image(key: String): LoaderPlugin = definedExternally
    open fun image(key: org.decembrist.Phaser.Loader.FileTypes.ImageFileConfig): LoaderPlugin = definedExternally
    open fun image(key: Array<org.decembrist.Phaser.Loader.FileTypes.ImageFileConfig>): LoaderPlugin = definedExternally
    open fun plugin(key: String): LoaderPlugin = definedExternally
    open fun plugin(key: org.decembrist.Phaser.Loader.FileTypes.PluginFileConfig): LoaderPlugin = definedExternally
    open fun plugin(key: Array<org.decembrist.Phaser.Loader.FileTypes.PluginFileConfig>): LoaderPlugin = definedExternally
    open fun scenePlugin(key: String): LoaderPlugin = definedExternally
    open fun scenePlugin(key: org.decembrist.Phaser.Loader.FileTypes.ScenePluginFileConfig): LoaderPlugin = definedExternally
    open fun scenePlugin(key: Array<org.decembrist.Phaser.Loader.FileTypes.ScenePluginFileConfig>): LoaderPlugin = definedExternally
    open fun unityAtlas(key: String): LoaderPlugin = definedExternally
    open fun unityAtlas(key: org.decembrist.Phaser.Loader.FileTypes.UnityAtlasFileConfig): LoaderPlugin = definedExternally
    open fun unityAtlas(key: Array<org.decembrist.Phaser.Loader.FileTypes.UnityAtlasFileConfig>): LoaderPlugin = definedExternally
}
external fun MergeXHRSettings(global: XHRSettingsObject, local: XHRSettingsObject): XHRSettingsObject = definedExternally
open external class MultiFile(loader: LoaderPlugin, type: String, key: String, files: Array<File>) {
    open fun onFileComplete(file: File): Unit = definedExternally
    open fun addToCache(): Unit = definedExternally
    open var loader: LoaderPlugin = definedExternally
    open var type: String = definedExternally
    open var key: String = definedExternally
    open var files: Array<File> = definedExternally
    open var complete: Boolean = definedExternally
    open var pending: Number = definedExternally
    open var failed: Number = definedExternally
    open var config: Any = definedExternally
    open fun isReadyToProcess(): Boolean = definedExternally
    open fun addToMultiFile(files: File): MultiFile = definedExternally
    open fun onFileFailed(file: File): Unit = definedExternally
}
external fun XHRLoader(file: File, globalXHRSettings: XHRSettingsObject): XMLHttpRequest = definedExternally
external fun XHRSettings(responseType: String? /* "" */ = definedExternally /* null */, async: Boolean? = definedExternally /* null */, user: String? = definedExternally /* null */, password: String? = definedExternally /* null */, timeout: Number? = definedExternally /* null */): XHRSettingsObject = definedExternally
external fun XHRSettings(responseType: String? /* "arraybuffer" */ = definedExternally /* null */, async: Boolean? = definedExternally /* null */, user: String? = definedExternally /* null */, password: String? = definedExternally /* null */, timeout: Number? = definedExternally /* null */): XHRSettingsObject = definedExternally
external fun XHRSettings(responseType: String? /* "blob" */ = definedExternally /* null */, async: Boolean? = definedExternally /* null */, user: String? = definedExternally /* null */, password: String? = definedExternally /* null */, timeout: Number? = definedExternally /* null */): XHRSettingsObject = definedExternally
external fun XHRSettings(responseType: String? /* "document" */ = definedExternally /* null */, async: Boolean? = definedExternally /* null */, user: String? = definedExternally /* null */, password: String? = definedExternally /* null */, timeout: Number? = definedExternally /* null */): XHRSettingsObject = definedExternally
external fun XHRSettings(responseType: String? /* "json" */ = definedExternally /* null */, async: Boolean? = definedExternally /* null */, user: String? = definedExternally /* null */, password: String? = definedExternally /* null */, timeout: Number? = definedExternally /* null */): XHRSettingsObject = definedExternally
external fun XHRSettings(responseType: String? /* "text" */ = definedExternally /* null */, async: Boolean? = definedExternally /* null */, user: String? = definedExternally /* null */, password: String? = definedExternally /* null */, timeout: Number? = definedExternally /* null */): XHRSettingsObject = definedExternally
external fun XHRSettings(): XHRSettingsObject = definedExternally
