public class Main {
    public static void main(String[] args) {
        suma(4 ,6 ,15);
        coche miCoche=new coche();
        miCoche.addpuertas();
        System.out.println(miCoche.puertas);
        miCoche.addpuertas();
        System.out.println(miCoche.puertas);

    }
    public static  void suma(int a, int b, int c){
        int resultado;
        resultado= a + b+c;
        System.out.println(resultado);
    }


}
class coche{
    public int puertas=2;
    public void addpuertas(){
        this.puertas++;
    }
}
