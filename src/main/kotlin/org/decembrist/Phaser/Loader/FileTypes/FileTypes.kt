@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Loader.FileTypes") JsNonModule]
package org.decembrist.Phaser.Loader.FileTypes

import org.decembrist.utils.AudioContext
import org.decembrist.utils.Config
import org.decembrist.utils.XHRSettingsObject

open external class AnimationJSONFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */, dataKey: String? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.JSONFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */, dataKey: String? = definedExternally /* null */)
    override fun onProcess(): Unit = definedExternally
    open fun onLoadComplete(): Unit = definedExternally
}
external interface AtlasJSONFileConfig: Config {
    var key: String
    var textureURL: String? get() = definedExternally; set(value) = definedExternally
    var textureExtension: String? get() = definedExternally; set(value) = definedExternally
    var textureXhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
    var normalMap: String? get() = definedExternally; set(value) = definedExternally
    var atlasURL: String? get() = definedExternally; set(value) = definedExternally
    var atlasExtension: String? get() = definedExternally; set(value) = definedExternally
    var atlasXhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class AtlasJSONFile : org.decembrist.Phaser.Loader.MultiFile {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, textureURL: String? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, textureURL: Array<String>? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.AtlasJSONFileConfig, textureURL: String? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.AtlasJSONFileConfig, textureURL: Array<String>? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */)
    override fun addToCache(): Unit = definedExternally
}
external interface AtlasXMLFileConfig: Config {
    var key: String
    var textureURL: String? get() = definedExternally; set(value) = definedExternally
    var textureExtension: String? get() = definedExternally; set(value) = definedExternally
    var textureXhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
    var normalMap: String? get() = definedExternally; set(value) = definedExternally
    var atlasURL: String? get() = definedExternally; set(value) = definedExternally
    var atlasExtension: String? get() = definedExternally; set(value) = definedExternally
    var atlasXhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class AtlasXMLFile : org.decembrist.Phaser.Loader.MultiFile {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, textureURL: String? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, textureURL: Array<String>? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.AtlasXMLFileConfig, textureURL: String? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.AtlasXMLFileConfig, textureURL: Array<String>? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */)
    override fun addToCache(): Unit = definedExternally
}
external interface AudioFileConfig: Config {
    var key: String
    var urlConfig: String? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
    var audioContext: AudioContext? get() = definedExternally; set(value) = definedExternally
}
open external class AudioFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, urlConfig: Any? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */, audioContext: AudioContext? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.AudioFileConfig, urlConfig: Any? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */, audioContext: AudioContext? = definedExternally /* null */)
    override fun onProcess(): Unit = definedExternally
}
external interface AudioSpriteFileConfig: Config {
    var key: String
    var jsonURL: String
    var jsonXhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
    var audioURL: Any? get() = definedExternally; set(value) = definedExternally
    var audioConfig: Any? get() = definedExternally; set(value) = definedExternally
    var audioXhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class AudioSpriteFile : org.decembrist.Phaser.Loader.MultiFile {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, jsonURL: String, audioURL: Any? = definedExternally /* null */, audioConfig: Any? = definedExternally /* null */, audioXhrSettings: XHRSettingsObject? = definedExternally /* null */, jsonXhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.AudioSpriteFileConfig, jsonURL: String, audioURL: Any? = definedExternally /* null */, audioConfig: Any? = definedExternally /* null */, audioXhrSettings: XHRSettingsObject? = definedExternally /* null */, jsonXhrSettings: XHRSettingsObject? = definedExternally /* null */)
}
external interface BinaryFileConfig: Config {
    var key: String
    var url: String? get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
    var dataType: Any? get() = definedExternally; set(value) = definedExternally
}
open external class BinaryFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */, dataType: Any? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.BinaryFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */, dataType: Any? = definedExternally /* null */)
    override fun onProcess(): Unit = definedExternally
}
external interface BitmapFontFileConfig: Config {
    var key: String
    var textureURL: String? get() = definedExternally; set(value) = definedExternally
    var textureExtension: String? get() = definedExternally; set(value) = definedExternally
    var textureXhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
    var normalMap: String? get() = definedExternally; set(value) = definedExternally
    var fontDataURL: String? get() = definedExternally; set(value) = definedExternally
    var fontDataExtension: String? get() = definedExternally; set(value) = definedExternally
    var fontDataXhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class BitmapFontFile : org.decembrist.Phaser.Loader.MultiFile {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, textureURL: String? = definedExternally /* null */, fontDataURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, fontDataXhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, textureURL: Array<String>? = definedExternally /* null */, fontDataURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, fontDataXhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.BitmapFontFileConfig, textureURL: String? = definedExternally /* null */, fontDataURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, fontDataXhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.BitmapFontFileConfig, textureURL: Array<String>? = definedExternally /* null */, fontDataURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, fontDataXhrSettings: XHRSettingsObject? = definedExternally /* null */)
    override fun addToCache(): Unit = definedExternally
}
external interface GLSLFileConfig: Config {
    var key: String
    var url: String? get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class GLSLFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.TextFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    override fun onProcess(): Unit = definedExternally
}
open external class HTML5AudioFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, urlConfig: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.AudioFileConfig, urlConfig: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    open fun onLoad(): Unit = definedExternally
    open fun onError(): Unit = definedExternally
    open fun onProgress(): Unit = definedExternally
    override fun load(): Unit = definedExternally
}
external interface HTMLFileConfig: Config {
    var key: String
    var url: String? get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class HTMLFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.HTMLFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    override fun onProcess(): Unit = definedExternally
}
external interface HTMLTextureFileConfig: Config {
    var key: String
    var url: String? get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
}
open external class HTMLTextureFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: String? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.HTMLTextureFileConfig, url: String? = definedExternally /* null */, width: Number? = definedExternally /* null */, height: Number? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    override fun onProcess(): Unit = definedExternally
    override fun addToCache(): Unit = definedExternally
}
external interface ImageFrameConfig: Config {
    var frameWidth: Number
    var frameHeight: Number? get() = definedExternally; set(value) = definedExternally
    var startFrame: Number? get() = definedExternally; set(value) = definedExternally
    var endFrame: Number? get() = definedExternally; set(value) = definedExternally
    var margin: Number? get() = definedExternally; set(value) = definedExternally
    var spacing: Number? get() = definedExternally; set(value) = definedExternally
}
external interface ImageFileConfig: Config {
    var key: String
    var url: String? get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var normalMap: String? get() = definedExternally; set(value) = definedExternally
    var frameConfig: org.decembrist.Phaser.Loader.FileTypes.ImageFrameConfig? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class ImageFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */, frameConfig: org.decembrist.Phaser.Loader.FileTypes.ImageFrameConfig? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: Array<String>? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */, frameConfig: org.decembrist.Phaser.Loader.FileTypes.ImageFrameConfig? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.ImageFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */, frameConfig: org.decembrist.Phaser.Loader.FileTypes.ImageFrameConfig? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.ImageFileConfig, url: Array<String>? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */, frameConfig: org.decembrist.Phaser.Loader.FileTypes.ImageFrameConfig? = definedExternally /* null */)
    override fun onProcess(): Unit = definedExternally
    override fun addToCache(): Unit = definedExternally
}
external interface JSONFileConfig: Config {
    var key: String
    var url: dynamic /* String | Any */ get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var dataKey: String? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class JSONFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */, dataKey: String? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.JSONFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */, dataKey: String? = definedExternally /* null */)
    override fun onProcess(): Unit = definedExternally
}
external interface MultiAtlasFileConfig: Config {
    var key: String
    var atlasURL: String? get() = definedExternally; set(value) = definedExternally
    var atlasExtension: String? get() = definedExternally; set(value) = definedExternally
    var atlasXhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
    var path: String? get() = definedExternally; set(value) = definedExternally
    var baseURL: String? get() = definedExternally; set(value) = definedExternally
    var textureXhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class MultiAtlasFile(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, atlasURL: String? = definedExternally /* null */, path: String? = definedExternally /* null */, baseURL: String? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */) : org.decembrist.Phaser.Loader.MultiFile
external interface PackFileConfig {
    var key: String
    var url: dynamic /* String | Any */ get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var dataKey: String? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class PackFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */, dataKey: String? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.JSONFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */, dataKey: String? = definedExternally /* null */)
    override fun onProcess(): Unit = definedExternally
}
external interface PluginFileConfig: Config {
    var key: String
    var url: String? get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var start: Boolean? get() = definedExternally; set(value) = definedExternally
    var mapping: String? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class PluginFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: String? = definedExternally /* null */, start: Boolean? = definedExternally /* null */, mapping: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.PluginFileConfig, url: String? = definedExternally /* null */, start: Boolean? = definedExternally /* null */, mapping: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    override fun onProcess(): Unit = definedExternally
}
external interface ScenePluginFileConfig: Config {
    var key: String
    var url: dynamic /* String | Function<*> */ get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var systemKey: String? get() = definedExternally; set(value) = definedExternally
    var sceneKey: String? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class ScenePluginFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: String? = definedExternally /* null */, systemKey: String? = definedExternally /* null */, sceneKey: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.ScenePluginFileConfig, url: String? = definedExternally /* null */, systemKey: String? = definedExternally /* null */, sceneKey: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    override fun onProcess(): Unit = definedExternally
}
external interface ScriptFileConfig: Config {
    var key: String
    var url: String? get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class ScriptFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.ScriptFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    override fun onProcess(): Unit = definedExternally
}
external interface SpriteSheetFileConfig: Config {
    var key: String
    var url: String? get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var normalMap: String? get() = definedExternally; set(value) = definedExternally
    var frameConfig: org.decembrist.Phaser.Loader.FileTypes.ImageFrameConfig? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class SpriteSheetFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: String? = definedExternally /* null */, frameConfig: org.decembrist.Phaser.Loader.FileTypes.ImageFrameConfig? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: Array<String>? = definedExternally /* null */, frameConfig: org.decembrist.Phaser.Loader.FileTypes.ImageFrameConfig? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.SpriteSheetFileConfig, url: String? = definedExternally /* null */, frameConfig: org.decembrist.Phaser.Loader.FileTypes.ImageFrameConfig? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.SpriteSheetFileConfig, url: Array<String>? = definedExternally /* null */, frameConfig: org.decembrist.Phaser.Loader.FileTypes.ImageFrameConfig? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    override fun addToCache(): Unit = definedExternally
}
external interface SVGSizeConfig: Config {
    var width: Number? get() = definedExternally; set(value) = definedExternally
    var height: Number? get() = definedExternally; set(value) = definedExternally
    var scale: Number? get() = definedExternally; set(value) = definedExternally
}
external interface SVGFileConfig: Config {
    var key: String
    var url: String? get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
    var svgConfig: org.decembrist.Phaser.Loader.FileTypes.SVGSizeConfig? get() = definedExternally; set(value) = definedExternally
}
open external class SVGFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: String? = definedExternally /* null */, svgConfig: org.decembrist.Phaser.Loader.FileTypes.SVGSizeConfig? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.SVGFileConfig, url: String? = definedExternally /* null */, svgConfig: org.decembrist.Phaser.Loader.FileTypes.SVGSizeConfig? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    override fun onProcess(): Unit = definedExternally
    override fun addToCache(): Unit = definedExternally
}
external interface TextFileConfig: Config {
    var key: String
    var url: String? get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class TextFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.TextFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    override fun onProcess(): Unit = definedExternally
}
external interface TilemapCSVFileConfig: Config {
    var key: String
    var url: String? get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class TilemapCSVFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.TilemapCSVFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    override fun onProcess(): Unit = definedExternally
    override fun addToCache(): Unit = definedExternally
}
external interface TilemapImpactFileConfig: Config {
    var key: String
    var url: String? get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class TilemapImpactFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.TilemapImpactFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    override fun addToCache(): Unit = definedExternally
}
external interface TilemapJSONFileConfig: Config {
    var key: String
    var url: String? get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class TilemapJSONFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.TilemapJSONFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    override fun addToCache(): Unit = definedExternally
}
external interface UnityAtlasFileConfig: Config {
    var key: String
    var textureURL: String? get() = definedExternally; set(value) = definedExternally
    var textureExtension: String? get() = definedExternally; set(value) = definedExternally
    var textureXhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
    var normalMap: String? get() = definedExternally; set(value) = definedExternally
    var atlasURL: String? get() = definedExternally; set(value) = definedExternally
    var atlasExtension: String? get() = definedExternally; set(value) = definedExternally
    var atlasXhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class UnityAtlasFile : org.decembrist.Phaser.Loader.MultiFile {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, textureURL: String? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, textureURL: Array<String>? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.UnityAtlasFileConfig, textureURL: String? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.UnityAtlasFileConfig, textureURL: Array<String>? = definedExternally /* null */, atlasURL: String? = definedExternally /* null */, textureXhrSettings: XHRSettingsObject? = definedExternally /* null */, atlasXhrSettings: XHRSettingsObject? = definedExternally /* null */)
    override fun addToCache(): Unit = definedExternally
}
external interface XMLFileConfig: Config {
    var key: String
    var url: String? get() = definedExternally; set(value) = definedExternally
    var extension: String? get() = definedExternally; set(value) = definedExternally
    var xhrSettings: XHRSettingsObject? get() = definedExternally; set(value) = definedExternally
}
open external class XMLFile : org.decembrist.Phaser.Loader.File {
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: String, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    constructor(loader: org.decembrist.Phaser.Loader.LoaderPlugin, key: org.decembrist.Phaser.Loader.FileTypes.XMLFileConfig, url: String? = definedExternally /* null */, xhrSettings: XHRSettingsObject? = definedExternally /* null */)
    override fun onProcess(): Unit = definedExternally
}
