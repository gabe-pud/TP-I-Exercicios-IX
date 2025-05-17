### 1) Explique como a sobrescrita de métodos permite comportamentos diferentes para objetos da mesma hierarquia.

- Quando uma subclasse define um método com as mesmas características de um método da superclasse, esse método é alterado apenas para essa subclasse. Assim, ao chamar o método em um objeto da subclasse, a versão sobrescrita (e não a da superclasse) será executada.

---

### 2) Descreva o mecanismo de sobrecarga de métodos e como ele difere da sobrescrita em termos de polimorfismo.

- A sobrecarga de métodos possibilita criar comportamentos diferentes para métodos de uma mesma classe, com base nas diferenças em seus parâmetros. Isso é diferente da sobrescrita, que altera comportamentos de métodos herdados de uma superclasse utilizando a mesma assinatura.

---

### 3) Discuta como a sobrecarga de construtores facilita a criação de objetos com diferentes conjuntos de informações, permitindo flexibilidade na instanciação de objetos.

- A sobrecarga de construtores possibilita a inicialização de objetos com apenas as informações necessárias para uma implementação específica. Isso, além de facilitar a criação de códigos mais genéricos e evitar chamadas desnecessárias de getters e setters, também contribui para um código mais limpo e legível.

---

### 4) Como o polimorfismo por sobrescrita facilita a implementação de diferentes formas de pagamento dentro de um sistema sem alterar o código da classe base?

- Usando a sobrescrita de métodos, diferentes formas de pagamento podem implementar suas próprias regras de negócio separadamente, eliminando a necessidade de criar métodos distintos para cada forma. Isso resulta em um código mais coeso e de fácil manutenção.

---

### 5) Explique como a sobrecarga de métodos permite implementar várias versões do método converter(), mesmo com diferentes tipos de dados e funcionalidades.

- Como cada implementação possui parâmetros de tipos diferentes, ao chamar o método com um parâmetro específico, entende-se que essa chamada se refere à versão do método com o parâmetro correspondente. Assim, não há conflitos entre essas implementações.
