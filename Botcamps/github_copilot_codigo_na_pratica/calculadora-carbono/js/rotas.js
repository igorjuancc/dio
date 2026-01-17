// javascript
const rotas = [
  { origem: 'São Paulo', destino: 'Rio de Janeiro', distancia: 430 },
  { origem: 'São Paulo', destino: 'Belo Horizonte', distancia: 586 },
  { origem: 'São Paulo', destino: 'Curitiba', distancia: 408 },
  { origem: 'São Paulo', destino: 'Porto Alegre', distancia: 1126 },
  { origem: 'São Paulo', destino: 'Brasília', distancia: 1010 },
  { origem: 'Rio de Janeiro', destino: 'Belo Horizonte', distancia: 440 },
  { origem: 'Rio de Janeiro', destino: 'Vitória', distancia: 525 },
  { origem: 'Rio de Janeiro', destino: 'Salvador', distancia: 1620 },
  { origem: 'Belo Horizonte', destino: 'Brasília', distancia: 725 },
  { origem: 'Belo Horizonte', destino: 'Vitória', distancia: 515 },
  { origem: 'Brasília', destino: 'Goiânia', distancia: 210 },
  { origem: 'Brasília', destino: 'Cuiabá', distancia: 1400 },
  { origem: 'Curitiba', destino: 'Florianópolis', distancia: 300 },
  { origem: 'Curitiba', destino: 'Porto Alegre', distancia: 700 },
  { origem: 'Porto Alegre', destino: 'Florianópolis', distancia: 700 },
  { origem: 'Salvador', destino: 'Recife', distancia: 800 },
  { origem: 'Recife', destino: 'Fortaleza', distancia: 810 },
  { origem: 'Fortaleza', destino: 'Natal', distancia: 540 },
  { origem: 'Natal', destino: 'João Pessoa', distancia: 175 },
  { origem: 'João Pessoa', destino: 'Maceió', distancia: 260 },
  { origem: 'Maceió', destino: 'Aracaju', distancia: 300 },
  { origem: 'Aracaju', destino: 'Salvador', distancia: 350 },
  { origem: 'Belém', destino: 'Manaus', distancia: 1700 },
  { origem: 'Manaus', destino: 'Boa Vista', distancia: 740 },
  { origem: 'Belém', destino: 'Macapá', distancia: 460 },
  { origem: 'Macapá', destino: 'São Luís', distancia: 650 },
  { origem: 'São Luís', destino: 'Teresina', distancia: 430 },
  { origem: 'Teresina', destino: 'Fortaleza', distancia: 520 },
  { origem: 'Goiânia', destino: 'Cuiabá', distancia: 880 },
  { origem: 'Cuiabá', destino: 'Campo Grande', distancia: 850 },
  { origem: 'Campo Grande', destino: 'Goiânia', distancia: 960 },
  { origem: 'Uberlândia', destino: 'Ribeirão Preto', distancia: 320 },
  { origem: 'Campinas', destino: 'Ribeirão Preto', distancia: 250 },
  { origem: 'Campinas', destino: 'Santos', distancia: 95 },
  { origem: 'Santos', destino: 'São José dos Campos', distancia: 120 },
  { origem: 'São José dos Campos', destino: 'Taubaté', distancia: 40 },
  { origem: 'Taubaté', destino: 'Bauru', distancia: 240 },
  { origem: 'Bauru', destino: 'Marília', distancia: 150 },
  { origem: 'Marília', destino: 'Presidente Prudente', distancia: 220 },
  { origem: 'Joinville', destino: 'Blumenau', distancia: 100 },
  { origem: 'Blumenau', destino: 'Itajaí', distancia: 60 },
  { origem: 'Joinville', destino: 'Londrina', distancia: 520 },
  { origem: 'Londrina', destino: 'Maringá', distancia: 100 },
  { origem: 'Pelotas', destino: 'Caxias do Sul', distancia: 360 },
  { origem: 'Caxias do Sul', destino: 'Porto Alegre', distancia: 130 },
  { origem: 'Juiz de Fora', destino: 'Belo Horizonte', distancia: 260 },
  { origem: 'Juiz de Fora', destino: 'Rio de Janeiro', distancia: 185 },
  { origem: 'Montes Claros', destino: 'Belo Horizonte', distancia: 422 }
];

// Retorna cópia da lista de rotas
function getRotas() {
  return rotas.slice();
}

// Retorna lista única e ordenada de cidades (origem + destino)
function getCidadesUnicasOrdenadas() {
  const set = new Set();
  rotas.forEach(r => {
    set.add(r.origem);
    set.add(r.destino);
  });
  return Array.from(set).sort((a, b) => a.localeCompare(b, 'pt-BR'));
}

// Busca distância entre dois pontos, independente da ordem (case-insensitive).
// Retorna número (km) ou null se não encontrado.
function distanciaEntre(p1, p2) {
  if (!p1 || !p2) return null;
  const norm = s => s.trim().toLowerCase();
  const a = norm(p1);
  const b = norm(p2);
  const found = rotas.find(r => {
    const o = norm(r.origem);
    const d = norm(r.destino);
    return (o === a && d === b) || (o === b && d === a);
  });
  return found ? found.distancia : null;
}