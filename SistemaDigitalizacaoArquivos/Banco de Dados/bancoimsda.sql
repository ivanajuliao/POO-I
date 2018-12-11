--
-- File generated with SQLiteStudio v3.2.1 on ter dez 11 00:53:59 2018
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: aluno
CREATE TABLE aluno (
	nome TEXT NULL,
	matricula TEXT NOT NULL,
	fk_curso_codigo_curso INTEGER NOT NULL,
	PRIMARY KEY(matricula),
	FOREIGN KEY(fk_curso_codigo_curso) REFERENCES curso(codigo_curso)
);
INSERT INTO aluno (nome, matricula, fk_curso_codigo_curso) VALUES ('Vinicius Santos Tosta', '20091ceca0125', 2);
INSERT INTO aluno (nome, matricula, fk_curso_codigo_curso) VALUES ('Tiago Souza Alves', '20122bsi0847', 1);
INSERT INTO aluno (nome, matricula, fk_curso_codigo_curso) VALUES ('Yasmin Cardoso Oliveira', '20161bsi5512', 1);
INSERT INTO aluno (nome, matricula, fk_curso_codigo_curso) VALUES ('Rafaela Castro Gomes', '20142ceca6398', 2);
INSERT INTO aluno (nome, matricula, fk_curso_codigo_curso) VALUES ('* TRIAL * TRIAL * TRIA', '20171ceca1234', 2);
INSERT INTO aluno (nome, matricula, fk_curso_codigo_curso) VALUES ('Carolina Cavalcanti  Araújo ', '20152bsi7845', 1);
INSERT INTO aluno (nome, matricula, fk_curso_codigo_curso) VALUES ('Vitor Pereira Alves', '20151ceca0025', 2);
INSERT INTO aluno (nome, matricula, fk_curso_codigo_curso) VALUES ('Júlio Lima Azevedo', '20172ceca5598', 2);
INSERT INTO aluno (nome, matricula, fk_curso_codigo_curso) VALUES ('Julieta Oliveira Fernandes', '20132bsi6647', 1);
INSERT INTO aluno (nome, matricula, fk_curso_codigo_curso) VALUES ('Alice Bittencourt Barros de Arruda', '20172bsi0981', 1);

-- Table: curso
CREATE TABLE curso (
	codigo_curso INTEGER NOT NULL,
	nome TEXT NULL,
	PRIMARY KEY(codigo_curso)
);
INSERT INTO curso (codigo_curso, nome) VALUES (1, 'Engenharia Mecânica');
INSERT INTO curso (codigo_curso, nome) VALUES (2, 'Engenharia de Controle e Automação');
INSERT INTO curso (codigo_curso, nome) VALUES (3, 'Técnico em Informática');
INSERT INTO curso (codigo_curso, nome) VALUES (4, '* TRIAL * TRIAL * TRIAL * TRIAL');
INSERT INTO curso (codigo_curso, nome) VALUES (6, 'Técnico Integrado em Informática');
INSERT INTO curso (codigo_curso, nome) VALUES (7, 'Técnico em Automação Industrial');

-- Table: documento
CREATE TABLE documento (
	numero_documento INTEGER NULL,
	id_documento INTEGER NOT NULL,
	data_de_expedicao TEXT NULL,
	fk_orgao_emissor_codigo_oe INTEGER NOT NULL,
	fk_aluno_matricula TEXT NULL,
	fk_tipo_documento_codigo_tipo INTEGER NOT NULL,
	PRIMARY KEY(id_documento),
	FOREIGN KEY(fk_orgao_emissor_codigo_oe) REFERENCES orgao_emissor(codigo_oe),
	FOREIGN KEY(fk_aluno_matricula) REFERENCES aluno(matricula),
	FOREIGN KEY(fk_tipo_documento_codigo_tipo) REFERENCES tipo_documento(codigo_tipo)
);
INSERT INTO documento (numero_documento, id_documento, data_de_expedicao, fk_orgao_emissor_codigo_oe, fk_aluno_matricula, fk_tipo_documento_codigo_tipo) VALUES (974909, 3, '1980-08-29T00:00:00', 1, '20091ceca0125', 2);
INSERT INTO documento (numero_documento, id_documento, data_de_expedicao, fk_orgao_emissor_codigo_oe, fk_aluno_matricula, fk_tipo_documento_codigo_tipo) VALUES (569542, 4, '2007-09-08T00:00:00', 1, '20122bsi0847', 2);
INSERT INTO documento (numero_documento, id_documento, data_de_expedicao, fk_orgao_emissor_codigo_oe, fk_aluno_matricula, fk_tipo_documento_codigo_tipo) VALUES (484562, 5, '2001-12-22T00:00:00', 1, '20161bsi5512', 2);
INSERT INTO documento (numero_documento, id_documento, data_de_expedicao, fk_orgao_emissor_codigo_oe, fk_aluno_matricula, fk_tipo_documento_codigo_tipo) VALUES (716601, 6, '2002-02-09T00:00:00', 1, '20142ceca6398', 2);
INSERT INTO documento (numero_documento, id_documento, data_de_expedicao, fk_orgao_emissor_codigo_oe, fk_aluno_matricula, fk_tipo_documento_codigo_tipo) VALUES (119774, 7, '1999-08-02T00:00:00', 1, '20171ceca1234', 2);
INSERT INTO documento (numero_documento, id_documento, data_de_expedicao, fk_orgao_emissor_codigo_oe, fk_aluno_matricula, fk_tipo_documento_codigo_tipo) VALUES (880910, 8, '2007-08-09T00:00:00', 1, '20152bsi7845', 2);
INSERT INTO documento (numero_documento, id_documento, data_de_expedicao, fk_orgao_emissor_codigo_oe, fk_aluno_matricula, fk_tipo_documento_codigo_tipo) VALUES (909514, 9, '1999-07-06T00:00:00', 1, '20172bsi0981', 2);
INSERT INTO documento (numero_documento, id_documento, data_de_expedicao, fk_orgao_emissor_codigo_oe, fk_aluno_matricula, fk_tipo_documento_codigo_tipo) VALUES (713636, 10, '2007-07-07T00:00:00', 1, '20132bsi6647', 2);
INSERT INTO documento (numero_documento, id_documento, data_de_expedicao, fk_orgao_emissor_codigo_oe, fk_aluno_matricula, fk_tipo_documento_codigo_tipo) VALUES (104295, 11, '1988-04-02T00:00:00', 1, '20172ceca5598', 2);
INSERT INTO documento (numero_documento, id_documento, data_de_expedicao, fk_orgao_emissor_codigo_oe, fk_aluno_matricula, fk_tipo_documento_codigo_tipo) VALUES (955706, 13, '2001-11-08T00:00:00', 1, '20151ceca0025', 2);

