@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Plugins") JsNonModule]
package org.decembrist.Phaser.Plugins

import org.decembrist.Phaser.Phaser
import org.decembrist.utils.GlobalPlugin

open external class BasePlugin(pluginManager: PluginManager) {
    open var pluginManager: PluginManager = definedExternally
    open var game: Phaser.Game = definedExternally
    open var scene: Phaser.Scene = definedExternally
    open var systems: org.decembrist.Phaser.Scenes.Systems = definedExternally
    open fun init(data: Any? = definedExternally /* null */): Unit = definedExternally
    open fun start(): Unit = definedExternally
    open fun stop(): Unit = definedExternally
    open fun boot(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
external interface DefaultPlugins {
    var Global: Array<Any>
    var CoreScene: Array<Any>
    var DefaultScene: Array<Any>
}
external var Global: Array<Any> = definedExternally
external var CoreScene: Array<Any> = definedExternally
external var DefaultScene: Array<Any> = definedExternally
open external class PluginManager(game: Phaser.Game) {
    open var game: Phaser.Game = definedExternally
    open var plugins: Array<GlobalPlugin> = definedExternally
    open var scenePlugins: Array<String> = definedExternally
    open fun boot(): Unit = definedExternally
    open fun addToScene(sys: org.decembrist.Phaser.Scenes.Systems, globalPlugins: Array<Any>, scenePlugins: Array<Any>): Unit = definedExternally
    open fun getDefaultScenePlugins(): Array<String> = definedExternally
    open fun installScenePlugin(key: String, plugin: Function<*>, mapping: String? = definedExternally /* null */, addToScene: Phaser.Scene? = definedExternally /* null */): Unit = definedExternally
    open fun install(key: String, plugin: Function<*>, start: Boolean? = definedExternally /* null */, mapping: String? = definedExternally /* null */, data: Any? = definedExternally /* null */): Unit = definedExternally
    open fun getIndex(key: String): Number = definedExternally
    open fun getEntry(key: String): GlobalPlugin = definedExternally
    open fun isActive(key: String): Boolean = definedExternally
    open fun start(key: String, runAs: String? = definedExternally /* null */): BasePlugin = definedExternally
    open fun stop(key: String): PluginManager = definedExternally
    open fun get(key: String, autoStart: Boolean? = definedExternally /* null */): dynamic /* Function<*> | BasePlugin */ = definedExternally
    open fun getClass(key: String): BasePlugin = definedExternally
    open fun removeGlobalPlugin(key: String): Unit = definedExternally
    open fun removeScenePlugin(key: String): Unit = definedExternally
    open fun registerGameObject(key: String, factoryCallback: Function<*>? = definedExternally /* null */, creatorCallback: Function<*>? = definedExternally /* null */): Unit = definedExternally
    open fun registerFileType(key: String, callback: Function<*>, addToScene: Phaser.Scene? = definedExternally /* null */): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
open external class ScenePlugin(scene: Phaser.Scene, pluginManager: PluginManager) : BasePlugin {
    override fun boot(): Unit = definedExternally
}
