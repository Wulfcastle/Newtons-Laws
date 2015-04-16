/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Nov Exam
 */
public class Block {
    
    public double mass;
    public double acceleration;
    public double friction;

    public Block(double mass, double acceleration, double friction) {
        this.mass = mass;
        this.acceleration = acceleration;
        this.friction = friction;
    }

    public double getFriction() {
        return friction;
    }

    public void setFriction(double friction) {
        this.friction = friction;
    }

    public double getMass() {
        return mass;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    

}
