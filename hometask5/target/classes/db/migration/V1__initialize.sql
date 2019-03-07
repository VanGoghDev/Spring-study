SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS products;

CREATE TABLE products (
  id                    INT(11) NOT NULL AUTO_INCREMENT,
  title                 VARCHAR(50) NOT NULL,
  cost                  DECIMAL(8,2) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS cats;

CREATE TABLE cats (
                    id int(11) NOT NULL AUTO_INCREMENT,
                    name VARCHAR(100) DEFAULT NULL,
                    PRIMARY KEY(id)
) ENGINE=InnoDB CHARSET=utf8;

INSERT INTO cats (id, name)
VALUES
(1, "Barsik"),
(2, "Murzik");


INSERT INTO products (title, cost)
VALUES
('Хлеб', 30), ('Молоко', 50);

SET FOREIGN_KEY_CHECKS = 1;
