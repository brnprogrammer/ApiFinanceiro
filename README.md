# ApiFinanceiro

LINKS DE INSTALACAO DOS PROGRAMAS NECESSARIOS.
MAVEN : https://dicasdejava.com.br/como-instalar-o-maven-no-windows/
MYSQL: https://www.devmedia.com.br/instalando-e-configurando-a-nova-versao-do-mysql/25813

O projeto foi desenvolvi com base em um projeto MAVEN, caso não tenha o mesmo instalado acesse o link  e siga o passo a passo de instalacao.
Depois de instalado abra o eclipse e na opcao FILE>IMPORT selecione a opcao Importar Projeto Maven, em seguida navegue ate o caminho da pasta.
Depois de importar o projeto navegue ate a pasta src/resources e lá se encontra um arquivo chamado "application properties", lá se encontra as configuracoes
do banco de dados mysql, defina o user e password de acordo com seu usuario e senha, feito isso cria uma base com o nome "klb", que se trata do nome do banco de dados
que consta na url do JDBC, feito isso execute o projeto Java em seguida de um "show tables;" no mysql e verifique se a table cliente foi criada.
Lembrando que o projeto Java roda na porta 8088.
Caso tenha problemas com a compilacao do projeto, acesse o arquivo "application.properties" defina seu user e passoword e em seguida atraves de um terminal navegue ate a pasta 
target, la se encontra um arquivo .jar, basta executalo via linha de comando.
Em seguida voce pode abrir o navegador e acessar "localhost:8088/cliente" ira retornar um array vazio [].