package ASCOM.Utilities.Interfaces;

/*

 Addiitonal methods that are only visible to .NET clients and not to COM clients
 


*/
public class IUtilExtra{



/*

 Convert degrees to sexagesimal degrees, minutes and seconds with default delimiters DD° MM' SS" 
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single 
 characters.
		This overload is not available through COM, please use "Choose(ByVal DriverProgID As String)"
 with an empty string parameter to achieve this effect.
	
*/
public void DegreesToDMS(Double){
return null;
}


/*

  Convert degrees to sexagesimal degrees, minutes and seconds with with default minute and second delimiters MM' SS" 
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single 
 characters.
		This overload is not available through COM, please use 
 "DegreesToDMS(ByVal Degrees As Double, ByVal DegDelim As String, ByVal MinDelim As String, ByVal SecDelim As String)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToDMS(Double,String){
return null;
}


/*

  Convert degrees to sexagesimal degrees, minutes and seconds with default second delimiter SS" 
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single 
 characters.
		This overload is not available through COM, please use 
 "DegreesToDMS(ByVal Degrees As Double, ByVal DegDelim As String, ByVal MinDelim As String, ByVal SecDelim As String)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToDMS(Double,String,String){
return null;
}


/*

  Convert degrees to sexagesimal degrees, minutes and seconds
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single 
 characters.
		This overload is not available through COM, please use 
 "DegreesToDMS(ByVal Degrees As Double, ByVal DegDelim As String, ByVal MinDelim As String, ByVal SecDelim As String)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToDMS(Double,String,String,String){
return null;
}


/*

 Convert hours to sexagesimal hours, minutes, and seconds with default delimiters HH:MM:SS
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "HoursToHMS(ByVal Hours As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal SecDelim As String, ByVal SecDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void HoursToHMS(Double){
return null;
}


/*

 Convert hours to sexagesimal hours, minutes, and seconds with default minutes and seconds delimters MM:SS
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "HoursToHMS(ByVal Hours As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal SecDelim As String, ByVal SecDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void HoursToHMS(Double,String){
return null;
}


/*

 Convert hours to sexagesimal hours, minutes, and seconds with default second delimiter of null string
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "HoursToHMS(ByVal Hours As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal SecDelim As String, ByVal SecDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void HoursToHMS(Double,String,String){
return null;
}


/*

 Convert hours to sexagesimal hours, minutes, and seconds
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "HoursToHMS(ByVal Hours As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal SecDelim As String, ByVal SecDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void HoursToHMS(Double,String,String,String){
return null;
}


/*

 Convert degrees to sexagesimal degrees and minutes with default delimiters DD° MM'
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "DegreesToDM(ByVal Degrees As Double, ByVal DegDelim As String, ByVal MinDelim As String, ByVal MinDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToDM(Double){
return null;
}


/*

 Convert degrees to sexagesimal degrees and minutes with the default minutes delimeter MM'
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "DegreesToDM(ByVal Degrees As Double, ByVal DegDelim As String, ByVal MinDelim As String, ByVal MinDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToDM(Double,String){
return null;
}


/*

 Convert degrees to sexagesimal degrees and minutes
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "DegreesToDM(ByVal Degrees As Double, ByVal DegDelim As String, ByVal MinDelim As String, ByVal MinDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToDM(Double,String,String){
return null;
}


/*

 Convert hours to sexagesimal hours and minutes with default delimiters HH:MM
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "HoursToHM(ByVal Hours As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal MinDecimalDigits As Integer)"
 with an suitable parameters to achieve this effect.
	
*/
public void HoursToHM(Double){
return null;
}


/*

 Convert hours to sexagesimal hours and minutes with default minutes delimiter MM (null string)
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "HoursToHM(ByVal Hours As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal MinDecimalDigits As Integer)"
 with an suitable parameters to achieve this effect.
	
*/
public void HoursToHM(Double,String){
return null;
}


/*

 Convert hours to sexagesimal hours and minutes
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters.
		This overload is not available through COM, please use 
 "HoursToHM(ByVal Hours As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal MinDecimalDigits As Integer)"
 with an suitable parameters to achieve this effect.
	
*/
public void HoursToHM(Double,String,String){
return null;
}


/*

 Convert degrees to sexagesimal hours, minutes, and seconds with default delimters of HH:MM:SS
 

		If you need a leading plus sign, you must prepend it yourself.
		This overload is not available through COM, please use 
 "DegreesToHMS(ByVal Degrees As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal SecDelim As String, ByVal SecDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToHMS(Double){
return null;
}


/*

 Convert degrees to sexagesimal hours, minutes, and seconds with the default second and minute delimiters of MM:SS
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters. 
		This overload is not available through COM, please use 
 "DegreesToHMS(ByVal Degrees As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal SecDelim As String, ByVal SecDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToHMS(Double,String){
return null;
}


/*

 Convert degrees to sexagesimal hours, minutes, and seconds with the default second delimiter SS (null string)
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters. 
		This overload is not available through COM, please use 
 "DegreesToHMS(ByVal Degrees As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal SecDelim As String, ByVal SecDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToHMS(Double,String,String){
return null;
}


/*

 Convert degrees to sexagesimal hours, minutes, and seconds
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters. 
		This overload is not available through COM, please use 
 "DegreesToHMS(ByVal Degrees As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal SecDelim As String, ByVal SecDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToHMS(Double,String,String,String){
return null;
}


/*

 Convert degrees to sexagesimal hours and minutes with default delimiters HH:MM
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters
		This overload is not available through COM, please use 
 "DegreesToHM(ByVal Degrees As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal MinDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToHM(Double){
return null;
}


/*

 Convert degrees to sexagesimal hours and minutes with default minute delimiter MM (null string)
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters
		This overload is not available through COM, please use 
 "DegreesToHM(ByVal Degrees As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal MinDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToHM(Double,String){
return null;
}


/*

 Convert degrees to sexagesimal hours and minutes
 

		If you need a leading plus sign, you must prepend it yourself. The delimiters are not restricted to single characters
		This overload is not available through COM, please use 
 "DegreesToHM(ByVal Degrees As Double, ByVal HrsDelim As String, ByVal MinDelim As String, ByVal MinDecimalDigits As Integer)"
 with suitable parameters to achieve this effect.
	
*/
public void DegreesToHM(Double,String,String){
return null;
}
}
