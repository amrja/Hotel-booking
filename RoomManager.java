/*
Amr jamal
 */
package hotelrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

/**
 *
 * @author Amr jamal
 */


public interface RoomManager extends Remote {
    
  public String list() throws RemoteException;
  
  public String book(int x, String y) throws RemoteException;
  
  public Map<String, Integer> guests() throws RemoteException;
  
  
  
  
} 
