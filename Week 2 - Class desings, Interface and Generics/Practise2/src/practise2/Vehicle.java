/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practise2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author P304320
 */

public class Vehicle implements Engine,Chassis {
    
    private Date vehicleManufacturedDate;
    private String vehicleManufacturer;
    private String vehicleMake;
    private String vehicleModel;
    private Chassis vehicleFrame;
    private String vehicleType;
    private String driveTrain;
    private Engine vehicleEngine;
    
    
    public Vehicle() throws ParseException{
       vehicleManufacturer = "Generic";
     
       DateFormat df2 = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
       Date d1 = df2.parse("Tue Jan 03 07:13:19 MST 2012");
       vehicleManufacturedDate = d1;
       vehicleMake = "Generic";
       vehicleModel = "Generic";
       vehicleFrame = new VehicleFrame("generic");
       vehicleType = "None";
       driveTrain = "2WD: Two-Wheel Drive";
       vehicleEngine = new ManufacturedEngine();
    }
    
    public Vehicle(String vManufacturer , Date vManufacturedDate , String vMake, String vModel, Chassis vFrame,
            String vType, String dTrain, Engine vEngine){
        
      vehicleManufacturer = vManufacturer;
      vehicleManufacturedDate = vManufacturedDate;
      vehicleMake = vMake;
      vehicleModel = vModel;
      vehicleFrame = vFrame;
      vehicleType = vType;
      driveTrain = dTrain;
      vehicleEngine = vEngine;   
    }

   
    @Override
    public void setEngineCylinders(int engineCylinders) {
        vehicleEngine.setEngineCylinders(engineCylinders);
    }

    @Override
    public void setEngineManufacturedDate(Date date) {
        vehicleEngine.setEngineManufacturedDate(date);
    }

    @Override
    public void setEngineManufacturer(String manufacturer) {
        vehicleEngine.setEngineManufacturer(manufacturer);
    }

    @Override
    public void setEngineMake(String engineMake) {
        vehicleEngine.setEngineMake(engineMake);
    }

    @Override
    public void setEngineModel(String engineModel) {
        vehicleEngine.setEngineModel(engineModel);
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    @Override
    public void setEngineType(String fuel) {
        vehicleEngine.setEngineType(fuel);    
    }

    @Override
    public Chassis getChassisType() {
        return vehicleFrame;
    }

    @Override
    public void setChassisType(String vehicleChassis) {
        vehicleFrame.setChassisType(vehicleChassis);
    }
    

    public String toString(){
        System.out.println("Manufacturer Name: " + vehicleManufacturer);
        System.out.println("Manufactured Date: " + "Tue Jan 03 07:13:19 MST 2012");
        System.out.println("Vehicle Make: " + vehicleMake );
        System.out.println("Vehicle Model: " + vehicleModel );
        System.out.println("Vehicle Type: " + vehicleType );
        System.out.println(vehicleEngine.toString());
        
        
        return null;
    }
    
    
    
   
    public static void main(String[] args) throws ParseException {
       DateFormat df2 = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
       Date d1 = df2.parse("Tue Jan 03 07:13:19 MST 2012");
       Date d2 = df2.parse("Tue Feb 02 01:38:31 MST 2012");
       ManufacturedEngine secondV = new ManufacturedEngine("Honda",d2,"H-Series","H23A1",4,"88 AKI","2WD: Two-Wheel Drive");
       VehicleFrame secondF = new VehicleFrame();
       Vehicle first = new Vehicle();
       Vehicle second = new Vehicle("Honda",d1,"Honda","Prelude",secondF,"null","2WD: Two-Wheel Drive",secondV);
       
       System.out.println("First One: ");
       first.toString();
       
       System.out.println("Second One: ");
       second.toString();
       
       
    }
    
    
}
