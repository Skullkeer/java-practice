package lesson;

public enum Planets {
    MERCURY(4.878e3),
    VENUS(1.2104e4),
    EARTH(1.2756e4),
    MARS(6.794e3),
    JUPITER(1.42796e5),
    SATURN(1.20660e5),
    URANUS(5.1118e4),
    NEPTUNE(4.9523e4),
    PLUTO(2.3e3);

    private double diameter;
    Planets(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return this.diameter;
    }

    public Planets next() {
        return switch(this) {
            case MERCURY -> VENUS;
            case VENUS -> EARTH;
            case EARTH -> MARS;
            case MARS -> JUPITER;
            case JUPITER -> SATURN;
            case SATURN -> URANUS;
            case URANUS -> NEPTUNE;
            case NEPTUNE -> PLUTO;
            case PLUTO -> MERCURY;
            default -> throw new IllegalStateException("Purple!");

        };
    }
}
