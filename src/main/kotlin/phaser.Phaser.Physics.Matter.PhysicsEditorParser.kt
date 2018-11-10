@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:[JsModule("phaser") JsQualifier("Physics.Matter.PhysicsEditorParser")]
package Phaser.Physics.Matter.PhysicsEditorParser

external fun parseBody(x: Number, y: Number, w: Number, h: Number, config: Any): Any = definedExternally
external fun parseFixture(fixtureConfig: Any): Array<Any?> = definedExternally
external fun parseVertices(vertexSets: Any, options: Any): Array<Any?> = definedExternally
