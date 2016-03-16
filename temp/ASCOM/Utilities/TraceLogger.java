package ASCOM.Utilities;

/*

 Creates a log file for a driver or application. Uses a similar file name and internal format to the serial logger. Multiple logs can be created simultaneously if needed.
 


		In automatic mode the file will be stored in an ASCOM folder within XP's My Documents folder or equivalent places 
 in other operating systems. Within the ASCOM folder will be a folder named Logs yyyy-mm-dd where yyyy, mm and dd are 
 today's year, month and day numbers. The trace file will appear within the day folder with the name 
 ASCOM.Identifier.hhmm.ssffff where hh, mm, ss and ffff are the current hour, minute, second and fraction of second 
 numbers at the time of file creation.
 
		Within the file the format of each line is hh:mm:ss.fff Identifier Message where hh, mm, ss and fff are the hour, minute, second 
 and fractional second at the time that the message was logged, Identifier is the supplied identifier (usually the subroutine, 
 function, property or method from which the message is sent) and Message is the message to be logged.
	
*/
public class TraceLogger{

/*

 Enables or disables logging to the file.
 
If this property is false then calls to LogMsg, LogStart, LogContinue and LogFinish do nothing. If True, 
 supplied messages are written to the log file.
*/
private double Enabled;
/*

 Return the full filename of the log file being created
 
This call will return an empty string until the first line has been written to the log file
 as the file is not created until required.
*/
private double LogFileName;


/*

 Creates a new TraceLogger instance
 
The LogFileType is used in the file name to allow you to quickly identify which of 
 several logs contains the information of interest.
 This call enables automatic logging and sets the filetype to "Default".
*/
public void TraceLogger(){
return null;
}


/*

 Creates a new TraceLogger instance and initialises filename and type
 
The LogFileType is used in the file name to allow you to quickly identify which of several logs contains the information of interest.
*/
public void TraceLogger(String,String){
return null;
}


/*

 Create and enable a new TraceLogger instance with automatic naming based on the supplied log file type
 
The LogFileType is used in the file name to allow you to quickly identify which of several logs contains the information of interest.
*/
public void TraceLogger(String){
return null;
}


/*

 Disposes of the TraceLogger object
 

*/
public void Dispose(Boolean){
return null;
}


/*

 Disposes of the TraceLogger object
 

*/
public void Dispose(){
return null;
}


/*

 Finalizes the TraceLogger object
 

*/
public void Finalize(){
return null;
}


/*

 Logs an issue, closing any open line and opening a continuation line if necessary after the 
 issue message.
 
Use this for reporting issues that you don't want to appear on a line already opened 
 with StartLine
*/
public void LogIssue(String,String){
return null;
}


/*

 Insert a blank line into the log file
 

*/
public void BlankLine(){
return null;
}


/*

 Logs a complete message in one call, including a hex translation of the message
 

		Use this for straightforward logging requrements. Writes all information in one command.
		Will create a LOGISSUE message in the log if called before a line started by LogStart has been closed with LogFinish. 
 Posible reasons for this are exceptions causing the normal flow of code to be bypassed or logic errors.
	
*/
public void LogMessage(String,String,Boolean){
return null;
}


/*

 Displays a message respecting carriage return and linefeed characters
 

		Will create a LOGISSUE message in the log if called before a line has been started with LogStart.  
 Posible reasons for this are exceptions causing the normal flow of code to be bypassed or logic errors.
	
*/
public void LogMessageCrLf(String,String){
return null;
}


/*

 Writes the time and identifier to the log, leaving the line ready for further content through LogContinue and LogFinish
 
Use this to start a log line where you want to write further information on the line at a later time.
		E.g. You might want to use this to record that an action has started and then append the word OK if all went well.
  You would then end up with just one line to record the whole transaction even though you didn't know that it would be 
 successful when you started. If you just used LogMsg you would have ended up with two log lines, one showing 
 the start of the transaction and the next the outcome.
		Will create a LOGISSUE message in the log if called before a line started by LogStart has been closed with LogFinish. 
 Posible reasons for this are exceptions causing the normal flow of code to be bypassed or logic errors.
	
*/
public void LogStart(String,String){
return null;
}


/*

 Appends further message to a line started by LogStart, appends a hex translation of the message to the line, does not terminate the line.
 

		This can be called multiple times to build up a complex log line if required.
		Will create a LOGISSUE message in the log if called before a line has been started with LogStart. 
 Posible reasons for this are exceptions causing the normal flow of code to be bypassed or logic errors.
	
*/
public void LogContinue(String,Boolean){
return null;
}


/*

 Closes a line started by LogStart with the supplied message and a hex translation of the message
 

		Will create a LOGISSUE message in the log if called before a line has been started with LogStart.  
 Posible reasons for this are exceptions causing the normal flow of code to be bypassed or logic errors.
	
*/
public void LogFinish(String,Boolean){
return null;
}


/*

 Sets the log filename and type if the constructor is called without parameters
 
The LogFileType is used in the file name to allow you to quickly identify which of several logs contains the 
 information of interest.
 Note This command is only required if the tracelogger constructor is called with no
 parameters. It is provided for use in COM clients that can not call constructors with parameters.
 If you are writing a COM client then create the trace logger as:
		
 TL = New TraceLogger()
 TL.SetLogFile("","TraceName")
 
		If you are writing a .NET client then you can achieve the same end in one call:
		
 TL = New TraceLogger("",TraceName")
 
	
*/
public void SetLogFile(String,String){
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
 Sets 
 Enables or disables logging to the file.
 
If this property is false then calls to LogMsg, LogStart, LogContinue and LogFinish do nothing. If True, 
 supplied messages are written to the log file.
*/
public void setEnabled(double _theValue){
this.Enabled=_theValue;
}

/*
 Gets 
 Enables or disables logging to the file.
 
If this property is false then calls to LogMsg, LogStart, LogContinue and LogFinish do nothing. If True, 
 supplied messages are written to the log file.
*/
public double getEnabled(){
return Enabled;
}

/*
 Sets 
 Return the full filename of the log file being created
 
This call will return an empty string until the first line has been written to the log file
 as the file is not created until required.
*/
public void setLogFileName(double _theValue){
this.LogFileName=_theValue;
}

/*
 Gets 
 Return the full filename of the log file being created
 
This call will return an empty string until the first line has been written to the log file
 as the file is not created until required.
*/
public double getLogFileName(){
return LogFileName;
}
}
