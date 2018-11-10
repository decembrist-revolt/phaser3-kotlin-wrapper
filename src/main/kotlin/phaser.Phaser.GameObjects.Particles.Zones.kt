@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("GameObjects.Particles.Zones")]
package Phaser.GameObjects.Particles.Zones

import DeathZoneSource
import EdgeZoneSource
import RandomZoneSource

open external class DeathZone(source: DeathZoneSource, killOnEnter: Boolean) {
    open var source: DeathZoneSource = definedExternally
    open var killOnEnter: Boolean = definedExternally
    open fun willKill(particle: Phaser.GameObjects.Particles.Particle): Boolean = definedExternally
}
open external class EdgeZone(source: EdgeZoneSource, quantity: Number, stepRate: Number, yoyo: Boolean? = definedExternally /* null */, seamless: Boolean? = definedExternally /* null */) {
    open var source: dynamic /* EdgeZoneSource | RandomZoneSource */ = definedExternally
    open var points: Array<Phaser.Geom.Point> = definedExternally
    open var quantity: Number = definedExternally
    open var stepRate: Number = definedExternally
    open var yoyo: Boolean = definedExternally
    open var counter: Number = definedExternally
    open var seamless: Boolean = definedExternally
    open fun updateSource(): EdgeZone = definedExternally
    open fun changeSource(source: EdgeZoneSource): EdgeZone = definedExternally
    open fun getPoint(particle: Phaser.GameObjects.Particles.Particle): Unit = definedExternally
}
open external class RandomZone(source: RandomZoneSource) {
    open var source: RandomZoneSource = definedExternally
    open fun getPoint(particle: Phaser.GameObjects.Particles.Particle): Unit = definedExternally
}
