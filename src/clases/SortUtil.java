package clases;

import interfaces.IPrecedable;

public class SortUtil {

    public static <T extends IPrecedable<T>> void ordenar (T arr[]){
        T aux;

        for (int i =0; i< arr.length; i++){
            for (int j=0; j < arr.length-1-i; j++){
                if(arr[j].precedeA(arr[j+1]) < 0){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }
}
