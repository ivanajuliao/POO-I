/* CRIACAO DE TABELAS */

create table ALUNO(
	nome varchar(100),
    matricula varchar(16),
    curso varchar(40)
);
    

create table CURSO(
    nome varchar(60),
    codcurso integer
);

create table FUNCIONARIO(
    nome varchar(60),
    siape integer,
    setor varchar(80)
);

create table SETOR(
    coordenador varchar(60),
    idSetor integer
);

create table RELATORIO(
    data date,
    idRelatorio integer,
    hora time,
    idUsuario integer
);

create table DOCUMENTO(
    nome varchar(40),
    codDocumento integer
);

create table TITULO_ELEITOR(
    nome varchar(100),
    dataNasc date,
    Municipio varchar(60),
    UF varchar(40),
    zona integer,
    secao integer,
    dataEmissao date,
    codDocumento integer
);


create table RG(
    nome varchar(100),
    nomePai varchar(100),
    nomeMae varchar(200),
    dataNasc date,
    dataExpedicao date,
    Municipio varchar(60),
    UF varchar(40),
    dataEmissao date,
    codDocumento integer,
    numCPF integer,
    numRG integer
);


create table CPF(
    nome varchar(100),
    dataNasc date,
    codDocumento integer,
    numCPF integer
);

/* INSERǃO DE ALUNOS */

insert into ALUNO(nome, matricula, curso)
values ('Benicio Kaue Galvao', '20142bsi1107' , 'Sistemas de Informacao');

insert into ALUNO(nome, matricula, curso)
values ('Heloisa Carla Aragao', '20132ceca1220' , 'Engenharia de Controle e Automacao');

insert into ALUNO(nome, matricula, curso)
values ('Agatha Leticia Andrea Alves', '20181bsi0021' , 'Sistemas de Informacao');

insert into ALUNO(nome, matricula, curso)
values ('Marcio Henrique Murilo Nascimento', '20172ceca2212' , 'Engenharia de Controle e Automacao');

insert into ALUNO(nome, matricula, curso)
values ('Marcia Carolina Rebeca Gomes', '20162bsi0854' , 'Sistemas de Informacao');

insert into ALUNO(nome, matricula, curso)
values ('Lucca Costa Rodrigues', '20142ceca7419' , 'Engenharia de Controle e Automacao');

/* INSERCAO RG  */

insert into RG(nome, nomePai, nomeMae, dataNasc, dataExpedicao, UF, Municipio, numRG, numCPF, codDocumento)
values ('Benicio Kaue Galvao', 'Arthur Raimundo Galvao', 'Andrea Rosa', '1996/10/14', '2012/04/09', 'Espirito Santo', 'Vitoria', 1021547, 00125874628, 001);

insert into RG(nome, nomePai, nomeMae, dataNasc, dataExpedicao, UF, Municipio, numRG, numCPF, codDocumento)
values ('Heloisa Carla Aragao', 'Raul Alexandre Nicolas Aragao', 'Joana Valentina Julia', '2000/01/10', '2016/07/07', 'Rio de Janeiro', 'Volta Redonda', 0078123, 01278596852, 001);

insert into RG(nome, nomePai, nomeMae, dataNasc, dataExpedicao, UF, Municipio, numRG, numCPF, codDocumento)
values ('Agatha Leticia Andrea Alves', 'Luan Gabriel Vinicius Alves', 'Valentina Marcela', '1994/07/03', '2012/09/09', 'Espirito Santo', 'Serra', 0362147, 00085236974, 001);

insert into RG(nome, nomePai, nomeMae, dataNasc, dataExpedicao, UF, Municipio, numRG, numCPF, codDocumento)
values ('Marcio Henrique Murilo Nascimento', 'Augusto Severino Miguel Nascimento', 'Rebeca Livia Debora', '1990/08/23', '2008/01/09', 'Espirito Santo', 'Vila Velha', 0085748, 01523698752, 001);

