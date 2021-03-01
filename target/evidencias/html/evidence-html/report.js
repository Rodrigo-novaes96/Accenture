$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TestsAccenture.feature");
formatter.feature({
  "name": "Seguro de automovel",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Cotação de seguro",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Cot"
    }
  ]
});
formatter.step({
  "name": "que entro no site para realizar a cotação do seguro",
  "keyword": "Dado "
});
formatter.match({
  "location": "TestsAccenture.queEntroNoSiteParaRealizarACotaçãoDoSeguro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o formulario da aba “Enter Vehicle Data”",
  "keyword": "Quando "
});
formatter.match({
  "location": "TestsAccenture.preenchoOFormularioDaAbaEnterVehicleData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o formulario da aba Enter Insurant Data",
  "keyword": "E "
});
formatter.match({
  "location": "TestsAccenture.preenchoOFormularioDaAbaEnterInsurantData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o formulario da aba Enter Product Data",
  "keyword": "E "
});
formatter.match({
  "location": "TestsAccenture.preenchoOFormularioDaAbaEnterProductData()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o formulario da aba Select Price Option",
  "keyword": "E "
});
formatter.match({
  "location": "TestsAccenture.preenchoOFormularioDaAbaSelectPriceOption()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o formulario da aba Send Quote",
  "keyword": "E "
});
formatter.match({
  "location": "TestsAccenture.preenchoOFormularioDaAbaSendQuote()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifico a mensagem “Sending e-mail success!” na tela",
  "keyword": "Entao "
});
formatter.match({
  "location": "TestsAccenture.verificoAMensagemSendingEMailSuccessNaTela()"
});
formatter.result({
  "status": "passed"
});
});