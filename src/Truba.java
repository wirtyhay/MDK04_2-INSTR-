public class Truba implements Instrument {
    private double diameter;

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Играет труба");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truba)) return false;

        Truba truba = (Truba) o;

        return Double.compare(truba.diameter, diameter) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(diameter);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Truba{" +
                "diameter=" + diameter +
                '}';
    }
}
