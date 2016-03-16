package ASCOM.DeviceInterface;

/*

 Defines the IObservingConditions Interface.
 This interface provides a limited set of values that are useful
 for astronomical purposes for things such as determining if it is safe to open or operate the observing system,
 for recording astronomical data or determining refraction corrections.
 

It is NOT intended as a general purpose environmental sensor system. The Action method and 
 SupportedActions property can be used to extend your driver to present any further sensors that you need.
 
*/
public class IObservingConditions{

/*

 Set to True to connect to the device hardware. Set to False to disconnect from the device hardware.
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
 
Must be implemented
	
*/
private double Description;
/*

 Descriptive and version information about this ASCOM driver.
 

		Must be implemented This string may contain line endings and may be hundreds to thousands of characters long.
 It is intended to display detailed information on the ASCOM driver, including version and copyright data.
 See the  property for information on the device itself.
 To get the driver version in a parseable string, use the  property.
 
*/
private double DriverInfo;
/*

 A string containing only the major and minor version of the driver.
 
Must be implemented This must be in the form "n.n".
 It should not be confused with the  property, which is the version of this specification supported by the 
 driver.
 
*/
private double DriverVersion;
/*

 The interface version number that this device supports. Must return 1 for this interface version.
 
Must be implementedThis value will be incremented if the interface
 specification is extended in the future.
 
*/
private double InterfaceVersion;
/*

 The short name of the driver, for display purposes
 
Must be implemented
	
*/
private double Name;
/*

 Returns the list of action names supported by this driver.
 
Must be implemented This method must return an empty arraylist if no actions are supported. Please do not throw a 
 .
 This is an aid to client authors and testers who would otherwise have to repeatedly poll the driver to determine its capabilities. 
 Returned action names may be in mixed case to enhance presentation but  will be recognised case insensitively in 
 the Action method.
		An array list collection has been selected as the vehicle for  action names in order to make it easier for clients to
 determine whether a particular action is supported. This is easily done through the Contains method. Since the
 collection is also ennumerable it is easy to use constructs such as For Each ... to operate on members without having to be concerned 
 about hom many members are in the collection. 
		Collections have been used in the Telescope specification for a number of years and are known to be compatible with COM. Within .NET
 the ArrayList is the correct implementation to use as the .NET Generic methods are not compatible with COM.
		See Action for advice on how th implement this for ObservingConditions drivers.
	
*/
private double SupportedActions;
/*

 Gets And sets the time period over which observations will be averaged
 

		Mandatory property, must be implemented, can NOT throw a PropertyNotImplementedException
		This property should return the time period (hours) over which sensor readings will be averaged. If your driver is delivering instantaneous sensor readings this property should return a value of 0.0.
		Please resist the temptation to throw exceptions when clients query sensor properties when insufficient time has passed to get a true average reading. 
 A best estimate of the average sensor value should be returned in these situations. 
	
*/
private double AveragePeriod;
/*

 Amount of sky obscured by cloud
 

		Optional property, can throw a PropertyNotImplementedException
 This property should return a value between 0.0 and 100.0 where 0.0 = clear sky and 100.0 = 100% cloud coverage
 
*/
private double CloudCover;
/*

 Atmospheric dew point at the observatory
 

		Optional property, can throw a PropertyNotImplementedException when the  property also throws a PropertyNotImplementedException.
		Mandatory property, must NOT throw a PropertyNotImplementedException when the  property is implemented.
		The units of this property are degrees Celsius. Driver and application authors can use the  method
 to convert these units to and from degrees Farenhheit.
		The ASCOM specification requires that DewPoint and Humidity are either both implemented or both throw PropertyNotImplementedExceptions. It is not allowed for 
 one to be implemented and the other to throw a PropertyNotImplementedException. The Utilities component contains methods ( and 
 ) to convert DewPoint to Humidity and vice versa given the ambient temperature.
	
*/
private double DewPoint;
/*

 Atmospheric humidity at the observatory
 

		Optional property, can throw a PropertyNotImplementedException when the  property also throws a PropertyNotImplementedException.
		Mandatory property, must NOT throw a PropertyNotImplementedException when the  property is implemented.
		The ASCOM specification requires that DewPoint and Humidity are either both implemented or both throw PropertyNotImplementedExceptions. It is not allowed for 
 one to be implemented and the other to throw a PropertyNotImplementedException. The Utilities component contains methods ( and 
 ) to convert DewPoint to Humidity and vice versa given the ambient temperature.
		This property should return a value between 0.0 and 100.0 where 0.0 = 0% relative humidity and 100.0 = 100% relative humidity.
	
*/
private double Humidity;
/*

 Atmospheric pressure at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
		The units of this property are hectoPascals. Client and driver authors can use the method 
 to convert these units to and from milliBar, mm of mercury and inches of mercury.
		This must be the pressure at the observatory altitude and not the adjusted pressure at sea level.
 Please check whether your pressure sensor delivers local observatory pressure or sea level pressure and, if it returns sea level pressure, 
 adjust this to actual pressure at the observatory's altitude before returning a value to the client.
 The  method can be used to effect this adjustment.
 
	
*/
private double Pressure;
/*

 Rain rate at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
		The units of this property are millimetres per hour. Client and driver authors can use the method 
 to convert these units to and from inches per hour.
		This property can be interpreted as 0.0 = Dry any positive nonzero value = wet.
		Rainfall intensity is classified according to the rate of precipitation:
		
			Light rain — when the precipitation rate is less than 2.5 mm (0.098 in) per hour
			Moderate rain — when the precipitation rate is between 2.5 mm (0.098 in) and 10 mm (0.39 in) per hour
			Heavy rain — when the precipitation rate is between 10 mm (0.39 in) and 50 mm (2.0 in) per hour
			Violent rain — when the precipitation rate is > 50 mm (2.0 in) per hour
		
	
*/
private double RainRate;
/*

 Sky brightness at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
 This property returns the sky brightness measured in Lux.
 Luminance Examples in Lux
		
			
				IlluminanceSurfaces illuminated by:
			
			0.0001 luxMoonless, overcast night sky (starlight)
			0.002 luxMoonless clear night sky with airglow
			0.27–1.0 luxFull moon on a clear night
			3.4 luxDark limit of civil twilight under a clear sky
			50 luxFamily living room lights (Australia, 1998)
			80 luxOffice building hallway/toilet lighting
			100 luxVery dark overcast day
			320–500 luxOffice lighting
			400 luxSunrise or sunset on a clear day.
			1000 luxOvercast day; typical TV studio lighting
			10000–25000 luxFull daylight (not direct sun)
			32000–100000 luxDirect sunlight
		
	
*/
private double SkyBrightness;
/*

 Sky quality at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
		Sky quality is typically measured in units of magnitudes per square arc second. A sky quality of 20 magnitudes per square arc second means that the
 overall sky appears with a brightness equivalent to having 1 magnitude 20 star in each square arc second of sky.
		Examples of typical sky quality values were published by Sky and Telescope (http://www.skyandtelescope.com/astronomy-resources/rate-your-skyglow/) and, in slightly adpated form, are reproduced below:
		
			
				
				
				
					
						Sky Quality (mag/arcsec2)
					
						Description
				
				
					
 22.0
					
 By convention, this is often assumed to be the average brightness of a moonless night sky that's completely free of artificial light pollution.
				
				
					
 21.0
					
 This is typical for a rural area with a medium-sized city not far away. It's comparable to the glow of the brightest section of the northern Milky Way, from Cygnus through Perseus. 
				
				
					
 20.0
					
 This is typical for the outer suburbs of a major metropolis. The summer Milky Way is readily visible but severely washed out.
				
				
					
 19.0
					
 Typical for a suburb with widely spaced single-family homes. It's a little brighter than a remote rural site at the end of nautical twilight, when the Sun is 12° below the horizon.
				
				
					
 18.0
					
 Bright suburb or dark urban neighborhood. It's also a typical zenith skyglow at a rural site when the Moon is full. The Milky Way is invisible, or nearly so.
				
				
					
 17.0
					
 Typical near the center of a major city.
				
				
					
 13.0
					
 The zenith skyglow at the end of civil twilight, roughly a half hour after sunset, when the Sun is 6° below the horizon. Venus and Jupiter are easy to see, but bright stars are just beginning to appear.
				
				
					
 7.0
					
 The zenith skyglow at sunrise or sunset
				
			
		
	
*/
private double SkyQuality;
/*

 Seeing at the observatory measured as star full width half maximum (FWHM) in arc secs.
 

		Optional property, can throw a PropertyNotImplementedException
	
*/
private double StarFWHM;
/*

 Sky temperature at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
		The units of this property are degrees Celsius. Driver and application authors can use the  method
 to convert these units to and from degrees Farenhheit.
		This is expected to be returned by an infra-red sensor looking at the sky. The lower the temperature the more the sky is likely to be clear.
	
*/
private double SkyTemperature;
/*

 Temperature at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
		The units of this property are degrees Celsius. Driver and application authors can use the  method
 to convert these units to and from degrees Farenhheit.
		This is expected to be the ambient temperature at the observatory.
	
*/
private double Temperature;
/*

 Wind direction at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
 The returned value must be between 0.0 and 360.0, interpreted according to the metereological standard, where a special value of 0.0 is returned when the wind speed is 0.0. 
 Wind direction is measured clockwise from north, through east, where East=90.0, South=180.0, West=270.0 and North=360.0.
 
*/
private double WindDirection;
/*

 Peak 3 second wind gust at the observatory over the last 2 minutes
 

		Optional property, can throw a PropertyNotImplementedException
 The units of this property are metres per second. Driver and application authors can use the  method
 to convert these units to and from miles per hour or knots.
 
*/
private double WindGust;
/*

 Wind speed at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
 The units of this property are metres per second. Driver and application authors can use the  method
 to convert these units to and from miles per hour or knots.
 
*/
private double WindSpeed;


/*

 Launches a configuration dialog box for the driver.  The call will not return
 until the user clicks OK or cancel manually.
 
Must be implemented
	
*/
public void SetupDialog(){
return null;
}


/*

 Invokes the specified device-specific action.
 
Can throw a not implemented exception 
 This method is intended for use in all current and future device types and to avoid name clashes, management of action names 
 is important from day 1. A two-part naming convention will be adopted - DeviceType:UniqueActionName where:
 
			DeviceType is the same value as would be used by  e.g. Telescope, Camera, Switch etc.
			UniqueActionName is a single word, or multiple words joined by underscore characters, that sensibly describes the action to be performed.
		
		
 It is recommended that UniqueActionNames should be a maximum of 16 characters for legibility.
 Should the same function and UniqueActionName be supported by more than one type of device, the reserved DeviceType of 
 “General” will be used. Action names will be case insensitive, so FilterWheel:SelectWheel, filterwheel:selectwheel 
 and FILTERWHEEL:SELECTWHEEL will all refer to the same action.
		The names of all supported actions must be returned in the  property.
		For ObservingConditions drivers the following conventions are recommended:
 
				The "ActionName" should be the name of a sensor in a form that makes sense to the user.
 This must not be changed in the driver.
				The "ActionParameter" should be "Value" to return the sensor value and 
 "Description" to return the sensor description. 
 The description must return a valid description, even if not connected.
			
		
	
*/
public void Action(String,String){
return null;
}


/*

 Transmits an arbitrary string to the device and does not wait for a response.
 Optionally, protocol framing characters may be added to the string before transmission.
 
Can throw a not implemented exception
	
*/
public void CommandBlind(String,Boolean){
return null;
}


/*

 Transmits an arbitrary string to the device and waits for a boolean response.
 Optionally, protocol framing characters may be added to the string before transmission.
 
Can throw a not implemented exception
	
*/
public void CommandBool(String,Boolean){
return null;
}


/*

 Transmits an arbitrary string to the device and waits for a string response.
 Optionally, protocol framing characters may be added to the string before transmission.
 
Can throw a not implemented exception
	
*/
public void CommandString(String,Boolean){
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

 Provides the time since the sensor value was last updated
 

		Must Not throw a MethodNotImplementedException when the specified sensor Is implemented but must throw a MethodNotImplementedException when the specified sensor Is Not implemented.
		PropertyName must be the name of one of the sensor properties specified in the  interface. If the caller supplies some other value, throw an InvalidValueException.
		Return a negative value to indicate that no valid value has ever been received from the hardware.
		If an empty string is supplied as the PropertyName, the driver must return the time since the most recent update of any sensor. A MethodNotImplementedException must not be thrown in this circumstance.
	
*/
public void TimeSinceLastUpdate(String){
return null;
}


/*

 Provides a description of the sensor providing the requested property
 

		Must Not throw a MethodNotImplementedException when the specified sensor Is implemented 
 but must throw a MethodNotImplementedException when the specified sensor Is Not implemented.
		PropertyName must be the name of one of the sensor properties specified in the  interface. If the caller supplies some other value, throw an InvalidValueException.
		If the sensor is implemented, this must return a valid string, even if the driver is not connected, so that applications can use this to determine what sensors are available.
		If the sensor is not implemented, this must throw a MethodNotImplementedException.
	
*/
public void SensorDescription(String){
return null;
}


/*

 Forces the driver to immediately query its attached hardware to refresh sensor values
 

		Optional method, can throw a MethodNotImplementedException
	
*/
public void Refresh(){
return null;
}

/*
 Sets 
 Set to True to connect to the device hardware. Set to False to disconnect from the device hardware.
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
 Set to True to connect to the device hardware. Set to False to disconnect from the device hardware.
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
 
Must be implemented
	
*/
public void setDescription(double _theValue){
this.Description=_theValue;
}

/*
 Gets 
 Returns a description of the device, such as manufacturer and model number. Any ASCII characters may be used. 
 
Must be implemented
	
*/
public double getDescription(){
return Description;
}

/*
 Sets 
 Descriptive and version information about this ASCOM driver.
 

		Must be implemented This string may contain line endings and may be hundreds to thousands of characters long.
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
 

		Must be implemented This string may contain line endings and may be hundreds to thousands of characters long.
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
 
Must be implemented This must be in the form "n.n".
 It should not be confused with the  property, which is the version of this specification supported by the 
 driver.
 
*/
public void setDriverVersion(double _theValue){
this.DriverVersion=_theValue;
}

/*
 Gets 
 A string containing only the major and minor version of the driver.
 
Must be implemented This must be in the form "n.n".
 It should not be confused with the  property, which is the version of this specification supported by the 
 driver.
 
*/
public double getDriverVersion(){
return DriverVersion;
}

/*
 Sets 
 The interface version number that this device supports. Must return 1 for this interface version.
 
Must be implementedThis value will be incremented if the interface
 specification is extended in the future.
 
*/
public void setInterfaceVersion(double _theValue){
this.InterfaceVersion=_theValue;
}

/*
 Gets 
 The interface version number that this device supports. Must return 1 for this interface version.
 
Must be implementedThis value will be incremented if the interface
 specification is extended in the future.
 
*/
public double getInterfaceVersion(){
return InterfaceVersion;
}

/*
 Sets 
 The short name of the driver, for display purposes
 
Must be implemented
	
*/
public void setName(double _theValue){
this.Name=_theValue;
}

/*
 Gets 
 The short name of the driver, for display purposes
 
Must be implemented
	
*/
public double getName(){
return Name;
}

/*
 Sets 
 Returns the list of action names supported by this driver.
 
Must be implemented This method must return an empty arraylist if no actions are supported. Please do not throw a 
 .
 This is an aid to client authors and testers who would otherwise have to repeatedly poll the driver to determine its capabilities. 
 Returned action names may be in mixed case to enhance presentation but  will be recognised case insensitively in 
 the Action method.
		An array list collection has been selected as the vehicle for  action names in order to make it easier for clients to
 determine whether a particular action is supported. This is easily done through the Contains method. Since the
 collection is also ennumerable it is easy to use constructs such as For Each ... to operate on members without having to be concerned 
 about hom many members are in the collection. 
		Collections have been used in the Telescope specification for a number of years and are known to be compatible with COM. Within .NET
 the ArrayList is the correct implementation to use as the .NET Generic methods are not compatible with COM.
		See Action for advice on how th implement this for ObservingConditions drivers.
	
*/
public void setSupportedActions(double _theValue){
this.SupportedActions=_theValue;
}

/*
 Gets 
 Returns the list of action names supported by this driver.
 
Must be implemented This method must return an empty arraylist if no actions are supported. Please do not throw a 
 .
 This is an aid to client authors and testers who would otherwise have to repeatedly poll the driver to determine its capabilities. 
 Returned action names may be in mixed case to enhance presentation but  will be recognised case insensitively in 
 the Action method.
		An array list collection has been selected as the vehicle for  action names in order to make it easier for clients to
 determine whether a particular action is supported. This is easily done through the Contains method. Since the
 collection is also ennumerable it is easy to use constructs such as For Each ... to operate on members without having to be concerned 
 about hom many members are in the collection. 
		Collections have been used in the Telescope specification for a number of years and are known to be compatible with COM. Within .NET
 the ArrayList is the correct implementation to use as the .NET Generic methods are not compatible with COM.
		See Action for advice on how th implement this for ObservingConditions drivers.
	
*/
public double getSupportedActions(){
return SupportedActions;
}

/*
 Sets 
 Gets And sets the time period over which observations will be averaged
 

		Mandatory property, must be implemented, can NOT throw a PropertyNotImplementedException
		This property should return the time period (hours) over which sensor readings will be averaged. If your driver is delivering instantaneous sensor readings this property should return a value of 0.0.
		Please resist the temptation to throw exceptions when clients query sensor properties when insufficient time has passed to get a true average reading. 
 A best estimate of the average sensor value should be returned in these situations. 
	
*/
public void setAveragePeriod(double _theValue){
this.AveragePeriod=_theValue;
}

/*
 Gets 
 Gets And sets the time period over which observations will be averaged
 

		Mandatory property, must be implemented, can NOT throw a PropertyNotImplementedException
		This property should return the time period (hours) over which sensor readings will be averaged. If your driver is delivering instantaneous sensor readings this property should return a value of 0.0.
		Please resist the temptation to throw exceptions when clients query sensor properties when insufficient time has passed to get a true average reading. 
 A best estimate of the average sensor value should be returned in these situations. 
	
*/
public double getAveragePeriod(){
return AveragePeriod;
}

/*
 Sets 
 Amount of sky obscured by cloud
 

		Optional property, can throw a PropertyNotImplementedException
 This property should return a value between 0.0 and 100.0 where 0.0 = clear sky and 100.0 = 100% cloud coverage
 
*/
public void setCloudCover(double _theValue){
this.CloudCover=_theValue;
}

/*
 Gets 
 Amount of sky obscured by cloud
 

		Optional property, can throw a PropertyNotImplementedException
 This property should return a value between 0.0 and 100.0 where 0.0 = clear sky and 100.0 = 100% cloud coverage
 
*/
public double getCloudCover(){
return CloudCover;
}

/*
 Sets 
 Atmospheric dew point at the observatory
 

		Optional property, can throw a PropertyNotImplementedException when the  property also throws a PropertyNotImplementedException.
		Mandatory property, must NOT throw a PropertyNotImplementedException when the  property is implemented.
		The units of this property are degrees Celsius. Driver and application authors can use the  method
 to convert these units to and from degrees Farenhheit.
		The ASCOM specification requires that DewPoint and Humidity are either both implemented or both throw PropertyNotImplementedExceptions. It is not allowed for 
 one to be implemented and the other to throw a PropertyNotImplementedException. The Utilities component contains methods ( and 
 ) to convert DewPoint to Humidity and vice versa given the ambient temperature.
	
*/
public void setDewPoint(double _theValue){
this.DewPoint=_theValue;
}

/*
 Gets 
 Atmospheric dew point at the observatory
 

		Optional property, can throw a PropertyNotImplementedException when the  property also throws a PropertyNotImplementedException.
		Mandatory property, must NOT throw a PropertyNotImplementedException when the  property is implemented.
		The units of this property are degrees Celsius. Driver and application authors can use the  method
 to convert these units to and from degrees Farenhheit.
		The ASCOM specification requires that DewPoint and Humidity are either both implemented or both throw PropertyNotImplementedExceptions. It is not allowed for 
 one to be implemented and the other to throw a PropertyNotImplementedException. The Utilities component contains methods ( and 
 ) to convert DewPoint to Humidity and vice versa given the ambient temperature.
	
*/
public double getDewPoint(){
return DewPoint;
}

/*
 Sets 
 Atmospheric humidity at the observatory
 

		Optional property, can throw a PropertyNotImplementedException when the  property also throws a PropertyNotImplementedException.
		Mandatory property, must NOT throw a PropertyNotImplementedException when the  property is implemented.
		The ASCOM specification requires that DewPoint and Humidity are either both implemented or both throw PropertyNotImplementedExceptions. It is not allowed for 
 one to be implemented and the other to throw a PropertyNotImplementedException. The Utilities component contains methods ( and 
 ) to convert DewPoint to Humidity and vice versa given the ambient temperature.
		This property should return a value between 0.0 and 100.0 where 0.0 = 0% relative humidity and 100.0 = 100% relative humidity.
	
*/
public void setHumidity(double _theValue){
this.Humidity=_theValue;
}

/*
 Gets 
 Atmospheric humidity at the observatory
 

		Optional property, can throw a PropertyNotImplementedException when the  property also throws a PropertyNotImplementedException.
		Mandatory property, must NOT throw a PropertyNotImplementedException when the  property is implemented.
		The ASCOM specification requires that DewPoint and Humidity are either both implemented or both throw PropertyNotImplementedExceptions. It is not allowed for 
 one to be implemented and the other to throw a PropertyNotImplementedException. The Utilities component contains methods ( and 
 ) to convert DewPoint to Humidity and vice versa given the ambient temperature.
		This property should return a value between 0.0 and 100.0 where 0.0 = 0% relative humidity and 100.0 = 100% relative humidity.
	
*/
public double getHumidity(){
return Humidity;
}

/*
 Sets 
 Atmospheric pressure at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
		The units of this property are hectoPascals. Client and driver authors can use the method 
 to convert these units to and from milliBar, mm of mercury and inches of mercury.
		This must be the pressure at the observatory altitude and not the adjusted pressure at sea level.
 Please check whether your pressure sensor delivers local observatory pressure or sea level pressure and, if it returns sea level pressure, 
 adjust this to actual pressure at the observatory's altitude before returning a value to the client.
 The  method can be used to effect this adjustment.
 
	
*/
public void setPressure(double _theValue){
this.Pressure=_theValue;
}

/*
 Gets 
 Atmospheric pressure at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
		The units of this property are hectoPascals. Client and driver authors can use the method 
 to convert these units to and from milliBar, mm of mercury and inches of mercury.
		This must be the pressure at the observatory altitude and not the adjusted pressure at sea level.
 Please check whether your pressure sensor delivers local observatory pressure or sea level pressure and, if it returns sea level pressure, 
 adjust this to actual pressure at the observatory's altitude before returning a value to the client.
 The  method can be used to effect this adjustment.
 
	
*/
public double getPressure(){
return Pressure;
}

/*
 Sets 
 Rain rate at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
		The units of this property are millimetres per hour. Client and driver authors can use the method 
 to convert these units to and from inches per hour.
		This property can be interpreted as 0.0 = Dry any positive nonzero value = wet.
		Rainfall intensity is classified according to the rate of precipitation:
		
			Light rain — when the precipitation rate is less than 2.5 mm (0.098 in) per hour
			Moderate rain — when the precipitation rate is between 2.5 mm (0.098 in) and 10 mm (0.39 in) per hour
			Heavy rain — when the precipitation rate is between 10 mm (0.39 in) and 50 mm (2.0 in) per hour
			Violent rain — when the precipitation rate is > 50 mm (2.0 in) per hour
		
	
*/
public void setRainRate(double _theValue){
this.RainRate=_theValue;
}

/*
 Gets 
 Rain rate at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
		The units of this property are millimetres per hour. Client and driver authors can use the method 
 to convert these units to and from inches per hour.
		This property can be interpreted as 0.0 = Dry any positive nonzero value = wet.
		Rainfall intensity is classified according to the rate of precipitation:
		
			Light rain — when the precipitation rate is less than 2.5 mm (0.098 in) per hour
			Moderate rain — when the precipitation rate is between 2.5 mm (0.098 in) and 10 mm (0.39 in) per hour
			Heavy rain — when the precipitation rate is between 10 mm (0.39 in) and 50 mm (2.0 in) per hour
			Violent rain — when the precipitation rate is > 50 mm (2.0 in) per hour
		
	
*/
public double getRainRate(){
return RainRate;
}

/*
 Sets 
 Sky brightness at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
 This property returns the sky brightness measured in Lux.
 Luminance Examples in Lux
		
			
				IlluminanceSurfaces illuminated by:
			
			0.0001 luxMoonless, overcast night sky (starlight)
			0.002 luxMoonless clear night sky with airglow
			0.27–1.0 luxFull moon on a clear night
			3.4 luxDark limit of civil twilight under a clear sky
			50 luxFamily living room lights (Australia, 1998)
			80 luxOffice building hallway/toilet lighting
			100 luxVery dark overcast day
			320–500 luxOffice lighting
			400 luxSunrise or sunset on a clear day.
			1000 luxOvercast day; typical TV studio lighting
			10000–25000 luxFull daylight (not direct sun)
			32000–100000 luxDirect sunlight
		
	
*/
public void setSkyBrightness(double _theValue){
this.SkyBrightness=_theValue;
}

/*
 Gets 
 Sky brightness at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
 This property returns the sky brightness measured in Lux.
 Luminance Examples in Lux
		
			
				IlluminanceSurfaces illuminated by:
			
			0.0001 luxMoonless, overcast night sky (starlight)
			0.002 luxMoonless clear night sky with airglow
			0.27–1.0 luxFull moon on a clear night
			3.4 luxDark limit of civil twilight under a clear sky
			50 luxFamily living room lights (Australia, 1998)
			80 luxOffice building hallway/toilet lighting
			100 luxVery dark overcast day
			320–500 luxOffice lighting
			400 luxSunrise or sunset on a clear day.
			1000 luxOvercast day; typical TV studio lighting
			10000–25000 luxFull daylight (not direct sun)
			32000–100000 luxDirect sunlight
		
	
*/
public double getSkyBrightness(){
return SkyBrightness;
}

/*
 Sets 
 Sky quality at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
		Sky quality is typically measured in units of magnitudes per square arc second. A sky quality of 20 magnitudes per square arc second means that the
 overall sky appears with a brightness equivalent to having 1 magnitude 20 star in each square arc second of sky.
		Examples of typical sky quality values were published by Sky and Telescope (http://www.skyandtelescope.com/astronomy-resources/rate-your-skyglow/) and, in slightly adpated form, are reproduced below:
		
			
				
				
				
					
						Sky Quality (mag/arcsec2)
					
						Description
				
				
					
 22.0
					
 By convention, this is often assumed to be the average brightness of a moonless night sky that's completely free of artificial light pollution.
				
				
					
 21.0
					
 This is typical for a rural area with a medium-sized city not far away. It's comparable to the glow of the brightest section of the northern Milky Way, from Cygnus through Perseus. 
				
				
					
 20.0
					
 This is typical for the outer suburbs of a major metropolis. The summer Milky Way is readily visible but severely washed out.
				
				
					
 19.0
					
 Typical for a suburb with widely spaced single-family homes. It's a little brighter than a remote rural site at the end of nautical twilight, when the Sun is 12° below the horizon.
				
				
					
 18.0
					
 Bright suburb or dark urban neighborhood. It's also a typical zenith skyglow at a rural site when the Moon is full. The Milky Way is invisible, or nearly so.
				
				
					
 17.0
					
 Typical near the center of a major city.
				
				
					
 13.0
					
 The zenith skyglow at the end of civil twilight, roughly a half hour after sunset, when the Sun is 6° below the horizon. Venus and Jupiter are easy to see, but bright stars are just beginning to appear.
				
				
					
 7.0
					
 The zenith skyglow at sunrise or sunset
				
			
		
	
*/
public void setSkyQuality(double _theValue){
this.SkyQuality=_theValue;
}

/*
 Gets 
 Sky quality at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
		Sky quality is typically measured in units of magnitudes per square arc second. A sky quality of 20 magnitudes per square arc second means that the
 overall sky appears with a brightness equivalent to having 1 magnitude 20 star in each square arc second of sky.
		Examples of typical sky quality values were published by Sky and Telescope (http://www.skyandtelescope.com/astronomy-resources/rate-your-skyglow/) and, in slightly adpated form, are reproduced below:
		
			
				
				
				
					
						Sky Quality (mag/arcsec2)
					
						Description
				
				
					
 22.0
					
 By convention, this is often assumed to be the average brightness of a moonless night sky that's completely free of artificial light pollution.
				
				
					
 21.0
					
 This is typical for a rural area with a medium-sized city not far away. It's comparable to the glow of the brightest section of the northern Milky Way, from Cygnus through Perseus. 
				
				
					
 20.0
					
 This is typical for the outer suburbs of a major metropolis. The summer Milky Way is readily visible but severely washed out.
				
				
					
 19.0
					
 Typical for a suburb with widely spaced single-family homes. It's a little brighter than a remote rural site at the end of nautical twilight, when the Sun is 12° below the horizon.
				
				
					
 18.0
					
 Bright suburb or dark urban neighborhood. It's also a typical zenith skyglow at a rural site when the Moon is full. The Milky Way is invisible, or nearly so.
				
				
					
 17.0
					
 Typical near the center of a major city.
				
				
					
 13.0
					
 The zenith skyglow at the end of civil twilight, roughly a half hour after sunset, when the Sun is 6° below the horizon. Venus and Jupiter are easy to see, but bright stars are just beginning to appear.
				
				
					
 7.0
					
 The zenith skyglow at sunrise or sunset
				
			
		
	
*/
public double getSkyQuality(){
return SkyQuality;
}

/*
 Sets 
 Seeing at the observatory measured as star full width half maximum (FWHM) in arc secs.
 

		Optional property, can throw a PropertyNotImplementedException
	
*/
public void setStarFWHM(double _theValue){
this.StarFWHM=_theValue;
}

/*
 Gets 
 Seeing at the observatory measured as star full width half maximum (FWHM) in arc secs.
 

		Optional property, can throw a PropertyNotImplementedException
	
*/
public double getStarFWHM(){
return StarFWHM;
}

/*
 Sets 
 Sky temperature at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
		The units of this property are degrees Celsius. Driver and application authors can use the  method
 to convert these units to and from degrees Farenhheit.
		This is expected to be returned by an infra-red sensor looking at the sky. The lower the temperature the more the sky is likely to be clear.
	
*/
public void setSkyTemperature(double _theValue){
this.SkyTemperature=_theValue;
}

/*
 Gets 
 Sky temperature at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
		The units of this property are degrees Celsius. Driver and application authors can use the  method
 to convert these units to and from degrees Farenhheit.
		This is expected to be returned by an infra-red sensor looking at the sky. The lower the temperature the more the sky is likely to be clear.
	
*/
public double getSkyTemperature(){
return SkyTemperature;
}

/*
 Sets 
 Temperature at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
		The units of this property are degrees Celsius. Driver and application authors can use the  method
 to convert these units to and from degrees Farenhheit.
		This is expected to be the ambient temperature at the observatory.
	
*/
public void setTemperature(double _theValue){
this.Temperature=_theValue;
}

/*
 Gets 
 Temperature at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
		The units of this property are degrees Celsius. Driver and application authors can use the  method
 to convert these units to and from degrees Farenhheit.
		This is expected to be the ambient temperature at the observatory.
	
*/
public double getTemperature(){
return Temperature;
}

/*
 Sets 
 Wind direction at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
 The returned value must be between 0.0 and 360.0, interpreted according to the metereological standard, where a special value of 0.0 is returned when the wind speed is 0.0. 
 Wind direction is measured clockwise from north, through east, where East=90.0, South=180.0, West=270.0 and North=360.0.
 
*/
public void setWindDirection(double _theValue){
this.WindDirection=_theValue;
}

/*
 Gets 
 Wind direction at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
 The returned value must be between 0.0 and 360.0, interpreted according to the metereological standard, where a special value of 0.0 is returned when the wind speed is 0.0. 
 Wind direction is measured clockwise from north, through east, where East=90.0, South=180.0, West=270.0 and North=360.0.
 
*/
public double getWindDirection(){
return WindDirection;
}

/*
 Sets 
 Peak 3 second wind gust at the observatory over the last 2 minutes
 

		Optional property, can throw a PropertyNotImplementedException
 The units of this property are metres per second. Driver and application authors can use the  method
 to convert these units to and from miles per hour or knots.
 
*/
public void setWindGust(double _theValue){
this.WindGust=_theValue;
}

/*
 Gets 
 Peak 3 second wind gust at the observatory over the last 2 minutes
 

		Optional property, can throw a PropertyNotImplementedException
 The units of this property are metres per second. Driver and application authors can use the  method
 to convert these units to and from miles per hour or knots.
 
*/
public double getWindGust(){
return WindGust;
}

/*
 Sets 
 Wind speed at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
 The units of this property are metres per second. Driver and application authors can use the  method
 to convert these units to and from miles per hour or knots.
 
*/
public void setWindSpeed(double _theValue){
this.WindSpeed=_theValue;
}

/*
 Gets 
 Wind speed at the observatory
 

		Optional property, can throw a PropertyNotImplementedException
 The units of this property are metres per second. Driver and application authors can use the  method
 to convert these units to and from miles per hour or knots.
 
*/
public double getWindSpeed(){
return WindSpeed;
}
}
