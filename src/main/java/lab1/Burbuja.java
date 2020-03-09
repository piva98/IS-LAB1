package lab1;

public class Burbuja implements Organized {
    
public int ArrayOrder[];

    @Override
    public int[] ArrayOrder() {
        
  
        int num=20;
        int ordenar=10;
        //Scanner ordenar = new Scanner(System.in);
        int vector[] = new int[30];
        int i,j,aux;
        for (i=0;i<num;i++)
        {
           // System.out.print("Datos["+(i+1)+"]=");
            vector[i]=ordenar;
        }
        for (i=0;i<num;i++)
        {
            for (j=i+1;j<num;j++)
            {
                if (vector[i]>vector[j])
                {
                    aux=vector[i];
                    vector[i]=vector[j];
                    vector[j]=aux;
                }
            }
        }
        //System.out.print("Arreglo= {");
        //for (i=0;i<num;i++)
        //{
 
          //  System.out.print(vector[i]+ ", ");
        //}
       
        
        return vector;
    }

    
}
