@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Scenes.Settings")]
package org.decembrist.Phaser.Scenes.Settings

import org.decembrist.Phaser.Phaser

external interface `T$8` {
    operator fun get(key: String): String?
    operator fun set(key: String, value: String)
}
external interface Config {
    var key: String? get() = definedExternally; set(value) = definedExternally
    var active: Boolean? get() = definedExternally; set(value) = definedExternally
    var visible: Boolean? get() = definedExternally; set(value) = definedExternally
    var pack: dynamic /* Boolean | Phaser.Loader.FileTypes.PackFileConfig */ get() = definedExternally; set(value) = definedExternally
    var cameras: dynamic /* InputJSONCameraObject | Array<InputJSONCameraObject> */ get() = definedExternally; set(value) = definedExternally
    var map: `T$8`? get() = definedExternally; set(value) = definedExternally
    var mapAdd: `T$8`? get() = definedExternally; set(value) = definedExternally
    var physics: Any? get() = definedExternally; set(value) = definedExternally
    var loader: Any? get() = definedExternally; set(value) = definedExternally
    var plugins: dynamic /* Boolean | Any */ get() = definedExternally; set(value) = definedExternally
}
external interface Object {
    var status: Number
    var key: String
    var active: Boolean
    var visible: Boolean
    var isBooted: Boolean
    var isTransition: Boolean
    var transitionFrom: Phaser.Scene
    var transitionDuration: Number
    var transitionAllowInput: Boolean
    var data: Any
    var pack: dynamic /* Boolean | Phaser.Loader.FileTypes.PackFileConfig */
    var cameras: dynamic /* InputJSONCameraObject | Array<InputJSONCameraObject> */
    var map: `T$8`
    var physics: Any
    var loader: Any
    var plugins: dynamic /* Boolean | Any */
}
external fun create(config: String): org.decembrist.Phaser.Scenes.Settings.Object = definedExternally
external fun create(config: org.decembrist.Phaser.Scenes.Settings.Config): org.decembrist.Phaser.Scenes.Settings.Object = definedExternally
