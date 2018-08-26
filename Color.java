public class Color{
  public String gcolor(){
    String[] marcas= null;
    marcas[0]="Negro";
    marcas[1]="Azul";
    marcas[2]="Rojo";
    int numero=nextInt(3);
    if(numero==1){
      return marcas[1];
    }
    if (numero==0) {
      return marcas[0];
    }
    return (marcas[2]);
  }
}
