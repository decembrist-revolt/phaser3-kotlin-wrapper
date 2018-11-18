@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("GameObjects.RetroFont")]
package org.decembrist.Phaser.GameObjects.RetroFont

import org.decembrist.Phaser.Phaser

external var TEXT_SET1: String = definedExternally
external var TEXT_SET2: String = definedExternally
external var TEXT_SET3: String = definedExternally
external var TEXT_SET4: String = definedExternally
external var TEXT_SET5: String = definedExternally
external var TEXT_SET6: String = definedExternally
external var TEXT_SET7: String = definedExternally
external var TEXT_SET8: String = definedExternally
external var TEXT_SET9: String = definedExternally
external var TEXT_SET10: String = definedExternally
external var TEXT_SET11: String = definedExternally
external fun Parse(scene: Phaser.Scene, config: org.decembrist.Phaser.GameObjects.RetroFont.Config): Any = definedExternally
external interface Config {
    var image: String
    var width: Number
    var height: Number
    var chars: String
    var charsPerRow: Number
    var lineSpacing: Number
}
