package ASCOM;

/*

              All properties and methods defined by the relevant ASCOM standard interface must exist in each driver. However,
              those properties and methods do not all have to be implemented. This exception is a base class for
              PropertyNotImplementedException and MethodNotImplementedException, which drivers should use for throwing
              the relevant exception(s). This class is intended to be used by clients who wish to catch either of
              the two specific exceptions in a single catch() clause.
            


*/
public class NotImplementedException extends Exception {
}
