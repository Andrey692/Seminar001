public class HotDrink extends BottleOfWatter {
    private int temperature;

    public HotDrink(String name, double volume, int temperature, double cost) {
        super(name, volume, cost);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "название = " + super.getName() +
                ";температура = " + temperature +
                ";объем = " + volume +
                ";стоимость = " + super.getCost() +
                '}';
    }

}
