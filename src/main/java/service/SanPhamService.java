package service;

import dao.SanPhamDAO;
import model.SanPhamModel;

import java.util.List;

public class SanPhamService {
    public static List<SanPhamModel> sanPhamModels = SanPhamDAO.getAll();

    public List<SanPhamModel> show(){
        for (SanPhamModel g:
                sanPhamModels) {
            g.getIdsanpham();
        }
        return sanPhamModels;
    }

    public static void add(SanPhamModel sanPhamModel) {
        sanPhamModels.add(sanPhamModel);
        SanPhamDAO.save(sanPhamModel);
    }

    public static boolean checkid(int idsanpham) {
        for (int i = 0; i < sanPhamModels.size(); i++) {
            if (sanPhamModels.get(i).getIdsanpham() == idsanpham) {
                return false;
            }
        }
        return true;
    }
    public static void edit ( int idsanpham, SanPhamModel sanPhamModel){
        for (int i = 0; i < sanPhamModels.size(); i++) {
            if (sanPhamModels.get(i).getIdsanpham() == idsanpham) {
                sanPhamModels.set(i, sanPhamModel);
            }
        }
    }

    public static void delete ( int idsanpham){
        for (int i = 0; i < sanPhamModels.size(); i++) {
            if (sanPhamModels.get(i).getIdsanpham() == idsanpham) {
                sanPhamModels.remove(i);
            }
        }
        SanPhamDAO.delete(idsanpham);
    }
}









