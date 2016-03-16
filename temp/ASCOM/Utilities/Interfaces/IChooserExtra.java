package ASCOM.Utilities.Interfaces;

/*

 Addiitonal methods that are only visible to .NET clients and not to COM clients
 


*/
public class IChooserExtra{



/*

 Select ASCOM driver to use without pre-selecting in the dropdown list
 
No driver will be pre-selected in the Chooser's list when the chooser window is first opened. 
 This overload is not available through COM, please use "Choose(ByVal DriverProgID As String)"
 with an empty string parameter to achieve this effect.
	
*/
public void Choose(){
return null;
}
}
