package ASCOM.DeviceInterface;

/*

 Defines the ISwitchV2 Interface
 


		The Switch interface is used to define a number of 'switch devices'. A switch device can be used to control something, such as a power switch
 or may be used to sense the state of something, such as a limit switch.
		This SwitchV2 interface is an extension of the original Switch interface.  The changes allow devices to have more than two states and
 to distinguish between devices that are writable and those that are read only.
		Compatibility between Switch and SwitchV2 interfaces:
		Switch devices that implemented the original Switch interface and
 client applications that use the original interface will still work together.
			Client applications that implement the original
 Switch interface should still work with drivers that implement the new interface.
			Client applications that use the new features in this interface
 will not work with drivers that do not implement the new interface.
		
		Each device has a CanWrite method, this is true if it can be written to or false if the device can only be read.
		The new MinSwitchValue, MaxSwitchValue and SwitchStep methods are used to define the range and values that a device can handle.
 This also defines the number of different values - states - that a device can have, from two for a traditional on-off switch, through
 those with a small number of states to those which have many states.
		The SetSwitchValue and GetSwitchValue methods are used to set and get the value of a device as a double.
		There is no fundamental difference between devices with different numbers of states.
		Naming Conventions
		Each device handled by a Switch is known as a device or switch device for general cases,
 a controller device if it can alter the state of the device and a sensor device if it can only be read.
		For convenience devices are referred to as boolean if the device can only have two states, and multi-state if it can have more than two values.
 These are treated the same in the interface definition.
	
*/
public class ISwitchV2{

/*

 Set True to connect to the device hardware. Set False to disconnect from the device hardware.
 You can also read the property to check whether it is connected. This reports the current hardware state.
 

		Must be implementedDo not use a NotConnectedException here, that exception is for use in other methods that require a connection in order to succeed.
 The Connected property sets and reports the state of connection to the device hardware.
 For a hub this means that Connected will be true when the first driver connects and will only be set to false
 when all drivers have disconnected.  A second driver may find that Connected is already true and
 setting Connected to false does not report Connected as false.  This is not an error because the physical state is that the
 hardware connection is still true.
		Multiple calls setting Connected to true or false will not cause an error.
	
*/
private double Connected;
/*

 Returns a description of the device, such as manufacturer and modelnumber. Any ASCII characters may be used. 
 
Must be implemented
	
*/
private double Description;
/*

 Descriptive and version information about this ASCOM driver.
 

		Must be implemented This string may contain line endings and may be hundreds to thousands of characters long.
 It is intended to display detailed information on the ASCOM driver, including version and copyright data.
 See the  property for information on the device itself.
 To get the driver version in a parseable string, use the  property.
 
*/
private double DriverInfo;
/*

 A string containing only the major and minor version of the driver.
 
Must be implemented This must be in the form "n.n".
 It should not to be confused with the  property, which is the version of this specification supported by the 
 driver.
 
*/
private double DriverVersion;
/*

 The interface version number that this device supports. Should return 2 for this interface version.
 
Must be implemented Clients can detect legacy V1 drivers by trying to read ths property.
 If the driver raises an error, it is a V1 driver. V1 did not specify this property. A driver may also return a value of 1. 
 In other words, a raised error or a return value of 1 indicates that the driver is a V1 driver.
 
*/
private double InterfaceVersion;
/*

 The short name of the driver, for display purposes
 
Must be implemented
	
*/
private double Name;
/*

 Returns the list of action names supported by this driver.
 
Must be implemented This method must return an empty arraylist if no actions are supported. Please do not throw a 
 .
 This is an aid to client authors and testers who would otherwise have to repeatedly poll the driver to determine its capabilities. 
 Returned action names may be in mixed case to enhance presentation but  will be recognised case insensitively in 
 the Action method.
		An array list collection has been selected as the vehicle for  action names in order to make it easier for clients to
 determine whether a particular action is supported. This is easily done through the Contains method. Since the
 collection is also ennumerable it is easy to use constructs such as For Each ... to operate on members without having to be concerned 
 about hom many members are in the collection. 
		Collections have been used in the Telescope specification for a number of years and are known to be compatible with COM. Within .NET
 the ArrayList is the correct implementation to use as the .NET Generic methods are not compatible with COM.
	
*/
private double SupportedActions;
/*

 The number of switch devices managed by this driver
 
Must be implemented, must not throw a 
		Devices are numbered from 0 to  - 1
*/
private double MaxSwitch;


/*

 Launches a configuration dialog box for the driver.  The call will not return
 until the user clicks OK or cancel manually.
 
Must be implemented
	
*/
public void SetupDialog(){
return null;
}


/*

 Invokes the specified device-specific action.
 
Can throw a not implemented exception 
 This method is intended for use in all current and future device types and to avoid name clashes, management of action names 
 is important from day 1. A two-part naming convention will be adopted - DeviceType:UniqueActionName where:
 
			DeviceType is the same value as would be used by  e.g. Telescope, Camera, Switch etc.
			UniqueActionName is a single word, or multiple words joined by underscore characters, that sensibly describes the action to be performed.
		
		
 It is recommended that UniqueActionNames should be a maximum of 16 characters for legibility.
 Should the same function and UniqueActionName be supported by more than one type of device, the reserved DeviceType of 
 “General” will be used. Action names will be case insensitive, so FilterWheel:SelectWheel, filterwheel:selectwheel 
 and FILTERWHEEL:SELECTWHEEL will all refer to the same action.
		The names of all supported actions must be returned in the  property.
	
*/
public void Action(String,String){
return null;
}


/*

 Transmits an arbitrary string to the device and does not wait for a response.
 Optionally, protocol framing characters may be added to the string before transmission.
 
Can throw a not implemented exception
	
*/
public void CommandBlind(String,Boolean){
return null;
}


/*

 Transmits an arbitrary string to the device and waits for a boolean response.
 Optionally, protocol framing characters may be added to the string before transmission.
 
Can throw a not implemented exception
	
*/
public void CommandBool(String,Boolean){
return null;
}


/*

 Transmits an arbitrary string to the device and waits for a string response.
 Optionally, protocol framing characters may be added to the string before transmission.
 
Can throw a not implemented exception
	
*/
public void CommandString(String,Boolean){
return null;
}


/*

 Dispose the late-bound interface, if needed. Will release it via COM
 if it is a COM object, else if native .NET will just dereference it
 for GC.
 

*/
public void Dispose(){
return null;
}


/*

 Return the name of switch device n.
 
Must be implemented, must not throw an ASCOM.MethodNotImplementedException
		Devices are numbered from 0 to  - 1
*/
public void GetSwitchName(Int16){
return null;
}


/*

 Set a switch device name to a specified value.
 
Can throw a  if the device name can not be set by the application.
		Devices are numbered from 0 to  - 1
	
*/
public void SetSwitchName(Int16,String){
return null;
}


/*

 Gets the description of the specified switch device. This is to allow a fuller description of
 the device to be returned, for example for a tool tip.
 
Must be implemented, must not throw an ASCOM.MethodNotImplementedException
		Decices are numbered from 0 to  - 1
		This is a Version 2 method.
	
*/
public void GetSwitchDescription(Int16){
return null;
}


/*

 Reports if the specified switch device can be written to, default true.
 This is false if the device cannot be written to, for example a limit switch or a sensor.
 
Must be implemented, must not throw an ASCOM.MethodNotImplementedException
		Devices are numbered from 0 to  - 1
		This is a Version 2 method, version 1 switch devices can be assumed to be writable.
	
*/
public void CanWrite(Int16){
return null;
}


/*

 Return the state of switch device id as a boolean
 
Must be implemented, must not throw a .
		All devices must implement this. A multi-state device will return true if the device is at the maximum value, false if the value is at the minumum
 and either true or false as specified by the driver developer for intermediate values.
		Some devices do not support reading their state although they do allow state to be set. In these cases, on startup, the driver can not know the hardware state and it is recommended that the 
 driver either:
		
			Sets the device to a known state on connection
			Throws an  until the client software has set the device state for the first time
		
		In both cases the driver should save a local copy of the state which it last set and return this through  and 
		Devices are numbered from 0 to  - 1
*/
public void GetSwitch(Int16){
return null;
}


/*

 Sets a switch controller device to the specified state, true or false.
 
Can throw a  if  is False.
		 must return  if the set state is true and  if the set state is false.
		Devices are numbered from 0 to  - 1
*/
public void SetSwitch(Int16,Boolean){
return null;
}


/*

 Returns the maximum value for this switch device, this must be greater than .
 
Must be implemented, must not throw a .
		If a two state device cannot report its state,   should return the value 1.0.
		 Devices are numbered from 0 to  - 1.
		This is a Version 2 method.
	
*/
public void MaxSwitchValue(Int16){
return null;
}


/*

 Returns the minimum value for this switch device, this must be less than 
	
Must be implemented, must not throw a .
		If a two state device cannot report its state,  should return the value 0.0.
		 Devices are numbered from 0 to  - 1.
		This is a Version 2 method.
	
*/
public void MinSwitchValue(Int16){
return null;
}


/*

 Returns the step size that this device supports (the difference between successive values of the device).
 
Must be implemented, must not throw .
		SwitchStep, MinSwitchValue and MaxSwitchValue can be used to determine the way the device is controlled and/or displayed,
 for example by setting the number of decimal places or number of states for a display.
		 must be greater than zero and the number of steps can be calculated as:
 (( - ) / ) + 1.
		The switch range ( - ) must be an exact multiple of .
		If a two state device cannot report its state,  should return the value 1.0.
		Devices are numbered from 0 to  - 1.
		This is a Version 2 method.
	
*/
public void SwitchStep(Int16){
return null;
}


/*

 Returns the value for switch device id as a double
 
Must be implemented, must not throw a .
		Some devices do not support reading their state although they do allow state to be set. In these cases, on startup, the driver can not know the hardware state and it is recommended that the 
 driver either:
		
			Sets the device to a known state on connection
			Throws an  until the client software has set the device state for the first time
		
		In both cases the driver should save a local copy of the state which it last set and return this through  and 
		Devices are numbered from 0 to  - 1.
		This is a Version 2 method.
	
*/
public void GetSwitchValue(Int16){
return null;
}


/*

 Set the value for this device as a double.
 
Can throw a  if  is False.
		If the value is more than  or less than 
 then the method must throw an .
		A set value that is intermediate between the values specified by  should result in the device being set to an achievable value close to the requested set value.
		Devices are numbered from 0 to  - 1.
		This is a Version 2 method.
	
*/
public void SetSwitchValue(Int16,Double){
return null;
}

/*
 Sets 
 Set True to connect to the device hardware. Set False to disconnect from the device hardware.
 You can also read the property to check whether it is connected. This reports the current hardware state.
 

		Must be implementedDo not use a NotConnectedException here, that exception is for use in other methods that require a connection in order to succeed.
 The Connected property sets and reports the state of connection to the device hardware.
 For a hub this means that Connected will be true when the first driver connects and will only be set to false
 when all drivers have disconnected.  A second driver may find that Connected is already true and
 setting Connected to false does not report Connected as false.  This is not an error because the physical state is that the
 hardware connection is still true.
		Multiple calls setting Connected to true or false will not cause an error.
	
*/
public void setConnected(double _theValue){
this.Connected=_theValue;
}

/*
 Gets 
 Set True to connect to the device hardware. Set False to disconnect from the device hardware.
 You can also read the property to check whether it is connected. This reports the current hardware state.
 

		Must be implementedDo not use a NotConnectedException here, that exception is for use in other methods that require a connection in order to succeed.
 The Connected property sets and reports the state of connection to the device hardware.
 For a hub this means that Connected will be true when the first driver connects and will only be set to false
 when all drivers have disconnected.  A second driver may find that Connected is already true and
 setting Connected to false does not report Connected as false.  This is not an error because the physical state is that the
 hardware connection is still true.
		Multiple calls setting Connected to true or false will not cause an error.
	
*/
public double getConnected(){
return Connected;
}

/*
 Sets 
 Returns a description of the device, such as manufacturer and modelnumber. Any ASCII characters may be used. 
 
Must be implemented
	
*/
public void setDescription(double _theValue){
this.Description=_theValue;
}

/*
 Gets 
 Returns a description of the device, such as manufacturer and modelnumber. Any ASCII characters may be used. 
 
Must be implemented
	
*/
public double getDescription(){
return Description;
}

/*
 Sets 
 Descriptive and version information about this ASCOM driver.
 

		Must be implemented This string may contain line endings and may be hundreds to thousands of characters long.
 It is intended to display detailed information on the ASCOM driver, including version and copyright data.
 See the  property for information on the device itself.
 To get the driver version in a parseable string, use the  property.
 
*/
public void setDriverInfo(double _theValue){
this.DriverInfo=_theValue;
}

/*
 Gets 
 Descriptive and version information about this ASCOM driver.
 

		Must be implemented This string may contain line endings and may be hundreds to thousands of characters long.
 It is intended to display detailed information on the ASCOM driver, including version and copyright data.
 See the  property for information on the device itself.
 To get the driver version in a parseable string, use the  property.
 
*/
public double getDriverInfo(){
return DriverInfo;
}

/*
 Sets 
 A string containing only the major and minor version of the driver.
 
Must be implemented This must be in the form "n.n".
 It should not to be confused with the  property, which is the version of this specification supported by the 
 driver.
 
*/
public void setDriverVersion(double _theValue){
this.DriverVersion=_theValue;
}

/*
 Gets 
 A string containing only the major and minor version of the driver.
 
Must be implemented This must be in the form "n.n".
 It should not to be confused with the  property, which is the version of this specification supported by the 
 driver.
 
*/
public double getDriverVersion(){
return DriverVersion;
}

/*
 Sets 
 The interface version number that this device supports. Should return 2 for this interface version.
 
Must be implemented Clients can detect legacy V1 drivers by trying to read ths property.
 If the driver raises an error, it is a V1 driver. V1 did not specify this property. A driver may also return a value of 1. 
 In other words, a raised error or a return value of 1 indicates that the driver is a V1 driver.
 
*/
public void setInterfaceVersion(double _theValue){
this.InterfaceVersion=_theValue;
}

/*
 Gets 
 The interface version number that this device supports. Should return 2 for this interface version.
 
Must be implemented Clients can detect legacy V1 drivers by trying to read ths property.
 If the driver raises an error, it is a V1 driver. V1 did not specify this property. A driver may also return a value of 1. 
 In other words, a raised error or a return value of 1 indicates that the driver is a V1 driver.
 
*/
public double getInterfaceVersion(){
return InterfaceVersion;
}

/*
 Sets 
 The short name of the driver, for display purposes
 
Must be implemented
	
*/
public void setName(double _theValue){
this.Name=_theValue;
}

/*
 Gets 
 The short name of the driver, for display purposes
 
Must be implemented
	
*/
public double getName(){
return Name;
}

/*
 Sets 
 Returns the list of action names supported by this driver.
 
Must be implemented This method must return an empty arraylist if no actions are supported. Please do not throw a 
 .
 This is an aid to client authors and testers who would otherwise have to repeatedly poll the driver to determine its capabilities. 
 Returned action names may be in mixed case to enhance presentation but  will be recognised case insensitively in 
 the Action method.
		An array list collection has been selected as the vehicle for  action names in order to make it easier for clients to
 determine whether a particular action is supported. This is easily done through the Contains method. Since the
 collection is also ennumerable it is easy to use constructs such as For Each ... to operate on members without having to be concerned 
 about hom many members are in the collection. 
		Collections have been used in the Telescope specification for a number of years and are known to be compatible with COM. Within .NET
 the ArrayList is the correct implementation to use as the .NET Generic methods are not compatible with COM.
	
*/
public void setSupportedActions(double _theValue){
this.SupportedActions=_theValue;
}

/*
 Gets 
 Returns the list of action names supported by this driver.
 
Must be implemented This method must return an empty arraylist if no actions are supported. Please do not throw a 
 .
 This is an aid to client authors and testers who would otherwise have to repeatedly poll the driver to determine its capabilities. 
 Returned action names may be in mixed case to enhance presentation but  will be recognised case insensitively in 
 the Action method.
		An array list collection has been selected as the vehicle for  action names in order to make it easier for clients to
 determine whether a particular action is supported. This is easily done through the Contains method. Since the
 collection is also ennumerable it is easy to use constructs such as For Each ... to operate on members without having to be concerned 
 about hom many members are in the collection. 
		Collections have been used in the Telescope specification for a number of years and are known to be compatible with COM. Within .NET
 the ArrayList is the correct implementation to use as the .NET Generic methods are not compatible with COM.
	
*/
public double getSupportedActions(){
return SupportedActions;
}

/*
 Sets 
 The number of switch devices managed by this driver
 
Must be implemented, must not throw a 
		Devices are numbered from 0 to  - 1
*/
public void setMaxSwitch(double _theValue){
this.MaxSwitch=_theValue;
}

/*
 Gets 
 The number of switch devices managed by this driver
 
Must be implemented, must not throw a 
		Devices are numbered from 0 to  - 1
*/
public double getMaxSwitch(){
return MaxSwitch;
}
}
