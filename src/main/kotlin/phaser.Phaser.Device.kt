@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Device")]
package Phaser.Device

external interface Audio {
    var audioData: Boolean
    var dolby: Boolean
    var m4a: Boolean
    var mp3: Boolean
    var ogg: Boolean
    var opus: Boolean
    var wav: Boolean
    var webAudio: Boolean
    var webm: Boolean
}
external interface Browser {
    var chrome: Boolean
    var edge: Boolean
    var firefox: Boolean
    var ie: Boolean
    var mobileSafari: Boolean
    var opera: Boolean
    var safari: Boolean
    var silk: Boolean
    var trident: Boolean
    var chromeVersion: Number
    var firefoxVersion: Number
    var ieVersion: Number
    var safariVersion: Number
    var tridentVersion: Number
}
external interface CanvasFeatures {
    var supportInverseAlpha: Boolean
    var supportNewBlendModes: Boolean
}
external interface Features {
    var canvasBitBltShift: Boolean
    var canvas: Boolean
    var file: Boolean
    var fileSystem: Boolean
    var getUserMedia: Boolean
    var littleEndian: Boolean
    var localStorage: Boolean
    var pointerLock: Boolean
    var support32bit: Boolean
    var vibration: Boolean
    var webGL: Boolean
    var worker: Boolean
}
external interface Fullscreen {
    var available: Boolean
    var keyboard: Boolean
    var cancel: String
    var request: String
}
external interface Input {
    var wheelType: String
    var gamepads: Boolean
    var mspointer: Boolean
    var touch: Boolean
}
external interface OS {
    var android: Boolean
    var chromeOS: Boolean
    var cocoonJS: Boolean
    var cocoonJSApp: Boolean
    var cordova: Boolean
    var crosswalk: Boolean
    var desktop: Boolean
    var ejecta: Boolean
    var electron: Boolean
    var iOS: Boolean
    var iPad: Boolean
    var iPhone: Boolean
    var kindle: Boolean
    var linux: Boolean
    var macOS: Boolean
    var node: Boolean
    var nodeWebkit: Boolean
    var webApp: Boolean
    var windows: Boolean
    var windowsPhone: Boolean
    var iOSVersion: Number
    var pixelRatio: Number
}
external interface Video {
    var h264Video: Boolean
    var hlsVideo: Boolean
    var mp4Video: Boolean
    var oggVideo: Boolean
    var vp9Video: Boolean
    var webmVideo: Boolean
}
