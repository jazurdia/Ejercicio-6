package Classes;

import Interfaces.Callinterface;
import Interfaces.Internetinterface;
import Interfaces.Pictureinterface;
import Interfaces.Videointerface;

/******************************************************************
smartphone.java
Autor: Diego Morales, Javier Azurdia
Última modificación: 09/11/2021
******************************************************************/
public class Smartphone extends Producto implements Callinterface, Pictureinterface, Internetinterface, Videointerface{

    boolean portable = true;

    public Smartphone(String name, int precio, int serie, String marca, String fabDate, int marcaAr) {
        super(name, precio, serie, marca, fabDate, marcaAr);
        //TODO Auto-generated constructor stub

    }

    @Override
    public boolean doVid() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public String doInternet(String url) {
        // TODO Auto-generated method stub
        return url;
    }

    @Override
    public boolean doPic() {
        // TODO Auto-generated method stub
        return true;
        
    }

    @Override
    public int doCall(int phone_number) {
        // TODO Auto-generated method stub
        return phone_number;
    }

    @Override
    public void execute() {
        // video, internet, pic, call. 
        v.calling(doCall(v.pedirNumero()));
        v.Internet(doInternet(v.PedirURL()));
        v.video(doVid());
        v.Foto(doPic());
        
    }

    
}
