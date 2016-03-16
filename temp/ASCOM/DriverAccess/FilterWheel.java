package ASCOM.DriverAccess;

/*

            Provides universal access to FilterWheel drivers
            


*/
public class FilterWheel{

/*

             Focus offset of each filter in the wheel
            

             For each valid slot number (from 0 to N-1), reports the focus offset for
             the given filter position.  These values are focuser and filter
             dependent, and  would usually be set up by the user via the SetupDialog.
             The number of slots N can be determined from the length of the array.
             If focuser offsets are not available, then it should report back 0 for all
             array values.
             
*/
private double FocusOffsets;
/*

             Name of each filter in the wheel
            

             For each valid slot number (from 0 to N-1), reports the name given to the
             filter position.  These names would usually be set up by the user via the
             SetupDialog.  The number of slots N can be determined from the length of
             the array.  If filter names are not available, then it should report back
             "Filter 1", "Filter 2", etc.
             
*/
private double Names;
/*

            Sets or returns the current filter wheel position
            

            Write a position number between 0 and N-1, where N is the number of filter slots (see
            ). Starts filter wheel rotation immediately when written. Reading
            the property gives current slot number (if wheel stationary) or -1 if wheel is
            moving. 
            Returning a position of -1 is mandatory while the filter wheel is in motion; valid slot numbers must not be reported back while
            the filter wheel is rotating past filter positions.
            Note
            Some filter wheels are built into the camera (one driver, two
            interfaces).  Some cameras may not actually rotate the wheel until the
            exposure is triggered.  In this case, the written value is available
            immediately as the read value, and -1 is never produced.
            
*/
private double Position;


/*

            Creates a FilterWheel object with the given Prog ID
            

*/
public void FilterWheel(String){
return null;
}


/*

            Brings up the ASCOM Chooser Dialog to choose a FilterWheel
            

*/
public void Choose(String){
return null;
}

/*
 Sets 
             Focus offset of each filter in the wheel
            

             For each valid slot number (from 0 to N-1), reports the focus offset for
             the given filter position.  These values are focuser and filter
             dependent, and  would usually be set up by the user via the SetupDialog.
             The number of slots N can be determined from the length of the array.
             If focuser offsets are not available, then it should report back 0 for all
             array values.
             
*/
public void setFocusOffsets(double _theValue){
this.FocusOffsets=_theValue;
}

/*
 Gets 
             Focus offset of each filter in the wheel
            

             For each valid slot number (from 0 to N-1), reports the focus offset for
             the given filter position.  These values are focuser and filter
             dependent, and  would usually be set up by the user via the SetupDialog.
             The number of slots N can be determined from the length of the array.
             If focuser offsets are not available, then it should report back 0 for all
             array values.
             
*/
public double getFocusOffsets(){
return FocusOffsets;
}

/*
 Sets 
             Name of each filter in the wheel
            

             For each valid slot number (from 0 to N-1), reports the name given to the
             filter position.  These names would usually be set up by the user via the
             SetupDialog.  The number of slots N can be determined from the length of
             the array.  If filter names are not available, then it should report back
             "Filter 1", "Filter 2", etc.
             
*/
public void setNames(double _theValue){
this.Names=_theValue;
}

/*
 Gets 
             Name of each filter in the wheel
            

             For each valid slot number (from 0 to N-1), reports the name given to the
             filter position.  These names would usually be set up by the user via the
             SetupDialog.  The number of slots N can be determined from the length of
             the array.  If filter names are not available, then it should report back
             "Filter 1", "Filter 2", etc.
             
*/
public double getNames(){
return Names;
}

/*
 Sets 
            Sets or returns the current filter wheel position
            

            Write a position number between 0 and N-1, where N is the number of filter slots (see
            ). Starts filter wheel rotation immediately when written. Reading
            the property gives current slot number (if wheel stationary) or -1 if wheel is
            moving. 
            Returning a position of -1 is mandatory while the filter wheel is in motion; valid slot numbers must not be reported back while
            the filter wheel is rotating past filter positions.
            Note
            Some filter wheels are built into the camera (one driver, two
            interfaces).  Some cameras may not actually rotate the wheel until the
            exposure is triggered.  In this case, the written value is available
            immediately as the read value, and -1 is never produced.
            
*/
public void setPosition(double _theValue){
this.Position=_theValue;
}

/*
 Gets 
            Sets or returns the current filter wheel position
            

            Write a position number between 0 and N-1, where N is the number of filter slots (see
            ). Starts filter wheel rotation immediately when written. Reading
            the property gives current slot number (if wheel stationary) or -1 if wheel is
            moving. 
            Returning a position of -1 is mandatory while the filter wheel is in motion; valid slot numbers must not be reported back while
            the filter wheel is rotating past filter positions.
            Note
            Some filter wheels are built into the camera (one driver, two
            interfaces).  Some cameras may not actually rotate the wheel until the
            exposure is triggered.  In this case, the written value is available
            immediately as the read value, and -1 is never produced.
            
*/
public double getPosition(){
return Position;
}
}
