/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package major.pro.pkg2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Judith
 */
public class MajorPro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Engine eng = new Engine("John", 2.0, 3);
        CommercialMower como = new CommercialMower(9.8, true );
        como.setEngine(eng);
        como.setManufacturer("John Deere");
        como.setModel("Model 3");
        como.setDeckWidth(3.3);
        como.setYear(1998);
        como.setSerialNumber("43985983");
        como.setSubtype("C"); 
        
        LawnTractor lawn = new LawnTractor(eng, "Deere", 9.9);
        lawn.setEngine(eng);
        lawn.setManufacturer("Jhn Dere");
        lawn.setModel("Model 3");
        lawn.setDeckWidth(3.3);
        lawn.setYear(1998);
        lawn.setSerialNumber("43985983");
        lawn.setSubtype("L"); 
        
        GasPoweredMower gas = new GasPoweredMower(eng, true);
        gas.setCutWidth(6.7);
        gas.setManufacturer("Dohn Jeere");
        gas.setSerialNumber("4523653645");
        gas.setYear(1997);
        gas.setWheelDiameter(3.4);
        gas.setSubtype("G");
        
        PushReelMower push = new PushReelMower(4);
        push.setCutWidth(3.6);
        push.setManufacturer("ereeD nhoJ");
        push.setWheelDiameter(6.3);
        push.setYear(1993);
        push.setSerialNumber("53896675");
        push.setSubtype("P");

        ArrayList<Mower> mowers = new ArrayList<Mower>();
        mowers.add(como);
        mowers.add(gas);
        mowers.add(lawn);
        mowers.add(push);
        
        
        MowerWareHouse ware = new MowerWareHouse();
        
        String out = como.toString() + gas.toString() + lawn.toString()
                + push.toString();
        
        JOptionPane.showMessageDialog(null, out);
        
        
        //String mowerObjects ="";
        //for (int i = 0; i < ware.getNumMowers(); i++) {
        //    mowerObjects += ware.getMower(i).toString();
        //}
        
        
        //System.out.println(como.toString());
        //System.out.println(gas.toString());
        //System.out.println(lawn.toString());
        //System.out.println(push.toString());
        
       String file = args[0];
       MowerWareHouse mwh = new MowerWareHouse(); 
       mwh.readMowerData(file);
       //JOptionPane.showMessageDialog(null, de.toString());
       mwh.saveMowerData("output.txt");
    }
    
}
