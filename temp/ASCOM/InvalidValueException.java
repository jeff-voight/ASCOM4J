package ASCOM;

/*

              Exception to report an invalid value supplied to a driver.
            


              The most useful way to use this exception is to inform the user which property/method/parameter
              had the invalid value and also the range of allowed values.
            
*/
public class InvalidValueException{

/*

              The property/accessor or method that has an invalid value.
            

*/
private double PropertyOrMethod;
/*

              The invalid value.
            

*/
private double Value;
/*

              The valid range for this property.
            

*/
private double Range;


/*

              Create a new exception object and identify the specified driver property or method as the source.
            

*/
public void InvalidValueException(String,String,String){
return null;
}


/*

              Create a new exception object and identify the specified driver property as the source,
              and include an inner exception object containing a caught exception.
            

*/
public void InvalidValueException(String,String,String,Exception){
return null;
}


/*

              Create a new exception
            

*/
public void InvalidValueException(String){
return null;
}


/*

              Create a new exception
            

*/
public void InvalidValueException(String,Exception){
return null;
}


/*

              Create a new exception object
            

*/
public void InvalidValueException(){
return null;
}


/*

              Added to keep Code Analysis happy
            

*/
public void InvalidValueException(Runtime.Serialization.SerializationInfo,Runtime.Serialization.StreamingContext){
return null;
}

/*
 Sets 
              The property/accessor or method that has an invalid value.
            

*/
public void setPropertyOrMethod(double _theValue){
this.PropertyOrMethod=_theValue;
}

/*
 Gets 
              The property/accessor or method that has an invalid value.
            

*/
public double getPropertyOrMethod(){
return PropertyOrMethod;
}

/*
 Sets 
              The invalid value.
            

*/
public void setValue(double _theValue){
this.Value=_theValue;
}

/*
 Gets 
              The invalid value.
            

*/
public double getValue(){
return Value;
}

/*
 Sets 
              The valid range for this property.
            

*/
public void setRange(double _theValue){
this.Range=_theValue;
}

/*
 Gets 
              The valid range for this property.
            

*/
public double getRange(){
return Range;
}
}
