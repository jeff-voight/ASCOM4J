package ASCOM.DeviceInterface;

/*

 Defines the ITelescope Interface
 


*/
public class ITelescopeV3{

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

 Returns a description of the device, such as manufacturer and modelnumber. Any ASCII characters may be used. 
 
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
 It should not to be confused with the  property, which is the version of this specification supported by the 
 driver.
 
*/
private double DriverVersion;
/*

 The interface version number that this device supports. Should return 3 for this interface version.
 
Must be implemented Clients can detect legacy V1 drivers by trying to read ths property.
 If the driver raises an error, it is a V1 driver. V1 did not specify this property. A driver may also return a value of 1. 
 In other words, a raised error or a return value of 1 indicates that the driver is a V1 driver.
 
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
	
*/
private double SupportedActions;
/*

 The alignment mode of the mount (Alt/Az, Polar, German Polar).
 

 This is only available for telescope InterfaceVersions 2 and 3
 
*/
private double AlignmentMode;
/*

 The Altitude above the local horizon of the telescope's current position (degrees, positive up)
 

*/
private double Altitude;
/*

 The area of the telescope's aperture, taking into account any obstructions (square meters)
 

 This is only available for telescope InterfaceVersions 2 and 3
 
*/
private double ApertureArea;
/*

 The telescope's effective aperture diameter (meters)
 

 This is only available for telescope InterfaceVersions 2 and 3
 
*/
private double ApertureDiameter;
/*

 True if the telescope is stopped in the Home position. Set only following a  operation,
  and reset with any slew operation. This property must be False if the telescope does not support homing. 
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 This is only available for telescope InterfaceVersions 2 and 3
 
*/
private double AtHome;
/*

 True if the telescope has been put into the parked state by the seee  method. Set False by calling the Unpark() method.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
		AtPark is True when the telescope is in the parked state. This is achieved by calling the  method. When AtPark is true, 
 the telescope movement is stopped (or restricted to a small safe range of movement) and all calls that would cause telescope 
 movement (e.g. slewing, changing Tracking state) must not do so, and must raise an error.
		The telescope is taken out of parked state by calling the  method. If the telescope cannot be parked, 
 then AtPark must always return False.
		This is only available for telescope InterfaceVersions 2 and 3
	
*/
private double AtPark;
/*

 The azimuth at the local horizon of the telescope's current position (degrees, North-referenced, positive East/clockwise).
 

*/
private double Azimuth;
/*

 True if this telescope is capable of programmed finding its home position ( method).
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
private double CanFindHome;
/*

 True if this telescope is capable of programmed parking (method)
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
private double CanPark;
/*

 True if this telescope is capable of software-pulsed guiding (via the  method)
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 
*/
private double CanPulseGuide;
/*

 True if the  property can be changed to provide offset tracking in the declination axis.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 
*/
private double CanSetDeclinationRate;
/*

 True if the guide rate properties used for  can ba adjusted.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
private double CanSetGuideRates;
/*

 True if this telescope is capable of programmed setting of its park position ( method)
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
private double CanSetPark;
/*

 True if the  property can be set, meaning that the mount can be forced to flip.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 This will always return False for non-German-equatorial mounts that do not have to be flipped. 
 May raise an error if the telescope is not connected. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
private double CanSetPierSide;
/*

 True if the  property can be changed to provide offset tracking in the right ascension axis.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 
*/
private double CanSetRightAscensionRate;
/*

 True if the  property can be changed, turning telescope sidereal tracking on and off.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 
*/
private double CanSetTracking;
/*

 True if this telescope is capable of programmed slewing (synchronous or asynchronous) to equatorial coordinates
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 If this is true, then only the synchronous equatorial slewing methods are guaranteed to be supported.
 See the  property for the asynchronous slewing capability flag. 
 May raise an error if the telescope is not connected. 
 
*/
private double CanSlew;
/*

 True if this telescope is capable of programmed slewing (synchronous or asynchronous) to local horizontal coordinates
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 If this is true, then only the synchronous local horizontal slewing methods are guaranteed to be supported.
 See the  property for the asynchronous slewing capability flag. 
 May raise an error if the telescope is not connected. 
 
*/
private double CanSlewAltAz;
/*

 True if this telescope is capable of programmed asynchronous slewing to local horizontal coordinates
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 This indicates the the asynchronous local horizontal slewing methods are supported.
 If this is True, then  will also be true. 
 May raise an error if the telescope is not connected. 
 
*/
private double CanSlewAltAzAsync;
/*

 True if this telescope is capable of programmed asynchronous slewing to equatorial coordinates.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 This indicates the the asynchronous equatorial slewing methods are supported.
 If this is True, then  will also be true.
 May raise an error if the telescope is not connected. 
 
*/
private double CanSlewAsync;
/*

 True if this telescope is capable of programmed synching to equatorial coordinates.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 
*/
private double CanSync;
/*

 True if this telescope is capable of programmed synching to local horizontal coordinates
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 
*/
private double CanSyncAltAz;
/*

 True if this telescope is capable of programmed unparking ( method).
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 If this is true, then  will also be true. May raise an error if the telescope is not connected.
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
private double CanUnpark;
/*

 The declination (degrees) of the telescope's current equatorial coordinates, in the coordinate system given by the  property.
 Reading the property will raise an error if the value is unavailable. 
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
private double Declination;
/*

 The declination tracking rate (arcseconds per second, default = 0.0)
 

		DeclinationRate Read must be implemented and must not throw a PropertyNotImplementedException. 
		DeclinationRate Write can throw a PropertyNotImplementedException.
 This property, together with , provides support for "offset tracking".
 Offset tracking is used primarily for tracking objects that move relatively slowly against the equatorial coordinate system.
 It also may be used by a software guiding system that controls rates instead of using the PulseGuide method. 
 
			NOTES:
			
				
				The property value represents an offset from zero motion.
				If  is False, this property will always return 0.
				To discover whether this feature is supported, test the  property.
				The supported range of this property is telescope specific, however, if this feature is supported,
 it can be expected that the range is sufficient to allow correction of guiding errors caused by moderate misalignment 
 and periodic error.
				If this property is non-zero when an equatorial slew is initiated, the telescope should continue to update the slew 
 destination coordinates at the given offset rate.
				This will allow precise slews to a fast-moving target with a slow-slewing telescope.
				When the slew completes, the  and  properties should reflect the final (adjusted) destination.
			
		
		
This is not a required feature of this specification, however it is desirable. 
 
	
*/
private double DeclinationRate;
/*

 True if the telescope or driver applies atmospheric refraction to coordinates.
 

 If this property is True, the coordinates sent to, and retrieved from, the telescope are unrefracted. 
 This is only available for telescope InterfaceVersions 2 and 3
		
			NOTES:
			
				If the driver does not know whether the attached telescope does its own refraction, and if the driver does not itself calculate 
 refraction, this property (if implemented) must raise an error when read.
				Writing to this property is optional. Often, a telescope (or its driver) calculates refraction using standard atmospheric parameters.
				If the client wishes to calculate a more accurate refraction, then this property could be set to False and these 
 client-refracted coordinates used.
				If disabling the telescope or driver's refraction is not supported, the driver must raise an error when an attempt to set 
 this property to False is made.
				Setting this property to True for a telescope or driver that does refraction, or to False for a telescope or driver that 
 does not do refraction, shall not raise an error. It shall have no effect.
			
		
	
*/
private double DoesRefraction;
/*

 Equatorial coordinate system used by this telescope (e.g. Topocentric or J2000).
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 Most amateur telescopes use local topocentric coordinates. This coordinate system is simply the apparent position in the sky
 (possibly uncorrected for atmospheric refraction) for "here and now", thus these are the coordinates that one would use with digital setting
 circles and most amateur scopes. More sophisticated telescopes use one of the standard reference systems established by professional astronomers.
 The most common is the Julian Epoch 2000 (J2000). These instruments apply corrections for precession,nutation, abberration, etc. to adjust the coordinates 
 from the standard system to the pointing direction for the time and location of "here and now". 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
private double EquatorialSystem;
/*

 The telescope's focal length, meters
 

 This property may be used by clients to calculate telescope field of view and plate scale when combined with detector pixel size and geometry. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
private double FocalLength;
/*

 The current Declination movement rate offset for telescope guiding (degrees/sec)
 
 
 This is the rate for both hardware/relay guiding and the PulseGuide() method. 
 This is only available for telescope InterfaceVersions 2 and 3
		
			NOTES:
			
				To discover whether this feature is supported, test the  property.
				The supported range of this property is telescope specific, however, if this feature is supported, it can be expected that the range is sufficient to
 allow correction of guiding errors caused by moderate misalignment and periodic error.
				If a telescope does not support separate guiding rates in Right Ascension and Declination, then it is permissible for  and GuideRateDeclination to be tied together.
 In this case, changing one of the two properties will cause a change in the other.
				Mounts must start up with a known or default declination guide rate, and this property must return that known/default guide rate until changed.
			
		
	
*/
private double GuideRateDeclination;
/*

 The current Right Ascension movement rate offset for telescope guiding (degrees/sec)
 

 This is the rate for both hardware/relay guiding and the PulseGuide() method. 
 This is only available for telescope InterfaceVersions 2 and 3
		
			NOTES:
			
				To discover whether this feature is supported, test the  property.
				The supported range of this property is telescope specific, however, if this feature is supported, it can be expected that the range is sufficient to allow correction of guiding errors caused by moderate
 misalignment and periodic error.
				If a telescope does not support separate guiding rates in Right Ascension and Declination, then it is permissible for GuideRateRightAscension and  to be tied together. 
 In this case, changing one of the two properties will cause a change in the other.
				 Mounts must start up with a known or default right ascension guide rate, and this property must return that known/default guide rate until changed.
			
		
	
*/
private double GuideRateRightAscension;
/*

 True if a  command is in progress, False otherwise
 

 Raises an error if the value of the  property is false (the driver does not support the  method). 
 
*/
private double IsPulseGuiding;
/*

 The right ascension (hours) of the telescope's current equatorial coordinates,
 in the coordinate system given by the EquatorialSystem property
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 Reading the property will raise an error if the value is unavailable. 
 
*/
private double RightAscension;
/*

 The right ascension tracking rate offset from sidereal (seconds per sidereal second, default = 0.0)
 

		RightAscensionRate Read must be implemented and must not throw a PropertyNotImplementedException. 
		RightAscensionRate Write can throw a PropertyNotImplementedException.
 This property, together with , provides support for "offset tracking". Offset tracking is used primarily for tracking objects that move relatively slowly
 against the equatorial coordinate system. It also may be used by a software guiding system that controls rates instead of using the PulseGuide method.
 
			NOTES:
 The property value represents an offset from the currently selected . 
 
				If this property is zero, tracking will be at the selected .
				If  is False, this property must always return 0. 
 To discover whether this feature is supported, test the property. 
 The property value is in in seconds of right ascension per sidereal second.
				To convert a given rate in (the more common) units of sidereal seconds per UTC (clock) second, multiply the value by 0.9972695677 
 (the number of UTC seconds in a sidereal second) then set the property. Please note that these units were chosen for the Telescope V1 standard,
 and in retrospect, this was an unfortunate choice. However, to maintain backwards compatibility, the units cannot be changed.
 A simple multiplication is all that's needed, as noted. The supported range of this property is telescope specific, however,
 if this feature is supported, it can be expected that the range is sufficient to allow correction of guiding errors
 caused by moderate misalignment and periodic error. 
				If this property is non-zero when an equatorial slew is initiated, the telescope should continue to update the slew destination coordinates 
 at the given offset rate. This will allow precise slews to a fast-moving target with a slow-slewing telescope. When the slew completes, 
 the  and  properties should reflect the final (adjusted) destination. This is not a required
 feature of this specification, however it is desirable. 
				Use the  property to enable and disable sidereal tracking (if supported). 
			
		
	
*/
private double RightAscensionRate;
/*

 Indicates the pointing state of the mount.
 

		For historical reasons, this property's name does not reflect its true meaning. The name will not be changed (so as to preserve 
 compatibility), but the meaning has since become clear. All conventional mounts have two pointing states for a given equatorial (sky) position. 
 Mechanical limitations often make it impossible for the mount to position the optics at given HA/Dec in one of the two pointing 
 states, but there are places where the same point can be reached sensibly in both pointing states (e.g. near the pole and 
 close to the meridian). In order to understand these pointing states, consider the following (thanks to Patrick Wallace for this info):
		All conventional telescope mounts have two axes nominally at right angles. For an equatorial, the longitude axis is mechanical 
 hour angle and the latitude axis is mechanical declination. Sky coordinates and mechanical coordinates are two completely separate arenas. 
 This becomes rather more obvious if your mount is an altaz, but it's still true for an equatorial. Both mount axes can in principle 
 move over a range of 360 deg. This is distinct from sky HA/Dec, where Dec is limited to a 180 deg range (+90 to -90).  Apart from 
 practical limitations, any point in the sky can be seen in two mechanical orientations. To get from one to the other the HA axis 
 is moved 180 deg and the Dec axis is moved through the pole a distance twice the sky codeclination (90 - sky declination).
		Mechanical zero HA/Dec will be one of the two ways of pointing at the intersection of the celestial equator and the local meridian. 
 In order to support Dome slaving, where it is important to know which side of the pier the mount is actually on, ASCOM has adopted the 
 convention that the Normal pointing state will be the state where a German Equatorial mount is on the East side of the pier, looking West, with the 
 counterweights below the optical assembly and that  will represent this pointing state.
		Move your scope to this position and consider the two mechanical encoders zeroed. The two pointing states are, then:
 
				Normal ()Where the mechanical Dec is in the range -90 deg to +90 deg
				Beyond the pole ()Where the mechanical Dec is in the range -180 deg to -90 deg or +90 deg to +180 deg.
			
		
		"Side of pier" is a "consequence" of the former definition, not something fundamental. 
 Apart from mechanical interference, the telescope can move from one side of the pier to the other without the mechanical Dec 
 having changed: you could track Polaris forever with the telescope moving from west of pier to east of pier or vice versa every 12h. 
 Thus, "side of pier" is, in general, not a useful term (except perhaps in a loose, descriptive, explanatory sense). 
 All this applies to a fork mount just as much as to a GEM, and it would be wrong to make the "beyond pole" state illegal for the 
 former. Your mount may not be able to get there if your camera hits the fork, but it's possible on some mounts. Whether this is useful 
 depends on whether you're in Hawaii or Finland.
		To first order, the relationship between sky and mechanical HA/Dec is as follows:
		Normal state:
			
				HA_sky  = HA_mech
				Dec_sky = Dec_mech
			
		
		Beyond the pole
			
				HA_sky  = HA_mech + 12h, expressed in range ± 12h
				Dec_sky = 180d - Dec_mech, expressed in range ± 90d
			
		
		Astronomy software often needs to know which which pointing state the mount is in. Examples include setting guiding polarities 
 and calculating dome opening azimuth/altitude. The meaning of the SideOfPier property, then is:
 
				pierEastNormal pointing state
				pierWestBeyond the pole pointing state
			
		
		If the mount hardware reports neither the true pointing state (or equivalent) nor the mechanical declination axis position 
 (which varies from -180 to +180), a driver cannot calculate the pointing state, and *must not* implement SideOfPier.
 If the mount hardware reports only the mechanical declination axis position (-180 to +180) then a driver can calculate SideOfPier as follows:
 
				pierEast = abs(mechanical dec) <= 90 deg
				pierWest = abs(mechanical Dec) > 90 deg
			
		
		It is allowed (though not required) that this property may be written to force the mount to flip. Doing so, however, may change 
 the right ascension of the telescope. During flipping, Telescope.Slewing must return True.
		This property is only available in telescope InterfaceVersions 2 and 3.
		Pointing State and Side of Pier - Help for Driver Developers
		A further document, "Pointing State and Side of Pier", is installed in the Developer Documentation folder by the ASCOM Developer 
 Components installer. This further explains the pointing state concept and includes diagrams illustrating how it relates 
 to physical side of pier for German equatorial telescopes. It also includes details of the tests performed by Conform to determine whether 
 the driver correctly reports the pointing state as defined above.
	
*/
private double SideOfPier;
/*

 The local apparent sidereal time from the telescope's internal clock (hours, sidereal)
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 It is required for a driver to calculate this from the system clock if the telescope 
 has no accessible source of sidereal time. Local Apparent Sidereal Time is the sidereal 
 time used for pointing telescopes, and thus must be calculated from the Greenwich Mean
 Sidereal time, longitude, nutation in longitude and true ecliptic obliquity. 
 
*/
private double SiderealTime;
/*

 The elevation above mean sea level (meters) of the site at which the telescope is located
 

 Setting this property will raise an error if the given value is outside the range -300 through +10000 metres.
 Reading the property will raise an error if the value has never been set or is otherwise unavailable. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
private double SiteElevation;
/*

 The geodetic(map) latitude (degrees, positive North, WGS84) of the site at which the telescope is located.
 

 Setting this property will raise an error if the given value is outside the range -90 to +90 degrees.
 Reading the property will raise an error if the value has never been set or is otherwise unavailable. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
private double SiteLatitude;
/*

 The longitude (degrees, positive East, WGS84) of the site at which the telescope is located.
 

 Setting this property will raise an error if the given value is outside the range -180 to +180 degrees.
 Reading the property will raise an error if the value has never been set or is otherwise unavailable.
 Note that West is negative! 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
private double SiteLongitude;
/*

 True if telescope is currently moving in response to one of the
 Slew methods or the  method, False at all other times.
 

 Reading the property will raise an error if the value is unavailable. If the telescope is not capable of asynchronous slewing, this property will always be False. 
 The definition of "slewing" excludes motion caused by sidereal tracking, PulseGuide, , and .
 It reflects only motion caused by one of the Slew commands, flipping caused by changing the  property, or . 
 
*/
private double Slewing;
/*

 Specifies a post-slew settling time (sec.).
 

 Adds additional time to slew operations. Slewing methods will not return, 
 and the  property will not become False, until the slew completes and the SlewSettleTime has elapsed.
 This feature (if supported) may be used with mounts that require extra settling time after a slew. 
 
*/
private double SlewSettleTime;
/*

 The declination (degrees, positive North) for the target of an equatorial slew or sync operation
 

 Setting this property will raise an error if the given value is outside the range -90 to +90 degrees. Reading the property will raise an error if the value has never been set or is otherwise unavailable. 
 
*/
private double TargetDeclination;
/*

 The right ascension (hours) for the target of an equatorial slew or sync operation
 

 Setting this property will raise an error if the given value is outside the range 0 to 24 hours. Reading the property will raise an error if the value has never been set or is otherwise unavailable. 
 
*/
private double TargetRightAscension;
/*

 The state of the telescope's sidereal tracking drive.
 

		Tracking Read must be implemented and must not throw a PropertyNotImplementedException. 
		Tracking Write can throw a PropertyNotImplementedException.
 Changing the value of this property will turn the sidereal drive on and off.
 However, some telescopes may not support changing the value of this property
 and thus may not support turning tracking on and off.
 See the  property. 
 
*/
private double Tracking;
/*

 The current tracking rate of the telescope's sidereal drive
 

		TrackingRate Read must be implemented and must not throw a PropertyNotImplementedException. 
		TrackingRate Write can throw a PropertyNotImplementedException.
 Supported rates (one of the   values) are contained within the  collection.
 Values assigned to TrackingRate must be one of these supported rates. If an unsupported value is assigned to this property, it will raise an error. 
 The currently selected tracking rate can be further adjusted via the  and  properties. These rate offsets are applied to the currently 
 selected tracking rate. Mounts must start up with a known or default tracking rate, and this property must return that known/default tracking rate until changed.
 If the mount's current tracking rate cannot be determined (for example, it is a write-only property of the mount's protocol), 
 it is permitted for the driver to force and report a default rate on connect. In this case, the preferred default is Sidereal rate.
		This is only available for telescope InterfaceVersions 2 and 3
	
*/
private double TrackingRate;
/*

 Returns a collection of supported  values that describe the permissible
 values of the  property for this telescope type.
 

		Must be implemented and must not throw a PropertyNotImplementedException.
 At a minimum, this must contain an item for .
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
private double TrackingRates;
/*

 The UTC date/time of the telescope's internal clock
 

		UTCDate Read must be implemented and must not throw a PropertyNotImplementedException. 
		UTCDate Write can throw a PropertyNotImplementedException.
 The driver must calculate this from the system clock if the telescope has no accessible source of UTC time. In this case, the property must not be writeable (this would change the system clock!) and will instead raise an error.
 However, it is permitted to change the telescope's internal UTC clock if it is being used for this property. This allows clients to adjust the telescope's UTC clock as needed for accuracy. Reading the property
 will raise an error if the value has never been set or is otherwise unavailable. 
 
*/
private double UTCDate;


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

