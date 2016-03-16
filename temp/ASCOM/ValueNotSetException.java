package ASCOM;

/*

              Exception to report that no value has yet been set for this property.
            


*/
public class ValueNotSetException{

/*

              The property/accessor or method that has no value
            

*/
private double PropertyOrMethod;


/*

              Create a new exception object and identify the specified driver property or method as the source.
            

*/
public void ValueNotSetException(String){
return null;
}


/*

              Create a new exception object and identify the specified driver property as the source,
              and include an inner exception object containing a caught exception.
            

*/
public void ValueNotSetException(String,Exception){
return null;
}


/*

              Added to keep Code Analysis happy
            

*/
public void ValueNotSetException(){
return null;
}


/*

              Added to keep Code Analysis happy
            

*/
public void ValueNotSetException(Runtime.Serialization.SerializationInfo,Runtime.Serialization.StreamingContext){
return null;
}

/*
 Sets 
              The property/accessor or method that has no value
            

*/
public void setPropertyOrMethod(double _theValue){
this.PropertyOrMethod=_theValue;
}

/*
 Gets 
              The property/accessor or method that has no value
            

*/
public double getPropertyOrMethod(){
return PropertyOrMethod;
}
}
