package ASCOM.DeviceInterface;

/*

 Describes a range of rates supported by the  method (degrees/per second)
 These are contained within an  collection and serve to describe one or more supported ranges of rates of motion about a mechanical axis. 
 It is possible that the  and  properties will be equal. In this case, the  object expresses a single discrete rate. 
 Both the   and   properties are always expressed in units of degrees per second.
 This is only using for Telescope InterfaceVersions 2 and 3
 

Values used must be non-negative and are scalar values. You do not need to supply complementary negative rates for each positive 
 rate that you specify. Movement in both directions is achieved by the application applying an appropriate positive or negative sign to the 
 rate when it is used in the  command.
*/
public class IRate{

/*

 The maximum rate (degrees per second)
 This must always be a positive number. It indicates the maximum rate in either direction about the axis. 
 

*/
private double Maximum;
/*

 The minimum rate (degrees per second)
 This must always be a positive number. It indicates the maximum rate in either direction about the axis. 
 

*/
private double Minimum;


/*

 Dispose the late-bound interface, if needed. Will release it via COM
 if it is a COM object, else if native .NET will just dereference it
 for GC.
 

*/
public void Dispose(){
return null;
}

/*
 Sets 
 The maximum rate (degrees per second)
 This must always be a positive number. It indicates the maximum rate in either direction about the axis. 
 

*/
public void setMaximum(double _theValue){
this.Maximum=_theValue;
}

/*
 Gets 
 The maximum rate (degrees per second)
 This must always be a positive number. It indicates the maximum rate in either direction about the axis. 
 

*/
public double getMaximum(){
return Maximum;
}

/*
 Sets 
 The minimum rate (degrees per second)
 This must always be a positive number. It indicates the maximum rate in either direction about the axis. 
 

*/
public void setMinimum(double _theValue){
this.Minimum=_theValue;
}

/*
 Gets 
 The minimum rate (degrees per second)
 This must always be a positive number. It indicates the maximum rate in either direction about the axis. 
 

*/
public double getMinimum(){
return Minimum;
}
}
