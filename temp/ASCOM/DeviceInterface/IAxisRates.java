package ASCOM.DeviceInterface;

/*

 A collection of rates at which the telescope may be moved about the specified axis by the  method.
 This is only used if the telescope interface version is 2 or 3
 

See the description of the  method for more information.
		This method must return an empty collection if  is not supported.
		The values used in  members must be non-negative; forward and backward motion is achieved by the application
 applying an appropriate sign to the returned  values in the  command.
	
*/
public class IAxisRates{

/*

 Return information about the rates at which the telescope may be moved about the specified axis by the  method.
 
The (symbolic) values for Index () are:
		
			 0 Primary axis (e.g., Hour Angle or Azimuth)
			 1 Secondary axis (e.g., Declination or Altitude)
			 2 Tertiary axis (e.g. imager rotator/de-rotator)
		
	
*/
private double Item;
/*

 Number of items in the returned collection
 

*/
private double Count;


/*

 Disposes of the object and cleans up
 

*/
public void Dispose(){
return null;
}


/*

 Returns an enumerator for the collection
 

*/
public void GetEnumerator(){
return null;
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

/*
 Sets 
 Number of items in the returned collection
 

*/
public void setCount(double _theValue){
this.Count=_theValue;
}

/*
 Gets 
 Number of items in the returned collection
 

*/
public double getCount(){
return Count;
}
}
