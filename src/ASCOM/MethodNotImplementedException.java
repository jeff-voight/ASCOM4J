package ASCOM;

/*

              All methods defined by the relevant ASCOM standard interface must exist in each driver. However,
              those methods do not all have to be implemented. The minimum requirement
              for each defined method is to throw the ASCOM.MethodNotImplementedException. Note
              that no default constructor is supplied. Throwing this requires the the method name.
            


*/
public class MethodNotImplementedException extends Exception{
}
