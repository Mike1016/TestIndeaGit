/**
 * @author miao
 * @create 2018-09-13 21:24
 */
public class Address {
    private int id;
    private String city;
    private String name;
    private String  adds;
    private String  province;



    public String getProvince() {
        return province;
    }

    public void setProvinces(String province) {
        this.province = province;
    }

    public String getAdds() {
        return adds;
    }

    public void setAdds(String adds) {
        this.adds = adds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
