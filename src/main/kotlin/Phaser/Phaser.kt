@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "EXTERNAL_DELEGATION",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE"
)
@file:[JsModule("phaser") JsNonModule]

package Phaser

import AdInstance
import GameConfig
import LeaderboardScore
import Product
import Purchase
import org.w3c.dom.HTMLCanvasElement
import org.w3c.dom.HTMLDivElement

open external class Game(GameConfig: GameConfig? = definedExternally /* null */) {
    open var config: Phaser.Boot.Config = definedExternally
    open var renderer: dynamic /* Phaser.Renderer.Canvas.CanvasRenderer | Phaser.Renderer.WebGL.WebGLRenderer */ =
        definedExternally
    open var domContainer: HTMLDivElement = definedExternally
    open var canvas: HTMLCanvasElement = definedExternally
    open var context: dynamic /* CanvasRenderingContext2D | WebGLRenderingContext */ = definedExternally
    open var isBooted: Boolean = definedExternally
    open var isRunning: Boolean = definedExternally
    open var events: Phaser.Events.EventEmitter = definedExternally
    open var anims: Phaser.Animations.AnimationManager = definedExternally
    open var textures: Phaser.Textures.TextureManager = definedExternally
    open var cache: Phaser.Cache.CacheManager = definedExternally
    open var registry: Phaser.Data.DataManager = definedExternally
    open var input: Phaser.Input.InputManager = definedExternally
    open var scene: Phaser.Scenes.SceneManager = definedExternally
    open var device: Phaser.DeviceConf = definedExternally
    open var scaleManager: Phaser.Boot.ScaleManager = definedExternally
    open var sound: Phaser.Sound.BaseSoundManager = definedExternally
    open var loop: Phaser.Boot.TimeStep = definedExternally
    open var plugins: Phaser.Plugins.PluginManager = definedExternally
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
    open fun destroy(removeCanvas: Boolean, noReturn: Boolean? = definedExternally /* null */): Unit = definedExternally
}

external var VERSION: String = definedExternally
external var AUTO: Number = definedExternally
external var CANVAS: Number = definedExternally
external var WEBGL: Number = definedExternally
external var HEADLESS: Number = definedExternally
external var FOREVER: Number = definedExternally
external var NONE: Number = definedExternally
external var UP: Number = definedExternally
external var DOWN: Number = definedExternally
external var LEFT: Number = definedExternally
external var RIGHT: Number = definedExternally

external interface DeviceConf {
    var os: Phaser.Device.OS
    var browser: Phaser.Device.Browser
    var features: Phaser.Device.Features
    var input: Phaser.Device.Input
    var audio: Phaser.Device.Audio
    var video: Phaser.Device.Video
    var fullscreen: Phaser.Device.Fullscreen
    var canvasFeatures: Phaser.Device.CanvasFeatures
}

external enum class CSSBlendModes
external enum class BlendModes {
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

external enum class ScaleModes {
    DEFAULT,
    LINEAR,
    NEAREST
}

open external class Scene {
    constructor(config: String)
    constructor(config: Phaser.Scenes.Settings.Config)

    open var sys: Phaser.Scenes.Systems
    open var game: Game
    open var anims: Phaser.Animations.AnimationManager
    open var cache: Phaser.Cache.CacheManager
    open var registry: Phaser.Data.DataManager
    open var sound: Phaser.Sound.BaseSoundManager
    open var textures: Phaser.Textures.TextureManager
    open var events: Phaser.Events.EventEmitter
    open var cameras: Phaser.Cameras.Scene2D.CameraManager
    open var add: Phaser.GameObjects.GameObjectFactory
    open var make: Phaser.GameObjects.GameObjectCreator
    open var scene: Phaser.Scenes.ScenePlugin
    open var children: Phaser.GameObjects.DisplayList
    open var lights: Phaser.GameObjects.LightsManager
    open var data: Phaser.Data.DataManager
    open var input: Phaser.Input.InputPlugin
    open var load: Phaser.Loader.LoaderPlugin
    open var time: Phaser.Time.Clock
    open var tweens: Phaser.Tweens.TweenManager
    open var physics: Phaser.Physics.Arcade.ArcadePhysics
    open var impact: Phaser.Physics.Impact.ImpactPhysics
    open var matter: Phaser.Physics.Matter.MatterPhysics
    open fun update(time: Number = definedExternally, delta: Number = definedExternally): Unit = definedExternally
    open fun create(): Unit = definedExternally
    open fun preload(): Unit = definedExternally
}

open external class FacebookInstantGamesPlugin(game: Game) : Phaser.Events.EventEmitter {
    open var game: Game = definedExternally
    open var data: Phaser.Data.DataManager = definedExternally
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