-- Table: municipio
CREATE TABLE municipio (
	codigo_municipio INTEGER NOT NULL,
	nome_municipio TEXT NULL,
	PRIMARY KEY(codigo_municipio)
);
INSERT INTO municipio (codigo_municipio, nome_municipio) VALUES (1, 'Mossoró');
INSERT INTO municipio (codigo_municipio, nome_municipio) VALUES (2, 'Viana');
INSERT INTO municipio (codigo_municipio, nome_municipio) VALUES (3, 'Vitória');
INSERT INTO municipio (codigo_municipio, nome_municipio) VALUES (4, 'Serra');
INSERT INTO municipio (codigo_municipio, nome_municipio) VALUES (5, '* TRIAL * T');
INSERT INTO municipio (codigo_municipio, nome_municipio) VALUES (6, '* TRIAL * TR');
INSERT INTO municipio (codigo_municipio, nome_municipio) VALUES (7, '* TRIAL * TRIAL * ');

-- Table: orgao_emissor
CREATE TABLE orgao_emissor (
	codigo_oe INTEGER NOT NULL,
	nome TEXT NULL,
	PRIMARY KEY(codigo_oe)
);
INSERT INTO orgao_emissor (codigo_oe, nome) VALUES (1, 'SESP');
INSERT INTO orgao_emissor (codigo_oe, nome) VALUES (2, 'Receita Federal do Brasil');
INSERT INTO orgao_emissor (codigo_oe, nome) VALUES (3, 'Tribunal Superior Eleitoral');

-- Table: rg
CREATE TABLE rg (
	nome_pai TEXT NULL,
	nome_mae TEXT NULL,
	data_de_nascimento TEXT NULL,
	fk_documento_id_documento INTEGER NOT NULL,
	fk_uf_codigo_uf INTEGER NOT NULL,
	PRIMARY KEY(fk_documento_id_documento),
	FOREIGN KEY(fk_documento_id_documento) REFERENCES documento(id_documento),
	FOREIGN KEY(fk_uf_codigo_uf) REFERENCES uf(codigo_uf)
);
INSERT INTO rg (nome_pai, nome_mae, data_de_nascimento, fk_documento_id_documento, fk_uf_codigo_uf) VALUES ('* TRIAL * TRIAL * TRIAL * ', 'Maria Madalena Santos Tosta', '1989-05-28T00:00:00', 3, 1);
INSERT INTO rg (nome_pai, nome_mae, data_de_nascimento, fk_documento_id_documento, fk_uf_codigo_uf) VALUES ('Augusto Caio Heitor Alves', 'Amanda Castro Souza', '1990-11-04T00:00:00', 4, 1);
INSERT INTO rg (nome_pai, nome_mae, data_de_nascimento, fk_documento_id_documento, fk_uf_codigo_uf) VALUES ('Lorenzo Diogo Nicolas Oliveira', 'Bruna Santos Cardoso', '1984-08-24T00:00:00', 5, 1);
INSERT INTO rg (nome_pai, nome_mae, data_de_nascimento, fk_documento_id_documento, fk_uf_codigo_uf) VALUES ('Tomás Vitor Gomes', 'Giovanna Pinto Castro', '1994-09-29T00:00:00', 6, 3);
INSERT INTO rg (nome_pai, nome_mae, data_de_nascimento, fk_documento_id_documento, fk_uf_codigo_uf) VALUES ('Samuel Henry Rodrigues', 'Marina Dias Barros', '1988-11-26T00:00:00', 7, 4);
INSERT INTO rg (nome_pai, nome_mae, data_de_nascimento, fk_documento_id_documento, fk_uf_codigo_uf) VALUES ('* TRIAL * TRIAL * TRIAL * TRIA', 'Nicole Cardoso Cavalcanti', '1985-08-15T00:00:00', 8, 5);
INSERT INTO rg (nome_pai, nome_mae, data_de_nascimento, fk_documento_id_documento, fk_uf_codigo_uf) VALUES ('* TRIAL * TRIAL * TRI', 'Larissa Rocha Sousa', '1999-09-09T00:00:00', 9, 1);
INSERT INTO rg (nome_pai, nome_mae, data_de_nascimento, fk_documento_id_documento, fk_uf_codigo_uf) VALUES ('Estevan Martins Alves', '* TRIAL * TRIAL * TRI', '1982-03-12T00:00:00', 10, 1);
INSERT INTO rg (nome_pai, nome_mae, data_de_nascimento, fk_documento_id_documento, fk_uf_codigo_uf) VALUES ('* TRIAL * TRIAL * TR', 'Luiza Rodrigues Lima', '1975-05-16T00:00:00', 11, 1);
INSERT INTO rg (nome_pai, nome_mae, data_de_nascimento, fk_documento_id_documento, fk_uf_codigo_uf) VALUES ('Nicolas Rodrigues Fernandes', 'Luana Castro Oliveira', '1988-02-08T00:00:00', 13, 1);

