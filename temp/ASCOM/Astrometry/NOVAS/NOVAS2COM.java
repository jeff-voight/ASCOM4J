package ASCOM.Astrometry.NOVAS;

/*

                NOVAS2COM: Instanciable class presenting the contents of the NOVAS 2 library. 
                NOVAS was developed by the Astronomical Applications department of the United States Naval 
                Observatory. The C language version of NOVAS was developed by John Bangert at USNO/AA.
            


                The NOVAS2COM class is an instanciable class usable by COM clients. This means that you have to create an instance of the 
                class in order to access its members. So, this works:
                
                    Dim Nov as New ASCOM.Astrometry.NOVAS2COM
                    rc = Nov.AppStar(tjd, earth, star, ra, dec)
                
                while this does not work: 
                rc = ASCOM.Astrometry.NOVAS2COM.AppStar(tjd, earth, star, ra, dec)
                Method names are identical to those used in NOVAS2, as are almost all paramaters. There are a few 
                    changes that introduce some new structures but these should be self explanatory. One significant difference 
                    is that position and velocity vectors are returned as structures rather than double arrays. This was done 
                    to make type checking more effective.
                Testing of the high level supervisory functions has been carried out using real-time star data from
                    the USNO web site. Values provided by this NOVAS2 implementation agree on average to about 50 milli 
                    arc-seconds with current USNO web site values.
                This class is implemented using a thin layer of .NET code that calls functions in 
                    either a 32 or 64 bit compiled version of the unmodified C code from ther USNO web site. The .NET code
                    does not carry out calculations itself, it simply handles any interface presentation differences
                    and calls the relevant 32 or 64bit code according to its environment.
                
                    Note:  This class only supports Earth in the XXXXPlanet classes, which is a consequence of the implementation 
                    used. Please use the NOVAS3.1 or later classes in applications that require planetary or moon ephemeredes as these classes 
                    can access the JPL 421 planetary ephemeris data provided as part of the ASCOM distribution.
            
*/
public class NOVAS2COM{



/*

                Corrects position vector for aberration of light.
            
Algorithm includes relativistic terms.
*/
public void Aberration(Double[],Double[],Double,Double[]@){
return null;
}


/*

                Compute the apparent place of a planet or other solar system body.
            

                Note: This function only supports Earth, which is a consequence of the implementation 
                used. Please use the NOVAS3.1 or later classes in applications that require planetary or moon ephemeredes as these classes 
                can access the JPL 421 planetary ephemeris data provided as part of the ASCOM distribution.
            
*/
public void AppPlanet(Double,ASCOM.Astrometry.BodyDescription@,ASCOM.Astrometry.BodyDescription@,Double@,Double@,Double@){
return null;
}


/*

                Computes the apparent place of a star 
            

*/
public void AppStar(Double,ASCOM.Astrometry.BodyDescription@,ASCOM.Astrometry.CatEntry@,Double@,Double@){
return null;
}


/*

                Computes the astrometric place of a planet or other solar system body.
            

                Note: This function only supports Earth, which is a consequence of the implementation 
                used. Please use the NOVAS3.1 or later classes in applications that require planetary or moon ephemeredes as these classes 
                can access the JPL 421 planetary ephemeris data provided as part of the ASCOM distribution.
            
*/
public void AstroPlanet(Double,ASCOM.Astrometry.BodyDescription@,ASCOM.Astrometry.BodyDescription@,Double@,Double@,Double@){
return null;
}


/*

                Computes the astrometric place of a star
            
     Computes the astrometric place of a star, given its mean place, proper motion, parallax, and radial velocity for J2000.0.
*/
public void AstroStar(Double,ASCOM.Astrometry.BodyDescription@,ASCOM.Astrometry.CatEntry@,Double@,Double@){
return null;
}


/*

                Moves the origin of coordinates from the barycenter of the solar system to the center of mass of the Earth
            
This corrects for parallax.
*/
public void BaryToGeo(Double[],Double[],Double[]@,Double@){
return null;
}


/*

                Compute a date on the Gregorian calendar given the Julian date.
            

*/
public void CalDate(Double,Int16@,Int16@,Int16@,Double@){
return null;
}


/*

                This function allows for the specification of celestial pole offsets for high-precision applications.  
            
These are added to the nutation parameters delta psi and delta epsilon.
                1. This function sets the values of global variables 'PSI_COR'and 'EPS_COR' declared at the top of file 'novas.c'.  These global variables are used only in NOVAS function 'earthtilt'.
                2. This function, if used, should be called before any other NOVAS functions for a given date.  Values of the pole offsets specified via a call to this function will be used until explicitly changed.
                3. Daily values of the offsets are published, for example, in IERS Bulletins A and B.
                4. This function is the "C" version of Fortran NOVAS routine "celpol".
            
*/
public void CelPole(Double,Double){
return null;
}


/*

                Computes quantities related to the orientation of the Earth's rotation axis at Julian date 'tjd'.
            

*/
public void EarthTilt(Double,Double@,Double@,Double@,Double@,Double@){
return null;
}


/*

                Retrieves the position and velocity of a body from a fundamental ephemeris.
            

*/
public void Ephemeris(Double,ASCOM.Astrometry.BodyDescription@,ASCOM.Astrometry.Origin,Double[]@,Double[]@){
return null;
}


/*

                Transform apparent equatorial coordinates to horizon coordinates
            
This function transforms apparent equatorial coordinates (right 
                ascension and declination) to horizon coordinates (zenith 
                distance and azimuth).  It uses a method that properly accounts 
                for polar motion, which is significant at the sub-arcsecond 
                level.  This function can also adjust coordinates for atmospheric 
                refraction.
*/
public void Equ2Hor(Double,Double,Double,Double,ASCOM.Astrometry.SiteInfo@,Double,Double,ASCOM.Astrometry.RefractionOption,Double@,Double@,Double@,Double@){
return null;
}


/*

                To compute the fundamental arguments.
            

*/
public void FundArgs(Double,Double[]@){
return null;
}


/*

                Obtains the barycentric and heliocentric positions and velocities of the Earth from the solar system ephemeris.
            

*/
public void GetEarth(Double,ASCOM.Astrometry.BodyDescription@,Double@,Double[]@,Double[]@,Double[]@,Double[]@){
return null;
}


/*

                This function will compute the Julian date for a given calendar date (year, month, day, hour).
            

*/
public void JulianDate(Int16,Int16,Int16,Double){
return null;
}


/*

                Computes the local place of a planet or other solar system body, given the location of the observer.
            

                Note: This function only supports Earth, which is a consequence of the implementation 
                used. Please use the NOVAS3.1 or later classes in applications that require planetary or moon ephemeredes as these classes 
                can access the JPL 421 planetary ephemeris data provided as part of the ASCOM distribution.
            
*/
public void LocalPlanet(Double,ASCOM.Astrometry.BodyDescription@,ASCOM.Astrometry.BodyDescription@,Double,ASCOM.Astrometry.SiteInfo@,Double@,Double@,Double@){
return null;
}


/*

                Computes the local place of a star
            

*/
public void LocalStar(Double,ASCOM.Astrometry.BodyDescription@,Double,ASCOM.Astrometry.CatEntry@,ASCOM.Astrometry.SiteInfo@,Double@,Double@){
return null;
}


/*

                To create a structure of type 'cat_entry' containing catalog data for a star or "star-like" object.
            

*/
public void MakeCatEntry(String,String,Int32,Double,Double,Double,Double,Double,Double,ASCOM.Astrometry.CatEntry@){
return null;
}


/*

                Computes the mean place of a star for J2000.0
            
Computes the mean place of a star for J2000.0, given its apparent 
                place at date 'tjd'.  Proper motion, parallax and radial velocity 
                are assumed to be zero.
            
*/
public void MeanStar(Double,ASCOM.Astrometry.BodyDescription@,Double,Double,Double@,Double@){
return null;
}


/*

                Nutates equatorial rectangular coordinates from mean equator and equinox of epoch to true equator and equinox of epoch.
            
Inverse transformation may be applied by setting flag 'fn'.
*/
public void Nutate(Double,ASCOM.Astrometry.NutationDirection,Double[],Double[]@){
return null;
}


/*

                Provides fast evaluation of the nutation components according to the 1980 IAU Theory of Nutation.
            

*/
public void NutationAngles(Double,Double@,Double@){
return null;
}


/*

                Transforms a vector from an Earth-fixed geographic system to a space-fixed system
            
Transforms a vector from an Earth-fixed geographic system to a space-fixed system based on mean equator and equinox of J2000.0; applies rotations for wobble, spin, nutation, and precession.
*/
public void Pnsw(Double,Double,Double,Double,Double[],Double[]@){
return null;
}


/*

                Precesses equatorial rectangular coordinates from one epoch to another.
            
The coordinates are referred to the mean equator and equinox of the two respective epochs.
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
public void RADec2Vector(Double,Double,Double,Double[]@){
return null;
}


/*

                Computes atmospheric refraction in zenith distance.
            
This version computes approximate refraction for optical wavelengths.
*/
public void Refract(ASCOM.Astrometry.SiteInfo@,Int16,Double){
return null;
}


/*

                Sets up a structure of type 'body' - defining a celestial object- based on the input parameters.
            

*/
public void SetBody(ASCOM.Astrometry.BodyType,ASCOM.Astrometry.Body,String,ASCOM.Astrometry.BodyDescription@){
return null;
}


/*

                Computes the Greenwich apparent sidereal time, at Julian date 'jd_high' + 'jd_low'.
            

*/
public void SiderealTime(Double,Double,Double,Double@){
return null;
}


/*

                Provides the position and velocity of the Earth
            
 Provides the position and velocity of the Earth at epoch 'tjd' by evaluating a closed-form theory without reference to an  external file.  This function can also provide the position and velocity of the Sun.
*/
public void SolarSystem(Double,ASCOM.Astrometry.Body,ASCOM.Astrometry.Origin,Double[]@,Double[]@){
return null;
}


/*

                Transforms geocentric rectangular coordinates from rotating system to non-rotating system
            
Transforms geocentric rectangular coordinates from rotating system based on rotational equator and orthogonal reference meridian to  non-rotating system based on true equator and equinox of date.
*/
public void Spin(Double,Double[],Double[]@){
return null;
}


/*

                Converts angular quanities for stars to vectors.
            

*/
public void StarVectors(ASCOM.Astrometry.CatEntry,Double[]@,Double[]@){
return null;
}


/*

                Compute equatorial spherical coordinates of Sun referred to the mean equator and equinox of date.
            

*/
public void SunEph(Double,Double@,Double@,Double@){
return null;
}


/*

                Corrects position vector for the deflection of light in the gravitational field of the Sun. 
            
This function is valid for bodies within the solar system as well as for stars.
*/
public void SunField(Double[],Double[],Double[]@){
return null;
}


/*

                Converts TDB to TT or TDT
            
Computes the terrestrial time (TT) or terrestrial dynamical time (TDT) Julian date corresponding to a barycentric dynamical time (TDB) Julian date.
*/
public void Tdb2Tdt(Double,Double@,Double@){
return null;
}


/*

                Computes the position and velocity vectors of a terrestrial observer with respect to the center of the Earth.
            

*/
public void Terra(ASCOM.Astrometry.SiteInfo@,Double,Double[]@,Double[]@){
return null;
}


/*

                Computes the topocentric place of a planet, given the location of the observer.
            

                Note: This function only supports Earth, which is a consequence of the implementation 
                used. Please use the NOVAS3.1 or later classes in applications that require planetary or moon ephemeredes as these classes 
                can access the JPL 421 planetary ephemeris data provided as part of the ASCOM distribution.
            
*/
public void TopoPlanet(Double,ASCOM.Astrometry.BodyDescription@,ASCOM.Astrometry.BodyDescription@,Double,ASCOM.Astrometry.SiteInfo@,Double@,Double@,Double@){
return null;
}


/*

                Computes the topocentric place of a star
            

*/
public void TopoStar(Double,ASCOM.Astrometry.BodyDescription@,Double,ASCOM.Astrometry.CatEntry@,ASCOM.Astrometry.SiteInfo@,Double@,Double@){
return null;
}


/*

                To transform a star's catalog quantities for a change of epoch and/or equator and equinox.
            

                
                    1. 'date_incat' and 'date_newcat' may be specified either as a 
                    Julian date (e.g., 2433282.5) or a Julian year and fraction 
                    (e.g., 1950.0).  Values less than 10000 are assumed to be years.
 
                    2. option = 1 updates the star's data to account for the star's space motion between 
                    the first and second dates, within a fixed reference frame.
                    option = 2 applies a rotation of the reference frame corresponding to precession 
                    between the first and second dates, but leaves the star fixed in space.
                    option = 3 provides both transformations.
 
                    3. This subroutine cannot be properly used to bring data from 
                    old (pre-FK5) star catalogs into the modern system, because old 
                    catalogs were compiled using a set of constants that are 
                    incompatible with the IAU (1976) system.
 
                    4. This function uses TDB Julian dates internally, but no 
                    distinction between TDB and TT is necessary.
                
            
*/
public void TransformCat(ASCOM.Astrometry.TransformationOption,Double,ASCOM.Astrometry.CatEntry@,Double,Byte[]@,ASCOM.Astrometry.CatEntry@){
return null;
}


/*

                To convert Hipparcos data at epoch J1991.25 to epoch J2000.0 and FK5-style units.
            
To be used only for Hipparcos or Tycho stars  with linear space motion.
                
                    
                        1. Hipparcos epoch and units:
                        Epoch: J1991.25
                        Right ascension (RA): degrees
                        Declination (Dec): degrees
                        Proper motion in RA * cos (Dec): milliarcseconds per year
                        Proper motion in Dec: milliarcseconds per year
                        Parallax: milliarcseconds
                        Radial velocity: kilometers per second (not in catalog)
 
                        2. FK5 epoch and units:
                        Epoch: J2000.0
                        Right ascension: hours
                        Declination: degrees
                        Proper motion in RA: seconds of time per Julian century
                        Proper motion in Dec: arcseconds per Julian century
                        Parallax: arcseconds
                        Radial velocity: kilometers per second
                    
                
            
*/
public void TransformHip(ASCOM.Astrometry.CatEntry@,ASCOM.Astrometry.CatEntry@){
return null;
}


/*

                Converts an vector in equatorial rectangular coordinates to equatorial spherical coordinates.
            

*/
public void Vector2RADec(Double[],Double@,Double@){
return null;
}


/*

                Computes the virtual place of a planet or other solar system body.
            

                Note: This function only supports Earth, which is a consequence of the implementation 
                used. Please use the NOVAS3.1 or later classes in applications that require planetary or moon ephemeredes as these classes 
                can access the JPL 421 planetary ephemeris data provided as part of the ASCOM distribution.
            
*/
public void VirtualPlanet(Double,ASCOM.Astrometry.BodyDescription@,ASCOM.Astrometry.BodyDescription@,Double@,Double@,Double@){
return null;
}


/*

                Computes the virtual place of a star
            

                Computes the virtual place of a star at date 'tjd', given its 
                mean place, proper motion, parallax, and radial velocity for J2000.0.
*/
public void VirtualStar(Double,ASCOM.Astrometry.BodyDescription@,ASCOM.Astrometry.CatEntry@,Double@,Double@){
return null;
}


/*

                Corrects Earth-fixed geocentric rectangular coordinates for polar motion.
            
Corrects Earth-fixed geocentric rectangular coordinates for polar motion.  Transforms a vector from Earth-fixed geographic system to rotating system based on rotational equator and orthogonal Greenwich meridian through axis of rotation.
*/
public void Wobble(Double,Double,Double[],Double[]@){
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
