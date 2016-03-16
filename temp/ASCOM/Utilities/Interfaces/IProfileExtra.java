package ASCOM.Utilities.Interfaces;

/*

 Addiitonal methods that are only visible to .NET clients and not to COM clients
 


*/
public class IProfileExtra{



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
 
The returned object (scripting.dictionary) contains entries for each sub-key. For each KeyValuePair in the list, 
 the Key property is the sub-key name, and the Value property is the value. The unnamed ("default") value for that key is also returned.
 The KeyValuePair objects are instances of the KeyValuePair class
	
*/
public void SubKeys(String){
return null;
}


/*

 Return a list of the (unnamed and named variables) under the given DriverID.
 
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

 Read an entire device profile and return it as an XML encoded string
 
Returns a whole driver profile encoded as an XML string
*/
public void GetProfile(String){
return null;
}


/*

 Set an entire device profile from an XML encoded string
 
Set a whole device Profile in one call using a recusrive ProfileKey class
*/
public void SetProfile(String,ASCOM.Utilities.ASCOMProfile){
return null;
}
}
