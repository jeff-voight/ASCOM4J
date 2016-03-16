package ASCOM.DriverAccess;

/*

            Describes a range of rates supported by the MoveAxis() method (degrees/per second)
            These are contained within the AxisRates collection. They serve to describe one or more supported ranges of rates of motion about a mechanical axis. 
            It is possible that the Rate.Maximum and Rate.Minimum properties will be equal. In this case, the Rate object expresses a single discrete rate. 
            Both the Rate.Maximum and Rate.Minimum properties are always expressed in units of degrees per second. 
            


*/
public class _Rate{

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
