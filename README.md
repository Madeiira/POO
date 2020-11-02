# Trabalho de POO/Polimorfismo
## 1. Outro princípio do Paradigma de Orientação a Objetos é o polimorfismo. Juntamente com a herança, o polimorfismo permite criar programas com menor complexidade mais versáteis. Sobre polimorfismo, responda:

## a) O que significa a palavra polimorfismo?
### Resposta:o polimorfismo permite que seja possivel referências de tipos de classes por assim dizer abstratas representando assim o comportamento das classes concretas que referenciam.
## b) Para entendimento do polimorfismo, um fundamento importante é o de assinatura de métodos. O que define assinaturas de métodos? Dê ao menos 2 exemplos.
### Resposta: Um método é normalmente identificado por sua assinatura de método , que padronizado inclui o nome do método e o número, tipo e ordem de seus parâmetros.
public Circulo(double raio) {}
Assinatura: Circulo(raio) 
public double obterArea() {}
Assinatura : obterArea()
## c) O polimorfismo pode ser tanto estático como dinâmico. No que diz respeito a assinatura de métodos, o que diferencia o polimorfismo estático do dinâmico?
### Resposta:
Quando realizamos a mesma operação várias vezes na mesma classe, ocorre polimorfismo estático. A escolha de qual operação chamar depende da assinatura do método sobrecarregado. Quando a subclasse se sobrepõe ao método original, é o polimorfismo dinâmico, ocorre na herança.

### 2. Crie uma classe chamada Forma, que servirá como tipo base para uma forma geométrica. Para essa classe define 3 comportamentos com a seguinte assinatura e valor de retorno:

## a) String getNome()

## b) double calcularPerimetro()

## c) double calcularArea()

### public double getArea() {

###   return 0;

### }
### Resposta: [CODEPASTE](/src/main)
### Para cada um desses métodos retorne o valor padrão: null para String e 0 para double.

## 3. Crie 4 classes que herdam de Forma: Circulo, Triangulo, Quadrado e Retangulo. Para cada uma dessas classes defina os atributos mínimos necessários para a forma. Exemplo: círculo tem raio, já o retângulo tem altura e base.
### Resposta: [CODEPASTE](/src/main)

## 4. Para cada classe que herda e Forma, sobrescreva os comportamentos da superclasse. Para a sobrescrita do método getNome(), retorne o nome da forma. Já para os métodos calcularArea() e calcularPerimetro() implemente de acordo com a tabela definida abaixo:
### Resposta: [CODEPASTE](/src/main)

## 5. Agora vamos pensar em um jogo de Xadrez. No jogo de xadrez nós temos peças. Mas cada peça faz movimentos específicos. Como você criaria uma classe para representar a peça de xadrez de forma geral? Quais comportamentos teria uma peça de xadrez, independente de qual peça for?
### Resposta: Em uma forma geral eu criaria um classe abstrata, contendo todos os comportamentos em comum que todas peças em sua base tem de ter, nesta classe abstrata ela teria um método abstrato   de   movimentação   e   detecção   de   movimentos   válidos,   os   quais   são   sobre escritos pelas classes que herdam desta peça.

## 6. Agora considerando a peça cavalo e bispo que herdam os comportamentos da superclasse Peca. Qual seria a implementação específica dos comportamentos de cada uma dessas peças?
### Resposta: Seria o formato em que eles podem andar, pois o cavalo só poder andar em formato de L, desde que nenhuma peça ja esteja no fim deste L e para o bis ele andaria em diagonais, até encontrar alguma peça em seu caminho diagonal.
