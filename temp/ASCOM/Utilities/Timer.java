package ASCOM.Utilities;

/*

 Provides a repeating timer with associated tick event.
 


		The interval resolution is about 20ms.If you need beter than this, you could use the WaitForMilliseconds 
 method to create your own solution.
		You can create multiple instances of this object. When enabled, the Timer delivers Tick events periodically 
 (determined by setting the Interval property).
		This component is now considered obsolete for use in .NET clients and drivers. It is reliable under almost 
 all circumstances but there are some environments, noteably console and some scripted applications, where it fails to fire.
 The Platform 6 component improves performance over the Platform 5 component in this respect and can be further tuned 
 for particular applications by placing an entry in the ForceSystemTimer Profile key.
		For .NET applications, use of System.Timers.Timer is recommended but atention must be paid to getting threading correct
 when using this control. The Windows.Forms.Timer control is not an improvement over the ASCOM timer which is based upon it.
		Developers using non .NET languages are advised to use timers provided as part of their development environment, only falling 
 back to the ASCOM Timer if no viable alternative can be found.
	
*/
public class Timer{

/*

 The interval between Tick events when the timer is Enabled in milliseconds, (default = 1000)
 

*/
private double Interval;
/*

 Enable the timer tick events
 

*/
private double Enabled;


/*

 Create a new timer component
 

*/
public void Timer(){
return null;
}


/*

 Disposes of resources used by the profile object - called by IDisposable interface
 

*/
public void Dispose(Boolean){
return null;
}


/*

 Disposes of resources used by the profile object
 

*/
public void Dispose(){
return null;
}


/*

 Timer event handler
 
Raises the Tick event
*/
public void OnTimedEvent(Object,Object){
return null;
}

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
