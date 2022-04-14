package OPP_04;

public class Pen {
    
    private String color;
    String type;
    String price;
    String companyName;

    public Pen() {
        System.out.println("Default Constructor");
    }

    public Pen(String type, String price, String companyName, String color) {
        this.color = color;
        this.price = price;
        this.companyName = companyName;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String write() {
        return ("I'm gonna start writing with" + this.companyName);
    }
}
