## Programa��o Din�mica

Encontram-se neste reposit�rio todos os arquivos referentes a implementa��o de m�todos que utilizam
a programa��o din�mica para fornecer o custo m�nimo de multiplica��o de cadeias de matrizes, e posteriormente a 
melhor parentiza��o para a multiplica��o.

Tamb�m foram implementados m�todos recursivos que demanandam maior custo para obten��o dos resultados.

A finalidade do projeto � demonstrar atrav�s dessas implementa��es que a programa��o din�mica � capaz
de reduzir um processo exponencial em n para O(n3).

## Requisitos para execu��o

A execu��o dos programas em Java e feita atrav�s da JVM, que precisa estar previamente instalada.
Para que o programa possa ser compilado � necess�rio instala��o do JDK. A forma mais pr�tica
� a instala��o de um IDE. Recomendamos o Netbeans IDE que j� � instalado juntamente com o JDk.


- [Java 6 ou vers�es posteriores] (http://java.com/pt_BR/)
- [Netbenas IDE vers�o 7.3.1] (http://netbean.org)

## Arquivos

- No pacote Classes: Matriz. java;
- No pacote Janelas: JPrincipal.java e JPrincipal.form
Onde, Matriz.java � a classe que cont�m os atributos e m�todos necess�rios necess�rio para obter os custos para a multiplica��o de cadeia de matrizes;
JPrincipal.java � a classe que cria a interface gr�fica para entrada e saida de dados;
JPrincipal.form � um arquivo de auxilar.xml para o Netbeans IDE.

## Instru��es de compila��o e execu��o

Primeiramente, caso n�o tenha a JVM instalada, baixe e instale.
Baixe e instale o netbeans IDE.
No Netbenas, v� no menu Arquivos/Novo Projeto. Selecione a op��o Java/Aplica��o Java. Vai ser criado um projeto padr�o JSE.
Na estrutura de diret�rios, procure a pasta src. Copie pra dentro desta pasta os pacotes que est�o nesse reposit�rio.
Para compilar o projeto, v� no menu Executar/Limpar e Construir Projeto. O Netbeans IDE vai gerar os bytecodes a partir
dos arquivos .java que est�o nos pacotes.
Para executar o projeto, na estrutura de diret�rios, procure a pasta dist. Nesta pasta est� o arquivo execut�vel .jar.




