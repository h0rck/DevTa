# DevTa - Gerenciador de Desenvolvimento

Um aplicativo desktop Java/JavaFX para ajudar desenvolvedores a organizar tarefas e snippets de código.

## Funcionalidades

- **Gerenciamento de Tarefas**
  - Criar novas tarefas
  - Definir prazos
  - Marcar como concluído
  - Organizar prioridades

- **Biblioteca de Snippets**
  - Salvar trechos de código
  - Categorizar por linguagem
  - Busca rápida
  - Exportar snippets

## Requisitos

- Java 21 ou superior
- Maven
- JavaFX 21
- SQLite

## Como executar

1. Clone o repositório
2. Entre na pasta do projeto
3. Execute:
```bash
mvn clean javafx:run
```

## Estrutura do Projeto

```
org.example/
├── controllers/     # Controladores da aplicação
├── database/       # Gerenciamento do banco de dados
├── models/         # Classes de modelo
└── devta/          # Classes principais
```

## Tecnologias Utilizadas

- Java 21
- JavaFX - Interface gráfica
- ControlsFX - Componentes extras de UI
- SQLite - Banco de dados local
- Maven - Gerenciamento de dependências

## Próximas Atualizações

- [ ] Sistema de backup
- [ ] Temas claro/escuro
- [ ] Exportação de dados
- [ ] Integração com GitHub
```