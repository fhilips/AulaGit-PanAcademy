<h1 align="center">Atividade MongoDB</h1>

Você deve criar um banco de dados novo (database) e uma coleção com um nome
pertinente, de acordo com os dados e tema que você escolher. Os seguintes comandos
devem ser feitos e entregues:

- Inserção de documentos
- Atualização de documentos
- Exclusão de documentos
- Consulta com projeção
- Consulta utilizando combinação entre os seletores
- Consulta paginada e ordenada (utilizar ignorar , limitar e classificar

---

<h3 align="left">Resolução:</h3>
Foi criado uma coleção para gerenciamento de contas bancarias.<br> 
Cada conta possuí inicialmente os seguintes atributos:
  - nome
  - CPF
  - digito
  - numeroConta
  - dataCriacao
  - dataAtualizacao.<br> 
Cada conta possuí um saldo, que contém os seguintes atributos: valorTotal, dataAtualizacao.<br> 
Cada saldo possuí debitos, que possuem os seguintes atributos: valor e dataCriacao.
<br><br>
<details>
  <summary>Inserção dos documentos</summary>
  <br>
  Documentos inseridos
  <br><br>
  <pre>
  /* 1 */
  {    
      "nome" : "Filipe dos Santos",
      "CPF" : "415.674.365-9",
      "digito" : "2",
      "numeroConta" : "1234567",
      "dataCriacao" : ISODate("2021-07-12T10:00:20.000Z"),
      "dataAtualizacao" : ISODate("2021-07-12T10:00:20.000Z"),
      "saldo" : {
          "valorTotal" : 5000.0,
          "dataAtualizacao" : ISODate("2021-07-12T10:00:20.000Z"),
          "debito" : {}
      }
  }
  /* 2 */
  {
      "nome" : "Charles Auguso",
      "CPF" : "369.684.398-9",
      "digito" : "3",
      "numeroConta" : "7654321",
      "dataCriacao" : ISODate("2021-05-10T10:00:20.000Z"),
      "dataAtualizacao" : ISODate("2021-05-10T10:00:20.000Z"),
      "saldo" : {
          "valorTotal" : 5000.0,
          "dataAtualizacao" : ISODate("2021-05-16T10:00:20.000Z"),
          "debito" : {
              "valor" : 1000.0,
              "dataCriacao" : ISODate("2021-05-10T10:00:20.000Z")
          }
      }
  }
  /* 3 */
  {      
      "nome" : "Malaquias Geraldo",
      "CPF" : "152.323.111-9",
      "digito" : "8",
      "numeroConta" : "1564875",
      "dataCriacao" : ISODate("2021-04-10T10:00:20.000Z"),
      "dataAtualizacao" : ISODate("2021-04-10T10:00:20.000Z"),
      "saldo" : {
          "valorTotal" : 20000.0,
          "dataAtualizacao" : ISODate("2021-04-18T10:00:20.000Z"),
          "debito" : [ 
              {
                  "valor" : 1000.0,
                  "dataCriacao" : ISODate("2021-04-18T10:00:20.000Z")
              }, 
              {
                  "valor" : 500.0,
                  "dataCriacao" : ISODate("2021-04-19T10:00:20.000Z")
              }
          ]
      }
  }
  /* 4 */
  {      
      "nome" : "Andreia gomes",
      "CPF" : "233.311.133-4",
      "digito" : "7",
      "numeroConta" : "5687899",
      "dataCriacao" : ISODate("2021-08-10T10:00:20.000Z"),
      "dataAtualizacao" : ISODate("2021-08-15T10:00:20.000Z"),
      "saldo" : {
          "valorTotal" : 15000.0,
          "dataAtualizacao" : ISODate("2021-08-12T10:00:20.000Z"),
          "debito" : [ 
              {
                  "valor" : 60.0,
                  "dataCriacao" : ISODate("2021-08-12T10:00:20.000Z")
              }, 
              {
                  "valor" : 400.0,
                  "dataCriacao" : ISODate("2021-08-15T10:00:20.000Z")
              }
          ]
      }
  }
  </pre>
</details>

<details>
  <summary>Atualização de documentos por nome</summary> 
  <pre>
  db.getCollection('Conta').update(
    { "nome" : "Charles Auguso" },
    { $set: { "nome" : "Charles Augusto" } },
    { "multi" : false, "upsert" : false }
  );
  </pre>
</details>

<details>
  <summary>Inserir um novo campo em todos os documents</summary>
  <pre>
  db.getCollection('Conta').update(
    { }, 
    { $set: { "DataNascimento" : "" } },
    { "multi" : true, "upsert" : false }
  );
  </pre>
</details>

<details>
  <summary>Exclusão de um documento por id</summary>
  <pre>
  db.getCollection('Conta').remove({ "_id" : ObjectId("6181e82ce17a50870a46814a") });
  </pre>
</details>

<details>
  <summary>Projeção do valorTotal de cada saldo sem o id</summary>
  <pre>
  db.getCollection('Conta').find({}, {'saldo.valorTotal' : 1, _id : 0})  
  </pre>
</details>

<details>
  <summary>Projeção de todos as contas criadas antes de 2021-05-15</summary>
  <pre>
  db.getCollection('Conta').find(
    { "dataCriacao" : { $lt : ISODate("2021-05-15T10:00:20.000Z") } })
  </pre>
</details>

<details>
  <summary>Projeção de todas as contas com valor total do saldo menor do que 10000.0 e 
  com debitos com valor maiores de 600.0</summary>
  <pre>
  db.getCollection('Conta').find(
    {'saldo.debito.valor' : {$gt : 600.0}, 'saldo.valorTotal' : {$lte : 10000.0}})
  </pre>
</details>

<details>
  <summary>Documentos ordenados pelo maior valor total do saldo</summary>
  <pre>
  db.getCollection('Conta').find().sort({'saldo.valorTotal': -1})
  </pre>
</details>
