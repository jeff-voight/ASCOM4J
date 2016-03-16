package ASCOM;

/*

              This exception should be raised by the driver to reject a command from the client. It is intended to be
              used for "logical" errors e.g. trying to use a command when the current configuration of the device does
              not allow it rather than for device errors such as a communications error.
              Its the error to use when the client attempts something, which at another time would be sensible,
                but which is not sensible right now. If you expect the condition causing the issue to be short
                lived, you may choose to stall the request until the condition is cleared rather than throwing this exception.
                Clearly, that is a judgement that you can only make given a specific scenario.
            


*/
public class InvalidOperationException{



/*

              Default public constructor for NotConnectedException takes no parameters.
            

*/
public void InvalidOperationException(){
return null;
}


/*

              Initializes a new instance of the  class
              from another exception.
            

*/
public void InvalidOperationException(Exception){
return null;
}


/*

              Initializes a new instance of the  class
              with a non-default error message.
            

*/
public void InvalidOperationException(String){
return null;
}


/*

              Initializes a new instance of the  class
              based on another exception.
            

*/
public void InvalidOperationException(String,Exception){
return null;
}


/*

              Added to keep Code Analysis happy
            

*/
public void InvalidOperationException(Runtime.Serialization.SerializationInfo,Runtime.Serialization.StreamingContext){
return null;
}
}
