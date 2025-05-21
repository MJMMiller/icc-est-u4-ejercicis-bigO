package main.ejercicio2;
import java.util.HashSet;
import java.util.Set;

public class RespuestasOptimizadas {
    // El estudiante debe escribir aquí las versiones optimizadas y las
    // complejidades

    // 1. Versión optimizada de tieneDuplicados (Complejidad anotada en la variable)
    public static String tieneDuplicadosComplejidad = "O(n)"; // Ej: "O(n)"

    public static boolean tieneDuplicadosOpt(int[] arr) {
        // TODO: implementar versión eficiente
        Set<Integer> set = new java.util.HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    // 2. Versión optimizada de contarMayores (Complejidad anotada en la variable)
    public static String contarMayoresComplejidad = "O(n)"; // Ej: "O(n)"

    public static int contarMayoresOpt(int[] arr, int x) {
        int maxAnterior = Integer.MIN_VALUE;
        HashSet<Integer> mayores = new HashSet<>();

        for (int num : arr) {
            if (num > maxAnterior) {
                maxAnterior = num;
                if (num > x) {
                    mayores.add(num);
                }
            }
        }
        return mayores.size();
}

    // 3. Versión optimizada de encontrarMaximo (Complejidad anotada en la variable)
    public static String encontrarMaximoComplejidad = ""; // Ej: "O(n)"

    public static int encontrarMaximoOpt(int[] arr) {
        // TODO: implementar versión eficiente
        return 0;
    }
}
