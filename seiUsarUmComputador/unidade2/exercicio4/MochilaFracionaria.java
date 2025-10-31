public class MochilaFracionaria {
    public static void main(String[] args) {
        // Capacidade da mochila
        int capacidade = ?; // 50?
        
        // Itens: peso, valor
        int[] pesos = {?}; // 10, 20, 30?
        int[] valores = {?}; // 60, 100, 120?
        
        // Calcular valor por peso
        double[] valorPorPeso = new double[pesos.length];
        for (int i = 0; i < pesos.length; i++) {
            valorPorPeso[i] = (double) valores[i] / pesos[i];
        }
        
        // Implementar algoritmo guloso
        // Ordenar por valor/peso decrescente
        // Adicionar itens até capacidade máxima
        int algoritmoGuloso(){
        }        

        System.out.println("Valor máximo obtido: " + valorMaximo);
    }
}
