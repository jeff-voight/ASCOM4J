package ASCOM.Astrometry.NOVASCOM;

/*

                Interface for PositionVector methods that are only accessible through .NET and not through COM
            


*/
public class IPositionVectorExtra{



/*

                Initialize the PositionVector from a Site object using UTC Julian date
            
The Julian date must be UTC Julian date, not terrestrial. Calculations will use the internal delta-T tables and estimator to get 
                delta-T. 
                This overload is not available through COM, please use 
                "SetFromSiteJD(ByVal site As Site, ByVal ujd As Double, ByVal delta_t As Double)"
                with delta_t set to 0.0 to achieve this effect.
            
*/
public void SetFromSiteJD(ASCOM.Astrometry.NOVASCOM.Site,Double){
return null;
}
}
