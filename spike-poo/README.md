# Sistema de Gerenciamento de Pedidos

Aplicação simples para estudar **Programação Orientada a Objetos (POO)** em Python e Java. O sistema representa clientes, produtos e pedidos, demonstrando classes, objetos, encapsulamento e composição.

## Objetivos

- Compreender classes, objetos, atributos e métodos.
- Aplicar encapsulamento para controlar o acesso aos dados.
- Relacionar objetos por meio de composição.
- Organizar o código com responsabilidades bem definidas.
- Comparar a implementação de POO em Python e Java.

## Conceitos de POO

### Classe e objeto
Uma **classe** é um modelo que define os dados e comportamentos de um tipo de objeto. Um **objeto** é uma instância dessa classe. Por exemplo, `Produto` é uma classe; um mouse com preço e estoque específicos é um objeto.

### Atributos e métodos
- **Atributos** representam dados, como nome, preço e estoque.
- **Métodos** representam ações, como calcular o subtotal de um item ou o total de um pedido.

### Encapsulamento
O encapsulamento controla como os dados de um objeto são acessados e alterados. Em Java, os atributos usam `private` e podem ser consultados por métodos públicos, como getters. Em Python, propriedades e convenções de atributos internos ajudam a controlar o acesso.

### Composição
A composição relaciona objetos que trabalham juntos:
- Um `Pedido` referencia um `Cliente`.
- Um `Pedido` contém vários `ItemPedido`.
- Cada `ItemPedido` referencia um `Produto`.

Composição é diferente de herança: um pedido **não é** um produto nem um cliente; ele se relaciona com esses objetos.

### Herança e polimorfismo
A versão mínima deste projeto utiliza composição, que atende ao requisito de aplicar **herança ou composição**. Herança e polimorfismo podem ser acrescentados como evolução, por exemplo, criando `ProdutoEletronico` como subclasse de `Produto` e sobrescrevendo um método.

## Estrutura das classes

| Classe | Responsabilidade |
|---|---|
| `Cliente` | Armazenar nome e e-mail do cliente. |
| `Produto` | Armazenar nome, preço e estoque e validar os valores iniciais. |
| `ItemPedido` | Relacionar um produto à quantidade comprada e calcular o subtotal. |
| `Pedido` | Associar um cliente, reunir itens e calcular o total. |
| `Main` (Java) | Criar os objetos e executar um exemplo do sistema. |

## Exemplo de funcionamento

O exemplo cria um pedido para a cliente Ana com dois mouses a R$ 80,00 cada e um teclado a R$ 150,00.

- Mouse: `2 × R$ 80,00 = R$ 160,00`
- Teclado: `1 × R$ 150,00 = R$ 150,00`
- **Total: R$ 310,00**
