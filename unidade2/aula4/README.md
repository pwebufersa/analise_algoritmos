### U2 - Aula 4 - 30/10/2025 - Algoritmos gulosos (2,0)

#### (2,0) Problema da Mochila Fracionária

Implemente uma solução gulosa para o problema da mochila fracionária. Compare diferentes estratégias de seleção.

Faça commit e push em `unidade2/exercicio4` no seu repositório da disciplina.

```java
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
        
        System.out.println("Valor máximo obtido: " + valorMaximo);
    }
}
```