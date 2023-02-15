# Design Patterns em Java I

> <i>Solução comum para um problema recorrente ao utilizar o paradigma da orientação a objetos.</i>

Existem 23 Design Patterns (Padrões de projeto) e esses padrões são divididos em 3 categorias:

- **Criacionais** - foco é na construção, na criação de objetos.
- **Estruturais** - focados mais na parte de estrutura e composição entre esses objetos e essas classes, como que elas
  vão
  se relacionar em si.
- **Comportamentais** - focados mais na parte de comportamento, na parte dos métodos de estado e interação entre os
  objetos.

Design Patterns - Comportamentais

- Strategy
- Chain of Responsability
- Template Method
- State
- Command
- Observer

## Strategy

> O padrão Strategy visa resolver a existência de diversos algoritmos para uma ação, resultando na possibilidade de
> vários **ifs**.
> Nele, nós separamos cada um dos possíveis algoritmos em classes separadas.

Podemos implementar o Strategy de duas formas:

- Em classes separadas guiadas por interfaces
- E metodo abstrato no enum, forcando cada nova constante desse enum, a ter a sua propria implementacao

### Observação:

Uma maneira de aplicar o Open Closed é via pattern Strategy.

## Chain of Responsibility

> Cadeia de Responsabilidade é um padrão de design comportamental que permite passar solicitações ao longo de uma cadeia
> de manipuladores. Ao receber uma solicitação, cada manipulador decide processar a solicitação ou passá-la para o
> próximo
> manipulador na cadeia.

## Template Method

> O Método Template é um padrão de design comportamental que define o esqueleto de um algoritmo na superclasse, mas
> permite que as subclasses substituam etapas específicas do algoritmo sem alterar sua estrutura.

## State

> O padrão State, assim como o padrão **Strategy**, resolve o problema de muitos ifs no código porém baseado no estado
> do objeto.

- Se o resultado de uma chamada de método depende do estado, podemos delegar esta ação para uma classe específica do
  estado atual:
  E essa técnica se chama State.

<i>É utilizado quando temos uma transição de estados ou quando precisamos aplicar alguma regra, algoritmo baseado em
um
estado de um objeto de uma classe.</i>

## Command

> A técnica de extração do caso de uso para uma classe específica pode ser chamada de padrão Command

### Diferença do padrão Command da GoF para o padrão que utiliza Command Handler (muito utilizado no padrão de arquitetura Domain Driven Design):

- **Command GoF** - Quando ele é utilizado temos várias classes implementando uma interface e cada uma das classes vai
ter um método em comum que é um método para executar alguma lógica


- **Command Handler** - A ideia seria separar em duas classes. Uma classe só para representar os dados, as informações
  que são necessárias para o comando e a outra classe só para executar de fato o comando com essas dependências que são
  as dependências para o comando ser executado.

## Design Patterns mais utilizados:

- Strategy
- Command
- Observer