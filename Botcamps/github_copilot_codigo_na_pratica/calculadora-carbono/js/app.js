document.addEventListener("DOMContentLoaded", () => {

  const inputOrigem = document.getElementById("origem");
  const inputDestino = document.getElementById("destino");
  const inputDistancia = document.getElementById("distancia");
  const checkboxManual = document.getElementById("manual-dist");
  const form = document.getElementById("calculadora-form");

  const cidades = getCidadesUnicasOrdenadas();
  CONFIG.util.popularDatalistCidades("lista-cidades", cidades);

  CONFIG.util.configurarPreenchimentoAutomaticoDistancia(
    inputOrigem,
    inputDestino,
    inputDistancia
  );

  checkboxManual.addEventListener("change", () => {
    inputDistancia.disabled = !checkboxManual.checked;
    if (!checkboxManual.checked) inputDistancia.value = "";
  });

  form.addEventListener("submit", event => {
    event.preventDefault();

    const origem = inputOrigem.value;
    const destino = inputDestino.value;
    const distancia = Number(inputDistancia.value);
    const meio = form.meio.value;

    if (!origem || !destino || distancia <= 0) return;

    const emissao = Calculadora.calcularEmissao(meio, distancia);

    UI.preencherResultadoBasico({
      origem,
      destino,
      distancia,
      meio,
      emissao
    });

    UI.preencherComparacao(
      Calculadora.compararModos(distancia)
    );

    UI.preencherCreditos(emissao);
    UI.mostrarResultados();
  });
});
