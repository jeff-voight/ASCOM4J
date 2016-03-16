package ASCOM;

/*

              This is the generic driver exception. Drivers are permitted to directly throw this
              exception as well as any derived exceptions. Note that the Message property is 
              a member of , the base class of DriverException. The 
              property of  is simply renamed to Number.
              This exception should only be thrown if there is no other more appropriate exception already defined, e.g. PropertyNotImplemented,
                InvalidOperationException, InvalidValueException, NotConnectedException etc. These specific exceptions should be thrown where appropriate
                rather than using the more generic DriverException. Conform will not accept DriverExceptions where more appropriate exceptions 
                are already defined.
              As good programming practice, the Message property should not be empty, so that users understand why the exception was thrown.
            


*/
public class DriverException{

/*

              The COM error code for this exception (hex 80040400 - 800404FF)
            

*/
private double Number;


/*

              Create a new ASCOM exception using the specified text message and error code.
            

*/
public void DriverException(String,Int32){
return null;
}


/*

              Create a new ASCOM exception based on another exception plus additional descriptive text and error code. This member is 
              required for a well-behaved exception class. For example, if a driver receives an exception
              (perhaps a COMException) from some other component yet it wants to report some meaningful
              error that resulted from the other error, it can package the original error in the
              InnerException member of the exception it generates.
            

*/
public void DriverException(String,Int32,Exception){
return null;
}


/*

              Initializes a new instance of the  class.
              Sets the COM HResult to .
            

*/
public void DriverException(){
return null;
}


/*

              Initializes a new instance of the  class
              with a human-readable descriptive message.
            

*/
public void DriverException(String){
return null;
}


/*

              Initializes a new instance of the  class from
              another caught exception and a human-readable descriptinve message.
            

*/
public void DriverException(String,Exception){
return null;
}


/*

              Initializes a new instance of the  class.
            

*/
public void DriverException(Runtime.Serialization.SerializationInfo,Runtime.Serialization.StreamingContext){
return null;
}

/*
 Sets 
              The COM error code for this exception (hex 80040400 - 800404FF)
            

*/
public void setNumber(double _theValue){
this.Number=_theValue;
}

/*
 Gets 
              The COM error code for this exception (hex 80040400 - 800404FF)
            

*/
public double getNumber(){
return Number;
}
}
