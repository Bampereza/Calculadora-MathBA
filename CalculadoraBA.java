//Brandon Isaías Ampérez Aldana 0909-21-4628
package calculadorab;


public class CalculadoraBA {
    
 //Area de atributos
    String tipoCalculadora;
    int cantidadDeTeclas;
    int anchoPantalla;
    String color;
    String marca;
    int ancho;
    int alto;
    
    
    //Atributos agregados
     double raiz;
     int potencia;
     long redondear;
     double numeroAleatorio;
    
    
    //Constructor - Funciona para inicializar variables y recursos de clase
    public CalculadoraBA(){
        this.tipoCalculadora="Calculadora BÃ¡sica";
        this.cantidadDeTeclas=50;
        this.anchoPantalla=15;
        this.marca="Casio";
    }
    //metodos
    public double sumar(double primerNumero, double segundoNumero){
        return primerNumero+segundoNumero;
    }

    public double restar(double primerNumero, double segundoNumero){
        return primerNumero-segundoNumero;
    }

    public double dividir(double primerNumero, double segundoNumero){
        return primerNumero/segundoNumero;
    }

    public double multiplicar(double primerNumero, double segundoNumero){
        return primerNumero*segundoNumero;
    }
    //METODOS AGREGADOS POR SERVICIO BA
    public double raizBA(double primerNumero){
      return raiz =(double)Math.sqrt (primerNumero);   
    }
    public int potenciaBA(int primerNumero, int segundoNumero){
        return potencia = (int) Math.pow (primerNumero, segundoNumero);
    }
    public double redondearBA(double primerNumero){
         return redondear = (long) Math.round (primerNumero);
    }
     public double numeroAleatorioBA(){
         return numeroAleatorio =(double) Math.random ();
    } 
    // Distintos GET Y SET
    public String getMarca() {
        return marca;
    }
    public String getTipo() {
        return this.tipoCalculadora;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnchoPantalla() {
        return anchoPantalla;
    }

    public void setAnchoPantalla(int anchoPantalla) {
        this.anchoPantalla = anchoPantalla;
    }

    public void setColor(String cualquierColor){
        this.color=cualquierColor;
    }

    public String getColor(){
        return this.color;
    }
    
}
    
    
   