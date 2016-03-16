package ASCOM.DeviceInterface;

import java.util.Iterator;

/*

 A collection of rates at which the telescope may be moved about the specified axis by the  method.
 This is only used if the telescope interface version is 2 or 3
 

See the description of the  method for more information.
		This method must return an empty collection if  is not supported.
		The values used in  members must be non-negative; forward and backward motion is achieved by the application
 applying an appropriate sign to the returned  values in the  command.
	
 */
public interface IAxisRates {


    /*

 Disposes of the object and cleans up
 

     */
    public void Dispose();


    /*

 Returns an enumerator for the collection
 

     */
    public Iterator GetEnumerator();

    /*
 Sets 
 Return information about the rates at which the telescope may be moved about the specified axis by the  method.
 
The (symbolic) values for Index () are:
		
			 0 Primary axis (e.g., Hour Angle or Azimuth)
			 1 Secondary axis (e.g., Declination or Altitude)
			 2 Tertiary axis (e.g. imager rotator/de-rotator)
		
	
     */
    public void setItem(IRate _theRate);

    /*
 Gets 
 Return information about the rates at which the telescope may be moved about the specified axis by the  method.
 
The (symbolic) values for Index () are:
		
			 0 Primary axis (e.g., Hour Angle or Azimuth)
			 1 Secondary axis (e.g., Declination or Altitude)
			 2 Tertiary axis (e.g. imager rotator/de-rotator)
		
	
     */
    public IRate getItem();

    /*
 Sets 
 Number of items in the returned collection
 

     */
    public void setCount(int _theValue);

    /*
 Gets 
 Number of items in the returned collection
 

     */
    public int getCount();
}
