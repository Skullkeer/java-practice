package Lesson;

public class State {

    // state interface
    interface LightState {
        void next(TrafficLight light);
    }

    static class Green implements LightState {

        @Override
        public void next(TrafficLight light) {
            System.out.println("Green -> Yellow");
            light.setState(new Yellow());
        }
    }

    static class Yellow implements LightState {

        @Override
        public void next(TrafficLight light) {
            System.out.println("Yellow -> Red");
            light.setState(new Red());
        }
    }

    static class Red implements LightState {

        @Override
        public void next(TrafficLight light) {
            System.out.println("Red -> Green");
            light.setState(new Green());
        }
    }

    // context class
    static class TrafficLight {
        private LightState state = new Green();

        void next() {
            state.next(this);
        }

        void setState(LightState state) {
            this.state = state;
        }
    }

    public static void main() {
        TrafficLight light = new TrafficLight();

        light.next();
        light.next();
        light.next();
    }

}
