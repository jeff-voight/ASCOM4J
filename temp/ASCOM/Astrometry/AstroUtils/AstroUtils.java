package ASCOM.Astrometry.AstroUtils;

/*

                Class providing a suite of tested astronomy support functions to save develpment effort and provide consistant behaviour.
            


                A number of these routines are provided to support migration from the Astro32.dll. Unlike Astro32, these routines will work in 
                both 32bit and 64bit applications.
            
*/
public class AstroUtils{

/*

                Current Julian date based on the UTC time scale
            

*/
private double JulianDateUtc;
/*

                Sets or returns the number of leap seconds used in ASCOM Astrometry functions
            
The property value is stored in the ASCOM Profile under the name \Astrometry\Leap Seconds. Any change made to this property 
                will be persisted to the ASCOM Profile store and will be immediately availble to this and all future instances of AstroUtils.
                The current value and any announced but not yet actioned change are listed 
                    here: ftp://hpiers.obspm.fr/iers/bul/bulc/bulletinc.dat
            
*/
private double LeapSeconds;


/*

                Releases all resources owned by the AstroUtils component and readies it for disposal
            

*/
public void Dispose(){
return null;
}


/*

                Flexible routine to range a number into a given range between a lower and an higher bound.
            

                UpperEqual and LowerEqual switches control whether the ranged value can be equal to either the upper and lower bounds. So, 
                to range an hour angle into the range 0 to 23.999999.. hours, use this call: 
                RangedValue = Range(InputValue, 0.0, True, 24.0, False)
                The input value will be returned in the range where 0.0 is an allowable value and 24.0 is not i.e. in the range 0..23.999999..
                It is not permissible for both LowerEqual and UpperEqual to be false because it will not be possible to return a value that is exactly equal 
                    to either lower or upper bounds. An exception is thrown if this scenario is requested.
            
*/
public void Range(Double,Double,Boolean,Double,Boolean){
return null;
}


/*

                Conditions an hour angle to be in the range -12.0 to +12.0 by adding or subtracting 24.0 hours
            

*/
public void ConditionHA(Double){
return null;
}


/*

                Conditions a Right Ascension value to be in the range 0 to 23.999999.. hours 
            

*/
public void ConditionRA(Double){
return null;
}


/*

                Returns the current DeltaT value in seconds
            
DeltaT is the difference between terrestrial time and the UT1 variant of universal time. ie.e TT = UT1 + DeltaT
*/
public void DeltaT(){
return null;
}


/*

                Current Julian date based on the terrestrial time (TT) time scale
            
When Delta-UT1 is provided, Terrestrial time is calculated as TT = UTC + DeltaUT1 + DeltaT. Otherwise, when Delta-UT1 is 0.0, 
                TT is calculated as TT = UTC + ΔAT + 32.184s, where ΔAT is the current number of leap seconds applied to UTC (34 at April 2012, with 
                the 35th being added at the end of June 2012). The resulting TT value is then converted to a Julian date and returned.
                Forecast values of Delta-UT1 are published by IERS Bulletin A at http://maia.usno.navy.mil/ser7/ser7.dat
                
            
*/
public void JulianDateTT(Double){
return null;
}


/*

                Current Julian date based on the UT1 time scale
            
UT1 time is calculated as UT1 = UTC + DeltaUT1 when DeltaUT1 is non zero. otherwise it is calaulcated through TAI and DeltaT.
                This value is then converted to a Julian date and returned.
                When Delta-UT1 is provided, UT1 is calculated as UT1 = UTC + DeltaUT1. Otherwise, when Delta-UT1 is 0.0, 
                    DeltaUT1 is calculated as DeltaUT1 = TT - DeltaT = UTC + ΔAT + 32.184s - DeltaT, where ΔAT is the current number of leap seconds applied 
                    to UTC (34 at April 2012, with the 35th being added at the end of June 2012).
                Forecast values of DUT1 are published by IERS Bulletin A at http://maia.usno.navy.mil/ser7/ser7.dat
                
            
*/
public void JulianDateUT1(Double){
return null;
}


/*

                Computes atmospheric refraction in zenith distance. 
            
This version computes approximate refraction for optical wavelengths. This function 
                can be used for planning observations or telescope pointing, but should not be used for the 
                reduction of precise observations.
                Note: Unlike the NOVAS Refract method, Unrefract returns the unrefracted zenith distance itself rather than 
                    the difference between the refracted and unrefracted zenith distances.
            
*/
public void UnRefract(ASCOM.Astrometry.OnSurface,ASCOM.Astrometry.RefractionOption,Double){
return null;
}


/*

                Converts a calendar day, month, year to a modified Julian date
            

*/
public void CalendarToMJD(Int32,Int32,Int32){
return null;
}


/*

                Translates a modified Julian date to a VB ole automation date, presented as a double
            

*/
public void MJDToOADate(Double){
return null;
}


/*

                Translates a modified Julian date to a date
            

*/
public void MJDToDate(Double){
return null;
}


/*

                Returns a modified Julian date as a string formatted acording to the supplied presentation format
            
This expects the standard Microsoft date and time formatting characters as described 
                in http://msdn.microsoft.com/en-us/library/362btx8f(v=VS.90).aspx
            
*/
public void FormatMJD(Double,String){
return null;
}


/*

                Proivides an estimates of DeltaUT1, the difference between UTC and UT1. DeltaUT1 = UT1 - UTC
            
DeltaUT varies only slowly, so the Julian date can be based on UTC, UT1 or Terrestrial Time.
*/
public void DeltaUT(Double){
return null;
}


/*

                Returns a Julian date as a string formatted according to the supplied presentation format
            
This expects the standard Microsoft date and time formatting characters as described 
                in http://msdn.microsoft.com/en-us/library/362btx8f(v=VS.90).aspx
            
*/
public void FormatJD(Double,String){
return null;
}


/*

                Function that returns a list of rise and set events of a particular type that occur on a particular day at a given latitude, longitude and time zone
            

                The definitions of sunrise, sunset and the various twighlights that are used in this method are taken from the 
                    US Naval Observatory Definitions.
                
                The dynamics of the sun, Earth and Moon can result at some latitudes in days where there may be no, 1 or 2 rise or set events during 
                    a 24 hour period; in consequence, results are returned in the flexible form of arraylist.
                The returned zero based arraylist has the following values:
                    
                        Arraylist(0)                              - Boolean - True if the body is above the event limit at midnight (the beginning of the 24 hour day), false if it is below the event limit
                        Arraylist(1)                              - Integer - Number of rise events in this 24 hour period
                        Arraylist(2)                              - Integer - Number of set events in this 24 hour period
                        Arraylist(3) onwards                      - Double  - Values of rise events in hours 
                        Arraylist(3 + NumberOfRiseEvents) onwards - Double  - Values of set events in hours 
                    
                
                If the number of rise events is zero the first double value will be the first set event. If the numbers of both rise and set events
                    are zero, there will be no double values and the arraylist will just contain elements 0, 1 and 2, the above/below horizon flag and the integer count values.
                The algorithm employed in this method is taken from Astronomy on the Personal Computer (Montenbruck and Pfleger) pp 46..56, 
                    Springer Fourth Edition 2000, Fourth Printing 2009. The day is divided into twelve two hour intervals and a quadratic equation is fitted
                    to the altitudes at the beginning, middle and end of each interval. The resulting equation coefficients are then processed to determine 
                    the number of roots within the interval (each of which corresponds to a rise or set event) and their sense (rise or set). 
                    These results are are then aggregated over the day and the resultant list of values returned as the function result.
                
                High precision ephemeredes for the Sun, Moon and Earth and other planets from the JPL DE421 series are employed as delivered by the 
                    ASCOM NOVAS 3.1 component rather than using the lower precision ephemeredes employed by Montenbruck and Pfleger.
                
                
                    Accuracy Whole year almanacs for Sunrise/Sunset, Moonrise/Moonset and the various twighlights every 5 degrees from the 
                    North pole to the South Pole at a variety of longitudes, timezones and dates have been compared to data from
                    the US Naval Observatory Astronomical Data web site. The RMS error has been found to be 
                    better than 0.5 minute over the latitude range 80 degrees North to 80 degrees South and better than 5 minutes from 80 degrees to the relevant pole.
                    Most returned values are within 1 minute of the USNO values although some very infrequent grazing event times at lattiudes from 67 to 90 degrees North and South can be up to 
                    10 minutes different.
                
                An Almanac program that creates a year's worth of information for a given event, lattitude, longitude and timezone is included in the 
                    developer code examples elsewhere in this help file. This creates an output file with an almost identical format to that used by the USNO web site 
                    and allows comprehensive checking of acccuracy for a given set of parameters.
            
*/
public void EventTimes(ASCOM.Astrometry.EventType,Int32,Int32,Int32,Double,Double,Double){
return null;
}


/*

                Returns the altitude of the body given the input parameters
            

*/
public void BodyAltitude(ASCOM.Astrometry.EventType,Double,Double,Double,Double){
return null;
}


/*

                Returns the fraction of the Moon's surface that is illuminated 
            
 The algorithm used is that given in Astronomical Algorithms (Second Edition, Corrected to August 2009) 
                Chapter 48 p345 by Jean Meeus (Willmann-Bell 1991). The Sun and Moon positions are calculated by high precision NOVAS 3.1 library using JPL DE 421 ephemeredes.
            
*/
public void MoonIllumination(Double){
return null;
}


/*

                Returns the Moon phase as an angle
            
To allow maximum freedom in displaying the Moon phase, this function returns the excess of the apparent geocentric longitude
                of the Moon over the apparent geocentric longitude of the Sun, expressed as an angle in the range -180.0 to +180.0 degrees.
                This definition is taken from Astronomical Algorithms (Second Edition, Corrected to August 2009) Chapter 49 p349
                by Jean Meeus (Willmann-Bell 1991).
                The frequently used eight phase description for phases of the Moon can be easily constructed from the results of this function
                    using logic similar to the following:
                    
                        Select Case MoonPhase
                        Case -180.0 To -135.0
                        Phase = "Full Moon"
                        Case -135.0 To -90.0
                        Phase = "Waning Gibbous"
                        Case -90.0 To -45.0
                        Phase = "Last Quarter"
                        Case -45.0 To 0.0
                        Phase = "Waning Crescent"
                        Case 0.0 To 45.0
                        Phase = "New Moon"
                        Case 45.0 To 90.0
                        Phase = "Waxing Crescent"
                        Case 90.0 To 135.0
                        Phase = "First Quarter"
                        Case 135.0 To 180.0
                        Phase = "Waxing Gibbous"
                        End Select
                    
                
                Other representations can be easily constructed by changing the angle ranges and text descriptors as desired. The result range -180 to +180
                    was chosen so that negative values represent the Moon waning and positive values represent the Moon waxing.
            
*/
public void MoonPhase(Double){
return null;
}

/*
 Sets 
                Current Julian date based on the UTC time scale
            

*/
public void setJulianDateUtc(double _theValue){
this.JulianDateUtc=_theValue;
}

/*
 Gets 
                Current Julian date based on the UTC time scale
            

*/
public double getJulianDateUtc(){
return JulianDateUtc;
}

/*
 Sets 
                Sets or returns the number of leap seconds used in ASCOM Astrometry functions
            
The property value is stored in the ASCOM Profile under the name \Astrometry\Leap Seconds. Any change made to this property 
                will be persisted to the ASCOM Profile store and will be immediately availble to this and all future instances of AstroUtils.
                The current value and any announced but not yet actioned change are listed 
                    here: ftp://hpiers.obspm.fr/iers/bul/bulc/bulletinc.dat
            
*/
public void setLeapSeconds(double _theValue){
this.LeapSeconds=_theValue;
}

/*
 Gets 
                Sets or returns the number of leap seconds used in ASCOM Astrometry functions
            
The property value is stored in the ASCOM Profile under the name \Astrometry\Leap Seconds. Any change made to this property 
                will be persisted to the ASCOM Profile store and will be immediately availble to this and all future instances of AstroUtils.
                The current value and any announced but not yet actioned change are listed 
                    here: ftp://hpiers.obspm.fr/iers/bul/bulc/bulletinc.dat
            
*/
public double getLeapSeconds(){
return LeapSeconds;
}
}
