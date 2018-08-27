# Trabalho - Programação Orientada a Objetos I
### TEMA: Sistema de Armazenamento e Digitalização de Documentos

### 1. COMPONENTES

- Ivana Amorim Julião
- Mellyssa Stephanny de Jesus Mendes


### 2. DESCRIÇÃO DO SISTEMA
<p align="justify">
Durante muito tempo, a principal forma de compartilhamento e armazenamento de documentos foi em meio físico. A evolução tecnológica permitiu que os processos sejam mais rápidos e eficazes através da digitalização. Com isso, propomos um sistema de Digitalização de Arquivos, visando: segurança, otimização do tempo e produtividade. O Sistema prevê a diminuição da necessidade de arquivos em folhas de papel onde as buscas pelos documentos são extremamente trabalhosas, cansativas e desperdiçam muito tempo.
</p><br>

### 3. MINIMUNDO
<p align="justify">
Os setores administrativos do IFES Campus Serra tem a necessidade de um sistema que armazene e gerencie documentos. O sistema deverá permitir que documentos físicos sejam armazenados, analisados e após extraídas suas informações sejam armazenados digitalmente, com o intuito de diminuir o uso da quantidade de papéis e do espaço de armazenamento físico.<br><br>
O sistema deverá permitir, além do acesso de cada setor, a entrada de dados, que neste caso são os documentos. Ao fazer a entrada desses novos dados, este setor tem o privilégio de ser o detentor deles. Sendo assim somente ele, ou quem ele permitir, terá acesso a esses dados. Ele deverá permitir que os documentos que estão em posse de um setor, possam ser compartilhados com outro setor que necessite de tal informação. Fazendo assim, esse outro setor terá o direito de visualizar os dados permitidos pelo detentor dos documentos por tempo determinado. Além disso, a visualização dos dados deverá ser feita de maneira simples e em formato, no mínimo, semelhante ao original.<br><br>
O banco de dados do sistema deverá permitir atualização dos documentos quando os dados contido nele estiverem desatualizados. O sistema deverá criptografar os dados do banco de dados para que somente aqueles que tiverem a chave possam acessá-lo.<br><br>
As vantagens da digitalização de documentos consiste na maior segurança dos dados, pois o controle de acesso permite que somente pessoas autorizadas com níveis de acesso de acordo com seu perfil possam acessar os documentos; rapidez na busca, evitando assim perda de tempo; diminuição de espaço físico para armazenamento de documentos; prevenção da perda de documentos devido a deterioração ou acontecimentos tais como: enchentes, incêndios ou até mesmo acidentes banais, como derrubar xícara de café naquele documento importante que estava sobre a mesa ou rasgo acidental. E o mais importante: diminuição do uso de papel, impactando positivamente na redução de produção de papel e seus custos diretos e indiretos.
</p><br>

### 4. CANVAS(PMC)
<p align="center"><img src=""></p><br>

### 5. DIAGRAMA DE CLASSES
<p align="center"><img src=""></p><br>

### 7. DESCRIÇÃO DA TECNOLOGIA UTILIZADA

- [FontAwesomeFX](v8.9)(https://bitbucket.org/Jerady/fontawesomefx): Ferramenta que fornece centenas de ícones. 
- [Java 8](https://www.java.com/pt_BR/download/): Linguagem fortemente orientada a objetos, usada por permitir maior portabilidade e por estar mais próxima dos integrantes do grupo de acordo com as ferramentas que o grupo achou necessário fazer uso.
- [Junit 4](https://junit.org/junit4/): Frammework utilizada para testes unitários das classes.
- [PostegreSQL](https://www.postgresql.org/) (v42.2.2): Sistema gerenciador de banco de dados utilizado para concretizar a persistência dos dados. A opção se deu pela experiência do grupo com o sistema e com sua robustez (se comparado com ferramentas como o SQLite).
