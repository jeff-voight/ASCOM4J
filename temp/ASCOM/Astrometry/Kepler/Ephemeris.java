package ASCOM.Astrometry.Kepler;

/*

                KEPLER: Ephemeris Object
            


                The Kepler Ephemeris object contains an orbit engine which takes the orbital parameters of a solar system 
                body, plus a a terrestrial date/time, and produces the heliocentric equatorial position and 
                velocity vectors of the body in Cartesian coordinates. Orbital parameters are not required for 
                the major planets, Kepler contains an ephemeris generator for these bodies that is within 0.05 
                arc seconds of the JPL DE404 over a wide range of times, Perturbations from major planets are applied 
                to ephemerides for minor planets. 
                The results are passed back as an array containing the two vectors. 
                    Note that this is the format expected for the ephemeris generator used by the NOVAS-COM vector 
                    astrometry engine. For more information see the description of Ephemeris.GetPositionAndVelocity().
                
                    Ephemeris Calculations
                    
                    The ephemeris calculations in Kepler draw heavily from the work of 
                    Stephen Moshier moshier@world.std.com. kepler is released as a free software package, further 
                    extending the work of Mr. Moshier.
                Kepler does not integrate orbits to the current epoch. If you want the accuracy resulting from 
                    an integrated orbit, you must integrate separately and supply Kepler with elements of the current 
                    epoch. Orbit integration is on the list of things for the next major version.
                Kepler uses polynomial approximations for the major planet ephemerides. The tables 
                    of coefficients were derived by a least squares fit of periodic terms to JPL's DE404 ephemerides. 
                    The periodic frequencies used were determined by spectral analysis and comparison with VSOP87 and 
                    other analytical planetary theories. The least squares fit to DE404 covers the interval from -3000 
                    to +3000 for the outer planets, and -1350 to +3000 for the inner planets. For details on the 
                    accuracy of the major planet ephemerides, see the Accuracy Tables page. 
                
                    Date and Time Systems
                    
                    
                    For a detailed explanation of astronomical timekeeping systems, see A Time Tutorial on the NASA 
                    Goddard Spaceflight Center site, and the USNO Systems of Time site. 
                    
                    
                    ActiveX Date values 
                    
                    These are the Windows standard "date serial" numbers, and are expressed in local time or 
                    UTC (see below). The fractional part of these numbers represents time within a day. 
                    They are used throughout applications such as Excel, Visual Basic, VBScript, and other 
                    ActiveX capable environments. 
                    
                    
                    Julian dates 
                    
                    These are standard Julian "date serial" numbers, and are expressed in UTC time or Terrestrial 
                    time. The fractional part of these numbers represents time within a day. The standard ActiveX 
                    "Double" precision of 15 digits gives a resolution of about one millisecond in a full Julian date. 
                    This is sufficient for the purposes of this program. 
                    
                    
                    Hourly Time Values 
                    
                    These are typically used to represent sidereal time and right ascension. They are simple real 
                    numbers in units of hours. 
                    
                    
                    UTC Time Scale 
                    
                    Most of the ASCOM methods and properties that accept date/time values (either Date or Julian) 
                    assume that the date/time is in Coordinated Universal Time (UTC). Where necessary, this time 
                    is converted internally to other scales. Note that UTC seconds are based on the Cesium atom, 
                    not planetary motions. In order to keep UTC in sync with planetary motion, leap seconds are 
                    inserted periodically. The error is at most 900 milliseconds.
                    
                    
                    UT1 Time Scale 
                    
                    The UT1 time scale is the planetary equivalent of UTC. It it runs smoothly and varies a bit 
                    with time, but it is never more than 900 milliseconds different from UTC. 
                    
                    
                    TT Time Scale 
                    
                    The Terrestrial Dynamical Time (TT) scale is used in solar system orbital calculations. 
                    It is based completely on planetary motions; you can think of the solar system as a giant 
                    TT clock. It differs from UT1 by an amount called "delta-t", which slowly increases with time, 
                    and is about 60 seconds right now (2001). 
            
*/
public class Ephemeris{

/*

                Semi-major axis (AU)
            

*/
private double a;
/*

                The type of solar system body represented by this instance of the ephemeris engine (enum)
            

*/
private double BodyType;
/*

                Orbital eccentricity
            

*/
private double e;
/*

                Epoch of osculation of the orbital elements (terrestrial Julian date)
            

*/
private double Epoch;
/*

                Slope parameter for magnitude
            

*/
private double G;
/*

                Absolute visual magnitude
            

*/
private double H;
/*

                The J2000.0 inclination (deg.)
            

*/
private double Incl;
/*

                Mean anomaly at the epoch
            

*/
private double M;
/*

                Mean daily motion (deg/day)
            

*/
private double n;
/*

                The name of the body.
            
If this instance represents an unnumbered minor planet, Ephemeris.Name must be the 
                packed MPC designation. For other types, this is for display only.
*/
private double Name;
/*

                The J2000.0 longitude of the ascending node (deg.)
            

*/
private double Node;
/*

                The major or minor planet number
            

*/
private double Number;
/*

                Orbital period (years)
            

*/
private double P;
/*

                The J2000.0 argument of perihelion (deg.)
            

*/
private double Peri;
/*

                Perihelion distance (AU)
            

*/
private double q;
/*

                Reciprocal semi-major axis (1/AU)
            

*/
private double z;


/*

                Create a new Ephemeris component and initialise it
            

*/
public void Ephemeris(){
return null;
}


/*

                Compute rectangular (x/y/z) heliocentric J2000 equatorial coordinates of position (AU) and 
                velocity (KM/sec.).
            
The TJD parameter is the date/time as a Terrestrial Time Julian date. See below for 
                more info. If you are using ACP, there are functions available to convert between UTC and 
                Terrestrial time, and for estimating the current value of delta-T. See the Overview page for 
                the Kepler.Ephemeris class for more information on time keeping systems.
*/
public void GetPositionAndVelocity(Double){
return null;
}

/*
 Sets 
                Semi-major axis (AU)
            

*/
public void setA(double _theValue){
this.a=_theValue;
}

/*
 Gets 
                Semi-major axis (AU)
            

*/
public double getA(){
return a;
}

/*
 Sets 
                The type of solar system body represented by this instance of the ephemeris engine (enum)
            

*/
public void setBodyType(double _theValue){
this.BodyType=_theValue;
}

/*
 Gets 
                The type of solar system body represented by this instance of the ephemeris engine (enum)
            

*/
public double getBodyType(){
return BodyType;
}

/*
 Sets 
                Orbital eccentricity
            

*/
public void setE(double _theValue){
this.e=_theValue;
}

/*
 Gets 
                Orbital eccentricity
            

*/
public double getE(){
return e;
}

/*
 Sets 
                Epoch of osculation of the orbital elements (terrestrial Julian date)
            

*/
public void setEpoch(double _theValue){
this.Epoch=_theValue;
}

/*
 Gets 
                Epoch of osculation of the orbital elements (terrestrial Julian date)
            

*/
public double getEpoch(){
return Epoch;
}

/*
 Sets 
                Slope parameter for magnitude
            

*/
public void setG(double _theValue){
this.G=_theValue;
}

/*
 Gets 
                Slope parameter for magnitude
            

*/
public double getG(){
return G;
}

/*
 Sets 
                Absolute visual magnitude
            

*/
public void setH(double _theValue){
this.H=_theValue;
}

/*
 Gets 
                Absolute visual magnitude
            

*/
public double getH(){
return H;
}

/*
 Sets 
                The J2000.0 inclination (deg.)
            

*/
public void setIncl(double _theValue){
this.Incl=_theValue;
}

/*
 Gets 
                The J2000.0 inclination (deg.)
            

*/
public double getIncl(){
return Incl;
}

/*
 Sets 
                Mean anomaly at the epoch
            

*/
public void setM(double _theValue){
this.M=_theValue;
}

/*
 Gets 
                Mean anomaly at the epoch
            

*/
public double getM(){
return M;
}

/*
 Sets 
                Mean daily motion (deg/day)
            

*/
public void setN(double _theValue){
this.n=_theValue;
}

/*
 Gets 
                Mean daily motion (deg/day)
            

*/
public double getN(){
return n;
}

/*
 Sets 
                The name of the body.
            
If this instance represents an unnumbered minor planet, Ephemeris.Name must be the 
                packed MPC designation. For other types, this is for display only.
*/
public void setName(double _theValue){
this.Name=_theValue;
}

/*
 Gets 
                The name of the body.
            
If this instance represents an unnumbered minor planet, Ephemeris.Name must be the 
                packed MPC designation. For other types, this is for display only.
*/
public double getName(){
return Name;
}

/*
 Sets 
                The J2000.0 longitude of the ascending node (deg.)
            

*/
public void setNode(double _theValue){
this.Node=_theValue;
}

/*
 Gets 
                The J2000.0 longitude of the ascending node (deg.)
            

*/
public double getNode(){
return Node;
}

/*
 Sets 
                The major or minor planet number
            

*/
public void setNumber(double _theValue){
this.Number=_theValue;
}

/*
 Gets 
                The major or minor planet number
            

*/
public double getNumber(){
return Number;
}

/*
 Sets 
                Orbital period (years)
            

*/
public void setP(double _theValue){
this.P=_theValue;
}

/*
 Gets 
                Orbital period (years)
            

*/
public double getP(){
return P;
}

/*
 Sets 
                The J2000.0 argument of perihelion (deg.)
            

*/
public void setPeri(double _theValue){
this.Peri=_theValue;
}

/*
 Gets 
                The J2000.0 argument of perihelion (deg.)
            

*/
public double getPeri(){
return Peri;
}

/*
 Sets 
                Perihelion distance (AU)
            

*/
public void setQ(double _theValue){
this.q=_theValue;
}

/*
 Gets 
                Perihelion distance (AU)
            

*/
public double getQ(){
return q;
}

/*
 Sets 
                Reciprocal semi-major axis (1/AU)
            

*/
public void setZ(double _theValue){
this.z=_theValue;
}

/*
 Gets 
                Reciprocal semi-major axis (1/AU)
            

*/
public double getZ(){
return z;
}
}
