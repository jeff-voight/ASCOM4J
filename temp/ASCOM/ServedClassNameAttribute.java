package ASCOM;

/*

              An attribute that confers a 'friendly name' on a class and marks it as loadable by LocalServer.
              The 'friendly name' is used by the ASCOM LocalServer to register the class with the ASCOM Chooser.
              The 'friendly name' is what gets displayed to the user in the driver selection combo box.
              This attribute is also used by the LocalServer to filter the assemblies that it will
              attempt to load at runtime. LocalServer will only load classes bearing this attribute.
            


*/
public class ServedClassNameAttribute{

/*

              Gets or sets the 'friendly name' of the served class, as registered with the ASCOM Chooser.
            

*/
private double DisplayName;


/*

              Initializes a new instance of the  class.
            

*/
public void ServedClassNameAttribute(String){
return null;
}

/*
 Sets 
              Gets or sets the 'friendly name' of the served class, as registered with the ASCOM Chooser.
            

*/
public void setDisplayName(double _theValue){
this.DisplayName=_theValue;
}

/*
 Gets 
              Gets or sets the 'friendly name' of the served class, as registered with the ASCOM Chooser.
            

*/
public double getDisplayName(){
return DisplayName;
}
}
