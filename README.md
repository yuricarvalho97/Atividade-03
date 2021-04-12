# Repositório para a atividade 03 de Padrões de Projeto - Adapter

Intenção
    <p>O Adapter é um padrão de projeto estrutural com a intenção de permitir que objetos com interfaces compatíveis colaborem entre si.</p>
    
Motivação
    <p>A motivação deste padrão é que quando uma classe que poderia ser reaproveitada não é reutilizada justamente pelo fato de sua interface não corresponder à outra interface específica que é requerida por uma aplicação.</p>
    
Exemplo de uso
    <p>Supondo que um desenvolvedor está criando uma aplicação para monitorar as ações da bolsa de valores. A aplicação baixa os dados das ações de várias fontes no formato XML e então faz o demonstrativo desses dados em gráficos e tabelas para os usuários.</p>
    <p>Em determinado momento, o desenvolvedor decide melhorar a aplicação e integração com uma biblioteca de análises disponível na internet. Entretanto, a biblioteca só trabalha com dados no formato JSON.</p> 
    <p>Para não correr o risco de quebrar a aplicação, alterando o código da biblioteca para funcionar com XML, é possível criar um adaptador para transformar os dados XML em JSON. O código da aplicação irá se comunicar com a biblioteca por meio desse adaptador, traduzindo os XML para JSON e chamando os métodos apropriados da biblioteca de forma encoberta.</p>

![Diagrama Adaptador](https://user-images.githubusercontent.com/75703602/114455547-46d85a00-9bb2-11eb-81e5-28e3f72080c5.png)

Projeto e implementação em um cenário
    <p>O projeto implementado é um que usa o padrão adaptar para que o usuário possa usar "tomadas" com interfaces que seriam imcompatíveis entre si
    se não fosse pelo uso do padrão. </p>
