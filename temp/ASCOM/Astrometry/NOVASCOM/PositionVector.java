package ASCOM.Astrometry.NOVASCOM;

/*

                NOVAS-COM: PositionVector Class
            

NOVAS-COM objects of class PositionVector contain vectors used for positions (earth, sites, 
                stars and planets) throughout NOVAS-COM. Of course, its properties include the x, y, and z 
                components of the position. Additional properties are right ascension and declination, distance, 
                and light time (applicable to star positions), and Alt/Az (available only in PositionVectors 
                returned by Star or Planet methods GetTopocentricPosition()). You can initialize a PositionVector 
                from a Star object (essentially an FK5 or HIP catalog entry) or a Site (lat/long/height). 
                PositionVector has methods that can adjust the coordinates for precession, aberration and 
                proper motion. Thus, a PositionVector object gives access to some of the lower-level NOVAS functions. 
                
                    Note: The equatorial coordinate properties of this object are dependent variables, and thus are read-only. Changing any cartesian coordinate will cause the equatorial coordinates to be recalculated. 
                
            
*/
public class PositionVector{

/*

                The azimuth coordinate (degrees, + east)
            

*/
private double Azimuth;
/*

                Declination coordinate
            

*/
private double Declination;
/*

                Distance/Radius coordinate
            

*/
private double Distance;
/*

                The elevation (altitude) coordinate (degrees, + up)
            
Elevation is available only in PositionVectors returned from calls to 
                Star.GetTopocentricPosition() and/or Planet.GetTopocentricPosition(). 
*/
private double Elevation;
/*

                Light time from body to origin, days.
            

*/
private double LightTime;
/*

                RightAscension coordinate, hours
            

*/
private double RightAscension;
/*

                Position cartesian x component
            

*/
private double x;
/*

                Position cartesian y component
            

*/
private double y;
/*

                Position cartesian z component
            

*/
private double z;


/*

                Create a new, uninitialised position vector
            

*/
public void PositionVector(){
return null;
}


/*

                Create a new position vector with supplied initial values
            

*/
public void PositionVector(Double,Double,Double,Double,Double,Double,Double,Double,Double){
return null;
}


/*

                Create a new position vector with supplied initial values
            

*/
public void PositionVector(Double,Double,Double,Double,Double,Double,Double){
return null;
}


/*

                Adjust the position vector of an object for aberration of light
            
The algorithm includes relativistic terms
*/
public void Aberration(ASCOM.Astrometry.NOVASCOM.VelocityVector){
return null;
}


/*

                Adjust the position vector for precession of equinoxes between two given epochs
            
The coordinates are referred to the mean equator and equinox of the two respective epochs.
*/
public void Precess(Double,Double){
return null;
}


/*

                Adjust the position vector for proper motion (including foreshortening effects)
            

*/
public void ProperMotion(ASCOM.Astrometry.NOVASCOM.VelocityVector,Double,Double){
return null;
}


/*

                Initialize the PositionVector from a Site object and Greenwich apparent sidereal time.
            
The GAST parameter must be for Greenwich, not local. The time is rotated through the 
                site longitude. See SetFromSiteJD() for an equivalent method that takes UTC Julian Date and 
                Delta-T (eliminating the need for calculating hyper-accurate GAST yourself).
*/
public void SetFromSite(ASCOM.Astrometry.NOVASCOM.Site,Double){
return null;
}


/*

                Initialize the PositionVector from a Site object using UTC Julian date
            
The Julian date must be UTC Julian date, not terrestrial. Calculations will use the internal delta-T tables and estimator to get 
                delta-T. 
                This overload is not available through COM, please use 
                "SetFromSiteJD(ByVal site As Site, ByVal ujd As Double, ByVal delta_t As Double)"
                with delta_t set to 0.0 to achieve this effect.
            
*/
public void SetFromSiteJD(ASCOM.Astrometry.NOVASCOM.Site,Double){
return null;
}


/*

                Initialize the PositionVector from a Site object using UTC Julian date and Delta-T
            
The Julian date must be UTC Julian date, not terrestrial.
*/
public void SetFromSiteJD(ASCOM.Astrometry.NOVASCOM.Site,Double,Double){
return null;
}


/*

                Initialize the PositionVector from a Star object.
            

*/
public void SetFromStar(ASCOM.Astrometry.NOVASCOM.Star){
return null;
}

/*
 Sets 
                The azimuth coordinate (degrees, + east)
            

*/
public void setAzimuth(double _theValue){
this.Azimuth=_theValue;
}

/*
 Gets 
                The azimuth coordinate (degrees, + east)
            

*/
public double getAzimuth(){
return Azimuth;
}

/*
 Sets 
                Declination coordinate
            

*/
public void setDeclination(double _theValue){
this.Declination=_theValue;
}

/*
 Gets 
                Declination coordinate
            

*/
public double getDeclination(){
return Declination;
}

/*
 Sets 
                Distance/Radius coordinate
            

*/
public void setDistance(double _theValue){
this.Distance=_theValue;
}

/*
 Gets 
                Distance/Radius coordinate
            

*/
public double getDistance(){
return Distance;
}

/*
 Sets 
                The elevation (altitude) coordinate (degrees, + up)
            
Elevation is available only in PositionVectors returned from calls to 
                Star.GetTopocentricPosition() and/or Planet.GetTopocentricPosition(). 
*/
public void setElevation(double _theValue){
this.Elevation=_theValue;
}

/*
 Gets 
                The elevation (altitude) coordinate (degrees, + up)
            
Elevation is available only in PositionVectors returned from calls to 
                Star.GetTopocentricPosition() and/or Planet.GetTopocentricPosition(). 
*/
public double getElevation(){
return Elevation;
}

/*
 Sets 
                Light time from body to origin, days.
            

*/
public void setLightTime(double _theValue){
this.LightTime=_theValue;
}

/*
 Gets 
                Light time from body to origin, days.
            

*/
public double getLightTime(){
return LightTime;
}

/*
 Sets 
                RightAscension coordinate, hours
            

*/
public void setRightAscension(double _theValue){
this.RightAscension=_theValue;
}

/*
 Gets 
                RightAscension coordinate, hours
            

*/
public double getRightAscension(){
return RightAscension;
}

/*
 Sets 
                Position cartesian x component
            

*/
public void setX(double _theValue){
this.x=_theValue;
}

/*
 Gets 
                Position cartesian x component
            

*/
public double getX(){
return x;
}

/*
 Sets 
                Position cartesian y component
            

*/
public void setY(double _theValue){
this.y=_theValue;
}

/*
 Gets 
                Position cartesian y component
            

*/
public double getY(){
return y;
}

/*
 Sets 
                Position cartesian z component
            

*/
public void setZ(double _theValue){
this.z=_theValue;
}

/*
 Gets 
                Position cartesian z component
            

*/
public double getZ(){
return z;
}
}
