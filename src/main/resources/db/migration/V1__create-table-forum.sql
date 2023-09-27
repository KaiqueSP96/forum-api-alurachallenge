create table topicos (
    id bigint not null auto_increment,
    titulo varchar(300) not null,
    mensagem varchar(600) not null,
    data_criacao date not null,
    status varchar(50) not null,
    autor varchar(200) not null,
    curso varchar(300) not null,

    primary key(id)
);
