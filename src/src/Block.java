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
    public double force;

    public Block(double mass, double acceleration, double force) {
        this.mass = mass;
        this.acceleration = acceleration;
        this.force = force;
    }

    public double getMass() {
        return mass;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public double getForce() {
        return force;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public void setForce(double force) {
        this.force = force;
    }
    

}
