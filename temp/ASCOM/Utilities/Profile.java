package ASCOM.Utilities;

/*

 ASCOM Scope Driver Helper Registry Profile Object
 


		This object provides facilities for registering ASCOM drivers with the Chooser, and for storing 
 persistence information in a shared area of the file system.
		Please code to the IProfile interface
	
*/
public class Profile{

/*

 The type of ASCOM device for which profile data and registration services are provided 
 (String, default = "Telescope")
 

*/
private double DeviceType;
/*

 List the device types registered in the Profile store
 
Use this to find the types of device that are registered in the Profile store.
 Device types are returned without the suffix " Devices" that is used in key names within the 
 profile store; this allows direct use of returned device types inside For Each loops as shown in 
 the Profile code example.
	
*/
private double RegisteredDeviceTypes;


/*

 Create a new Profile object
 

*/
public void Profile(){
return null;
}


/*

 Create a new profile object ignoring profile not found exceptions if generated
 

*/
public void Profile(Boolean){
return null;
}


/*

 Disposes of resources used by the profile object - called by IDisposable interface
 

*/
public void Dispose(Boolean){
return null;
}


/*

 Disposes of resources used by the profile object
 

*/
public void Dispose(){
return null;
}


/*

 List the devices of a given device type that are registered in the Profile store
 

 Use this to find all the registerd devices of a given type that are in the Profile store
 If a DeviceType is supplied, where no device of that type has been registered before on this system,
 an empty list will be returned
	
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
		Unregister must only be called if the driver has already been registered. If you are not sure 
 use the IsRegistered function to check the status and only unregister if the driver is registered.
	
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

 Return a list of the sub-keys under the given DriverID
 
The returned object contains entries for each sub-key. For each KeyValuePair in the list, 
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

 Read an entire device profile and return it as an XML encoded string
 
Please see the code examples in this help file for a description of how to use this method.
The format of the returned XML is shown below. The SubKey element repeats for as many subkeys as are present while the Value element with its
 Name and Data memebers repeats as often as there are values in a particular subkey.
		
 <?xml version="1.0" encoding="utf-8" ?> 
 <ASCOMProfileAL>
 <SubKey>
 <SubKeyName /> 
 <DefaultValue>Default text value</DefaultValue> 
    <Values>
      <Value>
        <Name>Valuename 1</Name> 
        <Data>False</Data> 
      </Value>
      <Value>
        <Name>Valuename 2</Name> 
        <Data>True</Data> 
      </Value>
    </Values>
  </SubKey>
  <SubKey>
    <SubKeyName>Settings</SubKeyName> 
    <DefaultValue /> 
    <Values>
      <Value>
        <Name>Valuename 3</Name> 
        <Data>1</Data> 
      </Value>
      <Value>
        <Name>Valuename 4</Name> 
        <Data>53.4217</Data> 
      </Value>
    </Values>
  </SubKey>
 </ASCOMProfileAL>
 
*/
public void GetProfileXML(String){
return null;
}


/*

 Set an entire device profile from an XML encoded string
 
Please see the code examples in this help file for a description of how to use this method. See GetProfileXML for a 
 description of the XML format.
*/
public void SetProfileXML(String,String){
return null;
}


/*

 Read an entire device profile and return it as an ASCOMProfile class instance
 
Please see the code examples in this help file for a description of how to use this method.
*/
public void GetProfile(String){
return null;
}


/*

 Set an entire device profile from an ASCOMProfile class instance
 
Please see the code examples in this help file for a description of how to use this method.
*/
public void SetProfile(String,ASCOM.Utilities.ASCOMProfile){
return null;
}


/*

 Migrate the ASCOM profile from registry to file store
 

*/
public void MigrateProfile(String){
return null;
}


/*

 Delete the value from the registry. Name may be an empty string for the unnamed value. 
 
Specify "" to delete the unnamed value which is also known as the "default" value for a registry key.
 This overload is not available through COM, please use 
 "DeleteValue(ByVal DriverID As String, ByVal Name As String, ByVal SubKey As String)"
 with SubKey set to empty string achieve this effect.
	
*/
public void DeleteValue(String,String){
return null;
}


/*

 Retrieve a string value from the profile for the given Driver ID and variable name
 

		Name may be an empty string for the unnamed value. The unnamed value is also known as the "default" value for a registry key.
		Does not provide access to other registry data types such as binary and doubleword. 
		This overload is not available through COM, please use 
 "GetValue(ByVal DriverID As String, ByVal Name As String, ByVal SubKey As String)"
 with SubKey set to empty string achieve this effect.
	
*/
public void GetValue(String,String){
return null;
}


/*

 Retrieve a string value from the profile using the supplied subkey for the given Driver ID and variable name.
 

		Name may be an empty string for the unnamed value. The unnamed value is also known as the "default" value for a registry key.
		Does not provide access to other registry data types such as binary and doubleword. 
	
*/
public void GetValue(String,String,String){
return null;
}


/*

 Return a list of the sub-keys under the root of the given DriverID
 
The returned object contains entries for each sub-key. For each KeyValuePair in the list, 
 the Key property is the sub-key name, and the Value property is the value. The unnamed ("default") value for that key is also returned.
 The KeyValuePair objects are instances of the KeyValuePair class
	
*/
public void SubKeys(String){
return null;
}


/*

 Return a list of the (unnamed and named variables) under the root of the given DriverID.
 
The returned object contains entries for each value. For each entry, 
 the Key property is the value's name, and the Value property is the string value itself. Note that the unnamed (default) 
 value will be included if it has a value, even if the value is a blank string. The unnamed value will have its entry's 
 Key property set to an empty string.
 The KeyValuePair objects are instances of the KeyValuePair class
	
*/
public void Values(String){
return null;
}


/*

 Writes a string value to the profile using the given Driver ID and variable name.
 

 This overload is not available through COM, please use 
 "WriteValue(ByVal DriverID As String, ByVal Name As String, ByVal Value As String, ByVal SubKey As String)"
 with SubKey set to empty string achieve this effect.
 
*/
public void WriteValue(String,String,String){
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
 
Use this to find the types of device that are registered in the Profile store.
 Device types are returned without the suffix " Devices" that is used in key names within the 
 profile store; this allows direct use of returned device types inside For Each loops as shown in 
 the Profile code example.
	
*/
public void setRegisteredDeviceTypes(double _theValue){
this.RegisteredDeviceTypes=_theValue;
}

/*
 Gets 
 List the device types registered in the Profile store
 
Use this to find the types of device that are registered in the Profile store.
 Device types are returned without the suffix " Devices" that is used in key names within the 
 profile store; this allows direct use of returned device types inside For Each loops as shown in 
 the Profile code example.
	
*/
public double getRegisteredDeviceTypes(){
return RegisteredDeviceTypes;
}
}
