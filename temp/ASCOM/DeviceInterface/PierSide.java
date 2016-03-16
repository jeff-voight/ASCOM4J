package ASCOM.DeviceInterface;

/*

 The pointing state of the mount
 


		Pier side is a GEM-specific term that has historically caused much confusion. 
 As of Platform 6, the PierSide property is defined to refer to the telescope pointing state. Please see  for 
 much more information on this topic.
		In order to support Dome slaving, where it is important to know on which side of the pier the mount is actually located, ASCOM has adopted the 
 convention that the Normal pointing state will be the state where the mount is on the East side of the pier, looking West with the counterweights below 
 the optical assembly.
		Only used with telescope interface versions 2 and later.
	
*/
public class PierSide{

}
