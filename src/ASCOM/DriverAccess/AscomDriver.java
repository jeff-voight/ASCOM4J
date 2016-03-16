package ASCOM.DriverAccess;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.*;
import java.util.ArrayList;

/**
 * Base class for ASCOM driver access toolkit device classes. This class
 * contains the methods common to all devices so that they can be maintained in
 * just one place.
 *
 *
 */
public class AscomDriver {

    /**
     * Returns the member factory created for this device for use by the device
     * class
     *
     *
     */
    private double MemberFactory;

    /**
     *
     * Returns the list of action names supported by this driver.
     *
     * Must be implemented This method must return an empty arraylist if no
     * actions are supported. Please do not throw a . This is an aid to client
     * authors and testers who would otherwise have to repeatedly poll the
     * driver to determine its capabilities. Returned action names may be in
     * mixed case to enhance presentation but will be recognised case
     * insensitively in the Action method. An array list collection has been
     * selected as the vehicle for action names in order to make it easier for
     * clients to determine whether a particular action is supported. This is
     * easily done through the Contains method. Since the collection is also
     * ennumerable it is easy to use constructs such as For Each ... to operate
     * on members without having to be concerned about hom many members are in
     * the collection. Collections have been used in the Telescope specification
     * for a number of years and are known to be compatible with COM. Within
     * .NET the ArrayList is the correct implementation to use as the .NET
     * Generic methods are not compatible with COM.
     *
     */
    private String SupportedActions;

    private String driver;
    private ActiveXComponent component = null;

    /**
     *
     *
     *
     *
     */
    public AscomDriver() {
        component = new ActiveXComponent("ASCOM.AscomDriver");
    }

    /**
     *
     * Creates a new instance of the class.
     *
     *
     */
    public AscomDriver(String driver) {
        this();
        this.driver = driver;
    }

    /**
     *
     * Releases the unmanaged late bound COM object
     *
     *
     */
    public void Dispose() {
        Variant v = component.invoke("Dispose");
    }

    /**
     *
     * Disposes of managed and unmanged resources
     *
     *
     */
    public Boolean Dispose(Boolean bool) {
        Variant v = component.invoke("Dispose", bool);
        return v.getBoolean();
    }

    /**
     *
     * Launches a configuration dialog box for the driver. The call will not
     * return until the user clicks OK or cancel manually.
     *
     * Must be implemented
     */
    public String SetupDialog() {
        Variant v = component.invoke("SetupDialog");
        return v.getString();
    }

    /**
     *
     * Invokes the specified device-specific action.
     *
     * Can throw a not implemented exception This method is intended for use in
     * all current and future device types and to avoid name clashes, management
     * of action names is important from day 1. A two-part naming convention
     * will be adopted - DeviceType:UniqueActionName where:
     *
     * DeviceType is the same value as would be used by e.g. Telescope, Camera,
     * Switch etc. UniqueActionName is a single word, or multiple words joined
     * by underscore characters, that sensibly describes the action to be
     * performed.
     *
     *
     * It is recommended that UniqueActionNames should be a maximum of 16
     * characters for legibility. Should the same function and UniqueActionName
     * be supported by more than one type of device, the reserved DeviceType of
     * “General” will be used. Action names will be case insensitive, so
     * FilterWheel:SelectWheel, filterwheel:selectwheel and
     * FILTERWHEEL:SELECTWHEEL will all refer to the same action. The names of
     * all supported actions must bre returned in the property.
     *
     */
    public String Action(String action, String params) {
        Variant v = component.invoke(action, params);
        return v.getString();
    }

    /**
     *
     * Transmits an arbitrary string to the device and does not wait for a
     * response. Optionally, protocol framing characters may be added to the
     * string before transmission.
     *
     * Can throw a not implemented exception
     */
    public void CommandBlind(String command, Boolean raw) {
        Variant v = component.invoke(command, raw);
    }

