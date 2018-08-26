public class Marca{
  public String obtainmarca(){
    String[] marcas= null;
    marcas[0]="Mercedes";
    marcas[1]="Renault";
    marcas[2]="BMW";
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
