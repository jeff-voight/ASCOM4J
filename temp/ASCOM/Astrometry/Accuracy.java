package ASCOM.Astrometry;

/*

                Calculation accuracy
            


                In full-accuracy mode,
                
                    nutation calculations use the IAU 2000A model [iau2000a, nutation_angles];
                    gravitational deflection is calculated using three bodies: Sun, Jupiter, and Saturn [grav_def];
                    the equation of the equinoxes includes the entire series when computing the “complementary terms" [ee_ct];
                    geocentric positions of solar system bodies are adjusted for light travel time using split, or two-part, 
                        Julian dates in calls to ephemeris and iterate with a convergence tolerance of 10-12 days [light_time, ephemeris];
                    ephemeris calls the appropriate solar system ephemeris using split, or two-part, Julian dates primarily to support 
                        light-time calculations [ephemeris, solarsystem_hp, light_time].
                
                In reduced-accuracy mode,
                
                    nutation calculations use the 2000K model, which is the default for this mode;
                    gravitational deflection is calculated using only one body, the Sun [grav_def];
                    the equation of the equinoxes excludes terms smaller than 2 microarcseconds when computing the "complementary terms" [ee_ct];
                    geocentric positions of solar system bodies are adjusted for light travel time using single-value Julian dates 
                        in calls to ephemeris and iterate with a convergence tolerance of 10-9 days [light-time, ephemeris, solarsystem];
                    ephemeris calls the appropriate solar system ephemeris using single-value Julian dates [ephemeris, solarsystem].
                
                In full-accuracy mode, the IAU 2000A nutation series (1,365 terms) is used [iau2000a]. Evaluating the series for nutation is 
                    usually the main computational burden in NOVAS, so using reduced-accuracy mode improves execution time, often noticeably. 
                    In reduced-accuracy mode, the NOVAS 2000K nutation series (488 terms) is used by default [nu2000k]. This mode can be used 
                    when the accuracy requirements are not better than 0.1 milliarcsecond for stars or 3.5 milliarcseconds for solar system bodies. 
                    Selecting this approach can reduce the time required for Earth-rotation computations by about two-thirds.
            
*/
public class Accuracy{

}
