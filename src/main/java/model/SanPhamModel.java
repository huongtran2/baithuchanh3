package model;


public class SanPhamModel {
    private int idsanpham;
    private String namesanpham;
    private Double price;

    public SanPhamModel() {
    }

    public SanPhamModel(int idsanpham, String namesanpham, Double price) {
        this.idsanpham = idsanpham;
        this.namesanpham = namesanpham;
        this.price = price;
    }

    public int getIdsanpham() {
        return idsanpham;
    }

    public void setIdsanpham(int idsanpham) {
        this.idsanpham = idsanpham;
    }

    public String getNamesanpham() {
        return namesanpham;
    }

    public void setNamesanpham(String namesanpham) {
        this.namesanpham = namesanpham;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
