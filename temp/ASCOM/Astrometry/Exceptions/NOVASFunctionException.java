package ASCOM.Astrometry.Exceptions;

/*

                Exception thrown when a NOVAS function returns a non-zero, error completion code.
            

This probably occurs because another variable has not been set or a required method has not been called.
*/
public class NOVASFunctionException{



/*

                Create a new exception with message, function name and error code
            

*/
public void NOVASFunctionException(String,String,Int16){
return null;
}


/*

                Create a new exception with message 
            

*/
public void NOVASFunctionException(String,Exception){
return null;
}


/*

                Serialise the exception
            

*/
public void NOVASFunctionException(Runtime.Serialization.SerializationInfo,Runtime.Serialization.StreamingContext){
return null;
}
}
