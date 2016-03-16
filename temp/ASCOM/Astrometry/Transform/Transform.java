package ASCOM.Astrometry.Transform;

/*

                Coordinate transform component; J2000 - apparent - local topocentric
            

Use this component to transform between J2000, apparent and local topocentric (JNow) coordinates or 
                vice versa. To use the component, instantiate it, then use one of SetJ2000 or SetJNow or SetApparent to 
                initialise with known values. Now use the RAJ2000, DECJ200, RAJNow, DECJNow, RAApparent and DECApparent etc. 
                properties to read off the required transformed values.
                The component can be reused simply by setting new co-ordinates with a Set command, there
                    is no need to create a new component each time a transform is required.
                Transforms are effected through the ASCOM NOVAS.Net engine that encapsulates the USNO NOVAS 3.1 library. 
                    The USNO NOVAS reference web page is: 
                    http://www.usno.navy.mil/USNO/astronomical-applications/software-products/novas
                    and the NOVAS 3.1 user guide is included in the ASCOM Developer Components install.
                
            
*/
public class Transform{

/*

                Gets or sets the site latitude
            
Positive numbers north of the equator, negative numbers south.
*/
private double SiteLatitude;
/*

                Gets or sets the site longitude
            
Positive numbers east of the Greenwich meridian, negative numbes west of the Greenwich meridian.
*/
private double SiteLongitude;
/*

                Gets or sets the site elevation above sea level
            

*/
private double SiteElevation;
/*

                Gets or sets the site ambient temperature
            

*/
private double SiteTemperature;
/*

                Gets or sets a flag indicating whether refraction is calculated for topocentric co-ordinates
            

*/
private double Refraction;
/*

                Returns the Right Ascension in J2000 co-ordinates
            

*/
private double RAJ2000;
/*

                Returns the Declination in J2000 co-ordinates
            

*/
private double DecJ2000;
/*

                Returns the Right Ascension in local topocentric co-ordinates
            

*/
private double RATopocentric;
/*

                Returns the Declination in local topocentric co-ordinates
            

*/
private double DECTopocentric;
/*

                Returns the Right Ascension in apparent co-ordinates
            

*/
private double RAApparent;
/*

                Returns the Declination in apparent co-ordinates
            

*/
private double DECApparent;
/*

                Returns the topocentric azimth angle of the target
            

*/
private double AzimuthTopocentric;
/*

                Returns the topocentric elevation of the target
            

*/
private double ElevationTopocentric;
/*

                Sets or returns the Julian date on the Terrestrial Time timescale for which the transform will be made
            
This method was introduced in May 2012. Previously, Transform used the current date-time of the PC when calculating transforms; 
                this remains the default behaviour for backward compatibility.
                The inital value of this parameter is 0.0, which is a special value that forces Transform to replicate original behaviour by determining the  
                Julian date from the PC's current date and time. If this property is non zero, that particular terrestrial time Julian date is used in preference 
                to the value derrived from the PC's clock.
                Only one of JulianDateTT or JulianDateUTC needs to be set. Use whichever is more readily available, there is no
                    need to set both values. Transform will use the last set value of either JulianDateTT or JulianDateUTC as the basis for its calculations.
            
*/
private double JulianDateTT;
/*

                Sets or returns the Julian date on the UTC timescale for which the transform will be made
            
Introduced in April 2014 as an alternative to JulianDateTT. Only one of JulianDateTT or JulianDateUTC needs to be set. Use whichever is more readily available, there is no
                need to set both values. Transform will use the last set value of either JulianDateTT or JulianDateUTC as the basis for its calculations.
*/
private double JulianDateUTC;


/*

                Cleans up resources used by the Transform component
            

*/
public void Dispose(){
return null;
}


/*

                Causes the transform component to recalculate values derrived from the last Set command
            
Use this when you have set J2000 co-ordinates and wish to ensure that the mount points to the same 
                co-ordinates allowing for local effects that change with time such as refraction.
                
                    Note: As of Platform 6 SP2 use of this method is not required, refresh is always performed automatically when required.
            
*/
public void Refresh(){
return null;
}


/*

                Sets the known J2000 Right Ascension and Declination coordinates that are to be transformed
            

*/
public void SetJ2000(Double,Double){
return null;
}


/*

                Sets the known apparent Right Ascension and Declination coordinates that are to be transformed
            

*/
public void SetApparent(Double,Double){
return null;
}


/*

                Sets the known local topocentric Right Ascension and Declination coordinates that are to be transformed
            

*/
public void SetTopocentric(Double,Double){
return null;
}


/*

                Sets the topocentric azimuth and elevation
            

*/
public void SetAzimuthElevation(Double,Double){
return null;
}

/*
 Sets 
                Gets or sets the site latitude
            
Positive numbers north of the equator, negative numbers south.
*/
public void setSiteLatitude(double _theValue){
this.SiteLatitude=_theValue;
}

/*
 Gets 
                Gets or sets the site latitude
            
Positive numbers north of the equator, negative numbers south.
*/
public double getSiteLatitude(){
return SiteLatitude;
}

/*
 Sets 
                Gets or sets the site longitude
            
Positive numbers east of the Greenwich meridian, negative numbes west of the Greenwich meridian.
*/
public void setSiteLongitude(double _theValue){
this.SiteLongitude=_theValue;
}

/*
 Gets 
                Gets or sets the site longitude
            
Positive numbers east of the Greenwich meridian, negative numbes west of the Greenwich meridian.
*/
public double getSiteLongitude(){
return SiteLongitude;
}

/*
 Sets 
                Gets or sets the site elevation above sea level
            

*/
public void setSiteElevation(double _theValue){
this.SiteElevation=_theValue;
}

/*
 Gets 
                Gets or sets the site elevation above sea level
            

*/
public double getSiteElevation(){
return SiteElevation;
}

/*
 Sets 
                Gets or sets the site ambient temperature
            

*/
public void setSiteTemperature(double _theValue){
this.SiteTemperature=_theValue;
}

/*
 Gets 
                Gets or sets the site ambient temperature
            

*/
public double getSiteTemperature(){
return SiteTemperature;
}

/*
 Sets 
                Gets or sets a flag indicating whether refraction is calculated for topocentric co-ordinates
            

*/
public void setRefraction(double _theValue){
this.Refraction=_theValue;
}

/*
 Gets 
                Gets or sets a flag indicating whether refraction is calculated for topocentric co-ordinates
            

*/
public double getRefraction(){
return Refraction;
}

/*
 Sets 
                Returns the Right Ascension in J2000 co-ordinates
            

*/
public void setRAJ2000(double _theValue){
this.RAJ2000=_theValue;
}

/*
 Gets 
                Returns the Right Ascension in J2000 co-ordinates
            

*/
public double getRAJ2000(){
return RAJ2000;
}

/*
 Sets 
                Returns the Declination in J2000 co-ordinates
            

*/
public void setDecJ2000(double _theValue){
this.DecJ2000=_theValue;
}

/*
 Gets 
                Returns the Declination in J2000 co-ordinates
            

*/
public double getDecJ2000(){
return DecJ2000;
}

/*
 Sets 
                Returns the Right Ascension in local topocentric co-ordinates
            

*/
public void setRATopocentric(double _theValue){
this.RATopocentric=_theValue;
}

/*
 Gets 
                Returns the Right Ascension in local topocentric co-ordinates
            

*/
public double getRATopocentric(){
return RATopocentric;
}

/*
 Sets 
                Returns the Declination in local topocentric co-ordinates
            

*/
public void setDECTopocentric(double _theValue){
this.DECTopocentric=_theValue;
}

/*
 Gets 
                Returns the Declination in local topocentric co-ordinates
            

*/
public double getDECTopocentric(){
return DECTopocentric;
}

/*
 Sets 
                Returns the Right Ascension in apparent co-ordinates
            

*/
public void setRAApparent(double _theValue){
this.RAApparent=_theValue;
}

/*
 Gets 
                Returns the Right Ascension in apparent co-ordinates
            

*/
public double getRAApparent(){
return RAApparent;
}

/*
 Sets 
                Returns the Declination in apparent co-ordinates
            

*/
public void setDECApparent(double _theValue){
this.DECApparent=_theValue;
}

/*
 Gets 
                Returns the Declination in apparent co-ordinates
            

*/
public double getDECApparent(){
return DECApparent;
}

/*
 Sets 
                Returns the topocentric azimth angle of the target
            

*/
public void setAzimuthTopocentric(double _theValue){
this.AzimuthTopocentric=_theValue;
}

/*
 Gets 
                Returns the topocentric azimth angle of the target
            

*/
public double getAzimuthTopocentric(){
return AzimuthTopocentric;
}

/*
 Sets 
                Returns the topocentric elevation of the target
            

*/
public void setElevationTopocentric(double _theValue){
this.ElevationTopocentric=_theValue;
}

/*
 Gets 
                Returns the topocentric elevation of the target
            

*/
public double getElevationTopocentric(){
return ElevationTopocentric;
}

/*
 Sets 
                Sets or returns the Julian date on the Terrestrial Time timescale for which the transform will be made
            
This method was introduced in May 2012. Previously, Transform used the current date-time of the PC when calculating transforms; 
                this remains the default behaviour for backward compatibility.
                The inital value of this parameter is 0.0, which is a special value that forces Transform to replicate original behaviour by determining the  
                Julian date from the PC's current date and time. If this property is non zero, that particular terrestrial time Julian date is used in preference 
                to the value derrived from the PC's clock.
                Only one of JulianDateTT or JulianDateUTC needs to be set. Use whichever is more readily available, there is no
                    need to set both values. Transform will use the last set value of either JulianDateTT or JulianDateUTC as the basis for its calculations.
            
*/
public void setJulianDateTT(double _theValue){
this.JulianDateTT=_theValue;
}

/*
 Gets 
                Sets or returns the Julian date on the Terrestrial Time timescale for which the transform will be made
            
This method was introduced in May 2012. Previously, Transform used the current date-time of the PC when calculating transforms; 
                this remains the default behaviour for backward compatibility.
                The inital value of this parameter is 0.0, which is a special value that forces Transform to replicate original behaviour by determining the  
                Julian date from the PC's current date and time. If this property is non zero, that particular terrestrial time Julian date is used in preference 
                to the value derrived from the PC's clock.
                Only one of JulianDateTT or JulianDateUTC needs to be set. Use whichever is more readily available, there is no
                    need to set both values. Transform will use the last set value of either JulianDateTT or JulianDateUTC as the basis for its calculations.
            
*/
public double getJulianDateTT(){
return JulianDateTT;
}

/*
 Sets 
                Sets or returns the Julian date on the UTC timescale for which the transform will be made
            
Introduced in April 2014 as an alternative to JulianDateTT. Only one of JulianDateTT or JulianDateUTC needs to be set. Use whichever is more readily available, there is no
                need to set both values. Transform will use the last set value of either JulianDateTT or JulianDateUTC as the basis for its calculations.
*/
public void setJulianDateUTC(double _theValue){
this.JulianDateUTC=_theValue;
}

/*
 Gets 
                Sets or returns the Julian date on the UTC timescale for which the transform will be made
            
Introduced in April 2014 as an alternative to JulianDateTT. Only one of JulianDateTT or JulianDateUTC needs to be set. Use whichever is more readily available, there is no
                need to set both values. Transform will use the last set value of either JulianDateTT or JulianDateUTC as the basis for its calculations.
*/
public double getJulianDateUTC(){
return JulianDateUTC;
}
}
