#language:pt

  Funcionalidade: Seguro de automovel

  @Cot
  Cenario: Cotação de seguro

  Dado que entro no site para realizar a cotação do seguro
  Quando preencho o formulario da aba “Enter Vehicle Data”
  E preencho o formulario da aba Enter Insurant Data
  E preencho o formulario da aba Enter Product Data
  E preencho o formulario da aba Select Price Option
  E preencho o formulario da aba Send Quote
  Entao verifico a mensagem “Sending e-mail success!” na tela
