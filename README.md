# 🏥 Trabalho Prático – Sistema de Gerenciamento Hospitalar

### 🎯 Objetivo
Implementar um *Sistema de Gerenciamento Hospitalar* em *Java, aplicando conceitos avançados de **Programação Orientada a Objetos (POO), com foco em **herança, polimorfismo, encapsulamento, persistência de dados* e *regras de negócio mais complexas*.

---
## Descrição do Projeto

Desenvolvimento de um sistema de gerenciamento hospitalar utilizando os conceitos de orientação a objetos (herança, polimorfismo e encapsulamento) e persistência de dados em arquivos.

## Dados do Aluno

- **Nome completo:** Luis Guilherme de Almeida Costa
- **Matrícula:** 251037401
- **Curso:** Engenharias
- **Turma:** T02

---

## Instruções para Compilação e Execução

* A princípio é necessário abrir a pasta do repositório no Intellij contendo todas as pastas, executando pela própria pasta src/Main/Main.java usando o botão run do próprio intellij(ele vai compilar e executar instantâneamente para você).
* Quando você abrir no intellij a pasta de compilação já vai estar pronta ao baixar este arquivo em zip ou fazer o clone, basta procurar pela pasta out, dentro da pasta projetoHospital.

1. **Compilação:**
   * caso queira fazer manualmente(um pouco mais complexo)
   * cd ep1-2025.2-Luis-Guilherme-de-Almeida-Costa/projetoHospital/
   * javac -d out -sourcepath src src/Main/Main.java
   * É extremamente importante que a partir desse momento você copie as pastas data e imagens e cole dentro da pasta out para que o programa funcione.
   * A pasta data está fora da pasta projetoHospital.

3. **Execução:**  
   * cd out
   * java Main.Main

4. **Estrutura de Pastas:**  
   As principais pastas do projeto são:
   * src/Main : nessa pasta nós temos o arquivo Main.java, ele será o arquivo em que você irá executar o programa.
   * src/Controllers : nessa pasta você tem acesso à todas as classes das entidades do hospital.
   * src/TelasInternas : nessa pasta você vai ter acesso à todas as interações do meu sistema, ou seja, todas as páginas principais e a lógica principal do meu programa.
   * src/TelasRelatorios : essa pasta é idêntica à pasta TelasInternas.

3. **Versão do JAVA utilizada:**  
   Java 24.

---

## Vídeo de Demonstração

- https://www.youtube.com/watch?v=haWXgd7vp9U

---

## Prints da Execução

1. Menu Principal:  
   prints/Home.png

2. Cadastro de Médico:  
   prints/Cadastro de Médico.png

3. Cadastro de Pacientes:  
   prints/Cadastro de Pacientes.png

4. Cadastro de Planos:
   prints/Cadastro de Planos de Saúde.png

5. Administração da Internação:
   prints/Administração da Internação.png

6. Administração das Consultas:
   prints/Administração das Consultas.png

7. Agendamento de Consultas:
   prints/Agendamento de Consultas.png

8. Estatística das Consultas:
   prints/Estatística das Consultas.png

9. Histórico Médicos:
    prints/Histórico Médicos.png

10. Historico Pacientes:
    prints/Historico Pacientes.png

11. Internação dos pacientes:
    prints/Internação dos pacientes.png
    
---

---

## Observações (Extras ou Dificuldades)

- O programa foi feito utilizando java swing, a princípio eu só havia utilizado mysql para guardar dados então o csv foi algo novo, tentei utilizar o openCsv mas acabei falhando e recorri ao uso padrão mesmo.

---

## Contato

- failho42@gmail.com

---

### 🖥️ Descrição do Sistema

O sistema deve simular o funcionamento de um hospital com cadastro de *pacientes, médicos, especialidades, consultas e internações*.

1. *Cadastro de Pacientes*
   - Pacientes comuns e pacientes especiais (ex: com plano de saúde).
   - Cada paciente deve ter: nome, CPF, idade, histórico de consultas e internações.

