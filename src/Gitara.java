public class Gitara implements Instrument {
    private int cordNumber;

    public int getCordNumber() {
        return cordNumber;
    }

    public void setCordNumber(int cordNumber) {
        this.cordNumber = cordNumber;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gitara)) return false;

        Gitara gitara = (Gitara) o;

        return cordNumber == gitara.cordNumber;
    }

    @Override
    public int hashCode() {
        return cordNumber;
    }

    @Override
    public String toString() {
        return "Gitara{" +
                "cordNumber=" + cordNumber +
                '}';
    }
}