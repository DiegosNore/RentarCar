public class Renta implements Renta{
  @Override
  //tipo 0=Familiar 1=Standar 2=Sport 3=new
  tipo=0;
  @Override
  private int id() {
    //return id
    return(0);
  }
  @Override
  public int valorhora(){
    if(tipo==0){
      return(25000);
    }
    if(tipo==1){
      return (15000);
    }
    return (40000);
  }
  @Override
  public void valorTotal(){
    int x=12;
    if(tipo==0){
      System.out.print("el valor total es: "+(25000*x));
    }
    if(tipo==1){
      System.out.print("el valor total es: "+(15000*x));
    }
    System.out.print("el valor total es: "+(40000*x));
  }
  @Override
  public String getPlaca(){
    return ("AAA777");
  }
  @Override
  public String fecha(){
    java.util.Date fecha = new Date();
    System.out.print("En la fecha: "+ fecha);
  }

  }
}
