public class Invertir {

    public static void main(String[] args) {

        String palabra = "unicornio";
        System.out.println(InvertirPalabra(palabra, palabra.length()-1));

    }

    public static String InvertirPalabra(String palabra, int longitud){

        if (longitud == 0){
            return palabra.charAt(longitud)+"";
        }else {
            return palabra.charAt(longitud) + (InvertirPalabra(palabra, longitud-1));
        }
    }
}
