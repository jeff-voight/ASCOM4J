package ASCOM.Utilities.Exceptions;

/*

 Exception thrown when a profile request is made for a driver that is not registered
 

Drivers must be registered before other profile commands are used to manipulate their 
 values.
*/
public class DriverNotRegisteredException{



/*

 Create a new exception with message 
 

*/
public void DriverNotRegisteredException(String){
return null;
}


/*

 Create a new exception with message 
 

*/
public void DriverNotRegisteredException(String,Exception){
return null;
}


/*

 Serialise the exception
 

*/
public void DriverNotRegisteredException(Runtime.Serialization.SerializationInfo,Runtime.Serialization.StreamingContext){
return null;
}
}
