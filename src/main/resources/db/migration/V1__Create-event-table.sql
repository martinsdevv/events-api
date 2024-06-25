CREATE TABLE Eventos (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255),
    descricao TEXT,
    local VARCHAR(255),
    nomeCliente VARCHAR(255),
    qtdFuncionarios INT,
    valorCombinado FLOAT
);