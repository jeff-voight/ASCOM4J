package ASCOM.DriverAccess;

/*

            Provides universal access to Focuser drivers
            


*/
public class Focuser{

/*

            True if the focuser is capable of absolute position; that is, being commanded to a specific step location.
            

*/
private double Absolute;
/*

            True if the focuser is currently moving to a new position. False if the focuser is stationary.
            

*/
private double IsMoving;
/*

            State of the connection to the focuser.
            

            Set True to start the connection to the focuser; set False to terminate the connection. 
            The current connection status can also be read back through this property. 
            An exception will be raised if the link fails to change state for any reason. 
            Note
            The FocuserV1 interface was the only interface to name its "Connect" method "Link" all others named 
            their "Connect" method as "Connected". All interfaces including Focuser now have a  method and this is 
            the recommended method to use to "Connect" to Focusers exposing the V2 and later interfaces.
            Applications using DriverAccess can always use Connected because DriverAccess implements Connected using the Link property for V1 drivers but
            applications that call the driver directly should check the InterfaceVersion property and call Link for V1 drivers.
            
*/
private double Link;
/*

            Maximum increment size allowed by the focuser; 
            i.e. the maximum number of steps allowed in one move operation.
            

            For most focusers this is the same as the  property. This is normally used to limit the Increment 
            display in the host software.
            
*/
private double MaxIncrement;
/*

            Maximum step position permitted.
            

            The focuser can step between 0 and . If an attempt is made to move the focuser beyond these limits,
            it will automatically stop at the limit.
            
*/
private double MaxStep;
/*

            Current focuser position, in steps.
            

            Valid only for absolute positioning focusers (see the  property).
            An exception will be raised for relative positioning focusers.
            
*/
private double Position;
/*

            Step size (microns) for the focuser.
            
Must throw an exception if the focuser does not intrinsically know what the step size is.
*/
private double StepSize;
/*

            The state of temperature compensation mode (if available), else always False.
            

            If the  property is True, then setting  to True
            puts the focuser into temperature tracking mode. While in temperature tracking mode,
            Move commands will be rejected by the focuser. Set to False to turn off temperature tracking.
            An exception will be raised if  is False and an attempt is made to set  to true.
            
*/
private double TempComp;
/*

            True if focuser has temperature compensation available.
            

            Will be True only if the focuser's temperature compensation can be turned on and off via the  property. 
            
*/
private double TempCompAvailable;
/*

            Current ambient temperature as measured by the focuser.
            

            Raises an exception if ambient temperature is not available. Commonly available on focusers with a built-in temperature compensation mode. 
            
*/
private double Temperature;


/*

            Creates a focuser object with the given Prog ID
            

*/
public void Focuser(String){
return null;
}


/*

            Brings up the ASCOM Chooser Dialog to choose a Focuser
            

*/
public void Choose(String){
return null;
}


/*

            Immediately stop any focuser motion due to a previous  method call.
            

            Some focusers may not support this function, in which case an exception will be raised. 
            Recommendation: Host software should call this method upon initialization and,
            if it fails, disable the Halt button in the user interface.
            
*/
public void Halt(){
return null;
}


/*

              Moves the focuser by the specified amount or to the specified position depending on the value of the  property.
             
If the  property is True, then this is an absolute positioning focuser. 
             The Move command tells the focuser to move to an exact step position, and the Position parameter 
             of the Move method is an integer between 0 and .
             If the  property is False, then this is a relative positioning focuser. The Move command tells 
             the focuser to move in a relative direction, and the Position parameter of the Move method (in this case, step distance) 
             is an integer between minus  and plus .
            
*/
public void Move(Int32){
return null;
}

/*
 Sets 
            True if the focuser is capable of absolute position; that is, being commanded to a specific step location.
            

*/
public void setAbsolute(double _theValue){
this.Absolute=_theValue;
}

/*
 Gets 
            True if the focuser is capable of absolute position; that is, being commanded to a specific step location.
            

*/
public double getAbsolute(){
return Absolute;
}

/*
 Sets 
            True if the focuser is currently moving to a new position. False if the focuser is stationary.
            

*/
public void setIsMoving(double _theValue){
this.IsMoving=_theValue;
}

/*
 Gets 
            True if the focuser is currently moving to a new position. False if the focuser is stationary.
            

*/
public double getIsMoving(){
return IsMoving;
}

/*
 Sets 
            State of the connection to the focuser.
            

            Set True to start the connection to the focuser; set False to terminate the connection. 
            The current connection status can also be read back through this property. 
            An exception will be raised if the link fails to change state for any reason. 
            Note
            The FocuserV1 interface was the only interface to name its "Connect" method "Link" all others named 
            their "Connect" method as "Connected". All interfaces including Focuser now have a  method and this is 
            the recommended method to use to "Connect" to Focusers exposing the V2 and later interfaces.
            Applications using DriverAccess can always use Connected because DriverAccess implements Connected using the Link property for V1 drivers but
            applications that call the driver directly should check the InterfaceVersion property and call Link for V1 drivers.
            
*/
public void setLink(double _theValue){
this.Link=_theValue;
}

/*
 Gets 
            State of the connection to the focuser.
            

            Set True to start the connection to the focuser; set False to terminate the connection. 
            The current connection status can also be read back through this property. 
            An exception will be raised if the link fails to change state for any reason. 
            Note
            The FocuserV1 interface was the only interface to name its "Connect" method "Link" all others named 
            their "Connect" method as "Connected". All interfaces including Focuser now have a  method and this is 
            the recommended method to use to "Connect" to Focusers exposing the V2 and later interfaces.
            Applications using DriverAccess can always use Connected because DriverAccess implements Connected using the Link property for V1 drivers but
            applications that call the driver directly should check the InterfaceVersion property and call Link for V1 drivers.
            
*/
public double getLink(){
return Link;
}

/*
 Sets 
            Maximum increment size allowed by the focuser; 
            i.e. the maximum number of steps allowed in one move operation.
            

            For most focusers this is the same as the  property. This is normally used to limit the Increment 
            display in the host software.
            
*/
public void setMaxIncrement(double _theValue){
this.MaxIncrement=_theValue;
}

/*
 Gets 
            Maximum increment size allowed by the focuser; 
            i.e. the maximum number of steps allowed in one move operation.
            

            For most focusers this is the same as the  property. This is normally used to limit the Increment 
            display in the host software.
            
*/
public double getMaxIncrement(){
return MaxIncrement;
}

/*
 Sets 
            Maximum step position permitted.
            

            The focuser can step between 0 and . If an attempt is made to move the focuser beyond these limits,
            it will automatically stop at the limit.
            
*/
public void setMaxStep(double _theValue){
this.MaxStep=_theValue;
}

/*
 Gets 
            Maximum step position permitted.
            

            The focuser can step between 0 and . If an attempt is made to move the focuser beyond these limits,
            it will automatically stop at the limit.
            
*/
public double getMaxStep(){
return MaxStep;
}

/*
 Sets 
            Current focuser position, in steps.
            

            Valid only for absolute positioning focusers (see the  property).
            An exception will be raised for relative positioning focusers.
            
*/
public void setPosition(double _theValue){
this.Position=_theValue;
}

/*
 Gets 
            Current focuser position, in steps.
            

            Valid only for absolute positioning focusers (see the  property).
            An exception will be raised for relative positioning focusers.
            
*/
public double getPosition(){
return Position;
}

/*
 Sets 
            Step size (microns) for the focuser.
            
Must throw an exception if the focuser does not intrinsically know what the step size is.
*/
public void setStepSize(double _theValue){
this.StepSize=_theValue;
}

/*
 Gets 
            Step size (microns) for the focuser.
            
Must throw an exception if the focuser does not intrinsically know what the step size is.
*/
public double getStepSize(){
return StepSize;
}

/*
 Sets 
            The state of temperature compensation mode (if available), else always False.
            

            If the  property is True, then setting  to True
            puts the focuser into temperature tracking mode. While in temperature tracking mode,
            Move commands will be rejected by the focuser. Set to False to turn off temperature tracking.
            An exception will be raised if  is False and an attempt is made to set  to true.
            
*/
public void setTempComp(double _theValue){
this.TempComp=_theValue;
}

/*
 Gets 
            The state of temperature compensation mode (if available), else always False.
            

            If the  property is True, then setting  to True
            puts the focuser into temperature tracking mode. While in temperature tracking mode,
            Move commands will be rejected by the focuser. Set to False to turn off temperature tracking.
            An exception will be raised if  is False and an attempt is made to set  to true.
            
*/
public double getTempComp(){
return TempComp;
}

/*
 Sets 
            True if focuser has temperature compensation available.
            

            Will be True only if the focuser's temperature compensation can be turned on and off via the  property. 
            
*/
public void setTempCompAvailable(double _theValue){
this.TempCompAvailable=_theValue;
}

/*
 Gets 
            True if focuser has temperature compensation available.
            

            Will be True only if the focuser's temperature compensation can be turned on and off via the  property. 
            
*/
public double getTempCompAvailable(){
return TempCompAvailable;
}

/*
 Sets 
            Current ambient temperature as measured by the focuser.
            

            Raises an exception if ambient temperature is not available. Commonly available on focusers with a built-in temperature compensation mode. 
            
*/
public void setTemperature(double _theValue){
this.Temperature=_theValue;
}

/*
 Gets 
            Current ambient temperature as measured by the focuser.
            

            Raises an exception if ambient temperature is not available. Commonly available on focusers with a built-in temperature compensation mode. 
            
*/
public double getTemperature(){
return Temperature;
}
}
