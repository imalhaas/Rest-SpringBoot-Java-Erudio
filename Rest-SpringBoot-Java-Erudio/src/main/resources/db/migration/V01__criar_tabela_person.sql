CREATE TABLE person(
id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
nome varchar(50) not null,
dataNascimento varchar(255) not null,
idade varchar(20) not null,
endereco varchar(50) not null,
profissao varchar(30) not null
);

INSERT INTO person (nome, dataNascimento, idade, endereco, profissao) values
 ('Lucas Magalhaes', '09/10/1998', 24, 'QS6 COnj2', 'programador');