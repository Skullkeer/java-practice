package lesson;

public enum TrafficLightColors {
    RED, ORANGE, GREEN;

    public TrafficLightColors next() {
        return switch (this) {
            case RED -> GREEN;
            case GREEN -> ORANGE;
            case ORANGE -> RED;
            default -> throw new IllegalStateException("Purple!");
        };

    }

}
