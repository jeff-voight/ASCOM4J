package ASCOM.Astrometry.NOVASCOM;

/*

                interface to the NOVAS_COM VelocityVector Class
            

Objects of class VelocityVector contain vectors used for velocities (earth, sites, 
                planets, and stars) throughout NOVAS-COM. Of course, its properties include the x, y, and z 
                components of the velocity. Additional properties are the velocity in equatorial coordinates of 
                right ascension dot, declination dot and radial velocity. You can initialize a PositionVector from 
                a Star object (essentially an FK5 or HIP catalog entry) or a Site (lat/long/height). For the star 
                object the proper motions, distance and radial velocity are used, for a site, the velocity is that 
                of the observer with respect to the Earth's center of mass. 
*/
public class IVelocityVector{

/*

                Linear velocity along the declination direction (AU/day)
            
This is not the proper motion (which is an angular rate and is dependent on the distance to the object).
*/
private double DecVelocity;
/*

                Linear velocity along the radial direction (AU/day)
            

*/
private double RadialVelocity;
/*

                Linear velocity along the right ascension direction (AU/day)
            

*/
private double RAVelocity;
/*

                Cartesian x component of velocity (AU/day)
            

*/
private double x;
/*

                Cartesian y component of velocity (AU/day)
            

*/
private double y;
/*

                Cartesian z component of velocity (AU/day)
            

*/
private double z;


/*

                Initialize the VelocityVector from a Site object and Greenwich Apparent Sdereal Time.
            
The velocity vector is that of the observer with respect to the Earth's center 
                of mass. The GAST parameter must be for Greenwich, not local. The time is rotated through 
                the site longitude. See SetFromSiteJD() for an equivalent method that takes UTC Julian 
                Date and optionally Delta-T (eliminating the need for calculating hyper-accurate GAST yourself). 
*/
public void SetFromSite(ASCOM.Astrometry.NOVASCOM.Site,Double){
return null;
}


/*

                Initialize the VelocityVector from a Site object using UTC Julian Date and Delta-T
            
The velocity vector is that of the observer with respect to the Earth's center 
                of mass. The Julian date must be UTC Julian date, not terrestrial.
*/
public void SetFromSiteJD(ASCOM.Astrometry.NOVASCOM.Site,Double,Double){
return null;
}


/*

                Initialize the VelocityVector from a Star object.
            
The proper motions, distance and radial velocity are used in the velocity calculation. 
*/
public void SetFromStar(ASCOM.Astrometry.NOVASCOM.Star){
return null;
}

/*
 Sets 
                Linear velocity along the declination direction (AU/day)
            
This is not the proper motion (which is an angular rate and is dependent on the distance to the object).
*/
public void setDecVelocity(double _theValue){
this.DecVelocity=_theValue;
}

/*
 Gets 
                Linear velocity along the declination direction (AU/day)
            
This is not the proper motion (which is an angular rate and is dependent on the distance to the object).
*/
public double getDecVelocity(){
return DecVelocity;
}

/*
 Sets 
                Linear velocity along the radial direction (AU/day)
            

*/
public void setRadialVelocity(double _theValue){
this.RadialVelocity=_theValue;
}

/*
 Gets 
                Linear velocity along the radial direction (AU/day)
            

*/
public double getRadialVelocity(){
return RadialVelocity;
}

/*
 Sets 
                Linear velocity along the right ascension direction (AU/day)
            

*/
public void setRAVelocity(double _theValue){
this.RAVelocity=_theValue;
}

/*
 Gets 
                Linear velocity along the right ascension direction (AU/day)
            

*/
public double getRAVelocity(){
return RAVelocity;
}

/*
 Sets 
                Cartesian x component of velocity (AU/day)
            

*/
public void setX(double _theValue){
this.x=_theValue;
}

/*
 Gets 
                Cartesian x component of velocity (AU/day)
            

*/
public double getX(){
return x;
}

/*
 Sets 
                Cartesian y component of velocity (AU/day)
            

*/
public void setY(double _theValue){
this.y=_theValue;
}

/*
 Gets 
                Cartesian y component of velocity (AU/day)
            

*/
public double getY(){
return y;
}

/*
 Sets 
                Cartesian z component of velocity (AU/day)
            

*/
public void setZ(double _theValue){
this.z=_theValue;
}

/*
 Gets 
                Cartesian z component of velocity (AU/day)
            

*/
public double getZ(){
return z;
}
}
