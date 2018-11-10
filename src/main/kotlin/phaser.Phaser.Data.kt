@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Data") JsNonModule]
package Phaser.Data

import kotlin.js.*

open external class DataManager(parent: Any, eventEmitter: Phaser.Events.EventEmitter) {
    open var parent: Any = definedExternally
    open var events: Phaser.Events.EventEmitter = definedExternally
    open var list: Json = definedExternally
    open var values: Json = definedExternally
    open fun get(key: String): Any = definedExternally
    open fun get(key: Array<String>): Any = definedExternally
    open fun getAll(): Json = definedExternally
    open fun query(search: RegExp): Json = definedExternally
    open fun set(key: String, data: Any): DataManager = definedExternally
    open fun set(key: Any?, data: Any): DataManager = definedExternally
    open fun each(callback: (parent: Any, key: String, value: Any, args: Any) -> Unit, context: Any? = definedExternally /* null */, vararg args: Any): DataManager = definedExternally
    open fun merge(data: Json, overwrite: Boolean? = definedExternally /* null */): DataManager = definedExternally
    open fun remove(key: String): DataManager = definedExternally
    open fun remove(key: Array<String>): DataManager = definedExternally
    open fun pop(key: String): Any = definedExternally
    open fun has(key: String): Boolean = definedExternally
    open fun setFreeze(value: Boolean): DataManager = definedExternally
    open fun reset(): DataManager = definedExternally
    open fun destroy(): Unit = definedExternally
    open var freeze: Boolean = definedExternally
    open var count: Number = definedExternally
}
open external class DataManagerPlugin(scene: Phaser.Scene) : DataManager {
    open var scene: Phaser.Scene = definedExternally
    open var systems: Phaser.Scenes.Systems = definedExternally
    override fun destroy(): Unit = definedExternally
}
