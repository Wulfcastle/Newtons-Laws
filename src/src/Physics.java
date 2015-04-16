/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Nov Exam
 */
public class Physics {
    
    public static final double GRAVITY_CONSTANT = 9.8;
    
    
    
    public double calculateForce(Block abc) {
        double force = 0.0;
        force = (abc.mass * abc.acceleration) + abc.friction; // Fnet = ma
        return force;
    }
    
    public double calculateMass(Block abc, double force) {
        double mass = 0.0;
        mass = (force - abc.friction)/abc.acceleration;
        return mass;
    }
    
    public double calculateAcceleration(Block abc, double force) {
        double acceleration = 0.0;
        acceleration = (force - abc.friction)/abc.mass;
        abc.setAcceleration(acceleration); 
        return acceleration;
    }
    
    public double calculateFriction(Block abc, double force) {
        double friction = 0.0;
        friction = force - (abc.mass * abc.acceleration);
        abc.setFriction(friction);
        return friction;      
    }
    
}
