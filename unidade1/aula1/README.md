### U1 - Aula 1 - 08/05/2025 - Análise Assintótica

Explicação de análise assintótica [aqui](https://drive.google.com/open?id=18zo72s1Jhv8IbED_gvbLMD9umGDsjFZ2).

#### (2,0) Força bruta, busca linear e busca binária

#### Como entregar?
1. Crie um repositório da disciplina.
2. Faça commit e push da sua implementação, junto com o arquivo .java modificado, todos na pasta `unidade1/exercicio1/`.
3. Adicione a conta ``xhycko`` como colaborador para que seu exercício seja corrigido.

#### O que entregar?
0. Implemente e compare o desempenho de dois algoritmos de busca em um vetor de números inteiros: Busca Linear e Busca Binária. Use o [código base](ComparaBuscas.java) fornecido em Java para medição de tempo, ou re-implemente em outra linguagem de sua preferência.

1. Implementar Busca Linear: Implemente a busca linear, que percorre o vetor do início ao fim, comparando cada elemento com o número alvo.

2. Usar Busca Binária: utilize Arrays.binarySearch() da biblioteca padrão do Java.

3. Medir os tempos de execução: Execute as duas funções para vetores nos seguintes tamanhos: 10, 100, 1.000, 10.000, 100.000 e 1.000.000 elementos. A medição do tempo foi fornecida pelo professor no arquivo base.

4. Análise e Registro dos Resultados
Crie um arquivo README.md na pasta `unidade1/exercicio1/` do seu repositório da disciplina. Registre os tempos de execução obtidos para cada tamanho de vetor e cada tipo de busca no README.md. Ao final do README.md, escreva uma análise comparativa entre os tempos observados, conforme tabela: Comente: Qual a ordem de complexidade de cada busca?

#### Investigando força bruta - Fulano de Tal
| Tamanho do Vetor | Busca Linear (ms) | Busca Binária (ms) |
|------------------|-------------------|--------------------|
| 10               | X                 | X                  |
| 100              | X                 | X                  |
| 1.000            | X                 | X                  |
| 10.000           | X                 | X                  |
| 100.000          | X                 | X                  |
| 1.000.000        | X                 | X                  |

