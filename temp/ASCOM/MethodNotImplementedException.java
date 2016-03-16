package ASCOM;

/*

              All methods defined by the relevant ASCOM standard interface must exist in each driver. However,
              those methods do not all have to be implemented. The minimum requirement
              for each defined method is to throw the ASCOM.MethodNotImplementedException. Note
              that no default constructor is supplied. Throwing this requires the the method name.
            


*/
public class MethodNotImplementedException{

/*

              The method that is not implemented
            

*/
private double Method;


/*

              Create a new exception object and identify the specified driver method as the source.
            

*/
public void MethodNotImplementedException(String){
return null;
}


/*

              Create a new exception object and identify the specified driver method as the source,
              and include an inner exception object containing a caught exception.
            

*/
public void MethodNotImplementedException(String,Exception){
return null;
}


/*

              For Code Analysis, please don't use
            

*/
public void MethodNotImplementedException(){
return null;
}


/*

            Initializes a new instance of the  class.
            

*/
public void MethodNotImplementedException(Runtime.Serialization.SerializationInfo,Runtime.Serialization.StreamingContext){
return null;
}

/*
 Sets 
              The method that is not implemented
            

*/
public void setMethod(double _theValue){
this.Method=_theValue;
}

/*
 Gets 
              The method that is not implemented
            

*/
public double getMethod(){
return Method;
}
}
