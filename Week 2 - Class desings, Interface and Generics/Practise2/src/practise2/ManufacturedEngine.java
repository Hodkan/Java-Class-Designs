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
public class ManufacturedEngine implements Engine{
    private String engineManufacturer;
    private Date engineManufacturedDate;
    private String engineMake;
    private String engineModel;
    private int engineCylinders;
    private String engineType;
    private String driveTrain;
    
    
    public ManufacturedEngine(){
        engineManufacturer = "Generic";
        engineManufacturedDate = new Date();
        engineMake = "Generic";
        engineModel = "Generic";
        engineCylinders = 0;
        engineType = "85 AKI";
        driveTrain = "2WD: Two-Wheel Drives";   
    }
    
public ManufacturedEngine(String eManufacturer,Date eManufacturedDate, String eMake
        , String eModel, int eCylinders, String eType, String dTrain){
    engineManufacturer = eManufacturer;
    engineManufacturedDate = eManufacturedDate;
    engineMake = eMake;
    engineModel = eModel;
    engineCylinders = eCylinders;
    engineType = eType;
    driveTrain = dTrain;     
}

public String toString(){
    return ("Engine Manufacturer : " + engineManufacturer + "\n" +
            "Engine ManufactureDate: " + engineManufacturedDate + "\n"+
            "Engine Make: " + engineMake + "\n"+ "Engine Model: " + engineModel + "\n"+
            "Engine Type: " + engineType + "\n" + "Engine Cylinders: "+ engineCylinders + "\n" +
            "Drive Train: " + driveTrain);
}

 public static void main(String[] args) throws ParseException {
     DateFormat df = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
     Date d1 = df.parse("Tue Jan 03 07:13:19 MST 2012");
     ManufacturedEngine first = new ManufacturedEngine();
     ManufacturedEngine second = new ManufacturedEngine("Honda",d1,"H-Series","H23A1",4,"88 AKI","2WD: Two-Wheel Drive");
     System.out.println("First One: ");
     System.out.println(first.toString());
     System.out.println( "\n" + "Second One: " );
     System.out.println(second.toString());
       
    }

    @Override
    public void setEngineCylinders(int engineCylinders) {
       this.engineCylinders = engineCylinders;
    }

    @Override
    public void setEngineManufacturedDate(Date date) {
        this.engineManufacturedDate = date;
    }

    @Override
    public void setEngineManufacturer(String manufacturer) {
        this.engineManufacturer = manufacturer;
    }

    @Override
    public void setEngineMake(String engineMake) {
      this.engineMake = engineMake;
    }

    @Override
    public void setEngineModel(String engineModel) {
      this.engineModel = engineModel;
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    @Override
    public void setEngineType(String fuel) {
        this.engineType = fuel;
    }
   
    
    
}
