package ASCOM.DeviceInterface;

/*

 Defines the IVideoFrame Interface.
 


*/
public class IVideoFrame{

/*

 Returns a safearray of int32 containing the pixel values from the video frame. The array could be one of: ImageArray[Pixels], ImageArray[Height, Width], ImageArray[NumPlane, Pixels] 
 or ImageArray[NumPlane, Height, Width].
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
		The application must inspect the Safearray parameters to determine the dimensions and also the  to determine if the image is Color or not.
 The following table should be used to determine the format of the data:
		
			
				
				
				
				
					
						Dimensions
					
						SensorType
					
						Array Format
				
				
					1; int[]
					Monochrome, RGGB, CMYG, CMYG2, LRGB
					A row major ImageArray[Pixels] of  *  elements. The pixels in the array start from the top left part of the image and are listed by horizontal lines/rows. The second pixel in the array is the second pixel from the first horizontal row
 and the second last pixel in the array is the second last pixels from the last horizontal row.
				
				
					1; int[]
					Color
					Invalid configuration.
				
				
					2; int[,]
					Monochrome, RGGB, CMYG, CMYG2, LRGB
					ImageArray[Height, Width] of  x  elements.
				
				
					2; int[,]
					Color
					ImageArray[NumPlane, Pixels] of NumPlanes x  *  elements. The order of the three colour planes is 
 first is R, the second is G and third is B. The pixels in second dimension of the array start from the top left part of the image and are listed by horizontal lines/rows. The second pixel is the second pixel from the first horizontal row
 and the second last pixel is the second last pixels from the last horizontal row.
				
				
					3; int[,,]
					Monochrome, RGGB, CMYG, CMYG2, LRGB
					Invalid configuration.
				
				
					3; int[,,]
					Color
					ImageArray[NumPlane, Height, Width] of NumPlanes x  x  elements. The order of the three colour planes is 
 first is R, the second is G and third is B.
				
			
		
		In Color SensorType mode, if the application cannot handle multispectral images, it should use just the first plane.
	
*/
private double ImageArray;
/*

 Returns a preview bitmap for the last video frame as an array of byte. 
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException. The application can use this bitmap to show a preview image of the last video frame when required. This is a convenience property for 
 those applications that don't require to process the  but usually only adjust the video camera settings and then record a video file. 
 When a 24bit RGB image can be returned by the driver this should be the preferred format. 
	
*/
private double PreviewBitmap;
/*

 Returns the frame number.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException. 
 The frame number of the first exposed frame may not be zero and is dependent on the device and/or the driver. The frame number increases with each acquired frame not with each requested frame by the client.
 
*/
private double FrameNumber;
/*

 Returns the actual exposure duration in seconds (i.e. shutter open time).
 

 This may differ from the exposure time corresponding to the requested frame exposure due to shutter latency, camera timing precision, etc.
 
*/
private double ExposureDuration;
/*

 Returns the actual exposure start time in the FITS-standard CCYY-MM-DDThh:mm:ss[.sss...] format, if supported.
 

*/
private double ExposureStartTime;
/*

 Returns additional information associated with the video frame as a list of named variables.
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
		The returned object contains entries for each value. For each entry, the Key property is the value's name, and the Value property is the string value itself.
  This property must return an empty list if no video frame metadata is provided.
 The Keys is a single word, or multiple words joined by underscore characters, that sensibly describes the variable. It is recommended that Keys 
 should be a maximum of 16 characters for legibility and all upper case.
		The KeyValuePair objects are instances of the KeyValuePair class
	
*/
private double ImageMetadata;

/*
 Sets 
 Returns a safearray of int32 containing the pixel values from the video frame. The array could be one of: ImageArray[Pixels], ImageArray[Height, Width], ImageArray[NumPlane, Pixels] 
 or ImageArray[NumPlane, Height, Width].
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
		The application must inspect the Safearray parameters to determine the dimensions and also the  to determine if the image is Color or not.
 The following table should be used to determine the format of the data:
		
			
				
				
				
				
					
						Dimensions
					
						SensorType
					
						Array Format
				
				
					1; int[]
					Monochrome, RGGB, CMYG, CMYG2, LRGB
					A row major ImageArray[Pixels] of  *  elements. The pixels in the array start from the top left part of the image and are listed by horizontal lines/rows. The second pixel in the array is the second pixel from the first horizontal row
 and the second last pixel in the array is the second last pixels from the last horizontal row.
				
				
					1; int[]
					Color
					Invalid configuration.
				
				
					2; int[,]
					Monochrome, RGGB, CMYG, CMYG2, LRGB
					ImageArray[Height, Width] of  x  elements.
				
				
					2; int[,]
					Color
					ImageArray[NumPlane, Pixels] of NumPlanes x  *  elements. The order of the three colour planes is 
 first is R, the second is G and third is B. The pixels in second dimension of the array start from the top left part of the image and are listed by horizontal lines/rows. The second pixel is the second pixel from the first horizontal row
 and the second last pixel is the second last pixels from the last horizontal row.
				
				
					3; int[,,]
					Monochrome, RGGB, CMYG, CMYG2, LRGB
					Invalid configuration.
				
				
					3; int[,,]
					Color
					ImageArray[NumPlane, Height, Width] of NumPlanes x  x  elements. The order of the three colour planes is 
 first is R, the second is G and third is B.
				
			
		
		In Color SensorType mode, if the application cannot handle multispectral images, it should use just the first plane.
	
*/
public void setImageArray(double _theValue){
this.ImageArray=_theValue;
}

/*
 Gets 
 Returns a safearray of int32 containing the pixel values from the video frame. The array could be one of: ImageArray[Pixels], ImageArray[Height, Width], ImageArray[NumPlane, Pixels] 
 or ImageArray[NumPlane, Height, Width].
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
		The application must inspect the Safearray parameters to determine the dimensions and also the  to determine if the image is Color or not.
 The following table should be used to determine the format of the data:
		
			
				
				
				
				
					
						Dimensions
					
						SensorType
					
						Array Format
				
				
					1; int[]
					Monochrome, RGGB, CMYG, CMYG2, LRGB
					A row major ImageArray[Pixels] of  *  elements. The pixels in the array start from the top left part of the image and are listed by horizontal lines/rows. The second pixel in the array is the second pixel from the first horizontal row
 and the second last pixel in the array is the second last pixels from the last horizontal row.
				
				
					1; int[]
					Color
					Invalid configuration.
				
				
					2; int[,]
					Monochrome, RGGB, CMYG, CMYG2, LRGB
					ImageArray[Height, Width] of  x  elements.
				
				
					2; int[,]
					Color
					ImageArray[NumPlane, Pixels] of NumPlanes x  *  elements. The order of the three colour planes is 
 first is R, the second is G and third is B. The pixels in second dimension of the array start from the top left part of the image and are listed by horizontal lines/rows. The second pixel is the second pixel from the first horizontal row
 and the second last pixel is the second last pixels from the last horizontal row.
				
				
					3; int[,,]
					Monochrome, RGGB, CMYG, CMYG2, LRGB
					Invalid configuration.
				
				
					3; int[,,]
					Color
					ImageArray[NumPlane, Height, Width] of NumPlanes x  x  elements. The order of the three colour planes is 
 first is R, the second is G and third is B.
				
			
		
		In Color SensorType mode, if the application cannot handle multispectral images, it should use just the first plane.
	
*/
public double getImageArray(){
return ImageArray;
}

/*
 Sets 
 Returns a preview bitmap for the last video frame as an array of byte. 
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException. The application can use this bitmap to show a preview image of the last video frame when required. This is a convenience property for 
 those applications that don't require to process the  but usually only adjust the video camera settings and then record a video file. 
 When a 24bit RGB image can be returned by the driver this should be the preferred format. 
	
*/
public void setPreviewBitmap(double _theValue){
this.PreviewBitmap=_theValue;
}

/*
 Gets 
 Returns a preview bitmap for the last video frame as an array of byte. 
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException. The application can use this bitmap to show a preview image of the last video frame when required. This is a convenience property for 
 those applications that don't require to process the  but usually only adjust the video camera settings and then record a video file. 
 When a 24bit RGB image can be returned by the driver this should be the preferred format. 
	
*/
public double getPreviewBitmap(){
return PreviewBitmap;
}

/*
 Sets 
 Returns the frame number.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException. 
 The frame number of the first exposed frame may not be zero and is dependent on the device and/or the driver. The frame number increases with each acquired frame not with each requested frame by the client.
 
*/
public void setFrameNumber(double _theValue){
this.FrameNumber=_theValue;
}

/*
 Gets 
 Returns the frame number.
 
Must be implemented, must not throw an ASCOM.PropertyNotImplementedException. 
 The frame number of the first exposed frame may not be zero and is dependent on the device and/or the driver. The frame number increases with each acquired frame not with each requested frame by the client.
 
*/
public double getFrameNumber(){
return FrameNumber;
}

/*
 Sets 
 Returns the actual exposure duration in seconds (i.e. shutter open time).
 

 This may differ from the exposure time corresponding to the requested frame exposure due to shutter latency, camera timing precision, etc.
 
*/
public void setExposureDuration(double _theValue){
this.ExposureDuration=_theValue;
}

/*
 Gets 
 Returns the actual exposure duration in seconds (i.e. shutter open time).
 

 This may differ from the exposure time corresponding to the requested frame exposure due to shutter latency, camera timing precision, etc.
 
*/
public double getExposureDuration(){
return ExposureDuration;
}

/*
 Sets 
 Returns the actual exposure start time in the FITS-standard CCYY-MM-DDThh:mm:ss[.sss...] format, if supported.
 

*/
public void setExposureStartTime(double _theValue){
this.ExposureStartTime=_theValue;
}

/*
 Gets 
 Returns the actual exposure start time in the FITS-standard CCYY-MM-DDThh:mm:ss[.sss...] format, if supported.
 

*/
public double getExposureStartTime(){
return ExposureStartTime;
}

/*
 Sets 
 Returns additional information associated with the video frame as a list of named variables.
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
		The returned object contains entries for each value. For each entry, the Key property is the value's name, and the Value property is the string value itself.
  This property must return an empty list if no video frame metadata is provided.
 The Keys is a single word, or multiple words joined by underscore characters, that sensibly describes the variable. It is recommended that Keys 
 should be a maximum of 16 characters for legibility and all upper case.
		The KeyValuePair objects are instances of the KeyValuePair class
	
*/
public void setImageMetadata(double _theValue){
this.ImageMetadata=_theValue;
}

/*
 Gets 
 Returns additional information associated with the video frame as a list of named variables.
 

		Must be implemented, must not throw an ASCOM.PropertyNotImplementedException.
		The returned object contains entries for each value. For each entry, the Key property is the value's name, and the Value property is the string value itself.
  This property must return an empty list if no video frame metadata is provided.
 The Keys is a single word, or multiple words joined by underscore characters, that sensibly describes the variable. It is recommended that Keys 
 should be a maximum of 16 characters for legibility and all upper case.
		The KeyValuePair objects are instances of the KeyValuePair class
	
*/
public double getImageMetadata(){
return ImageMetadata;
}
}
