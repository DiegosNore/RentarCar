import java.util.Random;
public class Customer implements Persona {
  @Override
  private int id(){
    return(0);
  }
  @Override
  public String tipo(){
    boolean vip=false;
    if (nextInt(2)>0){
      vip=true;
    }
    if(vip){
      return ("VIP");
    }
    return("No-VIP");
  }
  @Override
  public String nombre(){
    //code nombre
    return("Nombre");
  }
  @Override
  public String genero(){
    int x= new Random();
    if(x>0){
      return ("Hombre");
    }
    return ("Mujer");
  }
}
