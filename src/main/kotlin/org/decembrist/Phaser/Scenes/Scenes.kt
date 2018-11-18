@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Scenes")]
package org.decembrist.Phaser.Scenes

import org.decembrist.Phaser.Phaser
import org.w3c.dom.CanvasRenderingContext2D
import org.w3c.dom.HTMLCanvasElement

external var PENDING: Number = definedExternally
external var INIT: Number = definedExternally
external var START: Number = definedExternally
external var LOADING: Number = definedExternally
external var CREATING: Number = definedExternally
external var RUNNING: Number = definedExternally
external var PAUSED: Number = definedExternally
external var SLEEPING: Number = definedExternally
external var SHUTDOWN: Number = definedExternally
external var DESTROYED: Number = definedExternally
external fun GetPhysicsPlugins(sys: Systems): Array<Any> = definedExternally
external fun GetScenePlugins(sys: Systems): Array<Any> = definedExternally
open external class SceneManager(game: Phaser.Game, sceneConfig: Any) {
    open var game: Phaser.Game = definedExternally
    open var keys: Any = definedExternally
    open var scenes: Array<Any> = definedExternally
    open var isProcessing: Boolean = definedExternally
    open var isBooted: Boolean = definedExternally
    open var customViewports: Number = definedExternally
    open fun processQueue(): Unit = definedExternally
    open fun add(key: String, sceneConfig: Function<*>, autoStart: Boolean? = definedExternally /* null */, data: Any? = definedExternally /* null */): Phaser.Scene = definedExternally
    open fun add(key: String, sceneConfig: Phaser.Scene, autoStart: Boolean? = definedExternally /* null */, data: Any? = definedExternally /* null */): Phaser.Scene = definedExternally
    open fun add(key: String, sceneConfig: org.decembrist.Phaser.Scenes.Settings.Config, autoStart: Boolean? = definedExternally /* null */, data: Any? = definedExternally /* null */): Phaser.Scene = definedExternally
    open fun remove(scene: String): SceneManager = definedExternally
    open fun remove(scene: Phaser.Scene): SceneManager = definedExternally
    open fun update(time: Number, delta: Number): Unit = definedExternally
    open fun resize(width: Number, height: Number): Unit = definedExternally
    open fun render(renderer: org.decembrist.Phaser.Renderer.Canvas.CanvasRenderer): Unit = definedExternally
    open fun render(renderer: org.decembrist.Phaser.Renderer.WebGL.WebGLRenderer): Unit = definedExternally
    open fun getScene(key: String): Phaser.Scene = definedExternally
    open fun getScene(key: Phaser.Scene): Phaser.Scene = definedExternally
    open fun isActive(key: String): Boolean = definedExternally
    open fun isVisible(key: String): Boolean = definedExternally
    open fun isSleeping(key: String): Boolean = definedExternally
    open fun pause(key: String, data: Any? = definedExternally /* null */): SceneManager = definedExternally
    open fun resume(key: String, data: Any? = definedExternally /* null */): SceneManager = definedExternally
    open fun sleep(key: String, data: Any? = definedExternally /* null */): SceneManager = definedExternally
    open fun wake(key: String, data: Any? = definedExternally /* null */): SceneManager = definedExternally
    open fun run(key: String, data: Any? = definedExternally /* null */): SceneManager = definedExternally
    open fun start(key: String, data: Any? = definedExternally /* null */): SceneManager = definedExternally
    open fun stop(key: String): SceneManager = definedExternally
    open fun switch(from: String, to: String): SceneManager = definedExternally
    open fun getAt(index: Number): Phaser.Scene? = definedExternally
    open fun getIndex(key: String): Number = definedExternally
    open fun getIndex(key: Phaser.Scene): Number = definedExternally
    open fun bringToTop(key: String): SceneManager = definedExternally
    open fun bringToTop(key: Phaser.Scene): SceneManager = definedExternally
    open fun sendToBack(key: String): SceneManager = definedExternally
    open fun sendToBack(key: Phaser.Scene): SceneManager = definedExternally
    open fun moveDown(key: String): SceneManager = definedExternally
    open fun moveDown(key: Phaser.Scene): SceneManager = definedExternally
    open fun moveUp(key: String): SceneManager = definedExternally
    open fun moveUp(key: Phaser.Scene): SceneManager = definedExternally
    open fun moveAbove(keyA: String, keyB: String): SceneManager = definedExternally
    open fun moveAbove(keyA: String, keyB: Phaser.Scene): SceneManager = definedExternally
    open fun moveAbove(keyA: Phaser.Scene, keyB: String): SceneManager = definedExternally
    open fun moveAbove(keyA: Phaser.Scene, keyB: Phaser.Scene): SceneManager = definedExternally
    open fun moveBelow(keyA: String, keyB: String): SceneManager = definedExternally
    open fun moveBelow(keyA: String, keyB: Phaser.Scene): SceneManager = definedExternally
    open fun moveBelow(keyA: Phaser.Scene, keyB: String): SceneManager = definedExternally
    open fun moveBelow(keyA: Phaser.Scene, keyB: Phaser.Scene): SceneManager = definedExternally
    open fun swapPosition(keyA: String, keyB: String): SceneManager = definedExternally
    open fun swapPosition(keyA: String, keyB: Phaser.Scene): SceneManager = definedExternally
    open fun swapPosition(keyA: Phaser.Scene, keyB: String): SceneManager = definedExternally
    open fun swapPosition(keyA: Phaser.Scene, keyB: Phaser.Scene): SceneManager = definedExternally
    open fun dump(): Unit = definedExternally
    open fun destroy(): Unit = definedExternally
}
open external class ScenePlugin(scene: Phaser.Scene) {
    open var scene: Phaser.Scene = definedExternally
    open var systems: Systems = definedExternally
    open var settings: org.decembrist.Phaser.Scenes.Settings.Object = definedExternally
    open var key: String = definedExternally
    open var manager: SceneManager = definedExternally
    open var transitionProgress: Number = definedExternally
    open fun start(key: String? = definedExternally /* null */, data: Any? = definedExternally /* null */): ScenePlugin = definedExternally
    open fun restart(data: Any? = definedExternally /* null */): ScenePlugin = definedExternally
    open fun transition(config: org.decembrist.Phaser.Scenes.ScenePlugin.SceneTransitionConfig): Boolean = definedExternally
    open fun add(key: String, sceneConfig: Function<*>, autoStart: Boolean): ScenePlugin = definedExternally
    open fun add(key: String, sceneConfig: Phaser.Scene, autoStart: Boolean): ScenePlugin = definedExternally
    open fun add(key: String, sceneConfig: org.decembrist.Phaser.Scenes.Settings.Config, autoStart: Boolean): ScenePlugin = definedExternally
    open fun launch(key: String, data: Any? = definedExternally /* null */): ScenePlugin = definedExternally
    open fun run(key: String, data: Any? = definedExternally /* null */): ScenePlugin = definedExternally
    open fun pause(key: String? = definedExternally /* null */, data: Any? = definedExternally /* null */): ScenePlugin = definedExternally
    open fun resume(key: String? = definedExternally /* null */, data: Any? = definedExternally /* null */): ScenePlugin = definedExternally
    open fun sleep(key: String? = definedExternally /* null */, data: Any? = definedExternally /* null */): ScenePlugin = definedExternally
    open fun wake(key: String? = definedExternally /* null */, data: Any? = definedExternally /* null */): ScenePlugin = definedExternally
    open fun switch(key: String): ScenePlugin = definedExternally
    open fun stop(key: String): ScenePlugin = definedExternally
    open fun setActive(value: Boolean, key: String? = definedExternally /* null */, data: Any? = definedExternally /* null */): ScenePlugin = definedExternally
    open fun setVisible(value: Boolean, key: String? = definedExternally /* null */): ScenePlugin = definedExternally
    open fun isSleeping(key: String): Boolean = definedExternally
    open fun isActive(key: String): Boolean = definedExternally
    open fun isVisible(key: String): Boolean = definedExternally
    open fun swapPosition(keyA: String, keyB: String? = definedExternally /* null */): ScenePlugin = definedExternally
    open fun moveAbove(keyA: String, keyB: String? = definedExternally /* null */): ScenePlugin = definedExternally
    open fun moveBelow(keyA: String, keyB: String? = definedExternally /* null */): ScenePlugin = definedExternally
    open fun remove(key: String): SceneManager = definedExternally
    open fun remove(key: Phaser.Scene): SceneManager = definedExternally
    open fun moveUp(key: String): ScenePlugin = definedExternally
    open fun moveDown(key: String): ScenePlugin = definedExternally
    open fun bringToTop(key: String): ScenePlugin = definedExternally
    open fun sendToBack(key: String): ScenePlugin = definedExternally
    open fun get(key: String): Phaser.Scene = definedExternally
    open fun getIndex(key: String? = definedExternally /* null */): Number = definedExternally
    open fun getIndex(key: Phaser.Scene? = definedExternally /* null */): Number = definedExternally
    interface SceneTransitionConfig {
        var target: String
        var duration: Number? get() = definedExternally; set(value) = definedExternally
        var sleep: Boolean? get() = definedExternally; set(value) = definedExternally
        var allowInput: Boolean? get() = definedExternally; set(value) = definedExternally
        var moveAbove: Boolean? get() = definedExternally; set(value) = definedExternally
        var moveBelow: Boolean? get() = definedExternally; set(value) = definedExternally
        var onUpdate: Function<*>? get() = definedExternally; set(value) = definedExternally
        var onUpdateScope: Any? get() = definedExternally; set(value) = definedExternally
        var data: Any? get() = definedExternally; set(value) = definedExternally
    }
    open fun getIndex(): Number = definedExternally
}
open external class Systems {
    constructor(scene: Phaser.Scene, config: String)
    constructor(scene: Phaser.Scene, config: org.decembrist.Phaser.Scenes.Settings.Config)
    open var scene: Phaser.Scene
    open var game: Phaser.Game
    open var facebook: Any
    open var config: dynamic /* String | Phaser.Scenes.Settings.Config */
    open var settings: org.decembrist.Phaser.Scenes.Settings.Object
    open var canvas: HTMLCanvasElement
    open var context: CanvasRenderingContext2D
    open var anims: org.decembrist.Phaser.Animations.AnimationManager
    open var cache: org.decembrist.Phaser.Cache.CacheManager
    open var plugins: org.decembrist.Phaser.Plugins.PluginManager
    open var registry: org.decembrist.Phaser.Data.DataManager
    open var sound: org.decembrist.Phaser.Sound.BaseSoundManager
    open var textures: org.decembrist.Phaser.Textures.TextureManager
    open var add: org.decembrist.Phaser.GameObjects.GameObjectFactory
    open var cameras: org.decembrist.Phaser.Cameras.Scene2D.CameraManager
    open var displayList: org.decembrist.Phaser.GameObjects.DisplayList
    open var events: org.decembrist.Phaser.Events.EventEmitter
    open var make: org.decembrist.Phaser.GameObjects.GameObjectCreator
    open var scenePlugin: ScenePlugin
    open var updateList: org.decembrist.Phaser.GameObjects.UpdateList
    open fun init(game: Phaser.Game): Unit = definedExternally
    open fun step(time: Number, delta: Number): Unit = definedExternally
    open fun render(renderer: org.decembrist.Phaser.Renderer.Canvas.CanvasRenderer): Unit = definedExternally
    open fun render(renderer: org.decembrist.Phaser.Renderer.WebGL.WebGLRenderer): Unit = definedExternally
    open fun queueDepthSort(): Unit = definedExternally
    open fun depthSort(): Unit = definedExternally
    open fun pause(data: Any? = definedExternally /* null */): Systems = definedExternally
    open fun resume(data: Any? = definedExternally /* null */): Systems = definedExternally
    open fun sleep(data: Any? = definedExternally /* null */): Systems = definedExternally
    open fun wake(data: Any? = definedExternally /* null */): Systems = definedExternally
    open fun isSleeping(): Boolean = definedExternally
    open fun isActive(): Boolean = definedExternally
    open fun isPaused(): Boolean = definedExternally
    open fun isTransitioning(): Boolean = definedExternally
    open fun isTransitionOut(): Boolean = definedExternally
    open fun isTransitionIn(): Boolean = definedExternally
    open fun isVisible(): Boolean = definedExternally
    open fun setVisible(value: Boolean): Systems = definedExternally
    open fun setActive(value: Boolean, data: Any? = definedExternally /* null */): Systems = definedExternally
    open fun start(data: Any): Unit = definedExternally
    open fun resize(width: Number, height: Number): Unit = definedExternally
    open fun shutdown(data: Any? = definedExternally /* null */): Unit = definedExternally
}
