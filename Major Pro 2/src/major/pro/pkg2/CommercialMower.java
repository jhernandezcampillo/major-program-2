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
public class CommercialMower extends LawnTractor{
    private double operatingHours;
    private boolean zeroTurnRadius;
    
    public CommercialMower(){
        operatingHours = 0.0;
        zeroTurnRadius = false;
    }
    public CommercialMower(double opHour, boolean zero){
        operatingHours = opHour;
        zeroTurnRadius = zero;
    }

    /**
     * @return the operatingHours
     */
    public double getOperatingHours() {
        return operatingHours;
    }

    /**
     * @param operatingHours the operatingHours to set
     */
    public void setOperatingHours(double operatingHours) {
        this.operatingHours = operatingHours;
    }

    /**
     * @return the zeroTurnRadius
     */
    public boolean isZeroTurnRadius() {
        return zeroTurnRadius;
    }

    /**
     * @param zeroTurnRadius the zeroTurnRadius to set
     */
    public void setZeroTurnRadius(boolean zeroTurnRadius) {
        this.zeroTurnRadius = zeroTurnRadius;
    }
    @Override
    public String toString(){
        String nl = System.lineSeparator();
        return super.toString()+ operatingHours + nl + zeroTurnRadius + nl; 
    }
}
