walmart-krusty
==============

Script de Banco no arquivo script.txt no projeto KrustyWS

Estrutura de projetos:
- KrustyClient : entidades a serem compartilhadas por todos os módulos
- KrustyWS : implementação dos WebServices
- KrustyFront : Front End

Tecnologias:

- KrustyWS: Spring, Resteasy, Jackson, JPA
- KrustyFront: Servelet + JSP + Jquery

Arquitetura:
- KrustyWS: Foi feita uma divisão em 3 camadas:
    1. Repository: onde o acesso ao banco de dados é feito
    2. Service: camada de regras de negocio
    3. WebService: disponibilização dos serviços

Testes
- Unitários feitos com Junit

Configuração do banco
- Arquivo persistence.xml no projeto KrustyWS

===== CONSIDERAÇÕES ====

1. Não foram implementados todos os requisitos, mas a estrutura do projeto com um de exemplo
2. O ideal de segurança é implementar o SSL. O Resteasy dá suporte. Desta formas os WS não ficam disponíveis a todos. Pode-se implementar autenticação por usuario e senha tambem.
3. Optei por usar Json, por isso a escolha do Jackson. O Resteasy é possui suporte o que facilita.
4. Utilizei Jquery para utilizar a facilidade nas chamadas Ajax.
5. O projeto de front esta bem simples. Precisaria ser repensado para uma arquitetura mais robusta. Pode-se optar por responsive design assim atenderia questões de mobile.
