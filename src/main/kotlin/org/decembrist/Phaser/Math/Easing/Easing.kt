package org.decembrist.Phaser.Math.Easing

external object Easing {

    object Back {
        fun In(v: Number, overshoot: Number? = definedExternally /* null */): Number = definedExternally
        fun InOut(v: Number, overshoot: Number? = definedExternally /* null */): Number = definedExternally
        fun Out(v: Number, overshoot: Number? = definedExternally /* null */): Number = definedExternally
    }

    object Bounce {
        fun In(v: Number): Number = definedExternally
        fun InOut(v: Number): Number = definedExternally
        fun Out(v: Number): Number = definedExternally
    }

    object Circular {
        fun In(v: Number): Number = definedExternally
        fun InOut(v: Number): Number = definedExternally
        fun Out(v: Number): Number = definedExternally
    }

    object Cubic {
        fun In(v: Number): Number = definedExternally
        fun InOut(v: Number): Number = definedExternally
        fun Out(v: Number): Number = definedExternally
    }

    object Elastic {
        fun In(v: Number, amplitude: Number? = definedExternally /* null */, period: Number? = definedExternally /* null */): Number = definedExternally
        fun InOut(v: Number, amplitude: Number? = definedExternally /* null */, period: Number? = definedExternally /* null */): Number = definedExternally
        fun Out(v: Number, amplitude: Number? = definedExternally /* null */, period: Number? = definedExternally /* null */): Number = definedExternally
    }

    object Expo {
        fun In(v: Number): Number = definedExternally
        fun InOut(v: Number): Number = definedExternally
        fun Out(v: Number): Number = definedExternally
    }

    object Linear {
        fun Linear(v: Number): Number = definedExternally
    }

    object Quadratic {
        fun In(v: Number): Number = definedExternally
        fun InOut(v: Number): Number = definedExternally
        fun Out(v: Number): Number = definedExternally
    }

    object Quartic {
        fun In(v: Number): Number = definedExternally
        fun InOut(v: Number): Number = definedExternally
        fun Out(v: Number): Number = definedExternally
    }

    object Quintic {
        fun In(v: Number): Number = definedExternally
        fun InOut(v: Number): Number = definedExternally
        fun Out(v: Number): Number = definedExternally
    }

    object Sine {
        fun In(v: Number): Number = definedExternally
        fun InOut(v: Number): Number = definedExternally
        fun Out(v: Number): Number = definedExternally
    }

    object Stepped {
        fun Stepped(v: Number, steps: Number? = definedExternally /* null */): Number = definedExternally
    }
}