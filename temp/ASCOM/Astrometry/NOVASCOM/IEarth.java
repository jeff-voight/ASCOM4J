package ASCOM.Astrometry.NOVASCOM;

/*

                Interface to an Earth object that represents the "state" of the Earth at a given Terrestrial Julian date
            

Objects of class Earth represent the "state" of the Earth at a given Terrestrial Julian date. 
                The state includes barycentric and heliocentric position vectors for the earth, plus obliquity, 
                nutation and the equation of the equinoxes. Unless set by the client, the Earth ephemeris used is 
                computed using an internal approximation. The client may optionally attach an ephemeris object for 
                increased accuracy. 
                
                    Ephemeris Generator
                    
                    The ephemeris generator object used with NOVAS-COM must support a single 
                    method GetPositionAndVelocity(tjd). This method must take a terrestrial Julian date (like the 
                    NOVAS-COM methods) as its single parameter, and return an array of Double 
                    containing the rectangular (x/y/z) heliocentric J2000 equatorial coordinates of position (AU) and velocity 
                    (KM/sec.). In addition, it must support three read/write properties BodyType, Name, and Number, 
                    which correspond to the Type, Name, and Number properties of Novas.Planet. 
                
            
*/
public class IEarth{

/*

                Earth barycentric position
            

*/
private double BarycentricPosition;
/*

                Earth barycentric time 
            

*/
private double BarycentricTime;
/*

                Earth barycentric velocity 
            

*/
private double BarycentricVelocity;
/*

                Ephemeris object used to provide the position of the Earth.
            

                Setting this is optional, if not set, the internal Kepler engine will be used.
*/
private double EarthEphemeris;
/*

                Earth equation of equinoxes 
            

*/
private double EquationOfEquinoxes;
/*

                Earth heliocentric position
            

*/
private double HeliocentricPosition;
/*

                Earth heliocentric velocity 
            

*/
private double HeliocentricVelocity;
/*

                Earth mean objiquity
            

*/
private double MeanObliquity;
/*

                Earth nutation in longitude 
            

*/
private double NutationInLongitude;
/*

                Earth nutation in obliquity 
            

*/
private double NutationInObliquity;
/*

                Earth true obliquity 
            

*/
private double TrueObliquity;


/*

                Initialize the Earth object for given terrestrial Julian date
            

*/
public void SetForTime(Double){
return null;
}

/*
 Sets 
                Earth barycentric position
            

*/
public void setBarycentricPosition(double _theValue){
this.BarycentricPosition=_theValue;
}

/*
 Gets 
                Earth barycentric position
            

*/
public double getBarycentricPosition(){
return BarycentricPosition;
}

/*
 Sets 
                Earth barycentric time 
            

*/
public void setBarycentricTime(double _theValue){
this.BarycentricTime=_theValue;
}

/*
 Gets 
                Earth barycentric time 
            

*/
public double getBarycentricTime(){
return BarycentricTime;
}

/*
 Sets 
                Earth barycentric velocity 
            

*/
public void setBarycentricVelocity(double _theValue){
this.BarycentricVelocity=_theValue;
}

/*
 Gets 
                Earth barycentric velocity 
            

*/
public double getBarycentricVelocity(){
return BarycentricVelocity;
}

/*
 Sets 
                Ephemeris object used to provide the position of the Earth.
            

                Setting this is optional, if not set, the internal Kepler engine will be used.
*/
public void setEarthEphemeris(double _theValue){
this.EarthEphemeris=_theValue;
}

/*
 Gets 
                Ephemeris object used to provide the position of the Earth.
            

                Setting this is optional, if not set, the internal Kepler engine will be used.
*/
public double getEarthEphemeris(){
return EarthEphemeris;
}

/*
 Sets 
                Earth equation of equinoxes 
            

*/
public void setEquationOfEquinoxes(double _theValue){
this.EquationOfEquinoxes=_theValue;
}

/*
 Gets 
                Earth equation of equinoxes 
            

*/
public double getEquationOfEquinoxes(){
return EquationOfEquinoxes;
}

/*
 Sets 
                Earth heliocentric position
            

*/
public void setHeliocentricPosition(double _theValue){
this.HeliocentricPosition=_theValue;
}

/*
 Gets 
                Earth heliocentric position
            

*/
public double getHeliocentricPosition(){
return HeliocentricPosition;
}

/*
 Sets 
                Earth heliocentric velocity 
            

*/
public void setHeliocentricVelocity(double _theValue){
this.HeliocentricVelocity=_theValue;
}

/*
 Gets 
                Earth heliocentric velocity 
            

*/
public double getHeliocentricVelocity(){
return HeliocentricVelocity;
}

/*
 Sets 
                Earth mean objiquity
            

*/
public void setMeanObliquity(double _theValue){
this.MeanObliquity=_theValue;
}

/*
 Gets 
                Earth mean objiquity
            

*/
public double getMeanObliquity(){
return MeanObliquity;
}

/*
 Sets 
                Earth nutation in longitude 
            

*/
public void setNutationInLongitude(double _theValue){
this.NutationInLongitude=_theValue;
}

/*
 Gets 
                Earth nutation in longitude 
            

*/
public double getNutationInLongitude(){
return NutationInLongitude;
}

/*
 Sets 
                Earth nutation in obliquity 
            

*/
public void setNutationInObliquity(double _theValue){
this.NutationInObliquity=_theValue;
}

/*
 Gets 
                Earth nutation in obliquity 
            

*/
public double getNutationInObliquity(){
return NutationInObliquity;
}

/*
 Sets 
                Earth true obliquity 
            

*/
public void setTrueObliquity(double _theValue){
this.TrueObliquity=_theValue;
}

/*
 Gets 
                Earth true obliquity 
            

*/
public double getTrueObliquity(){
return TrueObliquity;
}
}
