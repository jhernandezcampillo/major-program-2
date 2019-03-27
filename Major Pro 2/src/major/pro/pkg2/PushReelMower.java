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
public class PushReelMower extends WalkBehindMower{
    private int numWheels;
    
    public PushReelMower(){
        numWheels = 0;
    }
    public PushReelMower(int num){
        numWheels = num;
    }

    /**
     * @return the numWheels
     */
    public int getNumWheels() {
        return numWheels;
    }

    /**
     * @param numWheels the numWheels to set
     */
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
    @Override
    public String toString(){
        String nl = System.lineSeparator();
        return super.toString() + numWheels + nl;
    }
}
