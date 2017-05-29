package modelo;

public class Empleado {
    //Atributos encapsulados
    private String clave;
    private String nombre;
    private String apellidos;
    private int edad;
    private String rfc;
    private String telefono;


    public Empleado(){
        clave = "";
        nombre = "";
        apellidos = "";
        edad = 18;
        rfc = "";
        telefono = "";
    }
    
 
    public String getClave() {
        return clave;
    }

  
    public void setClave(String clave) {
        this.clave = clave;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getRfc() {
        return rfc;
    }


    public void setRfc(String rfc) {
        this.rfc = rfc;
    }


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    

    public String mostrarDatos(){
        return "Nombre: "+nombre+" Apellidos: "
                +apellidos
                +" Clave: "+clave+" RFC: "+rfc;
    }

    public String mostrarNombre(){//Firma
        return nombre+" "+apellidos;
    }
    

    public String mostrarNombre(int x){
        return apellidos+" "+nombre;
    }
   
}
