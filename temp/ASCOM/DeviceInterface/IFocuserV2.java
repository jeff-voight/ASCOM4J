package ASCOM.DeviceInterface;

/*

 Provides universal access to Focuser drivers
 


*/
public class IFocuserV2{

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
		The Connected property is not implemented in Version 1 drivers; these use the 
 property and will raise a Not Implemented exception for this property. Version 2 drivers must implement both Connected and Link.
 Applications should check that InterfaceVersion returns 2 or more before using Connected.
	
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

 True if the focuser is capable of absolute position; that is, being commanded to a specific step location.
 
Must be implemented
	
*/
private double Absolute;
/*

 True if the focuser is currently moving to a new position. False if the focuser is stationary.
 
Must be implemented
*/
private double IsMoving;
/*

 State of the connection to the focuser.
 

		Must throw an exception if the call was not successful
		Must be implemented Set True to start the connection to the focuser; set False to terminate the connection. 
 The current connection status can also be read back through this property. 
 An exception will be raised if the link fails to change state for any reason. 
 Note
		The FocuserV1 interface was the only interface to name its "Connect" method "Link" all others named 
 their "Connect" method as "Connected". All interfaces including Focuser now have a  method and this is 
 the recommended method to use to "Connect" to Focusers exposing the V2 and later interfaces.
		Do not use a NotConnectedException here, that exception is for use in other methods that require a connection in order to succeed.
	
*/
private double Link;
/*

 Maximum increment size allowed by the focuser; 
 i.e. the maximum number of steps allowed in one move operation.
 

		Must be implemented
 For most focusers this is the same as the  property. This is normally used to limit the Increment display in the host software.
 
*/
private double MaxIncrement;
/*

 Maximum step position permitted.
 

		Must be implemented
 The focuser can step between 0 and . If an attempt is made to move the focuser beyond these limits, it will automatically stop at the limit.
 
*/
private double MaxStep;
/*

 Current focuser position, in steps.
 

		Can throw a not implemented exception Valid only for absolute positioning focusers (see the  property).
 A PropertyNotImplementedException exception must be thrown if this device is a relative positioning focuser rather than an absolute position focuser.
 
*/
private double Position;
/*

 Step size (microns) for the focuser.
 
Can throw a not implemented exception Must throw an exception if the focuser does not intrinsically know what the step size is.
*/
private double StepSize;
/*

 The state of temperature compensation mode (if available), else always False.
 

		TempComp Read must be implemented and must not throw a PropertyNotImplementedException. 
		TempComp Write can throw a PropertyNotImplementedException.
 If the  property is True, then setting  to True puts the focuser into temperature tracking mode. While in temperature tracking mode,
 Move commands will be rejected by the focuser. Set to False to turn off temperature tracking.
 If temperature compensation is not available, this property must always return False.
		 A  exception must be thrown if  is False and an attempt is made to set  to true.
	
*/
private double TempComp;
/*

 True if focuser has temperature compensation available.
 

		Must be implemented
 Will be True only if the focuser's temperature compensation can be turned on and off via the  property. 
 
*/
private double TempCompAvailable;
/*

 Current ambient temperature as measured by the focuser.
 
Can throw a not implemented exception 
 Raises an exception if ambient temperature is not available. Commonly available on focusers with a built-in temperature compensation mode. 
 
*/
private double Temperature;


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

 Immediately stop any focuser motion due to a previous  method call.
 

