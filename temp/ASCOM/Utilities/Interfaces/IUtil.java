package ASCOM.Utilities.Interfaces;

/*

 Interface to the .NET Util component
 


*/
public class IUtil{

/*

 Current Platform version in m.n form
 

*/
private double PlatformVersion;
/*

 Change the serial trace file (default C:\SerialTrace.txt)
 
Change this before setting the SerialTrace property to True. 
*/
private double SerialTraceFile;
/*

 Enable/disable serial I/O tracing
 
If you want to change the serial trace file path, change the SerialTraceFile property before setting this to True. 
 After setting this to True, serial trace info will be written to the last-set serial trace file. 
*/
private double SerialTrace;
/*

 The name of the computer's time zone
 
This will be in the local language of the operating system, and will reflect any daylight/summer time that may be in 
 effect. 
*/
private double TimeZoneName;
/*

 UTC offset (hours) for the computer's clock
 
The offset is in hours, such that UTC = local + offset. The offset includes any daylight/summer time that may be 
 in effect.
*/
private double TimeZoneOffset;
/*

 The current UTC Date
 

*/
private double UTCDate;
/*

 Current Julian date
 
This is quantised to the second in the COM component but to a small decimal fraction in the .NET component
*/
private double JulianDate;
/*

 Platform major version number
 

*/
private double MajorVersion;
/*

 Platform minor version number
 

*/
private double MinorVersion;
/*

 Platform service pack number
 

*/
private double ServicePack;
/*

 Platform build number
 

*/
private double BuildNumber;


/*

 Pauses for a given interval in milliseconds.
 
Repeatedly puts the calling Win32 process to sleep, totally freezing it, for 10 milliseconds, 
 then pumps events so the script or program calling it will receive its normal flow of events, until the 
 pause interval elapses. If the pause interval is 20 milliseconds or less, the sleep interval is reduced 
 to 0, causing the calling Win32 process to give up control to the kernel scheduler and then immediately 
 become eligible for scheduling. 
*/
public void WaitForMilliseconds(Int32){
return null;
}


/*

 Convert sexagesimal degrees to binary double-precision degrees
 
The sexagesimal to real conversion methods such as this one are flexible enough to convert just 
 about anything that resembles sexagesimal. Thee way they operate is to first separate the input string 
 into numeric "tokens", strings consisting only of the numerals 0-9, plus and minus, and period. All other 
 characters are considered delimiters. Once the input string is parsed into tokens they are converted to 
 numerics. 
		If there are more than three numeric tokens, only the first three are considered, the remainder 
 are ignored. Left to right positionally, the tokens are assumed to represent units (degrees or hours), 
 minutes, and seconds. If only two tokens are present, they are assumed to be units and minutes, and if 
 only one token is present, it is assumed to be units. Any token can have a fractionsl part. Of course it 
 would not be normal (for example) for both the minutes and seconds parts to have fractional parts, but it 
 would be legal. So 00:30.5:30 would convert to 1.0 unit. 
		Note that plain units, for example 23.128734523 are acceptable to the method. 
	
*/
public void DMSToDegrees(String){
return null;
}


/*

 Convert sexagesimal hours to binary double-precision hours
 

		The sexagesimal to real conversion methods such as this one are flexible enough to convert just about 
 anything that resembles sexagesimal. Thee way they operate is to first separate the input string into 
 numeric "tokens", strings consisting only of the numerals 0-9, plus and minus, and period. All other 
 characters are considered delimiters. Once the input string is parsed into tokens they are converted to 
 numerics. 
		If there are more than three numeric tokens, only the first three are considered, the remainder 
 are ignored. Left to right positionally, the tokens are assumed to represent units (degrees or hours), 
 minutes, and seconds. If only two tokens are present, they are assumed to be units and minutes, and if 
 only one token is present, it is assumed to be units. Any token can have a fractionsl part. 
		Of course it would not be normal (for example) for both the minutes and seconds parts to have 
 fractional parts, but it would be legal. So 00:30.5:30 would convert to 1.0 unit. Note that plain units, 
 for example 23.128734523 are acceptable to the method. 
	
*/
public void HMSToHours(String){
return null;
}


/*

 Convert sexagesimal hours to binary double-precision hours
 

		The sexagesimal to real conversion methods such as this one are flexible enough to convert just about 
 anything that resembles sexagesimal. Thee way they operate is to first separate the input string into 
 numeric "tokens", strings consisting only of the numerals 0-9, plus and minus, and period. All other 
 characters are considered delimiters. Once the input string is parsed into tokens they are converted to 
 numerics. 
		If there are more than three numeric tokens, only the first three are considered, the remainder 
 are ignored. Left to right positionally, the tokens are assumed to represent units (degrees or hours), 
 minutes, and seconds. If only two tokens are present, they are assumed to be units and minutes, and if 
 only one token is present, it is assumed to be units. Any token can have a fractionsl part. 
		Of course it would not be normal (for example) for both the minutes and seconds parts to have 
 fractional parts, but it would be legal. So 00:30.5:30 would convert to 1.0 unit. Note that plain units, 
 for example 23.128734523 are acceptable to the method. 
	
*/
public void HMSToDegrees(String){
return null;
}


/*

  Convert degrees to sexagesimal degrees, minutes and seconds with specified second decimal places
 

		This overload is not available through COM, please use 
 "DegreesToDMS(ByVal Degrees As Double, ByVal DegDelim As String, ByVal MinDelim As String, ByVal SecDelim As String)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToDMS(Double,String,String,String,Int32){
return null;
}


/*

 Convert hours to sexagesimal hours, minutes, and seconds with specified number of second decimal places
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
	
*/
public void HoursToHMS(Double,String,String,String,Int32){
return null;
}


/*

 Convert degrees to sexagesimal degrees and minutes with the specified number of minute decimal places
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
	
*/
public void DegreesToDM(Double,String,String,Int32){
return null;
}


/*

 Convert hours to sexagesimal hours and minutes with supplied number of minute decimal places
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
	
*/
public void HoursToHM(Double,String,String,Int32){
return null;
}


/*

 Convert degrees to sexagesimal hours, minutes, and seconds with the specified number of second decimal places
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters. 
	
*/
public void DegreesToHMS(Double,String,String,String,Int32){
return null;
}


/*

 Convert degrees to sexagesimal hours and minutes with supplied number of minute decimal places
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters
	
*/
public void DegreesToHM(Double,String,String,Int32){
return null;
}


/*

 Convert local-time Date to Julian date
 
Julian dates are always in UTC 
*/
public void DateLocalToJulian(DateTime){
return null;
}


/*

 Convert Julian date to local-time Date
 
Julian dates are always in UTC
*/
public void DateJulianToLocal(Double){
return null;
}


/*

 Convert UTC Date to Julian date
 
Julian dates are always in UTC 
*/
public void DateUTCToJulian(DateTime){
return null;
}


/*

 Convert Julian date to UTC Date
 
Julian dates are always in UTC 
*/
public void DateJulianToUTC(Double){
return null;
}


/*

 Convert UTC Date to local-time Date
 

*/
public void DateUTCToLocal(DateTime){
return null;
}


/*

 Convert local-time Date to UTC Date
 

*/
public void DateLocalToUTC(DateTime){
return null;
}


/*

 Tests whether the current platform version is at least equal to the supplied major and minor 
 version numbers, returns false if this is not the case
 
This function provides a simple way to test for a minimum platform level.
 If for example, your application requires at least platform version 5.5 then you can use 
 code such as this to make a test and display information as appropriate.
 Const Int requiredMajorVersion = 5;
 Const Int requiredMinorVersion = 5; // Requires Platform version 5.5
 Bool isOK = ASCOM.Utilities.IsMinimumRequiredVersion(requiredMajorVersion,
 requiredMinorVersion);
 If (isOK)
 // Do the install (or whatever)
 Else
 // Abort, throw exception, print an error.
 
*/
public void IsMinimumRequiredVersion(Int32,Int32){
return null;
}


/*

 Converts a safearray of strings to a collection that can be used in scripting.
 This is required to do things such as handling the array of names returned by the FilterWheel.Names property.
 This string array won't work in scripting languages.
 

*/
public void ToStringCollection(String[]){
return null;
}


/*

 Converts a safearray of integers to a collection that can be used in scripting languages.
 This is required to handle properties that are returned as safearrays of integers, for  example FilterWheel.FocusOffsets
 SafeArrays don't work in scripting languages.
 

*/
public void ToIntegerCollection(Int32[]){
return null;
}


/*

 Convert an array of .NET built-in types to an equivalent Variant arrray (array of .NET Objects)
 
This function will primarily be of use to Scripting Language programmers who need to convert Camera and Video ImageArrays from their native types to Variant types. If this is not done, 
 the scripting language will throw a type mismatch exception when it receives, for example, Int32 element types instead of the expected Variant types.
 A VBScript Camera usage example is: Image = UTIL.ArrayToVariantArray(CAMERA.ImageArray) This example assumes that the camera and utilities objects have already been created with CreateObject statements.
		The supported .NET types are:
 
				Int16
				Int32
				UInt16
				UInt32
				UInt64
				Byte
				SByte
				Single
				Double
				Boolean
				DateTime
				String
			
		
		The function supports arrays with 1 to 5 dimensions (Rank = 1 to 5). If the supplied array already contains elements of Variant type, it is returned as-is without any processing.
*/
public void ArrayToVariantArray(Object){
return null;
}


/*

 Convert from one set of units to another
 

*/
public void ConvertUnits(Double,ASCOM.Utilities.Units,ASCOM.Utilities.Units){
return null;
}


/*

 Calculate the dew point given the ambient temperature and humidity
 

*/
public void Humidity2DewPoint(Double,Double){
return null;
}


/*

 Calculate the humidity given the ambient temperature and dew point
 

*/
public void DewPoint2Humidity(Double,Double){
return null;
}


/*

 Convert atmospheric pressure from one altitude above mean sea level to another
 

*/
public void ConvertPressure(Double,Double,Double){
return null;
}

/*
 Sets 
 Current Platform version in m.n form
 

*/
public void setPlatformVersion(double _theValue){
this.PlatformVersion=_theValue;
}

/*
 Gets 
 Current Platform version in m.n form
 

*/
public double getPlatformVersion(){
return PlatformVersion;
}

/*
 Sets 
 Change the serial trace file (default C:\SerialTrace.txt)
 
Change this before setting the SerialTrace property to True. 
*/
public void setSerialTraceFile(double _theValue){
this.SerialTraceFile=_theValue;
}

/*
 Gets 
 Change the serial trace file (default C:\SerialTrace.txt)
 
Change this before setting the SerialTrace property to True. 
*/
public double getSerialTraceFile(){
return SerialTraceFile;
}

/*
 Sets 
 Enable/disable serial I/O tracing
 
If you want to change the serial trace file path, change the SerialTraceFile property before setting this to True. 
 After setting this to True, serial trace info will be written to the last-set serial trace file. 
*/
public void setSerialTrace(double _theValue){
this.SerialTrace=_theValue;
}

/*
 Gets 
 Enable/disable serial I/O tracing
 
If you want to change the serial trace file path, change the SerialTraceFile property before setting this to True. 
 After setting this to True, serial trace info will be written to the last-set serial trace file. 
*/
public double getSerialTrace(){
return SerialTrace;
}

/*
 Sets 
 The name of the computer's time zone
 
This will be in the local language of the operating system, and will reflect any daylight/summer time that may be in 
 effect. 
*/
public void setTimeZoneName(double _theValue){
this.TimeZoneName=_theValue;
}

/*
 Gets 
 The name of the computer's time zone
 
This will be in the local language of the operating system, and will reflect any daylight/summer time that may be in 
 effect. 
*/
public double getTimeZoneName(){
return TimeZoneName;
}

/*
 Sets 
 UTC offset (hours) for the computer's clock
 
The offset is in hours, such that UTC = local + offset. The offset includes any daylight/summer time that may be 
 in effect.
*/
public void setTimeZoneOffset(double _theValue){
this.TimeZoneOffset=_theValue;
}

/*
 Gets 
 UTC offset (hours) for the computer's clock
 
The offset is in hours, such that UTC = local + offset. The offset includes any daylight/summer time that may be 
 in effect.
*/
public double getTimeZoneOffset(){
return TimeZoneOffset;
}

/*
 Sets 
 The current UTC Date
 

*/
public void setUTCDate(double _theValue){
this.UTCDate=_theValue;
}

/*
 Gets 
 The current UTC Date
 

*/
public double getUTCDate(){
return UTCDate;
}

/*
 Sets 
 Current Julian date
 
This is quantised to the second in the COM component but to a small decimal fraction in the .NET component
*/
public void setJulianDate(double _theValue){
this.JulianDate=_theValue;
}

/*
 Gets 
 Current Julian date
 
This is quantised to the second in the COM component but to a small decimal fraction in the .NET component
*/
public double getJulianDate(){
return JulianDate;
}

/*
 Sets 
 Platform major version number
 

*/
public void setMajorVersion(double _theValue){
this.MajorVersion=_theValue;
}

/*
 Gets 
 Platform major version number
 

*/
public double getMajorVersion(){
return MajorVersion;
}

/*
 Sets 
 Platform minor version number
 

*/
public void setMinorVersion(double _theValue){
this.MinorVersion=_theValue;
}

/*
 Gets 
 Platform minor version number
 

*/
public double getMinorVersion(){
return MinorVersion;
}

/*
 Sets 
 Platform service pack number
 

*/
public void setServicePack(double _theValue){
this.ServicePack=_theValue;
}

/*
 Gets 
 Platform service pack number
 

*/
public double getServicePack(){
return ServicePack;
}

/*
 Sets 
 Platform build number
 

*/
public void setBuildNumber(double _theValue){
this.BuildNumber=_theValue;
}

/*
 Gets 
 Platform build number
 

*/
public double getBuildNumber(){
return BuildNumber;
}
}
