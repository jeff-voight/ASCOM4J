package ASCOM.DriverAccess;

/*

            Defines the ISwitchV2 Interface
            


            The Switch interface is used to define a number of 'switch devices'. A switch device can be used to control something, such as a power switch
            or may be used to sense the state of something, such as a limit switch.
            This SwitchV2 interface is an extension of the original Switch interface.  The changes allow devices to have more than two states and
            to distinguish between devices that are writable and those that are read only.
            Compatibility between Switch and SwitchV2 interfaces:
            Switch devices that implemented the original Switch interface and
            client applications that use the original interface will still work together.
            Client applications that implement the original
            Switch interface should still work with drivers that implement the new interface.
            Client applications that use the new features in this interface
            will not work with drivers that do not implement the new interface.
            
            Each device has a CanWrite method, this is true if it can be written to or false if the device can only be read.
            The new MinSwitchValue, MaxSwitchValue and SwitchStep methods are used to define the range and values that a device can handle.
            This also defines the number of different values - states - that a device can have, from two for a traditional on-off switch, through
            those with a small number of states to those which have many states.
            The SetSwitchValue and GetSwitchValue methods are used to set and get the value of a device as a double.
            There is no fundamental difference between devices with different numbers of states.
            Naming Conventions
            Each device handled by a Switch is known as a device or switch device for general cases,
            a controller device if it can alter the state of the device and a sensor device if it can only be read.
            For convenience devices are referred to as Boolean if the device can only have two states, and multi-state if it can have more than two values.
            These are treated the same in the interface definition.
            
*/
public class Switch{

/*

            Return the number of switch devices managed by this driver
            
Must be implemented, must not throw an 
            Devices are numbered from 0 to  - 1
*/
private double MaxSwitch;


/*

            Creates a Switch object with the given Prog ID
            

*/
public void Switch(String){
return null;
}


/*

            Brings up the ASCOM Chooser Dialog to choose a Switch
            

*/
public void Choose(String){
return null;
}


/*

            Return the name of switch device n. This method is mandatory.
            

*/
public void GetSwitchName(Int16){
return null;
}


/*

            Sets a switch device name to a specified value.  If the device name cannot
            be set by the application this must return the  .
            

*/
public void SetSwitchName(Int16,String){
return null;
}


/*

            Gets the description of the specified switch device. This is to allow a fuller description of
            the device to be returned, for example for a tool tip.
            
Must be implemented, must not throw an ASCOM.MethodNotImplementedException
            This method was first introduced in Version 2.
            
*/
public void GetSwitchDescription(Int16){
return null;
}


/*

            Reports if the specified switch device can be written to, default true.
            This is false if the device cannot be written to, for example a limit switch or a sensor.
            

            Must be implemented, must not throw an ASCOM.MethodNotImplementedException
            This method was first introduced in Version 2.
            
*/
public void CanWrite(Int16){
return null;
}


/*

            Return the state of switch device id as a boolean.
            

            Must be implemented, must not throw an ASCOM.MethodNotImplementedException
            All devices must implement this. A multi-state device will return true if the device is at the maximum value, false if the value is at the minumum
            and either true or false as specified by the driver developer for intermediate values.
            
*/
public void GetSwitch(Int16){
return null;
}


/*

            Sets a switch controller device to the specified state
            If the device cannot be set then throws a .
            

            The  will be set to  if state is true and to  if the state is False.
            
*/
public void SetSwitch(Int16,Boolean){
return null;
}


/*

            Returns the maximum value for this switch device, this must be greater than .
            

            Two state devices should return 1.0 as their maximum value.
            This method was first introduced in Version 2.
            
*/
public void MaxSwitchValue(Int16){
return null;
}


/*

            Returns the minimum value for this switch device, this must be less than .
            

            Two state devices should return 0.0 as their minimum value.
            This method was first introduced in Version 2.
            
*/
public void MinSwitchValue(Int16){
return null;
}


/*

            Returns the step size that this device supports. This gives the difference between
            successive values of the device.
            

             must be greater than zero, two state devices should return 1.0.
            The number of states is determined from ( -  ) /  + 1,
            this must be an integer, value 2 for a boolean device and more than 2 for a multi-state device.
            SwitchStep, MinSwitchValue and MaxSwitchValue can be used to determine the way the device is controlled and/or displayed,
            for example by setting the number of decimal places or number of states for a display.
            This method was first introduced in Version 2.
            
*/
public void SwitchStep(Int16){
return null;
}


/*

            Returns the value for switch device id as a double.
            

            This method was first introduced in Version 2.
            
*/
public void GetSwitchValue(Int16){
return null;
}


/*

            Set the value for this device as a double.
            If the switch cannot be set then throws a .
            If the value is not between the  and  then throws an
            .
            

            A value that is intermediate between the values specified by  should be set to an achievable value.
            This method was first introduced in Version 2.
            
*/
public void SetSwitchValue(Int16,Double){
return null;
}

/*
 Sets 
            Return the number of switch devices managed by this driver
            
Must be implemented, must not throw an 
            Devices are numbered from 0 to  - 1
*/
public void setMaxSwitch(double _theValue){
this.MaxSwitch=_theValue;
}

/*
 Gets 
            Return the number of switch devices managed by this driver
            
Must be implemented, must not throw an 
            Devices are numbered from 0 to  - 1
*/
public double getMaxSwitch(){
return MaxSwitch;
}
}
