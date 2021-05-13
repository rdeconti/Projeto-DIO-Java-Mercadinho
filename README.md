:spiral_calendar: Atualizado em 12 de março de 2021 :heart:

<img align="right" alt="GIF" height="160px" src="https://github.com/rdeconti/rdeconti-resources/blob/main/Digital%20Innovation%20One%20-%20Logotipo.png" />

# Projeto Digital Innovation One
# Projeto em JAVA criado para controlar um mercadinho
- Este projeto foi proposto pela Digital Innovation One - Link do código original: ??????????????
- Professor: Thiago Campos de Oliveira
- Aula: https://web.digitalinnovation.one/lab/arquitetura-essencial-de-api-com-net/learning/e4600dc8-0e68-45cd-82e6-c048c0946f7c

# Descrição
Sua missão neste lab será construir uma arquitetura base para uma aplicação .net do zero.

# Detalhes da aula
- Foi criado o projeto com Visual Studio Code 2019
- Foi utilizada a opção ASP.NET Core Web Application
- Foi utilizada a opção "Configure fo HTTPS" e "Enable open API Support" 
- Swagger será utilizado para documentar a API
- Foi criado o versionamento de rota (criada a versão V1 - se futuramente alterar algo na aplicação criar a rota V2 para não afetar a produção)
- Foram utilizadas tasks assícronas
- As rotas estão criadas no JogosController.cs (verbos HTTP)
- Pastas Input e View Model: são as DTOs (objeto de Transferência de Dados, é um padrão de projeto de software usado para transferir dados 
entre subsistemas de um software. DTOs são frequentemente usados em conjunção com objetos de acesso a dados para obter dados de um banco de dados.)
- No Input Model estão as regras para a entrada de dados
- Na pasta service está codificada a Interface (contrato para injeção de dependência)
- Também devem ser tratados os STATUS do HTTP para garantir o correto funcionamento da aplicação
- ENTITY é uma cópia da VIEW MODEL (getters and setters)
- Repositório do DISPOSIBLE vai destruir as conexões para liberar todos os recursos
- Foram criadas EXCEPTIONS para tratar os erros de processo
- Regra de código: manter curto e simples!!!! Quanto mais o código estiver afastado da esquerda mais complexo ele vai ser!!!!!
- REPOSITORY: Obtém e atualiza dados
- na STARTUP estão as regras para criar as instâncias
- Utilizando o REPOSITORY foi alterado de MOCK para SQL (a utilização do REPOSITORY é exatamente para ter esta flexibilidade) - Utilizando o SqlConnection - Alterar STARTUP para ler o SQL
- Foram incluídas linhas com documentação a ser gerada pelo SWAGGER
- Foram criadas exceções no MIIDLEWARE e o middeleware foi registrado no Startup

## Slide explicativo de como funciona a solução
<img src="https://github.com/rdeconti/Projeto-DIO-.Net-Catalogo-De-Jogos/blob/main/Screens/como%20funcionam%20requisi%C3%A7%C3%B5es%20web.jpg" />

# Testes executados (utilizando IDE Visual Studio 2019)

## Tela inicial do SWAGGER
<img src="https://github.com/rdeconti/Projeto-DIO-.Net-Catalogo-De-Jogos/blob/main/Screens/tela-inicial.jpg" />

## Post com erro
<img src="https://github.com/rdeconti/Projeto-DIO-.Net-Catalogo-De-Jogos/blob/main/Screens/tela-post-com-erro-preco.jpg" />

## Post com sucesso
<img src="https://github.com/rdeconti/Projeto-DIO-.Net-Catalogo-De-Jogos/blob/main/Screens/tela-post-com-sucesso.jpg" />

## Lista com erros
<img src="https://github.com/rdeconti/Projeto-DIO-.Net-Catalogo-De-Jogos/blob/main/Screens/tela-get-all-records.jpg" />