    /**
     *
     * Transmits an arbitrary string to the device and waits for a boolean
     * response. Optionally, protocol framing characters may be added to the
     * string before transmission.
     *
     * Can throw a not implemented exception
     */
    public Boolean CommandBool(String command, Boolean raw) {
        Variant v = component.invoke(command, raw);
        return v.getBoolean();
    }

    /**
     *
     * Transmits an arbitrary string to the device and waits for a string
     * response. Optionally, protocol framing characters may be added to the
     * string before transmission.
     *
     * Can throw a not implemented exception
     */
    public String CommandString(String command, Boolean raw) {
        Variant v = component.invoke(command, raw);
        return v.getString();
    }

    /**
     * Sets Returns the member factory created for this device for use by the
     * device class
     *
     *
     */
    public void setMemberFactory(double _theValue) {
        this.MemberFactory = _theValue;
    }

    /**
     * Gets Returns the member factory created for this device for use by the
     * device class
     *
     *
     */
    public double getMemberFactory() {
        return MemberFactory;
    }

    /**
     * Sets Set True to connect to the device hardware. Set False to disconnect
     * from the device hardware. You can also read the property to check whether
     * it is connected. This reports the current hardware state.
     *
     *
     * Must be implementedDo not use a NotConnectedException here, that
     * exception is for use in other methods that require a connection in order
     * to succeed. The Connected property sets and reports the state of
     * connection to the device hardware. For a hub this means that Connected
     * will be true when the first driver connects and will only be set to false
     * when all drivers have disconnected. A second driver may find that
     * Connected is already true and setting Connected to false does not report
     * Connected as false. This is not an error because the physical state is
     * that the hardware connection is still true. Multiple calls setting
     * Connected to true or false will not cause an error.
     *
     */
    public void setConnected(Boolean bool) {
        component.setProperty("Connected", bool);

    }

    /**
     * Gets Set True to connect to the device hardware. Set False to disconnect
     * from the device hardware. You can also read the property to check whether
     * it is connected. This reports the current hardware state.
     *
     *
     * Must be implementedDo not use a NotConnectedException here, that
     * exception is for use in other methods that require a connection in order
     * to succeed. The Connected property sets and reports the state of
     * connection to the device hardware. For a hub this means that Connected
     * will be true when the first driver connects and will only be set to false
     * when all drivers have disconnected. A second driver may find that
     * Connected is already true and setting Connected to false does not report
     * Connected as false. This is not an error because the physical state is
     * that the hardware connection is still true. Multiple calls setting
     * Connected to true or false will not cause an error.
     *
     */
    public Boolean getConnected() {
        Boolean bool = component.getPropertyAsBoolean("Connected");
        return bool;
    }

    /**
     * Sets Returns a description of the device, such as manufacturer and
     * modelnumber. Any ASCII characters may be used. * Must be implemented
     */
    public void setDescription(String description) {
        component.setProperty("Description", description);
    }

    /**
     * Gets Returns a description of the device, such as manufacturer and
     * modelnumber. Any ASCII characters may be used. * Must be implemented
     */
    public String getDescription() {
        return component.getPropertyAsString("Description");
    }

    /**
     * Sets Descriptive and version information about this ASCOM driver.
     *
     *
     * Must be implemented This string may contain line endings and may be
     * hundreds to thousands of characters long. It is intended to display
     * detailed information on the ASCOM driver, including version and copyright
     * data. See the property for information on the device itself. To get the
     * driver version in a parseable string, use the property.
     *
     */
    public void setDriverInfo(String driverInfo) {
        component.setProperty("DriverInfo", driverInfo);
    }

    /**
     * Gets Descriptive and version information about this ASCOM driver.
     *
     *
     * Must be implemented This string may contain line endings and may be
     * hundreds to thousands of characters long. It is intended to display
     * detailed information on the ASCOM driver, including version and copyright
     * data. See the property for information on the device itself. To get the
     * driver version in a parseable string, use the property.
     *
     */
    public String getDriverInfo() {
        return component.getPropertyAsString("DriverInfo");
    }

