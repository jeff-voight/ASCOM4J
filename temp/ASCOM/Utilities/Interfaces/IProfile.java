package ASCOM.Utilities.Interfaces;

/*

 Interface to the .NET Profile component
 


*/
public class IProfile{

/*

 The type of ASCOM device for which profile data and registration services are provided 
 (String, default = "Telescope")
 

*/
private double DeviceType;
/*

 List the device types registered in the Profile store
 
Use this to find which types of device are registered in the Profile store.
*/
private double RegisteredDeviceTypes;


/*

 List the devices of a given device type that are registered in the Profile store
 

 Use this to find all the registerd devices of a given type that are in the Profile store.
 If a DeviceType is supplied, where no device of that type has been registered before on this system,
 an empty list will be returned
		Platform 6 Profile.RegisteredDevices was introduced in Platform 5.5 as a read only property that took
 DeviceType as a parameter, which is legal syntax in Visual Basic .NET but is not interpreted correctly in C#. Consequently, 
 a breaking change has been introduced in Platform 6 that changes the property into a parameterised method which works correctly in 
 all .NET languages.
		This change does not require you to alter your source code but you may need to recompile your application under Platform 6
 to ensure that there are no runtime errors.
	
*/
public void RegisteredDevices(String){
return null;
}


/*

 Confirms whether a specific driver is registered ort unregistered in the profile store
 

*/
public void IsRegistered(String){
return null;
}


/*

 Registers a supplied DriverID and associates a descriptive name with the device
 
Does nothing if already registered, so safe to call on driver load.
*/
public void Register(String,String){
return null;
}


/*

 Remove all data for the given DriverID from the registry.
 
This deletes the entire device profile tree, including the DriverID root key.
*/
public void Unregister(String){
return null;
}


/*

 Retrieve a string value from the profile using the supplied subkey for the given Driver ID 
 and variable name. Set and return the default value if the requested variable name has not yet been set.
 

		Name may be an empty string for the unnamed value. The unnamed value is also known as the "default" value for a registry key.
		Does not provide access to other registry data types such as binary and doubleword. 
		If a default value is supplied and the value is not already present in the profile store,
 the default value will be set in the profile store and then returned as the value of the 
 DriverID/SubKey/Name. If the default value is set to null (C#) or Nothing (VB) then no value will
 be set in the profile and an empty string will be returned as the value of the 
 DriverID/SubKey/Name.
	
*/
public void GetValue(String,String,String,String){
return null;
}


/*

 Writes a string value to the profile using the supplied subkey for the given Driver ID and variable name.
 

*/
public void WriteValue(String,String,String,String){
return null;
}


/*

 Return a list of the (unnamed and named variables) under the given DriverID and subkey.
 
The returned object contains entries for each value. For each entry, 
 the Key property is the value's name, and the Value property is the string value itself. Note that the unnamed (default) 
 value will be included if it has a value, even if the value is a blank string. The unnamed value will have its entry's 
 Key property set to an empty string.
 The KeyValuePair objects are instances of the KeyValuePair class
	
*/
public void Values(String,String){
return null;
}


/*

 Delete the value from the registry. Name may be an empty string for the unnamed value. Value will be deleted from the subkey supplied.
 
Specify "" to delete the unnamed value which is also known as the "default" value for a registry key. 
*/
public void DeleteValue(String,String,String){
return null;
}


/*

 Create a registry key for the given DriverID.
 
If the SubKey argument contains a \ separated path, the intermediate keys will be created if needed. 
*/
public void CreateSubKey(String,String){
return null;
}


/*

 Return a list of the sub-keys under the given DriverID (for COM clients)
 
The returned object (scripting.dictionary) contains entries for each sub-key. For each KeyValuePair in the list, 
 the Key property is the sub-key name, and the Value property is the value. The unnamed ("default") value for that key is also returned.
 The KeyValuePair objects are instances of the KeyValuePair class
	
*/
public void SubKeys(String,String){
return null;
}


/*

 Delete a registry key for the given DriverID. SubKey may contain \ separated path to key to be deleted.
 
The sub-key and all data and keys beneath it are deleted.
*/
public void DeleteSubKey(String,String){
return null;
}


/*

 Read an entire device profile
 
This is not implemented and returns a MethodNotImplemented exception,
 it will be implemented in a future update. An XML schema will also be made available to support 
 this method.
*/
public void GetProfileXML(String){
return null;
}


/*

 Set an entire device profile
 
This is not implemented and returns a MethodNotImplemented exception,
 it will be implemented in a future update. An XML schema will also be made available to support 
 this method.
*/
public void SetProfileXML(String,String){
return null;
}

/*
 Sets 
 The type of ASCOM device for which profile data and registration services are provided 
 (String, default = "Telescope")
 

*/
public void setDeviceType(double _theValue){
this.DeviceType=_theValue;
}

/*
 Gets 
 The type of ASCOM device for which profile data and registration services are provided 
 (String, default = "Telescope")
 

*/
public double getDeviceType(){
return DeviceType;
}

/*
 Sets 
 List the device types registered in the Profile store
 
Use this to find which types of device are registered in the Profile store.
*/
public void setRegisteredDeviceTypes(double _theValue){
this.RegisteredDeviceTypes=_theValue;
}

/*
 Gets 
 List the device types registered in the Profile store
 
Use this to find which types of device are registered in the Profile store.
*/
public double getRegisteredDeviceTypes(){
return RegisteredDeviceTypes;
}
}
