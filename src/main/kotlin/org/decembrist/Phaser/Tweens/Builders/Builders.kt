@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Tweens.Builders")]
package org.decembrist.Phaser.Tweens.Builders

external fun GetBoolean(source: Any, key: String, defaultValue: Any): Any = definedExternally
external fun GetEaseFunction(ease: String, easeParams: Array<Any>): Function<*> = definedExternally
external fun GetEaseFunction(ease: Function<*>, easeParams: Array<Any>): Function<*> = definedExternally
external fun GetNewValue(source: Any, key: String, defaultValue: Any): Function<*> = definedExternally
external fun GetProps(config: Any): Array<Any> = definedExternally
external fun GetTargets(config: Any): Array<Any> = definedExternally
external fun GetTweens(config: Any): Array<Any> = definedExternally
external fun GetValueOp(key: String, propertyValue: Any): Function<*> = definedExternally
external fun NumberTweenBuilder(parent: org.decembrist.Phaser.Tweens.TweenManager, config: Any, defaults: org.decembrist.Phaser.Tweens.TweenConfigDefaults): org.decembrist.Phaser.Tweens.Tween = definedExternally
external fun NumberTweenBuilder(parent: org.decembrist.Phaser.Tweens.Timeline, config: Any, defaults: org.decembrist.Phaser.Tweens.TweenConfigDefaults): org.decembrist.Phaser.Tweens.Tween = definedExternally
external fun TimelineBuilder(manager: org.decembrist.Phaser.Tweens.TweenManager, config: Any): org.decembrist.Phaser.Tweens.Timeline = definedExternally
external fun TweenBuilder(parent: org.decembrist.Phaser.Tweens.TweenManager, config: Any, defaults: org.decembrist.Phaser.Tweens.TweenConfigDefaults): org.decembrist.Phaser.Tweens.Tween = definedExternally
external fun TweenBuilder(parent: org.decembrist.Phaser.Tweens.Timeline, config: Any, defaults: org.decembrist.Phaser.Tweens.TweenConfigDefaults): org.decembrist.Phaser.Tweens.Tween = definedExternally
