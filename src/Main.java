public class Main {
    public static void main(String[] args) {
        persona miPersona = new persona();

        miPersona.setNombre("Shaiel");
        miPersona.setEdad(18);
        miPersona.setTelefono(32145832);

        System.out.println(miPersona.getNombre());
        System.out.println(miPersona.getEdad());
        System.out.println(miPersona.getTelefono());

    }
}
class persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad=edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }
}