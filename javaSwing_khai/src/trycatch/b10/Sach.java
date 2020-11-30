/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch.b10;

/**
 *
 * @author LENOVO
 */
public class Sach {
    private String ID;
    private String Authors;
    private String TiTle;
    private String category;
      
    
    public Sach(){
        
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAuthors() {
        return Authors;
    }

    public void setAuthors(String Authors) {
        this.Authors = Authors;
    }

    public String getTiTle() {
        return TiTle;
    }

    public void setTiTle(String TiTle) {
        this.TiTle = TiTle;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public Sach (String ID, String Authors,String Titlle,String category){
        this.Authors=Authors;
        this.ID=ID;
        this.TiTle=Titlle;
        this.category=category;
    }
    public void nhap(){
        
    }
    public void xuat() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Sach{" + "ID=" + ID + ", Authors=" + Authors + ", TiTle=" + TiTle + ", category=" + category + '}';
    }
    
}
