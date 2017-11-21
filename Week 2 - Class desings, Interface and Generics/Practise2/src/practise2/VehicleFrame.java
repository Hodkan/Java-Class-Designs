/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practise2;

/**
 *
 * @author P304320
 */
public class VehicleFrame implements Chassis{
    String vehicleFrameType;
   
    public VehicleFrame(){
        this.vehicleFrameType = "Unibody";
    }
    
    public VehicleFrame(String vehicleFrameType){
        this.vehicleFrameType = vehicleFrameType;
    }
    @Override
    public Chassis getChassisType() {
        return this;
    }

    @Override
    public void setChassisType(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }
    
    public String toString(){
       System.out.println("Chassis         : " + Chassis.chassis + "\n"
                + "Vehicle Frame    : " + this.vehicleFrameType);
       return null;
    }
    
    public static void main(String[] args) {
     VehicleFrame first = new VehicleFrame();
     first.toString();
     
     VehicleFrame second = new VehicleFrame("Ladder Frame");
     second.toString();
        
    }
     
    
}
