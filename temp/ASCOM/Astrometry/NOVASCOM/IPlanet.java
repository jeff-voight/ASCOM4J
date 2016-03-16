package ASCOM.Astrometry.NOVASCOM;

/*

                Interface to a Planet component that provides characteristics of a solar system body
            

Objects of class Planet hold the characteristics of a solar system body. Properties are 
                type (major or minor planet), number (for major and numbered minor planets), name (for unnumbered 
                minor planets and comets), the ephemeris object to be used for orbital calculations, an optional 
                ephemeris object to use for barycenter calculations, and an optional value for delta-T. 
                The high-level NOVAS astrometric functions are implemented as methods of Planet: 
                    GetTopocentricPosition(), GetLocalPosition(), GetApparentPosition(), GetVirtualPosition(), 
                    and GetAstrometricPosition(). These methods operate on the properties of the Planet, and produce 
                    a PositionVector object. For example, to get the topocentric coordinates of a planet, create and 
                    initialize a planet, create initialize and attach an ephemeris object, then call 
                    Planet.GetTopocentricPosition(). The resulting PositionVector's right ascension and declination 
                    properties are the topocentric equatorial coordinates, at the same time, the (optionally 
                    refracted) alt-az coordinates are calculated, and are also contained within the returned 
                    PositionVector. Note that Alt/Az is available in PositionVectors returned from calling 
                        GetTopocentricPosition(). The accuracy of these calculations is typically dominated by the accuracy 
                    of the attached ephemeris generator. 
                
                    Ephemeris Generator
                    
                    By default, Kepler instances are attached for both Earth and Planet objects so it is
                    not necessary to create and attach these in order to get Kepler accuracy from this
                    component
                The ephemeris generator object used with NOVAS-COM must support a single 
                    method GetPositionAndVelocity(tjd). This method must take a terrestrial Julian date (like the 
                    NOVAS-COM methods) as its single parameter, and return an array of Double 
                    containing the rectangular (x/y/z) heliocentric J2000 equatorial coordinates of position (AU) and velocity 
                    (KM/sec.). In addition, it must support three read/write properties BodyType, Name, and Number, 
                    which correspond to the Type, Name, and Number properties of Novas.Planet. 
                
            
*/
public class IPlanet{

/*

                Planet delta-T
            
Setting this value is optional. If no value is set, an internal delta-T generator is used.
*/
private double DeltaT;
/*

                Ephemeris object used to provide the position of the Earth.
            

                Setting this is optional, if not set, the internal Kepler engine will be used.
*/
private double EarthEphemeris;
/*

                The Ephemeris object used to provide positions of solar system bodies.
            

                Setting this is optional, if not set, the internal Kepler engine will be used.
            
*/
private double Ephemeris;
/*

                Planet name
            

*/
private double Name;
/*

                Planet number
            
The major planet number is its number out from the sun starting with Mercury = 1
*/
private double Number;
/*

                The type of solar system body
            

*/
private double Type;


/*

                Get an apparent position for given time
            

*/
public void GetApparentPosition(Double){
return null;
}


/*

                Get an astrometric position for given time
            

*/
public void GetAstrometricPosition(Double){
return null;
}


/*

                Get an local position for given time
            

*/
public void GetLocalPosition(Double,ASCOM.Astrometry.NOVASCOM.Site){
return null;
}


/*

                Get a topocentric position for given time
            

*/
public void GetTopocentricPosition(Double,ASCOM.Astrometry.NOVASCOM.Site,Boolean){
return null;
}


/*

                Get a virtual position for given time
            

*/
public void GetVirtualPosition(Double){
return null;
}

/*
 Sets 
                Planet delta-T
            
Setting this value is optional. If no value is set, an internal delta-T generator is used.
*/
public void setDeltaT(double _theValue){
this.DeltaT=_theValue;
}

/*
 Gets 
                Planet delta-T
            
Setting this value is optional. If no value is set, an internal delta-T generator is used.
*/
public double getDeltaT(){
return DeltaT;
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
                The Ephemeris object used to provide positions of solar system bodies.
            

                Setting this is optional, if not set, the internal Kepler engine will be used.
            
*/
public void setEphemeris(double _theValue){
this.Ephemeris=_theValue;
}

/*
 Gets 
                The Ephemeris object used to provide positions of solar system bodies.
            

                Setting this is optional, if not set, the internal Kepler engine will be used.
            
*/
public double getEphemeris(){
return Ephemeris;
}

/*
 Sets 
                Planet name
            

*/
public void setName(double _theValue){
this.Name=_theValue;
}

/*
 Gets 
                Planet name
            

*/
public double getName(){
return Name;
}

/*
 Sets 
                Planet number
            
The major planet number is its number out from the sun starting with Mercury = 1
*/
public void setNumber(double _theValue){
this.Number=_theValue;
}

/*
 Gets 
                Planet number
            
The major planet number is its number out from the sun starting with Mercury = 1
*/
public double getNumber(){
return Number;
}

/*
 Sets 
                The type of solar system body
            

*/
public void setType(double _theValue){
this.Type=_theValue;
}

/*
 Gets 
                The type of solar system body
            

*/
public double getType(){
return Type;
}
}
