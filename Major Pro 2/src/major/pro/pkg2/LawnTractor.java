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
public class LawnTractor {
    private Engine engine;
    private String model;
    private double deckWidth;
    
    public LawnTractor(){
        engine = null;
        model = "";
        deckWidth = 0.0;
    }

    /**
     * @return the engine
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * @param engine the engine to set
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the deckWidth
     */
    public double getDeckWidth() {
        return deckWidth;
    }

    /**
     * @param deckWidth the deckWidth to set
     */
    public void setDeckWidth(double deckWidth) {
        this.deckWidth = deckWidth;
    }
    @Override
    public String toString(){
      String nl = System.lineSeparator();
      return engine + nl + model + nl + deckWidth;
    }
}
