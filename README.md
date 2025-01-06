# Projeto de Exchange de Criptomoedas

## Descrição

Este é um projeto em Java que implementa uma plataforma de exchange de criptomoedas com interface gráfica baseada em JFrames. O sistema permite aos usuários realizar operações como cadastro, login, compra e venda de criptomoedas, depósitos em reais, saques e consulta de preços de criptomoedas em tempo real. Todas as operações são gerenciadas e armazenadas em um banco de dados PostgreSQL.

## Funcionalidades

- **Login**: Acesso ao sistema com credenciais cadastradas.
- **Cadastro de Usuário**: Criação de uma conta no sistema.
- **Mudança de Senha**: Permite ao usuário alterar sua senha cadastrada.
- **Depósito de Reais**: Possibilidade de adicionar saldo em reais na conta.
- **Compra de Criptomoedas**: Conversão de reais em quatro tipos de criptomoedas.
- **Venda de Criptomoedas**: Conversão de criptomoedas em reais.
- **Saque de Reais**: Retirada de saldo em reais para fora da conta.
- **Consulta de Preços de Criptomoedas**: Exibição do preço atualizado das quatro criptomoedas suportadas.
- **Histórico de Operações**: Exibe todas as transações de compra, venda e depósito realizadas pelo usuário.

## Tecnologias Utilizadas

- **Linguagem de Programação**: Java
- **Interface Gráfica**: JFrames
- **Banco de Dados**: PostgreSQL
- **IDE**: NetBeans

## Estrutura do Sistema

O sistema é dividido em várias janelas (JFrames), cada uma com uma funcionalidade específica:

- **Tela de Login**: Autenticação do usuário.
- **Tela de Cadastro**: Registro de novos usuários.
- **Tela de Mudança de Senha**: Permite redefinir a senha do usuário.
- **Menu Principal**: Após autenticação, o usuário pode navegar para:
  - Realizar depósitos.
  - Comprar criptomoedas.
  - Vender criptomoedas.
  - Sacar reais.
  - Consultar preços de criptomoedas.
  - Verificar o histórico de operações.
