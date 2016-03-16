package ASCOM.Utilities.Interfaces;

/*

 Interface to the .NET Chooser component
 


*/
public class IChooser{

/*

 The type of device for which the Chooser will select a driver. (String, default = "Telescope")
 
This property changes the "personality" of the Chooser, allowing it to be used to select a driver for any arbitrary 
 ASCOM device type. The default value for this is "Telescope", but it could be "Focuser", "Camera", etc. 
 This property is independent of the Profile object's DeviceType property. Setting Chooser's DeviceType 
 property doesn't set the DeviceType property in Profile, you must set that also when needed.
	
*/
private double DeviceType;


/*

 Select ASCOM driver to use including pre-selecting one in the dropdown list
 
The supplied driver will be pre-selected in the Chooser's list when the chooser window is first opened.
 
*/
public void Choose(String){
return null;
}

/*
 Sets 
 The type of device for which the Chooser will select a driver. (String, default = "Telescope")
 
This property changes the "personality" of the Chooser, allowing it to be used to select a driver for any arbitrary 
 ASCOM device type. The default value for this is "Telescope", but it could be "Focuser", "Camera", etc. 
 This property is independent of the Profile object's DeviceType property. Setting Chooser's DeviceType 
 property doesn't set the DeviceType property in Profile, you must set that also when needed.
	
*/
public void setDeviceType(double _theValue){
this.DeviceType=_theValue;
}

/*
 Gets 
 The type of device for which the Chooser will select a driver. (String, default = "Telescope")
 
This property changes the "personality" of the Chooser, allowing it to be used to select a driver for any arbitrary 
 ASCOM device type. The default value for this is "Telescope", but it could be "Focuser", "Camera", etc. 
 This property is independent of the Profile object's DeviceType property. Setting Chooser's DeviceType 
 property doesn't set the DeviceType property in Profile, you must set that also when needed.
	
*/
public double getDeviceType(){
return DeviceType;
}
}
