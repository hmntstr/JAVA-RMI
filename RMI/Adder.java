    import java.rmi.*;  
    public interface Adder extends Remote{  
    public String add(String x)throws RemoteException;  
    }  
