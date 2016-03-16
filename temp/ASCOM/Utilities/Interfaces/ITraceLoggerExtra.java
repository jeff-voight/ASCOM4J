package ASCOM.Utilities.Interfaces;

/*

 Addiitonal methods that are only visible to .NET clients and not to COM clients
 


*/
public class ITraceLoggerExtra{



/*

 Appends further message to a line started by LogStart, does not terminate the line.
 

		This can be called multiple times to build up a complex log line if required.
		Will create a LOGISSUE message in the log if called before a line has been started with LogStart. 
 Posible reasons for this are exceptions causing the normal flow of code to be bypassed or logic errors.
		This overload is not available through COM, please use 
 "LogContinue(ByVal Message As String, ByVal HexDump As Boolean)"
 with HexDump set False to achieve this effect.
	
*/
public void LogContinue(String){
return null;
}


/*

 Closes a line started by LogStart with the supplied message
 

		Can only be called once for each line started by LogStart.
		Will create a LOGISSUE message in the log if called before a line has been started with LogStart.  
 Posible reasons for this are exceptions causing the normal flow of code to be bypassed or logic errors.
		This overload is not available through COM, please use 
 "LogFinish(ByVal Message As String, ByVal HexDump As Boolean)"
 with HexDump set False to achieve this effect.
	
*/
public void LogFinish(String){
return null;
}


/*

 Logs a complete message in one call
 

		Use this for straightforward logging requrements. Writes all information in one command.
		Will create a LOGISSUE message in the log if called before a line started by LogStart has been closed with LogFinish. 
 Posible reasons for this are exceptions causing the normal flow of code to be bypassed or logic errors.
		This overload is not available through COM, please use 
 "LogMessage(ByVal Identifier As String, ByVal Message As String, ByVal HexDump As Boolean)"
 with HexDump set False to achieve this effect.
	
*/
public void LogMessage(String,String){
return null;
}
}
