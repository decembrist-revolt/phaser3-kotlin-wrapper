@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Plugins.PluginCache")]
package Phaser.Plugins.PluginCache

import CorePluginContainer
import CustomPluginContainer

external fun register(key: String, plugin: Function<*>, mapping: String, custom: Boolean? = definedExternally /* null */): Unit = definedExternally
external fun registerCustom(key: String, plugin: Function<*>, mapping: String, data: Any): Unit = definedExternally
external fun hasCore(key: String): Boolean = definedExternally
external fun hasCustom(key: String): Boolean = definedExternally
external fun getCore(key: String): CorePluginContainer = definedExternally
external fun getCustom(key: String): CustomPluginContainer = definedExternally
external fun getCustomClass(key: String): Function<*> = definedExternally
external fun remove(key: String): Unit = definedExternally
external fun removeCustom(key: String): Unit = definedExternally
external fun destroyCorePlugins(): Unit = definedExternally
external fun destroyCustomPlugins(): Unit = definedExternally
