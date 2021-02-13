drop table if exists TB_USUARIO;
create table TB_USUARIO(
    COD_USUARIO bigint generated by default as identity primary key,
    LOGIN varchar(50) not null,
    SENHA varchar(50) not null
);

drop table if exists TB_EMAIL;
create table TB_EMAIL(
    COD_EMAIL bigint generated by default as identity primary key,
    ENDERECO_EMAIL varchar(255) not null
);

drop table if exists TB_TELEFONE;
create table TB_TELEFONE(
    COD_TELEFONE bigint generated by default as identity primary key,
    NUMERO_TELEFONE varchar(15) not null,
    TIPO_TELEFONE varchar(50) not null
);

drop table if exists TB_ENDERECO;
create table TB_ENDERECO(
    COD_ENDERECO bigint generated by default as identity primary key,
    CEP varchar(255) not null,
    LOGRADOURO varchar(255) not null,
    BAIRRO varchar(255) not null,
    CIDADE varchar(255) not null,
    UF varchar(255) not null,
    COMPLEMENTO varchar(255)
);

drop table if exists TB_CLIENTE;
create table TB_CLIENTE(
    COD_CLIENTE bigint generated by default as identity primary key,
    NOME varchar(100) not null,
    CPF varchar(11) not null,
    COD_ENDERECO bigint not null,
    foreign key (COD_ENDERECO) references TB_ENDERECO(COD_ENDERECO)
);

drop table if exists TB_CLIENTE_TELEFONES;
create table TB_CLIENTE_TELEFONES (
  COD_CLIENTE bigint,
  COD_TELEFONE bigint,
  foreign key (COD_CLIENTE) references TB_CLIENTE(COD_CLIENTE),
  foreign key (COD_TELEFONE) references TB_TELEFONE(COD_TELEFONE)
);

drop table if exists TB_CLIENTE_EMAILS;
create table TB_CLIENTE_EMAILS (
  COD_CLIENTE bigint,
  COD_EMAIL bigint,
  foreign key (COD_CLIENTE) references TB_CLIENTE(COD_CLIENTE),
  foreign key (COD_EMAIL) references TB_EMAIL(COD_EMAIL)
);