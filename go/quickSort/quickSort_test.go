package quickSort

import "testing"

/* go test -v --bench . --benchmem */
/*
 * REFERÊNCIA
 * [Teste com Múltipls retornos](https://stackoverflow.com/questions/34323408/table-tests-for-multi-return-value-function)
 */

func TestRespostaQuickSort(t *testing.T) {
	expected_0, expected_1 := "Array ordenado: %d\n", []int{1, 2, 3, 6, 9}
	observed_0, observed_1 := RespostaQuickSort()

	if observed_0 != expected_0 {
		t.Fatalf("Teste falhou")
	}

    for index, value := range observed_1 {
        if value != expected_1[index] {
            t.Fatalf("Teste falhou")
        }
    }


}

func BenchmarkRespostaQuickSort(b *testing.B) {
	for i := 0; i < b.N; i++ {
		RespostaQuickSort()
	}
}
