package ex

import "testing"

/* go test -v --bench . --benchmem */

func TestEx(t *testing.T) {
	expected := "Olá, mundo!"
	if observed := Ex(); observed != expected {
		t.Fatalf("Ex() = %v; want = %v", observed, expected)
	}
}

func BenchmarkEx(b *testing.B) {
	for i := 0; i < b.N; i++ {
		Ex()
	}
}
