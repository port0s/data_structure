package buscaSequencial

func buscaSequencial(vetor_inteiro []int, numero_buscado int) (string, int) {
	for _, numero := range vetor_inteiro {
		if numero == numero_buscado {
			return "Busca Sequencial: número %d encontrado :)\n", numero
		}
	}

	return "Busca Sequencial: número %v não encontrado :(\n", numero_buscado
}

func RespostaBuscaSequencial() (string, int) {
	vetor_inteiro := []int{1, 2, 3, 4, 5}
	numero_buscado := 5
	return buscaSequencial(vetor_inteiro, numero_buscado)
}
