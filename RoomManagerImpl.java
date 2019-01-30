/*
Amr Jamal
 */
package hotelrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Amr jamal
 */



public class RoomManagerImpl extends UnicastRemoteObject implements RoomManager { 
    String s="";
    int v=10, w=20 , x=5 , y=3 , z=2  ;
        static Map<String,Integer> name = new HashMap<>();
    public RoomManagerImpl() throws RemoteException{
        super();
    }

    @Override
    public String list() throws RemoteException {
        
        s =( v + " rooms of type 0 are available for 55 Euros per night\n" +
w+" rooms of type 1 are available for 75 Euros per night\n" +
x+" rooms of type 2 are available for 80 Euros per night \n" +
y+" rooms of type 3 are available for 150 Euros per night \n" +
z+" rooms of type 4 are available for 230 Euros per night ");
        return s;
    }

    @Override
    public String book(int o, String n) throws RemoteException {
        if(o==0 && v!=0){
            name.put(n, o);
            v--;
             s="Doon";
        }else
            if(o==1 && w!=0){
                name.put(n, o);
                w--;
                s="Doon";
            }else
                if(o==2 && x!=0){
                    name.put(n, o);
                   x--; 
                   s="Doon";
                }else
                    if(o==3 && y!=0){
                        name.put(n, o);
                        y--;
                        s="Doon";
                    }else
                        if(o==4 && z!=0){
                            name.put(n, o);
                            z--;
                            s="Doon";
                        }else s="no have room";
        
        return s;
    }

    @Override
    public Map<String, Integer> guests() throws RemoteException {
        return name;
    }

} 


