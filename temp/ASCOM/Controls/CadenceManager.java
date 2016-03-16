package ASCOM.Controls;

/*

              Manages objects that must be toggled on and off in a regular pattern over time. This is known as a cadence.
              CadenceManager is intended primarily for Windows Forms controls, but can be used for any item that implements
              the  interface.
            


              CadenceManager behaves slightly differently if the managed item is a Windows Forms control.
              
                Invisible controls do not receive updates until they become visible again.
                The  method is marshalled to the GUI thread.
              
            
*/
public class CadenceManager{

/*

              Gets a reference to the Singleton.
              If the Singleton has not yet be instantiated, this causes the object
              to be created and the constructor to execute (lazy loading).
              This operation uses the double-checked locking pattern to ensure thread-safety.
            

*/
private double Instance;


/*

            Initializes a new instance of the  class.
            This constructor is declared private so that no instances of the class can be created
            except by the class itself - this is how the singleton pattern ensures there is just a single instance.
            

*/
public void CadenceManager(){
return null;
}


/*

              Adds the specified  to the list of managed controls.
              If this is the first control being added, then the update timer is configured and started.
            

              Each control can only appear in the list once (duplicate adds will be silently ignored).
            
*/
public void Add(ASCOM.Controls.ICadencedControl){
return null;
}


/*

              Removes a control from the update list.
              If no managed controls remain in the list, then the update timer is stopped.
            

              If the control is null, or is not in the update list, no action is taken.
              If the update list is empty after the control is removed, then the cadence timer is stopped.
            
*/
public void Remove(ASCOM.Controls.ICadencedControl){
return null;
}


/*

              Handles the Tick event of the tmrCadence control.
              Computes the new display status for each cadenced control based on its 
              property and requests the control update itself with the new value.
            

*/
public void TmrCadenceTick(Object,Timers.ElapsedEventArgs){
return null;
}

/*
 Sets 
              Gets a reference to the Singleton.
              If the Singleton has not yet be instantiated, this causes the object
              to be created and the constructor to execute (lazy loading).
              This operation uses the double-checked locking pattern to ensure thread-safety.
            

*/
public void setInstance(double _theValue){
this.Instance=_theValue;
}

/*
 Gets 
              Gets a reference to the Singleton.
              If the Singleton has not yet be instantiated, this causes the object
              to be created and the constructor to execute (lazy loading).
              This operation uses the double-checked locking pattern to ensure thread-safety.
            

*/
public double getInstance(){
return Instance;
}
}
