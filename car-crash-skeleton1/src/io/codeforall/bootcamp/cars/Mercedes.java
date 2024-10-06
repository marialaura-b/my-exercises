package io.codeforall.bootcamp.cars;

import io.codeforall.bootcamp.field.Position;

    public class Mercedes extends Car {

        public Mercedes() {
            super(new Position());
        }
        @Override
        public int getSpeed() {
            return 1;
        }

        @Override
        public String toString() {
            return "M";
        }
    }
