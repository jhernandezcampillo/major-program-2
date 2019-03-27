/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package major.pro.pkg2;

import java.util.ArrayList;

/**
 *
 * @author Judith
 */
public class MowerWareHouse {
    private String storeName;
    private ArrayList<Mower> mowers;
    
    public MowerWareHouse(){
        storeName = "";
        mowers = new ArrayList<Mower>(); 
    }
    public MowerWareHouse(String store, ArrayList<Mower> al){
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
    public int getNumMowers(){
        return mowers.size();
    }
    public Mower getMower(int index){
        return mowers.get(index);
    }
    public void setMower(int index, Mower item){
        mowers.set(index,item);
    }
    public void addMower(Mower item){
        mowers.add(item);
    }
    public Mower removeMower(int index){
        return mowers.remove(index);
    }
    @Override
    public String toString(){
        
        String nl = System.lineSeparator();
        String output = storeName + nl;
        for(int i = 0; i < mowers.size();i++){
            output += mowers.get(i).toString();
        }
        return output;
    }
}
