public abstract class transport {
    private String brand;
    private String model;
    private final int yearOfIssues;
    private final String country;
    private String color;
    private  int maxSpeed;

    public transport(String brand, String model, int yearOfIssues, String country, String color, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssues = yearOfIssues;
        this.country = country;
        if(this.color != null && !this.color.isBlank() && !this.color.isEmpty()){
            this.color = color;
        }else {
            this.color = " Цвет не указан ";
        }
        this.maxSpeed = maxSpeed;
    }
    public abstract void refill();



    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(this.brand != null && !this.brand.isEmpty() && !this.brand.isBlank()){
            this.brand = "Марка не указана";
        }else{
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (this.model != null && !this.model.isEmpty() && !this.model.isBlank()) {
            this.model = "Модель не указана";
        } else {
            this.model = model;
        }
    }

    public int getYearOfIssues() {
        return yearOfIssues;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (this.maxSpeed <= 0) {
            this.maxSpeed = -1;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
}

