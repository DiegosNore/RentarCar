public class SportFactory implements Car{
  @Override
  private String generatePlaca(){
    return new GenerarPlaca.genPlaca();
  }
  @Override
  public int pasajeros(){
    return(random (2,4));
  }
  @Override
  public abstract void getDescription(){
    System.out.print("Este es un carro de tipo Deportivo");
  }
  @Override
  public abstract void getColor(){
     String color=new Color.gcolor();
     System.out.print("De color: "+color);
  }
  @Override
  public abstract void getCc(){
    String cc=Integer.toString(new CC.returncc());
    System.out.print("De cilindraje: "+cc);
  }
  @Override
  public abstract void getMarca(){
    String marca=new Marca.obtainmarca();
    System.out.print("De marca: "+marca);
  }
  @Override
  public int valorhora(){
    return(40000);
  }
}
