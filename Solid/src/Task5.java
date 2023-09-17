public class Task5 {

    public interface IEngine {
        public void start();
    }

    public class Car {
        private IEngine engine;

        public Car(IEngine engine) {
            this.engine = engine;
        }

        public void start() {
            this.engine.start();
        }
    }

    public class PetrolEngine implements IEngine {
        public void start() {
        }
    }

}
