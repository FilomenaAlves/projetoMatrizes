## Programação Dinâmica

Encontram-se neste repositório todos os arquivos referentes a implementação de métodos que utilizam
a programação dinâmica para fornecer o custo mínimo de multiplicação de cadeias de matrizes, e posteriormente a 
melhor parentização para a multiplicação.

Também foram implementados métodos recursivos que demanandam maior custo para obtenção dos resultados.

A finalidade do projeto é demonstrar através dessas implementações que a programação dinâmica é capaz
de reduzir um processo exponencial em n para O(n3).

## Requisitos para execução

A execução dos programas em Java e feita através da JVM, que precisa estar previamente instalada.
Para que o programa possa ser compilado é necessário instalação do JDK. A forma mais prática
é a instalação de um IDE. Recomendamos o Netbeans IDE que já é instalado juntamente com o JDk.


- [Java 6 ou versões posteriores] (http://java.com/pt_BR/)
- [Netbenas IDE versão 7.3.1] (http://netbean.org)

## Arquivos

- No pacote Classes: Matriz. java;
- No pacote Janelas: JPrincipal.java e JPrincipal.form
Onde, Matriz.java é a classe que contém os atributos e métodos necessários necessário para obter os custos para a multiplicação de cadeia de matrizes;
JPrincipal.java é a classe que cria a interface gráfica para entrada e saida de dados;
JPrincipal.form é um arquivo de auxilar.xml para o Netbeans IDE.

## Instruções de compilação e execução

Primeiramente, caso não tenha a JVM instalada, baixe e instale.
Baixe e instale o netbeans IDE.
No Netbenas, vá no menu Arquivos/Novo Projeto. Selecione a opção Java/Aplicação Java. Vai ser criado um projeto padrão JSE.
Na estrutura de diretórios, procure a pasta src. Copie pra dentro desta pasta os pacotes que estão nesse repositório.
Para compilar o projeto, vá no menu Executar/Limpar e Construir Projeto. O Netbeans IDE vai gerar os bytecodes a partir
dos arquivos .java que estão nos pacotes.
Para executar o projeto, na estrutura de diretórios, procure a pasta dist. Nesta pasta está o arquivo executável .jar.




