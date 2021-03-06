
import javax.swing.JProgressBar;
public class HiloBarra extends Thread{
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    int duracion;
    String nombre;
    
    
    public HiloBarra(JProgressBar barra, int duracion, String nombre)
    {
        this.nombre=nombre;
        this.barra=barra;
        avanzar=true;
        vive=true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    public void run()
    {
        barra.setValue(0);
       while (vive) {
            if (avanzar) {
                barra.setValue(barra.getValue()+1);
               barra.setString(Integer.toString(barra.getValue()) + nombre);
               if(barra.getValue()==duracion)
               {
                   avanzar=false;
               }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
    
    
}
