
CREATE DATABASE db_generation_game_online;

USE db_generation_game_online; 

CREATE TABLE tb_classe(
	id BIGINT AUTO_INCREMENT,
    nivel INT,
    classe VARCHAR(255),
    habilidade VARCHAR(255),
    arma VARCHAR(255),
	PRIMARY KEY (id)
);
CREATE TABLE tb_personagem(
    id bigint auto_increment,
    nome VARCHAR(255),
    vida INT,
    defesa INT,
    ataque INT,
	raca VARCHAR(255),
    classe_id BIGINT,
  
    PRIMARY KEY(id),
    FOREIGN KEY (classe_id) REFERENCES tb_classe(id)
);

INSERT INTO tb_classe(nivel, classe, habilidade, arma)
VALUES(100, "Mago","Resistencia a Magia","Cajado");
INSERT INTO tb_classe(nivel, classe, habilidade, arma)
VALUES(50 ,"Guerreira","Pericia em armas","Espada de duas mãos");
INSERT INTO tb_classe(nivel, classe, habilidade, arma)
VALUES(30 ,"Nordico","Mãos leves","Adaga");
INSERT INTO tb_classe(nivel, classe, habilidade, arma)
VALUES(99 ,"Arqueiro","Arquerismo","Arco e flecha");
INSERT INTO tb_classe(nivel, classe, habilidade, arma)
VALUES(100 ,"Bardo","Lábia","Alaude");

SELECT * FROM tb_classe;

INSERT INTO tb_personagem(nome,vida,defesa,ataque,raca,classe_id)
VALUES("Rick",1400 ,2000, 9000,"Elgo", 1);
INSERT INTO tb_personagem(nome,vida,defesa,ataque,raca,classe_id)
VALUES("Moana",1000 , 1200 , 3000 ,"Imperial", 5);
INSERT INTO tb_personagem(nome,vida,defesa,ataque,raca,classe_id)
VALUES("Carol", 5000 , 1700 , 7500,"Imperial",5);
INSERT INTO tb_personagem(nome,vida,defesa,ataque,raca,classe_id)
VALUES("Jessica", 500 ,6000 ,7000 , "Humana",3);
INSERT INTO tb_personagem(nome,vida,defesa,ataque,raca,classe_id)
VALUES("Carl", 2000, 800, 700 ,"Construto", 3);
INSERT INTO tb_personagem(nome,vida,defesa,ataque,raca,classe_id)
VALUES("Merlyn", 2500, 6000, 88000 , "Elfo",1);

SELECT * FROM tb_personagem;

SELECT * FROM tb_personagem 
WHERE ataque > 2000;

SELECT * FROM tb_personagem 
WHERE defesa >= 1000 AND defesa <=2000;

SELECT * FROM tb_personagem 
WHERE defesa BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagem 
WHERE nome LIKE "%c%";

SELECT * FROM tb_personagem 
INNER JOIN tb_classe
ON tb_classe.id = tb_personagem.id
WHERE classe LIKE "%arqueiro%";