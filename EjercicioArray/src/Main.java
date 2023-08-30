public class Main {
    public static void main(String[] args) {
        String[] my_array = {"FirstWord", "SecondWord", "THIRDWORD"};

        // Verificamos la longitud del array
        if (my_array.length > 10) {
            System.out.println("La longitud de la matriz supera los 10 elementos.");
            return;
        }

        // Inicializamos una cadena vacía para almacenar el resultado
        StringBuilder resultado = new StringBuilder();

        // Iteramos a través de los elementos del array
        for (String palabra : my_array) {
            // Verificamos si la cadena contiene caracteres no permitidos
            if (!esCadenaValida(palabra)) {
                System.out.println("Uno o más elementos del array contienen caracteres no válidos.");
                return;
            }

            // Convertimos la palabra a minúsculas
            String palabraMinuscula = palabra.toLowerCase();

            // Agregamos la palabra a la cadena de resultado
            resultado.append(palabraMinuscula).append(" ");
        }

        // Eliminamos el espacio en blanco final y enviamos el resultado a 'stout'
        System.out.println(resultado.toString().trim());
    }

    // Función para verificar si una cadena contiene caracteres no permitidos
    private static boolean esCadenaValida(String cadena) {
        // Iteramos a través de cada caracter en la cadena.
        for (char c : cadena.toCharArray()) {
            // Comprobamos si el caracter no es una letra o un espacio en blanco.
            if (!(Character.isLetter(c) || c == 'ñ' || c == 'Ñ' || c == ' ')) {
                // Si encontramos un caracter inválido, retornamos 'false'.
                return false;
            }
        }
        // Si todos los caracteres son válidos, retornamos 'true'.
        return true;
    }
}