-- Table: tipo_documento
CREATE TABLE tipo_documento (
	codigo_tipo INTEGER NOT NULL,
	descricao TEXT NULL,
	PRIMARY KEY(codigo_tipo)
);
INSERT INTO tipo_documento (codigo_tipo, descricao) VALUES (1, 'CPF');
INSERT INTO tipo_documento (codigo_tipo, descricao) VALUES (2, 'RG');
INSERT INTO tipo_documento (codigo_tipo, descricao) VALUES (3, 'Título de Eleitor');

-- Table: titulo_eleitor
CREATE TABLE titulo_eleitor (
	zona INTEGER NULL,
	secao INTEGER NULL,
	fk_documento_id_documento INTEGER NOT NULL,
	fk_municipio_codigo_municipio INTEGER NOT NULL,
	PRIMARY KEY(fk_documento_id_documento),
	FOREIGN KEY(fk_documento_id_documento) REFERENCES documento(id_documento),
	FOREIGN KEY(fk_municipio_codigo_municipio) REFERENCES municipio(codigo_municipio)
);
INSERT INTO titulo_eleitor (zona, secao, fk_documento_id_documento, fk_municipio_codigo_municipio) VALUES (7, 98, 3, 1);
INSERT INTO titulo_eleitor (zona, secao, fk_documento_id_documento, fk_municipio_codigo_municipio) VALUES (51, 58, 4, 2);
INSERT INTO titulo_eleitor (zona, secao, fk_documento_id_documento, fk_municipio_codigo_municipio) VALUES (19, 22, 5, 3);
INSERT INTO titulo_eleitor (zona, secao, fk_documento_id_documento, fk_municipio_codigo_municipio) VALUES (78, 93, 6, 3);
INSERT INTO titulo_eleitor (zona, secao, fk_documento_id_documento, fk_municipio_codigo_municipio) VALUES (25, 17, 7, 4);
INSERT INTO titulo_eleitor (zona, secao, fk_documento_id_documento, fk_municipio_codigo_municipio) VALUES (36, 8, 8, 4);
INSERT INTO titulo_eleitor (zona, secao, fk_documento_id_documento, fk_municipio_codigo_municipio) VALUES (99, 29, 9, 5);
INSERT INTO titulo_eleitor (zona, secao, fk_documento_id_documento, fk_municipio_codigo_municipio) VALUES (14, 19, 10, 6);
INSERT INTO titulo_eleitor (zona, secao, fk_documento_id_documento, fk_municipio_codigo_municipio) VALUES (87, 66, 11, 7);

-- Table: uf
CREATE TABLE uf (
	codigo_uf INTEGER NOT NULL,
	nome TEXT NULL,
	PRIMARY KEY(codigo_uf)
);
INSERT INTO uf (codigo_uf, nome) VALUES (1, 'RN');
INSERT INTO uf (codigo_uf, nome) VALUES (2, 'ES');
INSERT INTO uf (codigo_uf, nome) VALUES (3, 'AM');
INSERT INTO uf (codigo_uf, nome) VALUES (4, 'BR');
INSERT INTO uf (codigo_uf, nome) VALUES (5, 'MA');
INSERT INTO uf (codigo_uf, nome) VALUES (6, 'MG');
INSERT INTO uf (codigo_uf, nome) VALUES (7, 'RS');
INSERT INTO uf (codigo_uf, nome) VALUES (8, 'SC');
INSERT INTO uf (codigo_uf, nome) VALUES (9, 'AC');
INSERT INTO uf (codigo_uf, nome) VALUES (10, 'RJ');

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
