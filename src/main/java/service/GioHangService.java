package service;

import dao.GioHangDAO;
import model.GioHangModel;
import model.SanPhamModel;

import java.util.List;

public class GioHangService {

//
    public static List<GioHangModel> gioHangModels = GioHangDAO.getAll();

    public List<GioHangModel> show(){
        for (GioHangModel g:
                gioHangModels) {
            g.getIdsanpham();
        }
        return gioHangModels;
    }
    public static void add(GioHangModel gioHangModel) {
        gioHangModels.add(gioHangModel);
        GioHangDAO.save(gioHangModel);
    }

    public static boolean checkid(int idgiohang) {
        for (int i = 0; i < gioHangModels.size(); i++) {
            if (gioHangModels.get(i).getIdgiohang() == idgiohang) {
                return false;
            }
        }
        return true;
    }

    public static void edit(int idgiohang, GioHangModel gioHangModel) {
        for (int i = 0; i < gioHangModels.size(); i++) {
            if (gioHangModels.get(i).getIdgiohang() == idgiohang) {
                gioHangModels.set(i, gioHangModel);
            }
        }
    }

    public static void delete(int idgiohang) {
        for (int i = 0; i < gioHangModels.size(); i++) {
            if (gioHangModels.get(i).getIdgiohang() == idgiohang) {
                gioHangModels.remove(i);
            }
        }
        GioHangService.delete(idgiohang);
    }
}









