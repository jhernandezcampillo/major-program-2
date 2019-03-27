/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package major.pro.pkg2;

/**
 *
 * @author Judith
 */
public abstract class Mower {
   private String manufacturer;
   private int year;
   private String serialNumber;
   private String subtype;
   
   public Mower(){
       manufacturer = "";
       year = 0;
       serialNumber = "";
   }
   public Mower(String manu, int year, String serNum){
       manufacturer = manu;
       this.year = year;
       serialNumber = serNum;
   }

    /**
     * @return the manufacturer
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * @param manufacturer the manufacturer to set
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the serialNumber
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    /**
     *
     * @return
     */
    public String getSubtype(){
        return subtype;
    }
    public void setSubtype(String subtype){
        this.subtype = subtype;
    }
    @Override 
    
   public String toString(){
       String nl = System.lineSeparator();
       return manufacturer + nl + year + nl + serialNumber + nl + subtype + nl;
   }
}
