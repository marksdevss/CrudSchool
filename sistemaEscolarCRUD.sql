use sistemaescolar;

CREATE TABLE Alunos (
    id int primary key auto_increment  not null,
    Nome varchar(100) not null,
    DataNascimento date,
    Email varchar(100) not null,
    Telefone varchar(15) not null,
    Endereco varchar(255) not null,
    Turma varchar(255) not null
);

CREATE TABLE Professores (
    id int primary key auto_increment not null,
    Nome varchar(100) not null,
    Disciplina varchar(50) not null,
    Email varchar(100) not null,
    Telefone varchar(15) not null,
    DataContratacao DATE not null
);

CREATE TABLE Turmas (
    id_turma int primary key auto_increment not null,
    ProfessorResponsavel varchar(100) not null,
    AnoLetivo DATE not null,
    HorariodeAula varchar(100) not null,
    CodigoTurma varchar(100) not null
);

create table ADM(
id_adm  int primary key auto_increment not null,
usuario  varchar(100) not null,
senha varchar(100) not null
);

INSERT INTO ADM(usuario,senha) values(
'marcos','m1234'
);


INSERT INTO Alunos (Nome, DataNascimento, Email, Telefone, Endereco, Turma)
VALUES 
('João Silva', '2005-06-12', 'joaosilva@email.com', '(27) 12345-6789', 'Rua das Flores, 123, Vitória, ES', 101),
( 'Maria Santos', '2006-07-23', 'mariasantos@email.com', '(27) 98765-4321', 'Avenida do Sol, 456, Vitória, ES', 102),
('Pedro Costa', '2005-08-30', 'pedrocosta@email.com', '(27) 54321-6789', 'Praça da Lua, 789, Vitória, ES', 101);


INSERT INTO Professores (Nome, Disciplina, Email, Telefone, DataContratacao)
VALUES 
('João Silva', 'Matemática', 'joaosilva@email.com', '(27) 12345-6789', '2023-01-01'),
('Maria Santos', 'Português', 'mariasantos@email.com', '(27) 98765-4321', '2023-02-01'),
('Pedro Costa', 'História', 'pedrocosta@email.com', '(27) 54321-6789', '2023-03-01');

INSERT INTO Turmas (ProfessorResponsavel, AnoLetivo, HorariodeAula, CodigoTurma)
VALUES 
('João Silva', '2023-01-01', '08:00 - 12:00', 'TURMA101'),
('Maria Santos', '2023-02-01', '13:00 - 17:00', 'TURMA102'),
('Pedro Costa', '2023-03-01', '18:00 - 22:00', 'TURMA103');


