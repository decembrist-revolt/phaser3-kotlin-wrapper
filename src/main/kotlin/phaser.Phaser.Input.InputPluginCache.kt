@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Input.InputPluginCache")]
package Phaser.Input.InputPluginCache

import InputPluginContainer

external fun register(key: String, plugin: Function<*>, mapping: String, settingsKey: String, configKey: String): Unit = definedExternally
external fun getCore(key: String): InputPluginContainer = definedExternally
external fun install(target: Phaser.Input.InputPlugin): Unit = definedExternally
external fun remove(key: String): Unit = definedExternally
