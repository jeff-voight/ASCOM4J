package ASCOM.Utilities.Interfaces;

/*

 Interface to the .NET Timer component
 


*/
public class ITimer{

/*

 The interval between Tick events when the timer is Enabled in milliseconds, (default = 1000)
 

*/
private double Interval;
/*

 Enable the timer tick events
 

*/
private double Enabled;

/*
 Sets 
 The interval between Tick events when the timer is Enabled in milliseconds, (default = 1000)
 

*/
public void setInterval(double _theValue){
this.Interval=_theValue;
}

/*
 Gets 
 The interval between Tick events when the timer is Enabled in milliseconds, (default = 1000)
 

*/
public double getInterval(){
return Interval;
}

/*
 Sets 
 Enable the timer tick events
 

*/
public void setEnabled(double _theValue){
this.Enabled=_theValue;
}

/*
 Gets 
 Enable the timer tick events
 

*/
public double getEnabled(){
return Enabled;
}
}
