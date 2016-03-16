package ASCOM.Utilities.Exceptions;

/*

 Exception thrown when a serial port method is already in progress and a second attempt is made to use the serial port.
 

This exception is only thrown after 5 attempts, each with a 1 second timeout, have been made to 
 acquire the serial port. It may indicate that you have more than one thread attempting to access the serial 
 port and that you have not synchronised these within your application. The serial port can only handle 
 one transaction at a time e.g. Serial.Receive or Serial.Transmit etc.
*/
public class SerialPortInUseException{



/*

 Create a new exception with message 
 

*/
public void SerialPortInUseException(String){
return null;
}


/*

 Create a new exception with message 
 

*/
public void SerialPortInUseException(String,Exception){
return null;
}


/*

 Serialise the exception
 

*/
public void SerialPortInUseException(Runtime.Serialization.SerializationInfo,Runtime.Serialization.StreamingContext){
return null;
}
}
