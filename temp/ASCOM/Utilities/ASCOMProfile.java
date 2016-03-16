package ASCOM.Utilities;

/*

 Class that represents a whole device Profile and which contains a set of methods for for manipulating its contents
 


 This class is used by the Profile.GetProfile and Profile.SetProfile methods, do not confuse it with the Profile Class itself.
 
*/
public class ASCOMProfile{

/*

 Get the collection of values in this profile
 

*/
private double ProfileValues;


/*

 Add a new subkey
 

*/
public void AddSubkey(String){
return null;
}


/*

 Clears all contents
 

*/
public void Clear(){
return null;
}


/*

 Retrieve a registry value
 

*/
public void GetValue(String,String){
return null;
}


/*

 Removes a complete subkey
 

*/
public void RemoveSubKey(String){
return null;
}


/*

 Remove a value
 

*/
public void RemoveValue(String,String){
return null;
}


/*

 Set a value
 
Changing a value with this method does NOT change the underlying profile store, only the value in this class.
 In order to persist the new value, the class should be written back to the profile store through Profile.SetProfile.
*/
public void SetValue(String,String,String){
return null;
}


/*

 Retrieve a registry value from the driver top level subkey
 

*/
public void GetValue(String){
return null;
}


/*

 Remove a value from the driver top level subkey
 

*/
public void RemoveValue(String){
return null;
}


/*

 Set a value in the driver top level subkey
 

*/
public void SetValue(String,String){
return null;
}

/*
 Sets 
 Get the collection of values in this profile
 

*/
public void setProfileValues(double _theValue){
this.ProfileValues=_theValue;
}

/*
 Gets 
 Get the collection of values in this profile
 

*/
public double getProfileValues(){
return ProfileValues;
}
}
