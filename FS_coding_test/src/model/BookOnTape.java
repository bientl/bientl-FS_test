package model;

public class BookOnTape extends Thing {
    private String author;

    @Override
    public String getDescription() {
        return String.format("Book on tape[%s] - name:%s, author:%s, retal price:%s$/per month",
        this.getSerialNumber(), this.getName(),this.getAuthor(), this.getRentPrice() );
    }

    public BookOnTape() {
    }

    public BookOnTape(String name, String serialNumber, long rentPrice, String author) {
        super(name, serialNumber, rentPrice);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
