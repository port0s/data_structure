fn retorna_busca_sequencial<'a>(
    numeros: &'a [i32],
    numero_buscado: &'a i32,
) -> (&'static str, &'a i32) {
    for numero in numeros {
        if numero == numero_buscado {
            return ("Número encotrado: ", &numero_buscado);
        }
    }
    ("Número não encontrado", &numero_buscado)
}

pub fn busca_sequencial() -> () {
    let numeros = [1, 2, 3, 4, 5];
    let numero_buscado = 8;
    let (resposta, _) = retorna_busca_sequencial(&numeros, &numero_buscado);
    println!("{} {}", resposta, &numero_buscado);
    ()
}

/*
 * REFERÊNCIAS
 * [Get Rust values in tuple](https://stackoverflow.com/questions/18479648/does-rust-have-support-for-functions-that-return-multiple-values)
 * [Tuple show value](https://doc.rust-lang.org/rust-by-example/primitives/tuples.html)
 */
