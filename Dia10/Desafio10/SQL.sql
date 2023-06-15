CREATE TABLE SECITECI;

CREATE TABLE Escola(
Codigo SERIAL PRIMARY KEY,
Nome VARCHAR(60) NOT NULL,
Capacidade INTEGER NOT NULL);

CREATE TABLE ALUNO(
Matricula SERIAL PRIMARY KEY,
Nome VARCHAR(60) NOT NULL,
Email VARCHAR(80) NOT NULL,
Idade INTEGER NOT NULL);

INSERT INTO Aluno(Nome, Email, Idade) VALUES
('Aline Ayumi Nakazawa', 'Aline@Email.com', 20),
('Allan Victor Toledo', 'Allan@Email.com', 20),
('Carlos Rafael Nogueira', 'Carlos@Email.com', 20);

INSERT INTO Escola(Nome, Capacidade) VALUES
('Teresa Lobo', 400),
('Dom Pedro Segundo', 1200),
('Agostinho Simplício', 300);