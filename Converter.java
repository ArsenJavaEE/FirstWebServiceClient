

package wtp;

public interface Converter extends java.rmi.Remote {
    public float celsiusToFarenheit(float celsius) throws java.rmi.RemoteException;
    public float farenheitToCelsius(float farenheit) throws java.rmi.RemoteException;
}
