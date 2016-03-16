package ASCOM;

/*

              All properties and methods defined by the relevant ASCOM standard interface must exist in each driver. However,
              those properties and methods do not all have to be implemented. This exception is a base class for
              PropertyNotImplementedException and MethodNotImplementedException, which drivers should use for throwing
              the relevant exception(s). This class is intended to be used by clients who wish to catch either of
              the two specific exceptions in a single catch() clause.
            


*/
public class NotImplementedException{

/*

              The property/accessor or method that is not implemented
            

*/
private double PropertyOrMethod;


/*

              Create a new exception object and identify the specified driver property or method as the source.
            

*/
public void NotImplementedException(String){
return null;
}


/*

              Create a new exception object and identify the specified driver property as the source,
              and include an inner exception object containing a caught exception.
            

*/
public void NotImplementedException(String,Exception){
return null;
}


/*

              Added to keep Code analysis happy, please don't use it.
            

*/
public void NotImplementedException(){
return null;
}


/*

              Added to keep Code Analysis happy
            

*/
public void NotImplementedException(Runtime.Serialization.SerializationInfo,Runtime.Serialization.StreamingContext){
return null;
}

/*
 Sets 
              The property/accessor or method that is not implemented
            

*/
public void setPropertyOrMethod(double _theValue){
this.PropertyOrMethod=_theValue;
}

/*
 Gets 
              The property/accessor or method that is not implemented
            

*/
public double getPropertyOrMethod(){
return PropertyOrMethod;
}
}
