package model;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public class GioHangModel {
    private int idgiohang;
    private int idsanpham;
    private int soluong;
    private Double price;
    private Double tongtien;

    public GioHangModel() {
    }

    public GioHangModel(int idgiohang, int idsanpham, int soluong, Double price, Double tongtien) {
        this.idgiohang = idgiohang;
        this.idsanpham = idsanpham;
        this.soluong = soluong;
        this.price = price;
        this.tongtien = tongtien;
    }

    public int getIdgiohang() {
        return idgiohang;
    }

    public void setIdgiohang(int idgiohang) {
        this.idgiohang = idgiohang;
    }

    public int getIdsanpham() {
        return idsanpham;
    }

    public void setIdsanpham(int idsanpham) {
        this.idsanpham = idsanpham;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTongtien() {
        return tongtien;
    }

    public void setTongtien(Double tongtien) {
        this.tongtien = tongtien;
    }
}