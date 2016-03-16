package ASCOM.DriverAccess;

/*

            Implements a camera class to access any registered ASCOM Camera
            


*/
public class Camera{

/*

            Sets the binning factor for the X axis, also returns the current value.  
            

            Should default to 1 when the camera connection is established.  Note:  driver does not check
            for compatible subframe values when this value is set; rather they are checked upon StartExposure.
            
*/
private double BinX;
/*

            Sets the binning factor for the Y axis, also returns the current value. 
            

            Should default to 1 when the camera connection is established.  Note:  driver does not check
            for compatible subframe values when this value is set; rather they are checked upon StartExposure.
            
*/
private double BinY;
/*

            Returns the current CCD temperature in degrees Celsius.
            

            Only valid if   is True.
            
*/
private double CCDTemperature;
/*

            Returns the current camera operational state
            

            Returns one of the following status information:
            
            Value  State           Meaning
            0      CameraIdle      At idle state, available to start exposure
            1      CameraWaiting   Exposure started but waiting (for shutter, trigger, filter wheel, etc.)
            2      CameraExposing  Exposure currently in progress
            3      CameraReading   CCD array is being read out (digitized)
            4      CameraDownload  Downloading data to PC
            5      CameraError     Camera error condition serious enough to prevent further operations (connection fail, etc.).
            
            
*/
private double CameraState;
/*

            Returns the width of the CCD camera chip in unbinned pixels.
            

*/
private double CameraXSize;
/*

            Returns the height of the CCD camera chip in unbinned pixels.
            

*/
private double CameraYSize;
/*

            Returns True if the camera can abort exposures; False if not.
            

*/
private double CanAbortExposure;
/*

            Returns a flag showing whether this camera supports asymmetric binning
            

            If True, the camera can have different binning on the X and Y axes, as
            determined by  and . If False, the binning must be equal on the X and Y axes.
            
*/
private double CanAsymmetricBin;
/*

            If True, the camera's cooler power setting can be read.
            

*/
private double CanGetCoolerPower;
/*

            Returns a flag indicating whether this camera supports pulse guiding
            

            Returns True if the camera can send autoguider pulses to the telescope mount; False if not.  
            Note: this does not provide any indication of whether the autoguider cable is actually connected.
            
*/
private double CanPulseGuide;
/*

            Returns a flag indicatig whether this camera supports setting the CCD temperature
            

            If True, the camera's cooler setpoint can be adjusted. If False, the camera
            either uses open-loop cooling or does not have the ability to adjust temperature
            from software, and setting the  property has no effect.
            
*/
private double CanSetCCDTemperature;
/*

            Returns a flag indicating whether this camera can stop an exposure that is in progress
            

            Some cameras support , which allows the exposure to be terminated
            before the exposure timer completes, but will still read out the image.  Returns
            True if   is available, False if not.
            
*/
private double CanStopExposure;
/*

            Turns on and off the camera cooler, and returns the current on/off state.
            

            Warning: turning the cooler off when the cooler is operating at high delta-T
            (typically >20C below ambient) may result in thermal shock.  Repeated thermal
            shock may lead to damage to the sensor or cooler stack.  Please consult the
            documentation supplied with the camera for further information.
            
*/
private double CoolerOn;
/*

            Returns the present cooler power level, in percent.
            

            Returns zero if  is False.
            
*/
private double CoolerPower;
/*

            Returns the gain of the camera in photoelectrons per A/D unit.
            

            Some cameras have multiple gain modes; these should be selected via the   and thus are
            static during a session.
            
*/
private double ElectronsPerADU;
/*

            Reports the full well capacity of the camera in electrons, at the current camera settings (binning, SetupDialog settings, etc.)
            

*/
private double FullWellCapacity;
/*

            Returns a flag indicating whether this camera has a mechanical shutter
            

            If True, the camera has a mechanical shutter. If False, the camera does not have
            a shutter.  If there is no shutter, the  StartExposure command will ignore the
            Light parameter.
            
*/
private double HasShutter;
/*

            Returns the current heat sink temperature (called "ambient temperature" by some manufacturers) in degrees Celsius. 
            

            Only valid if   is True.
            
*/
private double HeatSinkTemperature;
/*

            Returns a safearray of int of size  *  containing the pixel values from the last exposure. 
            

            The application must inspect the Safearray parameters to determine the dimensions. 
            Note: if  or  is changed after a call to StartExposure it will 
            have no effect on the size of this array. This is the preferred method for programs (not scripts) to download 
            iamges since it requires much less memory.
            For color or multispectral cameras, will produce an array of   *  *
            NumPlanes.  If the application cannot handle multispectral images, it should use just the first plane.
            
*/
private double ImageArray;
/*

            Returns a safearray of Variant of size  *  containing the pixel values from the last exposure. 
            

            The application must inspect the Safearray parameters to
            determine the dimensions. Note: if  or  is changed after a call to
            StartExposure it will have no effect on the size of this array. This property
            should only be used from scripts due to the extremely high memory utilization on
            large image arrays (26 bytes per pixel). Pixels values should be in Short, int,
            or Double format.
            For color or multispectral cameras, will produce an array of  *  *
            NumPlanes.  If the application cannot handle multispectral images, it should use
            just the first plane.
            
*/
private double ImageArrayVariant;
/*

            Returns a flag indicating whether the image is ready to be downloaded fom the camera
            

            If True, there is an image from the camera available. If False, no image
            is available and attempts to use the  method will produce an exception
            
*/
private double ImageReady;
/*

            Returns a flag indicating whether the camera is currrently in a PulseGuide operation.
            

            If True, pulse guiding is in progress. Required if the PulseGuide method
            (which is non-blocking) is implemented. See the PulseGuide method.
            
*/
private double IsPulseGuiding;
/*

            Reports the actual exposure duration in seconds (i.e. shutter open time).  
            

            This may differ from the exposure time requested due to shutter latency, camera timing precision, etc.
            
*/
private double LastExposureDuration;
/*

            Reports the actual exposure start in the FITS-standard CCYY-MM-DDThh:mm:ss[.sss...] format.
            

*/
private double LastExposureStartTime;
/*

            Reports the maximum ADU value the camera can produce.
            

*/
private double MaxADU;
/*

            Returns the maximum allowed binning for the X camera axis
            

            If  = False, returns the maximum allowed binning factor. If
             = True, returns the maximum allowed binning factor for the X axis.
            
*/
private double MaxBinX;
/*

            Returns the maximum allowed binning for the Y camera axis
            

            If  = False, equals . If  = True,
            returns the maximum allowed binning factor for the Y axis.
            
*/
private double MaxBinY;
/*

            Sets the subframe width. Also returns the current value.  
            

            If binning is active, value is in binned pixels.  No error check is performed when the value is set. 
            Should default to .
            
*/
private double NumX;
/*

            Sets the subframe height. Also returns the current value.
            

            If binning is active,
            value is in binned pixels.  No error check is performed when the value is set.
            Should default to .
            
*/
private double NumY;
/*

            Returns the width of the CCD chip pixels in microns.
            

*/
private double PixelSizeX;
/*

            Returns the height of the CCD chip pixels in microns.
            

*/
private double PixelSizeY;
/*

            Sets the camera cooler setpoint in degrees Celsius, and returns the current setpoint.
            

            The driver should throw an  if an attempt is made to set  
            outside the valid range for the camera. As an assitance to driver authors, to protect equipment and prevent harm to individuals, 
            Conform will report an issue if it is possible to set  below -280C or above +100C.
            Note:  Camera hardware and/or driver should perform cooler ramping, to prevent
            thermal shock and potential damage to the CCD array or cooler stack.
            
*/
private double SetCCDTemperature;
/*

            Sets the subframe start position for the X axis (0 based) and returns the current value.
            

            If binning is active, value is in binned pixels.
            
*/
private double StartX;
/*

            Sets the subframe start position for the Y axis (0 based). Also returns the current value.  
            

            If binning is active, value is in binned pixels.
            
*/
private double StartY;
/*

            Bayer X offset index, Interface Version 2 only
            
Returns the X offset of the Bayer matrix, as defined in . Value returned must be in the range 0 to M-1, 
            where M is the width of the Bayer matrix. The offset is relative to the 0,0 pixel in the sensor array, and does not change to 
            reflect subframe settings.
            This is only available for the Camera Interface Version 2
            
*/
private double BayerOffsetX;
/*

            Returns the Y offset of the Bayer matrix, as defined in , Interface Version 2 only
            
The offset is relative to the 0,0 pixel in the sensor array, and does not change to reflect subframe settings. 
            It is recommended that this function be called only after a connection is established with 
            the camera hardware, to ensure that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
private double BayerOffsetY;
/*

            Camera has a fast readout mode, Interface Version 2 only
            
It is recommended that this function be called only after a connection is established with the camera hardware, to 
            ensure that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
private double CanFastReadout;
/*

            Returns the maximum exposure time supported by StartExposure, Interface Version 2 only
            
It is recommended that this function be called only after 
            a connection is established with the camera hardware, to ensure that the driver is aware of the capabilities of the 
            specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
private double ExposureMax;
/*

            Minimium exposure time, Interface Version 2 only
            
This must be a non-zero number representing the shortest possible exposure time supported by the camera model.
            Please note that for bias frame acquisition an even shorter exposure may be possible; please see StartExposure 
            for more information.
            It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
            that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
private double ExposureMin;
/*

            Exposure resolution, Interface Version 2 only
            
This can be used, for example, to specify the resolution of a user interface "spin control" used to dial in the exposure time.
            Please note that the Duration provided to StartExposure does not have to be an exact multiple of this number; 
            the driver should choose the closest available value. Also in some cases the resolution may not be constant over the full range 
            of exposure times; in this case the smallest increment would be appropriate. 
            It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
            that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
private double ExposureResolution;
/*

            Fast readout mode, Interface Version 2 only
            
Must thrown an exception if no connection is established to the camera. Must throw 
            an exception if  returns False.
            Many cameras have a "fast mode" intended for use in focusing. When set to True, the camera will operate in Fast mode; when 
            set False, the camera will operate normally. This property should default to False.
            Please note that this function may in some cases interact with ; for example, there may be modes where 
            the Fast/Normal switch is meaningless. In this case, it may be preferable to use the  function to control 
            fast/normal switching.
            If this feature is not available, then  must return False.
            This is only available for the Camera Interface Version 2
            
*/
private double FastReadout;
/*

             Index into the  array for the selected camera gain, Interface Version 2 only
             

              can be used to adjust the gain setting of the camera, if supported. There are two typical usage scenarios:
             
             DSLR Cameras -  will return a 0-based array of strings, which correspond to different gain settings such as 
             "ISO 800".  must be set to an integer in this range.  and  must thrown an exception if 
             this mode is used.
             Adjustable gain CCD cameras -  and  return integers, which specify the valid range for  and .
             
            The driver must default  to a valid value. 
            Please note that  may in some cases affect the gain of the camera; if so the driver must be written such 
             that the two properties do not conflict if both are used.
             This is only available for the Camera Interface Version 2
             
*/
private double Gain;
/*

            Maximum value of , Interface Version 2 only
            
When specifying the gain setting with an integer value,  is used in conjunction with  to 
            specify the range of valid settings.
             shall be greater than . If either is available, then both must be available.
            Please see  for more information.
            It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
            that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
private double GainMax;
/*

            Minimum value of , Interface Version 2 only
            
When specifying the gain setting with an integer value,  is used in conjunction with  to 
            specify the range of valid settings.
             shall be greater than . If either is available, then both must be available.
            Please see  for more information.
            It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
            that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
private double GainMin;
/*

            Gains supported by the camera, Interface Version 2 only
            
 provides a 0-based array of available gain settings.  This is often used to specify ISO settings for DSLR cameras.  
            Typically the application software will display the available gain settings in a drop list. The application will then supply 
            the selected index to the driver via the  property. 
            The  setting may alternatively be specified using integer values; if this mode is used then  is invalid 
            and must throw an exception. Please see  and  for more information.
            It is recommended that this function be called only after a connection is established with the camera hardware, 
            to ensure that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
private double Gains;
/*

            Percent conpleted, Interface Version 2 only
            
If valid, returns an integer between 0 and 100, where 0 indicates 0% progress (function just started) and 
            100 indicates 100% progress (i.e. completion).
            At the discretion of the driver author,  may optionally be valid 
            when  is in any or all of the following 
            states: , 
            ,  
            or . In all other states an exception shall be thrown.
            Typically the application user interface will show a progress bar based on the  value.
            Please note that client applications are not required to use this value, and in some cases may display status 
            information based on other information, such as time elapsed.
            This is only available for the Camera Interface Version 2
            
*/
private double PercentCompleted;
/*

            Readout mode, Interface Version 2 only
            
 is an index into the array , and selects the desired readout mode for the camera.  
            Defaults to 0 if not set.  Throws an exception if the selected mode is not available.
            It is strongly recommended, but not required, that driver authors make the 0-index mode suitable for standard imaging operations, 
            since it is the default.
            Please see  for additional information.
            This is only available for the Camera Interface Version 2
            
*/
private double ReadoutMode;
/*

            List of available readout modes, Interface Version 2 only
            
This property provides an array of strings, each of which describes an available readout mode of the camera.  
            At least two strings must be present in the list. The user interface of a control application will typically present to the 
            user a drop-list of modes.  The choice of available modes made available is entirely at the discretion of the driver author. 
            Please note that if the camera has many different modes of operation, then the most commonly adjusted settings should be in 
            ; additional settings may be provided using .
            To select a mode, the application will set  to the index of the desired mode.  The index is zero-based.
            This property should only be read while a connection to the camera is actually established.  Drivers often support 
            multiple cameras with different capabilities, which are not known until the connection is made.  If the available readout modes 
            are not known because no connection has been established, this property shall throw an exception.
            Please note that the default  setting is 0. It is strongly recommended, but not required, that 
            driver authors use the 0-index mode for standard imaging operations, since it is the default.
            This feature may be used in parallel with ; however, care should be taken to ensure that the two 
            features work together consistently. If there are modes that are inconsistent having a separate fast/normal switch, then it 
            may be better to simply list Fast as one of the .
            It is recommended that this function be called only after a connection is established with 
            the camera hardware, to ensure that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
private double ReadoutModes;
/*

            Sensor name, Interface Version 2 only
            
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
            This is only available for the Camera Interface Version 2
            
*/
private double SensorName;
/*

             Type of colour information returned by the the camera sensor, Interface Version 2 only
             

             This is only available for the Camera Interface Version 2
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
             
             Camera produces color image directly, requiring not Bayer decoding
             
             
             
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
              can possibly change between exposures, for example if Camera.ReadoutMode is changed, and should always be checked after each exposure.
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
             
             
             
             
             The alignment of the array may be modified by  and . 
             The offset is measured from the 0,0 position in the sensor array to the upper left corner of the Bayer matrix table. 
             Please note that the Bayer offset values are not affected by subframe settings.
             For example, if a CMYG2 sensor has a Bayer matrix offset as shown below,  is 0 and  is 1:
            
             
             
             
             
             
             
             
             
             
             X = 0
             
             X = 1
             
             
             
             
             Y = 0
             
             G
             
             M
             
             
             
             
             Y = 1
             
             C
             
             Y
             
             
             
             Y = 2
             
             M
             
             G
             
             
             
             
             Y = 3
             
             C
             
             Y
             
             
             
             It is recommended that this function be called only after a connection is established with the camera hardware, to ensure that 
             the driver is aware of the capabilities of the specific camera model.
             
*/
private double SensorType;


/*

            Creates an instance of the camera class.
            

*/
public void Camera(String){
return null;
}


/*

            The Choose() method returns the DriverID of the selected driver.
            Choose() allows you to optionally pass the DriverID of a "current" driver,
            and the corresponding camera type is pre-selected in the Chooser///s list.
            In this case, the OK button starts out enabled (lit-up); the assumption is that the pre-selected driver has already been configured.
            

*/
public void Choose(String){
return null;
}


/*

            Aborts the current exposure, if any, and returns the camera to Idle state.
            

            NOTES:
            
            Must throw exception if camera is not idle and abort is unsuccessful (or not possible, e.g. during download).
            Must throw exception if hardware or communications error occurs.
            Must NOT throw an exception if the camera is already idle.
            
            
*/
public void AbortExposure(){
return null;
}


/*

            Activates the Camera's mount control sytem to instruct the mount to move in a particular direction for a given period of time
            

            This method returns only after the move has completed.
            
            The (symbolic) values for GuideDirections are:
            
            Constant     Value      Description
            guideNorth     0        North (+ declination/elevation)
            guideSouth     1        South (- declination/elevation)
            guideEast      2        East (+ right ascension/azimuth)
            guideWest      3        West (+ right ascension/azimuth)
            
            
            Note: directions are nominal and may depend on exact mount wiring.  
             must be opposite , and 
             must be opposite .
            
*/
public void PulseGuide(ASCOM.DeviceInterface.GuideDirections,Int32){
return null;
}


/*

            Starts an exposure. Use  to check when the exposure is complete.
            

            A dark frame or bias exposure may be shorter than the V2  value and for a bias frame can be zero.
            Check the value of Light and allow exposures down to 0 seconds 
            if Light is False.  If the hardware will not
            support an exposure duration of zero then, for dark and bias frames, set it to the minimum that is possible.
            Some applications will set an exposure time of zero for bias frames so it's important that the driver allows this.
            
*/
public void StartExposure(Double,Boolean){
return null;
}


/*

            Stops the current exposure, if any.
            

            If an exposure is in progress, the readout process is initiated.  Ignored if readout is already in process.
            
*/
public void StopExposure(){
return null;
}

/*
 Sets 
            Sets the binning factor for the X axis, also returns the current value.  
            

            Should default to 1 when the camera connection is established.  Note:  driver does not check
            for compatible subframe values when this value is set; rather they are checked upon StartExposure.
            
*/
public void setBinX(double _theValue){
this.BinX=_theValue;
}

/*
 Gets 
            Sets the binning factor for the X axis, also returns the current value.  
            

            Should default to 1 when the camera connection is established.  Note:  driver does not check
            for compatible subframe values when this value is set; rather they are checked upon StartExposure.
            
*/
public double getBinX(){
return BinX;
}

/*
 Sets 
            Sets the binning factor for the Y axis, also returns the current value. 
            

            Should default to 1 when the camera connection is established.  Note:  driver does not check
            for compatible subframe values when this value is set; rather they are checked upon StartExposure.
            
*/
public void setBinY(double _theValue){
this.BinY=_theValue;
}

/*
 Gets 
            Sets the binning factor for the Y axis, also returns the current value. 
            

            Should default to 1 when the camera connection is established.  Note:  driver does not check
            for compatible subframe values when this value is set; rather they are checked upon StartExposure.
            
*/
public double getBinY(){
return BinY;
}

/*
 Sets 
            Returns the current CCD temperature in degrees Celsius.
            

            Only valid if   is True.
            
*/
public void setCCDTemperature(double _theValue){
this.CCDTemperature=_theValue;
}

/*
 Gets 
            Returns the current CCD temperature in degrees Celsius.
            

            Only valid if   is True.
            
*/
public double getCCDTemperature(){
return CCDTemperature;
}

/*
 Sets 
            Returns the current camera operational state
            

            Returns one of the following status information:
            
            Value  State           Meaning
            0      CameraIdle      At idle state, available to start exposure
            1      CameraWaiting   Exposure started but waiting (for shutter, trigger, filter wheel, etc.)
            2      CameraExposing  Exposure currently in progress
            3      CameraReading   CCD array is being read out (digitized)
            4      CameraDownload  Downloading data to PC
            5      CameraError     Camera error condition serious enough to prevent further operations (connection fail, etc.).
            
            
*/
public void setCameraState(double _theValue){
this.CameraState=_theValue;
}

/*
 Gets 
            Returns the current camera operational state
            

            Returns one of the following status information:
            
            Value  State           Meaning
            0      CameraIdle      At idle state, available to start exposure
            1      CameraWaiting   Exposure started but waiting (for shutter, trigger, filter wheel, etc.)
            2      CameraExposing  Exposure currently in progress
            3      CameraReading   CCD array is being read out (digitized)
            4      CameraDownload  Downloading data to PC
            5      CameraError     Camera error condition serious enough to prevent further operations (connection fail, etc.).
            
            
*/
public double getCameraState(){
return CameraState;
}

/*
 Sets 
            Returns the width of the CCD camera chip in unbinned pixels.
            

*/
public void setCameraXSize(double _theValue){
this.CameraXSize=_theValue;
}

/*
 Gets 
            Returns the width of the CCD camera chip in unbinned pixels.
            

*/
public double getCameraXSize(){
return CameraXSize;
}

/*
 Sets 
            Returns the height of the CCD camera chip in unbinned pixels.
            

*/
public void setCameraYSize(double _theValue){
this.CameraYSize=_theValue;
}

/*
 Gets 
            Returns the height of the CCD camera chip in unbinned pixels.
            

*/
public double getCameraYSize(){
return CameraYSize;
}

/*
 Sets 
            Returns True if the camera can abort exposures; False if not.
            

*/
public void setCanAbortExposure(double _theValue){
this.CanAbortExposure=_theValue;
}

/*
 Gets 
            Returns True if the camera can abort exposures; False if not.
            

*/
public double getCanAbortExposure(){
return CanAbortExposure;
}

/*
 Sets 
            Returns a flag showing whether this camera supports asymmetric binning
            

            If True, the camera can have different binning on the X and Y axes, as
            determined by  and . If False, the binning must be equal on the X and Y axes.
            
*/
public void setCanAsymmetricBin(double _theValue){
this.CanAsymmetricBin=_theValue;
}

/*
 Gets 
            Returns a flag showing whether this camera supports asymmetric binning
            

            If True, the camera can have different binning on the X and Y axes, as
            determined by  and . If False, the binning must be equal on the X and Y axes.
            
*/
public double getCanAsymmetricBin(){
return CanAsymmetricBin;
}

/*
 Sets 
            If True, the camera's cooler power setting can be read.
            

*/
public void setCanGetCoolerPower(double _theValue){
this.CanGetCoolerPower=_theValue;
}

/*
 Gets 
            If True, the camera's cooler power setting can be read.
            

*/
public double getCanGetCoolerPower(){
return CanGetCoolerPower;
}

/*
 Sets 
            Returns a flag indicating whether this camera supports pulse guiding
            

            Returns True if the camera can send autoguider pulses to the telescope mount; False if not.  
            Note: this does not provide any indication of whether the autoguider cable is actually connected.
            
*/
public void setCanPulseGuide(double _theValue){
this.CanPulseGuide=_theValue;
}

/*
 Gets 
            Returns a flag indicating whether this camera supports pulse guiding
            

            Returns True if the camera can send autoguider pulses to the telescope mount; False if not.  
            Note: this does not provide any indication of whether the autoguider cable is actually connected.
            
*/
public double getCanPulseGuide(){
return CanPulseGuide;
}

/*
 Sets 
            Returns a flag indicatig whether this camera supports setting the CCD temperature
            

            If True, the camera's cooler setpoint can be adjusted. If False, the camera
            either uses open-loop cooling or does not have the ability to adjust temperature
            from software, and setting the  property has no effect.
            
*/
public void setCanSetCCDTemperature(double _theValue){
this.CanSetCCDTemperature=_theValue;
}

/*
 Gets 
            Returns a flag indicatig whether this camera supports setting the CCD temperature
            

            If True, the camera's cooler setpoint can be adjusted. If False, the camera
            either uses open-loop cooling or does not have the ability to adjust temperature
            from software, and setting the  property has no effect.
            
*/
public double getCanSetCCDTemperature(){
return CanSetCCDTemperature;
}

/*
 Sets 
            Returns a flag indicating whether this camera can stop an exposure that is in progress
            

            Some cameras support , which allows the exposure to be terminated
            before the exposure timer completes, but will still read out the image.  Returns
            True if   is available, False if not.
            
*/
public void setCanStopExposure(double _theValue){
this.CanStopExposure=_theValue;
}

/*
 Gets 
            Returns a flag indicating whether this camera can stop an exposure that is in progress
            

            Some cameras support , which allows the exposure to be terminated
            before the exposure timer completes, but will still read out the image.  Returns
            True if   is available, False if not.
            
*/
public double getCanStopExposure(){
return CanStopExposure;
}

/*
 Sets 
            Turns on and off the camera cooler, and returns the current on/off state.
            

            Warning: turning the cooler off when the cooler is operating at high delta-T
            (typically >20C below ambient) may result in thermal shock.  Repeated thermal
            shock may lead to damage to the sensor or cooler stack.  Please consult the
            documentation supplied with the camera for further information.
            
*/
public void setCoolerOn(double _theValue){
this.CoolerOn=_theValue;
}

/*
 Gets 
            Turns on and off the camera cooler, and returns the current on/off state.
            

            Warning: turning the cooler off when the cooler is operating at high delta-T
            (typically >20C below ambient) may result in thermal shock.  Repeated thermal
            shock may lead to damage to the sensor or cooler stack.  Please consult the
            documentation supplied with the camera for further information.
            
*/
public double getCoolerOn(){
return CoolerOn;
}

/*
 Sets 
            Returns the present cooler power level, in percent.
            

            Returns zero if  is False.
            
*/
public void setCoolerPower(double _theValue){
this.CoolerPower=_theValue;
}

/*
 Gets 
            Returns the present cooler power level, in percent.
            

            Returns zero if  is False.
            
*/
public double getCoolerPower(){
return CoolerPower;
}

/*
 Sets 
            Returns the gain of the camera in photoelectrons per A/D unit.
            

            Some cameras have multiple gain modes; these should be selected via the   and thus are
            static during a session.
            
*/
public void setElectronsPerADU(double _theValue){
this.ElectronsPerADU=_theValue;
}

/*
 Gets 
            Returns the gain of the camera in photoelectrons per A/D unit.
            

            Some cameras have multiple gain modes; these should be selected via the   and thus are
            static during a session.
            
*/
public double getElectronsPerADU(){
return ElectronsPerADU;
}

/*
 Sets 
            Reports the full well capacity of the camera in electrons, at the current camera settings (binning, SetupDialog settings, etc.)
            

*/
public void setFullWellCapacity(double _theValue){
this.FullWellCapacity=_theValue;
}

/*
 Gets 
            Reports the full well capacity of the camera in electrons, at the current camera settings (binning, SetupDialog settings, etc.)
            

*/
public double getFullWellCapacity(){
return FullWellCapacity;
}

/*
 Sets 
            Returns a flag indicating whether this camera has a mechanical shutter
            

            If True, the camera has a mechanical shutter. If False, the camera does not have
            a shutter.  If there is no shutter, the  StartExposure command will ignore the
            Light parameter.
            
*/
public void setHasShutter(double _theValue){
this.HasShutter=_theValue;
}

/*
 Gets 
            Returns a flag indicating whether this camera has a mechanical shutter
            

            If True, the camera has a mechanical shutter. If False, the camera does not have
            a shutter.  If there is no shutter, the  StartExposure command will ignore the
            Light parameter.
            
*/
public double getHasShutter(){
return HasShutter;
}

/*
 Sets 
            Returns the current heat sink temperature (called "ambient temperature" by some manufacturers) in degrees Celsius. 
            

            Only valid if   is True.
            
*/
public void setHeatSinkTemperature(double _theValue){
this.HeatSinkTemperature=_theValue;
}

/*
 Gets 
            Returns the current heat sink temperature (called "ambient temperature" by some manufacturers) in degrees Celsius. 
            

            Only valid if   is True.
            
*/
public double getHeatSinkTemperature(){
return HeatSinkTemperature;
}

/*
 Sets 
            Returns a safearray of int of size  *  containing the pixel values from the last exposure. 
            

            The application must inspect the Safearray parameters to determine the dimensions. 
            Note: if  or  is changed after a call to StartExposure it will 
            have no effect on the size of this array. This is the preferred method for programs (not scripts) to download 
            iamges since it requires much less memory.
            For color or multispectral cameras, will produce an array of   *  *
            NumPlanes.  If the application cannot handle multispectral images, it should use just the first plane.
            
*/
public void setImageArray(double _theValue){
this.ImageArray=_theValue;
}

/*
 Gets 
            Returns a safearray of int of size  *  containing the pixel values from the last exposure. 
            

            The application must inspect the Safearray parameters to determine the dimensions. 
            Note: if  or  is changed after a call to StartExposure it will 
            have no effect on the size of this array. This is the preferred method for programs (not scripts) to download 
            iamges since it requires much less memory.
            For color or multispectral cameras, will produce an array of   *  *
            NumPlanes.  If the application cannot handle multispectral images, it should use just the first plane.
            
*/
public double getImageArray(){
return ImageArray;
}

/*
 Sets 
            Returns a safearray of Variant of size  *  containing the pixel values from the last exposure. 
            

            The application must inspect the Safearray parameters to
            determine the dimensions. Note: if  or  is changed after a call to
            StartExposure it will have no effect on the size of this array. This property
            should only be used from scripts due to the extremely high memory utilization on
            large image arrays (26 bytes per pixel). Pixels values should be in Short, int,
            or Double format.
            For color or multispectral cameras, will produce an array of  *  *
            NumPlanes.  If the application cannot handle multispectral images, it should use
            just the first plane.
            
*/
public void setImageArrayVariant(double _theValue){
this.ImageArrayVariant=_theValue;
}

/*
 Gets 
            Returns a safearray of Variant of size  *  containing the pixel values from the last exposure. 
            

            The application must inspect the Safearray parameters to
            determine the dimensions. Note: if  or  is changed after a call to
            StartExposure it will have no effect on the size of this array. This property
            should only be used from scripts due to the extremely high memory utilization on
            large image arrays (26 bytes per pixel). Pixels values should be in Short, int,
            or Double format.
            For color or multispectral cameras, will produce an array of  *  *
            NumPlanes.  If the application cannot handle multispectral images, it should use
            just the first plane.
            
*/
public double getImageArrayVariant(){
return ImageArrayVariant;
}

/*
 Sets 
            Returns a flag indicating whether the image is ready to be downloaded fom the camera
            

            If True, there is an image from the camera available. If False, no image
            is available and attempts to use the  method will produce an exception
            
*/
public void setImageReady(double _theValue){
this.ImageReady=_theValue;
}

/*
 Gets 
            Returns a flag indicating whether the image is ready to be downloaded fom the camera
            

            If True, there is an image from the camera available. If False, no image
            is available and attempts to use the  method will produce an exception
            
*/
public double getImageReady(){
return ImageReady;
}

/*
 Sets 
            Returns a flag indicating whether the camera is currrently in a PulseGuide operation.
            

            If True, pulse guiding is in progress. Required if the PulseGuide method
            (which is non-blocking) is implemented. See the PulseGuide method.
            
*/
public void setIsPulseGuiding(double _theValue){
this.IsPulseGuiding=_theValue;
}

/*
 Gets 
            Returns a flag indicating whether the camera is currrently in a PulseGuide operation.
            

            If True, pulse guiding is in progress. Required if the PulseGuide method
            (which is non-blocking) is implemented. See the PulseGuide method.
            
*/
public double getIsPulseGuiding(){
return IsPulseGuiding;
}

/*
 Sets 
            Reports the actual exposure duration in seconds (i.e. shutter open time).  
            

            This may differ from the exposure time requested due to shutter latency, camera timing precision, etc.
            
*/
public void setLastExposureDuration(double _theValue){
this.LastExposureDuration=_theValue;
}

/*
 Gets 
            Reports the actual exposure duration in seconds (i.e. shutter open time).  
            

            This may differ from the exposure time requested due to shutter latency, camera timing precision, etc.
            
*/
public double getLastExposureDuration(){
return LastExposureDuration;
}

/*
 Sets 
            Reports the actual exposure start in the FITS-standard CCYY-MM-DDThh:mm:ss[.sss...] format.
            

*/
public void setLastExposureStartTime(double _theValue){
this.LastExposureStartTime=_theValue;
}

/*
 Gets 
            Reports the actual exposure start in the FITS-standard CCYY-MM-DDThh:mm:ss[.sss...] format.
            

*/
public double getLastExposureStartTime(){
return LastExposureStartTime;
}

/*
 Sets 
            Reports the maximum ADU value the camera can produce.
            

*/
public void setMaxADU(double _theValue){
this.MaxADU=_theValue;
}

/*
 Gets 
            Reports the maximum ADU value the camera can produce.
            

*/
public double getMaxADU(){
return MaxADU;
}

/*
 Sets 
            Returns the maximum allowed binning for the X camera axis
            

            If  = False, returns the maximum allowed binning factor. If
             = True, returns the maximum allowed binning factor for the X axis.
            
*/
public void setMaxBinX(double _theValue){
this.MaxBinX=_theValue;
}

/*
 Gets 
            Returns the maximum allowed binning for the X camera axis
            

            If  = False, returns the maximum allowed binning factor. If
             = True, returns the maximum allowed binning factor for the X axis.
            
*/
public double getMaxBinX(){
return MaxBinX;
}

/*
 Sets 
            Returns the maximum allowed binning for the Y camera axis
            

            If  = False, equals . If  = True,
            returns the maximum allowed binning factor for the Y axis.
            
*/
public void setMaxBinY(double _theValue){
this.MaxBinY=_theValue;
}

/*
 Gets 
            Returns the maximum allowed binning for the Y camera axis
            

            If  = False, equals . If  = True,
            returns the maximum allowed binning factor for the Y axis.
            
*/
public double getMaxBinY(){
return MaxBinY;
}

/*
 Sets 
            Sets the subframe width. Also returns the current value.  
            

            If binning is active, value is in binned pixels.  No error check is performed when the value is set. 
            Should default to .
            
*/
public void setNumX(double _theValue){
this.NumX=_theValue;
}

/*
 Gets 
            Sets the subframe width. Also returns the current value.  
            

            If binning is active, value is in binned pixels.  No error check is performed when the value is set. 
            Should default to .
            
*/
public double getNumX(){
return NumX;
}

/*
 Sets 
            Sets the subframe height. Also returns the current value.
            

            If binning is active,
            value is in binned pixels.  No error check is performed when the value is set.
            Should default to .
            
*/
public void setNumY(double _theValue){
this.NumY=_theValue;
}

/*
 Gets 
            Sets the subframe height. Also returns the current value.
            

            If binning is active,
            value is in binned pixels.  No error check is performed when the value is set.
            Should default to .
            
*/
public double getNumY(){
return NumY;
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
            Sets the camera cooler setpoint in degrees Celsius, and returns the current setpoint.
            

            The driver should throw an  if an attempt is made to set  
            outside the valid range for the camera. As an assitance to driver authors, to protect equipment and prevent harm to individuals, 
            Conform will report an issue if it is possible to set  below -280C or above +100C.
            Note:  Camera hardware and/or driver should perform cooler ramping, to prevent
            thermal shock and potential damage to the CCD array or cooler stack.
            
*/
public void setSetCCDTemperature(double _theValue){
this.SetCCDTemperature=_theValue;
}

/*
 Gets 
            Sets the camera cooler setpoint in degrees Celsius, and returns the current setpoint.
            

            The driver should throw an  if an attempt is made to set  
            outside the valid range for the camera. As an assitance to driver authors, to protect equipment and prevent harm to individuals, 
            Conform will report an issue if it is possible to set  below -280C or above +100C.
            Note:  Camera hardware and/or driver should perform cooler ramping, to prevent
            thermal shock and potential damage to the CCD array or cooler stack.
            
*/
public double getSetCCDTemperature(){
return SetCCDTemperature;
}

/*
 Sets 
            Sets the subframe start position for the X axis (0 based) and returns the current value.
            

            If binning is active, value is in binned pixels.
            
*/
public void setStartX(double _theValue){
this.StartX=_theValue;
}

/*
 Gets 
            Sets the subframe start position for the X axis (0 based) and returns the current value.
            

            If binning is active, value is in binned pixels.
            
*/
public double getStartX(){
return StartX;
}

/*
 Sets 
            Sets the subframe start position for the Y axis (0 based). Also returns the current value.  
            

            If binning is active, value is in binned pixels.
            
*/
public void setStartY(double _theValue){
this.StartY=_theValue;
}

/*
 Gets 
            Sets the subframe start position for the Y axis (0 based). Also returns the current value.  
            

            If binning is active, value is in binned pixels.
            
*/
public double getStartY(){
return StartY;
}

/*
 Sets 
            Bayer X offset index, Interface Version 2 only
            
Returns the X offset of the Bayer matrix, as defined in . Value returned must be in the range 0 to M-1, 
            where M is the width of the Bayer matrix. The offset is relative to the 0,0 pixel in the sensor array, and does not change to 
            reflect subframe settings.
            This is only available for the Camera Interface Version 2
            
*/
public void setBayerOffsetX(double _theValue){
this.BayerOffsetX=_theValue;
}

/*
 Gets 
            Bayer X offset index, Interface Version 2 only
            
Returns the X offset of the Bayer matrix, as defined in . Value returned must be in the range 0 to M-1, 
            where M is the width of the Bayer matrix. The offset is relative to the 0,0 pixel in the sensor array, and does not change to 
            reflect subframe settings.
            This is only available for the Camera Interface Version 2
            
*/
public double getBayerOffsetX(){
return BayerOffsetX;
}

/*
 Sets 
            Returns the Y offset of the Bayer matrix, as defined in , Interface Version 2 only
            
The offset is relative to the 0,0 pixel in the sensor array, and does not change to reflect subframe settings. 
            It is recommended that this function be called only after a connection is established with 
            the camera hardware, to ensure that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
public void setBayerOffsetY(double _theValue){
this.BayerOffsetY=_theValue;
}

/*
 Gets 
            Returns the Y offset of the Bayer matrix, as defined in , Interface Version 2 only
            
The offset is relative to the 0,0 pixel in the sensor array, and does not change to reflect subframe settings. 
            It is recommended that this function be called only after a connection is established with 
            the camera hardware, to ensure that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
public double getBayerOffsetY(){
return BayerOffsetY;
}

/*
 Sets 
            Camera has a fast readout mode, Interface Version 2 only
            
It is recommended that this function be called only after a connection is established with the camera hardware, to 
            ensure that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
public void setCanFastReadout(double _theValue){
this.CanFastReadout=_theValue;
}

/*
 Gets 
            Camera has a fast readout mode, Interface Version 2 only
            
It is recommended that this function be called only after a connection is established with the camera hardware, to 
            ensure that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
public double getCanFastReadout(){
return CanFastReadout;
}

/*
 Sets 
            Returns the maximum exposure time supported by StartExposure, Interface Version 2 only
            
It is recommended that this function be called only after 
            a connection is established with the camera hardware, to ensure that the driver is aware of the capabilities of the 
            specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
public void setExposureMax(double _theValue){
this.ExposureMax=_theValue;
}

/*
 Gets 
            Returns the maximum exposure time supported by StartExposure, Interface Version 2 only
            
It is recommended that this function be called only after 
            a connection is established with the camera hardware, to ensure that the driver is aware of the capabilities of the 
            specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
public double getExposureMax(){
return ExposureMax;
}

/*
 Sets 
            Minimium exposure time, Interface Version 2 only
            
This must be a non-zero number representing the shortest possible exposure time supported by the camera model.
            Please note that for bias frame acquisition an even shorter exposure may be possible; please see StartExposure 
            for more information.
            It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
            that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
public void setExposureMin(double _theValue){
this.ExposureMin=_theValue;
}

/*
 Gets 
            Minimium exposure time, Interface Version 2 only
            
This must be a non-zero number representing the shortest possible exposure time supported by the camera model.
            Please note that for bias frame acquisition an even shorter exposure may be possible; please see StartExposure 
            for more information.
            It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
            that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
public double getExposureMin(){
return ExposureMin;
}

/*
 Sets 
            Exposure resolution, Interface Version 2 only
            
This can be used, for example, to specify the resolution of a user interface "spin control" used to dial in the exposure time.
            Please note that the Duration provided to StartExposure does not have to be an exact multiple of this number; 
            the driver should choose the closest available value. Also in some cases the resolution may not be constant over the full range 
            of exposure times; in this case the smallest increment would be appropriate. 
            It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
            that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
public void setExposureResolution(double _theValue){
this.ExposureResolution=_theValue;
}

/*
 Gets 
            Exposure resolution, Interface Version 2 only
            
This can be used, for example, to specify the resolution of a user interface "spin control" used to dial in the exposure time.
            Please note that the Duration provided to StartExposure does not have to be an exact multiple of this number; 
            the driver should choose the closest available value. Also in some cases the resolution may not be constant over the full range 
            of exposure times; in this case the smallest increment would be appropriate. 
            It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
            that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
public double getExposureResolution(){
return ExposureResolution;
}

/*
 Sets 
            Fast readout mode, Interface Version 2 only
            
Must thrown an exception if no connection is established to the camera. Must throw 
            an exception if  returns False.
            Many cameras have a "fast mode" intended for use in focusing. When set to True, the camera will operate in Fast mode; when 
            set False, the camera will operate normally. This property should default to False.
            Please note that this function may in some cases interact with ; for example, there may be modes where 
            the Fast/Normal switch is meaningless. In this case, it may be preferable to use the  function to control 
            fast/normal switching.
            If this feature is not available, then  must return False.
            This is only available for the Camera Interface Version 2
            
*/
public void setFastReadout(double _theValue){
this.FastReadout=_theValue;
}

/*
 Gets 
            Fast readout mode, Interface Version 2 only
            
Must thrown an exception if no connection is established to the camera. Must throw 
            an exception if  returns False.
            Many cameras have a "fast mode" intended for use in focusing. When set to True, the camera will operate in Fast mode; when 
            set False, the camera will operate normally. This property should default to False.
            Please note that this function may in some cases interact with ; for example, there may be modes where 
            the Fast/Normal switch is meaningless. In this case, it may be preferable to use the  function to control 
            fast/normal switching.
            If this feature is not available, then  must return False.
            This is only available for the Camera Interface Version 2
            
*/
public double getFastReadout(){
return FastReadout;
}

/*
 Sets 
             Index into the  array for the selected camera gain, Interface Version 2 only
             

              can be used to adjust the gain setting of the camera, if supported. There are two typical usage scenarios:
             
             DSLR Cameras -  will return a 0-based array of strings, which correspond to different gain settings such as 
             "ISO 800".  must be set to an integer in this range.  and  must thrown an exception if 
             this mode is used.
             Adjustable gain CCD cameras -  and  return integers, which specify the valid range for  and .
             
            The driver must default  to a valid value. 
            Please note that  may in some cases affect the gain of the camera; if so the driver must be written such 
             that the two properties do not conflict if both are used.
             This is only available for the Camera Interface Version 2
             
*/
public void setGain(double _theValue){
this.Gain=_theValue;
}

/*
 Gets 
             Index into the  array for the selected camera gain, Interface Version 2 only
             

              can be used to adjust the gain setting of the camera, if supported. There are two typical usage scenarios:
             
             DSLR Cameras -  will return a 0-based array of strings, which correspond to different gain settings such as 
             "ISO 800".  must be set to an integer in this range.  and  must thrown an exception if 
             this mode is used.
             Adjustable gain CCD cameras -  and  return integers, which specify the valid range for  and .
             
            The driver must default  to a valid value. 
            Please note that  may in some cases affect the gain of the camera; if so the driver must be written such 
             that the two properties do not conflict if both are used.
             This is only available for the Camera Interface Version 2
             
*/
public double getGain(){
return Gain;
}

/*
 Sets 
            Maximum value of , Interface Version 2 only
            
When specifying the gain setting with an integer value,  is used in conjunction with  to 
            specify the range of valid settings.
             shall be greater than . If either is available, then both must be available.
            Please see  for more information.
            It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
            that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
public void setGainMax(double _theValue){
this.GainMax=_theValue;
}

/*
 Gets 
            Maximum value of , Interface Version 2 only
            
When specifying the gain setting with an integer value,  is used in conjunction with  to 
            specify the range of valid settings.
             shall be greater than . If either is available, then both must be available.
            Please see  for more information.
            It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
            that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
public double getGainMax(){
return GainMax;
}

/*
 Sets 
            Minimum value of , Interface Version 2 only
            
When specifying the gain setting with an integer value,  is used in conjunction with  to 
            specify the range of valid settings.
             shall be greater than . If either is available, then both must be available.
            Please see  for more information.
            It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
            that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
public void setGainMin(double _theValue){
this.GainMin=_theValue;
}

/*
 Gets 
            Minimum value of , Interface Version 2 only
            
When specifying the gain setting with an integer value,  is used in conjunction with  to 
            specify the range of valid settings.
             shall be greater than . If either is available, then both must be available.
            Please see  for more information.
            It is recommended that this function be called only after a connection is established with the camera hardware, to ensure 
            that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
public double getGainMin(){
return GainMin;
}

/*
 Sets 
            Gains supported by the camera, Interface Version 2 only
            
 provides a 0-based array of available gain settings.  This is often used to specify ISO settings for DSLR cameras.  
            Typically the application software will display the available gain settings in a drop list. The application will then supply 
            the selected index to the driver via the  property. 
            The  setting may alternatively be specified using integer values; if this mode is used then  is invalid 
            and must throw an exception. Please see  and  for more information.
            It is recommended that this function be called only after a connection is established with the camera hardware, 
            to ensure that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
public void setGains(double _theValue){
this.Gains=_theValue;
}

/*
 Gets 
            Gains supported by the camera, Interface Version 2 only
            
 provides a 0-based array of available gain settings.  This is often used to specify ISO settings for DSLR cameras.  
            Typically the application software will display the available gain settings in a drop list. The application will then supply 
            the selected index to the driver via the  property. 
            The  setting may alternatively be specified using integer values; if this mode is used then  is invalid 
            and must throw an exception. Please see  and  for more information.
            It is recommended that this function be called only after a connection is established with the camera hardware, 
            to ensure that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
public double getGains(){
return Gains;
}

/*
 Sets 
            Percent conpleted, Interface Version 2 only
            
If valid, returns an integer between 0 and 100, where 0 indicates 0% progress (function just started) and 
            100 indicates 100% progress (i.e. completion).
            At the discretion of the driver author,  may optionally be valid 
            when  is in any or all of the following 
            states: , 
            ,  
            or . In all other states an exception shall be thrown.
            Typically the application user interface will show a progress bar based on the  value.
            Please note that client applications are not required to use this value, and in some cases may display status 
            information based on other information, such as time elapsed.
            This is only available for the Camera Interface Version 2
            
*/
public void setPercentCompleted(double _theValue){
this.PercentCompleted=_theValue;
}

/*
 Gets 
            Percent conpleted, Interface Version 2 only
            
If valid, returns an integer between 0 and 100, where 0 indicates 0% progress (function just started) and 
            100 indicates 100% progress (i.e. completion).
            At the discretion of the driver author,  may optionally be valid 
            when  is in any or all of the following 
            states: , 
            ,  
            or . In all other states an exception shall be thrown.
            Typically the application user interface will show a progress bar based on the  value.
            Please note that client applications are not required to use this value, and in some cases may display status 
            information based on other information, such as time elapsed.
            This is only available for the Camera Interface Version 2
            
*/
public double getPercentCompleted(){
return PercentCompleted;
}

/*
 Sets 
            Readout mode, Interface Version 2 only
            
 is an index into the array , and selects the desired readout mode for the camera.  
            Defaults to 0 if not set.  Throws an exception if the selected mode is not available.
            It is strongly recommended, but not required, that driver authors make the 0-index mode suitable for standard imaging operations, 
            since it is the default.
            Please see  for additional information.
            This is only available for the Camera Interface Version 2
            
*/
public void setReadoutMode(double _theValue){
this.ReadoutMode=_theValue;
}

/*
 Gets 
            Readout mode, Interface Version 2 only
            
 is an index into the array , and selects the desired readout mode for the camera.  
            Defaults to 0 if not set.  Throws an exception if the selected mode is not available.
            It is strongly recommended, but not required, that driver authors make the 0-index mode suitable for standard imaging operations, 
            since it is the default.
            Please see  for additional information.
            This is only available for the Camera Interface Version 2
            
*/
public double getReadoutMode(){
return ReadoutMode;
}

/*
 Sets 
            List of available readout modes, Interface Version 2 only
            
This property provides an array of strings, each of which describes an available readout mode of the camera.  
            At least two strings must be present in the list. The user interface of a control application will typically present to the 
            user a drop-list of modes.  The choice of available modes made available is entirely at the discretion of the driver author. 
            Please note that if the camera has many different modes of operation, then the most commonly adjusted settings should be in 
            ; additional settings may be provided using .
            To select a mode, the application will set  to the index of the desired mode.  The index is zero-based.
            This property should only be read while a connection to the camera is actually established.  Drivers often support 
            multiple cameras with different capabilities, which are not known until the connection is made.  If the available readout modes 
            are not known because no connection has been established, this property shall throw an exception.
            Please note that the default  setting is 0. It is strongly recommended, but not required, that 
            driver authors use the 0-index mode for standard imaging operations, since it is the default.
            This feature may be used in parallel with ; however, care should be taken to ensure that the two 
            features work together consistently. If there are modes that are inconsistent having a separate fast/normal switch, then it 
            may be better to simply list Fast as one of the .
            It is recommended that this function be called only after a connection is established with 
            the camera hardware, to ensure that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
public void setReadoutModes(double _theValue){
this.ReadoutModes=_theValue;
}

/*
 Gets 
            List of available readout modes, Interface Version 2 only
            
This property provides an array of strings, each of which describes an available readout mode of the camera.  
            At least two strings must be present in the list. The user interface of a control application will typically present to the 
            user a drop-list of modes.  The choice of available modes made available is entirely at the discretion of the driver author. 
            Please note that if the camera has many different modes of operation, then the most commonly adjusted settings should be in 
            ; additional settings may be provided using .
            To select a mode, the application will set  to the index of the desired mode.  The index is zero-based.
            This property should only be read while a connection to the camera is actually established.  Drivers often support 
            multiple cameras with different capabilities, which are not known until the connection is made.  If the available readout modes 
            are not known because no connection has been established, this property shall throw an exception.
            Please note that the default  setting is 0. It is strongly recommended, but not required, that 
            driver authors use the 0-index mode for standard imaging operations, since it is the default.
            This feature may be used in parallel with ; however, care should be taken to ensure that the two 
            features work together consistently. If there are modes that are inconsistent having a separate fast/normal switch, then it 
            may be better to simply list Fast as one of the .
            It is recommended that this function be called only after a connection is established with 
            the camera hardware, to ensure that the driver is aware of the capabilities of the specific camera model.
            This is only available for the Camera Interface Version 2
            
*/
public double getReadoutModes(){
return ReadoutModes;
}

/*
 Sets 
            Sensor name, Interface Version 2 only
            
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
            This is only available for the Camera Interface Version 2
            
*/
public void setSensorName(double _theValue){
this.SensorName=_theValue;
}

/*
 Gets 
            Sensor name, Interface Version 2 only
            
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
            This is only available for the Camera Interface Version 2
            
*/
public double getSensorName(){
return SensorName;
}

/*
 Sets 
             Type of colour information returned by the the camera sensor, Interface Version 2 only
             

             This is only available for the Camera Interface Version 2
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
             
             Camera produces color image directly, requiring not Bayer decoding
             
             
             
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
              can possibly change between exposures, for example if Camera.ReadoutMode is changed, and should always be checked after each exposure.
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
             
             
             
             
             The alignment of the array may be modified by  and . 
             The offset is measured from the 0,0 position in the sensor array to the upper left corner of the Bayer matrix table. 
             Please note that the Bayer offset values are not affected by subframe settings.
             For example, if a CMYG2 sensor has a Bayer matrix offset as shown below,  is 0 and  is 1:
            
             
             
             
             
             
             
             
             
             
             X = 0
             
             X = 1
             
             
             
             
             Y = 0
             
             G
             
             M
             
             
             
             
             Y = 1
             
             C
             
             Y
             
             
             
             Y = 2
             
             M
             
             G
             
             
             
             
             Y = 3
             
             C
             
             Y
             
             
             
             It is recommended that this function be called only after a connection is established with the camera hardware, to ensure that 
             the driver is aware of the capabilities of the specific camera model.
             
*/
public void setSensorType(double _theValue){
this.SensorType=_theValue;
}

/*
 Gets 
             Type of colour information returned by the the camera sensor, Interface Version 2 only
             

             This is only available for the Camera Interface Version 2
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
             
             Camera produces color image directly, requiring not Bayer decoding
             
             
             
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
              can possibly change between exposures, for example if Camera.ReadoutMode is changed, and should always be checked after each exposure.
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
             
             
             
             
             The alignment of the array may be modified by  and . 
             The offset is measured from the 0,0 position in the sensor array to the upper left corner of the Bayer matrix table. 
             Please note that the Bayer offset values are not affected by subframe settings.
             For example, if a CMYG2 sensor has a Bayer matrix offset as shown below,  is 0 and  is 1:
            
             
             
             
             
             
             
             
             
             
             X = 0
             
             X = 1
             
             
             
             
             Y = 0
             
             G
             
             M
             
             
             
             
             Y = 1
             
             C
             
             Y
             
             
             
             Y = 2
             
             M
             
             G
             
             
             
             
             Y = 3
             
             C
             
             Y
             
             
             
             It is recommended that this function be called only after a connection is established with the camera hardware, to ensure that 
             the driver is aware of the capabilities of the specific camera model.
             
*/
public double getSensorType(){
return SensorType;
}
}
