public class SumaVectores {

    public static int suma_vector(int[] vector, int indice){
        int suma;

        if (indice == vector.length - 1){
            suma = vector[indice];
        } else {
            suma = vector[indice] + suma_vector(vector, indice + 1);
        }
        return suma;
    }
}
