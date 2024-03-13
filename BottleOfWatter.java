public class BottleOfWatter extends Product {
    double volume;

    public BottleOfWatter(String name, double volume, double cost) {
        super(name, cost);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWatter{" +
                "название = " + super.getName() +
                ";объем = " + volume +
                ";стоимость = " + super.getCost() +
                '}';
    }
}
