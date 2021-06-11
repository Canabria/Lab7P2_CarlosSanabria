
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP1
 */
public class Playlist implements Serializable{
    private ArrayList<Canciones>C;
    private static final long SerialVersionUID=777L;

    public Playlist(ArrayList<Canciones> C) {
        this.C = C;
    }

    public ArrayList<Canciones> getC() {
        return C;
    }

    public void setC(ArrayList<Canciones> C) {
        this.C = C;
    }

    @Override
    public String toString() {
        return "Playlist{" + "C=" + C + '}';
    }
    
}
