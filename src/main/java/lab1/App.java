package lab1;

public class App {
    public static void main(String[] args) {  
        
        int num[] =Factory.organized(new Burbuja());
         PrintArray(num);
        //System.out.println("El ordenamiento de burbuja es " + AreaCalculador.figura(new Rectangulo(3,3)));             
    }
    
    
    
     public static void PrintArray (int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println(lista[i]);
        }
    }
}
