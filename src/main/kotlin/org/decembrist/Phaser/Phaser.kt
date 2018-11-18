@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "EXTERNAL_DELEGATION",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE"
)

package org.decembrist.Phaser

import org.decembrist.Phaser.Scenes.Settings.Config
import org.decembrist.utils.*
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLDivElement
import org.decembrist.Phaser.Boot.Config as BootConfig

@JsModule("phaser")
@JsNonModule
external object Phaser {

    open class Game(GameConfig: GameConfig? = definedExternally /* null */) {
        open var config: BootConfig = definedExternally
        open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */ =
            definedExternally
        open var domContainer: HTMLDivElement = definedExternally
        open var canvas: HTMLCanvasElement = definedExternally
        open var context: dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */ = definedExternally
        open var isBooted: Boolean = definedExternally
        open var isRunning: Boolean = definedExternally
        open var events: org.decembrist.Phaser.Events.EventEmitter = definedExternally
        open var anims: org.decembrist.Phaser.Animations.AnimationManager = definedExternally
        open var textures: org.decembrist.Phaser.Textures.TextureManager = definedExternally
        open var cache: org.decembrist.Phaser.Cache.CacheManager = definedExternally
        open var registry: org.decembrist.Phaser.Data.DataManager = definedExternally
        open var input: org.decembrist.Phaser.Input.InputManager = definedExternally
        open var scene: org.decembrist.Phaser.Scenes.SceneManager = definedExternally
        open var device: DeviceConf = definedExternally
        open var scaleManager: org.decembrist.Phaser.Boot.ScaleManager = definedExternally
        open var sound: org.decembrist.Phaser.Sound.BaseSoundManager = definedExternally
        open var loop: org.decembrist.Phaser.Boot.TimeStep = definedExternally
        open var plugins: org.decembrist.Phaser.Plugins.PluginManager = definedExternally
        open var facebook: FacebookInstantGamesPlugin = definedExternally
        open var hasFocus: Boolean = definedExternally
        open var isOver: Boolean = definedExternally
        open fun boot(): Unit = definedExternally
        open fun start(): Unit = definedExternally
        open fun step(time: Number, delta: Number): Unit = definedExternally
        open fun headlessStep(time: Number, delta: Number): Unit = definedExternally
        open fun onHidden(): Unit = definedExternally
        open fun onVisible(): Unit = definedExternally
        open fun onBlur(): Unit = definedExternally
        open fun onFocus(): Unit = definedExternally
        open fun resize(width: Number, height: Number): Unit = definedExternally
        open fun destroy(removeCanvas: Boolean, noReturn: Boolean? = definedExternally /* null */): Unit =
            definedExternally
    }

    var VERSION: String = definedExternally
    var AUTO: Number = definedExternally
    var CANVAS: Number = definedExternally
    var WEBGL: Number = definedExternally
    var HEADLESS: Number = definedExternally
    var FOREVER: Number = definedExternally
    var NONE: Number = definedExternally
    var UP: Number = definedExternally
    var DOWN: Number = definedExternally
    var LEFT: Number = definedExternally
    var RIGHT: Number = definedExternally

    interface DeviceConf {
        var os: org.decembrist.Phaser.Device.OS
        var browser: org.decembrist.Phaser.Device.Browser
        var features: org.decembrist.Phaser.Device.Features
        var input: org.decembrist.Phaser.Device.Input
        var audio: org.decembrist.Phaser.Device.Audio
        var video: org.decembrist.Phaser.Device.Video
        var fullscreen: org.decembrist.Phaser.Device.Fullscreen
        var canvasFeatures: org.decembrist.Phaser.Device.CanvasFeatures
    }

    enum class CSSBlendModes
    enum class BlendModes {
        SKIP_CHECK,
        NORMAL,
        ADD,
        MULTIPLY,
        SCREEN,
        OVERLAY,
        DARKEN,
        LIGHTEN,
        COLOR_DODGE,
        COLOR_BURN,
        HARD_LIGHT,
        SOFT_LIGHT,
        DIFFERENCE,
        EXCLUSION,
        HUE,
        SATURATION,
        COLOR,
        LUMINOSITY
    }

    enum class ScaleModes {
        DEFAULT,
        LINEAR,
        NEAREST
    }

    open class Scene(config: String) {
        constructor(config: Config)

        open var sys: org.decembrist.Phaser.Scenes.Systems
        open var game: Game
        open var anims: org.decembrist.Phaser.Animations.AnimationManager
        open var cache: org.decembrist.Phaser.Cache.CacheManager
        open var registry: org.decembrist.Phaser.Data.DataManager
        open var sound: org.decembrist.Phaser.Sound.BaseSoundManager
        open var textures: org.decembrist.Phaser.Textures.TextureManager
        open var events: org.decembrist.Phaser.Events.EventEmitter
        open var cameras: org.decembrist.Phaser.Cameras.Scene2D.CameraManager
        open var add: org.decembrist.Phaser.GameObjects.GameObjectFactory
        open var make: org.decembrist.Phaser.GameObjects.GameObjectCreator
        open var scene: org.decembrist.Phaser.Scenes.ScenePlugin
        open var children: org.decembrist.Phaser.GameObjects.DisplayList
        open var lights: org.decembrist.Phaser.GameObjects.LightsManager
        open var data: org.decembrist.Phaser.Data.DataManager
        open var input: org.decembrist.Phaser.Input.InputPlugin
        open var load: org.decembrist.Phaser.Loader.LoaderPlugin
        open var time: org.decembrist.Phaser.Time.Clock
        open var tweens: org.decembrist.Phaser.Tweens.TweenManager
        open var physics: org.decembrist.Phaser.Physics.Arcade.ArcadePhysics
        open var impact: org.decembrist.Phaser.Physics.Impact.ImpactPhysics
        open var matter: org.decembrist.Phaser.Physics.Matter.MatterPhysics
        open fun update(time: Number = definedExternally, delta: Number = definedExternally): Unit = definedExternally
        open fun init(data: Any): Unit = definedExternally
        open fun create(data: Any): Unit = definedExternally
        open fun preload(): Unit = definedExternally
    }

    open class FacebookInstantGamesPlugin(game: Game) : org.decembrist.Phaser.Events.EventEmitter {
        open var game: Game = definedExternally
        open var data: org.decembrist.Phaser.Data.DataManager = definedExternally
        open var hasLoaded: Boolean = definedExternally
        open var dataLocked: Boolean = definedExternally
        open var supportedAPIs: Array<String> = definedExternally
        open var entryPoint: String = definedExternally
        open var entryPointData: Any = definedExternally
        open var contextID: String = definedExternally
        open var contextType: String = definedExternally
        open var locale: String = definedExternally
        open var platform: String = definedExternally
        open var version: String = definedExternally
        open var playerID: String = definedExternally
        open var playerName: String = definedExternally
        open var playerPhotoURL: String = definedExternally
        open var playerCanSubscribeBot: Boolean = definedExternally
        open var paymentsReady: Boolean = definedExternally
        open var catalog: Array<Product> = definedExternally
        open var purchases: Array<Purchase> = definedExternally
        open var leaderboards: Array<FacebookInstantGamesPlugin.Leaderboard> = definedExternally
        open var ads: Array<AdInstance> = definedExternally
        open fun showLoadProgress(scene: Scene): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun gameStarted(): Unit = definedExternally
        open fun checkAPI(api: String): Boolean = definedExternally
        open fun getID(): String = definedExternally
        open fun getType(): String = definedExternally
        open fun getLocale(): String = definedExternally
        open fun getPlatform(): String = definedExternally
        open fun getSDKVersion(): String = definedExternally
        open fun getPlayerID(): String = definedExternally
        open fun getPlayerName(): String = definedExternally
        open fun getPlayerPhotoURL(): String = definedExternally
        open fun loadPlayerPhoto(scene: Scene, key: String): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun canSubscribeBot(): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun subscribeBot(): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun getData(keys: String): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun getData(keys: Array<String>): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun saveData(data: Any): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun flushData(): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun getStats(keys: Array<String>? = definedExternally /* null */): FacebookInstantGamesPlugin /* this */ =
            definedExternally

        open fun saveStats(data: Any): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun incStats(data: Any): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun saveSession(data: Any): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun openShare(
            text: String,
            key: String,
            frame: String? = definedExternally /* null */,
            sessionData: Any? = definedExternally /* null */
        ): FacebookInstantGamesPlugin /* this */ = definedExternally

        open fun openInvite(
            text: String,
            key: String,
            frame: String? = definedExternally /* null */,
            sessionData: Any? = definedExternally /* null */
        ): FacebookInstantGamesPlugin /* this */ = definedExternally

        open fun openRequest(
            text: String,
            key: String,
            frame: String? = definedExternally /* null */,
            sessionData: Any? = definedExternally /* null */
        ): FacebookInstantGamesPlugin /* this */ = definedExternally

        open fun openChallenge(
            text: String,
            key: String,
            frame: String? = definedExternally /* null */,
            sessionData: Any? = definedExternally /* null */
        ): FacebookInstantGamesPlugin /* this */ = definedExternally

        open fun isSizeBetween(
            min: Number? = definedExternally /* null */,
            max: Number? = definedExternally /* null */
        ): Any = definedExternally

        open fun switchContext(contextID: String): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun chooseContext(contextID: String): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun createContext(playerID: String): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun getPlayers(): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun getCatalog(): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun purchase(
            productID: String,
            developerPayload: String? = definedExternally /* null */
        ): FacebookInstantGamesPlugin /* this */ = definedExternally

        open fun getPurchases(): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun consumePurchases(purchaseToken: String): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun update(
            cta: String,
            text: Any,
            key: String,
            frame: String? = definedExternally /* null */,
            template: String? = definedExternally /* null */,
            updateData: Any? = definedExternally /* null */
        ): FacebookInstantGamesPlugin /* this */ = definedExternally

        open fun update(
            cta: String,
            text: Any,
            key: String,
            frame: Number? = definedExternally /* null */,
            template: String? = definedExternally /* null */,
            updateData: Any? = definedExternally /* null */
        ): FacebookInstantGamesPlugin /* this */ = definedExternally

        open fun updateLeaderboard(
            cta: String,
            text: Any,
            key: String,
            frame: String? = definedExternally /* null */,
            template: String? = definedExternally /* null */,
            updateData: Any? = definedExternally /* null */
        ): FacebookInstantGamesPlugin /* this */ = definedExternally

        open fun updateLeaderboard(
            cta: String,
            text: Any,
            key: String,
            frame: Number? = definedExternally /* null */,
            template: String? = definedExternally /* null */,
            updateData: Any? = definedExternally /* null */
        ): FacebookInstantGamesPlugin /* this */ = definedExternally

        open fun switchGame(
            appID: String,
            data: Any? = definedExternally /* null */
        ): FacebookInstantGamesPlugin /* this */ = definedExternally

        open fun createShortcut(): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun quit(): Unit = definedExternally
        open fun log(
            name: String,
            value: Number? = definedExternally /* null */,
            params: Any? = definedExternally /* null */
        ): FacebookInstantGamesPlugin /* this */ = definedExternally

        open fun preloadAds(placementID: String): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun preloadAds(placementID: Array<String>): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun preloadVideoAds(placementID: String): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun preloadVideoAds(placementID: Array<String>): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun showAd(placementID: String): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun showVideo(placementID: String): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun matchPlayer(
            matchTag: String? = definedExternally /* null */,
            switchImmediately: Boolean? = definedExternally /* null */
        ): FacebookInstantGamesPlugin /* this */ = definedExternally

        open fun getLeaderboard(name: String): FacebookInstantGamesPlugin /* this */ = definedExternally
        override fun destroy(): Unit = definedExternally
        open class Leaderboard(plugin: FacebookInstantGamesPlugin, data: Any) {
            open var plugin: FacebookInstantGamesPlugin = definedExternally
            open var ref: Any = definedExternally
            open var name: String = definedExternally
            open var contextID: String = definedExternally
            open var entryCount: Number = definedExternally
            open var playerScore: LeaderboardScore = definedExternally
            open var scores: Array<LeaderboardScore> = definedExternally
            open fun getEntryCount(): Leaderboard /* this */ = definedExternally
            open fun setScore(score: Number, data: String? = definedExternally /* null */): Leaderboard /* this */ =
                definedExternally

            open fun getPlayerScore(): Leaderboard /* this */ = definedExternally
            open fun getScores(
                count: Number? = definedExternally /* null */,
                offset: Number? = definedExternally /* null */
            ): Leaderboard /* this */ = definedExternally
        }

        open fun update(cta: String, text: Any, key: String): FacebookInstantGamesPlugin /* this */ = definedExternally
        open fun updateLeaderboard(cta: String, text: Any, key: String): FacebookInstantGamesPlugin /* this */ =
            definedExternally
    }
}
