package ASCOM.DriverAccess;

/*

            Provides universal access to ASCOM Dome drivers
            


*/
public class Dome{

/*

            The dome altitude (degrees, horizon zero and increasing positive to 90 zenith).
            

            Raises an error only if no altitude control. If actual dome altitude can not be read,
            then reports back the last slew position. 
            
*/
private double Altitude;
/*

              Indicates whether the dome is in the home position.
              Raises an error if not supported. 
            
              This is normally used following a  operation. The value is reset with any azimuth
              slew operation that moves the dome away from the home position.
            
            
               may also become true durng normal slew operations, if the dome passes through the home position
              and the dome controller hardware is capable of detecting that; or at the end of a slew operation if the dome
              comes to rest at the home position.
            
            

              
                The home position is normally defined by a hardware sensor positioned around the dome circumference
                and represents a fixed, known azimuth reference.
              
              
                For some devices, the home position may represent a small range of azimuth values, rather than a discrete
                value, since dome inertia, the resolution of the home position sensor and/or the azimuth encoder may be
                insufficient to return the exact same azimuth value on each occasion. Some dome controllers, on the other
                hand, will always force the azimuth reading to a fixed value whenever the home position sensor is active.
                Because of these potential differences in behaviour, applications should not rely on the reported azimuth
                position being identical each time  is set true.
              
            
*/
private double AtHome;
/*

            True if the dome is in the programmed park position.
            

            Set only following a  operation and reset with any slew operation.
            Raises an error if not supported. 
            
*/
private double AtPark;
/*

            The dome azimuth (degrees, North zero and increasing clockwise, i.e., 90 East, 180 South, 270 West)
            
Raises an error only if no azimuth control. If actual dome azimuth can not be read, then reports back last slew position
*/
private double Azimuth;
/*

            True if driver can do a search for home position.
            

*/
private double CanFindHome;
/*

            True if driver is capable of setting dome altitude.
            

*/
private double CanPark;
/*

            True if driver is capable of setting dome altitude.
            

*/
private double CanSetAltitude;
/*

            True if driver is capable of setting dome azimuth.
            

*/
private double CanSetAzimuth;
/*

            True if driver can set the dome park position.
            

*/
private double CanSetPark;
/*

            True if driver is capable of automatically operating shutter.
            

*/
private double CanSetShutter;
/*

            True if the dome hardware supports slaving to a telescope.
            
See the notes for the  property.
*/
private double CanSlave;
/*

            True if driver is capable of synchronizing the dome azimuth position using the Dome.SyncToAzimuth method.
            

*/
private double CanSyncAzimuth;
/*

            Status of the dome shutter or roll-off roof.
            

            Raises an error only if no shutter control.
            If actual shutter status can not be read, 
            then reports back the last shutter state. 
            
*/
private double ShutterStatus;
/*

            True if the dome is slaved to the telescope in its hardware, else False.
            

            Set this property to True to enable dome-telescope hardware slaving,
            if supported (see ). Raises an exception on any attempt to set 
            this property if hardware slaving is not supported).
            Always returns False if hardware slaving is not supported. 
            
*/
private double Slaved;
/*

            True if any part of the dome is currently moving, False if all dome components are steady.
            

            Raises an error if  is True, if not supported, if a communications failure occurs,
            or if the dome can not reach indicated azimuth. 
            
*/
private double Slewing;


/*

            Constructor for Dome class. Creates a Dome based on the ProgID in the DomeID string.
            

*/
public void Dome(String){
return null;
}


/*

            Shows the ASCOM Chooser to select a Dome.
            

*/
public void Choose(String){
return null;
}


/*

            Immediately cancel current dome operation.
            

            Calling this method will immediately disable hardware slewing ( will become False).
            Raises an error if a communications failure occurs, or if the command is known to have failed. 
            
*/
public void AbortSlew(){
return null;
}


/*

            Close shutter or otherwise shield telescope from the sky.
            

*/
public void CloseShutter(){
return null;
}


/*

            Start operation to search for the dome home position.
            

            After Home position is established initializes  to the default value and sets the  flag. 
            Exception if not supported or communications failure. Raises an error if  is True.
            
*/
public void FindHome(){
return null;
}


/*

            Open shutter or otherwise expose telescope to the sky.
            

            Raises an error if not supported or if a communications failure occurs. 
            
*/
public void OpenShutter(){
return null;
}


/*

            Rotate dome in azimuth to park position.
            

            After assuming programmed park position, sets  flag. Raises an error if  is True,
            or if not supported, or if a communications failure has occurred. 
            
*/
public void Park(){
return null;
}


/*

            Set the current azimuth, altitude position of dome to be the park position.
            

            Raises an error if not supported or if a communications failure occurs. 
            
*/
public void SetPark(){
return null;
}


/*

            Slew the dome to the given altitude position.
            

            Raises an error if  is True, if not supported, if a communications failure occurs,
            or if the dome can not reach indicated altitude. 
            
*/
public void SlewToAltitude(Double){
return null;
}


/*

            Slew the dome to the given azimuth position.
            

            Raises an error if  is True, if not supported, if a communications failure occurs,
            or if the dome can not reach indicated azimuth. 
            
*/
public void SlewToAzimuth(Double){
return null;
}


/*

            Synchronize the current position of the dome to the given azimuth.
            

            Raises an error if not supported or if a communications failure occurs. 
            
*/
public void SyncToAzimuth(Double){
return null;
}

/*
 Sets 
            The dome altitude (degrees, horizon zero and increasing positive to 90 zenith).
            

            Raises an error only if no altitude control. If actual dome altitude can not be read,
            then reports back the last slew position. 
            
*/
public void setAltitude(double _theValue){
this.Altitude=_theValue;
}

/*
 Gets 
            The dome altitude (degrees, horizon zero and increasing positive to 90 zenith).
            

            Raises an error only if no altitude control. If actual dome altitude can not be read,
            then reports back the last slew position. 
            
*/
public double getAltitude(){
return Altitude;
}

/*
 Sets 
              Indicates whether the dome is in the home position.
              Raises an error if not supported. 
            
              This is normally used following a  operation. The value is reset with any azimuth
              slew operation that moves the dome away from the home position.
            
            
               may also become true durng normal slew operations, if the dome passes through the home position
              and the dome controller hardware is capable of detecting that; or at the end of a slew operation if the dome
              comes to rest at the home position.
            
            

              
                The home position is normally defined by a hardware sensor positioned around the dome circumference
                and represents a fixed, known azimuth reference.
              
              
                For some devices, the home position may represent a small range of azimuth values, rather than a discrete
                value, since dome inertia, the resolution of the home position sensor and/or the azimuth encoder may be
                insufficient to return the exact same azimuth value on each occasion. Some dome controllers, on the other
                hand, will always force the azimuth reading to a fixed value whenever the home position sensor is active.
                Because of these potential differences in behaviour, applications should not rely on the reported azimuth
                position being identical each time  is set true.
              
            
*/
public void setAtHome(double _theValue){
this.AtHome=_theValue;
}

/*
 Gets 
              Indicates whether the dome is in the home position.
              Raises an error if not supported. 
            
              This is normally used following a  operation. The value is reset with any azimuth
              slew operation that moves the dome away from the home position.
            
            
               may also become true durng normal slew operations, if the dome passes through the home position
              and the dome controller hardware is capable of detecting that; or at the end of a slew operation if the dome
              comes to rest at the home position.
            
            

              
                The home position is normally defined by a hardware sensor positioned around the dome circumference
                and represents a fixed, known azimuth reference.
              
              
                For some devices, the home position may represent a small range of azimuth values, rather than a discrete
                value, since dome inertia, the resolution of the home position sensor and/or the azimuth encoder may be
                insufficient to return the exact same azimuth value on each occasion. Some dome controllers, on the other
                hand, will always force the azimuth reading to a fixed value whenever the home position sensor is active.
                Because of these potential differences in behaviour, applications should not rely on the reported azimuth
                position being identical each time  is set true.
              
            
*/
public double getAtHome(){
return AtHome;
}

/*
 Sets 
            True if the dome is in the programmed park position.
            

            Set only following a  operation and reset with any slew operation.
            Raises an error if not supported. 
            
*/
public void setAtPark(double _theValue){
this.AtPark=_theValue;
}

/*
 Gets 
            True if the dome is in the programmed park position.
            

            Set only following a  operation and reset with any slew operation.
            Raises an error if not supported. 
            
*/
public double getAtPark(){
return AtPark;
}

/*
 Sets 
            The dome azimuth (degrees, North zero and increasing clockwise, i.e., 90 East, 180 South, 270 West)
            
Raises an error only if no azimuth control. If actual dome azimuth can not be read, then reports back last slew position
*/
public void setAzimuth(double _theValue){
this.Azimuth=_theValue;
}

/*
 Gets 
            The dome azimuth (degrees, North zero and increasing clockwise, i.e., 90 East, 180 South, 270 West)
            
Raises an error only if no azimuth control. If actual dome azimuth can not be read, then reports back last slew position
*/
public double getAzimuth(){
return Azimuth;
}

/*
 Sets 
            True if driver can do a search for home position.
            

*/
public void setCanFindHome(double _theValue){
this.CanFindHome=_theValue;
}

/*
 Gets 
            True if driver can do a search for home position.
            

*/
public double getCanFindHome(){
return CanFindHome;
}

/*
 Sets 
            True if driver is capable of setting dome altitude.
            

*/
public void setCanPark(double _theValue){
this.CanPark=_theValue;
}

/*
 Gets 
            True if driver is capable of setting dome altitude.
            

*/
public double getCanPark(){
return CanPark;
}

/*
 Sets 
            True if driver is capable of setting dome altitude.
            

*/
public void setCanSetAltitude(double _theValue){
this.CanSetAltitude=_theValue;
}

/*
 Gets 
            True if driver is capable of setting dome altitude.
            

*/
public double getCanSetAltitude(){
return CanSetAltitude;
}

/*
 Sets 
            True if driver is capable of setting dome azimuth.
            

*/
public void setCanSetAzimuth(double _theValue){
this.CanSetAzimuth=_theValue;
}

/*
 Gets 
            True if driver is capable of setting dome azimuth.
            

*/
public double getCanSetAzimuth(){
return CanSetAzimuth;
}

/*
 Sets 
            True if driver can set the dome park position.
            

*/
public void setCanSetPark(double _theValue){
this.CanSetPark=_theValue;
}

/*
 Gets 
            True if driver can set the dome park position.
            

*/
public double getCanSetPark(){
return CanSetPark;
}

/*
 Sets 
            True if driver is capable of automatically operating shutter.
            

*/
public void setCanSetShutter(double _theValue){
this.CanSetShutter=_theValue;
}

/*
 Gets 
            True if driver is capable of automatically operating shutter.
            

*/
public double getCanSetShutter(){
return CanSetShutter;
}

/*
 Sets 
            True if the dome hardware supports slaving to a telescope.
            
See the notes for the  property.
*/
public void setCanSlave(double _theValue){
this.CanSlave=_theValue;
}

/*
 Gets 
            True if the dome hardware supports slaving to a telescope.
            
See the notes for the  property.
*/
public double getCanSlave(){
return CanSlave;
}

/*
 Sets 
            True if driver is capable of synchronizing the dome azimuth position using the Dome.SyncToAzimuth method.
            

*/
public void setCanSyncAzimuth(double _theValue){
this.CanSyncAzimuth=_theValue;
}

/*
 Gets 
            True if driver is capable of synchronizing the dome azimuth position using the Dome.SyncToAzimuth method.
            

*/
public double getCanSyncAzimuth(){
return CanSyncAzimuth;
}

/*
 Sets 
            Status of the dome shutter or roll-off roof.
            

            Raises an error only if no shutter control.
            If actual shutter status can not be read, 
            then reports back the last shutter state. 
            
*/
public void setShutterStatus(double _theValue){
this.ShutterStatus=_theValue;
}

/*
 Gets 
            Status of the dome shutter or roll-off roof.
            

            Raises an error only if no shutter control.
            If actual shutter status can not be read, 
            then reports back the last shutter state. 
            
*/
public double getShutterStatus(){
return ShutterStatus;
}

/*
 Sets 
            True if the dome is slaved to the telescope in its hardware, else False.
            

            Set this property to True to enable dome-telescope hardware slaving,
            if supported (see ). Raises an exception on any attempt to set 
            this property if hardware slaving is not supported).
            Always returns False if hardware slaving is not supported. 
            
*/
public void setSlaved(double _theValue){
this.Slaved=_theValue;
}

/*
 Gets 
            True if the dome is slaved to the telescope in its hardware, else False.
            

            Set this property to True to enable dome-telescope hardware slaving,
            if supported (see ). Raises an exception on any attempt to set 
            this property if hardware slaving is not supported).
            Always returns False if hardware slaving is not supported. 
            
*/
public double getSlaved(){
return Slaved;
}

/*
 Sets 
            True if any part of the dome is currently moving, False if all dome components are steady.
            

            Raises an error if  is True, if not supported, if a communications failure occurs,
            or if the dome can not reach indicated azimuth. 
            
*/
public void setSlewing(double _theValue){
this.Slewing=_theValue;
}

/*
 Gets 
            True if any part of the dome is currently moving, False if all dome components are steady.
            

            Raises an error if  is True, if not supported, if a communications failure occurs,
            or if the dome can not reach indicated azimuth. 
            
*/
public double getSlewing(){
return Slewing;
}
}
