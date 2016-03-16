package ASCOM.Astrometry.Exceptions;

/*

                Exception thrown when an attempt is made to read from the transform component before it has had co-ordinates
                set once by SetJ2000 or SetJNow.
            


*/
public class TransformUninitialisedException{



/*

                Create a new exception with message 
            

*/
public void TransformUninitialisedException(String){
return null;
}


/*

                Create a new exception with message 
            

*/
public void TransformUninitialisedException(String,Exception){
return null;
}


/*

                Serialise the exception
            

*/
public void TransformUninitialisedException(Runtime.Serialization.SerializationInfo,Runtime.Serialization.StreamingContext){
return null;
}
}
