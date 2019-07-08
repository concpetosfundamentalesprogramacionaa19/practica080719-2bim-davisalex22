package practica8_3;
/**
 * @author davisalex22
 */
public class Obtener {
    
    public static int obtenerTamanioArreglo(int arreglo2[], int tamanio) {
        if (tamanio == 1) {
            return arreglo2[0];
        } else {
            return arreglo2[tamanio - 1] + obtenerTamanioArreglo(arreglo2, tamanio - 1 ); 
        }
    }
       
    public static int sumaArreglo(int v[]){
        int suma = 0;
        for (int i = 0; i < v.length ; i++){
            suma = suma + v[i];       
        }    
     return suma;    
    }


}


    