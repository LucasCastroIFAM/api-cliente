-- Apagar o banco de dados
drop database banco;
-- Criar o banco de dados
create database banco;

-- Atribuir os privilégios de acesso aos objetos do banco para o usuário root
GRANT ALL PRIVILEGES ON banco.* TO 'root'@'localhost';

-- Acesar o banco de dados
USE banco;

CREATE TABLE endereco(
    id int AUTO_INCREMENT PRIMARY KEY,
    cep varchar(10) NOT NULL,
    rua varchar(50) NOT NULL,
    bairro varchar(25) NOT NULL,
    numero int(6) NOT NULL,
    cidade varchar(20) NOT NULL,
    uf varchar(3) NOT NULL
)

-- Criar a tabela: cliente
CREATE TABLE cliente(
    id int AUTO_INCREMENT PRIMARY KEY,
    id_endereco int,
    nome varchar(50) NOT NULL,
    cpf varchar(11) NOT NULL,
    sexo varchar(1) NOT NULL,
    nascimento date DEFAULT CURRENT_TIME,

    FOREIGN KEY (id_endereco) REFERENCES endereco (id)
)