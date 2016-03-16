package ASCOM.DriverAccess;

/*

             Late bound TrackingRates implementation
            


*/
public class TrackingRates{

/*

            Return a drive rate given its index
            

*/
private double Item;
/*

            Returns the number of driverates supported by the telescope 
            

*/
private double Count;


/*

            TrackingRates constructor
            

*/
public void TrackingRates(Type,Object,ASCOM.Utilities.TraceLogger){
return null;
}


/*

            Returns an enumerator for the driverates object
            

*/
public void GetEnumerator(){
return null;
}


/*

            Disposes of this object
            

*/
public void Dispose(){
return null;
}

/*
 Sets 
            Return a drive rate given its index
            

*/
public void setItem(double _theValue){
this.Item=_theValue;
}

/*
 Gets 
            Return a drive rate given its index
            

*/
public double getItem(){
return Item;
}

/*
 Sets 
            Returns the number of driverates supported by the telescope 
            

*/
public void setCount(double _theValue){
this.Count=_theValue;
}

/*
 Gets 
            Returns the number of driverates supported by the telescope 
            

*/
public double getCount(){
return Count;
}
}
