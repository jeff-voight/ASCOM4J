package ASCOM.DeviceInterface;

/*

 Defines the IRotator Interface
 


*/
public class IRotatorV2{

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

 Indicates whether the Rotator supports the  method.
 

		Must be implemented and must not throw a PropertyNotImplementedException. 
	
*/
private double CanReverse;
/*

 Indicates whether the rotator is currently moving
 
Rotation is asynchronous, that is, when the Move method is called, it starts the rotation, then returns 
 immediately. During rotation,  must be True, else it must be False.
*/
private double IsMoving;
/*

 Current instantaneous Rotator position, in degrees.
 

 The position is expressed as an angle from 0 up to but not including 360 degrees, counter-clockwise against the 
 sky. This is the standard definition of Position Angle. However, the rotator does not need to (and in general will not) 
 report the true Equatorial Position Angle, as the attached imager may not be precisely aligned with the rotator's indexing. 
 It is up to the client to determine any offset between mechanical rotator position angle and the true Equatorial Position 
 Angle of the imager, and compensate for any difference. 
 The optional  property is provided in order to manage rotators being used on optics with odd or 
 even number of reflections. With the Reverse switch in the correct position for the optics, the reported position angle must 
 be counter-clockwise against the sky.
	
*/
private double Position;
/*

 Sets or Returns the rotator’s Reverse state.
 
See the definition of . Raises an error if not supported. 
*/
private double Reverse;
/*

 The minimum StepSize, in degrees.
 

 Raises an exception if the rotator does not intrinsically know what the step size is.
 
*/
private double StepSize;
/*

 The destination position angle for Move() and MoveAbsolute().
 

 Upon calling Move or MoveAbsolute, this property immediately changes to the position angle to which the rotator is moving. The value is retained until a subsequent call 
 to Move or MoveAbsolute.
 
*/
private double TargetPosition;


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

 Immediately stop any Rotator motion due to a previous Move or MoveAbsolute method call.
 
This is an optional method. Raises an error if not supported.
*/
public void Halt(){
return null;
}


/*

 Causes the rotator to move Position degrees relative to the current  value.
 

 Calling Move causes the  property to change to the sum of the current angular position 
 and the value of the  parameter (modulo 360 degrees), then starts rotation to .
 
*/
public void Move(Single){
return null;
}


/*

 Causes the rotator to move the absolute position of  degrees.
 
Calling MoveAbsolute causes the  property to change to the value of the
  parameter, then starts rotation to . 
*/
public void MoveAbsolute(Single){
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
 Indicates whether the Rotator supports the  method.
 

		Must be implemented and must not throw a PropertyNotImplementedException. 
	
*/
public void setCanReverse(double _theValue){
this.CanReverse=_theValue;
}

/*
 Gets 
 Indicates whether the Rotator supports the  method.
 

		Must be implemented and must not throw a PropertyNotImplementedException. 
	
*/
public double getCanReverse(){
return CanReverse;
}

/*
 Sets 
 Indicates whether the rotator is currently moving
 
Rotation is asynchronous, that is, when the Move method is called, it starts the rotation, then returns 
 immediately. During rotation,  must be True, else it must be False.
*/
public void setIsMoving(double _theValue){
this.IsMoving=_theValue;
}

/*
 Gets 
 Indicates whether the rotator is currently moving
 
Rotation is asynchronous, that is, when the Move method is called, it starts the rotation, then returns 
 immediately. During rotation,  must be True, else it must be False.
*/
public double getIsMoving(){
return IsMoving;
}

/*
 Sets 
 Current instantaneous Rotator position, in degrees.
 

 The position is expressed as an angle from 0 up to but not including 360 degrees, counter-clockwise against the 
 sky. This is the standard definition of Position Angle. However, the rotator does not need to (and in general will not) 
 report the true Equatorial Position Angle, as the attached imager may not be precisely aligned with the rotator's indexing. 
 It is up to the client to determine any offset between mechanical rotator position angle and the true Equatorial Position 
 Angle of the imager, and compensate for any difference. 
 The optional  property is provided in order to manage rotators being used on optics with odd or 
 even number of reflections. With the Reverse switch in the correct position for the optics, the reported position angle must 
 be counter-clockwise against the sky.
	
*/
public void setPosition(double _theValue){
this.Position=_theValue;
}

/*
 Gets 
 Current instantaneous Rotator position, in degrees.
 

 The position is expressed as an angle from 0 up to but not including 360 degrees, counter-clockwise against the 
 sky. This is the standard definition of Position Angle. However, the rotator does not need to (and in general will not) 
 report the true Equatorial Position Angle, as the attached imager may not be precisely aligned with the rotator's indexing. 
 It is up to the client to determine any offset between mechanical rotator position angle and the true Equatorial Position 
 Angle of the imager, and compensate for any difference. 
 The optional  property is provided in order to manage rotators being used on optics with odd or 
 even number of reflections. With the Reverse switch in the correct position for the optics, the reported position angle must 
 be counter-clockwise against the sky.
	
*/
public double getPosition(){
return Position;
}

/*
 Sets 
 Sets or Returns the rotator’s Reverse state.
 
See the definition of . Raises an error if not supported. 
*/
public void setReverse(double _theValue){
this.Reverse=_theValue;
}

/*
 Gets 
 Sets or Returns the rotator’s Reverse state.
 
See the definition of . Raises an error if not supported. 
*/
public double getReverse(){
return Reverse;
}

/*
 Sets 
 The minimum StepSize, in degrees.
 

 Raises an exception if the rotator does not intrinsically know what the step size is.
 
*/
public void setStepSize(double _theValue){
this.StepSize=_theValue;
}

/*
 Gets 
 The minimum StepSize, in degrees.
 

 Raises an exception if the rotator does not intrinsically know what the step size is.
 
*/
public double getStepSize(){
return StepSize;
}

/*
 Sets 
 The destination position angle for Move() and MoveAbsolute().
 

 Upon calling Move or MoveAbsolute, this property immediately changes to the position angle to which the rotator is moving. The value is retained until a subsequent call 
 to Move or MoveAbsolute.
 
*/
public void setTargetPosition(double _theValue){
this.TargetPosition=_theValue;
}

/*
 Gets 
 The destination position angle for Move() and MoveAbsolute().
 

 Upon calling Move or MoveAbsolute, this property immediately changes to the position angle to which the rotator is moving. The value is retained until a subsequent call 
 to Move or MoveAbsolute.
 
*/
public double getTargetPosition(){
return TargetPosition;
}
}
