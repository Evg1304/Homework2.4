public class Train extends transport{

    private int tripPrice;
    private int travelTime;
    private String nameOfDepartureStation;
    private String endingStation;
    private int numberOfWagons;

    public Train(String brand, String model, int yearOfIssues, String country, String color, int maxSpeed, int tripPrice, int travelTime, String nameOfDepartureStation, String endingStation, int numberOfWagons) {
        super(brand, model, yearOfIssues, country, color, maxSpeed);
        this.tripPrice = tripPrice;
        if(this.travelTime <= 0){
         this.travelTime = 1;
        }else {
            this.travelTime = travelTime;
        }
        this.nameOfDepartureStation = nameOfDepartureStation;
        this.endingStation = endingStation;
        this.numberOfWagons = numberOfWagons;
        System.out.println("Поезд: " + this.getBrand() + ", модель: " + this.getModel() + ", год выпуска: " + this.getYearOfIssues() + ", Страна: " + this.getCountry() + ", Скорость передвижения: " + this.getMaxSpeed() + "км/ч, начальная станция: " + this.getNameOfDepartureStation() + " конечная станция: " + this.getEndingStation() +  ", цена поездки: " + this.getTripPrice() + " рублей ,  в поезде " + this.getNumberOfWagons() + " вагонов, Цвет: " + getColor());

    }
    public void refill(){
        System.out.println("заправлять дизелем.");
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public String getNameOfDepartureStation() {
        return nameOfDepartureStation;
    }

    public void setNameOfDepartureStation(String nameOfDepartureStation) {
        this.nameOfDepartureStation = nameOfDepartureStation;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

}
