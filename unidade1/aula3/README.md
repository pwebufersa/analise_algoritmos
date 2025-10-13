### U1 - Aula 3 - 16/10/2025 - Algoritmos gulosos (2,0)

#### (2,0) Troco guloso

Implemente uma solução gulosa para o problema do troco. Aumente o número de cédulas e teste.

Faça commit e push em `unidade1/exercicio3` no seu repositório da disciplina.

```java
public class Troco {
    public static void main(String[] args) {
        //quero saber quantas cédulas foram dadas para esse troco
        int[] cedulasDisponiveis = {?}; //9,6,1?
        int trocoPara = ?; //12?
        int[] cedulasUsadas = new int[cedulasDisponiveis.length];

        for (int i = 0; i < cedulasDisponiveis.length; i++) {
            //cedulasUsadas[i]...
            ///trocoPara...
        }

        System.out.println("Cédulas usadas:");
        for (int i = 0; i < cedulasDisponiveis.length; i++) {
            System.out.println("R$ "+ cedulasDisponiveis[i] + ",00 == " + cedulasUsadas[i]);
        }
    }
}
```