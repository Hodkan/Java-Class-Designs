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
public class VehicleChassis implements Chassis {
    String chassisName;
    public VehicleChassis(){
        this.chassisName = Chassis.chassis;    
    }
    public VehicleChassis(String chassisName){
        this.chassisName=chassisName;
    }
    
    public Chassis getChassisType(){
        return this;
    }

    @Override
    public void setChassisType(String vehicleChassis) {
        chassisName=vehicleChassis;
    }
    
    public String toString(){
        return "Chassis Name   : " +this.chassisName;
    }
    
    public static void main(String[] args) {
        String ParaName = "2nd Chassis";
       VehicleChassis first = new VehicleChassis();
       VehicleChassis second = new VehicleChassis(ParaName);
       //System.out.println(first);
       //System.out.println(second);      
    }
}
