package buscaBinaria

func buscaBinaria(array_de_numeros []int, numero_buscado int) (string, int) {
	l := 0
	r := len(array_de_numeros) - 1

	for l <= r {
		meio := (l + r) / 2

		if array_de_numeros[meio] == numero_buscado {
			return "Busca Binária: número %v encontrado :)\n", numero_buscado
		}

		if array_de_numeros[meio] < numero_buscado {
			l = meio + 1
		} else {
			r = meio - 1
		}
	}

	return "Busca Binária: número %v não encontrado :(\n", numero_buscado
}

func RespostaBuscaBinaria() (string, int) {
	array_de_numeros := []int{1, 2, 3, 4, 5}
	numero_buscado := 5
	return buscaBinaria(array_de_numeros, numero_buscado)
}

/*
 * REFERÊNCIAS
 *		[Exemplo de Busca Binária](https://blog.geekhunter.com.br/golang/#:~:text=Busca binária com testes unitários para Golang,-O algoritmo de&text=Ao declarar variáveis com um,o valor do lado direito.)
 */
