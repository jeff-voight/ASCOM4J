package ASCOM.Astrometry.SOFA;

/*

                This class presents a subset of the SOFA (Standards of Fundamental Astronomy) astrometry routines in a form that is easily accessible from both 32bit and 64bit .NET and 
                COM applications.
            


                SOFA operates under the auspices of the International Astronomical Union (IAU) to provide algorithms and software for use in astronomical computing. The entire SOFA 
                collection comprises many authoritative routines across a number of areas including:
                
                    
                        Astrometry
                    
                    
                        Calendars
                    
                    
                        Time Scales
                    
                    
                        Earth rotation and sidereal time
                    
                    
                        Ephemerides (medium precision)
                    
                    
                        Geocentric/geodetic transformations
                    
                    
                        Precession, nutation, polar motion
                    
                    
                        Star space motion
                    
                    
                        Star catalogue conversion
                    
                
                
                    The class's functionality is provided by underlying DLLs compiled from unmodified original C source code distributed by SOFA but the class does not constitute software provided by and/or endorsed by SOFA.
                        No change whatsoever has been made to the algorithms implemented by SOFA that realise IAU standards.
                
                SOFA provides a validation routine to confirm that the compiled library provides expected results. 32 and 64bit versions of this routine (SofaTestXX.exe and SofaTestXX-64.exe, where XX is the issue number) 
                    are included in this distribution and can be found in the Common Files\ASCOM\Astrometry directory. To run them open a command prompt in the Astrometry directory and enter the commands SofaTest10 /verbose and SofaTest10-64 /verbose.
                    The susbset of these tests that is relevant to the routines presented in this component have also been incorporated in the ASCOM Diagnostics tool and expected operation of the SOFA routnines can be confirmed through this tool.
                Further information on the full library of SOFA routines is available here: http://www.iausofa.org/ 
            
*/
public class SOFA{



/*

                Creates a new instance of the SOFA component
            

*/
public void SOFA(){
return null;
}


/*

                Cleans up the SOFA object
            

*/
public void Dispose(){
return null;
}


/*

                Major number of the SOFA issue currently used by this component.
            

*/
public void SofaReleaseNumber(){
return null;
}


/*

                Release date of the SOFA issue currently used by this component.
            

*/
public void SofaIssueDate(){
return null;
}


/*

                Release date of the revision to the SOFA Issue that is actually being used by this component.
            
When a new issue is employed that doesn't yet have a revision, this mehtod will return the SofaIssueDate
*/
public void SofaRevisionDate(){
return null;
}


/*

                Convert degrees, arcminutes, arcseconds to radians.
            

                Notes:
                
                    
                        The result is computed even if any of the range checks fail.
                    
                    
                        Negative ideg, iamin and/or asec produce a warning status, but the absolute value is used in the conversion.
                    
                    
                        If there are multiple errors, the status value reflects only the first, the smallest taking precedence.
                    
                
            
*/
public void Af2a(String,Int32,Int32,Double,Double@){
return null;
}


/*

                Normalize angle into the range 0 <= a < 2pi.
            

*/
public void Anp(Double){
return null;
}


/*

                Transform ICRS star data, epoch J2000.0, to CIRS using the SOFA Atci13 function.
            

                Notes:
                
                    
                        Star data for an epoch other than J2000.0 (for example from the Hipparcos catalog, which has an epoch of J1991.25) will require a preliminary call to iauPmsafe before use.
                    
                    
                        The proper motion in RA is dRA/dt rather than cos(Dec)*dRA/dt.
                    
                    
                         The TDB date date1+date2 is a Julian Date, apportioned in any convenient way between the two arguments.  For example, JD(TDB)=2450123.8g could be expressed in any of these ways, among others:
                            
                                
                                
                                
                                
                                    
                                        Date 1
                                    
                                    
                                        Date 2
                                    
                                    
                                        Method
                                    
                                
                                
                                    
                                        2450123.8
                                    
                                        0.0
                                    
                                        JD method
                                
                                
                                    
                                        2451545.0
                                    
                                        -1421.3
                                    
                                        J2000 method
                                
                                
                                    
                                        2400000.5
                                    
                                        50123.2
                                    
                                        MJD method
                                
                                
                                    
                                        2450123.5
                                    
                                        0.2
                                    
                                        Date and time method
                                
                            
                            The JD method is the most natural and convenient to use in cases where the loss of several decimal digits of resolution is acceptable.  The J2000 method is best matched to the way the argument is handled internally 
                                and will deliver the optimum resolution.  The MJD method and the date and time methods are both good compromises between resolution and convenience.  For most applications of this function the choice will not be at all critical.
                            TT can be used instead of TDB without any significant impact on accuracy.
                        
                    
                    
                        The available accuracy is better than 1 milliarcsecond, limited mainly by the precession-nutation model that is used, namely IAU 2000A/2006.  Very close to solar system bodies, additional 
                            errors of up to several milliarcseconds can occur because of unmodeled light deflection;  however, the Sun's contribution is taken into account, to first order.  The accuracy limitations of 
                            the SOFA function iauEpv00 (used to compute Earth position and velocity) can contribute aberration errors of up to 5 microarcseconds.  Light deflection at the Sun's limb is uncertain at the 0.4 mas level.
                    
                    
                        Should the transformation to (equinox based) apparent place be required rather than (CIO based) intermediate place, subtract the equation of the origins from the returned right ascension:
                            RA = RI - EO. (The Anp function can then be applied, as required, to keep the result in the conventional 0-2pi range.)
                    
                
            
*/
public void CelestialToIntermediate(Double,Double,Double,Double,Double,Double,Double,Double,Double@,Double@,Double@){
return null;
}


/*

                ICRS RA,Dec to observed place using the SOFA Atco13 function.
            

                Notes:
                
                    
                        Star data for an epoch other than J2000.0 (for example from the Hipparcos catalog, which has an epoch of J1991.25) will require a preliminary call to iauPmsafe before use.
                    
                    
                        The proper motion in RA is dRA/dt rather than cos(Dec)*dRA/dt.
                    
                    
                        utc1+utc2 is quasi Julian Date (see Note 2), apportioned in any convenient way between the two arguments, for example where utc1 is the Julian Day Number and utc2 is the fraction of a day.
                            However, JD cannot unambiguously represent UTC during a leap second unless special measures are taken.  The convention in the present function is that the JD day represents UTC days whether the length is 86399, 86400 or 86401 SI seconds.
                            Applications should use the function iauDtf2d to convert from calendar date and time of day into 2-part quasi Julian Date, as it implements the leap-second-ambiguity convention just described.
                        
                    
                    
                        The warning status "dubious year" flags UTCs that predate the introduction of the time scale or that are too far in the future to be trusted.  See iauDat for further details.
                    
                    
                        UT1-UTC is tabulated in IERS bulletins.  It increases by exactly one second at the end of each positive UTC leap second, introduced in order to keep UT1-UTC within +/- 0.9s.  n.b. This practice is under review, and in the future UT1-UTC may grow essentially without limit.
                    
                    
                        The geographical coordinates are with respect to the WGS84 reference ellipsoid.  TAKE CARE WITH THE LONGITUDE SIGN:  the longitude required by the present function is east-positive (i.e. right-handed), in accordance with geographical convention.
                    
                    
                        The polar motion xp,yp can be obtained from IERS bulletins.  The values are the coordinates (in radians) of the Celestial Intermediate Pole with respect to the International Terrestrial Reference System (see IERS Conventions 2003), measured along the meridians 0 and 90 deg west respectively.  For many applications, xp and yp can be set to zero.
                    
                    
                        If hm, the height above the ellipsoid of the observing station in meters, is not known but phpa, the pressure in hPa (=mB), is available, an adequate estimate of hm can be obtained from the expression:
                            
                                hm = -29.3 * tsl * log ( phpa / 1013.25 );
                            
                            where tsl is the approximate sea-level air temperature in K (See Astrophysical Quantities, C.W.Allen, 3rd edition, section 52).  Similarly, if the pressure phpa is not known, it can be estimated from the height of the observing station, hm, as follows:
                            
                                phpa = 1013.25 * exp ( -hm / ( 29.3 * tsl ) );
                            
                            Note, however, that the refraction is nearly proportional to the pressure and that an accurate phpa value is important for precise work.
                        
                    
                    
                        The argument wl specifies the observing wavelength in micrometers.  The transition from optical to radio is assumed to occur at 100 micrometers (about 3000 GHz).
                    
                    
                        The accuracy of the result is limited by the corrections for refraction, which use a simple A*tan(z) + B*tan^3(z) model. Providing the meteorological parameters are known accurately and there are no gross local effects, the predicted observed coordinates should be within 0.05 arcsec (optical) or 1 arcsec (radio) for a zenith distance of less than 70 degrees, better than 30 arcsec (optical or radio) at 85 degrees and better than 20 arcmin (optical) or 30 arcmin (radio) at the horizon.
                            Without refraction, the complementary functions iauAtco13 and iauAtoc13 are self-consistent to better than 1 microarcsecond all over the celestial sphere.  With refraction included, consistency falls off at high zenith distances, but is still better than 0.05 arcsec at 85 degrees.
                        
                    
                    
                        "Observed" Az,ZD means the position that would be seen by a perfect geodetically aligned theodolite.  (Zenith distance is used rather than altitude in order to reflect the fact that no allowance is made for depression of the horizon.)  This is related to the observed HA,Dec via the standard rotation, using the geodetic latitude (corrected for polar motion), while the observed HA and RA are related simply through the Earth rotation angle and the site longitude.  "Observed" RA,Dec or HA,Dec thus means the position that would be seen by a perfect equatorial with its polar axis aligned to the Earth's axis of rotation.
                    
                    
                        It is advisable to take great care with units, as even unlikely values of the input parameters are accepted and processed in accordance with the models used.
                    
                
            
*/
public void CelestialToObserved(Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double@,Double@,Double@,Double@,Double@,Double@){
return null;
}


/*

                Encode date and time fields into 2-part Julian Date (or in the case of UTC a quasi-JD form that includes special provision for leap seconds).
            

                Notes:
                
                    
                        Scale identifies the time scale.  Only the value "UTC" (in upper case) is significant, and enables handling of leap seconds (see Note 4).
                    
                    
                        For calendar conventions and limitations, see iauCal2jd.
                    
                    
                        The sum of the results, d1+d2, is Julian Date, where normally d1 is the Julian Day Number and d2 is the fraction of a day.  In the case of UTC, where the use of JD is problematical, special conventions apply:  see the next note.
                    
                    
                        JD cannot unambiguously represent UTC during a leap second unless special measures are taken.  The SOFA internal convention is that the quasi-JD day represents UTC days whether the length is 86399,
                            86400 or 86401 SI seconds.  In the 1960-1972 era there were smaller jumps (in either direction) each time the linear UTC(TAI) expression was changed, and these "mini-leaps" are also included in the SOFA convention.
                    
                    
                        The warning status "time is after end of day" usually means that the sec argument is greater than 60.0.  However, in a day ending in a leap second the limit changes to 61.0 (or 59.0 in the case of a negative leap second).
                    
                    
                        The warning status "dubious year" flags UTCs that predate the introduction of the time scale or that are too far in the future to be trusted.  See iauDat for further details.
                    
                    
                        Only in the case of continuous and regular time scales (TAI, TT, TCG, TCB and TDB) is the result d1+d2 a Julian Date, strictly speaking.  In the other cases (UT1 and UTC) the result must be
                            used with circumspection;  in particular the difference between two such results cannot be interpreted as a precise time interval.
                    
                
            
*/
public void Dtf2d(String,Int32,Int32,Int32,Int32,Int32,Double,Double@,Double@){
return null;
}


/*

                Equation of the origins, IAU 2006 precession and IAU 2000A nutation.
            

                Notes:
                
                    
                         The TT date date1+date2 is a Julian Date, apportioned in any convenient way between the two arguments.  For example, JD(TT)=2450123.7 could be expressed in any of these ways, among others:
                            
                                
                                
                                
                                
                                    
                                        Date 1
                                    
                                    
                                        Date 2
                                    
                                    
                                        Method
                                    
                                
                                
                                    
                                        2450123.7
                                    
                                        0.0
                                    
                                        JD method
                                
                                
                                    
                                        2451545.0
                                    
                                        -1421.3
                                    
                                        J2000 method
                                
                                
                                    
                                        2400000.5
                                    
                                        50123.2
                                    
                                        MJD method
                                
                                
                                    
                                        2450123.5
                                    
                                        0.2
                                    
                                        Date and time method
                                
                            
                            The JD method is the most natural and convenient to use in cases where the loss of several decimal digits of resolution is acceptable.  The J2000 method is best matched to the way the argument is handled internally 
                                and will deliver the optimum resolution.  The MJD method and the date and time methods are both good compromises between resolution and convenience.  For most applications of this function the choice will not be at all critical.
                        
                    
                    
                         The equation of the origins is the distance between the true equinox and the celestial intermediate origin and, equivalently, the difference between Earth rotation angle and Greenwich
                            apparent sidereal time (ERA-GST).  It comprises the precession (since J2000.0) in right ascension plus the equation of the equinoxes (including the small correction terms).
                    
                
            
*/
public void Eo06a(Double,Double){
return null;
}


/*

                Transform star RA,Dec from geocentric CIRS to ICRS astrometric using the SOFA Atic13 function.
            

                Notes:
                
                    
                         The TDB date date1+date2 is a Julian Date, apportioned in any convenient way between the two arguments.  For example, JD(TDB)=2450123.8g could be expressed in any of these ways, among others:
                            
                                
                                
                                
                                
                                    
                                        Date 1
                                    
                                    
                                        Date 2
                                    
                                    
                                        Method
                                    
                                
                                
                                    
                                        2450123.8
                                    
                                        0.0
                                    
                                        JD method
                                
                                
                                    
                                        2451545.0
                                    
                                        -1421.3
                                    
                                        J2000 method
                                
                                
                                    
                                        2400000.5
                                    
                                        50123.2
                                    
                                        MJD method
                                
                                
                                    
                                        2450123.5
                                    
                                        0.2
                                    
                                        Date and time method
                                
                            
                            The JD method is the most natural and convenient to use in cases where the loss of several decimal digits of resolution is acceptable.  The J2000 method is best matched to the way the argument is handled internally 
                                and will deliver the optimum resolution.  The MJD method and the date and time methods are both good compromises between resolution and convenience.  For most applications of this function the choice will not be at all critical.
                            TT can be used instead of TDB without any significant impact on accuracy.
                        
                    
                    
                        Iterative techniques are used for the aberration and light deflection corrections so that the functions Atic13 and Atci13 are accurate inverses; 
                            even at the edge of the Sun's disk the discrepancy is only about 1 nanoarcsecond.
                    
                    
                        The available accuracy is better than 1 milliarcsecond, limited mainly by the precession-nutation model that is used, namely IAU 2000A/2006.  Very close to solar system bodies, additional 
                            errors of up to several milliarcseconds can occur because of unmodeled light deflection;  however, the Sun's contribution is taken into account, to first order.  The accuracy limitations of 
                            the SOFA function iauEpv00 (used to compute Earth position and velocity) can contribute aberration errors of up to 5 microarcseconds.  Light deflection at the Sun's limb is uncertain at the 0.4 mas level.
                    
                    
                        Should the transformation to (equinox based) J2000.0 mean place be required rather than (CIO based) ICRS coordinates, subtract the equation of the origins from the returned right ascension:
                            RA = RI - EO.  (The Anp function can then be applied, as required, to keep the result in the conventional 0-2pi range.)
                    
                
            
*/
public void IntermediateToCelestial(Double,Double,Double,Double,Double@,Double@,Double@){
return null;
}


/*

                CIRS RA,Dec to observed place using the SOFA Atio13 funciton.
            

                Notes:
                
                    
                        utc1+utc2 is quasi Julian Date (see Note 2), apportioned in any convenient way between the two arguments, for example where utc1 is the Julian Day Number and utc2 is the fraction of a day.
                            However, JD cannot unambiguously represent UTC during a leap second unless special measures are taken.  The convention in the present function is that the JD day represents UTC days whether the length is 86399, 86400 or 86401 SI seconds.
                            Applications should use the function iauDtf2d to convert from calendar date and time of day into 2-part quasi Julian Date, as it implements the leap-second-ambiguity convention just described.
                        
                    
                    
                        The warning status "dubious year" flags UTCs that predate the introduction of the time scale or that are too far in the future to be trusted.  See iauDat for further details.
                    
                    
                        UT1-UTC is tabulated in IERS bulletins.  It increases by exactly one second at the end of each positive UTC leap second, introduced in order to keep UT1-UTC within +/- 0.9s.  n.b. This practice is under review, and in the future UT1-UTC may grow essentially without limit.
                    
                    
                        The geographical coordinates are with respect to the WGS84 reference ellipsoid.  TAKE CARE WITH THE LONGITUDE SIGN:  the longitude required by the present function is east-positive (i.e. right-handed), in accordance with geographical convention.
                    
                    
                        The polar motion xp,yp can be obtained from IERS bulletins.  The values are the coordinates (in radians) of the Celestial Intermediate Pole with respect to the International Terrestrial
                            Reference System (see IERS Conventions 2003), measured along the meridians 0 and 90 deg west respectively.  For many applications, xp and yp can be set to zero.
                    
                    
                        If hm, the height above the ellipsoid of the observing station in meters, is not known but phpa, the pressure in hPa (=mB), is available, an adequate estimate of hm can be obtained from the expression:
                            
                                hm = -29.3 * tsl * log ( phpa / 1013.25 );
                            
                            where tsl is the approximate sea-level air temperature in K (See Astrophysical Quantities, C.W.Allen, 3rd edition, section 52).  Similarly, if the pressure phpa is not known, it can be estimated from the height of the observing station, hm, as follows:
                            
                                phpa = 1013.25 * exp ( -hm / ( 29.3 * tsl ) );
                            
                            Note, however, that the refraction is nearly proportional to the pressure and that an accurate phpa value is important for precise work.
                        
                    
                    
                        The argument wl specifies the observing wavelength in micrometers.  The transition from optical to radio is assumed to occur at 100 micrometers (about 3000 GHz).
                    
                    
                        "Observed" Az,ZD means the position that would be seen by a perfect geodetically aligned theodolite.  (Zenith distance is used rather than altitude in order to reflect the fact that no
                            allowance is made for depression of the horizon.)  This is related to the observed HA,Dec via the standard rotation, using the geodetic latitude (corrected for polar motion), while the observed HA and RA are related simply through the Earth rotation
                            angle and the site longitude.  "Observed" RA,Dec or HA,Dec thus means the position that would be seen by a perfect equatorial with its polar axis aligned to the Earth's axis of rotation.
                    
                    
                        The accuracy of the result is limited by the corrections for refraction, which use a simple A*tan(z) + B*tan^3(z) model. Providing the meteorological parameters are known accurately and there are no gross local effects, the predicted astrometric
                            coordinates should be within 0.05 arcsec (optical) or 1 arcsec (radio) for a zenith distance of less than 70 degrees, better than 30 arcsec (optical or radio) at 85 degrees and better than 20 arcmin (optical) or 30 arcmin (radio) at the horizon.
                    
                    
                        The complementary functions iauAtio13 and iauAtoi13 are self-consistent to better than 1 microarcsecond all over the celestial sphere.
                    
                    
                        It is advisable to take great care with units, as even unlikely values of the input parameters are accepted and processed in accordance with the models used.
                    
                
            
*/
public void IntermediateToObserved(Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double@,Double@,Double@,Double@,Double@){
return null;
}


/*

                Observed place at a groundbased site to to ICRS astrometric RA,Dec using the SOFA Atoc13 function.
            

                Notes:
                
                    
                        "Observed" Az,ZD means the position that would be seen by a perfect geodetically aligned theodolite.  (Zenith distance is used rather than altitude in order to reflect the fact that no
                            allowance is made for depression of the horizon.)  This is related to the observed HA,Dec via the standard rotation, using the geodetic latitude (corrected for polar motion), while the
                            observed HA and RA are related simply through the Earth rotation angle and the site longitude.  "Observed" RA,Dec or HA,Dec thus means the position that would be seen by a perfect equatorial with its polar axis aligned to the Earth's axis of rotation.
                    
                    
                        Only the first character of the type argument is significant. "R" or "r" indicates that ob1 and ob2 are the observed right ascension and declination;  "H" or "h" indicates that they are hour angle (west +ve) and declination;  anything else ("A" or
                            "a" is recommended) indicates that ob1 and ob2 are azimuth (north zero, east 90 deg) and zenith distance.
                    
                    
                        utc1+utc2 is quasi Julian Date (see Note 2), apportioned in any convenient way between the two arguments, for example where utc1 is the Julian Day Number and utc2 is the fraction of a day.
                            However, JD cannot unambiguously represent UTC during a leap second unless special measures are taken.  The convention in the present function is that the JD day represents UTC days whether the length is 86399, 86400 or 86401 SI seconds.
                            Applications should use the function iauDtf2d to convert from calendar date and time of day into 2-part quasi Julian Date, as it implements the leap-second-ambiguity convention just described.
                        
                    
                    
                        The warning status "dubious year" flags UTCs that predate the introduction of the time scale or that are too far in the future to be trusted.  See iauDat for further details.
                    
                    
                        UT1-UTC is tabulated in IERS bulletins.  It increases by exactly one second at the end of each positive UTC leap second, introduced in order to keep UT1-UTC within +/- 0.9s.  n.b. This practice is under review, and in the future UT1-UTC may grow essentially without limit.
                    
                    
                        The geographical coordinates are with respect to the WGS84 reference ellipsoid.  TAKE CARE WITH THE LONGITUDE SIGN:  the longitude required by the present function is east-positive (i.e. right-handed), in accordance with geographical convention.
                    
                    
                        The polar motion xp,yp can be obtained from IERS bulletins.  The values are the coordinates (in radians) of the Celestial Intermediate Pole with respect to the International Terrestrial Reference System (see IERS Conventions 2003), measured along the
                            meridians 0 and 90 deg west respectively.  For many applications, xp and yp can be set to zero.
                    
                    
                        If hm, the height above the ellipsoid of the observing station in meters, is not known but phpa, the pressure in hPa (=mB), is available, an adequate estimate of hm can be obtained from the expression:
                            
                                hm = -29.3 * tsl * log ( phpa / 1013.25 );
                            
                            where tsl is the approximate sea-level air temperature in K (See Astrophysical Quantities, C.W.Allen, 3rd edition, section 52).  Similarly, if the pressure phpa is not known, it can be estimated from the height of the observing station, hm, as follows:
                            
                                phpa = 1013.25 * exp ( -hm / ( 29.3 * tsl ) );
                            
                            Note, however, that the refraction is nearly proportional to the pressure and that an accurate phpa value is important for precise work.
                        
                    
                    
                        The argument wl specifies the observing wavelength in micrometers.  The transition from optical to radio is assumed to occur at 100 micrometers (about 3000 GHz).
                    
                    
                        The accuracy of the result is limited by the corrections for refraction, which use a simple A*tan(z) + B*tan^3(z) model. Providing the meteorological parameters are known accurately and
                            there are no gross local effects, the predicted astrometric coordinates should be within 0.05 arcsec (optical) or 1 arcsec (radio) for a zenith distance of less than 70 degrees, better than 30 arcsec (optical or radio) at 85 degrees and better
                            than 20 arcmin (optical) or 30 arcmin (radio) at the horizon.
                            Without refraction, the complementary functions iauAtco13 and iauAtoc13 are self-consistent to better than 1 microarcsecond all over the celestial sphere.  With refraction included, consistency falls off at high zenith distances, but is still better than 0.05 arcsec at 85 degrees.
                        
                    
                    
                        It is advisable to take great care with units, as even unlikely values of the input parameters are accepted and processed in accordance with the models used.
                    
                
            
*/
public void ObservedToCelestial(String,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double@,Double@){
return null;
}


/*

                Observed place to CIRS using the SOFA Atoi13 function.
            

                Notes:
                
                    
                        "Observed" Az,ZD means the position that would be seen by a perfect geodetically aligned theodolite.  (Zenith distance is used rather than altitude in order to reflect the fact that no
                            allowance is made for depression of the horizon.)  This is related to the observed HA,Dec via the standard rotation, using the geodetic latitude (corrected for polar motion), while the
                            observed HA and RA are related simply through the Earth rotation angle and the site longitude.  "Observed" RA,Dec or HA,Dec thus means the position that would be seen by a perfect equatorial
                            with its polar axis aligned to the Earth's axis of rotation.
                    
                    
                        Only the first character of the type argument is significant. "R" or "r" indicates that ob1 and ob2 are the observed right ascension and declination;  "H" or "h" indicates that they are
                            hour angle (west +ve) and declination;  anything else ("A" or "a" is recommended) indicates that ob1 and ob2 are azimuth (north zero, east 90 deg) and zenith distance.
                    
                    
                        utc1+utc2 is quasi Julian Date (see Note 2), apportioned in any convenient way between the two arguments, for example where utc1 is the Julian Day Number and utc2 is the fraction of a day.
                            However, JD cannot unambiguously represent UTC during a leap second unless special measures are taken.  The convention in the present function is that the JD day represents UTC days whether the length is 86399, 86400 or 86401 SI seconds.
                            Applications should use the function iauDtf2d to convert from calendar date and time of day into 2-part quasi Julian Date, as it implements the leap-second-ambiguity convention just described.
                        
                    
                    
                        The warning status "dubious year" flags UTCs that predate the introduction of the time scale or that are too far in the future to be trusted.  See iauDat for further details.
                    
                    
                        UT1-UTC is tabulated in IERS bulletins.  It increases by exactly one second at the end of each positive UTC leap second, introduced in order to keep UT1-UTC within +/- 0.9s.  n.b. This
                            practice is under review, and in the future UT1-UTC may grow essentially without limit.
                    
                    
                        The geographical coordinates are with respect to the WGS84 reference ellipsoid.  TAKE CARE WITH THE LONGITUDE SIGN:  the longitude required by the present function is east-positive
                            (i.e. right-handed), in accordance with geographical convention.
                    
                    
                        The polar motion xp,yp can be obtained from IERS bulletins.  The values are the coordinates (in radians) of the Celestial Intermediate Pole with respect to the International Terrestrial
                            Reference System (see IERS Conventions 2003), measured along the meridians 0 and 90 deg west respectively.  For many applications, xp and yp can be set to zero.
                    
                    
                        If hm, the height above the ellipsoid of the observing station in meters, is not known but phpa, the pressure in hPa (=mB), is available, an adequate estimate of hm can be obtained from the expression:
                            
                                hm = -29.3 * tsl * log ( phpa / 1013.25 );
                            
                            where tsl is the approximate sea-level air temperature in K (See Astrophysical Quantities, C.W.Allen, 3rd edition, section 52).  Similarly, if the pressure phpa is not known, it can be estimated from the height of the observing station, hm, as follows:
                            
                                phpa = 1013.25 * exp ( -hm / ( 29.3 * tsl ) );
                            
                            Note, however, that the refraction is nearly proportional to the pressure and that an accurate phpa value is important for precise work.
                        
                    
                    
                        The argument wl specifies the observing wavelength in micrometers.  The transition from optical to radio is assumed to occur at 100 micrometers (about 3000 GHz).
                    
                    
                        The accuracy of the result is limited by the corrections for refraction, which use a simple A*tan(z) + B*tan^3(z) model. Providing the meteorological parameters are known accurately and
                            there are no gross local effects, the predicted astrometric coordinates should be within 0.05 arcsec (optical) or 1 arcsec (radio) for a zenith distance of less than 70 degrees, better
                            than 30 arcsec (optical or radio) at 85 degrees and better than 20 arcmin (optical) or 30 arcmin (radio) at the horizon.
                            Without refraction, the complementary functions iauAtio13 and iauAtoi13 are self-consistent to better than 1 microarcsecond all over the celestial sphere.  With refraction included,
                                consistency falls off at high zenith distances, but is still better than 0.05 arcsec at 85 degrees.
                        
                    
                    
                        It is advisable to take great care with units, as even unlikely values of the input parameters are accepted and processed in accordance with the models used.
                    
                
            
*/
public void ObservedToIntermediate(String,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double,Double@,Double@){
return null;
}


/*

                Time scale transformation:  International Atomic Time, TAI, to Coordinated Universal Time, UTC.
            

                Notes:
                
                    
                        tai1+tai2 is Julian Date, apportioned in any convenient way between the two arguments, for example where tai1 is the Julian Day Number and tai2 is the fraction of a day.  The returned utc1
                            and utc2 form an analogous pair, except that a special convention is used, to deal with the problem of leap seconds - see the next note.
                    
                    
                        JD cannot unambiguously represent UTC during a leap second unless special measures are taken.  The convention in the present function is that the JD day represents UTC days whether the
                            length is 86399, 86400 or 86401 SI seconds.  In the 1960-1972 era there were smaller jumps (in either direction) each time the linear UTC(TAI) expression was changed, and these "mini-leaps are also included in the SOFA convention.
                    
                    
                        The function iauD2dtf can be used to transform the UTC quasi-JD into calendar date and clock time, including UTC leap second handling.
                    
                    
                        The warning status "dubious year" flags UTCs that predate the introduction of the time scale or that are too far in the future to be trusted.  See iauDat for further details.
                    
                
            
*/
public void TaiUtc(Double,Double,Double@,Double@){
return null;
}


/*

                Time scale transformation:  International Atomic Time, TAI, to Terrestrial Time, TT.
            

                Notes:
                
                    
                         tai1+tai2 is Julian Date, apportioned in any convenient way between the two arguments, for example where tai1 is the Julian Day Number and tai2 is the fraction of a day.  The returned
                            tt1,tt2 follow suit.
                    
                
            
*/
public void TaiTt(Double,Double,Double@,Double@){
return null;
}


/*

                Time scale transformation:  Terrestrial Time, TT, to International Atomic Time, TAI.
            

                Note
                
                    
                        tt1+tt2 is Julian Date, apportioned in any convenient way between the two arguments, for example where tt1 is the Julian Day Number and tt2 is the fraction of a day.  The returned tai1,tai2 follow suit.
                    
                
            
*/
public void TtTai(Double,Double,Double@,Double@){
return null;
}


/*

                Convert hours, minutes, seconds to radians.
            

                Notes:
                
                    
                        The result is computed even if any of the range checks fail.
                    
                    
                        Negative ihour, imin and/or sec produce a warning status, but the absolute value is used in the conversion.
                    
                    
                        If there are multiple errors, the status value reflects only the first, the smallest taking precedence.
                    
                
            
*/
public void Tf2a(String,Int32,Int32,Double,Double@){
return null;
}


/*

                Time scale transformation:  Coordinated Universal Time, UTC, to International Atomic Time, TAI.
            

                Notes:
                
                    
                        utc1+utc2 is quasi Julian Date (see Note 2), apportioned in any convenient way between the two arguments, for example where utc1 is the Julian Day Number and utc2 is the fraction of a day.
                    
                    
                        JD cannot unambiguously represent UTC during a leap second unless special measures are taken.  The convention in the present function is that the JD day represents UTC days whether the
                            length is 86399, 86400 or 86401 SI seconds.  In the 1960-1972 era there were smaller jumps (in either direction) each time the linear UTC(TAI) expression was changed, and these "mini-leaps" are also included in the SOFA convention.
                    
                    
                        The warning status "dubious year" flags UTCs that predate the introduction of the time scale or that are too far in the future to be trusted.  See iauDat for further details.
                    
                    
                        The function iauDtf2d converts from calendar date and time of day into 2-part Julian Date, and in the case of UTC implements the leap-second-ambiguity convention described above.
                    
                    
                        The returned TAI1,TAI2 are such that their sum is the TAI Julian Date.
                    
                
            
*/
public void UtcTai(Double,Double,Double@,Double@){
return null;
}


/*

                Get path to a system folder
            

*/
public void SHGetSpecialFolderPath(IntPtr,Text.StringBuilder,Int32,Boolean){
return null;
}


/*

                Loads a library DLL
            
This is a wrapper for the Windows kernel32 function LoadLibraryA
*/
public void LoadLibrary(String){
return null;
}


/*

                Unloads a library DLL
            

*/
public void FreeLibrary(IntPtr){
return null;
}


/*

                Indicates whether we are running as a 32bit or 64bit application 
            

*/
public void Is64Bit(){
return null;
}
}
