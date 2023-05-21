# ProjetoAutenticacao
Um exemplo da metodologia Facade exposto em sala de aula, em uma apresentação sobre padrões de design, na disciplina Engenharia de Software. Se trata de um sistema bem pequeno, que é comandado por uma interface e que possui uma classe principal para que essa interface possa operar as funções mais complexas. Apesar de ser funcional, é puramente uma demonstração de estrutura, já que as funções em si não possuem muito sentido em suas condições, e o sistema de autenticação possui regras criadas sem o propósito de fazerem sentido.

## Avisos importantes
Este código foi escrito em linguagem Java, com a versão 20 do Java Development Kit (JDK 20). Além disso, foi rodado e testado na IDE Apache NetBeans na versão 17. Caso você esteja rodando este código com outra versão do JDK ou outra versão do Apache NetBeans, é provável que ocorra erros de execução, devido a incompatibilidade de versões. O ideal é que o usuário atualize ambas as versões para as utilizadas na criação do código, mas também é possível forçar o código a rodar se ambas estiverem desatualizadas.

## Como forçar a incompatibildade de versões no Apache NetBeans
Caso a possibilidade de atualizar as versões esteja fora de questão, também é possível forçar o código a rodar no Apache NetBeans mesmo com o JDK e a IDE desatualizada. Com o código já carregado e aberto no Apache, clique na aplicação java Facade (primeiro elemento da listagem de elementos do projeto aberto, no canto superior esquerdo da IDE) com o botão direito do mouse, depois selecione a opção "Set configuration >" e em seguida, "Customize...". Com a aba de propriedades aberta, clique no primeiro elemento da lista de categorias, o elemento Sources, e mude a opção "Source/Binary Format" para a sua última versão do JDK disponível.

Após esses procedimentos, o usuário poderá rodar o código escrito em qualquer versão do JDK ou da IDE, mas ainda há o risco de ocorrer erros fatais para o runtime.
