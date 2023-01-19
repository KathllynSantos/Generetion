CREATE DATABASE ecommerce;

USE ecommerce;
CREATE TABLE produtos(
	id BIGINT auto_increment,
    nome VARCHAR(255),
    preco DECIMAL(5,2),
    quantidade INT,
    marca VARCHAR(255), 
    PRIMARY KEY(id)
);
INSERT INTO produtos(nome,preco,quantidade,marca)
VALUES("Camiseta",29.90,4,"Hering");
INSERT INTO produtos(nome,preco,quantidade,marca)
VALUES("Vestido",59.90,5,"Hering");
INSERT INTO produtos(nome,preco,quantidade,marca)
VALUES("Short",99.90,4,"Hering");
INSERT INTO produtos(nome,preco,quantidade,marca)
VALUES("Calça",129.90,4,"Hering");
INSERT INTO produtos(nome,preco,quantidade,marca)
VALUES("Blusinha",49.90,4,"Hering");
INSERT INTO produtos(nome,preco,quantidade,marca)
VALUES("Saia",59.90,2,"Hering");
INSERT INTO produtos(nome,preco,quantidade,marca)
VALUES("Bolsa",550.90,1,"Dolce Gabbana");
INSERT INTO produtos(nome,preco,quantidade,marca)
VALUES("Sapatinha",89.90,3,"Moleca");


SELECT * FROM produtos;

SELECT * FROM produtos WHERE preco < 500;

SELECT * FROM produtos WHERE preco > 500;

UPDATE produtos
SET nome = "Camiseta"
WHERE id=1;


CREATE DATABASE escola;

USE escola;

CREATE TABLE alunos(
id bigint auto_increment,
nome VARCHAR(255),
cpf VARCHAR(11),
matriculaaluno INT,
ano VARCHAR(100),
nota INT,
PRIMARY KEY(id)
);
INSERT INTO alunos (nome,cpf,matriculaaluno,ano,nota)
VALUES("Kathllyn Leticia","34576890022",2,"8° Série",7.1);
INSERT INTO alunos (nome,cpf,matriculaaluno,ano,nota)
VALUES("Jessica Cavalcante","44576467024",1,"7° Série",8.9);
INSERT INTO alunos (nome, cpf, matriculaaluno, ano, nota) 
VALUES ("Gabriel", "34567890123", 3, " 8° Série", 9.1);
INSERT INTO alunos  (nome, cpf, matriculaaluno, ano, nota) 
VALUES  ("Heitor", "45678901234", 9, " 7° ano", 6.2);
INSERT INTO alunos(nome, cpf, matriculaaluno, ano, nota) 
VALUES ("Allison Santos", "56789012345", 8, " 3° ano", 7.2);
INSERT INTO alunos (nome, cpf, matriculaaluno, ano, nota) 
VALUES ("Lucca Santos", "67890123456", 5, " 6° ano", 9.2);
INSERT INTO alunos (nome, cpf, matriculaaluno, ano, nota) 
VALUES ("Thiago Lima", "78901234567", 6," 4° ano", 8.2);

 SELECT * FROM alunos;

SELECT * FROM alunos WHERE nota < 7.0;

SELECT * FROM alunos WHERE nota > 7.0;

UPDATE alunos 
SET nome="Carol" WHERE id =3;