package model;

public abstract class Thing {
    private String name;
    private String serialNumber;
    private long rentPrice;

    public Thing() {
    }

    public Thing(String name, String serialNumber, long rentPrice) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.rentPrice = rentPrice;
    }

    public abstract String getDescription();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public long getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(long rentPrice) {
        this.rentPrice = rentPrice;
    }

}
