
public class Troco {
    public static void main(String[] args) {
        // Quero saber quantas cédulas esse troco usa
        int[] cedulasDisponiveis = {?}; //9,6,1?
        int trocoPara = ?; //12?
        int[] cedulasUsadas = new int[cedulasDisponiveis.length];

        for (int i = 0; i < cedulasDisponiveis.length; i++) {
            // Cálculo de cedulasUsadas[i]...
            // Cálculo de trocoPara...
        }

        System.out.println("Cédulas usadas:");
        for (int i = 0; i < cedulasDisponiveis.length; i++) {
            System.out.println("R$ "+ cedulasDisponiveis[i] + ",00 == " + cedulasUsadas[i]);
        }
    }
}
