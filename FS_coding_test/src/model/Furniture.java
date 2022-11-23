package model;

public class Furniture extends Thing {
    private String type;

    @Override
    public String getDescription() {
        return String.format("Furniture[%s] - name:%s, type:%s, retal price:%s$/per month ",
        this.getSerialNumber(),this.getName(),this.getType(), this.getRentPrice() );
    }

    public Furniture(String type) {
        this.type = type;
    }

    public Furniture(String name, String serialNumber, long rentPrice, String type) {
        super(name, serialNumber, rentPrice);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