    /**
     * Sets A string containing only the major and minor version of the driver.
     *
     * Must be implemented This must be in the form "n.n". It should not to be
     * confused with the property, which is the version of this specification
     * supported by the driver.
     *
     */
    public void setDriverVersion(String driverVersion) {
        component.setProperty("DriverVersion", driverVersion);
    }

    /**
     * Gets A string containing only the major and minor version of the driver.
     *
     * Must be implemented This must be in the form "n.n". It should not to be
     * confused with the property, which is the version of this specification
     * supported by the driver.
     *
     */
    public String getDriverVersion() {
        return component.getPropertyAsString("DriverVersion");
    }

    /**
     * Sets The interface version number that this device supports.
     *
     * Must be implemented Clients can detect legacy V1 drivers by trying to
     * read ths property. If the driver raises an error, it is a V1 driver. V1
     * did not specify this property. A driver may also return a value of 1. In
     * other words, a raised error or a return value of 1 indicates that the
     * driver is a V1 driver.
     *
     */
    public void setInterfaceVersion(String interfaceVersion) {
        component.setProperty("InterfaceVersion", interfaceVersion);
    }

    /**
     * Gets The interface version number that this device supports.
     *
     * Must be implemented Clients can detect legacy V1 drivers by trying to
     * read ths property. If the driver raises an error, it is a V1 driver. V1
     * did not specify this property. A driver may also return a value of 1. In
     * other words, a raised error or a return value of 1 indicates that the
     * driver is a V1 driver.
     *
     */
    public String getInterfaceVersion() {
        return component.getPropertyAsString("InterfaceVersion");
    }

    /**
     * Sets The short name of the driver, for display purposes
     *
     * Must be implemented
     */
    public void setName(String name) {
        component.setProperty("Name", name);
    }

    /**
     * Gets The short name of the driver, for display purposes
     *
     * Must be implemented
     */
    public String getName() {
        return component.getPropertyAsString("Name");
    }

    /**
     * Sets Returns the list of action names supported by this driver.
     *
     * Must be implemented This method must return an empty arraylist if no
     * actions are supported. Please do not throw a . This is an aid to client
     * authors and testers who would otherwise have to repeatedly poll the
     * driver to determine its capabilities. Returned action names may be in
     * mixed case to enhance presentation but will be recognised case
     * insensitively in the Action method. An array list collection has been
     * selected as the vehicle for action names in order to make it easier for
     * clients to determine whether a particular action is supported. This is
     * easily done through the Contains method. Since the collection is also
     * ennumerable it is easy to use constructs such as For Each ... to operate
     * on members without having to be concerned about hom many members are in
     * the collection. Collections have been used in the Telescope specification
     * for a number of years and are known to be compatible with COM. Within
     * .NET the ArrayList is the correct implementation to use as the .NET
     * Generic methods are not compatible with COM.
     *
     */
    public void setSupportedActions(String supportedActions) {
        component.setProperty("SupportedActions", supportedActions);
    }

    /**
     * Gets Returns the list of action names supported by this driver.
     *
     * Must be implemented This method must return an empty arraylist if no
     * actions are supported. Please do not throw a . This is an aid to client
     * authors and testers who would otherwise have to repeatedly poll the
     * driver to determine its capabilities. Returned action names may be in
     * mixed case to enhance presentation but will be recognised case
     * insensitively in the Action method. An array list collection has been
     * selected as the vehicle for action names in order to make it easier for
     * clients to determine whether a particular action is supported. This is
     * easily done through the Contains method. Since the collection is also
     * ennumerable it is easy to use constructs such as For Each ... to operate
     * on members without having to be concerned about hom many members are in
     * the collection. Collections have been used in the Telescope specification
     * for a number of years and are known to be compatible with COM. Within
     * .NET the ArrayList is the correct implementation to use as the .NET
     * Generic methods are not compatible with COM.
     *
     */
    public String getSupportedActions() {
        return component.getPropertyAsString("SupportedActions");
    }
}
