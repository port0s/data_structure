package buscaBinaria

import "testing"

/* go test -v --bench . --benchmem */
/*
 * REFERÊNCIA
 * [Teste com Múltipls retornos](https://stackoverflow.com/questions/34323408/table-tests-for-multi-return-value-function)
 */

func TestRespostaBuscaBinaria(t *testing.T) {
	expected_0, expected_1 := "Número %v encontrado :)\n", 5
	observed_0, observed_1 := RespostaBuscaBinaria()

  if observed_0 != expected_0 && observed_1 != expected_1 {
		t.Fatalf("Teste falhou")
	}

  func BenchmarkRespostaBuscaSequencial(b *testing.B) {
    for i := 0; i < b.N; i++ {
      RespostaBuscaBinaria()
    }
  }
}
