public class Bus extends transport {

    public Bus(String brand, String model, int yearOfIssues, String country, String color, int maxSpeed) {
        super(brand, model, yearOfIssues, country, color, maxSpeed);
        System.out.println(getBrand() + getModel() + getYearOfIssues() + getCountry() + getColor() + getMaxSpeed());
    }
    public void refill(){
        System.out.println("можно заправлять бензином или дизелем на заправке.");
    }

}
