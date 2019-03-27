/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package major.pro.pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFileChooser;

/**
 *
 * @author Judith
 */
public class MowerWareHouse {
    
    private String storeName;
    private ArrayList<Mower> mowers;
    
    public MowerWareHouse() {
        storeName = "";
        mowers = new ArrayList<Mower>();
    }
    
    public MowerWareHouse(String store, ArrayList<Mower> al) {
        storeName = store;
        mowers = al;
    }

    /**
     * @return the storeName
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * @param storeName the storeName to set
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    
    public int getNumMowers() {
        return mowers.size();
    }
    
    public Mower getMower(int index) {
        return mowers.get(index);
    }
    
    public void setMower(int index, Mower item) {
        mowers.set(index, item);
    }
    
    public void addMower(Mower item) {
        mowers.add(item);
    }
    
    public Mower removeMower(int index) {
        return mowers.remove(index);
    }
    
    @Override
    public String toString() {
        
        String nl = System.lineSeparator();
        String output = storeName + nl;
        for (int i = 0; i < mowers.size(); i++) {
            output += mowers.get(i).toString();
        }
        return output;
    }
    
    protected void setMower(Mower m, String manu, int year, String serNum, String sub) {
        
        m.setManufacturer(manu);
        m.setYear(year);
        m.setSerialNumber(serNum);
        m.setSubtype(sub);
        addMower(m);
    }
    
    protected void setEngine(Engine e, String manu, double horse, int cyl) {
        e.setManufacturer(manu);
        e.setHorsePower(horse);
        e.setCylinders(cyl);
        
    }
    
    protected void setLawnTractor(LawnTractor lawn, String m, double deck) {
        lawn.setModel(m);
        lawn.setDeckWidth(deck);
    }
    
    protected void setWalkBehindMower(WalkBehindMower behind, double c, double w) {
        behind.setCutWidth(c);
        behind.setWheelDiameter(w);
        
    }
    
    public void readMowerData(String inputFileName){
        try {
            
            Scanner scan = new Scanner(new File(inputFileName));
            setStoreName(scan.nextLine());
            while (scan.hasNext()) {
                String manu = scan.nextLine();
                int year =Integer.parseInt(scan.next().trim());
                scan.nextLine();
                String serNum = scan.nextLine();
                String sub = scan.nextLine().trim();
                
                if (sub.equals("L")) {
                    LawnTractor lawn = new LawnTractor();
                    setMower(lawn, manu, year, serNum, sub);
                    Engine e = new Engine();
                    setEngine(e, scan.nextLine(), scan.nextDouble(), scan.nextInt());
                    scan.nextLine();
                    lawn.setEngine(e);
                    setLawnTractor(lawn, scan.nextLine(), Double.parseDouble(scan.nextLine()));
                    //if (scan.hasNext()) {
                    //    scan.nextLine();
                    //}
                }
                if (sub.equals("C")) {
                    CommercialMower c = new CommercialMower();
                    setMower(c, manu, year, serNum, sub);
                    Engine e = new Engine();
                    setEngine(e, scan.nextLine(), scan.nextDouble(), scan.nextInt());
                    scan.nextLine();
                    c.setEngine(e);
                    setLawnTractor(c, scan.nextLine(), Double.parseDouble(scan.nextLine().trim()));
                    c.setOperatingHours(Double.parseDouble(scan.nextLine()));
                    c.setZeroTurnRadius(Boolean.parseBoolean(scan.nextLine()));
                    //if (scan.hasNext()) {
                    //    scan.nextLine();
                    //}
                }
                if (sub.equals("G")) {
                    GasPoweredMower g = new GasPoweredMower();
                    setMower(g, manu, year, serNum, sub);
                    setWalkBehindMower(g, scan.nextDouble(), scan.nextDouble());
                    scan.nextLine();
                    Engine e = new Engine();
                    setEngine(e, scan.nextLine(), scan.nextDouble(), scan.nextInt());
                    scan.nextLine();
                    g.setEngine(e);
                    g.setSelfPropelled(Boolean.parseBoolean(scan.nextLine().trim()));
                    //if (scan.hasNext()) {
                    //    scan.nextLine();
                    //}
                    
                }
                if (sub.equals("P")) {
                    PushReelMower p = new PushReelMower();
                    setMower(p, manu, year, serNum, sub);
                    setWalkBehindMower(p, scan.nextDouble(), scan.nextDouble());
                    p.setNumWheels(scan.nextInt());
                    if (scan.hasNext()) {
                        scan.nextLine();
                    }
                }
            }
            
        } catch (FileNotFoundException ex) {
            JButton openSaysMe = new JButton();
            JFileChooser pick = new JFileChooser();
            pick.setDialogTitle("Choose a file please.");
            if (pick.showOpenDialog(openSaysMe) == JFileChooser.APPROVE_OPTION) {
                readMowerData(pick.getSelectedFile().getAbsolutePath());
            }
            
        }
    }
    
    public void saveMowerData(String outputFileName) {
        try {
            PrintWriter print = new PrintWriter(outputFileName);
            print.print(toString());
            print.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File not found");
            System.exit(-1);
        }
    }
}
