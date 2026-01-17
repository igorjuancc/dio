const Calculadora = {

    calcularEmissao(modo, distancia) {
        if (!modo) return 0;

        const km = Number(distancia);
        if (isNaN(km) || km <= 0) return 0;

        const fator = CONFIG.fatoresEmissao[modo];

        // fator 0 (bicicleta) é válido
        if (fator === undefined) return 0;

        return km * fator;
    },

    compararModos(distancia) {
        const resultados = [];

        for (const modo in CONFIG.fatoresEmissao) {
            const emissao = this.calcularEmissao(modo, distancia);

            resultados.push({
                modo,
                emissaoKgCO2: emissao
            });
        }

        return resultados;
    },

    converterKgParaCreditos(kg) {
        if (!kg || kg <= 0) return 0;
        return CONFIG.creditosCarbono.converterKgParaCreditos(kg);
    },

    estimarPreco(kg) {
        if (!kg || kg <= 0) return 0;
        return CONFIG.creditosCarbono.calcularValor(kg);
    }
};
