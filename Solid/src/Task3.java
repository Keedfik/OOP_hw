public class Task3 {
    /**
     * интерфейс для простых фигур
     */
    public interface Shape {
        double area();
        // double volume();
    }

    /**
     * Интерфейс для объемных фигур
     */
    public interface ThreeDimensional {
        double volume();
    }

    public class Circle implements Shape {
        private double radius;

        /**
         * @param radius радиус круга
         */
        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return 2 * 3.14 * radius;
        }

        // @Override
        // public double volume() {
        // throw new UnsupportedOperationException();
        // }
    }

    public class Cube implements Shape, ThreeDimensional {
        private int edge;

        /**
         * @param edge сторона квадрата
         */
        public Cube(int edge) {
            this.edge = edge;
        }

        @Override
        public double area() {
            return 6 * edge * edge;
        }

        @Override
        public double volume() {
            return edge * edge * edge;
        }
    }
}
