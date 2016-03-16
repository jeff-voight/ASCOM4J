package ASCOM.DriverAccess;

/*

            Provides universal access to ObservingConditions drivers.
            Defines the IObservingConditions Interface. This interface provides a limited set of values that are useful
            for astronomical purposes for things such as determining if it is safe to open or operate the observing system,
            for recording astronomical data or determining refraction corrections.
            

It is NOT intended as a general purpose environmental sensor system.
            The Action method and 
            SupportedActions property 
            can be used to add driver specific sensors.
            
*/
public class ObservingConditions{

/*

            Gets and sets the time period over which observations will be averaged
            

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
            to convert these units to and from degrees Farenheit.
            The ASCOM specification requires that DewPoint and Humidity are either both implemented or both throw PropertyNotImplementedExceptions. It is not allowed for 
            one to be implemented and the other to throw a PropertyNotImplementedException. The Utilities component contains methods ( and 
            ) to convert DewPoint to Humidity and vice versa given the ambient temperature.
            This property should return a value between 0.0 and 100.0 where 0.0 = 0% relative humidity and 100.0 = 100% relative humidity.
            
*/
private double DewPoint;
/*

            Atmospheric humidity at the observatory
            

            Optional property, can throw a PropertyNotImplementedException when the  property also throws a PropertyNotImplementedException.
            Mandatory property, must NOT throw a PropertyNotImplementedException when the  property is implemented.
            The ASCOM specification requires that DewPoint and Humidity are either both implemented or both throw PropertyNotImplementedExceptions. It is not allowed for 
            one to be implemented and the other to throw a PropertyNotImplementedException. The Utilities component contains methods ( and 
            ) to convert DewPoint to Humidity and vice versa given the ambient temperature.
            
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
            
            Light rain — when the precipitation rate is < 2.5 mm (0.098 in) per hour
            Moderate rain — when the precipitation rate is between 2.5 mm (0.098 in) - 7.6 mm (0.30 in) or 10 mm (0.39 in) per hour
            Heavy rain — when the precipitation rate is > 7.6 mm (0.30 in) per hour, or between 10 mm (0.39 in) and 50 mm (2.0 in) per hour
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
            
*/
private double SkyQuality;
/*

            Seeing at the observatory measured as the average star full width half maximum (FWHM in arc secs) within a star field.
            

            Optional property, can throw a PropertyNotImplementedException
            
*/
private double StarFWHM;
/*

            Sky temperature at the observatory
            

            Optional property, can throw a PropertyNotImplementedException
            The units of this property are degrees Celsius. Driver and application authors can use the  method
            to convert these units to and from degrees Farenheit.
            This is expected to be returned by an infra-red sensor looking at the sky. The lower the temperature the more the sky is likely to be clear.
            
*/
private double SkyTemperature;
/*

            Temperature at the observatory
            

            Optional property, can throw a PropertyNotImplementedException
            The units of this property are degrees Celsius. Driver and application authors can use the  method
            to convert these units to and from degrees Farenheit.
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

            Creates an ObservingConditions object with the given Prog ID
            

*/
public void ObservingConditions(String){
return null;
}


/*

            Brings up the ASCOM Chooser Dialog to choose an ObservingConditions driver.
            

*/
public void Choose(String){
return null;
}


/*

             Provides the time since the sensor value was last updated
             

             Must NOT throw a MethodNotImplementedException when the specified sensor is implemented but must throw a MethodNotImplementedException when the specified sensor is not implemented.
            PropertyName must be the name of one of the sensor properties specified in the  interface. If the caller supplies some other value, throw an InvalidValueException.
             Return a negative value to indicate that no valid value has ever been received from the hardware.
             If an empty string is supplied as the PropertyName, the driver must return the time since the most recent update of any sensor. A MethodNotImplementedException must not be thrown in this circumstance.
             
*/
public void TimeSinceLastUpdate(String){
return null;
}


/*

            Provides a description of the sensor providing the requested property.
            

            Must NOT throw a MethodNotImplementedException when the specified sensor is implemented 
            but must throw a MethodNotImplementedException when the specified sensor is not implemented.
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
            Gets and sets the time period over which observations will be averaged
            

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
            Gets and sets the time period over which observations will be averaged
            

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
            to convert these units to and from degrees Farenheit.
            The ASCOM specification requires that DewPoint and Humidity are either both implemented or both throw PropertyNotImplementedExceptions. It is not allowed for 
            one to be implemented and the other to throw a PropertyNotImplementedException. The Utilities component contains methods ( and 
            ) to convert DewPoint to Humidity and vice versa given the ambient temperature.
            This property should return a value between 0.0 and 100.0 where 0.0 = 0% relative humidity and 100.0 = 100% relative humidity.
            
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
            to convert these units to and from degrees Farenheit.
            The ASCOM specification requires that DewPoint and Humidity are either both implemented or both throw PropertyNotImplementedExceptions. It is not allowed for 
            one to be implemented and the other to throw a PropertyNotImplementedException. The Utilities component contains methods ( and 
            ) to convert DewPoint to Humidity and vice versa given the ambient temperature.
            This property should return a value between 0.0 and 100.0 where 0.0 = 0% relative humidity and 100.0 = 100% relative humidity.
            
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
            
            Light rain — when the precipitation rate is < 2.5 mm (0.098 in) per hour
            Moderate rain — when the precipitation rate is between 2.5 mm (0.098 in) - 7.6 mm (0.30 in) or 10 mm (0.39 in) per hour
            Heavy rain — when the precipitation rate is > 7.6 mm (0.30 in) per hour, or between 10 mm (0.39 in) and 50 mm (2.0 in) per hour
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
            
            Light rain — when the precipitation rate is < 2.5 mm (0.098 in) per hour
            Moderate rain — when the precipitation rate is between 2.5 mm (0.098 in) - 7.6 mm (0.30 in) or 10 mm (0.39 in) per hour
            Heavy rain — when the precipitation rate is > 7.6 mm (0.30 in) per hour, or between 10 mm (0.39 in) and 50 mm (2.0 in) per hour
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
            
*/
public void setSkyQuality(double _theValue){
this.SkyQuality=_theValue;
}

/*
 Gets 
            Sky quality at the observatory
            

            Optional property, can throw a PropertyNotImplementedException
            
*/
public double getSkyQuality(){
return SkyQuality;
}

/*
 Sets 
            Seeing at the observatory measured as the average star full width half maximum (FWHM in arc secs) within a star field.
            

            Optional property, can throw a PropertyNotImplementedException
            
*/
public void setStarFWHM(double _theValue){
this.StarFWHM=_theValue;
}

/*
 Gets 
            Seeing at the observatory measured as the average star full width half maximum (FWHM in arc secs) within a star field.
            

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
            to convert these units to and from degrees Farenheit.
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
            to convert these units to and from degrees Farenheit.
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
            to convert these units to and from degrees Farenheit.
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
            to convert these units to and from degrees Farenheit.
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
