package TiGra;

/*

            The Diagnostics class provides a few helper methods that make it easier to produce coherent
            debugging output. The class is implemented as a singleton that is created as soon as the assembly
            is loaded. The level of trace output that is produced is controlled by a 
            that in turn loads its configuration from the App.config file. If there is no App.Config file,
            the default is to produce verbose output for debug builds and errors/warnings for release builds.
            
            We recommend SysInternals DbgView for viewing and capturing the trace output.
            See http://www.sysinternals.com
            
            


*/
public class Diagnostics{



/*

            Construct and initialise diagnostics.
            

*/
public void Diagnostics(){
return null;
}


/*

            Gets a reference to the one and only instance of this singleton class.
            

*/
public void GetInstance(){
return null;
}


/*

            Send an object to the trace channel at severity level Error.
            

*/
public void TraceError(Object){
return null;
}


/*

            Format and send a list of objects to the trace channel at severity level Error.
            

*/
public void TraceError(String,Object[]){
return null;
}


/*

            Send an object to the trace channel at severity level Warning.
            

*/
public void TraceWarning(Object){
return null;
}


/*

            Format and send a list of objects to the trace channel at severity level Warning.
            

*/
public void TraceWarning(String,Object[]){
return null;
}


/*

            Send an object to the trace channel at severity level Information.
            

*/
public void TraceInfo(Object){
return null;
}


/*

            Format and send a list of objects to the trace channel at severity level Information.
            

*/
public void TraceInfo(String,Object[]){
return null;
}


/*

            Send an object to the trace channel at severity level Verbose Information.
            

*/
public void TraceVerbose(Object){
return null;
}


/*

            Format and send a list of objects to the trace channel at severity level Verbose Information.
            

*/
public void TraceVerbose(String,Object[]){
return null;
}
}
