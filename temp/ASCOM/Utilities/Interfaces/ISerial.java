package ASCOM.Utilities.Interfaces;

/*

 Interface to the .NET Serial component
 


*/
public class ISerial{

/*

 Returns a list of all available ASCOM serial ports with COMnnn ports sorted into ascending port number order
 
Update in platform 6.0.0.0 This call uses the .NET Framework to retrieve available 
 COM ports and this has been found not to return names of some USB serial adapters. Additional 
 code has been added to attempt to open all COM ports up to COM32. Any ports that can be 
 successfully opened are now returned alongside the ports returned by the .NET call.
 If this new approach still does not detect a COM port it can be forced to appear in the list by adding its name
 as a string entry in the ForceCOMPorts key of the ASCOM Profile. In the event that this scanning causes issues, a COM port can be 
 omitted from the scan by adding its name as a string entry in the IgnoreCOMPorts key of the ASCOM Profile.
*/
private double AvailableComPorts;
/*

 Gets or sets the number of data bits in each byte
 

*/
private double DataBits;
/*

 Gets or sets the state of the DTR line
 

*/
private double DTREnable;
/*

 Gets or sets the type of parity check used over the serial link
 

*/
private double Parity;
/*

 Gets or sets the number of stop bits used on the serial link
 

*/
private double StopBits;
/*

 Gets or sets the type of serial handshake used on the serial line
 
Use of the RTS line can additionally be controlled by the  property.
*/
private double Handshake;
/*

 Gets or sets the connected state of the ASCOM serial port.
 
Set this property to True to connect to the serial (COM) port. You can read the property to determine if the object is connected. 
*/
private double Connected;
/*

 Gets or sets the number of the ASCOM serial port (Default is 1, giving COM1 as the serial port name).
 
This works for serial port names of the form COMnnn. Use PortName if your COM port name does not fit the form COMnnn.
*/
private double Port;
/*

 The maximum time that the ASCOM serial port will wait for incoming receive data (seconds, default = 5)
 
The minimum delay timout that can be set through this command is 1 seconds. Use ReceiveTimeoutMs to set a timeout less than 1 second.
*/
private double ReceiveTimeout;
/*

 The maximum time that the ASCOM serial port will wait for incoming receive data (milliseconds, default = 5000)
 
If a timeout occurs, an IO timeout error is raised. See ReceiveTimeout for an alternate form 
 using the timeout in seconds. 
*/
private double ReceiveTimeoutMs;
/*

 Sets the ASCOM serial port name as a string
 
This property allows any serial port name to be used, even if it doesn't conform to a format of COMnnn
 If the required port name is of the form COMnnn then Serial.Port=nnn and Serial.PortName="COMnnn" are 
 equivalent.
*/
private double PortName;
/*

 Gets and sets the baud rate of the ASCOM serial port
 
This is modelled on the COM component with possible values enumerated in the PortSpeed enum.
*/
private double Speed;
/*

 Gets or sets use of the RTS handshake control line
 
By default the serial component will not drive the RTS line. If RTSEnable is true, the RTS line will be raised before
 characters are sent. Please also see the associated  property.
*/
private double RTSEnable;


/*

 Clears the ASCOM serial port receive and transmit buffers
 

*/
public void ClearBuffers(){
return null;
}


/*

 Transmits a string through the ASCOM serial port
 

*/
public void Transmit(String){
return null;
}


/*

 Transmit an array of binary bytes through the ASCOM serial port 
 

*/
public void TransmitBinary(Byte[]){
return null;
}


/*

 Adds a message to the ASCOM serial trace file
 

		This can be called regardless of whether logging is enabled
	
*/
public void LogMessage(String,String){
return null;
}


/*

 Receive at least one text character from the ASCOM serial port
 
This method reads all of the characters currently in the serial receive buffer. It will not return 
 unless it reads at least one character. A timeout will cause a TimeoutException to be raised. Use this for 
 text data, as it returns a String. 
*/
public void Receive(){
return null;
}


/*

 Receive one binary byte from the ASCOM serial port
 
Use this for 8-bit (binary data). If a timeout occurs, a TimeoutException is raised. 
*/
public void ReceiveByte(){
return null;
}


/*

 Receive exactly the given number of characters from the ASCOM serial port and return as a string
 
If a timeout occurs a TimeoutException is raised.
*/
public void ReceiveCounted(Int32){
return null;
}


/*

 Receive exactly the given number of characters from the ASCOM serial port and return as a byte array
 

		If a timeout occurs, a TimeoutException is raised. 
		This function exists in the COM component but is not documented in the help file.
	
*/
public void ReceiveCountedBinary(Int32){
return null;
}


/*

 Receive characters from the ASCOM serial port until the given terminator string is seen
 
If a timeout occurs, a TimeoutException is raised.
*/
public void ReceiveTerminated(String){
return null;
}


/*

 Receive characters from the ASCOM serial port until the given terminator bytes are seen, return as a byte array
 

		If a timeout occurs, a TimeoutException is raised.
		This function exists in the COM component but is not documented in the help file.
	
*/
public void ReceiveTerminatedBinary(Byte[]){
return null;
}

/*
 Sets 
 Returns a list of all available ASCOM serial ports with COMnnn ports sorted into ascending port number order
 
Update in platform 6.0.0.0 This call uses the .NET Framework to retrieve available 
 COM ports and this has been found not to return names of some USB serial adapters. Additional 
 code has been added to attempt to open all COM ports up to COM32. Any ports that can be 
 successfully opened are now returned alongside the ports returned by the .NET call.
 If this new approach still does not detect a COM port it can be forced to appear in the list by adding its name
 as a string entry in the ForceCOMPorts key of the ASCOM Profile. In the event that this scanning causes issues, a COM port can be 
 omitted from the scan by adding its name as a string entry in the IgnoreCOMPorts key of the ASCOM Profile.
*/
public void setAvailableComPorts(double _theValue){
this.AvailableComPorts=_theValue;
}

/*
 Gets 
 Returns a list of all available ASCOM serial ports with COMnnn ports sorted into ascending port number order
 
Update in platform 6.0.0.0 This call uses the .NET Framework to retrieve available 
 COM ports and this has been found not to return names of some USB serial adapters. Additional 
 code has been added to attempt to open all COM ports up to COM32. Any ports that can be 
 successfully opened are now returned alongside the ports returned by the .NET call.
 If this new approach still does not detect a COM port it can be forced to appear in the list by adding its name
 as a string entry in the ForceCOMPorts key of the ASCOM Profile. In the event that this scanning causes issues, a COM port can be 
 omitted from the scan by adding its name as a string entry in the IgnoreCOMPorts key of the ASCOM Profile.
*/
public double getAvailableComPorts(){
return AvailableComPorts;
}

/*
 Sets 
 Gets or sets the number of data bits in each byte
 

*/
public void setDataBits(double _theValue){
this.DataBits=_theValue;
}

/*
 Gets 
 Gets or sets the number of data bits in each byte
 

*/
public double getDataBits(){
return DataBits;
}

/*
 Sets 
 Gets or sets the state of the DTR line
 

*/
public void setDTREnable(double _theValue){
this.DTREnable=_theValue;
}

/*
 Gets 
 Gets or sets the state of the DTR line
 

*/
public double getDTREnable(){
return DTREnable;
}

/*
 Sets 
 Gets or sets the type of parity check used over the serial link
 

*/
public void setParity(double _theValue){
this.Parity=_theValue;
}

/*
 Gets 
 Gets or sets the type of parity check used over the serial link
 

*/
public double getParity(){
return Parity;
}

/*
 Sets 
 Gets or sets the number of stop bits used on the serial link
 

*/
public void setStopBits(double _theValue){
this.StopBits=_theValue;
}

/*
 Gets 
 Gets or sets the number of stop bits used on the serial link
 

*/
public double getStopBits(){
return StopBits;
}

/*
 Sets 
 Gets or sets the type of serial handshake used on the serial line
 
Use of the RTS line can additionally be controlled by the  property.
*/
public void setHandshake(double _theValue){
this.Handshake=_theValue;
}

/*
 Gets 
 Gets or sets the type of serial handshake used on the serial line
 
Use of the RTS line can additionally be controlled by the  property.
*/
public double getHandshake(){
return Handshake;
}

/*
 Sets 
 Gets or sets the connected state of the ASCOM serial port.
 
Set this property to True to connect to the serial (COM) port. You can read the property to determine if the object is connected. 
*/
public void setConnected(double _theValue){
this.Connected=_theValue;
}

/*
 Gets 
 Gets or sets the connected state of the ASCOM serial port.
 
Set this property to True to connect to the serial (COM) port. You can read the property to determine if the object is connected. 
*/
public double getConnected(){
return Connected;
}

/*
 Sets 
 Gets or sets the number of the ASCOM serial port (Default is 1, giving COM1 as the serial port name).
 
This works for serial port names of the form COMnnn. Use PortName if your COM port name does not fit the form COMnnn.
*/
public void setPort(double _theValue){
this.Port=_theValue;
}

/*
 Gets 
 Gets or sets the number of the ASCOM serial port (Default is 1, giving COM1 as the serial port name).
 
This works for serial port names of the form COMnnn. Use PortName if your COM port name does not fit the form COMnnn.
*/
public double getPort(){
return Port;
}

/*
 Sets 
 The maximum time that the ASCOM serial port will wait for incoming receive data (seconds, default = 5)
 
The minimum delay timout that can be set through this command is 1 seconds. Use ReceiveTimeoutMs to set a timeout less than 1 second.
*/
public void setReceiveTimeout(double _theValue){
this.ReceiveTimeout=_theValue;
}

/*
 Gets 
 The maximum time that the ASCOM serial port will wait for incoming receive data (seconds, default = 5)
 
The minimum delay timout that can be set through this command is 1 seconds. Use ReceiveTimeoutMs to set a timeout less than 1 second.
*/
public double getReceiveTimeout(){
return ReceiveTimeout;
}

/*
 Sets 
 The maximum time that the ASCOM serial port will wait for incoming receive data (milliseconds, default = 5000)
 
If a timeout occurs, an IO timeout error is raised. See ReceiveTimeout for an alternate form 
 using the timeout in seconds. 
*/
public void setReceiveTimeoutMs(double _theValue){
this.ReceiveTimeoutMs=_theValue;
}

/*
 Gets 
 The maximum time that the ASCOM serial port will wait for incoming receive data (milliseconds, default = 5000)
 
If a timeout occurs, an IO timeout error is raised. See ReceiveTimeout for an alternate form 
 using the timeout in seconds. 
*/
public double getReceiveTimeoutMs(){
return ReceiveTimeoutMs;
}

/*
 Sets 
 Sets the ASCOM serial port name as a string
 
This property allows any serial port name to be used, even if it doesn't conform to a format of COMnnn
 If the required port name is of the form COMnnn then Serial.Port=nnn and Serial.PortName="COMnnn" are 
 equivalent.
*/
public void setPortName(double _theValue){
this.PortName=_theValue;
}

/*
 Gets 
 Sets the ASCOM serial port name as a string
 
This property allows any serial port name to be used, even if it doesn't conform to a format of COMnnn
 If the required port name is of the form COMnnn then Serial.Port=nnn and Serial.PortName="COMnnn" are 
 equivalent.
*/
public double getPortName(){
return PortName;
}

/*
 Sets 
 Gets and sets the baud rate of the ASCOM serial port
 
This is modelled on the COM component with possible values enumerated in the PortSpeed enum.
*/
public void setSpeed(double _theValue){
this.Speed=_theValue;
}

/*
 Gets 
 Gets and sets the baud rate of the ASCOM serial port
 
This is modelled on the COM component with possible values enumerated in the PortSpeed enum.
*/
public double getSpeed(){
return Speed;
}

/*
 Sets 
 Gets or sets use of the RTS handshake control line
 
By default the serial component will not drive the RTS line. If RTSEnable is true, the RTS line will be raised before
 characters are sent. Please also see the associated  property.
*/
public void setRTSEnable(double _theValue){
this.RTSEnable=_theValue;
}

/*
 Gets 
 Gets or sets use of the RTS handshake control line
 
By default the serial component will not drive the RTS line. If RTSEnable is true, the RTS line will be raised before
 characters are sent. Please also see the associated  property.
*/
public double getRTSEnable(){
return RTSEnable;
}
}
