package ASCOM.Utilities.Interfaces;

/*

 Interface for KeyValuePair class
 

This is a return type only used by a small number of the Profile.XXXCOM commands. Including
 IProfile.RegisteredDevices, 
 IProfile.SubKeys and 
 IProfile.Values.
*/
public class IKeyValuePair{

/*

 Key member of a key value pair
 

*/
private double Key;
/*

 Value memeber of a key value pair
 

*/
private double Value;

/*
 Sets 
 Key member of a key value pair
 

*/
public void setKey(double _theValue){
this.Key=_theValue;
}

/*
 Gets 
 Key member of a key value pair
 

*/
public double getKey(){
return Key;
}

/*
 Sets 
 Value memeber of a key value pair
 

*/
public void setValue(double _theValue){
this.Value=_theValue;
}

/*
 Gets 
 Value memeber of a key value pair
 

*/
public double getValue(){
return Value;
}
}
