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
public abstract class WalkBehindMower {
    private double cutWidth;
    private double wheelDiameter;
    
    public WalkBehindMower(){
        cutWidth = 0.0;
        wheelDiameter = 0.0;
    }

    /**
     * @return the cutWidth
     */
    public double getCutWidth() {
        return cutWidth;
    }

    /**
     * @param cutWidth the cutWidth to set
     */
    public void setCutWidth(double cutWidth) {
        this.cutWidth = cutWidth;
    }

    /**
     * @return the wheelDiameter
     */
    public double getWheelDiameter() {
        return wheelDiameter;
    }

    /**
     * @param wheelDiameter the wheelDiameter to set
     */
    public void setWheelDiameter(double wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }
    @Override
    public String toString(){
      String nl = System.lineSeparator();
      return cutWidth + nl + wheelDiameter;
    }
}
