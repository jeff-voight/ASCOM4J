package ASCOM.DriverAccess;

/*

            Provides universal access to Rotator drivers
            


*/
public class Rotator{

/*

            Indicates whether the Rotator supports the  method.
            

*/
private double CanReverse;
/*

            Indicates whether the rotator is currently moving
            
Rotation is asynchronous, that is, when the Move method is called, it starts the rotation, then returns 
            immediately. During rotation,  must be True, else it must be False.
*/
private double IsMoving;
/*

            Current instantaneous Rotator position, in degrees.
            

            The position is expressed as an angle from 0 up to but not including 360 degrees, counter-clockwise against the 
            sky. This is the standard definition of Position Angle. However, the rotator does not need to (and in general will not) 
            report the true Equatorial Position Angle, as the attached imager may not be precisely aligned with the rotator's indexing. 
            It is up to the client to determine any offset between mechanical rotator position angle and the true Equatorial Position 
            Angle of the imager, and compensate for any difference. 
            The optional  property is provided in order to manage rotators being used on optics with odd or 
            even number of reflections. With the Reverse switch in the correct position for the optics, the reported position angle must 
            be counter-clockwise against the sky.
            
*/
private double Position;
/*

            Sets or Returns the rotator’s Reverse state.
            
See the definition of . Raises an error if not supported. 
*/
private double Reverse;
/*

            The minimum StepSize, in degrees.
            

            Raises an exception if the rotator does not intrinsically know what the step size is.
            
*/
private double StepSize;
/*

            The destination position angle for Move() and MoveAbsolute().
            
Upon calling Move or MoveAbsolute, this property immediately 
            changes to the position angle to which the rotator is moving. The value is retained until a subsequent call 
            to Move or MoveAbsolute.
            
*/
private double TargetPosition;


/*

            Creates a rotator object with the given Prog ID
            

*/
public void Rotator(String){
return null;
}


/*

            Brings up the ASCOM Chooser Dialog to choose a Rotator
            

*/
public void Choose(String){
return null;
}


/*

            Immediately stop any Rotator motion due to a previous Move or MoveAbsolute method call.
            
This is an optional method. Raises an error if not supported.
*/
public void Halt(){
return null;
}


/*

            Causes the rotator to move Position degrees relative to the current  value.
            
Calling Move causes the  property to change to the sum of the current angular position 
            and the value of the  parameter (modulo 360 degrees), then starts rotation to .
*/
public void Move(Single){
return null;
}


/*

            Causes the rotator to move the absolute position of  degrees.
            
Calling MoveAbsolute causes the  property to change to the value of the
             parameter, then starts rotation to . 
*/
public void MoveAbsolute(Single){
return null;
}

/*
 Sets 
            Indicates whether the Rotator supports the  method.
            

*/
public void setCanReverse(double _theValue){
this.CanReverse=_theValue;
}

/*
 Gets 
            Indicates whether the Rotator supports the  method.
            

*/
public double getCanReverse(){
return CanReverse;
}

/*
 Sets 
            Indicates whether the rotator is currently moving
            
Rotation is asynchronous, that is, when the Move method is called, it starts the rotation, then returns 
            immediately. During rotation,  must be True, else it must be False.
*/
public void setIsMoving(double _theValue){
this.IsMoving=_theValue;
}

/*
 Gets 
            Indicates whether the rotator is currently moving
            
Rotation is asynchronous, that is, when the Move method is called, it starts the rotation, then returns 
            immediately. During rotation,  must be True, else it must be False.
*/
public double getIsMoving(){
return IsMoving;
}

/*
 Sets 
            Current instantaneous Rotator position, in degrees.
            

            The position is expressed as an angle from 0 up to but not including 360 degrees, counter-clockwise against the 
            sky. This is the standard definition of Position Angle. However, the rotator does not need to (and in general will not) 
            report the true Equatorial Position Angle, as the attached imager may not be precisely aligned with the rotator's indexing. 
            It is up to the client to determine any offset between mechanical rotator position angle and the true Equatorial Position 
            Angle of the imager, and compensate for any difference. 
            The optional  property is provided in order to manage rotators being used on optics with odd or 
            even number of reflections. With the Reverse switch in the correct position for the optics, the reported position angle must 
            be counter-clockwise against the sky.
            
*/
public void setPosition(double _theValue){
this.Position=_theValue;
}

/*
 Gets 
            Current instantaneous Rotator position, in degrees.
            

            The position is expressed as an angle from 0 up to but not including 360 degrees, counter-clockwise against the 
            sky. This is the standard definition of Position Angle. However, the rotator does not need to (and in general will not) 
            report the true Equatorial Position Angle, as the attached imager may not be precisely aligned with the rotator's indexing. 
            It is up to the client to determine any offset between mechanical rotator position angle and the true Equatorial Position 
            Angle of the imager, and compensate for any difference. 
            The optional  property is provided in order to manage rotators being used on optics with odd or 
            even number of reflections. With the Reverse switch in the correct position for the optics, the reported position angle must 
            be counter-clockwise against the sky.
            
*/
public double getPosition(){
return Position;
}

/*
 Sets 
            Sets or Returns the rotator’s Reverse state.
            
See the definition of . Raises an error if not supported. 
*/
public void setReverse(double _theValue){
this.Reverse=_theValue;
}

/*
 Gets 
            Sets or Returns the rotator’s Reverse state.
            
See the definition of . Raises an error if not supported. 
*/
public double getReverse(){
return Reverse;
}

/*
 Sets 
            The minimum StepSize, in degrees.
            

            Raises an exception if the rotator does not intrinsically know what the step size is.
            
*/
public void setStepSize(double _theValue){
this.StepSize=_theValue;
}

/*
 Gets 
            The minimum StepSize, in degrees.
            

            Raises an exception if the rotator does not intrinsically know what the step size is.
            
*/
public double getStepSize(){
return StepSize;
}

/*
 Sets 
            The destination position angle for Move() and MoveAbsolute().
            
Upon calling Move or MoveAbsolute, this property immediately 
            changes to the position angle to which the rotator is moving. The value is retained until a subsequent call 
            to Move or MoveAbsolute.
            
*/
public void setTargetPosition(double _theValue){
this.TargetPosition=_theValue;
}

/*
 Gets 
            The destination position angle for Move() and MoveAbsolute().
            
Upon calling Move or MoveAbsolute, this property immediately 
            changes to the position angle to which the rotator is moving. The value is retained until a subsequent call 
            to Move or MoveAbsolute.
            
*/
public double getTargetPosition(){
return TargetPosition;
}
}
