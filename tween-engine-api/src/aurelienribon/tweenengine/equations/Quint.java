/*
 * Copyright 2012 Aurelien Ribon
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package aurelienribon.tweenengine.equations;

import aurelienribon.tweenengine.TweenEquation;

/**
 * Easing equation based on Robert Penner's work: http://robertpenner.com/easing/
 *
 * @author Aurelien Ribon | http://www.aurelienribon.com/
 */
public abstract
class Quint extends TweenEquation {
    public static final Quint IN = new Quint() {
        @Override
        public final
        float compute(float t) {
            return t * t * t * t * t;
        }

        @Override
        public
        String toString() {
            return "Quint.IN";
        }
    };

    public static final Quint OUT = new Quint() {
        @Override
        public final
        float compute(float t) {
            return (t -= 1) * t * t * t * t + 1;
        }

        @Override
        public
        String toString() {
            return "Quint.OUT";
        }
    };

    public static final Quint INOUT = new Quint() {
        @Override
        public final
        float compute(float t) {
            if ((t *= 2) < 1) {
                return 0.5f * t * t * t * t * t;
            }
            return 0.5f * ((t -= 2) * t * t * t * t + 2);
        }

        @Override
        public
        String toString() {
            return "Quint.INOUT";
        }
    };
}
