package ASCOM;

/*

              All properties defined by the relevant ASCOM standard interface must exist in each driver. However,
              those properties do not all have to be implemented. The minimum requirement
              for each defined property is to throw the ASCOM.PropertyNotImplementedException for each
              of its accessors. Note that no default constructor is supplied. Throwing this requires both the 
              property name and unimplemented accessor type to be supplied.
            


*/
public class PropertyNotImplementedException{

/*

              The property that is not implemented
            

*/
private double Property;
/*

              True if the 'set' accessor is not implemented, else false
            

*/
private double AccessorSet;


/*

              Create a new exception object and identify the specified driver property and accessor as the source.
            

*/
public void PropertyNotImplementedException(String,Boolean){
return null;
}


/*

              Create a new exception object and identify the specified driver property as the source,
              and include an inner exception object containing a caught exception.
            

*/
public void PropertyNotImplementedException(String,Boolean,Exception){
return null;
}


/*

              Create a new exception
            

*/
public void PropertyNotImplementedException(String,Exception){
return null;
}


/*

              Create a new exception
            

*/
public void PropertyNotImplementedException(){
return null;
}


/*

              Create a new exception
            

*/
public void PropertyNotImplementedException(String){
return null;
}


/*

              Initializes a new instance of the  class.
            

*/
public void PropertyNotImplementedException(Runtime.Serialization.SerializationInfo,Runtime.Serialization.StreamingContext){
return null;
}

/*
 Sets 
              The property that is not implemented
            

*/
public void setProperty(double _theValue){
this.Property=_theValue;
}

/*
 Gets 
              The property that is not implemented
            

*/
public double getProperty(){
return Property;
}

/*
 Sets 
              True if the 'set' accessor is not implemented, else false
            

*/
public void setAccessorSet(double _theValue){
this.AccessorSet=_theValue;
}

/*
 Gets 
              True if the 'set' accessor is not implemented, else false
            

*/
public double getAccessorSet(){
return AccessorSet;
}
}
