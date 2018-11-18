@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Input.Keyboard") JsNonModule]
package org.decembrist.Phaser.Input.Keyboard

import org.decembrist.Phaser.Phaser
import org.decembrist.utils.KeyComboConfig
import org.w3c.dom.events.KeyboardEvent

open external class KeyCombo {
    constructor(keyboardPlugin: KeyboardPlugin, keys: String, config: KeyComboConfig? = definedExternally /* null */)
    constructor(keyboardPlugin: KeyboardPlugin, keys: Array<Number>, config: KeyComboConfig? = definedExternally /* null */)
    constructor(keyboardPlugin: KeyboardPlugin, keys: Array<Any?>, config: KeyComboConfig? = definedExternally /* null */)

    open var manager: KeyboardPlugin
    open var enabled: Boolean
    open var keyCodes: Array<Any>
    open var current: Number
    open var index: Number
    open var size: Number
    open var timeLastMatched: Number
    open var matched: Boolean
    open var timeMatched: Number
    open var resetOnWrongKey: Boolean
    open var maxKeyDelay: Number
    open var resetOnMatch: Boolean
    open var deleteOnMatch: Boolean
    open var progress: Number
    open fun destroy(): Unit = definedExternally
}
open external class KeyboardPlugin(sceneInputPlugin: org.decembrist.Phaser.Input.InputPlugin) : org.decembrist.Phaser.Events.EventEmitter {
    open var scene: Phaser.Scene = definedExternally
    open var settings: org.decembrist.Phaser.Scenes.Settings.Object = definedExternally
    open var sceneInputPlugin: org.decembrist.Phaser.Input.InputPlugin = definedExternally
    open var enabled: Boolean = definedExternally
    open var target: Any = definedExternally
    open var keys: Array<Key> = definedExternally
    open var combos: Array<KeyCombo> = definedExternally
    open fun isActive(): Boolean = definedExternally
    open fun createCursorKeys(): org.decembrist.Phaser.Input.Keyboard.CursorKeys = definedExternally
    open fun addKeys(keys: String): Any = definedExternally
    open fun addKeys(keys: Any?): Any = definedExternally
    open fun addKey(key: String): Key = definedExternally
    open fun addKey(key: Number): Key = definedExternally
    open fun addKey(key: Key): Key = definedExternally
    open fun removeKey(key: String): Unit = definedExternally
    open fun removeKey(key: Number): Unit = definedExternally
    open fun removeKey(key: Key): Unit = definedExternally
    open fun createCombo(keys: String, config: KeyComboConfig? = definedExternally /* null */): KeyCombo = definedExternally
    open fun createCombo(keys: Array<Number>, config: KeyComboConfig? = definedExternally /* null */): KeyCombo = definedExternally
    open fun createCombo(keys: Array<Any?>, config: KeyComboConfig? = definedExternally /* null */): KeyCombo = definedExternally
    open fun checkDown(key: Key, duration: Number? = definedExternally /* null */): Boolean = definedExternally
}
external interface CursorKeys {
    var up: Key? get() = definedExternally; set(value) = definedExternally
    var down: Key? get() = definedExternally; set(value) = definedExternally
    var left: Key? get() = definedExternally; set(value) = definedExternally
    var right: Key? get() = definedExternally; set(value) = definedExternally
    var space: Key? get() = definedExternally; set(value) = definedExternally
    var shift: Key? get() = definedExternally; set(value) = definedExternally
}
external fun DownDuration(key: Key, duration: Number? = definedExternally /* null */): Boolean = definedExternally
external fun JustDown(key: Key): Boolean = definedExternally
external fun JustUp(key: Key): Boolean = definedExternally
open external class Key(keyCode: Number) {
    open var keyCode: Number = definedExternally
    open var originalEvent: KeyboardEvent = definedExternally
    open var preventDefault: Boolean = definedExternally
    open var enabled: Boolean = definedExternally
    open var isDown: Boolean = definedExternally
    open var isUp: Boolean = definedExternally
    open var altKey: Boolean = definedExternally
    open var ctrlKey: Boolean = definedExternally
    open var shiftKey: Boolean = definedExternally
    open var location: Number = definedExternally
    open var timeDown: Number = definedExternally
    open var duration: Number = definedExternally
    open var timeUp: Number = definedExternally
    open var repeats: Number = definedExternally
    companion object {
        fun reset(): Key = definedExternally
    }
}
external enum class KeyCodes {
    BACKSPACE,
    TAB,
    ENTER,
    SHIFT,
    CTRL,
    ALT,
    PAUSE,
    CAPS_LOCK,
    ESC,
    SPACE,
    PAGE_UP,
    PAGE_DOWN,
    END,
    HOME,
    LEFT,
    UP,
    RIGHT,
    DOWN,
    PRINT_SCREEN,
    INSERT,
    DELETE,
    ZERO,
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    NUMPAD_ZERO,
    NUMPAD_ONE,
    NUMPAD_TWO,
    NUMPAD_THREE,
    NUMPAD_FOUR,
    NUMPAD_FIVE,
    NUMPAD_SIX,
    NUMPAD_SEVEN,
    NUMPAD_EIGHT,
    NUMPAD_NINE,
    A,
    B,
    C,
    D,
    E,
    F,
    G,
    H,
    I,
    J,
    K,
    L,
    M,
    N,
    O,
    P,
    Q,
    R,
    S,
    T,
    U,
    V,
    W,
    X,
    Y,
    Z,
    F1,
    F2,
    F3,
    F4,
    F5,
    F6,
    F7,
    F8,
    F9,
    F10,
    F11,
    F12,
    SEMICOLON,
    PLUS,
    COMMA,
    MINUS,
    PERIOD,
    FORWARD_SLASH,
    BACK_SLASH,
    QUOTES,
    BACKTICK,
    OPEN_BRACKET,
    CLOSED_BRACKET
}
external fun UpDuration(key: Key, duration: Number? = definedExternally /* null */): Boolean = definedExternally
