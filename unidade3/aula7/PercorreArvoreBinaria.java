package aula7;
public class PercorreArvoreBinaria {
    
    //Classe base nó
    static class Node {
        int valor;
        Node esquerdo, direito;

        Node(int valor) {
            this.valor = valor;
        }
    }

    //Usa nó para fazer a árvore. Imprime e percorre nas ordens.
    static class ArvoreBinaria {
        Node raiz;

        ArvoreBinaria(int[] valores) {
            for (int v : valores)
                raiz = inserir(raiz, v);
        }

        private Node inserir(Node no, int valor) {
            if (no == null)
                return new Node(valor);

            if (valor < no.valor)
                no.esquerdo = inserir(no.esquerdo, valor);
            else
                no.direito = inserir(no.direito, valor);

            return no;
        }

        void mostrarArvore() {
            mostrarNo(raiz, 0);
        }

        private void mostrarNo(Node no, int nivel) {
            if (no == null)
                return;

            mostrarNo(no.direito, nivel + 1);

            for (int i = 0; i < nivel; i++)
                System.out.print("     "); // 5 espaços por nível

            System.out.println(no.valor);

            mostrarNo(no.esquerdo, nivel + 1);
        }

        void preOrdem(Node no) {
            if (no == null)
                return;
            
            System.out.print(no.valor + " ");
            preOrdem(no.esquerdo);
            preOrdem(no.direito);
        }

        void emOrdem(Node no) {
            if (no == null)
                return;
            
            emOrdem(no.esquerdo);
            System.out.print(no.valor + " ");
            emOrdem(no.direito);
        }

        void posOrdem(Node no) {
            if (no == null)
                return;
            
            posOrdem(no.esquerdo);
            posOrdem(no.direito);
            System.out.print(no.valor + " ");
        }
    }

    public static void main(String[] args) {
         //insira 25 elementos. Faça o commit do codigo e do resultado em um txt.
        int[] valores = {10, 5, 15};

        ArvoreBinaria arvore = new ArvoreBinaria(valores);

        System.out.println("Árvore:");
        arvore.mostrarArvore();

        System.out.print("\nPré-ordem: ");
        arvore.preOrdem(arvore.raiz);
        System.out.println();

        System.out.print("Em-ordem: ");
        arvore.emOrdem(arvore.raiz);
        System.out.println();

        System.out.print("Pós-ordem: ");
        arvore.posOrdem(arvore.raiz);
        System.out.println();
    }
}
