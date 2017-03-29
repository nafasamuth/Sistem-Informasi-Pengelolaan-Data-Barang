/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem_inventaris_barang;

/**
 *
 * @author Farid Kiftirul Aziz
 */
public class Petugas extends Orang {
    private String idPetugas;
    
    public Petugas(String nama, String alamat, String idPetugas){
        super(nama,alamat);
        this.idPetugas = idPetugas;
    }

    public String getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }

    @Override
    public String getNoHP() {
        return super.noHP;
    }

    @Override
    public void setNoHP(String noHP) {
        super.noHP = noHP;
    }
    
    
}