insert into RG(nome, nomePai, nomeMae, dataNasc, dataExpedicao, UF, Municipio, numRG, numCPF, codDocumento)
values ('Marcia Carolina Rebeca Gomes', 'Ricardo Lorenzo Gomes', 'Clara Betina', '1995/11/04', '2010/06/07', 'Espirito Santo', 'Vitoria', 1257664, 01523698752, 001);

insert into RG(nome, nomePai, nomeMae, dataNasc, dataExpedicao, UF, Municipio, numRG, numCPF, codDocumento)
values ('Lucca Costa Rodrigues', 'Leonardo Severino Gustavo Rodrigues', 'Ana Carolina', '1988/02/20', '2006/08/30', 'Espirito Santo', 'Cariacica', 001867996, 02135843710, 001);

update RG set dataemissao = '2012/04/09' where nomemae = 'Andrea Rosa';
update RG set dataemissao = '2016/07/07' where nomemae = 'Joana Valentina Julia';
update RG set dataemissao = '2012/09/09' where nomemae = 'Valentina Marcela';
update RG set dataemissao = '2008/01/09' where nomemae = 'Rebeca Livia Debora';
update RG set dataemissao = '2010/06/07' where nomemae = 'Clara Betina';
update RG set dataemissao = '2006/08/30' where nomemae = 'Ana Carolina';

/* INSERCAO CPF */

insert into CPF(nome, datanasc, coddocumento, numcpf)
values ('Benicio Kaue Galvao', '1996/10/14', 002, 125874628);

insert into CPF(nome, datanasc, coddocumento, numcpf)
values ('Heloisa Carla Aragao', '2000/01/10', 002, 278596852);

insert into CPF(nome, datanasc, coddocumento, numcpf)
values ('Agatha Leticia Andrea Alves', '1994/07/03', 002, 85236974);

insert into CPF(nome, datanasc, coddocumento, numcpf)
values ('Marcio Henrique Murilo Nascimento', '1990/08/23', 002, 523698752);

insert into CPF(nome, datanasc, coddocumento, numcpf)
values ('Marcia Carolina Rebeca Gomes', '1995/11/04', 002, 01523698752);

insert into CPF(nome, datanasc, coddocumento, numcpf)
values ('Lucca Costa Rodrigues', '1988/02/20', 002, 02135843710);

/* INSERCAO SETOR */

insert into SETOR(coordenador, idsetor)
values ('Rozimeire Lucas Lourenco Machado', 1245);

insert into SETOR(coordenador, idsetor)
values ('Giselly Ferreira Martins', 8547);

insert into SETOR(coordenador, idsetor)
values ('Claudia Ribeiro de Moraes', 3654);

insert into SETOR(coordenador, idsetor)
values ('Wagner Teixeira da Costa', 8547);

insert into SETOR(coordenador, idsetor)
values ('Rogeria Gomes Belchior', 2287);

insert into SETOR(coordenador, idsetor)
values ('Edilson Luiz do Nascimento', 1310);

/* update SETOR set nome = 'Coordenador Geral de Ensino' where idsetor = '1310'; */
update SETOR set nome = 'Biblioteca' where idsetor = '2287';
update SETOR set nome = 'Diretoria de Ensino' where idsetor = '8547';
update SETOR set nome = 'Gestao Pedagogica' where idsetor = '3654';
update SETOR set nome = 'Registro Academico' where idsetor = '1245';
update SETOR set nome = 'Apoio ao Ensino' where idsetor = '9964'; 

/* INSERCAO CURSO */

insert into CURSO(nome, codcurso)
values ('Sistemas de Informacao', 131018);

insert into CURSO(nome, codcurso)
values ('Engenharia de Controle e Automacao', 251527);

/* INSERCAO DOCUMENTO */

insert into DOCUMENTO(nome, coddocumento)
values ('rg', 001);

insert into DOCUMENTO(nome, coddocumento)
values ('cpf', 002);

insert into DOCUMENTO(nome, coddocumento)
values ('titulo', 003);

 /* INSERCAO FUNCIONARIO */


