package model;

public class Video extends Thing {

    @Override
    public String getDescription() {
        return String.format("Video[%s] - name:%s, retal price:%s$/per month",
        this.getSerialNumber(),this.getName(),this.getRentPrice());
    }

    public Video() {
    }

    public Video(String name, String serialNumber, long rentPrice) {
        super(name, serialNumber, rentPrice);
    }    
}
