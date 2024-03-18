# Roteiro-comparativo-dos-algoritmos-elementares-de-ordenacaoo

<h3>Insertion Sort (ordenação por inserção)</h3>

O algoritmo de insertion sort (ordenação por inserção) constrói o array ordenado final, um valor de cada vez. Ele pressupõe que o primeiro elemento já está ordenado. Então, uma comparação com o segundo valor é realizada: o segundo valor deve permanecer em seu lugar ou deverá ser inserido antes do primeiro? Os dois primeiros valores serão ordenados; em seguida, a comparação será feita com o terceiro valor (isto é, ele deverá ser inserido na primeira, na segunda ou na terceira posição?), e assim sucessivamente.

<h3>Selection Sort (ordenação por seleção)</h3>

O algoritmo de selection sort (ordenação por seleção) é um algoritmo de ordenação por comparação in-place. A ideia geral por trás do selection sort é encontrar o valor mínimo na estrutura de dados, colocá-lo na primeira posição e então encontrar o segundo valor mínimo, colocá-lo na segunda posição, e assim sucessivamente.

<h3>Bouble Sort (ordenação por flutuação)</h3>

O algoritmo de bubble sort (ordenação por flutuação) compara cada dois valores adjacentes e faz a sua troca (swap) se o primeiro valor for maior que o segundo. Ele tem esse nome porque os valores tendem a se mover para cima na ordem correta, como se fossem bolhas (bubbles) subindo para a superfície.

<h3>Todos os algoritmos de ordenação possuem complexidade quadrática</h3>

<div style="display: flex;">
    <img src="https://github.com/JahnoMon/Roteiro-comparativo-dos-algoritmos-elementares-de-ordenacaoo/assets/115963954/0ba3ff7d-9560-4a2b-89a3-51b2180ceb6d" style="width: 50%;" alt="Imagem 1">    
    <img src="https://github.com/JahnoMon/Roteiro-comparativo-dos-algoritmos-elementares-de-ordenacaoo/assets/115963954/41f35895-c0b0-418c-97e7-aa42d3f8b854" style="width: 50%;" alt="Imagem 2">
</div>

<h3>Funcionamento do programa</h3>

<p>Uma lista com 10.000 números aleatórios será criada automaticamente pelo método <strong>gerarLista</strong>, em seguida, as variáveis <strong>arrayInsertion</strong>, <strong>arraySelection</strong> e <strong>arrayBubble</strong> são instanciadas e recebem os valores dessa lista. A primeira variável recebe os valores diretamente e as duas outras por iteração à primeira.</p>
<p>Todos os algoritmos são construídos da seguinte maneira:</p>
<p>Instanciação de variáveis para a quantidade de <strong>comparações</strong> e <strong>trocas<strong>, então o método de ordenação em si entre os quantificadores de tempo que 
 posteirormente dão o resultado pela diferença do <strong>tempoInicial</strong> e <strong>tempoFinal</strong>.</p>
<p>As quantidades de comparações, trocas e tempo de execução serão impressas no terminal ao final da execução.</p> 

<h3>Como rodar o programa</h3>

Basta baixá-lo, ou apenas copiar, colar e executá-lo na IDE de sua preferência ou mesmo em um compilador online.