2. *Cadastro de Médicos*
   - Médicos podem ter especialidades (ex: cardiologia, pediatria, ortopedia).
   - Cada médico deve ter: nome, CRM, especialidade, custo da consulta e agenda de horários.

3. *Agendamento de Consultas*
   - Um paciente pode agendar uma consulta com um médico disponível.
   - Consultas devem registrar: paciente, médico, data/hora, local, status (agendada, concluída, cancelada).
   - Pacientes especiais (plano de saúde) podem ter *vantagens*, como desconto.
   - Duas consultas não podem estar agendadas com o mesmo médico na mesma hora, ou no mesmo local e hora

4. *Consultas e Diagnósticos*
   - Ao concluir uma consulta, o médico pode registrar *diagnóstico* e/ou *prescrição de medicamentos*.
   - Cada consulta deve ser registrada no *histórico do paciente*.

5. *Internações*
   - Pacientes podem ser internados.
   - Registrar: paciente, médico responsável, data de entrada, data de saída (se já liberado), quarto e custo da internação.
   - Deve existir controle de *ocupação dos quartos* (não permitir duas internações no mesmo quarto simultaneamente).
   - Internações devem poder ser canceladas, quando isso ocorrer, o sistema deve ser atualizado automaticamente.

6. *Planos de saúde*
   -  Planos de saude podem ser cadastrados.
   -  Cada plano pode oferecer *descontos* para *especializações* diferentes, com possibilidade de descontos variados.
   -  Um paciente que tenha o plano de saúde deve ter o desconto aplicado.
   -  Deve existir a possibilidade de um plano *especial* que torna internação de menos de uma semana de duração gratuita.
   -  Pacientes com 60+ anos de idade devem ter descontos diferentes.

7. *Relatórios*
   - Pacientes cadastrados (com histórico de consultas e internações).
   - Médicos cadastrados (com agenda e número de consultas realizadas).
   - Consultas futuras e passadas (com filtros por paciente, médico ou especialidade).
   - Pacientes internados no momento (com tempo de internação).
   - Estatísticas gerais (ex: médico que mais atendeu, especialidade mais procurada).
   - Quantidade de pessoas em um determinado plano de saúde e quanto aquele plano *economizou* das pessoas que o usam.


---

### ⚙️ Requisitos Técnicos
- O sistema deve ser implementado em *Java*.
- Interface via *terminal (linha de comando)*.
- Os dados devem ser persistidos em *arquivos* (.txt ou .csv).
- Deve existir *menu interativo*, permitindo navegar entre as opções principais.

---

### 📊 Critérios de Avaliação

1. *Modos da Aplicação (1,5)* → Cadastro de pacientes, médicos, planos de saúde, consultas e internações.
2. *Armazenamento em arquivo (1,0)* → Dados persistidos corretamente, leitura e escrita funcional.
3. *Herança (1,0)* → Ex.: Paciente e PacienteEspecial, Consulta e ConsultaEspecial, Médico e subclasses por especialidade.
4. *Polimorfismo (1,0)* → Ex.: regras diferentes para agendamento, preços de consultas.
5. *Encapsulamento (1,0)* → Atributos privados, getters e setters adequados.
6. *Modelagem (1,0)* → Estrutura de classes clara, bem planejada e com relacionamentos consistentes.
7. *Execução (0,5)* → Sistema compila, roda sem erros e possui menus funcionais.
8. *Qualidade do Código (1,0)* → Código limpo, organizado, nomes adequados e boas práticas.
9. *Repositório (1,0)* → Uso adequado de versionamento, commits frequentes com mensagens claras.
10. *README (1,0)* → Vídeo curto (máx. 5 min) demonstrando as funcionalidades + prints de execução + explicação da modelagem.

🔹 *Total = 10 pontos*  
🔹 *Pontuação extra (até 1,5)* → Melhorias relevantes, como:
- Sistema de triagem automática com fila de prioridade.
- Estatísticas avançadas (tempo médio de internação, taxa de ocupação por especialidade).
- Exportação de relatórios em formato .csv ou .pdf.
- Implementação de testes unitários para classes principais.
- Menu visual.
