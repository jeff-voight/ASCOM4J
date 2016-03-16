package ASCOM.Controls;

/*

              Defines the members necessary for a control to register and be managed by the
               singleton.
            


*/
public class ICadencedControl{

/*

              Gets or sets the cadence (blink pattern) of the control.
              Different cadence patterns imply different levels of urgency or severity.
            

               is based on a 64-bit long integer but
              only 32-bits are used. This is necessary to achieve CLS compliance, because
              32-bit uints are not CLS compliant.
            
*/
private double Cadence;


/*

              Updates the control's display.
               always calls this method on the GUI thread so that control updates are thread-safe.
            

*/
public void CadenceUpdate(Boolean){
return null;
}

/*
 Sets 
              Gets or sets the cadence (blink pattern) of the control.
              Different cadence patterns imply different levels of urgency or severity.
            

               is based on a 64-bit long integer but
              only 32-bits are used. This is necessary to achieve CLS compliance, because
              32-bit uints are not CLS compliant.
            
*/
public void setCadence(double _theValue){
this.Cadence=_theValue;
}

/*
 Gets 
              Gets or sets the cadence (blink pattern) of the control.
              Different cadence patterns imply different levels of urgency or severity.
            

               is based on a 64-bit long integer but
              only 32-bits are used. This is necessary to achieve CLS compliance, because
              32-bit uints are not CLS compliant.
            
*/
public double getCadence(){
return Cadence;
}
}
