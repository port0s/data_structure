fn retorna_busca_binaria<'a>(
    array_numeros: &'a [i32],
    numero_buscado: &'a i32,
) -> (&'static str, &'a i32) {
    let mut inicio = 0;
    let mut fim = array_numeros.len() - 1;

    while inicio <= fim {
        let meio = (inicio + fim) / 2;

        if array_numeros[meio] == *numero_buscado {
            return ("Número encontrado :)", &numero_buscado);
        }

        if array_numeros[meio] < *numero_buscado {
            inicio = meio + 1
        } else {
            fim = meio - 1
        }
    }
    ("Número não encontrado :(", &numero_buscado)
}

pub fn busca_binaria() -> () {
    let array_numeros = [1, 2, 3, 4, 5];
    let numero_buscado = 5;
    let (resposta, _) = retorna_busca_binaria(&array_numeros, &numero_buscado);
    println!("{} {}", resposta, &numero_buscado);
    ()
}
