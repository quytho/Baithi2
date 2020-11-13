package douong;

public class DoUong {
    private String Name;
    private String Gia;
    private int Photo;

    public DoUong(String name, String gia, int photo) {
        Name = name;
        Gia = gia;
        Photo = photo;
    }

    public DoUong() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String gia) {
        Gia = gia;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