insert into FUNCIONARIO(nome, siape, setor)
values ('Rozimeire Lucas Lourenco Machado',3924,'Registro Academico');

insert into FUNCIONARIO(nome, siape, setor)
values ('Giselly Ferreira Martins',6187,'Apoio ao Ensino');

insert into FUNCIONARIO(nome, siape, setor)
values ('Clᵤia Ribeiro de Moraes',2581,'Gest㯠Pedag󧩣a');

insert into FUNCIONARIO(nome, siape, setor)
values ('Wagner Teixeira da Costa',1869,'Diretoria de Ensino');

insert into FUNCIONARIO(nome, siape, setor)
values ('Rogeria Gomes Belchior',2848,'Biblioteca');

insert into FUNCIONARIO(nome, siape, setor)
values ('Edilson Luiz do Nascimento',4772,'Coordenador Geral de Ensino');

/* INSERCAO TITULO */

insert into TITULO_ELEITOR(nome, dataNasc, Municipio, UF, Zona, secao, dataEmissao, codDocumento)
values ('Benicio Kaue Galvao', '1996/10/14', 'Vitoria', 'Espirito Santo', 0258, 0214, '2012/04/09',003);

insert into TITULO_ELEITOR(nome, dataNasc, Municipio, UF, Zona, secao, dataEmissao, codDocumento)
values ('Heloisa Carla Aragao', '2000/01/10', 'Volta Redonda', 'Rio de Janeiro', 0755, 0333, '2016/07/07',003);

insert into TITULO_ELEITOR(nome, dataNasc, Municipio, UF, Zona, secao, dataEmissao, codDocumento)
values ('Agatha Leticia Andrea Alves', '1994/07/03', 'Serra', 'Espirito Santo', 0593, 0975, '2012/09/09', 003);

insert into TITULO_ELEITOR(nome, dataNasc, Municipio, UF, Zona, secao, dataEmissao, codDocumento)
values ('Marcio Henrique Murilo Nascimento', '1990/08/23', 'Vila Velha', 'Esp�to Santo', 0989, 0317, '2008/01/09', 003);

insert into TITULO_ELEITOR(nome, dataNasc, Municipio, UF, Zona, secao, dataEmissao, codDocumento)
values ('Marcia Carolina Rebeca Gomes', '1995/11/04', 'Vitoria', 'Espirito Santo', 0904, 0451, '2010/06/07', 003);

insert into TITULO_ELEITOR(nome, dataNasc, Municipio, UF, Zona, secao, dataEmissao, codDocumento)
values ('Lucca Costa Rodrigues', '1988/02/20', 'Cariacica', 'Esp�to Santo', 0204, 0767, '2006/08/30', 003);

/* INSERCAO RELATORIOS */

insert into RELATORIO(data, idrelatorio, hora, idusuario)
values ('2016/12/28', 1994, '15:42', 3924);

insert into RELATORIO(data, idrelatorio, hora, idusuario)
values ('2018/10/28', 1900, '19:32', 6187);

insert into RELATORIO(data, idrelatorio, hora, idusuario)
values ('2018/06/19', 2018, '11:52', 2581);

insert into RELATORIO(data, idrelatorio, hora, idusuario)
values ('2018/08/03', 2007, '09:45', 1869);

insert into RELATORIO(data, idrelatorio, hora, idusuario)
values ('2017/05/04', 2000, '07:50', 2848);

insert into RELATORIO(data, idrelatorio, hora, idusuario)
values ('2016/09/07', 2030, '13:19', 4772);

insert into RELATORIO(data, idrelatorio, hora, idusuario)
values ('2018/10/04', 2019, '14:22', 2581);

insert into RELATORIO(data, idrelatorio, hora, idusuario)
values ('2018/11/28', 2003, '17:09', 1869);

/*update CPF set numcpf = '01523698752' where nome = 'Marcio Henrique Murilo Nascimento'; */
