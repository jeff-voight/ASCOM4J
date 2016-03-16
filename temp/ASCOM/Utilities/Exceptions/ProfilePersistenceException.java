package ASCOM.Utilities.Exceptions;

/*

 Exception thrown if there is any problem in reading or writing the profile from or to the file system
 

This is an ifrastructural exception indicatig that there is a problem at the file access layer
 in the profile code. Possible underlying reasons are security access permissions, file system full and hardware failure.
 
*/
public class ProfilePersistenceException{



/*

 Create a new exception with message 
 

*/
public void ProfilePersistenceException(String){
return null;
}


/*

 Create a new exception with message 
 

*/
public void ProfilePersistenceException(String,Exception){
return null;
}


/*

 Serialise the exception
 

*/
public void ProfilePersistenceException(Runtime.Serialization.SerializationInfo,Runtime.Serialization.StreamingContext){
return null;
}
}