 Stops a slew in progress.
 

 Effective only after a call to , , , or .
 Does nothing if no slew/motion is in progress. Tracking is returned to its pre-slew state. Raises an error if  is true. 
 
*/
public void AbortSlew(){
return null;
}


/*

 Determine the rates at which the telescope may be moved about the specified axis by the  method.
 

		Must be implemented, must not throw a MethodNotImplementedException.
 See the description of  for more information. This method must return an empty collection if  is not supported. 
 This is only available for telescope InterfaceVersions 2 and 3
		
 Please note that the rate objects must contain absolute non-negative values only. Applications determine the direction by applying a
 positive or negative sign to the rates provided. This obviates the need for the driver to to present a duplicate set of negative rates 
 as well as the positive rates.
	
*/
public void AxisRates(ASCOM.DeviceInterface.TelescopeAxes){
return null;
}


/*

 True if this telescope can move the requested axis
 

		Must be implemented, must not throw a MethodNotImplementedException.
 This is only available for telescope InterfaceVersions 2 and 3
 
*/
public void CanMoveAxis(ASCOM.DeviceInterface.TelescopeAxes){
return null;
}


/*

 Predict side of pier for German equatorial mounts
 

 This is only available for telescope InterfaceVersions 2 and 3
 
*/
public void DestinationSideOfPier(Double,Double){
return null;
}


/*

 Locates the telescope's "home" position (synchronous)
 

 Returns only after the home position has been found.
 At this point the  property will be True.
 Raises an error if there is a problem. 
 Raises an error if AtPark is true. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public void FindHome(){
return null;
}


/*

 Move the telescope in one axis at the given rate.
 

 This method supports control of the mount about its mechanical axes.
 The telescope will start moving at the specified rate about the specified axis and continue indefinitely.
 This method can be called for each axis separately, and have them all operate concurrently at separate rates of motion. 
 Set the rate for an axis to zero to restore the motion about that axis to the rate set by the  property.
 Tracking motion (if enabled, see note below) is suspended during this mode of operation. 
 
 Raises an error if  is true. 
 This must be implemented for the if the  property returns True for the given axis.
		This is only available for telescope InterfaceVersions 2 and 3
		
			NOTES:
			
				The movement rate must be within the value(s) obtained from a  object in the 
 the  collection. This is a signed value with negative rates moving in the oposite direction to positive rates.
				The values specified in  are absolute, unsigned values and apply to both directions, determined by the sign used in this command.
				The value of  must be True if the telescope is moving about any of its axes as a result of this method being called. 
 This can be used to simulate a handbox by initiating motion with the MouseDown event and stopping the motion with the MouseUp event.
				When the motion is stopped by setting the rate to zero the scope will be set to the previous  or to no movement, depending on the state of the  property.
				It may be possible to implement satellite tracking by using the  method to move the scope in the required manner to track a satellite.
			
		
	
*/
public void MoveAxis(ASCOM.DeviceInterface.TelescopeAxes,Double){
return null;
}


/*

 Move the telescope to its park position, stop all motion (or restrict to a small safe range), and set  to True.
 

 Raises an error if there is a problem communicating with the telescope or if parking fails. Parking should put the telescope into a state where its pointing accuracy 
 will not be lost if it is power-cycled (without moving it).Some telescopes must be power-cycled before unparking. Others may be unparked by simply calling the  method.
 Calling this with  = True does nothing (harmless) 
 
*/
public void Park(){
return null;
}


/*

 Moves the scope in the given direction for the given interval or time at 
 the rate given by the corresponding guide rate property 
 

 This method returns immediately if the hardware is capable of back-to-back moves,
 i.e. dual-axis moves. For hardware not having the dual-axis capability,
 the method returns only after the move has completed. 
 
			NOTES:
			
				Raises an error if  is true.
				The  property must be be True during pulse-guiding.
				The rate of motion for movements about the right ascension axis is 
 specified by the  property. The rate of motion
 for movements about the declination axis is specified by the 
  property. These two rates may be tied together
 into a single rate, depending on the driver's implementation
 and the capabilities of the telescope.
			
		
	
*/
public void PulseGuide(ASCOM.DeviceInterface.GuideDirections,Int32){
return null;
}


/*

 Sets the telescope's park position to be its current position.
 

*/
public void SetPark(){
return null;
}


/*

 Move the telescope to the given local horizontal coordinates, return when slew is complete
 

 This Method must be implemented if  returns True. Raises an error if the slew fails. The slew may fail if the target coordinates are beyond limits imposed within the driver component.
 Such limits include mechanical constraints imposed by the mount or attached instruments, building or dome enclosure restrictions, etc.
 The  and  properties are not changed by this method. 
 Raises an error if  is True, or if  is True. This is only available for telescope InterfaceVersions 2 and 3
	
*/
public void SlewToAltAz(Double,Double){
return null;
}


/*

 This Method must be implemented if  returns True.
 

 This method should only be implemented if the properties , ,
 ,  and  can be read while the scope is slewing. Raises an error if starting the slew fails. Returns immediately after starting the slew.
 The client may monitor the progress of the slew by reading the , , and  properties during the slew. When the slew completes, Slewing becomes False. 
 The slew may fail if the target coordinates are beyond limits imposed within the driver component. Such limits include mechanical constraints imposed by the mount or attached instruments, building or dome enclosure restrictions, etc. 
 The  and  properties are not changed by this method. 
 Raises an error if  is True, or if  is True.
		This is only available for telescope InterfaceVersions 2 and 3
	
*/
public void SlewToAltAzAsync(Double,Double){
return null;
}


/*

 Move the telescope to the given equatorial coordinates, return when slew is complete
 

 This Method must be implemented if  returns True. Raises an error if the slew fails. 
 The slew may fail if the target coordinates are beyond limits imposed within the driver component.
 Such limits include mechanical constraints imposed by the mount or attached instruments,
 building or dome enclosure restrictions, etc. The target coordinates are copied to
  and  whether or not the slew succeeds. 
 Raises an error if  is True, or if  is False.
	
*/
public void SlewToCoordinates(Double,Double){
return null;
}


/*

 Move the telescope to the given equatorial coordinates, return immediately after starting the slew.
 

 This method must be implemented if  returns True. Raises an error if starting the slew failed. 
 Returns immediately after starting the slew. The client may monitor the progress of the slew by reading
 the , , and  properties during the slew. When the slew completes,
  becomes False. The slew may fail to start if the target coordinates are beyond limits
 imposed within the driver component. Such limits include mechanical constraints imposed
 by the mount or attached instruments, building or dome enclosure restrictions, etc. 
 The target coordinates are copied to  and 
 whether or not the slew succeeds. 
 Raises an error if  is True, or if  is False.
	
*/
public void SlewToCoordinatesAsync(Double,Double){
return null;
}


/*

 Move the telescope to the  and  coordinates, return when slew complete.
 

 This Method must be implemented if  returns True. Raises an error if the slew fails. 
 The slew may fail if the target coordinates are beyond limits imposed within the driver component.
 Such limits include mechanical constraints imposed by the mount or attached
 instruments, building or dome enclosure restrictions, etc. 
 Raises an error if  is True, or if  is False. 
 
*/
public void SlewToTarget(){
return null;
}


/*

 Move the telescope to the  and   coordinates,
 returns immediately after starting the slew.
 

 This Method must be implemented if   returns True.
 Raises an error if starting the slew failed. Returns immediately after starting the slew. The client may monitor the progress of the slew by reading the RightAscension, Declination,
 and Slewing properties during the slew. When the slew completes,   becomes False. The slew may fail to start if the target coordinates are beyond limits imposed within 
 the driver component. Such limits include mechanical constraints imposed by the mount or attached instruments, building or dome enclosure restrictions, etc. 
 Raises an error if  is True, or if  is False. 
 
*/
public void SlewToTargetAsync(){
return null;
}


/*

 Matches the scope's local horizontal coordinates to the given local horizontal coordinates.
 

 This must be implemented if the  property is True. Raises an error if matching fails. 
 Raises an error if  is True, or if  is True.
		This is only available for telescope InterfaceVersions 2 and 3
	
*/
public void SyncToAltAz(Double,Double){
return null;
}


/*

 Matches the scope's equatorial coordinates to the given equatorial coordinates.
 

 This must be implemented if the  property is True. Raises an error if matching fails. 
 Raises an error if  AtPark is True, or if  is False. 
 The way that Sync is implemented is mount dependent and it should only be relied on to improve pointing for positions close to
 the position at which the sync is done.
 
*/
public void SyncToCoordinates(Double,Double){
return null;
}


/*

 Matches the scope's equatorial coordinates to the given equatorial coordinates.
 

 This must be implemented if the  property is True. Raises an error if matching fails. 
 Raises an error if  AtPark is True, or if  is False. 
 The way that Sync is implemented is mount dependent and it should only be relied on to improve pointing for positions close to
 the position at which the sync is done.
 
*/
public void SyncToTarget(){
return null;
}


/*

 Takes telescope out of the Parked state.
 

 The state of  after unparking is undetermined. Valid only after . Applications must check and change Tracking as needed after unparking. 
 Raises an error if unparking fails. Calling this with  = False does nothing (harmless) 
 
*/
public void Unpark(){
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
 Returns a description of the device, such as manufacturer and modelnumber. Any ASCII characters may be used. 
 
Must be implemented
	
*/
public void setDescription(double _theValue){
this.Description=_theValue;
}

/*
 Gets 
 Returns a description of the device, such as manufacturer and modelnumber. Any ASCII characters may be used. 
 
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
 It should not to be confused with the  property, which is the version of this specification supported by the 
 driver.
 
*/
public void setDriverVersion(double _theValue){
this.DriverVersion=_theValue;
}

/*
 Gets 
 A string containing only the major and minor version of the driver.
 
Must be implemented This must be in the form "n.n".
 It should not to be confused with the  property, which is the version of this specification supported by the 
 driver.
 
*/
public double getDriverVersion(){
return DriverVersion;
}

/*
 Sets 
 The interface version number that this device supports. Should return 3 for this interface version.
 
Must be implemented Clients can detect legacy V1 drivers by trying to read ths property.
 If the driver raises an error, it is a V1 driver. V1 did not specify this property. A driver may also return a value of 1. 
 In other words, a raised error or a return value of 1 indicates that the driver is a V1 driver.
 
*/
public void setInterfaceVersion(double _theValue){
this.InterfaceVersion=_theValue;
}

/*
 Gets 
 The interface version number that this device supports. Should return 3 for this interface version.
 
Must be implemented Clients can detect legacy V1 drivers by trying to read ths property.
 If the driver raises an error, it is a V1 driver. V1 did not specify this property. A driver may also return a value of 1. 
 In other words, a raised error or a return value of 1 indicates that the driver is a V1 driver.
 
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
	
*/
public double getSupportedActions(){
return SupportedActions;
}

/*
 Sets 
 The alignment mode of the mount (Alt/Az, Polar, German Polar).
 

 This is only available for telescope InterfaceVersions 2 and 3
 
*/
public void setAlignmentMode(double _theValue){
this.AlignmentMode=_theValue;
}

/*
 Gets 
 The alignment mode of the mount (Alt/Az, Polar, German Polar).
 

 This is only available for telescope InterfaceVersions 2 and 3
 
*/
public double getAlignmentMode(){
return AlignmentMode;
}

/*
 Sets 
 The Altitude above the local horizon of the telescope's current position (degrees, positive up)
 

*/
public void setAltitude(double _theValue){
this.Altitude=_theValue;
}

/*
 Gets 
 The Altitude above the local horizon of the telescope's current position (degrees, positive up)
 

*/
public double getAltitude(){
return Altitude;
}

/*
 Sets 
 The area of the telescope's aperture, taking into account any obstructions (square meters)
 

 This is only available for telescope InterfaceVersions 2 and 3
 
*/
public void setApertureArea(double _theValue){
this.ApertureArea=_theValue;
}

/*
 Gets 
 The area of the telescope's aperture, taking into account any obstructions (square meters)
 

 This is only available for telescope InterfaceVersions 2 and 3
 
*/
public double getApertureArea(){
return ApertureArea;
}

/*
 Sets 
 The telescope's effective aperture diameter (meters)
 

 This is only available for telescope InterfaceVersions 2 and 3
 
*/
public void setApertureDiameter(double _theValue){
this.ApertureDiameter=_theValue;
}

/*
 Gets 
 The telescope's effective aperture diameter (meters)
 

 This is only available for telescope InterfaceVersions 2 and 3
 
*/
public double getApertureDiameter(){
return ApertureDiameter;
}

/*
 Sets 
 True if the telescope is stopped in the Home position. Set only following a  operation,
  and reset with any slew operation. This property must be False if the telescope does not support homing. 
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 This is only available for telescope InterfaceVersions 2 and 3
 
*/
public void setAtHome(double _theValue){
this.AtHome=_theValue;
}

/*
 Gets 
 True if the telescope is stopped in the Home position. Set only following a  operation,
  and reset with any slew operation. This property must be False if the telescope does not support homing. 
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 This is only available for telescope InterfaceVersions 2 and 3
 
*/
public double getAtHome(){
return AtHome;
}

/*
 Sets 
 True if the telescope has been put into the parked state by the seee  method. Set False by calling the Unpark() method.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
		AtPark is True when the telescope is in the parked state. This is achieved by calling the  method. When AtPark is true, 
 the telescope movement is stopped (or restricted to a small safe range of movement) and all calls that would cause telescope 
 movement (e.g. slewing, changing Tracking state) must not do so, and must raise an error.
		The telescope is taken out of parked state by calling the  method. If the telescope cannot be parked, 
 then AtPark must always return False.
		This is only available for telescope InterfaceVersions 2 and 3
	
*/
public void setAtPark(double _theValue){
this.AtPark=_theValue;
}

/*
 Gets 
 True if the telescope has been put into the parked state by the seee  method. Set False by calling the Unpark() method.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
		AtPark is True when the telescope is in the parked state. This is achieved by calling the  method. When AtPark is true, 
 the telescope movement is stopped (or restricted to a small safe range of movement) and all calls that would cause telescope 
 movement (e.g. slewing, changing Tracking state) must not do so, and must raise an error.
		The telescope is taken out of parked state by calling the  method. If the telescope cannot be parked, 
 then AtPark must always return False.
		This is only available for telescope InterfaceVersions 2 and 3
	
*/
public double getAtPark(){
return AtPark;
}

/*
 Sets 
 The azimuth at the local horizon of the telescope's current position (degrees, North-referenced, positive East/clockwise).
 

*/
public void setAzimuth(double _theValue){
this.Azimuth=_theValue;
}

/*
 Gets 
 The azimuth at the local horizon of the telescope's current position (degrees, North-referenced, positive East/clockwise).
 

*/
public double getAzimuth(){
return Azimuth;
}

/*
 Sets 
 True if this telescope is capable of programmed finding its home position ( method).
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public void setCanFindHome(double _theValue){
this.CanFindHome=_theValue;
}

/*
 Gets 
 True if this telescope is capable of programmed finding its home position ( method).
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public double getCanFindHome(){
return CanFindHome;
}

/*
 Sets 
 True if this telescope is capable of programmed parking (method)
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public void setCanPark(double _theValue){
this.CanPark=_theValue;
}

/*
 Gets 
 True if this telescope is capable of programmed parking (method)
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public double getCanPark(){
return CanPark;
}

/*
 Sets 
 True if this telescope is capable of software-pulsed guiding (via the  method)
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 
*/
public void setCanPulseGuide(double _theValue){
this.CanPulseGuide=_theValue;
}

/*
 Gets 
 True if this telescope is capable of software-pulsed guiding (via the  method)
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 
*/
public double getCanPulseGuide(){
return CanPulseGuide;
}

/*
 Sets 
 True if the  property can be changed to provide offset tracking in the declination axis.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 
*/
public void setCanSetDeclinationRate(double _theValue){
this.CanSetDeclinationRate=_theValue;
}

/*
 Gets 
 True if the  property can be changed to provide offset tracking in the declination axis.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 
*/
public double getCanSetDeclinationRate(){
return CanSetDeclinationRate;
}

/*
 Sets 
 True if the guide rate properties used for  can ba adjusted.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public void setCanSetGuideRates(double _theValue){
this.CanSetGuideRates=_theValue;
}

/*
 Gets 
 True if the guide rate properties used for  can ba adjusted.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public double getCanSetGuideRates(){
return CanSetGuideRates;
}

/*
 Sets 
 True if this telescope is capable of programmed setting of its park position ( method)
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public void setCanSetPark(double _theValue){
this.CanSetPark=_theValue;
}

/*
 Gets 
 True if this telescope is capable of programmed setting of its park position ( method)
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public double getCanSetPark(){
return CanSetPark;
}

/*
 Sets 
 True if the  property can be set, meaning that the mount can be forced to flip.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 This will always return False for non-German-equatorial mounts that do not have to be flipped. 
 May raise an error if the telescope is not connected. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public void setCanSetPierSide(double _theValue){
this.CanSetPierSide=_theValue;
}

/*
 Gets 
 True if the  property can be set, meaning that the mount can be forced to flip.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 This will always return False for non-German-equatorial mounts that do not have to be flipped. 
 May raise an error if the telescope is not connected. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public double getCanSetPierSide(){
return CanSetPierSide;
}

/*
 Sets 
 True if the  property can be changed to provide offset tracking in the right ascension axis.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 
*/
public void setCanSetRightAscensionRate(double _theValue){
this.CanSetRightAscensionRate=_theValue;
}

/*
 Gets 
 True if the  property can be changed to provide offset tracking in the right ascension axis.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 
*/
public double getCanSetRightAscensionRate(){
return CanSetRightAscensionRate;
}

/*
 Sets 
 True if the  property can be changed, turning telescope sidereal tracking on and off.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 
*/
public void setCanSetTracking(double _theValue){
this.CanSetTracking=_theValue;
}

/*
 Gets 
 True if the  property can be changed, turning telescope sidereal tracking on and off.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 
*/
public double getCanSetTracking(){
return CanSetTracking;
}

/*
 Sets 
 True if this telescope is capable of programmed slewing (synchronous or asynchronous) to equatorial coordinates
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 If this is true, then only the synchronous equatorial slewing methods are guaranteed to be supported.
 See the  property for the asynchronous slewing capability flag. 
 May raise an error if the telescope is not connected. 
 
*/
public void setCanSlew(double _theValue){
this.CanSlew=_theValue;
}

/*
 Gets 
 True if this telescope is capable of programmed slewing (synchronous or asynchronous) to equatorial coordinates
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 If this is true, then only the synchronous equatorial slewing methods are guaranteed to be supported.
 See the  property for the asynchronous slewing capability flag. 
 May raise an error if the telescope is not connected. 
 
*/
public double getCanSlew(){
return CanSlew;
}

/*
 Sets 
 True if this telescope is capable of programmed slewing (synchronous or asynchronous) to local horizontal coordinates
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 If this is true, then only the synchronous local horizontal slewing methods are guaranteed to be supported.
 See the  property for the asynchronous slewing capability flag. 
 May raise an error if the telescope is not connected. 
 
*/
public void setCanSlewAltAz(double _theValue){
this.CanSlewAltAz=_theValue;
}

/*
 Gets 
 True if this telescope is capable of programmed slewing (synchronous or asynchronous) to local horizontal coordinates
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 If this is true, then only the synchronous local horizontal slewing methods are guaranteed to be supported.
 See the  property for the asynchronous slewing capability flag. 
 May raise an error if the telescope is not connected. 
 
*/
public double getCanSlewAltAz(){
return CanSlewAltAz;
}

/*
 Sets 
 True if this telescope is capable of programmed asynchronous slewing to local horizontal coordinates
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 This indicates the the asynchronous local horizontal slewing methods are supported.
 If this is True, then  will also be true. 
 May raise an error if the telescope is not connected. 
 
*/
public void setCanSlewAltAzAsync(double _theValue){
this.CanSlewAltAzAsync=_theValue;
}

/*
 Gets 
 True if this telescope is capable of programmed asynchronous slewing to local horizontal coordinates
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 This indicates the the asynchronous local horizontal slewing methods are supported.
 If this is True, then  will also be true. 
 May raise an error if the telescope is not connected. 
 
*/
public double getCanSlewAltAzAsync(){
return CanSlewAltAzAsync;
}

/*
 Sets 
 True if this telescope is capable of programmed asynchronous slewing to equatorial coordinates.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 This indicates the the asynchronous equatorial slewing methods are supported.
 If this is True, then  will also be true.
 May raise an error if the telescope is not connected. 
 
*/
public void setCanSlewAsync(double _theValue){
this.CanSlewAsync=_theValue;
}

/*
 Gets 
 True if this telescope is capable of programmed asynchronous slewing to equatorial coordinates.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 This indicates the the asynchronous equatorial slewing methods are supported.
 If this is True, then  will also be true.
 May raise an error if the telescope is not connected. 
 
*/
public double getCanSlewAsync(){
return CanSlewAsync;
}

/*
 Sets 
 True if this telescope is capable of programmed synching to equatorial coordinates.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 
*/
public void setCanSync(double _theValue){
this.CanSync=_theValue;
}

/*
 Gets 
 True if this telescope is capable of programmed synching to equatorial coordinates.
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 
*/
public double getCanSync(){
return CanSync;
}

/*
 Sets 
 True if this telescope is capable of programmed synching to local horizontal coordinates
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 
*/
public void setCanSyncAltAz(double _theValue){
this.CanSyncAltAz=_theValue;
}

/*
 Gets 
 True if this telescope is capable of programmed synching to local horizontal coordinates
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 May raise an error if the telescope is not connected. 
 
*/
public double getCanSyncAltAz(){
return CanSyncAltAz;
}

/*
 Sets 
 True if this telescope is capable of programmed unparking ( method).
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 If this is true, then  will also be true. May raise an error if the telescope is not connected.
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public void setCanUnpark(double _theValue){
this.CanUnpark=_theValue;
}

/*
 Gets 
 True if this telescope is capable of programmed unparking ( method).
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 If this is true, then  will also be true. May raise an error if the telescope is not connected.
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public double getCanUnpark(){
return CanUnpark;
}

/*
 Sets 
 The declination (degrees) of the telescope's current equatorial coordinates, in the coordinate system given by the  property.
 Reading the property will raise an error if the value is unavailable. 
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
public void setDeclination(double _theValue){
this.Declination=_theValue;
}

/*
 Gets 
 The declination (degrees) of the telescope's current equatorial coordinates, in the coordinate system given by the  property.
 Reading the property will raise an error if the value is unavailable. 
 

		Must be implemented, must not throw a PropertyNotImplementedException.
	
*/
public double getDeclination(){
return Declination;
}

/*
 Sets 
 The declination tracking rate (arcseconds per second, default = 0.0)
 

		DeclinationRate Read must be implemented and must not throw a PropertyNotImplementedException. 
		DeclinationRate Write can throw a PropertyNotImplementedException.
 This property, together with , provides support for "offset tracking".
 Offset tracking is used primarily for tracking objects that move relatively slowly against the equatorial coordinate system.
 It also may be used by a software guiding system that controls rates instead of using the PulseGuide method. 
 
			NOTES:
			
				
				The property value represents an offset from zero motion.
				If  is False, this property will always return 0.
				To discover whether this feature is supported, test the  property.
				The supported range of this property is telescope specific, however, if this feature is supported,
 it can be expected that the range is sufficient to allow correction of guiding errors caused by moderate misalignment 
 and periodic error.
				If this property is non-zero when an equatorial slew is initiated, the telescope should continue to update the slew 
 destination coordinates at the given offset rate.
				This will allow precise slews to a fast-moving target with a slow-slewing telescope.
				When the slew completes, the  and  properties should reflect the final (adjusted) destination.
			
		
		
This is not a required feature of this specification, however it is desirable. 
 
	
*/
public void setDeclinationRate(double _theValue){
this.DeclinationRate=_theValue;
}

/*
 Gets 
 The declination tracking rate (arcseconds per second, default = 0.0)
 

		DeclinationRate Read must be implemented and must not throw a PropertyNotImplementedException. 
		DeclinationRate Write can throw a PropertyNotImplementedException.
 This property, together with , provides support for "offset tracking".
 Offset tracking is used primarily for tracking objects that move relatively slowly against the equatorial coordinate system.
 It also may be used by a software guiding system that controls rates instead of using the PulseGuide method. 
 
			NOTES:
			
				
				The property value represents an offset from zero motion.
				If  is False, this property will always return 0.
				To discover whether this feature is supported, test the  property.
				The supported range of this property is telescope specific, however, if this feature is supported,
 it can be expected that the range is sufficient to allow correction of guiding errors caused by moderate misalignment 
 and periodic error.
				If this property is non-zero when an equatorial slew is initiated, the telescope should continue to update the slew 
 destination coordinates at the given offset rate.
				This will allow precise slews to a fast-moving target with a slow-slewing telescope.
				When the slew completes, the  and  properties should reflect the final (adjusted) destination.
			
		
		
This is not a required feature of this specification, however it is desirable. 
 
	
*/
public double getDeclinationRate(){
return DeclinationRate;
}

/*
 Sets 
 True if the telescope or driver applies atmospheric refraction to coordinates.
 

 If this property is True, the coordinates sent to, and retrieved from, the telescope are unrefracted. 
 This is only available for telescope InterfaceVersions 2 and 3
		
			NOTES:
			
				If the driver does not know whether the attached telescope does its own refraction, and if the driver does not itself calculate 
 refraction, this property (if implemented) must raise an error when read.
				Writing to this property is optional. Often, a telescope (or its driver) calculates refraction using standard atmospheric parameters.
				If the client wishes to calculate a more accurate refraction, then this property could be set to False and these 
 client-refracted coordinates used.
				If disabling the telescope or driver's refraction is not supported, the driver must raise an error when an attempt to set 
 this property to False is made.
				Setting this property to True for a telescope or driver that does refraction, or to False for a telescope or driver that 
 does not do refraction, shall not raise an error. It shall have no effect.
			
		
	
*/
public void setDoesRefraction(double _theValue){
this.DoesRefraction=_theValue;
}

/*
 Gets 
 True if the telescope or driver applies atmospheric refraction to coordinates.
 

 If this property is True, the coordinates sent to, and retrieved from, the telescope are unrefracted. 
 This is only available for telescope InterfaceVersions 2 and 3
		
			NOTES:
			
				If the driver does not know whether the attached telescope does its own refraction, and if the driver does not itself calculate 
 refraction, this property (if implemented) must raise an error when read.
				Writing to this property is optional. Often, a telescope (or its driver) calculates refraction using standard atmospheric parameters.
				If the client wishes to calculate a more accurate refraction, then this property could be set to False and these 
 client-refracted coordinates used.
				If disabling the telescope or driver's refraction is not supported, the driver must raise an error when an attempt to set 
 this property to False is made.
				Setting this property to True for a telescope or driver that does refraction, or to False for a telescope or driver that 
 does not do refraction, shall not raise an error. It shall have no effect.
			
		
	
*/
public double getDoesRefraction(){
return DoesRefraction;
}

/*
 Sets 
 Equatorial coordinate system used by this telescope (e.g. Topocentric or J2000).
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 Most amateur telescopes use local topocentric coordinates. This coordinate system is simply the apparent position in the sky
 (possibly uncorrected for atmospheric refraction) for "here and now", thus these are the coordinates that one would use with digital setting
 circles and most amateur scopes. More sophisticated telescopes use one of the standard reference systems established by professional astronomers.
 The most common is the Julian Epoch 2000 (J2000). These instruments apply corrections for precession,nutation, abberration, etc. to adjust the coordinates 
 from the standard system to the pointing direction for the time and location of "here and now". 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public void setEquatorialSystem(double _theValue){
this.EquatorialSystem=_theValue;
}

/*
 Gets 
 Equatorial coordinate system used by this telescope (e.g. Topocentric or J2000).
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 Most amateur telescopes use local topocentric coordinates. This coordinate system is simply the apparent position in the sky
 (possibly uncorrected for atmospheric refraction) for "here and now", thus these are the coordinates that one would use with digital setting
 circles and most amateur scopes. More sophisticated telescopes use one of the standard reference systems established by professional astronomers.
 The most common is the Julian Epoch 2000 (J2000). These instruments apply corrections for precession,nutation, abberration, etc. to adjust the coordinates 
 from the standard system to the pointing direction for the time and location of "here and now". 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public double getEquatorialSystem(){
return EquatorialSystem;
}

/*
 Sets 
 The telescope's focal length, meters
 

 This property may be used by clients to calculate telescope field of view and plate scale when combined with detector pixel size and geometry. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public void setFocalLength(double _theValue){
this.FocalLength=_theValue;
}

/*
 Gets 
 The telescope's focal length, meters
 

 This property may be used by clients to calculate telescope field of view and plate scale when combined with detector pixel size and geometry. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public double getFocalLength(){
return FocalLength;
}

/*
 Sets 
 The current Declination movement rate offset for telescope guiding (degrees/sec)
 
 
 This is the rate for both hardware/relay guiding and the PulseGuide() method. 
 This is only available for telescope InterfaceVersions 2 and 3
		
			NOTES:
			
				To discover whether this feature is supported, test the  property.
				The supported range of this property is telescope specific, however, if this feature is supported, it can be expected that the range is sufficient to
 allow correction of guiding errors caused by moderate misalignment and periodic error.
				If a telescope does not support separate guiding rates in Right Ascension and Declination, then it is permissible for  and GuideRateDeclination to be tied together.
 In this case, changing one of the two properties will cause a change in the other.
				Mounts must start up with a known or default declination guide rate, and this property must return that known/default guide rate until changed.
			
		
	
*/
public void setGuideRateDeclination(double _theValue){
this.GuideRateDeclination=_theValue;
}

/*
 Gets 
 The current Declination movement rate offset for telescope guiding (degrees/sec)
 
 
 This is the rate for both hardware/relay guiding and the PulseGuide() method. 
 This is only available for telescope InterfaceVersions 2 and 3
		
			NOTES:
			
				To discover whether this feature is supported, test the  property.
				The supported range of this property is telescope specific, however, if this feature is supported, it can be expected that the range is sufficient to
 allow correction of guiding errors caused by moderate misalignment and periodic error.
				If a telescope does not support separate guiding rates in Right Ascension and Declination, then it is permissible for  and GuideRateDeclination to be tied together.
 In this case, changing one of the two properties will cause a change in the other.
				Mounts must start up with a known or default declination guide rate, and this property must return that known/default guide rate until changed.
			
		
	
*/
public double getGuideRateDeclination(){
return GuideRateDeclination;
}

/*
 Sets 
 The current Right Ascension movement rate offset for telescope guiding (degrees/sec)
 

 This is the rate for both hardware/relay guiding and the PulseGuide() method. 
 This is only available for telescope InterfaceVersions 2 and 3
		
			NOTES:
			
				To discover whether this feature is supported, test the  property.
				The supported range of this property is telescope specific, however, if this feature is supported, it can be expected that the range is sufficient to allow correction of guiding errors caused by moderate
 misalignment and periodic error.
				If a telescope does not support separate guiding rates in Right Ascension and Declination, then it is permissible for GuideRateRightAscension and  to be tied together. 
 In this case, changing one of the two properties will cause a change in the other.
				 Mounts must start up with a known or default right ascension guide rate, and this property must return that known/default guide rate until changed.
			
		
	
*/
public void setGuideRateRightAscension(double _theValue){
this.GuideRateRightAscension=_theValue;
}

/*
 Gets 
 The current Right Ascension movement rate offset for telescope guiding (degrees/sec)
 

 This is the rate for both hardware/relay guiding and the PulseGuide() method. 
 This is only available for telescope InterfaceVersions 2 and 3
		
			NOTES:
			
				To discover whether this feature is supported, test the  property.
				The supported range of this property is telescope specific, however, if this feature is supported, it can be expected that the range is sufficient to allow correction of guiding errors caused by moderate
 misalignment and periodic error.
				If a telescope does not support separate guiding rates in Right Ascension and Declination, then it is permissible for GuideRateRightAscension and  to be tied together. 
 In this case, changing one of the two properties will cause a change in the other.
				 Mounts must start up with a known or default right ascension guide rate, and this property must return that known/default guide rate until changed.
			
		
	
*/
public double getGuideRateRightAscension(){
return GuideRateRightAscension;
}

/*
 Sets 
 True if a  command is in progress, False otherwise
 

 Raises an error if the value of the  property is false (the driver does not support the  method). 
 
*/
public void setIsPulseGuiding(double _theValue){
this.IsPulseGuiding=_theValue;
}

/*
 Gets 
 True if a  command is in progress, False otherwise
 

 Raises an error if the value of the  property is false (the driver does not support the  method). 
 
*/
public double getIsPulseGuiding(){
return IsPulseGuiding;
}

/*
 Sets 
 The right ascension (hours) of the telescope's current equatorial coordinates,
 in the coordinate system given by the EquatorialSystem property
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 Reading the property will raise an error if the value is unavailable. 
 
*/
public void setRightAscension(double _theValue){
this.RightAscension=_theValue;
}

/*
 Gets 
 The right ascension (hours) of the telescope's current equatorial coordinates,
 in the coordinate system given by the EquatorialSystem property
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 Reading the property will raise an error if the value is unavailable. 
 
*/
public double getRightAscension(){
return RightAscension;
}

/*
 Sets 
 The right ascension tracking rate offset from sidereal (seconds per sidereal second, default = 0.0)
 

		RightAscensionRate Read must be implemented and must not throw a PropertyNotImplementedException. 
		RightAscensionRate Write can throw a PropertyNotImplementedException.
 This property, together with , provides support for "offset tracking". Offset tracking is used primarily for tracking objects that move relatively slowly
 against the equatorial coordinate system. It also may be used by a software guiding system that controls rates instead of using the PulseGuide method.
 
			NOTES:
 The property value represents an offset from the currently selected . 
 
				If this property is zero, tracking will be at the selected .
				If  is False, this property must always return 0. 
 To discover whether this feature is supported, test the property. 
 The property value is in in seconds of right ascension per sidereal second.
				To convert a given rate in (the more common) units of sidereal seconds per UTC (clock) second, multiply the value by 0.9972695677 
 (the number of UTC seconds in a sidereal second) then set the property. Please note that these units were chosen for the Telescope V1 standard,
 and in retrospect, this was an unfortunate choice. However, to maintain backwards compatibility, the units cannot be changed.
 A simple multiplication is all that's needed, as noted. The supported range of this property is telescope specific, however,
 if this feature is supported, it can be expected that the range is sufficient to allow correction of guiding errors
 caused by moderate misalignment and periodic error. 
				If this property is non-zero when an equatorial slew is initiated, the telescope should continue to update the slew destination coordinates 
 at the given offset rate. This will allow precise slews to a fast-moving target with a slow-slewing telescope. When the slew completes, 
 the  and  properties should reflect the final (adjusted) destination. This is not a required
 feature of this specification, however it is desirable. 
				Use the  property to enable and disable sidereal tracking (if supported). 
			
		
	
*/
public void setRightAscensionRate(double _theValue){
this.RightAscensionRate=_theValue;
}

/*
 Gets 
 The right ascension tracking rate offset from sidereal (seconds per sidereal second, default = 0.0)
 

		RightAscensionRate Read must be implemented and must not throw a PropertyNotImplementedException. 
		RightAscensionRate Write can throw a PropertyNotImplementedException.
 This property, together with , provides support for "offset tracking". Offset tracking is used primarily for tracking objects that move relatively slowly
 against the equatorial coordinate system. It also may be used by a software guiding system that controls rates instead of using the PulseGuide method.
 
			NOTES:
 The property value represents an offset from the currently selected . 
 
				If this property is zero, tracking will be at the selected .
				If  is False, this property must always return 0. 
 To discover whether this feature is supported, test the property. 
 The property value is in in seconds of right ascension per sidereal second.
				To convert a given rate in (the more common) units of sidereal seconds per UTC (clock) second, multiply the value by 0.9972695677 
 (the number of UTC seconds in a sidereal second) then set the property. Please note that these units were chosen for the Telescope V1 standard,
 and in retrospect, this was an unfortunate choice. However, to maintain backwards compatibility, the units cannot be changed.
 A simple multiplication is all that's needed, as noted. The supported range of this property is telescope specific, however,
 if this feature is supported, it can be expected that the range is sufficient to allow correction of guiding errors
 caused by moderate misalignment and periodic error. 
				If this property is non-zero when an equatorial slew is initiated, the telescope should continue to update the slew destination coordinates 
 at the given offset rate. This will allow precise slews to a fast-moving target with a slow-slewing telescope. When the slew completes, 
 the  and  properties should reflect the final (adjusted) destination. This is not a required
 feature of this specification, however it is desirable. 
				Use the  property to enable and disable sidereal tracking (if supported). 
			
		
	
*/
public double getRightAscensionRate(){
return RightAscensionRate;
}

/*
 Sets 
 Indicates the pointing state of the mount.
 

		For historical reasons, this property's name does not reflect its true meaning. The name will not be changed (so as to preserve 
 compatibility), but the meaning has since become clear. All conventional mounts have two pointing states for a given equatorial (sky) position. 
 Mechanical limitations often make it impossible for the mount to position the optics at given HA/Dec in one of the two pointing 
 states, but there are places where the same point can be reached sensibly in both pointing states (e.g. near the pole and 
 close to the meridian). In order to understand these pointing states, consider the following (thanks to Patrick Wallace for this info):
		All conventional telescope mounts have two axes nominally at right angles. For an equatorial, the longitude axis is mechanical 
 hour angle and the latitude axis is mechanical declination. Sky coordinates and mechanical coordinates are two completely separate arenas. 
 This becomes rather more obvious if your mount is an altaz, but it's still true for an equatorial. Both mount axes can in principle 
 move over a range of 360 deg. This is distinct from sky HA/Dec, where Dec is limited to a 180 deg range (+90 to -90).  Apart from 
 practical limitations, any point in the sky can be seen in two mechanical orientations. To get from one to the other the HA axis 
 is moved 180 deg and the Dec axis is moved through the pole a distance twice the sky codeclination (90 - sky declination).
		Mechanical zero HA/Dec will be one of the two ways of pointing at the intersection of the celestial equator and the local meridian. 
 In order to support Dome slaving, where it is important to know which side of the pier the mount is actually on, ASCOM has adopted the 
 convention that the Normal pointing state will be the state where a German Equatorial mount is on the East side of the pier, looking West, with the 
 counterweights below the optical assembly and that  will represent this pointing state.
		Move your scope to this position and consider the two mechanical encoders zeroed. The two pointing states are, then:
 
				Normal ()Where the mechanical Dec is in the range -90 deg to +90 deg
				Beyond the pole ()Where the mechanical Dec is in the range -180 deg to -90 deg or +90 deg to +180 deg.
			
		
		"Side of pier" is a "consequence" of the former definition, not something fundamental. 
 Apart from mechanical interference, the telescope can move from one side of the pier to the other without the mechanical Dec 
 having changed: you could track Polaris forever with the telescope moving from west of pier to east of pier or vice versa every 12h. 
 Thus, "side of pier" is, in general, not a useful term (except perhaps in a loose, descriptive, explanatory sense). 
 All this applies to a fork mount just as much as to a GEM, and it would be wrong to make the "beyond pole" state illegal for the 
 former. Your mount may not be able to get there if your camera hits the fork, but it's possible on some mounts. Whether this is useful 
 depends on whether you're in Hawaii or Finland.
		To first order, the relationship between sky and mechanical HA/Dec is as follows:
		Normal state:
			
				HA_sky  = HA_mech
				Dec_sky = Dec_mech
			
		
		Beyond the pole
			
				HA_sky  = HA_mech + 12h, expressed in range ± 12h
				Dec_sky = 180d - Dec_mech, expressed in range ± 90d
			
		
		Astronomy software often needs to know which which pointing state the mount is in. Examples include setting guiding polarities 
 and calculating dome opening azimuth/altitude. The meaning of the SideOfPier property, then is:
 
				pierEastNormal pointing state
				pierWestBeyond the pole pointing state
			
		
		If the mount hardware reports neither the true pointing state (or equivalent) nor the mechanical declination axis position 
 (which varies from -180 to +180), a driver cannot calculate the pointing state, and *must not* implement SideOfPier.
 If the mount hardware reports only the mechanical declination axis position (-180 to +180) then a driver can calculate SideOfPier as follows:
 
				pierEast = abs(mechanical dec) <= 90 deg
				pierWest = abs(mechanical Dec) > 90 deg
			
		
		It is allowed (though not required) that this property may be written to force the mount to flip. Doing so, however, may change 
 the right ascension of the telescope. During flipping, Telescope.Slewing must return True.
		This property is only available in telescope InterfaceVersions 2 and 3.
		Pointing State and Side of Pier - Help for Driver Developers
		A further document, "Pointing State and Side of Pier", is installed in the Developer Documentation folder by the ASCOM Developer 
 Components installer. This further explains the pointing state concept and includes diagrams illustrating how it relates 
 to physical side of pier for German equatorial telescopes. It also includes details of the tests performed by Conform to determine whether 
 the driver correctly reports the pointing state as defined above.
	
*/
public void setSideOfPier(double _theValue){
this.SideOfPier=_theValue;
}

/*
 Gets 
 Indicates the pointing state of the mount.
 

		For historical reasons, this property's name does not reflect its true meaning. The name will not be changed (so as to preserve 
 compatibility), but the meaning has since become clear. All conventional mounts have two pointing states for a given equatorial (sky) position. 
 Mechanical limitations often make it impossible for the mount to position the optics at given HA/Dec in one of the two pointing 
 states, but there are places where the same point can be reached sensibly in both pointing states (e.g. near the pole and 
 close to the meridian). In order to understand these pointing states, consider the following (thanks to Patrick Wallace for this info):
		All conventional telescope mounts have two axes nominally at right angles. For an equatorial, the longitude axis is mechanical 
 hour angle and the latitude axis is mechanical declination. Sky coordinates and mechanical coordinates are two completely separate arenas. 
 This becomes rather more obvious if your mount is an altaz, but it's still true for an equatorial. Both mount axes can in principle 
 move over a range of 360 deg. This is distinct from sky HA/Dec, where Dec is limited to a 180 deg range (+90 to -90).  Apart from 
 practical limitations, any point in the sky can be seen in two mechanical orientations. To get from one to the other the HA axis 
 is moved 180 deg and the Dec axis is moved through the pole a distance twice the sky codeclination (90 - sky declination).
		Mechanical zero HA/Dec will be one of the two ways of pointing at the intersection of the celestial equator and the local meridian. 
 In order to support Dome slaving, where it is important to know which side of the pier the mount is actually on, ASCOM has adopted the 
 convention that the Normal pointing state will be the state where a German Equatorial mount is on the East side of the pier, looking West, with the 
 counterweights below the optical assembly and that  will represent this pointing state.
		Move your scope to this position and consider the two mechanical encoders zeroed. The two pointing states are, then:
 
				Normal ()Where the mechanical Dec is in the range -90 deg to +90 deg
				Beyond the pole ()Where the mechanical Dec is in the range -180 deg to -90 deg or +90 deg to +180 deg.
			
		
		"Side of pier" is a "consequence" of the former definition, not something fundamental. 
 Apart from mechanical interference, the telescope can move from one side of the pier to the other without the mechanical Dec 
 having changed: you could track Polaris forever with the telescope moving from west of pier to east of pier or vice versa every 12h. 
 Thus, "side of pier" is, in general, not a useful term (except perhaps in a loose, descriptive, explanatory sense). 
 All this applies to a fork mount just as much as to a GEM, and it would be wrong to make the "beyond pole" state illegal for the 
 former. Your mount may not be able to get there if your camera hits the fork, but it's possible on some mounts. Whether this is useful 
 depends on whether you're in Hawaii or Finland.
		To first order, the relationship between sky and mechanical HA/Dec is as follows:
		Normal state:
			
				HA_sky  = HA_mech
				Dec_sky = Dec_mech
			
		
		Beyond the pole
			
				HA_sky  = HA_mech + 12h, expressed in range ± 12h
				Dec_sky = 180d - Dec_mech, expressed in range ± 90d
			
		
		Astronomy software often needs to know which which pointing state the mount is in. Examples include setting guiding polarities 
 and calculating dome opening azimuth/altitude. The meaning of the SideOfPier property, then is:
 
				pierEastNormal pointing state
				pierWestBeyond the pole pointing state
			
		
		If the mount hardware reports neither the true pointing state (or equivalent) nor the mechanical declination axis position 
 (which varies from -180 to +180), a driver cannot calculate the pointing state, and *must not* implement SideOfPier.
 If the mount hardware reports only the mechanical declination axis position (-180 to +180) then a driver can calculate SideOfPier as follows:
 
				pierEast = abs(mechanical dec) <= 90 deg
				pierWest = abs(mechanical Dec) > 90 deg
			
		
		It is allowed (though not required) that this property may be written to force the mount to flip. Doing so, however, may change 
 the right ascension of the telescope. During flipping, Telescope.Slewing must return True.
		This property is only available in telescope InterfaceVersions 2 and 3.
		Pointing State and Side of Pier - Help for Driver Developers
		A further document, "Pointing State and Side of Pier", is installed in the Developer Documentation folder by the ASCOM Developer 
 Components installer. This further explains the pointing state concept and includes diagrams illustrating how it relates 
 to physical side of pier for German equatorial telescopes. It also includes details of the tests performed by Conform to determine whether 
 the driver correctly reports the pointing state as defined above.
	
*/
public double getSideOfPier(){
return SideOfPier;
}

/*
 Sets 
 The local apparent sidereal time from the telescope's internal clock (hours, sidereal)
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 It is required for a driver to calculate this from the system clock if the telescope 
 has no accessible source of sidereal time. Local Apparent Sidereal Time is the sidereal 
 time used for pointing telescopes, and thus must be calculated from the Greenwich Mean
 Sidereal time, longitude, nutation in longitude and true ecliptic obliquity. 
 
*/
public void setSiderealTime(double _theValue){
this.SiderealTime=_theValue;
}

/*
 Gets 
 The local apparent sidereal time from the telescope's internal clock (hours, sidereal)
 

		Must be implemented, must not throw a PropertyNotImplementedException.
 It is required for a driver to calculate this from the system clock if the telescope 
 has no accessible source of sidereal time. Local Apparent Sidereal Time is the sidereal 
 time used for pointing telescopes, and thus must be calculated from the Greenwich Mean
 Sidereal time, longitude, nutation in longitude and true ecliptic obliquity. 
 
*/
public double getSiderealTime(){
return SiderealTime;
}

/*
 Sets 
 The elevation above mean sea level (meters) of the site at which the telescope is located
 

 Setting this property will raise an error if the given value is outside the range -300 through +10000 metres.
 Reading the property will raise an error if the value has never been set or is otherwise unavailable. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public void setSiteElevation(double _theValue){
this.SiteElevation=_theValue;
}

/*
 Gets 
 The elevation above mean sea level (meters) of the site at which the telescope is located
 

 Setting this property will raise an error if the given value is outside the range -300 through +10000 metres.
 Reading the property will raise an error if the value has never been set or is otherwise unavailable. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public double getSiteElevation(){
return SiteElevation;
}

/*
 Sets 
 The geodetic(map) latitude (degrees, positive North, WGS84) of the site at which the telescope is located.
 

 Setting this property will raise an error if the given value is outside the range -90 to +90 degrees.
 Reading the property will raise an error if the value has never been set or is otherwise unavailable. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public void setSiteLatitude(double _theValue){
this.SiteLatitude=_theValue;
}

/*
 Gets 
 The geodetic(map) latitude (degrees, positive North, WGS84) of the site at which the telescope is located.
 

 Setting this property will raise an error if the given value is outside the range -90 to +90 degrees.
 Reading the property will raise an error if the value has never been set or is otherwise unavailable. 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public double getSiteLatitude(){
return SiteLatitude;
}

/*
 Sets 
 The longitude (degrees, positive East, WGS84) of the site at which the telescope is located.
 

 Setting this property will raise an error if the given value is outside the range -180 to +180 degrees.
 Reading the property will raise an error if the value has never been set or is otherwise unavailable.
 Note that West is negative! 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public void setSiteLongitude(double _theValue){
this.SiteLongitude=_theValue;
}

/*
 Gets 
 The longitude (degrees, positive East, WGS84) of the site at which the telescope is located.
 

 Setting this property will raise an error if the given value is outside the range -180 to +180 degrees.
 Reading the property will raise an error if the value has never been set or is otherwise unavailable.
 Note that West is negative! 
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public double getSiteLongitude(){
return SiteLongitude;
}

/*
 Sets 
 True if telescope is currently moving in response to one of the
 Slew methods or the  method, False at all other times.
 

 Reading the property will raise an error if the value is unavailable. If the telescope is not capable of asynchronous slewing, this property will always be False. 
 The definition of "slewing" excludes motion caused by sidereal tracking, PulseGuide, , and .
 It reflects only motion caused by one of the Slew commands, flipping caused by changing the  property, or . 
 
*/
public void setSlewing(double _theValue){
this.Slewing=_theValue;
}

/*
 Gets 
 True if telescope is currently moving in response to one of the
 Slew methods or the  method, False at all other times.
 

 Reading the property will raise an error if the value is unavailable. If the telescope is not capable of asynchronous slewing, this property will always be False. 
 The definition of "slewing" excludes motion caused by sidereal tracking, PulseGuide, , and .
 It reflects only motion caused by one of the Slew commands, flipping caused by changing the  property, or . 
 
*/
public double getSlewing(){
return Slewing;
}

/*
 Sets 
 Specifies a post-slew settling time (sec.).
 

 Adds additional time to slew operations. Slewing methods will not return, 
 and the  property will not become False, until the slew completes and the SlewSettleTime has elapsed.
 This feature (if supported) may be used with mounts that require extra settling time after a slew. 
 
*/
public void setSlewSettleTime(double _theValue){
this.SlewSettleTime=_theValue;
}

/*
 Gets 
 Specifies a post-slew settling time (sec.).
 

 Adds additional time to slew operations. Slewing methods will not return, 
 and the  property will not become False, until the slew completes and the SlewSettleTime has elapsed.
 This feature (if supported) may be used with mounts that require extra settling time after a slew. 
 
*/
public double getSlewSettleTime(){
return SlewSettleTime;
}

/*
 Sets 
 The declination (degrees, positive North) for the target of an equatorial slew or sync operation
 

 Setting this property will raise an error if the given value is outside the range -90 to +90 degrees. Reading the property will raise an error if the value has never been set or is otherwise unavailable. 
 
*/
public void setTargetDeclination(double _theValue){
this.TargetDeclination=_theValue;
}

/*
 Gets 
 The declination (degrees, positive North) for the target of an equatorial slew or sync operation
 

 Setting this property will raise an error if the given value is outside the range -90 to +90 degrees. Reading the property will raise an error if the value has never been set or is otherwise unavailable. 
 
*/
public double getTargetDeclination(){
return TargetDeclination;
}

/*
 Sets 
 The right ascension (hours) for the target of an equatorial slew or sync operation
 

 Setting this property will raise an error if the given value is outside the range 0 to 24 hours. Reading the property will raise an error if the value has never been set or is otherwise unavailable. 
 
*/
public void setTargetRightAscension(double _theValue){
this.TargetRightAscension=_theValue;
}

/*
 Gets 
 The right ascension (hours) for the target of an equatorial slew or sync operation
 

 Setting this property will raise an error if the given value is outside the range 0 to 24 hours. Reading the property will raise an error if the value has never been set or is otherwise unavailable. 
 
*/
public double getTargetRightAscension(){
return TargetRightAscension;
}

/*
 Sets 
 The state of the telescope's sidereal tracking drive.
 

		Tracking Read must be implemented and must not throw a PropertyNotImplementedException. 
		Tracking Write can throw a PropertyNotImplementedException.
 Changing the value of this property will turn the sidereal drive on and off.
 However, some telescopes may not support changing the value of this property
 and thus may not support turning tracking on and off.
 See the  property. 
 
*/
public void setTracking(double _theValue){
this.Tracking=_theValue;
}

/*
 Gets 
 The state of the telescope's sidereal tracking drive.
 

		Tracking Read must be implemented and must not throw a PropertyNotImplementedException. 
		Tracking Write can throw a PropertyNotImplementedException.
 Changing the value of this property will turn the sidereal drive on and off.
 However, some telescopes may not support changing the value of this property
 and thus may not support turning tracking on and off.
 See the  property. 
 
*/
public double getTracking(){
return Tracking;
}

/*
 Sets 
 The current tracking rate of the telescope's sidereal drive
 

		TrackingRate Read must be implemented and must not throw a PropertyNotImplementedException. 
		TrackingRate Write can throw a PropertyNotImplementedException.
 Supported rates (one of the   values) are contained within the  collection.
 Values assigned to TrackingRate must be one of these supported rates. If an unsupported value is assigned to this property, it will raise an error. 
 The currently selected tracking rate can be further adjusted via the  and  properties. These rate offsets are applied to the currently 
 selected tracking rate. Mounts must start up with a known or default tracking rate, and this property must return that known/default tracking rate until changed.
 If the mount's current tracking rate cannot be determined (for example, it is a write-only property of the mount's protocol), 
 it is permitted for the driver to force and report a default rate on connect. In this case, the preferred default is Sidereal rate.
		This is only available for telescope InterfaceVersions 2 and 3
	
*/
public void setTrackingRate(double _theValue){
this.TrackingRate=_theValue;
}

/*
 Gets 
 The current tracking rate of the telescope's sidereal drive
 

		TrackingRate Read must be implemented and must not throw a PropertyNotImplementedException. 
		TrackingRate Write can throw a PropertyNotImplementedException.
 Supported rates (one of the   values) are contained within the  collection.
 Values assigned to TrackingRate must be one of these supported rates. If an unsupported value is assigned to this property, it will raise an error. 
 The currently selected tracking rate can be further adjusted via the  and  properties. These rate offsets are applied to the currently 
 selected tracking rate. Mounts must start up with a known or default tracking rate, and this property must return that known/default tracking rate until changed.
 If the mount's current tracking rate cannot be determined (for example, it is a write-only property of the mount's protocol), 
 it is permitted for the driver to force and report a default rate on connect. In this case, the preferred default is Sidereal rate.
		This is only available for telescope InterfaceVersions 2 and 3
	
*/
public double getTrackingRate(){
return TrackingRate;
}

/*
 Sets 
 Returns a collection of supported  values that describe the permissible
 values of the  property for this telescope type.
 

		Must be implemented and must not throw a PropertyNotImplementedException.
 At a minimum, this must contain an item for .
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public void setTrackingRates(double _theValue){
this.TrackingRates=_theValue;
}

/*
 Gets 
 Returns a collection of supported  values that describe the permissible
 values of the  property for this telescope type.
 

		Must be implemented and must not throw a PropertyNotImplementedException.
 At a minimum, this must contain an item for .
 This is only available for telescope InterfaceVersions 2 and 3
	
*/
public double getTrackingRates(){
return TrackingRates;
}

/*
 Sets 
 The UTC date/time of the telescope's internal clock
 

		UTCDate Read must be implemented and must not throw a PropertyNotImplementedException. 
		UTCDate Write can throw a PropertyNotImplementedException.
 The driver must calculate this from the system clock if the telescope has no accessible source of UTC time. In this case, the property must not be writeable (this would change the system clock!) and will instead raise an error.
 However, it is permitted to change the telescope's internal UTC clock if it is being used for this property. This allows clients to adjust the telescope's UTC clock as needed for accuracy. Reading the property
 will raise an error if the value has never been set or is otherwise unavailable. 
 
*/
public void setUTCDate(double _theValue){
this.UTCDate=_theValue;
}

/*
 Gets 
 The UTC date/time of the telescope's internal clock
 

		UTCDate Read must be implemented and must not throw a PropertyNotImplementedException. 
		UTCDate Write can throw a PropertyNotImplementedException.
 The driver must calculate this from the system clock if the telescope has no accessible source of UTC time. In this case, the property must not be writeable (this would change the system clock!) and will instead raise an error.
 However, it is permitted to change the telescope's internal UTC clock if it is being used for this property. This allows clients to adjust the telescope's UTC clock as needed for accuracy. Reading the property
 will raise an error if the value has never been set or is otherwise unavailable. 
 
*/
public double getUTCDate(){
return UTCDate;
}
}
