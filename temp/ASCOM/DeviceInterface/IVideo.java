package ASCOM.DeviceInterface;

/*

 Defines the IVideo Interface.
 


*/
public class IVideo{

/*

 Set True to connect to the device hardware. Set False to disconnect from the device hardware.
 You can also read the property to check whether it is connected. This reports the current hardware state.
 

		Must be implementedDo not use a NotConnectedException here, that exception is for use in other methods that require a connection in order to succeed.
 The Connected property sets and reports the state of connection to the device hardware.
 For a hub this means that Connected will be true when the first driver connects and will only be set to false
 when all drivers have disconnected.  A second driver may find that Connected is already true and
 setting Connected to false does not report Connected as false.  This is not an error because the physical state is that the
 hardware connection is still true.
		Multiple calls setting Connected to true or false will not cause an error.
	
*/
private double Connected;
/*

 Returns a description of the device, such as manufacturer and model number. Any ASCII characters may be used. 
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
private double Description;
/*

 Descriptive and version information about this ASCOM driver.
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException. This string may contain line endings and may be hundreds to thousands of characters long.
 It is intended to display detailed information on the ASCOM driver, including version and copyright data.
 See the  property for information on the device itself.
 To get the driver version in a parseable string, use the  property.
 
*/
private double DriverInfo;
/*

 A string containing only the major and minor version of the driver.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException. This must be in the form "n.n".
 It should not to be confused with the  property, which is the version of this specification supported by the 
 driver.
 
*/
private double DriverVersion;
/*

 The interface version number that this device supports. Should return 1 for this interface version.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
private double InterfaceVersion;
/*

 The short name of the driver, for display purposes.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
private double Name;
/*

 Returns the list of action names supported by this driver.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException. This method must return an empty arraylist if no actions are supported.
 This is an aid to client authors and testers who would otherwise have to repeatedly poll the driver to determine its capabilities. 
 Returned action names may be in mixed case to enhance presentation but  will be recognised case insensitively in 
 the Action method.
		An array list collection has been selected as the vehicle for  action names in order to make it easier for clients to
 determine whether a particular action is supported. This is easily done through the Contains method. Since the
 collection is also ennumerable it is easy to use constructs such as For Each ... to operate on members without having to be concerned 
 about hom many members are in the collection. 
		Collections have been used in the Telescope specification for a number of years and are known to be compatible with COM. Within .NET
 the ArrayList is the correct implementation to use as the .NET Generic methods are not compatible with COM.
	
*/
private double SupportedActions;
/*

 The name of the video capture device when such a device is used.
 
For analogue video this is usually the video capture card or dongle attached to the computer.
 
*/
private double VideoCaptureDeviceName;
/*

 The maximum supported exposure (integration time) in seconds.
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
 This value is for information purposes only. The exposure cannot be set directly in seconds, use  property to change the exposure. 
 
*/
private double ExposureMax;
/*

 The minimum supported exposure (integration time) in seconds.
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
 This value is for information purposes only. The exposure cannot be set directly in seconds, use  property to change the exposure. 
 
*/
private double ExposureMin;
/*

 The frame rate at which the camera is running. 
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
 Analogue cameras run in one of the two fixed frame rates - 25fps for PAL video and 29.97fps for NTSC video. 
 Digital cameras usually can run at a variable frame rate. This value is for information purposes only and cannot be set. The FrameRate has the same value during the entire operation of the device. 
 Changing the  property may change the actual variable frame rate but cannot changethe return value of this property.
 
*/
private double FrameRate;
/*

 Returns the list of integration rates supported by the video camera.
 

 Digital and integrating analogue video cameras allow the effective exposure of a frame to be changed. If the camera supports setting the exposure directly i.e. 2.153 sec then the driver must only
 return a range of useful supported exposures. For many video cameras the supported exposures (integration rates) increase by a factor of 2 from a base exposure e.g. 1, 2, 4, 8, 16 sec or 0.04, 0.08, 0.16, 0.32, 0.64, 1.28, 2.56, 5.12, 10.24 sec.
 If the camers supports only one exposure that cannot be changed (such as all non integrating PAL or NTSC video cameras) then this property must throw .
 
*/
private double SupportedIntegrationRates;
/*

	Index into the  array for the selected camera integration rate.
	

		 can be used to adjust the integration rate (exposure) of the camera, if supported. A 0-based array of strings - , 
 which correspond to different discrete integration rate settings supported by the camera will be returned.  must be set to an integer in this range.
	The driver must default  to a valid value when integration rate is supported by the camera. 
	
*/
private double IntegrationRate;
/*

 Returns an  with its  property populated. 
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
private double LastVideoFrame;
/*

 Sensor name.
 
Returns the name (datasheet part number) of the sensor, e.g. ICX285AL.  The format is to be exactly as shown on 
	manufacturer data sheet, subject to the following rules. All letter shall be uppercase.  Spaces shall not be included.
	Any extra suffixes that define region codes, package types, temperature range, coatings, grading, color/monochrome, 
	etc. shall not be included. For color sensors, if a suffix differentiates different Bayer matrix encodings, it shall be 
	included.
		Examples:
		
			ICX285AL-F shall be reported as ICX285
			KAF-8300-AXC-CD-AA shall be reported as KAF-8300
		
		Note:
		The most common usage of this property is to select approximate color balance parameters to be applied to 
	the Bayer matrix of one-shot color sensors.  Application authors should assume that an appropriate IR cutoff filter is 
	in place for color sensors.
		It is recommended that this function be called only after a connection is established with 
	the camera hardware, to ensure that the driver is aware of the capabilities of the specific camera model.
	
*/
private double SensorName;
/*

Type of colour information returned by the the camera sensor.


		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
		 returns a value indicating whether the sensor is monochrome, or what Bayer matrix it encodes.  
The following values are defined:
		
			
				
				
				
				
					
						Value
					
						Enumeration
					
						Meaning
				
				
					
0
					
Monochrome
					
Camera produces monochrome array with no Bayer encoding
				
				
					
1
					
Colour
					
Camera produces color image directly, requiring not Bayer decoding. The monochome pixels for the R, G and B channels are returned in this order in the .
				
				
					
2
					
RGGB
					
Camera produces RGGB encoded Bayer array images
				
				
					
3
					
CMYG
					
Camera produces CMYG encoded Bayer array images
				
				
					
4
					
CMYG2
					
Camera produces CMYG2 encoded Bayer array images
				
				
					
5
					
LRGB
					
Camera produces Kodak TRUESENSE Bayer LRGB array images
				
			
		
		Please note that additional values may be defined in future updates of the standard, as new Bayer matrices may be created 
by sensor manufacturers in the future.  If this occurs, then a new enumeration value shall be defined. The pre-existing enumeration 
values shall not change.
In the following definitions, R = red, G = green, B = blue, C = cyan, M = magenta, Y = yellow.  The Bayer matrix is 
defined with X increasing from left to right, and Y increasing from top to bottom. The pattern repeats every N x M pixels for the 
entire pixel array, where N is the height of the Bayer matrix, and M is the width.
			RGGB indicates the following matrix:
		
		
			
				
				
				
				
					
					
					
						X = 0
					
						X = 1
				
				
					
						Y = 0
					
R
					
G
				
				
					
						Y = 1
					
G
					
B
				
			
		
		CMYG indicates the following matrix:
		
			
				
				
				
				
					
					
					
						X = 0
					
						X = 1
				
				
					
						Y = 0
					
Y
					
C
				
				
					
						Y = 1
					
G
					
M
				
			
		
		CMYG2 indicates the following matrix:
		
			
				
				
				
				
					
					
					
						X = 0
					
						X = 1
				
				
					
						Y = 0
					
C
					
Y
				
				
					
						Y = 1
					
M
					
G
				
				
					
						Y = 2
					
C
					
Y
				
				
					
						Y = 3
					
G
					
M
				
			
		
		LRGB indicates the following matrix (Kodak TRUESENSE):
		
			
				
				
				
				
				
				
					
					
					
						X = 0
					
						X = 1
					
						X = 2
					
						X = 3
				
				
					
						Y = 0
					
L
					
R
					
L
					
G
				
				
					
						Y = 1
					
R
					
L
					
G
					
L
				
				
					
						Y = 2
					
L
					
G
					
L
					
B
				
				
					
						Y = 3
					
G
					
L
					
B
					
L
				
			
		
		It is recommended that this function be called only after a connection is established with the camera hardware, to ensure that 
the driver is aware of the capabilities of the specific camera model.
	
*/
private double SensorType;
/*

	Returns the width of the video frame in pixels.
	

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
 For analogue video cameras working via a frame grabber the dimensions of the video frames may be different than the dimension of the CCD chip
 
*/
private double Width;
/*

	Returns the height of the video frame in pixels.
	

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
 For analogue video cameras working via a frame grabber the dimensions of the video frames may be different than the dimension of the CCD chip
 
*/
private double Height;
/*

	Returns the width of the CCD chip pixels in microns.
	

*/
private double PixelSizeX;
/*

	Returns the height of the CCD chip pixels in microns.
	

*/
private double PixelSizeY;
/*

	Reports the bit depth the camera can produce.
	

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
private double BitDepth;
/*

 Returns the video codec used to record the video file.
 
For AVI files this is usually the FourCC identifier of the codec- e.g. XVID, DVSD, YUY2, HFYU etc. 
 If the recorded video file doesn't use codecs an empty string must be returned.
 
*/
private double VideoCodec;
/*

 Returns the file format of the recorded video file, e.g. AVI, MPEG, ADV etc.
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
private double VideoFileFormat;
/*

	The size of the video frame buffer. 
	
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException. When retrieving video frames using the  property 
 the driver may use a buffer to queue the frames waiting to be read by the client. This property returns the size of the buffer in frames or 
 if no buffering is supported then the value of less than 2 should be returned. The size of the buffer can be controlled by the end user from the driver setup dialog. 
	
*/
private double VideoFramesBufferSize;
/*

	Returns the current camera operational state.
	

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	Returns one of the following status information:
	
			Value  State           Meaning
			0      CameraRunning	  The camera is running and video frames are available for viewing and recording
			1      CameraRecording The camera is running and recording a video
			2      CameraError     Camera error condition serious enough to prevent further operations (connection fail, etc.).
		
		CameraIdle and CameraBusy are optional states. Free running cameras cannot be stopped and don't have a CameraIdle state. When those cameras are powered they immediately enter CameraRunning state. 
 Some digital cameras or vdeo systems may suport operations that take longer to complete. Whlie those longer operations are running the camera will remain in the state it was before the operation started.
		The video camera state diagram is shown below: 
		
			
	
*/
private double CameraState;
/*

	Maximum value of .
	
When specifying the gain setting with an integer value,  is used in conjunction with  to 
	specify the range of valid settings.
	 shall be greater than . If either is available, then both must be available.
		Please see  for more information.
		It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
	that the driver is aware of the capabilities of the specific camera model.
	
*/
private double GainMax;
/*

	Minimum value of .
	
When specifying the gain setting with an integer value,  is used in conjunction with  to 
	specify the range of valid settings.
	 shall be greater than . If either is available, then both must be available.
		Please see  for more information.
		It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
	that the driver is aware of the capabilities of the specific camera model.
	
*/
private double GainMin;
/*

	Index into the  array for the selected camera gain.
	

		 can be used to adjust the gain setting of the camera, if supported. There are two typical usage scenarios:
	
			Discrete gain video cameras will return a 0-based array of strings - , which correspond to different discrete gain settings supported by the camera.  must be set to an integer in this range.  and  must thrown an exception if 
	this mode is used.
			Adjustable gain video cameras -  and  return integers, which specify the valid range for .
		
		The driver must default  to a valid value. 
	
*/
private double Gain;
/*

 Gains supported by the camera.
	
 provides a 0-based array of available gain settings.
	Typically the application software will display the available gain settings in a drop list. The application will then supply 
	the selected index to the driver via the  property. 
	The  setting may alternatively be specified using integer values; if this mode is used then  is invalid 
	and must throw an exception. Please see  and  for more information.
		It is recommended that this function be called only after a connection is established with the camera hardware, 
	to ensure that the driver is aware of the capabilities of the specific camera model.
	
*/
private double Gains;
/*

	Maximum value of .
	
When specifying the gamma setting with an integer value,  is used in conjunction with  to 
	specify the range of valid settings.
	 shall be greater than . If either is available, then both must be available.
		Please see  for more information.
		It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
	that the driver is aware of the capabilities of the specific camera model.
	
*/
private double GammaMax;
/*

	Minimum value of .
	
When specifying the gamma setting with an integer value,  is used in conjunction with  to 
	specify the range of valid settings.
	 shall be greater than . If either is available, then both must be available.
		Please see  for more information.
		It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
	that the driver is aware of the capabilities of the specific camera model.
	
*/
private double GammaMin;
/*

	Index into the  array for the selected camera gamma.
	

		 can be used to adjust the gamma setting of the camera, if supported. There are two typical usage scenarios:
	
			Discrete gamma video cameras will return a 0-based array of strings - , which correspond to different discrete gamma settings supported by the camera.  must be set to an integer in this range.  and  must thrown an exception if 
	this mode is used.
			Adjustable gain video cameras -  and  return integers, which specify the valid range for .
		
		The driver must default  to a valid value. 
	
*/
private double Gamma;
/*

 Gammas supported by the camera.
	
 provides a 0-based array of available gamma settings. This list can contain the widely used values of OFF, LO and HI that correspond to gammas of 1.00, 0.45 and 0.35 as well as other extended values.
	Typically the application software will display the available gamma settings in a drop list. The application will then supply 
	the selected index to the driver via the  property. 
	The  setting may alternatively be specified using integer values; if this mode is used then  is invalid 
	and must throw an exception. Please see  and  for more information.
		It is recommended that this function be called only after a connection is established with the camera hardware, 
	to ensure that the driver is aware of the capabilities of the specific camera model.
	
*/
private double Gammas;
/*

 Returns True if the driver supports custom device properties configuration via the  method.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
private double CanConfigureDeviceProperties;


/*

 Invokes the specified device-specific action.
 
May throw a MethodNotImplementedException if the device does not support any actions. 
 This method is intended for use in all current and future device types and to avoid name clashes, management of action names 
 is important from day 1. A two-part naming convention will be adopted - DeviceType:UniqueActionName where:
 
			DeviceType is the same value as would be used by  e.g. Telescope, Camera, Switch etc.
			UniqueActionName is a single word, or multiple words joined by underscore characters, that sensibly describes the action to be performed.
		
		
 It is recommended that UniqueActionNames should be a maximum of 16 characters for legibility.
 Should the same function and UniqueActionName be supported by more than one type of device, the reserved DeviceType of 
 "General" will be used. Action names will be case insensitive, so FilterWheel:SelectWheel, filterwheel:selectwheel 
 and FILTERWHEEL:SELECTWHEEL will all refer to the same action.
		The names of all supported actions must be returned in the  property.
	
*/
public void Action(String,String){
return null;
}


/*

 Dispose the late-bound interface, if needed. Will release it via COM
 if it is a COM object, else if native .NET will just dereference it
 for GC.
 

*/
public void Dispose(){
return null;
}


/*

 Launches a configuration dialog box for the driver.  The call will not return
 until the user clicks OK or cancel manually.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
public void SetupDialog(){
return null;
}


/*

 Starts recording a new video file.
 

*/
public void StartRecordingVideoFile(String){
return null;
}


/*

 Stops the recording of a video file.
 

*/
public void StopRecordingVideoFile(){
return null;
}


/*

 Displays a device properties configuration dialog that allows the configuration of specialized settings.
 

		The dialog could also provide buttons for cameras that can be controlled via 'on screen display' menues and a set of navigation buttons such as Up, Down, Left, Right and Enter. 
 This dialog is not intended to be used in unattended mode but can give greater control over video cameras that provide special features. The dialog may also allow 
 changing standard  interface settings such as Gamma and Gain. If a client software 
 displays any  interface settings then it should take care to keep in sync the values changed by this method and those changed directly via the interface.
		To support automated and unattended control over the specialized device settings or functions available on this dialog the driver should also allow their control via . 
 This dialog is meant to be used by the applications to allow the user to adjust specialized device settings when those applications don't specifically use the specialized settings in their functionality.
		Examples for specialized settings that could be supported are white balance and sharpness.
	
*/
public void ConfigureDeviceProperties(){
return null;
}

/*
 Sets 
 Set True to connect to the device hardware. Set False to disconnect from the device hardware.
 You can also read the property to check whether it is connected. This reports the current hardware state.
 

		Must be implementedDo not use a NotConnectedException here, that exception is for use in other methods that require a connection in order to succeed.
 The Connected property sets and reports the state of connection to the device hardware.
 For a hub this means that Connected will be true when the first driver connects and will only be set to false
 when all drivers have disconnected.  A second driver may find that Connected is already true and
 setting Connected to false does not report Connected as false.  This is not an error because the physical state is that the
 hardware connection is still true.
		Multiple calls setting Connected to true or false will not cause an error.
	
*/
public void setConnected(double _theValue){
this.Connected=_theValue;
}

/*
 Gets 
 Set True to connect to the device hardware. Set False to disconnect from the device hardware.
 You can also read the property to check whether it is connected. This reports the current hardware state.
 

		Must be implementedDo not use a NotConnectedException here, that exception is for use in other methods that require a connection in order to succeed.
 The Connected property sets and reports the state of connection to the device hardware.
 For a hub this means that Connected will be true when the first driver connects and will only be set to false
 when all drivers have disconnected.  A second driver may find that Connected is already true and
 setting Connected to false does not report Connected as false.  This is not an error because the physical state is that the
 hardware connection is still true.
		Multiple calls setting Connected to true or false will not cause an error.
	
*/
public double getConnected(){
return Connected;
}

/*
 Sets 
 Returns a description of the device, such as manufacturer and model number. Any ASCII characters may be used. 
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
public void setDescription(double _theValue){
this.Description=_theValue;
}

/*
 Gets 
 Returns a description of the device, such as manufacturer and model number. Any ASCII characters may be used. 
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
public double getDescription(){
return Description;
}

/*
 Sets 
 Descriptive and version information about this ASCOM driver.
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException. This string may contain line endings and may be hundreds to thousands of characters long.
 It is intended to display detailed information on the ASCOM driver, including version and copyright data.
 See the  property for information on the device itself.
 To get the driver version in a parseable string, use the  property.
 
*/
public void setDriverInfo(double _theValue){
this.DriverInfo=_theValue;
}

/*
 Gets 
 Descriptive and version information about this ASCOM driver.
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException. This string may contain line endings and may be hundreds to thousands of characters long.
 It is intended to display detailed information on the ASCOM driver, including version and copyright data.
 See the  property for information on the device itself.
 To get the driver version in a parseable string, use the  property.
 
*/
public double getDriverInfo(){
return DriverInfo;
}

/*
 Sets 
 A string containing only the major and minor version of the driver.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException. This must be in the form "n.n".
 It should not to be confused with the  property, which is the version of this specification supported by the 
 driver.
 
*/
public void setDriverVersion(double _theValue){
this.DriverVersion=_theValue;
}

/*
 Gets 
 A string containing only the major and minor version of the driver.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException. This must be in the form "n.n".
 It should not to be confused with the  property, which is the version of this specification supported by the 
 driver.
 
*/
public double getDriverVersion(){
return DriverVersion;
}

/*
 Sets 
 The interface version number that this device supports. Should return 1 for this interface version.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
public void setInterfaceVersion(double _theValue){
this.InterfaceVersion=_theValue;
}

/*
 Gets 
 The interface version number that this device supports. Should return 1 for this interface version.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
public double getInterfaceVersion(){
return InterfaceVersion;
}

/*
 Sets 
 The short name of the driver, for display purposes.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
public void setName(double _theValue){
this.Name=_theValue;
}

/*
 Gets 
 The short name of the driver, for display purposes.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
public double getName(){
return Name;
}

/*
 Sets 
 Returns the list of action names supported by this driver.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException. This method must return an empty arraylist if no actions are supported.
 This is an aid to client authors and testers who would otherwise have to repeatedly poll the driver to determine its capabilities. 
 Returned action names may be in mixed case to enhance presentation but  will be recognised case insensitively in 
 the Action method.
		An array list collection has been selected as the vehicle for  action names in order to make it easier for clients to
 determine whether a particular action is supported. This is easily done through the Contains method. Since the
 collection is also ennumerable it is easy to use constructs such as For Each ... to operate on members without having to be concerned 
 about hom many members are in the collection. 
		Collections have been used in the Telescope specification for a number of years and are known to be compatible with COM. Within .NET
 the ArrayList is the correct implementation to use as the .NET Generic methods are not compatible with COM.
	
*/
public void setSupportedActions(double _theValue){
this.SupportedActions=_theValue;
}

/*
 Gets 
 Returns the list of action names supported by this driver.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException. This method must return an empty arraylist if no actions are supported.
 This is an aid to client authors and testers who would otherwise have to repeatedly poll the driver to determine its capabilities. 
 Returned action names may be in mixed case to enhance presentation but  will be recognised case insensitively in 
 the Action method.
		An array list collection has been selected as the vehicle for  action names in order to make it easier for clients to
 determine whether a particular action is supported. This is easily done through the Contains method. Since the
 collection is also ennumerable it is easy to use constructs such as For Each ... to operate on members without having to be concerned 
 about hom many members are in the collection. 
		Collections have been used in the Telescope specification for a number of years and are known to be compatible with COM. Within .NET
 the ArrayList is the correct implementation to use as the .NET Generic methods are not compatible with COM.
	
*/
public double getSupportedActions(){
return SupportedActions;
}

/*
 Sets 
 The name of the video capture device when such a device is used.
 
For analogue video this is usually the video capture card or dongle attached to the computer.
 
*/
public void setVideoCaptureDeviceName(double _theValue){
this.VideoCaptureDeviceName=_theValue;
}

/*
 Gets 
 The name of the video capture device when such a device is used.
 
For analogue video this is usually the video capture card or dongle attached to the computer.
 
*/
public double getVideoCaptureDeviceName(){
return VideoCaptureDeviceName;
}

/*
 Sets 
 The maximum supported exposure (integration time) in seconds.
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
 This value is for information purposes only. The exposure cannot be set directly in seconds, use  property to change the exposure. 
 
*/
public void setExposureMax(double _theValue){
this.ExposureMax=_theValue;
}

/*
 Gets 
 The maximum supported exposure (integration time) in seconds.
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
 This value is for information purposes only. The exposure cannot be set directly in seconds, use  property to change the exposure. 
 
*/
public double getExposureMax(){
return ExposureMax;
}

/*
 Sets 
 The minimum supported exposure (integration time) in seconds.
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
 This value is for information purposes only. The exposure cannot be set directly in seconds, use  property to change the exposure. 
 
*/
public void setExposureMin(double _theValue){
this.ExposureMin=_theValue;
}

/*
 Gets 
 The minimum supported exposure (integration time) in seconds.
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
 This value is for information purposes only. The exposure cannot be set directly in seconds, use  property to change the exposure. 
 
*/
public double getExposureMin(){
return ExposureMin;
}

/*
 Sets 
 The frame rate at which the camera is running. 
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
 Analogue cameras run in one of the two fixed frame rates - 25fps for PAL video and 29.97fps for NTSC video. 
 Digital cameras usually can run at a variable frame rate. This value is for information purposes only and cannot be set. The FrameRate has the same value during the entire operation of the device. 
 Changing the  property may change the actual variable frame rate but cannot changethe return value of this property.
 
*/
public void setFrameRate(double _theValue){
this.FrameRate=_theValue;
}

/*
 Gets 
 The frame rate at which the camera is running. 
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
 Analogue cameras run in one of the two fixed frame rates - 25fps for PAL video and 29.97fps for NTSC video. 
 Digital cameras usually can run at a variable frame rate. This value is for information purposes only and cannot be set. The FrameRate has the same value during the entire operation of the device. 
 Changing the  property may change the actual variable frame rate but cannot changethe return value of this property.
 
*/
public double getFrameRate(){
return FrameRate;
}

/*
 Sets 
 Returns the list of integration rates supported by the video camera.
 

 Digital and integrating analogue video cameras allow the effective exposure of a frame to be changed. If the camera supports setting the exposure directly i.e. 2.153 sec then the driver must only
 return a range of useful supported exposures. For many video cameras the supported exposures (integration rates) increase by a factor of 2 from a base exposure e.g. 1, 2, 4, 8, 16 sec or 0.04, 0.08, 0.16, 0.32, 0.64, 1.28, 2.56, 5.12, 10.24 sec.
 If the camers supports only one exposure that cannot be changed (such as all non integrating PAL or NTSC video cameras) then this property must throw .
 
*/
public void setSupportedIntegrationRates(double _theValue){
this.SupportedIntegrationRates=_theValue;
}

/*
 Gets 
 Returns the list of integration rates supported by the video camera.
 

 Digital and integrating analogue video cameras allow the effective exposure of a frame to be changed. If the camera supports setting the exposure directly i.e. 2.153 sec then the driver must only
 return a range of useful supported exposures. For many video cameras the supported exposures (integration rates) increase by a factor of 2 from a base exposure e.g. 1, 2, 4, 8, 16 sec or 0.04, 0.08, 0.16, 0.32, 0.64, 1.28, 2.56, 5.12, 10.24 sec.
 If the camers supports only one exposure that cannot be changed (such as all non integrating PAL or NTSC video cameras) then this property must throw .
 
*/
public double getSupportedIntegrationRates(){
return SupportedIntegrationRates;
}

/*
 Sets 
	Index into the  array for the selected camera integration rate.
	

		 can be used to adjust the integration rate (exposure) of the camera, if supported. A 0-based array of strings - , 
 which correspond to different discrete integration rate settings supported by the camera will be returned.  must be set to an integer in this range.
	The driver must default  to a valid value when integration rate is supported by the camera. 
	
*/
public void setIntegrationRate(double _theValue){
this.IntegrationRate=_theValue;
}

/*
 Gets 
	Index into the  array for the selected camera integration rate.
	

		 can be used to adjust the integration rate (exposure) of the camera, if supported. A 0-based array of strings - , 
 which correspond to different discrete integration rate settings supported by the camera will be returned.  must be set to an integer in this range.
	The driver must default  to a valid value when integration rate is supported by the camera. 
	
*/
public double getIntegrationRate(){
return IntegrationRate;
}

/*
 Sets 
 Returns an  with its  property populated. 
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
public void setLastVideoFrame(double _theValue){
this.LastVideoFrame=_theValue;
}

/*
 Gets 
 Returns an  with its  property populated. 
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
public double getLastVideoFrame(){
return LastVideoFrame;
}

/*
 Sets 
 Sensor name.
 
Returns the name (datasheet part number) of the sensor, e.g. ICX285AL.  The format is to be exactly as shown on 
	manufacturer data sheet, subject to the following rules. All letter shall be uppercase.  Spaces shall not be included.
	Any extra suffixes that define region codes, package types, temperature range, coatings, grading, color/monochrome, 
	etc. shall not be included. For color sensors, if a suffix differentiates different Bayer matrix encodings, it shall be 
	included.
		Examples:
		
			ICX285AL-F shall be reported as ICX285
			KAF-8300-AXC-CD-AA shall be reported as KAF-8300
		
		Note:
		The most common usage of this property is to select approximate color balance parameters to be applied to 
	the Bayer matrix of one-shot color sensors.  Application authors should assume that an appropriate IR cutoff filter is 
	in place for color sensors.
		It is recommended that this function be called only after a connection is established with 
	the camera hardware, to ensure that the driver is aware of the capabilities of the specific camera model.
	
*/
public void setSensorName(double _theValue){
this.SensorName=_theValue;
}

/*
 Gets 
 Sensor name.
 
Returns the name (datasheet part number) of the sensor, e.g. ICX285AL.  The format is to be exactly as shown on 
	manufacturer data sheet, subject to the following rules. All letter shall be uppercase.  Spaces shall not be included.
	Any extra suffixes that define region codes, package types, temperature range, coatings, grading, color/monochrome, 
	etc. shall not be included. For color sensors, if a suffix differentiates different Bayer matrix encodings, it shall be 
	included.
		Examples:
		
			ICX285AL-F shall be reported as ICX285
			KAF-8300-AXC-CD-AA shall be reported as KAF-8300
		
		Note:
		The most common usage of this property is to select approximate color balance parameters to be applied to 
	the Bayer matrix of one-shot color sensors.  Application authors should assume that an appropriate IR cutoff filter is 
	in place for color sensors.
		It is recommended that this function be called only after a connection is established with 
	the camera hardware, to ensure that the driver is aware of the capabilities of the specific camera model.
	
*/
public double getSensorName(){
return SensorName;
}

/*
 Sets 
Type of colour information returned by the the camera sensor.


		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
		 returns a value indicating whether the sensor is monochrome, or what Bayer matrix it encodes.  
The following values are defined:
		
			
				
				
				
				
					
						Value
					
						Enumeration
					
						Meaning
				
				
					
0
					
Monochrome
					
Camera produces monochrome array with no Bayer encoding
				
				
					
1
					
Colour
					
Camera produces color image directly, requiring not Bayer decoding. The monochome pixels for the R, G and B channels are returned in this order in the .
				
				
					
2
					
RGGB
					
Camera produces RGGB encoded Bayer array images
				
				
					
3
					
CMYG
					
Camera produces CMYG encoded Bayer array images
				
				
					
4
					
CMYG2
					
Camera produces CMYG2 encoded Bayer array images
				
				
					
5
					
LRGB
					
Camera produces Kodak TRUESENSE Bayer LRGB array images
				
			
		
		Please note that additional values may be defined in future updates of the standard, as new Bayer matrices may be created 
by sensor manufacturers in the future.  If this occurs, then a new enumeration value shall be defined. The pre-existing enumeration 
values shall not change.
In the following definitions, R = red, G = green, B = blue, C = cyan, M = magenta, Y = yellow.  The Bayer matrix is 
defined with X increasing from left to right, and Y increasing from top to bottom. The pattern repeats every N x M pixels for the 
entire pixel array, where N is the height of the Bayer matrix, and M is the width.
			RGGB indicates the following matrix:
		
		
			
				
				
				
				
					
					
					
						X = 0
					
						X = 1
				
				
					
						Y = 0
					
R
					
G
				
				
					
						Y = 1
					
G
					
B
				
			
		
		CMYG indicates the following matrix:
		
			
				
				
				
				
					
					
					
						X = 0
					
						X = 1
				
				
					
						Y = 0
					
Y
					
C
				
				
					
						Y = 1
					
G
					
M
				
			
		
		CMYG2 indicates the following matrix:
		
			
				
				
				
				
					
					
					
						X = 0
					
						X = 1
				
				
					
						Y = 0
					
C
					
Y
				
				
					
						Y = 1
					
M
					
G
				
				
					
						Y = 2
					
C
					
Y
				
				
					
						Y = 3
					
G
					
M
				
			
		
		LRGB indicates the following matrix (Kodak TRUESENSE):
		
			
				
				
				
				
				
				
					
					
					
						X = 0
					
						X = 1
					
						X = 2
					
						X = 3
				
				
					
						Y = 0
					
L
					
R
					
L
					
G
				
				
					
						Y = 1
					
R
					
L
					
G
					
L
				
				
					
						Y = 2
					
L
					
G
					
L
					
B
				
				
					
						Y = 3
					
G
					
L
					
B
					
L
				
			
		
		It is recommended that this function be called only after a connection is established with the camera hardware, to ensure that 
the driver is aware of the capabilities of the specific camera model.
	
*/
public void setSensorType(double _theValue){
this.SensorType=_theValue;
}

/*
 Gets 
Type of colour information returned by the the camera sensor.


		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
		 returns a value indicating whether the sensor is monochrome, or what Bayer matrix it encodes.  
The following values are defined:
		
			
				
				
				
				
					
						Value
					
						Enumeration
					
						Meaning
				
				
					
0
					
Monochrome
					
Camera produces monochrome array with no Bayer encoding
				
				
					
1
					
Colour
					
Camera produces color image directly, requiring not Bayer decoding. The monochome pixels for the R, G and B channels are returned in this order in the .
				
				
					
2
					
RGGB
					
Camera produces RGGB encoded Bayer array images
				
				
					
3
					
CMYG
					
Camera produces CMYG encoded Bayer array images
				
				
					
4
					
CMYG2
					
Camera produces CMYG2 encoded Bayer array images
				
				
					
5
					
LRGB
					
Camera produces Kodak TRUESENSE Bayer LRGB array images
				
			
		
		Please note that additional values may be defined in future updates of the standard, as new Bayer matrices may be created 
by sensor manufacturers in the future.  If this occurs, then a new enumeration value shall be defined. The pre-existing enumeration 
values shall not change.
In the following definitions, R = red, G = green, B = blue, C = cyan, M = magenta, Y = yellow.  The Bayer matrix is 
defined with X increasing from left to right, and Y increasing from top to bottom. The pattern repeats every N x M pixels for the 
entire pixel array, where N is the height of the Bayer matrix, and M is the width.
			RGGB indicates the following matrix:
		
		
			
				
				
				
				
					
					
					
						X = 0
					
						X = 1
				
				
					
						Y = 0
					
R
					
G
				
				
					
						Y = 1
					
G
					
B
				
			
		
		CMYG indicates the following matrix:
		
			
				
				
				
				
					
					
					
						X = 0
					
						X = 1
				
				
					
						Y = 0
					
Y
					
C
				
				
					
						Y = 1
					
G
					
M
				
			
		
		CMYG2 indicates the following matrix:
		
			
				
				
				
				
					
					
					
						X = 0
					
						X = 1
				
				
					
						Y = 0
					
C
					
Y
				
				
					
						Y = 1
					
M
					
G
				
				
					
						Y = 2
					
C
					
Y
				
				
					
						Y = 3
					
G
					
M
				
			
		
		LRGB indicates the following matrix (Kodak TRUESENSE):
		
			
				
				
				
				
				
				
					
					
					
						X = 0
					
						X = 1
					
						X = 2
					
						X = 3
				
				
					
						Y = 0
					
L
					
R
					
L
					
G
				
				
					
						Y = 1
					
R
					
L
					
G
					
L
				
				
					
						Y = 2
					
L
					
G
					
L
					
B
				
				
					
						Y = 3
					
G
					
L
					
B
					
L
				
			
		
		It is recommended that this function be called only after a connection is established with the camera hardware, to ensure that 
the driver is aware of the capabilities of the specific camera model.
	
*/
public double getSensorType(){
return SensorType;
}

/*
 Sets 
	Returns the width of the video frame in pixels.
	

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
 For analogue video cameras working via a frame grabber the dimensions of the video frames may be different than the dimension of the CCD chip
 
*/
public void setWidth(double _theValue){
this.Width=_theValue;
}

/*
 Gets 
	Returns the width of the video frame in pixels.
	

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
 For analogue video cameras working via a frame grabber the dimensions of the video frames may be different than the dimension of the CCD chip
 
*/
public double getWidth(){
return Width;
}

/*
 Sets 
	Returns the height of the video frame in pixels.
	

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
 For analogue video cameras working via a frame grabber the dimensions of the video frames may be different than the dimension of the CCD chip
 
*/
public void setHeight(double _theValue){
this.Height=_theValue;
}

/*
 Gets 
	Returns the height of the video frame in pixels.
	

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
 For analogue video cameras working via a frame grabber the dimensions of the video frames may be different than the dimension of the CCD chip
 
*/
public double getHeight(){
return Height;
}

/*
 Sets 
	Returns the width of the CCD chip pixels in microns.
	

*/
public void setPixelSizeX(double _theValue){
this.PixelSizeX=_theValue;
}

/*
 Gets 
	Returns the width of the CCD chip pixels in microns.
	

*/
public double getPixelSizeX(){
return PixelSizeX;
}

/*
 Sets 
	Returns the height of the CCD chip pixels in microns.
	

*/
public void setPixelSizeY(double _theValue){
this.PixelSizeY=_theValue;
}

/*
 Gets 
	Returns the height of the CCD chip pixels in microns.
	

*/
public double getPixelSizeY(){
return PixelSizeY;
}

/*
 Sets 
	Reports the bit depth the camera can produce.
	

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
public void setBitDepth(double _theValue){
this.BitDepth=_theValue;
}

/*
 Gets 
	Reports the bit depth the camera can produce.
	

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
public double getBitDepth(){
return BitDepth;
}

/*
 Sets 
 Returns the video codec used to record the video file.
 
For AVI files this is usually the FourCC identifier of the codec- e.g. XVID, DVSD, YUY2, HFYU etc. 
 If the recorded video file doesn't use codecs an empty string must be returned.
 
*/
public void setVideoCodec(double _theValue){
this.VideoCodec=_theValue;
}

/*
 Gets 
 Returns the video codec used to record the video file.
 
For AVI files this is usually the FourCC identifier of the codec- e.g. XVID, DVSD, YUY2, HFYU etc. 
 If the recorded video file doesn't use codecs an empty string must be returned.
 
*/
public double getVideoCodec(){
return VideoCodec;
}

/*
 Sets 
 Returns the file format of the recorded video file, e.g. AVI, MPEG, ADV etc.
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
public void setVideoFileFormat(double _theValue){
this.VideoFileFormat=_theValue;
}

/*
 Gets 
 Returns the file format of the recorded video file, e.g. AVI, MPEG, ADV etc.
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
public double getVideoFileFormat(){
return VideoFileFormat;
}

/*
 Sets 
	The size of the video frame buffer. 
	
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException. When retrieving video frames using the  property 
 the driver may use a buffer to queue the frames waiting to be read by the client. This property returns the size of the buffer in frames or 
 if no buffering is supported then the value of less than 2 should be returned. The size of the buffer can be controlled by the end user from the driver setup dialog. 
	
*/
public void setVideoFramesBufferSize(double _theValue){
this.VideoFramesBufferSize=_theValue;
}

/*
 Gets 
	The size of the video frame buffer. 
	
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException. When retrieving video frames using the  property 
 the driver may use a buffer to queue the frames waiting to be read by the client. This property returns the size of the buffer in frames or 
 if no buffering is supported then the value of less than 2 should be returned. The size of the buffer can be controlled by the end user from the driver setup dialog. 
	
*/
public double getVideoFramesBufferSize(){
return VideoFramesBufferSize;
}

/*
 Sets 
	Returns the current camera operational state.
	

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	Returns one of the following status information:
	
			Value  State           Meaning
			0      CameraRunning	  The camera is running and video frames are available for viewing and recording
			1      CameraRecording The camera is running and recording a video
			2      CameraError     Camera error condition serious enough to prevent further operations (connection fail, etc.).
		
		CameraIdle and CameraBusy are optional states. Free running cameras cannot be stopped and don't have a CameraIdle state. When those cameras are powered they immediately enter CameraRunning state. 
 Some digital cameras or vdeo systems may suport operations that take longer to complete. Whlie those longer operations are running the camera will remain in the state it was before the operation started.
		The video camera state diagram is shown below: 
		
			
	
*/
public void setCameraState(double _theValue){
this.CameraState=_theValue;
}

/*
 Gets 
	Returns the current camera operational state.
	

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	Returns one of the following status information:
	
			Value  State           Meaning
			0      CameraRunning	  The camera is running and video frames are available for viewing and recording
			1      CameraRecording The camera is running and recording a video
			2      CameraError     Camera error condition serious enough to prevent further operations (connection fail, etc.).
		
		CameraIdle and CameraBusy are optional states. Free running cameras cannot be stopped and don't have a CameraIdle state. When those cameras are powered they immediately enter CameraRunning state. 
 Some digital cameras or vdeo systems may suport operations that take longer to complete. Whlie those longer operations are running the camera will remain in the state it was before the operation started.
		The video camera state diagram is shown below: 
		
			
	
*/
public double getCameraState(){
return CameraState;
}

/*
 Sets 
	Maximum value of .
	
When specifying the gain setting with an integer value,  is used in conjunction with  to 
	specify the range of valid settings.
	 shall be greater than . If either is available, then both must be available.
		Please see  for more information.
		It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
	that the driver is aware of the capabilities of the specific camera model.
	
*/
public void setGainMax(double _theValue){
this.GainMax=_theValue;
}

/*
 Gets 
	Maximum value of .
	
When specifying the gain setting with an integer value,  is used in conjunction with  to 
	specify the range of valid settings.
	 shall be greater than . If either is available, then both must be available.
		Please see  for more information.
		It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
	that the driver is aware of the capabilities of the specific camera model.
	
*/
public double getGainMax(){
return GainMax;
}

/*
 Sets 
	Minimum value of .
	
When specifying the gain setting with an integer value,  is used in conjunction with  to 
	specify the range of valid settings.
	 shall be greater than . If either is available, then both must be available.
		Please see  for more information.
		It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
	that the driver is aware of the capabilities of the specific camera model.
	
*/
public void setGainMin(double _theValue){
this.GainMin=_theValue;
}

/*
 Gets 
	Minimum value of .
	
When specifying the gain setting with an integer value,  is used in conjunction with  to 
	specify the range of valid settings.
	 shall be greater than . If either is available, then both must be available.
		Please see  for more information.
		It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
	that the driver is aware of the capabilities of the specific camera model.
	
*/
public double getGainMin(){
return GainMin;
}

/*
 Sets 
	Index into the  array for the selected camera gain.
	

		 can be used to adjust the gain setting of the camera, if supported. There are two typical usage scenarios:
	
			Discrete gain video cameras will return a 0-based array of strings - , which correspond to different discrete gain settings supported by the camera.  must be set to an integer in this range.  and  must thrown an exception if 
	this mode is used.
			Adjustable gain video cameras -  and  return integers, which specify the valid range for .
		
		The driver must default  to a valid value. 
	
*/
public void setGain(double _theValue){
this.Gain=_theValue;
}

/*
 Gets 
	Index into the  array for the selected camera gain.
	

		 can be used to adjust the gain setting of the camera, if supported. There are two typical usage scenarios:
	
			Discrete gain video cameras will return a 0-based array of strings - , which correspond to different discrete gain settings supported by the camera.  must be set to an integer in this range.  and  must thrown an exception if 
	this mode is used.
			Adjustable gain video cameras -  and  return integers, which specify the valid range for .
		
		The driver must default  to a valid value. 
	
*/
public double getGain(){
return Gain;
}

/*
 Sets 
 Gains supported by the camera.
	
 provides a 0-based array of available gain settings.
	Typically the application software will display the available gain settings in a drop list. The application will then supply 
	the selected index to the driver via the  property. 
	The  setting may alternatively be specified using integer values; if this mode is used then  is invalid 
	and must throw an exception. Please see  and  for more information.
		It is recommended that this function be called only after a connection is established with the camera hardware, 
	to ensure that the driver is aware of the capabilities of the specific camera model.
	
*/
public void setGains(double _theValue){
this.Gains=_theValue;
}

/*
 Gets 
 Gains supported by the camera.
	
 provides a 0-based array of available gain settings.
	Typically the application software will display the available gain settings in a drop list. The application will then supply 
	the selected index to the driver via the  property. 
	The  setting may alternatively be specified using integer values; if this mode is used then  is invalid 
	and must throw an exception. Please see  and  for more information.
		It is recommended that this function be called only after a connection is established with the camera hardware, 
	to ensure that the driver is aware of the capabilities of the specific camera model.
	
*/
public double getGains(){
return Gains;
}

/*
 Sets 
	Maximum value of .
	
When specifying the gamma setting with an integer value,  is used in conjunction with  to 
	specify the range of valid settings.
	 shall be greater than . If either is available, then both must be available.
		Please see  for more information.
		It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
	that the driver is aware of the capabilities of the specific camera model.
	
*/
public void setGammaMax(double _theValue){
this.GammaMax=_theValue;
}

/*
 Gets 
	Maximum value of .
	
When specifying the gamma setting with an integer value,  is used in conjunction with  to 
	specify the range of valid settings.
	 shall be greater than . If either is available, then both must be available.
		Please see  for more information.
		It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
	that the driver is aware of the capabilities of the specific camera model.
	
*/
public double getGammaMax(){
return GammaMax;
}

/*
 Sets 
	Minimum value of .
	
When specifying the gamma setting with an integer value,  is used in conjunction with  to 
	specify the range of valid settings.
	 shall be greater than . If either is available, then both must be available.
		Please see  for more information.
		It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
	that the driver is aware of the capabilities of the specific camera model.
	
*/
public void setGammaMin(double _theValue){
this.GammaMin=_theValue;
}

/*
 Gets 
	Minimum value of .
	
When specifying the gamma setting with an integer value,  is used in conjunction with  to 
	specify the range of valid settings.
	 shall be greater than . If either is available, then both must be available.
		Please see  for more information.
		It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
	that the driver is aware of the capabilities of the specific camera model.
	
*/
public double getGammaMin(){
return GammaMin;
}

/*
 Sets 
	Index into the  array for the selected camera gamma.
	

		 can be used to adjust the gamma setting of the camera, if supported. There are two typical usage scenarios:
	
			Discrete gamma video cameras will return a 0-based array of strings - , which correspond to different discrete gamma settings supported by the camera.  must be set to an integer in this range.  and  must thrown an exception if 
	this mode is used.
			Adjustable gain video cameras -  and  return integers, which specify the valid range for .
		
		The driver must default  to a valid value. 
	
*/
public void setGamma(double _theValue){
this.Gamma=_theValue;
}

/*
 Gets 
	Index into the  array for the selected camera gamma.
	

		 can be used to adjust the gamma setting of the camera, if supported. There are two typical usage scenarios:
	
			Discrete gamma video cameras will return a 0-based array of strings - , which correspond to different discrete gamma settings supported by the camera.  must be set to an integer in this range.  and  must thrown an exception if 
	this mode is used.
			Adjustable gain video cameras -  and  return integers, which specify the valid range for .
		
		The driver must default  to a valid value. 
	
*/
public double getGamma(){
return Gamma;
}

/*
 Sets 
 Gammas supported by the camera.
	
 provides a 0-based array of available gamma settings. This list can contain the widely used values of OFF, LO and HI that correspond to gammas of 1.00, 0.45 and 0.35 as well as other extended values.
	Typically the application software will display the available gamma settings in a drop list. The application will then supply 
	the selected index to the driver via the  property. 
	The  setting may alternatively be specified using integer values; if this mode is used then  is invalid 
	and must throw an exception. Please see  and  for more information.
		It is recommended that this function be called only after a connection is established with the camera hardware, 
	to ensure that the driver is aware of the capabilities of the specific camera model.
	
*/
public void setGammas(double _theValue){
this.Gammas=_theValue;
}

/*
 Gets 
 Gammas supported by the camera.
	
 provides a 0-based array of available gamma settings. This list can contain the widely used values of OFF, LO and HI that correspond to gammas of 1.00, 0.45 and 0.35 as well as other extended values.
	Typically the application software will display the available gamma settings in a drop list. The application will then supply 
	the selected index to the driver via the  property. 
	The  setting may alternatively be specified using integer values; if this mode is used then  is invalid 
	and must throw an exception. Please see  and  for more information.
		It is recommended that this function be called only after a connection is established with the camera hardware, 
	to ensure that the driver is aware of the capabilities of the specific camera model.
	
*/
public double getGammas(){
return Gammas;
}

/*
 Sets 
 Returns True if the driver supports custom device properties configuration via the  method.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
public void setCanConfigureDeviceProperties(double _theValue){
this.CanConfigureDeviceProperties=_theValue;
}

/*
 Gets 
 Returns True if the driver supports custom device properties configuration via the  method.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
	
*/
public double getCanConfigureDeviceProperties(){
return CanConfigureDeviceProperties;
}
}
