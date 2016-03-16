package ASCOM.Astrometry.NOVAS;

/*

                NOVAS3: Class presenting the contents of the USNO NOVAS 3 library published December 2009. 
                NOVAS was developed by the Astronomical Applications department of the United States Naval 
                Observatory.
            

If you wish to explore or utilise NOVAS3 please see USNO's extensive help document "NOVAS 3 Users Guide" 
                (NOVAS C3.0 Guide.pdf) included in the ASCOM Platform Docs start menu folder. The latest revision is also available on the USNO web site at
                http://www.usno.navy.mil/USNO/astronomical-applications/software-products/novas
                in the "C Edition of NOVAS" link. 
                If you use NOVAS, please send an e-mail through this page:
                    http://www.usno.navy.mil/help/astronomy-help as this provides evidence to USNO that justifies further 
                    improvements and developments of NOVAS capabilities.
                
                
                    Note: This class is now deprecated, please use NOVAS31 instead.
            
*/
public class NOVAS3{



/*

                Creates a new instance of the NOVAS3 component
            

*/
public void NOVAS3(){
return null;
}


/*

                Cleans up the NOVAS3 object and releases its open file handle on the JPL planetary ephemeris file
            

*/
public void Dispose(){
return null;
}


/*

                Get position and velocity of target with respect to the centre object. 
            
This function accesses the JPL planetary ephemeris to give the position and velocity of the target 
                object with respect to the center object.
*/
public void PlanetEphemeris(Double[]@,ASCOM.Astrometry.Target,ASCOM.Astrometry.Target,Double[]@,Double[]@){
return null;
}


/*

                Produces the Cartesian heliocentric equatorial coordinates of the asteroid for the J2000.0 epoch 
                coordinate system from a set of Chebyshev polynomials read from a file.
            
The file name of the asteroid is taken from the name given.  It is	assumed that the name 
                is all in lower case characters.
                
                    This routine will search in the application's current directory for a file of Chebyshev 
                    polynomial coefficients whose name is based on the provided Name parameter: Name.chby 
                
                Further information on using NOVAS with minor planet data is given here: 
                    http://www.usno.navy.mil/USNO/astronomical-applications/software-products/usnoae98
            
*/
public void ReadEph(Int32,String,Double,Int32@){
return null;
}


/*

                Interface between the JPL direct-access solar system ephemerides and NOVAS-C.
            

*/
public void SolarSystem(Double,ASCOM.Astrometry.Body,ASCOM.Astrometry.Origin,Double[]@,Double[]@){
return null;
}


/*

                Read and interpolate the JPL planetary ephemeris file.
            

                The target number designation of the astronomical bodies is:
                
                    = 0: Mercury,               1: Venus, 
                    = 2: Earth-Moon barycenter, 3: Mars, 
                    = 4: Jupiter,               5: Saturn, 
                    = 6: Uranus,                7: Neptune, 
                    = 8: Pluto,                 9: geocentric Moon, 
                    =10: Sun.
                
                
                    NOTE 1. For ease in programming, the user may put the entire epoch in jed[0] and set jed[1] = 0. 
                    For maximum interpolation accuracy,  set jed[0] = the most recent midnight at or before interpolation epoch, 
                    and set jed[1] = fractional part of a day elapsed between jed[0] and epoch. As an alternative, it may prove 
                    convenient to set jed[0] = some fixed epoch, such as start of the integration and jed[1] = elapsed interval 
                    between then and epoch.
                
            
*/
public void State(Double[]@,ASCOM.Astrometry.Target,Double[]@,Double[]@){
return null;
}


/*

                Corrects position vector for aberration of light.  Algorithm includes relativistic terms.
            
If 'lighttime' = 0 on input, this function will compute it.
*/
public void Aberration(Double[],Double[],Double,Double[]@){
return null;
}


/*

                Compute the apparent place of a planet or other solar system body.
            

*/
public void AppPlanet(Double,ASCOM.Astrometry.Object3,ASCOM.Astrometry.Accuracy,Double@,Double@,Double@){
return null;
}


/*

                Computes the apparent place of a star at date 'JdTt', given its catalog mean place, proper motion, parallax, and radial velocity.
            

*/
public void AppStar(Double,ASCOM.Astrometry.CatEntry3,ASCOM.Astrometry.Accuracy,Double@,Double@){
return null;
}


/*

                Compute the astrometric place of a planet or other solar system body.
            

*/
public void AstroPlanet(Double,ASCOM.Astrometry.Object3,ASCOM.Astrometry.Accuracy,Double@,Double@,Double@){
return null;
}


/*

                Computes the astrometric place of a star at date 'JdTt', given its catalog mean place, proper motion, parallax, and radial velocity.
            

*/
public void AstroStar(Double,ASCOM.Astrometry.CatEntry3,ASCOM.Astrometry.Accuracy,Double@,Double@){
return null;
}


/*

                Move the origin of coordinates from the barycenter of the solar system to the observer (or the geocenter); i.e., this function accounts for parallax (annual+geocentric or justannual).
            

*/
public void Bary2Obs(Double[],Double[],Double[]@,Double@){
return null;
}


/*

                This function will compute a date on the Gregorian calendar given the Julian date.
            

*/
public void CalDate(Double,Int16@,Int16@,Int16@,Double@){
return null;
}


/*

                This function allows for the specification of celestial pole offsets for high-precision applications.  Each set of offsets is a correction to the modeled position of the pole for a specific date, derived from observations and published by the IERS.
            

*/
public void CelPole(Double,ASCOM.Astrometry.PoleOffsetCorrection,Double,Double){
return null;
}


/*

                Calaculate an array of CIO RA values around a given date
            

                
                    Given an input TDB Julian date and the number of data points desired, this function returns a set of 
                    Julian dates and corresponding values of the GCRS right ascension of the celestial intermediate origin (CIO).  
                    The range of dates is centered (at least approximately) on the requested date.  The function obtains 
                    the data from an external data file.
                How to create and retrieve values from the arraylist
                    
                        Dim CioList As New ArrayList, Nov3 As New ASCOM.Astrometry.NOVAS3
 
                        rc = Nov3.CioArray(2455251.5, 20, CioList) ' Get 20 values around date 00:00:00 February 24th 2010
                        MsgBox("Nov3 RC= " &  rc)
 
                        For Each CioA As ASCOM.Astrometry.RAOfCio In CioList
                        MsgBox("CIO Array " & CioA.JdTdb & " " & CioA.RACio)
                        Next
                    
                
            
*/
public void CioArray(Double,Int32,Collections.ArrayList@){
return null;
}


/*

                Compute the orthonormal basis vectors of the celestial intermediate system.
            

                To compute the orthonormal basis vectors, with respect to the GCRS (geocentric ICRS), of the celestial 
                intermediate system defined by the celestial intermediate pole (CIP) (in the z direction) and 
                the celestial intermediate origin (CIO) (in the x direction).  A TDB Julian date and the 
                right ascension of the CIO at that date is required as input.  The right ascension of the CIO 
                can be with respect to either the GCRS origin or the true equinox of date -- different algorithms 
                are used in the two cases.
*/
public void CioBasis(Double,Double,ASCOM.Astrometry.ReferenceASCOM.Astrometry.Accuracy,Double@,Double@,Double@){
return null;
}


/*

                Returns the location of the celestial intermediate origin (CIO) for a given Julian date, as a right ascension 
            
  This function returns the location of the celestial intermediate origin (CIO) for a given Julian date, as a right ascension with respect to either the GCRS (geocentric ICRS) origin or the true equinox of date.  The CIO is always located on the true equator (= intermediate equator) of date.
*/
public void CioLocation(Double,ASCOM.Astrometry.Accuracy,Double@,ASCOM.Astrometry.Reference){
return null;
}


/*

                Computes the true right ascension of the celestial intermediate origin (CIO) at a given TT Julian date.  This is -(equation of the origins).
            

*/
public void CioRa(Double,ASCOM.Astrometry.Accuracy,Double@){
return null;
}


/*

                Returns the difference in light-time, for a star, between the barycenter of the solar system and the observer (or the geocenter).
            

                Alternatively, this function returns the light-time from the observer (or the geocenter) to a point on a 
                light ray that is closest to a specific solar system body.  For this purpose, 'Pos1' is the position 
                vector toward observed object, with respect to origin at observer (or the geocenter); 'PosObs' is 
                the position vector of solar system body, with respect to origin at observer (or the geocenter), 
                components in AU; and the returned value is the light time to point on line defined by 'Pos1' 
                that is closest to solar system body (positive if light passes body before hitting observer, i.e., if 
                'Pos1' is within 90 degrees of 'PosObs').
            
*/
public void DLight(Double[],Double[]){
return null;
}


/*

                Converts an ecliptic position vector to an equatorial position vector.
            

                To convert an ecliptic vector (mean ecliptic and equinox of J2000.0 only) to an ICRS vector, 
                set 'CoordSys' = 2; the value of 'JdTt' can be set to anything, since J2000.0 is assumed. 
                Except for the output from this case, all vectors are assumed to be with respect to a dynamical system.
            
*/
public void Ecl2EquVec(Double,ASCOM.Astrometry.CoordSys,ASCOM.Astrometry.Accuracy,Double[],Double[]@){
return null;
}


/*

                Compute the "complementary terms" of the equation of the equinoxes consistent with IAU 2000 resolutions.
            

                Series from IERS Conventions (2003), Chapter 5, Table 5.2C, with some adjustments to coefficient values 
                copied from IERS function 'eect2000', which has a more complete series.
            
*/
public void EeCt(Double,Double,ASCOM.Astrometry.Accuracy){
return null;
}


/*

                Retrieves the position and velocity of a solar system body from a fundamental ephemeris.
            
It is recommended that the input structure 'cel_obj' be created using function 'MakeObject' in file novas.c.
*/
public void Ephemeris(Double[],ASCOM.Astrometry.Object3,ASCOM.Astrometry.Origin,ASCOM.Astrometry.Accuracy,Double[]@,Double[]@){
return null;
}


/*

                To convert right ascension and declination to ecliptic longitude and latitude.
            

                To convert ICRS RA and dec to ecliptic coordinates (mean ecliptic and equinox of J2000.0), 
                set 'CoordSys' = 2; the value of 'JdTt' can be set to anything, since J2000.0 is assumed. 
                Except for the input to this case, all input coordinates are dynamical.
            
*/
public void Equ2Ecl(Double,ASCOM.Astrometry.CoordSys,ASCOM.Astrometry.Accuracy,Double,Double,Double@,Double@){
return null;
}


/*

                Converts an equatorial position vector to an ecliptic position vector.
            
To convert an ICRS vector to an ecliptic vector (mean ecliptic and equinox of J2000.0 only), 
                set 'CoordSys' = 2; the value of 'JdTt' can be set to anything, since J2000.0 is assumed. Except for 
                the input to this case, all vectors are assumed to be with respect to a dynamical system.
*/
public void Equ2EclVec(Double,ASCOM.Astrometry.CoordSys,ASCOM.Astrometry.Accuracy,Double[],Double[]@){
return null;
}


/*

                Converts ICRS right ascension and declination to galactic longitude and latitude.
            

*/
public void Equ2Gal(Double,Double,Double@,Double@){
return null;
}


/*

                Transforms topocentric right ascension and declination to zenith distance and azimuth.  
            
This function transforms topocentric right ascension and declination to zenith distance and azimuth.  
                It uses a method that properly accounts for polar motion, which is significant at the sub-arcsecond level.  
                This function can also adjust coordinates for atmospheric refraction.
*/
public void Equ2Hor(Double,Double,ASCOM.Astrometry.Accuracy,Double,Double,ASCOM.Astrometry.OnSurface,Double,Double,ASCOM.Astrometry.RefractionOption,Double@,Double@,Double@,Double@){
return null;
}


/*

                Returns the value of the Earth Rotation Angle (theta) for a given UT1 Julian date. 
            
 The expression used is taken from the note to IAU Resolution B1.8 of 2000.  1. The algorithm used 
                here is equivalent to the canonical theta = 0.7790572732640 + 1.00273781191135448 * t, where t is the time 
                in days from J2000 (t = JdHigh + JdLow - T0), but it avoids many two-PI 'wraps' that 
                decrease precision (adopted from SOFA Fortran routine iau_era00; see also expression at top 
                of page 35 of IERS Conventions (1996)).
*/
public void Era(Double,Double){
return null;
}


/*

                Computes quantities related to the orientation of the Earth's rotation axis at Julian date 'JdTdb'.
            
Values of the celestial pole offsets 'PSI_COR' and 'EPS_COR' are set using function 'cel_pole', 
                if desired.  See the prolog of 'cel_pole' for details.
*/
public void ETilt(Double,ASCOM.Astrometry.Accuracy,Double@,Double@,Double@,Double@,Double@){
return null;
}


/*

                To transform a vector from the dynamical reference system to the International Celestial Reference System (ICRS), or vice versa.
            

*/
public void FrameTie(Double[],ASCOM.Astrometry.FrameConversionDirection,Double[]@){
return null;
}


/*

                To compute the fundamental arguments (mean elements) of the Sun and Moon.
            

                Fundamental arguments, in radians:
                
                    a[0] = l (mean anomaly of the Moon)
                    a[1] = l' (mean anomaly of the Sun)
                    a[2] = F (mean argument of the latitude of the Moon)
                    a[3] = D (mean elongation of the Moon from the Sun)
                    a[4] = a[4] (mean longitude of the Moon's ascending node);
                    from Simon section 3.4(b.3),
                    precession = 5028.8200 arcsec/cy)
                
            
*/
public void FundArgs(Double,Double[]@){
return null;
}


/*

                Converts GCRS right ascension and declination to coordinates with respect to the equator of date (mean or true).
            
For coordinates with respect to the true equator of date, the origin of right ascension can be either the true equinox or the celestial intermediate origin (CIO).
                 This function only supports the CIO-based method.
            
*/
public void Gcrs2Equ(Double,ASCOM.Astrometry.CoordSys,ASCOM.Astrometry.Accuracy,Double,Double,Double@,Double@){
return null;
}


/*

                This function computes the geocentric position and velocity of an observer on 
                the surface of the earth or on a near-earth spacecraft.
The final vectors are expressed in the GCRS.
*/
public void GeoPosVel(Double,Double,ASCOM.Astrometry.Accuracy,ASCOM.Astrometry.Observer,Double[]@,Double[]@){
return null;
}


/*

                Computes the total gravitational deflection of light for the observed object due to the major gravitating bodies in the solar system.
            
This function valid for an observed body within the solar system as well as for a star.
                
                    If 'Accuracy' is set to zero (full accuracy), three bodies (Sun, Jupiter, and Saturn) are 
                    used in the calculation.  If the reduced-accuracy option is set, only the Sun is used in the 
                    calculation.  In both cases, if the observer is not at the geocenter, the deflection due to the Earth is included.
                
            
*/
public void GravDef(Double,ASCOM.Astrometry.EarthDeflection,ASCOM.Astrometry.Accuracy,Double[],Double[],Double[]@){
return null;
}


/*

                Corrects position vector for the deflection of light in the gravitational field of an arbitrary body.
            
This function valid for an observed body within the solar system as well as for a star.
*/
public void GravVec(Double[],Double[],Double[],Double,Double[]@){
return null;
}


/*

                Compute the intermediate right ascension of the equinox at the input Julian date
            

*/
public void IraEquinox(Double,ASCOM.Astrometry.EquinoxType,ASCOM.Astrometry.Accuracy){
return null;
}


/*

                Compute the Julian date for a given calendar date (year, month, day, hour).
            
This function makes no checks for a valid input calendar date. The input calendar date 
                must be Gregorian. The input time value can be based on any UT-like time scale (UTC, UT1, TT, etc.) 
                - output Julian date will have the same basis.
*/
public void JulianDate(Int16,Int16,Int16,Double){
return null;
}


/*

                Computes the geocentric position of a solar system body, as antedated for light-time.
            

*/
public void LightTime(Double,ASCOM.Astrometry.Object3,Double[],Double,ASCOM.Astrometry.Accuracy,Double[]@,Double@){
return null;
}


/*

                Determines the angle of an object above or below the Earth's limb (horizon).
            
The geometric limb is computed, assuming the Earth to be an airless sphere (no 
                refraction or oblateness is included).  The observer can be on or above the Earth.  
                For an observer on the surface of the Earth, this function returns the approximate unrefracted 
                altitude.
*/
public void LimbAngle(Double[],Double[],Double@,Double@){
return null;
}


/*

                Computes the local place of a solar system body.
            

*/
public void LocalPlanet(Double,ASCOM.Astrometry.Object3,Double,ASCOM.Astrometry.OnSurface,ASCOM.Astrometry.Accuracy,Double@,Double@,Double@){
return null;
}


/*

                Computes the local place of a star at date 'JdTt', given its catalog mean place, proper motion, parallax, and radial velocity.
            

*/
public void LocalStar(Double,Double,ASCOM.Astrometry.CatEntry3,ASCOM.Astrometry.OnSurface,ASCOM.Astrometry.Accuracy,Double@,Double@){
return null;
}


/*

                Create a structure of type 'cat_entry' containing catalog data for a star or "star-like" object.
            

*/
public void MakeCatEntry(String,String,Int32,Double,Double,Double,Double,Double,Double,ASCOM.Astrometry.CatEntry3@){
return null;
}


/*

                Makes a structure of type 'InSpace' - specifying the position and velocity of an observer situated 
                on a near-Earth spacecraft.
            

*/
public void MakeInSpace(Double[],Double[],ASCOM.Astrometry.InSpace@){
return null;
}


/*

                Makes a structure of type 'object' - specifying a celestial object - based on the input parameters.
            

*/
public void MakeObject(ASCOM.Astrometry.ObjectType,Int16,String,ASCOM.Astrometry.CatEntry3,ASCOM.Astrometry.Object3@){
return null;
}


/*

                Makes a structure of type 'observer' - specifying the location of the observer.
            

*/
public void MakeObserver(ASCOM.Astrometry.ObserverLocation,ASCOM.Astrometry.OnSurface,ASCOM.Astrometry.InSpace,ASCOM.Astrometry.Observer@){
return null;
}


/*

                Makes a structure of type 'observer' specifying an observer at the geocenter.
            

*/
public void MakeObserverAtGeocenter(ASCOM.Astrometry.Observer@){
return null;
}


/*

                Makes a structure of type 'observer' specifying the position and velocity of an observer 
                situated on a near-Earth spacecraft.
            
Both input vectors are with respect to true equator and equinox of date.
*/
public void MakeObserverInSpace(Double[],Double[],ASCOM.Astrometry.Observer@){
return null;
}


/*

                Makes a structure of type 'observer' specifying the location of and weather for an observer 
                on the surface of the Earth.
            

*/
public void MakeObserverOnSurface(Double,Double,Double,Double,Double,ASCOM.Astrometry.Observer@){
return null;
}


/*

                Makes a structure of type 'on_surface' - specifying the location of and weather for an 
                observer on the surface of the Earth.
            

*/
public void MakeOnSurface(Double,Double,Double,Double,Double,ASCOM.Astrometry.OnSurface@){
return null;
}


/*

                Compute the mean obliquity of the ecliptic.
            

*/
public void MeanObliq(Double){
return null;
}


/*

                Computes the ICRS position of a star, given its apparent place at date 'JdTt'.  
                Proper motion, parallax and radial velocity are assumed to be zero.
            

*/
public void MeanStar(Double,Double,Double,ASCOM.Astrometry.Accuracy,Double@,Double@){
return null;
}


/*

                Normalize angle into the range 0 <= angle < (2 * pi).
            

*/
public void NormAng(Double){
return null;
}


/*

                Nutates equatorial rectangular coordinates from mean equator and equinox of epoch to true equator and equinox of epoch.
            
 Inverse transformation may be applied by setting flag 'direction'
*/
public void Nutation(Double,ASCOM.Astrometry.NutationDirection,ASCOM.Astrometry.Accuracy,Double[],Double[]@){
return null;
}


/*

                Returns the values for nutation in longitude and nutation in obliquity for a given TDB Julian date.
            
The nutation model selected depends upon the input value of 'Accuracy'.  See notes below for important details.
                
                    This function selects the nutation model depending first upon the input value of 'Accuracy'.  
                    If 'Accuracy' = 0 (full accuracy), the IAU 2000A nutation model is used.  If 'Accuracy' = 1 
                    a specially truncated (and therefore faster) version of IAU 2000A, called 'NU2000K' is used.
                
            
*/
public void NutationAngles(Double,ASCOM.Astrometry.Accuracy,Double@,Double@){
return null;
}


/*

                Computes the apparent direction of a star or solar system body at a specified time 
                and in a specified coordinate system.
            

            
*/
public void Place(Double,ASCOM.Astrometry.Object3,ASCOM.Astrometry.Observer,Double,ASCOM.Astrometry.CoordSys,ASCOM.Astrometry.Accuracy,ASCOM.Astrometry.SkyPos@){
return null;
}


/*

                Precesses equatorial rectangular coordinates from one epoch to another.
            
 One of the two epochs must be J2000.0.  The coordinates are referred to the mean dynamical equator and equinox of the two respective epochs.
*/
public void Precession(Double,Double[],Double,Double[]@){
return null;
}


/*

                Applies proper motion, including foreshortening effects, to a star's position.
            

*/
public void ProperMotion(Double,Double[],Double[],Double,Double[]@){
return null;
}


/*

                Converts equatorial spherical coordinates to a vector (equatorial rectangular coordinates).
            

*/
public void RaDec2Vector(Double,Double,Double,Double[]@){
return null;
}


/*

                Predicts the radial velocity of the observed object as it would be measured by spectroscopic means.
            
 Radial velocity is here defined as the radial velocity measure (z) times the speed of light.  
                For a solar system body, it applies to a fictitious emitter at the center of the observed object, 
                assumed massless (no gravitational red shift), and does not in general apply to reflected light.  
                For stars, it includes all effects, such as gravitational red shift, contained in the catalog 
                barycentric radial velocity measure, a scalar derived from spectroscopy.  Nearby stars with a known 
                kinematic velocity vector (obtained independently of spectroscopy) can be treated like 
                solar system objects.
*/
public void RadVel(ASCOM.Astrometry.Object3,Double[],Double[],Double[],Double,Double,Double,Double@){
return null;
}


/*

                Computes atmospheric refraction in zenith distance. 
            
This version computes approximate refraction for optical wavelengths. This function 
                can be used for planning observations or telescope pointing, but should not be used for the 
                reduction of precise observations.
*/
public void Refract(ASCOM.Astrometry.OnSurface,ASCOM.Astrometry.RefractionOption,Double){
return null;
}


/*

                Computes the Greenwich apparent sidereal time, at Julian date 'JdHigh' + 'JdLow'.
            
 The Julian date may be split at any point, but for highest precision, set 'JdHigh' 
                to be the integral part of the Julian date, and set 'JdLow' to be the fractional part.
*/
public void SiderealTime(Double,Double,Double,ASCOM.Astrometry.GstType,ASCOM.Astrometry.Method,ASCOM.Astrometry.Accuracy,Double@){
return null;
}


/*

                Transforms a vector from one coordinate system to another with same origin and axes rotated about the z-axis.
            

*/
public void Spin(Double,Double[],Double[]@){
return null;
}


/*

                Converts angular quantities for stars to vectors.
            

*/
public void StarVectors(ASCOM.Astrometry.CatEntry3,Double[]@,Double[]@){
return null;
}


/*

                Computes the Terrestrial Time (TT) or Terrestrial Dynamical Time (TDT) Julian date corresponding 
                to a Barycentric Dynamical Time (TDB) Julian date.
            
Expression used in this function is a truncated form of a longer and more precise 
                series given in: Explanatory Supplement to the Astronomical Almanac, pp. 42-44 and p. 316. 
                The result is good to about 10 microseconds.
*/
public void Tdb2Tt(Double,Double@,Double@){
return null;
}


/*

                This function rotates a vector from the terrestrial to the celestial system. 
            
'x' = 'y' = 0 means no polar motion transformation.
                
                    The 'option' flag only works for the equinox-based method.
                
            
*/
public void Ter2Cel(Double,Double,Double,ASCOM.Astrometry.Method,ASCOM.Astrometry.Accuracy,ASCOM.Astrometry.OutputVectorOption,Double,Double,Double[],Double[]@){
return null;
}


/*

                Computes the position and velocity vectors of a terrestrial observer with respect to the center of the Earth.
            

                If reference meridian is Greenwich and st=0, 'pos' is effectively referred to equator and Greenwich.
                 This function ignores polar motion, unless the observer's longitude and latitude have been 
                    corrected for it, and variation in the length of day (angular velocity of earth).
                The true equator and equinox of date do not form an inertial system.  Therefore, with respect 
                    to an inertial system, the very small velocity component (several meters/day) due to the precession 
                    and nutation of the Earth's axis is not accounted for here.
            
*/
public void Terra(ASCOM.Astrometry.OnSurface,Double,Double[]@,Double[]@){
return null;
}


/*

                Computes the topocentric place of a solar system body.
            

*/
public void TopoPlanet(Double,ASCOM.Astrometry.Object3,Double,ASCOM.Astrometry.OnSurface,ASCOM.Astrometry.Accuracy,Double@,Double@,Double@){
return null;
}


/*

                Computes the topocentric place of a star at date 'JdTt', given its catalog mean place, proper motion, parallax, and radial velocity.
            

*/
public void TopoStar(Double,Double,ASCOM.Astrometry.CatEntry3,ASCOM.Astrometry.OnSurface,ASCOM.Astrometry.Accuracy,Double@,Double@){
return null;
}


/*

                To transform a star's catalog quantities for a change of epoch and/or equator and equinox.
            
Also used to rotate catalog quantities on the dynamical equator and equinox of J2000.0 to the ICRS or vice versa.
                1. 'DateInCat' and 'DateNewCat' may be specified either as a Julian date (e.g., 2433282.5) or 
                    a Julian year and fraction (e.g., 1950.0).  Values less than 10000 are assumed to be years. 
                    For 'TransformOption' = 2 or 'TransformOption' = 3, either 'DateInCat' or 'DateNewCat' must be 2451545.0 or 
                    2000.0 (J2000.0).  For 'TransformOption' = 4 and 'TransformOption' = 5, 'DateInCat' and 'DateNewCat' are ignored.
                2. 'TransformOption' = 1 updates the star's data to account for the star's space motion between the first 
                    and second dates, within a fixed reference frame. 'TransformOption' = 2 applies a rotation of the reference 
                    frame corresponding to precession between the first and second dates, but leaves the star fixed in 
                    space. 'TransformOption' = 3 provides both transformations. 'TransformOption' = 4 and 'TransformOption' = 5 provide a a 
                    fixed rotation about very small angles (<0.1 arcsecond) to take data from the dynamical system 
                    of J2000.0 to the ICRS ('TransformOption' = 4) or vice versa ('TransformOption' = 5).
                3. For 'TransformOption' = 1, input data can be in any fixed reference system. for 'TransformOption' = 2 or 
                    'TransformOption' = 3, this function assumes the input data is in the dynamical system and produces output 
                    in the dynamical system.  for 'TransformOption' = 4, the input data must be on the dynamical equator and 
                    equinox of J2000.0.  for 'TransformOption' = 5, the input data must be in the ICRS.
                4. This function cannot be properly used to bring data from old star catalogs into the 
                    modern system, because old catalogs were compiled using a set of constants that are incompatible 
                    with modern values.  In particular, it should not be used for catalogs whose positions and 
                    proper motions were derived by assuming a precession constant significantly different from 
                    the value implicit in function 'precession'.
            
*/
public void TransformCat(ASCOM.Astrometry.TransformationOption3,Double,ASCOM.Astrometry.CatEntry3,Double,String,ASCOM.Astrometry.CatEntry3@){
return null;
}


/*

                Convert Hipparcos catalog data at epoch J1991.25 to epoch J2000.0, for use within NOVAS.
            
To be used only for Hipparcos or Tycho stars with linear space motion.  Both input and 
                output data is in the ICRS.
                
                    1. Input (Hipparcos catalog) epoch and units:
                    
                        Epoch: J1991.25
                        Right ascension (RA): degrees
                        Declination (Dec): degrees
                        Proper motion in RA: milliarcseconds per year
                        Proper motion in Dec: milliarcseconds per year
                        Parallax: milliarcseconds
                        Radial velocity: kilometers per second (not in catalog)
                    
                
                
                    2. Output (modified Hipparcos) epoch and units:
                    
                        Epoch: J2000.0
                        Right ascension: hours
                        Declination: degrees
                        Proper motion in RA: milliarcseconds per year
                        Proper motion in Dec: milliarcseconds per year
                        Parallax: milliarcseconds
                        Radial velocity: kilometers per second
                    >
                
            
*/
public void TransformHip(ASCOM.Astrometry.CatEntry3,ASCOM.Astrometry.CatEntry3@){
return null;
}


/*

                Converts a vector in equatorial rectangular coordinates to equatorial spherical coordinates.
            

*/
public void Vector2RaDec(Double[],Double@,Double@){
return null;
}


/*

                Compute the virtual place of a planet or other solar system body.
            

*/
public void VirtualPlanet(Double,ASCOM.Astrometry.Object3,ASCOM.Astrometry.Accuracy,Double@,Double@,Double@){
return null;
}


/*

                Computes the virtual place of a star at date 'JdTt', given its catalog mean place, proper motion, parallax, and radial velocity.
            

*/
public void VirtualStar(Double,ASCOM.Astrometry.CatEntry3,ASCOM.Astrometry.Accuracy,Double@,Double@){
return null;
}


/*

                Corrects a vector in the ITRF (rotating Earth-fixed system) for polar motion, and also corrects 
                the longitude origin (by a tiny amount) to the Terrestrial Intermediate Origin (TIO).
            

*/
public void Wobble(Double,Double,Double,Double[],Double[]@){
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

                Return the value of DeltaT for the given Julian date
            
Valid between the years 1650 and 2050
*/
public void DeltaT(Double){
return null;
}
}
