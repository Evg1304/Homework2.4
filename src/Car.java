public class Car extends transport {

    public Car(String brand, String model, int yearOfIssues, String country, String color, int maxSpeed) {
        super(brand, model, yearOfIssues, country, color, maxSpeed);
    }
        public void  refill(){
            System.out.println("можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар.");
        }
}
