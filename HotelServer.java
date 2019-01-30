/*
Amr Jamal
 */
package hotelrmi;

import java.rmi.registry.Registry;
import javax.management.remote.rmi.RMIConnectionImpl;

/**
 *
 * @author Amr jamal
 */
public class HotelServer {
    public static void main(String argv[]) 
    {
        try {
            Registry u =java.rmi.registry.LocateRegistry.createRegistry(55882);
            u.rebind ("Hotelrmi", new RoomManagerImpl() );
        System.out.println ("Server is ready."); 
        }
        
        catch (Exception e) {
            System.out.println ("Server failed: " + e);
        } 
    
    }

}
