@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Cache")]
package org.decembrist.Phaser.Cache

import org.decembrist.Phaser.Phaser

open external class BaseCache {
    open var entries: org.decembrist.Phaser.Structs.Map<String, Any> = definedExternally
    open var events: org.decembrist.Phaser.Events.EventEmitter = definedExternally
    open fun add(key: String, data: Any): BaseCache = definedExternally
    open fun has(key: String): Boolean = definedExternally
    open fun exists(key: String): Boolean = definedExternally
    open fun get(key: String): Any = definedExternally
    open fun remove(key: String): BaseCache = definedExternally
    open fun destroy(): Unit = definedExternally
}
external interface `T$2` {
    @nativeGetter
    operator fun get(key: String): BaseCache?
    @nativeSetter
    operator fun set(key: String, value: BaseCache)
}
open external class CacheManager(game: Phaser.Game) {
    open var game: Phaser.Game = definedExternally
    open var binary: BaseCache = definedExternally
    open var bitmapFont: BaseCache = definedExternally
    open var json: BaseCache = definedExternally
    open var physics: BaseCache = definedExternally
    open var shader: BaseCache = definedExternally
    open var audio: BaseCache = definedExternally
    open var text: BaseCache = definedExternally
    open var html: BaseCache = definedExternally
    open var obj: BaseCache = definedExternally
    open var tilemap: BaseCache = definedExternally
    open var xml: BaseCache = definedExternally
    open var custom: `T$2` = definedExternally
    open fun addCustom(key: String): BaseCache = definedExternally
    open fun destroy(): Unit = definedExternally
}
