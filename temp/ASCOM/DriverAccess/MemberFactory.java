package ASCOM.DriverAccess;

/*

            A factory class to access any registered driver members
            


*/
public class MemberFactory{

/*

            Returns the instance of the driver
            

*/
private double GetLateBoundObject;
/*

            Returns true is the driver is COM based
            

*/
private double IsComObject;
/*

            Returns the driver type
            

*/
private double GetObjType;
/*

            Returns a list of supported interfaces
            

*/
private double GetInterfaces;


/*

            Constructor, creates an instance of the of the ASCOM driver using the given TraceLogger
            
            

*/
public void MemberFactory(String,ASCOM.Utilities.TraceLogger){
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

            Calls a method on an object dynamically. 
            
            parameterTypes must match the parameters and in the same order.
            

*/
public void CallMember(Int32,String,Type[],Object[]){
return null;
}


/*

            Checks for ASCOM exceptions returned as inner exceptions of TargetInvocationException. When new ASCOM exceptions are created 
            they must be added to this method. They will then be used in all three cases of Property Get, Property Set and Method call. 
            

*/
public void CheckDotNetExceptions(String,Exception){
return null;
}

/*
 Sets 
            Returns the instance of the driver
            

*/
public void setGetLateBoundObject(double _theValue){
this.GetLateBoundObject=_theValue;
}

/*
 Gets 
            Returns the instance of the driver
            

*/
public double getGetLateBoundObject(){
return GetLateBoundObject;
}

/*
 Sets 
            Returns true is the driver is COM based
            

*/
public void setIsComObject(double _theValue){
this.IsComObject=_theValue;
}

/*
 Gets 
            Returns true is the driver is COM based
            

*/
public double getIsComObject(){
return IsComObject;
}

/*
 Sets 
            Returns the driver type
            

*/
public void setGetObjType(double _theValue){
this.GetObjType=_theValue;
}

/*
 Gets 
            Returns the driver type
            

*/
public double getGetObjType(){
return GetObjType;
}

/*
 Sets 
            Returns a list of supported interfaces
            

*/
public void setGetInterfaces(double _theValue){
this.GetInterfaces=_theValue;
}

/*
 Gets 
            Returns a list of supported interfaces
            

*/
public double getGetInterfaces(){
return GetInterfaces;
}
}
