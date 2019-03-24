package pl.sda.parser;

public class RealEstate
{
    String street;
    String City;
    int zip;
    String state;
    int beds;
    int baths;
    int sq_ft;
    String type;
    String sale_date;
    int price;
    double latitude;
    double longitude;

    public RealEstate(String street, String city, int zip, String state, int beds, int baths, int sq_ft, String type, String sale_date, int price, double latitude, double longitude)
    {
        this.street = street;
        City = city;
        this.zip = zip;
        this.state = state;
        this.beds = beds;
        this.baths = baths;
        this.sq_ft = sq_ft;
        this.type = type;
        this.sale_date = sale_date;
        this.price = price;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString()
    {
        return "RealEstate{" +
                "street='" + street + '\'' +
                ", City='" + City + '\'' +
                ", zip=" + zip +
                ", state='" + state + '\'' +
                ", beds=" + beds +
                ", baths=" + baths +
                ", sq_ft=" + sq_ft +
                ", type='" + type + '\'' +
                ", sale_date='" + sale_date + '\'' +
                ", price=" + price +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
