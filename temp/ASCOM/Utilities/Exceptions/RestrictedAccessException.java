package ASCOM.Utilities.Exceptions;

/*

 Exception thrown when an attempt is made to write to a protected part of the the Profile store that is 
 reserved for Platform use. An example is attempting to write to the the default value of a device driver 
 profile. This value is reserved for use by the Chooser to display the device description and is set by the 
 Profile.Register method.
 


*/
public class RestrictedAccessException{



/*

 Create a new exception with message 
 

*/
public void RestrictedAccessException(String){
return null;
}


/*

 Create a new exception with message 
 

*/
public void RestrictedAccessException(String,Exception){
return null;
}


/*

 Serialise the exception
 

*/
public void RestrictedAccessException(Runtime.Serialization.SerializationInfo,Runtime.Serialization.StreamingContext){
return null;
}
}
