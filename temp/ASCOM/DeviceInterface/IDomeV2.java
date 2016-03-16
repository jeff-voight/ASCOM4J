package ASCOM.DeviceInterface;

/*

 Defines the IDome Interface
 


*/
public class IDomeV2{

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

 The dome altitude (degrees, horizon zero and increasing positive to 90 zenith).
 

 Raises an error only if no altitude control. If actual dome altitude can not be read, then reports back the last slew position. 
 
*/
private double Altitude;
/*

 Indicates whether the dome is in the home position. Raises an error if not supported. 
 
 This is normally used following a  operation. The value is reset with any azimuth slew operation that moves the dome away from the home position.
 
		
			 may also become true durng normal slew operations, if the dome passes through the home position and the dome controller hardware is capable of detecting that; 
 or at the end of a slew operation if the dome comes to rest at the home position.
 
	

		The home position is normally defined by a hardware sensor positioned around the dome circumference and represents a fixed, known azimuth reference.
		For some devices, the home position may represent a small range of azimuth values, rather than a discrete value, since dome inertia, the resolution of the home position sensor and/or the azimuth encoder may be
 insufficient to return the exact same azimuth value on each occasion. Some dome controllers, on the other hand, will always force the azimuth reading to a fixed value whenever the home position sensor is active.
 Because of these potential differences in behaviour, applications should not rely on the reported azimuth position being identical each time  is set true.
	
*/
private double AtHome;
/*

 True if the dome is in the programmed park position.
 

 Set only following a  operation and reset with any slew operation. Raises an error if not supported. 
 
*/
private double AtPark;
/*

 The dome azimuth (degrees, North zero and increasing clockwise, i.e., 90 East, 180 South, 270 West)
 
Raises an error only if no azimuth control. If actual dome azimuth can not be read, then reports back last slew position
*/
private double Azimuth;
/*

 True if driver can do a search for home position.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
private double CanFindHome;
/*

 True if driver is capable of setting dome altitude.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
private double CanPark;
/*

 True if driver is capable of setting dome altitude.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
private double CanSetAltitude;
/*

 True if driver is capable of setting dome azimuth.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
private double CanSetAzimuth;
/*

 True if driver can set the dome park position.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
private double CanSetPark;
/*

 True if driver is capable of automatically operating shutter.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
private double CanSetShutter;
/*

 True if the dome hardware supports slaving to a telescope.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 See the notes for the  property.
 
*/
private double CanSlave;
/*

 True if driver is capable of synchronizing the dome azimuth position using the  method.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
private double CanSyncAzimuth;
/*

 Status of the dome shutter or roll-off roof.
 

 Raises an error only if no shutter control. If actual shutter status can not be read, then reports back the last shutter state. 
 
*/
private double ShutterStatus;
/*

 True if the dome is slaved to the telescope in its hardware, else False.
 

		Slaved Read must be implemented and must not throw a PropertyNotImplementedException. 
		Slaved Write can throw a PropertyNotImplementedException.
 Set this property to True to enable dome-telescope hardware slaving, if supported (see ). Raises an exception on any attempt to set 
 this property if hardware slaving is not supported). Always returns False if hardware slaving is not supported. 
 
*/
private double Slaved;
/*

 True if any part of the dome is currently moving, False if all dome components are steady.
 

		Slewing must be implemented and must not throw a PropertyNotImplementedException. 
 Raises an error if  is True, if not supported, if a communications failure occurs, or if the dome can not reach indicated azimuth. 
 
*/
private double Slewing;


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

 Immediately cancel current dome operation.
 

