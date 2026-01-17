const CONFIG = {

  /* =========================
     FATORES DE EMISSÃO (kg CO₂ / km)
     ========================= */
  fatoresEmissao: {
    bicicleta: 0,
    carro: 0.12,
    onibus: 0.089,
    caminhao: 0.96
  },

  /* =========================
     MODOS DE TRANSPORTE (UI)
     ========================= */
  modosTransporte: {
    bicicleta: { label: "Bicicleta", icone: "🚲", cor: "#4CAF50" },
    carro:      { label: "Carro",      icone: "🚗", cor: "#2196F3" },
    onibus:     { label: "Ônibus",     icone: "🚌", cor: "#FF9800" },
    caminhao:   { label: "Caminhão",   icone: "🚚", cor: "#9C27B0" }
  },

  /* =========================
     CRÉDITOS DE CARBONO
     ========================= */
  creditosCarbono: {
    kgPorCredito: 1000,        // 1 crédito = 1.000 kg CO₂
    precoPorCredito: 100,     // R$ por crédito (ajustável)

    converterKgParaCreditos(kgCO2) {
      if (!kgCO2 || kgCO2 <= 0) return 0;
      return kgCO2 / this.kgPorCredito;
    },

    calcularValor(kgCO2) {
      const creditos = this.converterKgParaCreditos(kgCO2);
      return creditos * this.precoPorCredito;
    },

    calcularFaixaValor(valor) {
      return {
        min: valor * 0.5,
        max: valor * 1.5
      };
    }
  },

  /* =========================
     UTILITÁRIOS
     ========================= */
  util: {

    popularDatalistCidades(id, cidades) {
      const datalist = document.getElementById(id);
      if (!datalist) return;

      datalist.innerHTML = "";
      cidades.forEach(cidade => {
        const option = document.createElement("option");
        option.value = cidade;
        datalist.appendChild(option);
      });
    },

    configurarPreenchimentoAutomaticoDistancia(
      origemInput,
      destinoInput,
      distanciaInput
    ) {
      const tentarPreencher = () => {
        const d = distanciaEntre(origemInput.value, destinoInput.value);
        if (d !== null) {
          distanciaInput.value = d;
        }
      };

      origemInput.addEventListener("change", tentarPreencher);
      destinoInput.addEventListener("change", tentarPreencher);
    }
  }
};
