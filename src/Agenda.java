public class Agenda 
{
     String[] nombre;
     int[] telefonos;
     int siguiente = 0;
    
    public int getSiguiente()
    {
        return siguiente;
    }
    
    public Agenda(int num)
    {
        nombre = new String[num];
        telefonos = new int[num];
    }
    
    public boolean añadir(String n, int t)
    {
        boolean estado = false;
        if(getSiguiente()<nombre.length)
        {
            nombre[siguiente]=n;
            telefonos[siguiente]=t;
            siguiente++;
            estado = true;
        }
        else if(getSiguiente()==nombre.length)
        {
            redimensionar();
            
        }
        else
        {
            estado = false;
        }
        return estado;
    }
    
    public void redimensionar()
    {
        String[] nuevoarray = new String[nombre.length*2];
        int[] nuevoarray2 = new int[telefonos.length*2];
        
        System.arraycopy(nombre, 0, nuevoarray, 0, nombre.length);
        System.arraycopy(telefonos, 0, nuevoarray2, 0, telefonos.length);
        
        nombre = nuevoarray;
        telefonos = nuevoarray2;
    }
    
    public int buscar(String n)
    {
        for(int i=0; i<nombre.length; i++)
        {
            if(n.equals(nombre[i]))
            {
                return i;
            }
        }
        return -1;
    }
    
    public int buscar(int t)
    {
        for(int i = 0; i<telefonos.length; i++)
        {
            if(t==telefonos[i])
            {
                return i;
            }
        }
        return -1;
    }
    
    public int getTelefono(String n)
    {
        int posicion = buscar(n);
        if(posicion!=-1)
        {
            return telefonos[posicion];
        }
        else
        {
            return 0;
        }
    }
    
    public String getNombre(int t)
    {
        int posicion = buscar(t);
        if(posicion != -1)
        {
            return nombre[posicion];
        }
        else
        {
            return "No existe ese teléfono en la agenda...";
        }
    }
}
