package ASCOM.Controls;

/*

              Provides a status indicator modeled on a bi-colour red/green LED lamp.
              The lamp can be red or green and  (traffic light colours) and
              can be steady or can flash with a choice of different cadences.
            


*/
public class LedIndicator{

/*

              Gets or sets the LED's status (which controls its display colour).
            

*/
private double Status;
/*

              Sets the text displayed alongside the indicator
            

*/
private double LabelText;
/*

              Sets or reads the 'power status' of the LED
              When the LED is Enabled, it reflects the current colour settings and cadence.
              When disabled, the LED appears off and cadencing is disabled.
            

*/
private double Enabled;
/*

              Gets or sets the LED cadence bitmap.
              If the cadence has changed and is non-steady and the LED is enabled, then the cadence timer is started.
            

              Implements the  property.
            
*/
private double Cadence;


/*

              Default constructor for a new LEDIndicator object. Performs the default processing required
              by the designer.
            

*/
public void LedIndicator(){
return null;
}


/*

            Releases all resources used by the .
            

*/
public void Dispose(){
return null;
}


/*

            Releases the unmanaged resources and optionally releases the managed resources.
            

*/
public void Dispose(Boolean){
return null;
}


/*

              Required method for Designer support - do not modify 
              the contents of this method with the code editor.
            

*/
public void InitializeComponent(){
return null;
}


/*

              Refreshes the LED display, taking account of the power,
              colour and cadence settings.
            

              Implements the  method.
              The  always calls this method on the GUI thread.
            
*/
public void CadenceUpdate(Boolean){
return null;
}


/*

            Renders the 'power off' appearance of the LED indicator.
            

*/
public void RenderOffAppearance(){
return null;
}


/*

            Renders the 'power on' appearance of the LED indicator. The exact appearance depends on the  property.
            

*/
public void RenderOnAppearance(){
return null;
}


/*

              Sets the colour of the LED.
              If the colour is changed, then the LED's panel control is invalidated to force a re-draw.
            

*/
public void SetColour(Drawing.Color){
return null;
}


/*

              Unregister from the .
            

*/
public void StopCadenceUpdates(){
return null;
}


/*

              Register with the .
            

*/
public void StartCadenceUpdates(){
return null;
}

/*
 Sets 
              Gets or sets the LED's status (which controls its display colour).
            

*/
public void setStatus(double _theValue){
this.Status=_theValue;
}

/*
 Gets 
              Gets or sets the LED's status (which controls its display colour).
            

*/
public double getStatus(){
return Status;
}

/*
 Sets 
              Sets the text displayed alongside the indicator
            

*/
public void setLabelText(double _theValue){
this.LabelText=_theValue;
}

/*
 Gets 
              Sets the text displayed alongside the indicator
            

*/
public double getLabelText(){
return LabelText;
}

/*
 Sets 
              Sets or reads the 'power status' of the LED
              When the LED is Enabled, it reflects the current colour settings and cadence.
              When disabled, the LED appears off and cadencing is disabled.
            

*/
public void setEnabled(double _theValue){
this.Enabled=_theValue;
}

/*
 Gets 
              Sets or reads the 'power status' of the LED
              When the LED is Enabled, it reflects the current colour settings and cadence.
              When disabled, the LED appears off and cadencing is disabled.
            

*/
public double getEnabled(){
return Enabled;
}

/*
 Sets 
              Gets or sets the LED cadence bitmap.
              If the cadence has changed and is non-steady and the LED is enabled, then the cadence timer is started.
            

              Implements the  property.
            
*/
public void setCadence(double _theValue){
this.Cadence=_theValue;
}

/*
 Gets 
              Gets or sets the LED cadence bitmap.
              If the cadence has changed and is non-steady and the LED is enabled, then the cadence timer is started.
            

              Implements the  property.
            
*/
public double getCadence(){
return Cadence;
}
}
