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
public class GasPoweredMower extends WalkBehindMower{

    private Engine engine;
    private boolean selfPropelled;

    public GasPoweredMower() {
        engine = null;
        selfPropelled = false;
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
     * @return the selfPropelled
     */
    public boolean isSelfPropelled() {
        return selfPropelled;
    }

    /**
     * @param selfPropelled the selfPropelled to set
     */
    public void setSelfPropelled(boolean selfPropelled) {
        this.selfPropelled = selfPropelled;
    }
    @Override
    public String toString(){
        String nl = System.lineSeparator();
        return engine.toString() + nl + selfPropelled + nl;
    }
}
