@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Sound") JsNonModule]
package org.decembrist.Phaser.Sound

import org.decembrist.Phaser.Phaser
import org.decembrist.utils.SoundConfig
import org.decembrist.utils.SoundMarker

external interface `T$9` {
    operator fun get(key: String): SoundMarker?
    operator fun set(key: String, value: SoundMarker)
}
open external class BaseSound(manager: BaseSoundManager, key: String, config: SoundConfig? = definedExternally /* null */) : org.decembrist.Phaser.Events.EventEmitter {
    open var key: String = definedExternally
    open var isPlaying: Boolean = definedExternally
    open var isPaused: Boolean = definedExternally
    open var totalRate: Number = definedExternally
    open var duration: Number = definedExternally
    open var totalDuration: Number = definedExternally
    open var markers: `T$9` = definedExternally
    open var currentMarker: SoundMarker = definedExternally
    open fun addMarker(marker: SoundMarker): Boolean = definedExternally
    open fun updateMarker(marker: SoundMarker): Boolean = definedExternally
    open fun removeMarker(markerName: String): SoundMarker = definedExternally
    open fun play(markerName: String? = definedExternally /* null */, config: SoundConfig? = definedExternally /* null */): Boolean = definedExternally
    open fun pause(): Boolean = definedExternally
    open fun resume(): Boolean = definedExternally
    open fun stop(): Boolean = definedExternally
    open fun applyConfig(): Unit = definedExternally
    open fun resetConfig(): Unit = definedExternally
    open fun update(time: Number, delta: Number): Unit = definedExternally
    open fun calculateRate(): Unit = definedExternally
    override fun destroy(): Unit = definedExternally
}
open external class BaseSoundManager(game: Phaser.Game) : org.decembrist.Phaser.Events.EventEmitter {
    open var game: Phaser.Game = definedExternally
    open var jsonCache: org.decembrist.Phaser.Cache.BaseCache = definedExternally
    open var mute: Boolean = definedExternally
    open var volume: Number = definedExternally
    open var pauseOnBlur: Boolean = definedExternally
    open var locked: Boolean = definedExternally
    open fun add(key: String, config: SoundConfig? = definedExternally /* null */): BaseSound = definedExternally
    open fun addAudioSprite(key: String, config: SoundConfig? = definedExternally /* null */): () -> Unit = definedExternally
    open fun play(key: String, extra: SoundConfig? = definedExternally /* null */): Boolean = definedExternally
    open fun play(key: String, extra: SoundMarker? = definedExternally /* null */): Boolean = definedExternally
    open fun playAudioSprite(key: String, spriteName: String, config: SoundConfig? = definedExternally /* null */): Boolean = definedExternally
    open fun remove(sound: BaseSound): Boolean = definedExternally
    open fun removeByKey(key: String): Number = definedExternally
    open fun pauseAll(): Unit = definedExternally
    open fun resumeAll(): Unit = definedExternally
    open fun stopAll(): Unit = definedExternally
    open fun unlock(): Unit = definedExternally
    open fun onBlur(): Unit = definedExternally
    open fun onFocus(): Unit = definedExternally
    open fun update(time: Number, delta: Number): Unit = definedExternally
    override fun destroy(): Unit = definedExternally
    open fun setRate(value: Number): BaseSoundManager = definedExternally
    open var rate: Number = definedExternally
    open fun setDetune(value: Number): BaseSoundManager = definedExternally
    open var detune: Number = definedExternally
    open fun play(key: String): Boolean = definedExternally
}
open external class HTML5AudioSound(manager: HTML5AudioSoundManager, key: String, config: SoundConfig? = definedExternally /* null */) : BaseSound {
    override fun play(markerName: String?, config: SoundConfig?): Boolean = definedExternally
    override fun pause(): Boolean = definedExternally
    override fun resume(): Boolean = definedExternally
    override fun stop(): Boolean = definedExternally
    override fun update(time: Number, delta: Number): Unit = definedExternally
    override fun destroy(): Unit = definedExternally
    override fun calculateRate(): Unit = definedExternally
    open var mute: Boolean = definedExternally
    open fun setMute(value: Boolean): HTML5AudioSound = definedExternally
    open var volume: Number = definedExternally
    open fun setVolume(value: Number): HTML5AudioSound = definedExternally
    open var rate: Number = definedExternally
    open fun setRate(value: Number): HTML5AudioSound = definedExternally
    open var detune: Number = definedExternally
    open fun setDetune(value: Number): HTML5AudioSound = definedExternally
    open var seek: Number = definedExternally
    open fun setSeek(value: Number): HTML5AudioSound = definedExternally
    open var loop: Boolean = definedExternally
    open fun setLoop(value: Boolean): HTML5AudioSound = definedExternally
}
open external class HTML5AudioSoundManager(game: Phaser.Game) : BaseSoundManager {
    open var override: Boolean = definedExternally
    open var audioPlayDelay: Number = definedExternally
    open var loopEndOffset: Number = definedExternally
    override fun add(key: String, config: SoundConfig?): HTML5AudioSound = definedExternally
    override fun unlock(): Unit = definedExternally
    override fun onBlur(): Unit = definedExternally
    override fun onFocus(): Unit = definedExternally
    override fun destroy(): Unit = definedExternally
    open fun isLocked(sound: HTML5AudioSound, prop: String, value: Any? = definedExternally /* null */): Boolean = definedExternally
    open fun setMute(value: Boolean): HTML5AudioSoundManager = definedExternally
    override var mute: Boolean = definedExternally
    open fun setVolume(value: Number): HTML5AudioSoundManager = definedExternally
    override var volume: Number = definedExternally
}
open external class NoAudioSound(manager: NoAudioSoundManager, key: String, config: SoundConfig? = definedExternally /* null */) : BaseSound
open external class NoAudioSoundManager(game: Phaser.Game) : BaseSoundManager
external fun SoundManagerCreator(game: Phaser.Game): Unit = definedExternally
open external class WebAudioSound(manager: WebAudioSoundManager, key: String, config: SoundConfig? = definedExternally /* null */) : BaseSound {
    override fun play(markerName: String?, config: SoundConfig?): Boolean = definedExternally
    override fun pause(): Boolean = definedExternally
    override fun resume(): Boolean = definedExternally
    override fun stop(): Boolean = definedExternally
    override fun applyConfig(): Unit = definedExternally
    override fun update(time: Number, delta: Number): Unit = definedExternally
    override fun destroy(): Unit = definedExternally
    override fun calculateRate(): Unit = definedExternally
    open var rate: Number = definedExternally
    open fun setRate(value: Number): WebAudioSound = definedExternally
    open var detune: Number = definedExternally
    open fun setDetune(value: Number): WebAudioSound = definedExternally
    open var mute: Boolean = definedExternally
    open fun setMute(value: Boolean): WebAudioSound = definedExternally
    open var volume: Number = definedExternally
    open fun setVolume(value: Number): WebAudioSound = definedExternally
    open var seek: Number = definedExternally
    open fun setSeek(value: Number): WebAudioSound = definedExternally
    open var loop: Boolean = definedExternally
    open fun setLoop(value: Boolean): WebAudioSound = definedExternally
}
open external class WebAudioSoundManager(game: Phaser.Game) : BaseSoundManager {
    override fun add(key: String, config: SoundConfig?): WebAudioSound = definedExternally
    override fun unlock(): Unit = definedExternally
    override fun onBlur(): Unit = definedExternally
    override fun onFocus(): Unit = definedExternally
    override fun destroy(): Unit = definedExternally
    open fun setMute(value: Boolean): WebAudioSoundManager = definedExternally
    override var mute: Boolean = definedExternally
    open fun setVolume(value: Number): WebAudioSoundManager = definedExternally
    override var volume: Number = definedExternally
}