		Must be implemented, must not throw a MethodNotImplementedException.
 Calling this method will immediately disable hardware slewing ( will become False). Raises an error if a communications failure occurs, or if the command is known to have failed. 
 
*/
public void AbortSlew(){
return null;
}


/*

 Close shutter or otherwise shield telescope from the sky.
 

*/
public void CloseShutter(){
return null;
}


/*

 Start operation to search for the dome home position.
 

 After Home position is established initializes  to the default value and sets the  flag. 
 Exception if not supported or communications failure. Raises an error if  is True.
 
*/
public void FindHome(){
return null;
}


/*

 Open shutter or otherwise expose telescope to the sky.
 

 Raises an error if not supported or if a communications failure occurs. 
 
*/
public void OpenShutter(){
return null;
}


/*

 Rotate dome in azimuth to park position.
 

 After assuming programmed park position, sets  flag. Raises an error if  is True, or if not supported, or if a communications failure has occurred. 
 
*/
public void Park(){
return null;
}


/*

 Set the current azimuth, altitude position of dome to be the park position.
 

 Raises an error if not supported or if a communications failure occurs. 
 
*/
public void SetPark(){
return null;
}


/*

 Slew the dome to the given altitude position.
 

 Raises an error if  is True, if not supported, if a communications failure occurs, or if the dome can not reach indicated altitude. 
 
*/
public void SlewToAltitude(Double){
return null;
}


/*

 Slew the dome to the given azimuth position.
 

 Raises an error if  is True, if not supported, if a communications failure occurs, or if the dome can not reach indicated azimuth. 
 
*/
public void SlewToAzimuth(Double){
return null;
}


/*

 Synchronize the current position of the dome to the given azimuth.
 

 Raises an error if not supported or if a communications failure occurs. 
 
*/
public void SyncToAzimuth(Double){
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
 The dome altitude (degrees, horizon zero and increasing positive to 90 zenith).
 

 Raises an error only if no altitude control. If actual dome altitude can not be read, then reports back the last slew position. 
 
*/
public void setAltitude(double _theValue){
this.Altitude=_theValue;
}

/*
 Gets 
 The dome altitude (degrees, horizon zero and increasing positive to 90 zenith).
 

 Raises an error only if no altitude control. If actual dome altitude can not be read, then reports back the last slew position. 
 
*/
public double getAltitude(){
return Altitude;
}

/*
 Sets 
 Indicates whether the dome is in the home position. Raises an error if not supported. 
 
 This is normally used following a  operation. The value is reset with any azimuth slew operation that moves the dome away from the home position.
 
		
			 may also become true durng normal slew operations, if the dome passes through the home position and the dome controller hardware is capable of detecting that; 
 or at the end of a slew operation if the dome comes to rest at the home position.
 
	

		The home position is normally defined by a hardware sensor positioned around the dome circumference and represents a fixed, known azimuth reference.
		For some devices, the home position may represent a small range of azimuth values, rather than a discrete value, since dome inertia, the resolution of the home position sensor and/or the azimuth encoder may be
 insufficient to return the exact same azimuth value on each occasion. Some dome controllers, on the other hand, will always force the azimuth reading to a fixed value whenever the home position sensor is active.
 Because of these potential differences in behaviour, applications should not rely on the reported azimuth position being identical each time  is set true.
	
*/
public void setAtHome(double _theValue){
this.AtHome=_theValue;
}

/*
 Gets 
 Indicates whether the dome is in the home position. Raises an error if not supported. 
 
 This is normally used following a  operation. The value is reset with any azimuth slew operation that moves the dome away from the home position.
 
		
			 may also become true durng normal slew operations, if the dome passes through the home position and the dome controller hardware is capable of detecting that; 
 or at the end of a slew operation if the dome comes to rest at the home position.
 
	

		The home position is normally defined by a hardware sensor positioned around the dome circumference and represents a fixed, known azimuth reference.
		For some devices, the home position may represent a small range of azimuth values, rather than a discrete value, since dome inertia, the resolution of the home position sensor and/or the azimuth encoder may be
 insufficient to return the exact same azimuth value on each occasion. Some dome controllers, on the other hand, will always force the azimuth reading to a fixed value whenever the home position sensor is active.
 Because of these potential differences in behaviour, applications should not rely on the reported azimuth position being identical each time  is set true.
	
*/
public double getAtHome(){
return AtHome;
}

/*
 Sets 
 True if the dome is in the programmed park position.
 

 Set only following a  operation and reset with any slew operation. Raises an error if not supported. 
 
*/
public void setAtPark(double _theValue){
this.AtPark=_theValue;
}

/*
 Gets 
 True if the dome is in the programmed park position.
 

 Set only following a  operation and reset with any slew operation. Raises an error if not supported. 
 
*/
public double getAtPark(){
return AtPark;
}

/*
 Sets 
 The dome azimuth (degrees, North zero and increasing clockwise, i.e., 90 East, 180 South, 270 West)
 
Raises an error only if no azimuth control. If actual dome azimuth can not be read, then reports back last slew position
*/
public void setAzimuth(double _theValue){
this.Azimuth=_theValue;
}

/*
 Gets 
 The dome azimuth (degrees, North zero and increasing clockwise, i.e., 90 East, 180 South, 270 West)
 
Raises an error only if no azimuth control. If actual dome azimuth can not be read, then reports back last slew position
*/
public double getAzimuth(){
return Azimuth;
}

/*
 Sets 
 True if driver can do a search for home position.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
public void setCanFindHome(double _theValue){
this.CanFindHome=_theValue;
}

/*
 Gets 
 True if driver can do a search for home position.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
public double getCanFindHome(){
return CanFindHome;
}

/*
 Sets 
 True if driver is capable of setting dome altitude.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
public void setCanPark(double _theValue){
this.CanPark=_theValue;
}

/*
 Gets 
 True if driver is capable of setting dome altitude.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
public double getCanPark(){
return CanPark;
}

/*
 Sets 
 True if driver is capable of setting dome altitude.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
public void setCanSetAltitude(double _theValue){
this.CanSetAltitude=_theValue;
}

/*
 Gets 
 True if driver is capable of setting dome altitude.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
public double getCanSetAltitude(){
return CanSetAltitude;
}

/*
 Sets 
 True if driver is capable of setting dome azimuth.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
public void setCanSetAzimuth(double _theValue){
this.CanSetAzimuth=_theValue;
}

/*
 Gets 
 True if driver is capable of setting dome azimuth.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
public double getCanSetAzimuth(){
return CanSetAzimuth;
}

/*
 Sets 
 True if driver can set the dome park position.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
public void setCanSetPark(double _theValue){
this.CanSetPark=_theValue;
}

/*
 Gets 
 True if driver can set the dome park position.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
public double getCanSetPark(){
return CanSetPark;
}

/*
 Sets 
 True if driver is capable of automatically operating shutter.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
public void setCanSetShutter(double _theValue){
this.CanSetShutter=_theValue;
}

/*
 Gets 
 True if driver is capable of automatically operating shutter.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
public double getCanSetShutter(){
return CanSetShutter;
}

/*
 Sets 
 True if the dome hardware supports slaving to a telescope.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 See the notes for the  property.
 
*/
public void setCanSlave(double _theValue){
this.CanSlave=_theValue;
}

/*
 Gets 
 True if the dome hardware supports slaving to a telescope.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 See the notes for the  property.
 
*/
public double getCanSlave(){
return CanSlave;
}

/*
 Sets 
 True if driver is capable of synchronizing the dome azimuth position using the  method.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
public void setCanSyncAzimuth(double _theValue){
this.CanSyncAzimuth=_theValue;
}

/*
 Gets 
 True if driver is capable of synchronizing the dome azimuth position using the  method.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
public double getCanSyncAzimuth(){
return CanSyncAzimuth;
}

/*
 Sets 
 Status of the dome shutter or roll-off roof.
 

 Raises an error only if no shutter control. If actual shutter status can not be read, then reports back the last shutter state. 
 
*/
public void setShutterStatus(double _theValue){
this.ShutterStatus=_theValue;
}

/*
 Gets 
 Status of the dome shutter or roll-off roof.
 

 Raises an error only if no shutter control. If actual shutter status can not be read, then reports back the last shutter state. 
 
*/
public double getShutterStatus(){
return ShutterStatus;
}

/*
 Sets 
 True if the dome is slaved to the telescope in its hardware, else False.
 

		Slaved Read must be implemented and must not throw a PropertyNotImplementedException. 
		Slaved Write can throw a PropertyNotImplementedException.
 Set this property to True to enable dome-telescope hardware slaving, if supported (see ). Raises an exception on any attempt to set 
 this property if hardware slaving is not supported). Always returns False if hardware slaving is not supported. 
 
*/
public void setSlaved(double _theValue){
this.Slaved=_theValue;
}

/*
 Gets 
 True if the dome is slaved to the telescope in its hardware, else False.
 

		Slaved Read must be implemented and must not throw a PropertyNotImplementedException. 
		Slaved Write can throw a PropertyNotImplementedException.
 Set this property to True to enable dome-telescope hardware slaving, if supported (see ). Raises an exception on any attempt to set 
 this property if hardware slaving is not supported). Always returns False if hardware slaving is not supported. 
 
*/
public double getSlaved(){
return Slaved;
}

/*
 Sets 
 True if any part of the dome is currently moving, False if all dome components are steady.
 

		Slewing must be implemented and must not throw a PropertyNotImplementedException. 
 Raises an error if  is True, if not supported, if a communications failure occurs, or if the dome can not reach indicated azimuth. 
 
*/
public void setSlewing(double _theValue){
this.Slewing=_theValue;
}

/*
 Gets 
 True if any part of the dome is currently moving, False if all dome components are steady.
 

		Slewing must be implemented and must not throw a PropertyNotImplementedException. 
 Raises an error if  is True, if not supported, if a communications failure occurs, or if the dome can not reach indicated azimuth. 
 
*/
public double getSlewing(){
return Slewing;
}
}
