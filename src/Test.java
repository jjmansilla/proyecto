public class Test 
{
    public static void main(String[] args) 
    {
        Agenda agenda = new Agenda(4);
        
        System.out.println(agenda.añadir("Juan", 636524596));
        System.out.println(agenda.añadir("Pepe", 685673905));
        System.out.println(agenda.añadir("Antonio", 627364589));
        System.out.println(agenda.añadir("Julio", 666518708));
        System.out.println(agenda.añadir("Manolo", 647389475));
        System.out.println(agenda.añadir("francisco", 648493475));
        
        System.out.print("Este es el nombre del teléfono introducido: ");
        System.out.println(agenda.getNombre(666518708));
        System.out.print("Este es el teléfono del nombre introducido: ");
        System.out.println(agenda.getTelefono("francisco"));
        

    }
}
