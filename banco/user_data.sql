-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 10/06/2024 às 19:26
-- Versão do servidor: 11.4.2-MariaDB
-- Versão do PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `user_data`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `users_information`
--

CREATE TABLE `users_information` (
  `agua` double DEFAULT NULL,
  `peso` double DEFAULT NULL,
  `altura` double DEFAULT NULL,
  `sono` text DEFAULT NULL,
  `imc` double DEFAULT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Despejando dados para a tabela `users_information`
--

INSERT INTO `users_information` (`agua`, `peso`, `altura`, `sono`, `imc`, `id`) VALUES
(NULL, 10, 34, NULL, NULL, 0),
(20, 120, 100, '', NULL, 2);

-- --------------------------------------------------------

--
-- Estrutura para tabela `users_login`
--

CREATE TABLE `users_login` (
  `email` text DEFAULT NULL,
  `senha` text DEFAULT NULL,
  `id` int(11) NOT NULL,
  `usuario` text DEFAULT NULL,
  `cpf` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Despejando dados para a tabela `users_login`
--

INSERT INTO `users_login` (`email`, `senha`, `id`, `usuario`, `cpf`) VALUES
('teste', 'teste', 2, 'teste', 'teste');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `users_login`
--
ALTER TABLE `users_login`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `users_login`
--
ALTER TABLE `users_login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