		Can throw a not implemented exceptionSome focusers may not support this function, in which case an exception will be raised. 
 Recommendation: Host software should call this method upon initialization and,
 if it fails, disable the Halt button in the user interface.
	
*/
public void Halt(){
return null;
}


/*

  Moves the focuser by the specified amount or to the specified position depending on the value of the  property.
 
Must be implemented
 If the  property is True, then this is an absolute positioning focuser. The Move command tells the focuser to move to an exact step position, and the Position parameter 
 of the Move method is an integer between 0 and .
 If the  property is False, then this is a relative positioning focuser. The Move command tells the focuser to move in a relative direction, and the Position parameter 
 of the Move method (in this case, step distance) is an integer between minus  and plus .
	
*/
public void Move(Int32){
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
		The Connected property is not implemented in Version 1 drivers; these use the 
 property and will raise a Not Implemented exception for this property. Version 2 drivers must implement both Connected and Link.
 Applications should check that InterfaceVersion returns 2 or more before using Connected.
	
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
		The Connected property is not implemented in Version 1 drivers; these use the 
 property and will raise a Not Implemented exception for this property. Version 2 drivers must implement both Connected and Link.
 Applications should check that InterfaceVersion returns 2 or more before using Connected.
	
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
 True if the focuser is capable of absolute position; that is, being commanded to a specific step location.
 
Must be implemented
	
*/
public void setAbsolute(double _theValue){
this.Absolute=_theValue;
}

/*
 Gets 
 True if the focuser is capable of absolute position; that is, being commanded to a specific step location.
 
Must be implemented
	
*/
public double getAbsolute(){
return Absolute;
}

/*
 Sets 
 True if the focuser is currently moving to a new position. False if the focuser is stationary.
 
Must be implemented
*/
public void setIsMoving(double _theValue){
this.IsMoving=_theValue;
}

/*
 Gets 
 True if the focuser is currently moving to a new position. False if the focuser is stationary.
 
Must be implemented
*/
public double getIsMoving(){
return IsMoving;
}

/*
 Sets 
 State of the connection to the focuser.
 

		Must throw an exception if the call was not successful
		Must be implemented Set True to start the connection to the focuser; set False to terminate the connection. 
 The current connection status can also be read back through this property. 
 An exception will be raised if the link fails to change state for any reason. 
 Note
		The FocuserV1 interface was the only interface to name its "Connect" method "Link" all others named 
 their "Connect" method as "Connected". All interfaces including Focuser now have a  method and this is 
 the recommended method to use to "Connect" to Focusers exposing the V2 and later interfaces.
		Do not use a NotConnectedException here, that exception is for use in other methods that require a connection in order to succeed.
	
*/
public void setLink(double _theValue){
this.Link=_theValue;
}

/*
 Gets 
 State of the connection to the focuser.
 

		Must throw an exception if the call was not successful
		Must be implemented Set True to start the connection to the focuser; set False to terminate the connection. 
 The current connection status can also be read back through this property. 
 An exception will be raised if the link fails to change state for any reason. 
 Note
		The FocuserV1 interface was the only interface to name its "Connect" method "Link" all others named 
 their "Connect" method as "Connected". All interfaces including Focuser now have a  method and this is 
 the recommended method to use to "Connect" to Focusers exposing the V2 and later interfaces.
		Do not use a NotConnectedException here, that exception is for use in other methods that require a connection in order to succeed.
	
*/
public double getLink(){
return Link;
}

/*
 Sets 
 Maximum increment size allowed by the focuser; 
 i.e. the maximum number of steps allowed in one move operation.
 

		Must be implemented
 For most focusers this is the same as the  property. This is normally used to limit the Increment display in the host software.
 
*/
public void setMaxIncrement(double _theValue){
this.MaxIncrement=_theValue;
}

/*
 Gets 
 Maximum increment size allowed by the focuser; 
 i.e. the maximum number of steps allowed in one move operation.
 

		Must be implemented
 For most focusers this is the same as the  property. This is normally used to limit the Increment display in the host software.
 
*/
public double getMaxIncrement(){
return MaxIncrement;
}

/*
 Sets 
 Maximum step position permitted.
 

		Must be implemented
 The focuser can step between 0 and . If an attempt is made to move the focuser beyond these limits, it will automatically stop at the limit.
 
*/
public void setMaxStep(double _theValue){
this.MaxStep=_theValue;
}

/*
 Gets 
 Maximum step position permitted.
 

		Must be implemented
 The focuser can step between 0 and . If an attempt is made to move the focuser beyond these limits, it will automatically stop at the limit.
 
*/
public double getMaxStep(){
return MaxStep;
}

/*
 Sets 
 Current focuser position, in steps.
 

		Can throw a not implemented exception Valid only for absolute positioning focusers (see the  property).
 A PropertyNotImplementedException exception must be thrown if this device is a relative positioning focuser rather than an absolute position focuser.
 
*/
public void setPosition(double _theValue){
this.Position=_theValue;
}

/*
 Gets 
 Current focuser position, in steps.
 

		Can throw a not implemented exception Valid only for absolute positioning focusers (see the  property).
 A PropertyNotImplementedException exception must be thrown if this device is a relative positioning focuser rather than an absolute position focuser.
 
*/
public double getPosition(){
return Position;
}

/*
 Sets 
 Step size (microns) for the focuser.
 
Can throw a not implemented exception Must throw an exception if the focuser does not intrinsically know what the step size is.
*/
public void setStepSize(double _theValue){
this.StepSize=_theValue;
}

/*
 Gets 
 Step size (microns) for the focuser.
 
Can throw a not implemented exception Must throw an exception if the focuser does not intrinsically know what the step size is.
*/
public double getStepSize(){
return StepSize;
}

/*
 Sets 
 The state of temperature compensation mode (if available), else always False.
 

		TempComp Read must be implemented and must not throw a PropertyNotImplementedException. 
		TempComp Write can throw a PropertyNotImplementedException.
 If the  property is True, then setting  to True puts the focuser into temperature tracking mode. While in temperature tracking mode,
 Move commands will be rejected by the focuser. Set to False to turn off temperature tracking.
 If temperature compensation is not available, this property must always return False.
		 A  exception must be thrown if  is False and an attempt is made to set  to true.
	
*/
public void setTempComp(double _theValue){
this.TempComp=_theValue;
}

/*
 Gets 
 The state of temperature compensation mode (if available), else always False.
 

		TempComp Read must be implemented and must not throw a PropertyNotImplementedException. 
		TempComp Write can throw a PropertyNotImplementedException.
 If the  property is True, then setting  to True puts the focuser into temperature tracking mode. While in temperature tracking mode,
 Move commands will be rejected by the focuser. Set to False to turn off temperature tracking.
 If temperature compensation is not available, this property must always return False.
		 A  exception must be thrown if  is False and an attempt is made to set  to true.
	
*/
public double getTempComp(){
return TempComp;
}

/*
 Sets 
 True if focuser has temperature compensation available.
 

		Must be implemented
 Will be True only if the focuser's temperature compensation can be turned on and off via the  property. 
 
*/
public void setTempCompAvailable(double _theValue){
this.TempCompAvailable=_theValue;
}

/*
 Gets 
 True if focuser has temperature compensation available.
 

		Must be implemented
 Will be True only if the focuser's temperature compensation can be turned on and off via the  property. 
 
*/
public double getTempCompAvailable(){
return TempCompAvailable;
}

/*
 Sets 
 Current ambient temperature as measured by the focuser.
 
Can throw a not implemented exception 
 Raises an exception if ambient temperature is not available. Commonly available on focusers with a built-in temperature compensation mode. 
 
*/
public void setTemperature(double _theValue){
this.Temperature=_theValue;
}

/*
 Gets 
 Current ambient temperature as measured by the focuser.
 
Can throw a not implemented exception 
 Raises an exception if ambient temperature is not available. Commonly available on focusers with a built-in temperature compensation mode. 
 
*/
public double getTemperature(){
return Temperature;
}
}
