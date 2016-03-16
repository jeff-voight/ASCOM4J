package ASCOM.Astrometry.NOVASCOM;

/*

                Interface for VelocityVector methods that are only accessible through .NET and not through COM
            


*/
public class IVelocityVectorExtra{



/*

                Initialize the VelocityVector from a Site object using UTC Julian Date
            
The velocity vector is that of the observer with respect to the Earth's center 
                of mass. The Julian date must be UTC Julian date, not terrestrial. This call will use 
                the internal tables and estimator to get delta-T.
                This overload is not available through COM, please use 
                "SetFromSiteJD(ByVal site As Site, ByVal ujd As Double, ByVal delta_t As Double)"
                with delta_t set to 0.0 to achieve this effect.
            
*/
public void SetFromSiteJD(ASCOM.Astrometry.NOVASCOM.Site,Double){
return null;
}
}
