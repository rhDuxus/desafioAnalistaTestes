-- Criando a tabela 'usuario'
CREATE TABLE IF NOT EXISTS usuario (
    email VARCHAR(255) PRIMARY KEY,
    password VARCHAR(255) NOT NULL
);

-- Criando a tabela 'item'
CREATE TABLE IF NOT EXISTS item (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL
);

-- Inserindo dados de exemplo na tabela 'usuario'
INSERT INTO usuario (email, password) VALUES ('joao@teste.com', 'senha123');
INSERT INTO usuario (email, password) VALUES ('maria@teste.com', 'senha456');
INSERT INTO usuario (email, password) VALUES ('pedro@teste.com', 'senha789');

-- Inserindo dados de exemplo na tabela 'item'
INSERT INTO item (name, price) VALUES ('Produto A', 29.99);
INSERT INTO item (name, price) VALUES ('Produto B', 49.99);
INSERT INTO item (name, price) VALUES ('Produto C', 19.99);
INSERT INTO item (name, price) VALUES ('Produto D', 99.99);
INSERT INTO item (name, price) VALUES ('Produto E', 59.99);
