package ASCOM.Astrometry.NOVASCOM;

/*

                NOVAS-COM: Site Class
            

NOVAS-COM objects of class Site contain the specifications for an observer's location on the Earth 
                ellipsoid. Properties are latitude, longitude, height above mean sea level, the ambient temperature 
                and the sea-level barmetric pressure. The latter two are used only for optional refraction corrections. 
                Latitude and longitude are (common) geodetic, not geocentric. 
*/
public class Site{

/*

                Height above mean sea level
            

*/
private double Height;
/*

                Geodetic latitude (degrees, + north)
            

*/
private double Latitude;
/*

                Geodetic longitude (degrees, + east)
            

*/
private double Longitude;
/*

                Barometric pressure (millibars)
            

*/
private double Pressure;
/*

                Ambient temperature (deg. Celsius)
            

*/
private double Temperature;


/*

                Initialises a new site object
            

*/
public void Site(){
return null;
}


/*

                Set all site properties in one method call
            

*/
public void Set(Double,Double,Double){
return null;
}

/*
 Sets 
                Height above mean sea level
            

*/
public void setHeight(double _theValue){
this.Height=_theValue;
}

/*
 Gets 
                Height above mean sea level
            

*/
public double getHeight(){
return Height;
}

/*
 Sets 
                Geodetic latitude (degrees, + north)
            

*/
public void setLatitude(double _theValue){
this.Latitude=_theValue;
}

/*
 Gets 
                Geodetic latitude (degrees, + north)
            

*/
public double getLatitude(){
return Latitude;
}

/*
 Sets 
                Geodetic longitude (degrees, + east)
            

*/
public void setLongitude(double _theValue){
this.Longitude=_theValue;
}

/*
 Gets 
                Geodetic longitude (degrees, + east)
            

*/
public double getLongitude(){
return Longitude;
}

/*
 Sets 
                Barometric pressure (millibars)
            

*/
public void setPressure(double _theValue){
this.Pressure=_theValue;
}

/*
 Gets 
                Barometric pressure (millibars)
            

*/
public double getPressure(){
return Pressure;
}

/*
 Sets 
                Ambient temperature (deg. Celsius)
            

*/
public void setTemperature(double _theValue){
this.Temperature=_theValue;
}

/*
 Gets 
                Ambient temperature (deg. Celsius)
            

*/
public double getTemperature(){
return Temperature;
}
}
