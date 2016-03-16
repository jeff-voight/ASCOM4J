package ASCOM.DeviceInterface;

/*

 Returns a collection of supported DriveRate values that describe the permissible values of the TrackingRate property for this telescope type.
 


*/
public class ITrackingRates{

/*

 Returns a specified item from the collection
 
This is only used by telescope interface versions 2 and 3
*/
private double Item;
/*

 Number of DriveRates supported by the Telescope
 

*/
private double Count;


/*

 Returns an enumerator for the collection
 

*/
public void GetEnumerator(){
return null;
}


/*

 Disposes of the TrackingRates object
 

*/
public void Dispose(){
return null;
}

/*
 Sets 
 Returns a specified item from the collection
 
This is only used by telescope interface versions 2 and 3
*/
public void setItem(double _theValue){
this.Item=_theValue;
}

/*
 Gets 
 Returns a specified item from the collection
 
This is only used by telescope interface versions 2 and 3
*/
public double getItem(){
return Item;
}

/*
 Sets 
 Number of DriveRates supported by the Telescope
 

*/
public void setCount(double _theValue){
this.Count=_theValue;
}

/*
 Gets 
 Number of DriveRates supported by the Telescope
 

*/
public double getCount(){
return Count;
}
}
