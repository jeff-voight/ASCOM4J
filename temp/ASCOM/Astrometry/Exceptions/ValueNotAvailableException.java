package ASCOM.Astrometry.Exceptions;

/*

                Exception thrown when an attempt is made to read a value that has not yet been calculated.
            

This probably occurs because another variable has not been set or a required method has not been called.
*/
public class ValueNotAvailableException{



/*

                Create a new exception with message 
            

*/
public void ValueNotAvailableException(String){
return null;
}


/*

                Create a new exception with message 
            

*/
public void ValueNotAvailableException(String,Exception){
return null;
}


/*

                Serialise the exception
            

*/
public void ValueNotAvailableException(Runtime.Serialization.SerializationInfo,Runtime.Serialization.StreamingContext){
return null;
}
}
