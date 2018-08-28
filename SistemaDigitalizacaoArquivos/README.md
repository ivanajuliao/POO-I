# Trabalho - Programação Orientada a Objetos I
### TEMA: Sistema de Armazenamento e Digitalização de Documentos

### 1. COMPONENTES

- Ivana Amorim Julião
- Mellyssa Stephanny de Jesus Mendes

### 2. DESCRIÇÃO DO SISTEMA
A Digitalização de Documentos é o processo de conversão de documentos físicos em formato digital. Este processo dinamiza extraordinariamente o acesso e a disseminação das informações entre os funcionários e colaboradores, com a visualização instantânea das imagens de documentos.<br/>
Os documentos passam por um processo de preparação para que se tornem aptos à digitalização (higienização, retirada de grampos ou qualquer objeto que prejudique o acesso do documento ao scanner). Em seguida são escaneados, tratados e indexados por lote de documentos, de acordo com as especificações  determinadas pelo projeto. Após esse processo, as imagens e dados são armazenados em um software ou em arquivos para melhor organização das imagens.<br/>
A Digitalização é indicada para empresas que possuem documentos que precisam ser consultados e administrados de forma rápida e organizada.<br/>
Listamos abaixo as vantagens da digitalização de arquivos:<br/>
- Facilidade de acesso e de distribuição dos documentos;<br/>
- Redução de tempo das atividades que requerem a análise de documentos;<br/>
- Redução de custo com recuperação e duplicação;<br/>
- Preservação do arquivo físico;<br/>
- Integração de dados ativos e históricos.<br/>

### 3. MINIMUNDO
<p align="justify">
Os setores administrativos do IFES Campus Serra tem a necessidade de um sistema que armazene e gerencie documentos. O sistema deverá permitir que documentos físicos sejam armazenados, analisados e após extraídas suas informações sejam armazenados digitalmente, com o intuito de diminuir o uso da quantidade de papéis e do espaço de armazenamento físico.<br><br>
O sistema deverá permitir, além do acesso de cada setor, a entrada de dados, que neste caso são os documentos. Ao fazer a entrada desses novos dados, este setor tem o privilégio de ser o detentor deles. Sendo assim somente ele, ou quem ele permitir, terá acesso a esses dados. Ele deverá permitir que os documentos que estão em posse de um setor, possam ser compartilhados com outro setor que necessite de tal informação. Fazendo assim, esse outro setor terá o direito de visualizar os dados permitidos pelo detentor dos documentos por tempo determinado. Além disso, a visualização dos dados deverá ser feita de maneira simples e em formato, no mínimo, semelhante ao original.<br><br>
O banco de dados do sistema deverá permitir atualização dos documentos quando os dados contido nele estiverem desatualizados. O sistema deverá criptografar os dados do banco de dados para que somente aqueles que tiverem a chave possam acessá-lo.<br><br>
As vantagens da digitalização de documentos consiste na maior segurança dos dados, pois o controle de acesso permite que somente pessoas autorizadas com níveis de acesso de acordo com seu perfil possam acessar os documentos; rapidez na busca, evitando assim perda de tempo; diminuição de espaço físico para armazenamento de documentos; prevenção da perda de documentos devido a deterioração ou acontecimentos tais como: enchentes, incêndios ou até mesmo acidentes banais, como derrubar xícara de café naquele documento importante que estava sobre a mesa ou rasgo acidental. E o mais importante: diminuição do uso de papel, impactando positivamente na redução de produção de papel e seus custos diretos e indiretos.
</p><br>

### 4. DIÁRIO DE BORDO
As atividades desenvolvidas pelo grupo podem ser acompanhadas através do link a seguir: [Diário de Bordo](https://drive.google.com/open?id=1fj7jfETy0rTq27n30cRKd07sMNg6FbL94lxB2Jf41N0)

### 5. CANVAS(PMC)
<p align="center"><img src="https://github.com/ivanajuliao/POO-I/blob/master/SistemaDigitalizacaoArquivos/Imagens/Canvas.png"></p><br>

### 6. DIAGRAMA DE CLASSES
<p align="center"><img src=""></p><br>

### 7. DESCRIÇÃO DA TECNOLOGIA UTILIZADA

- [FontAwesomeFX](v8.9)(https://bitbucket.org/Jerady/fontawesomefx): Ferramenta que fornece centenas de ícones. 
- [Java 8](https://www.java.com/pt_BR/download/): Linguagem fortemente orientada a objetos, usada por permitir maior portabilidade e por estar mais próxima dos integrantes do grupo de acordo com as ferramentas que o grupo achou necessário fazer uso.
- [PostegreSQL](https://www.postgresql.org/) (v42.2.2): Sistema gerenciador de banco de dados utilizado para concretizar a persistência dos dados. A opção se deu pela experiência do grupo com o sistema e com sua robustez (se comparado com ferramentas como o SQLite).

