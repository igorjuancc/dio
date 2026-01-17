const UI = {

  mostrarResultados() {
    document.getElementById("resultados").hidden = false;
    document.getElementById("comparacao").hidden = false;
    document.getElementById("creditos-co2").hidden = false;
  },

  /* =========================
     RESULTADO BÁSICO
     ========================= */
  preencherResultadoBasico({ origem, destino, distancia, meio, emissao }) {
    document.getElementById("res-origem").textContent = origem;
    document.getElementById("res-destino").textContent = destino;
    document.getElementById("res-distancia").textContent = distancia;
    document.getElementById("res-meio").textContent =
      CONFIG.modosTransporte[meio].label;
    document.getElementById("res-emissao").textContent =
      emissao.toFixed(2);
  },

  /* =========================
     COMPARAÇÃO ENTRE MODOS
     ========================= */
  preencherComparacao(lista) {
    const corpo = document.getElementById("comparacao-corpo");
    corpo.innerHTML = "";

    lista.forEach(item => {
      const tr = document.createElement("tr");

      tr.innerHTML = `
        <td>${CONFIG.modosTransporte[item.modo].label}</td>
        <td>${item.emissaoKgCO2.toFixed(2)}</td>
        <td>${item.emissaoKgCO2 === 0 ? "Sem emissão direta" : "—"}</td>
      `;

      corpo.appendChild(tr);
    });
  },

  /* =========================
     CRÉDITOS DE CARBONO
     ========================= */
  preencherCreditos(emissaoKg) {
    if (!emissaoKg || emissaoKg <= 0) {
      document.getElementById("cred-emissao").textContent = "0,0000";
      document.getElementById("cred-quantidade").textContent = "0";
      document.getElementById("cred-valor").textContent = "R$ 0,00";
      document.getElementById("cred-faixa").textContent = "R$ 0,00 - R$ 0,00";
      return;
    }

    // Créditos
    const creditos =
      CONFIG.creditosCarbono.converterKgParaCreditos(emissaoKg);

    // Valor estimado
    const valor =
      CONFIG.creditosCarbono.calcularValor(emissaoKg);

    // Faixa
    const faixa =
      CONFIG.creditosCarbono.calcularFaixaValor(valor);

    // UI
    document.getElementById("cred-emissao").textContent =
      creditos.toFixed(4);

    document.getElementById("cred-quantidade").textContent =
      "1 crédito = 1.000 kg CO₂";

    document.getElementById("cred-valor").textContent =
      `R$ ${valor.toFixed(2)}`;

    document.getElementById("cred-faixa").textContent =
      `R$ ${faixa.min.toFixed(2)} - R$ ${faixa.max.toFixed(2)}`;
  }
};
