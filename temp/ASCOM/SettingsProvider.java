package ASCOM;

/*

              Provides settings storage for ASCOM device drivers.
              Settings are persisted in the ASCOM Device Profile store.
            


              Original version by Tim Long, March 2009.
              Copyright © 2009 TiGra Astronomy, all rights reserved.
              http://www.tigranetworks.co.uk/Astronomy
            
*/
public class SettingsProvider{

/*

              Returns the provider's friendly name used during configuration.
            

*/
private double Name;
/*

              Gets the provider's friendly description.
            

*/
private double Description;
/*

              Gets the name of the driver or application for which settings are being managed.
              This value is set during provider initialization and cannot be changed thereafter.
            

*/
private double ApplicationName;


/*

              Initializes a new instance of the  class with the default
              profile provider .
            

*/
public void SettingsProvider(){
return null;
}


/*

              Initializes a new instance of the  class with the supplied
              Profile Provider. This is useful for injecting a mock profile object during unit testing.
            

*/
public void SettingsProvider(ASCOM.Utilities.Interfaces.IProfile){
return null;
}


/*

              Initializes the ASCOM Settings Provider.
            

              This method is called by  to initialize the settings provider.
              Normally, this will set the provider's  property to the assembly name
              of the application. This is later used to determine the storage location of each of the settings.
              However, for ASCOM purposes, we can't use the application name and we need to key off the
              ASCOM DeviceID of the driver, so in ASCOM.SettingsProvider, the application name is set but never used.
            
*/
public void Initialize(String,Collections.Specialized.NameValueCollection){
return null;
}


/*

              Retrieves a collection of settings values from the underlying ASCOM Profile store.
            

              If any properties are absent in the underlying store, or if an error occurs while
              retrieving them, then the property's default value is used.	This will be the case
              if the driver has never been registered with ASCOM.
            
*/
public void GetPropertyValues(Configuration.SettingsContext,Configuration.SettingsPropertyCollection){
return null;
}


/*

              Persists a collection of settings values to the underlying ASCOM Profile store.
            

*/
public void SetPropertyValues(Configuration.SettingsContext,Configuration.SettingsPropertyValueCollection){
return null;
}


/*

              Checks whether the driver is registered with ASCOM and, if not, registers it.
            

*/
public void EnsureRegistered(ASCOM.Utilities.Interfaces.IProfile,String){
return null;
}

/*
 Sets 
              Returns the provider's friendly name used during configuration.
            

*/
public void setName(double _theValue){
this.Name=_theValue;
}

/*
 Gets 
              Returns the provider's friendly name used during configuration.
            

*/
public double getName(){
return Name;
}

/*
 Sets 
              Gets the provider's friendly description.
            

*/
public void setDescription(double _theValue){
this.Description=_theValue;
}

/*
 Gets 
              Gets the provider's friendly description.
            

*/
public double getDescription(){
return Description;
}

/*
 Sets 
              Gets the name of the driver or application for which settings are being managed.
              This value is set during provider initialization and cannot be changed thereafter.
            

*/
public void setApplicationName(double _theValue){
this.ApplicationName=_theValue;
}

/*
 Gets 
              Gets the name of the driver or application for which settings are being managed.
              This value is set during provider initialization and cannot be changed thereafter.
            

*/
public double getApplicationName(){
return ApplicationName;
}
}
