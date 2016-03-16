package ASCOM.DriverAccess;

/*

            Provides universal access to SafetyMonitor drivers
            


*/
public class SafetyMonitor{

/*

            Indicates whether the monitored state is safe for use.
            

*/
private double IsSafe;


/*

            Creates a SafetyMonitor object with the given Prog ID
            

*/
public void SafetyMonitor(String){
return null;
}


/*

            Brings up the ASCOM Chooser Dialog to choose a SafetyMonitor
            

*/
public void Choose(String){
return null;
}

/*
 Sets 
            Indicates whether the monitored state is safe for use.
            

*/
public void setIsSafe(double _theValue){
this.IsSafe=_theValue;
}

/*
 Gets 
            Indicates whether the monitored state is safe for use.
            

*/
public double getIsSafe(){
return IsSafe;
}
}
