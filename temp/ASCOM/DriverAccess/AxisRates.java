package ASCOM.DriverAccess;

/*

            A collection of rates at which the telescope may be moved about the specified axis by the  method.
            This is only used if the telescope interface version is 2 or 3
            

See the description of the  method for more information.
            This method must return an empty collection if  is not supported.
            The values used in  members must be non-negative; forward and backward motion is achieved by the application
            applying an appropriate sign to the returned  values in the  command.
            
*/
public class AxisRates{

/*

            Returns the current value of the collection
            

*/
private double Current;
/*

            Returns the number of rate objects in the collection
            

*/
private double Count;
/*

            Return information about the rates at which the telescope may be moved about the specified axis by the  method.
            
The (symbolic) values for Index () are:
            
             0 Primary axis (e.g., Hour Angle or Azimuth)
             1 Secondary axis (e.g., Declination or Altitude)
             2 Tertiary axis (e.g. imager rotator/de-rotator) 
            
            
*/
private double Item;


/*

            Creates an empty AxisRates object
            

*/
public void AxisRates(){
return null;
}


/*

            Adds a new rate to the collection
            

*/
public void Add(Double,Double){
return null;
}


/*

            Moves the pointer to the next element
            

*/
public void MoveNext(){
return null;
}


/*

            Resets the enumerator to its initial posiiton before the first element
            

*/
public void Reset(){
return null;
}


/*

            Disposes of any external resources acquired by the object
            

*/
public void Dispose(){
return null;
}


/*

            Returns an enumerator to provide access to the collection members
            

*/
public void GetEnumerator(){
return null;
}

/*
 Sets 
            Returns the current value of the collection
            

*/
public void setCurrent(double _theValue){
this.Current=_theValue;
}

/*
 Gets 
            Returns the current value of the collection
            

*/
public double getCurrent(){
return Current;
}

/*
 Sets 
            Returns the number of rate objects in the collection
            

*/
public void setCount(double _theValue){
this.Count=_theValue;
}

/*
 Gets 
            Returns the number of rate objects in the collection
            

*/
public double getCount(){
return Count;
}

/*
 Sets 
            Return information about the rates at which the telescope may be moved about the specified axis by the  method.
            
The (symbolic) values for Index () are:
            
             0 Primary axis (e.g., Hour Angle or Azimuth)
             1 Secondary axis (e.g., Declination or Altitude)
             2 Tertiary axis (e.g. imager rotator/de-rotator) 
            
            
*/
public void setItem(double _theValue){
this.Item=_theValue;
}

/*
 Gets 
            Return information about the rates at which the telescope may be moved about the specified axis by the  method.
            
The (symbolic) values for Index () are:
            
             0 Primary axis (e.g., Hour Angle or Azimuth)
             1 Secondary axis (e.g., Declination or Altitude)
             2 Tertiary axis (e.g. imager rotator/de-rotator) 
            
            
*/
public double getItem(){
return Item;
}
}
