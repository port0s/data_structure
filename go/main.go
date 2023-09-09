package main

/* go run main.go */

import (
	"fmt"
	"go/buscaBinaria"
	"go/buscaSequencial"
	"go/ex"
    "go/quickSort"
)

func main() {
	fmt.Println(ex.Ex())
	fmt.Printf(buscaSequencial.RespostaBuscaSequencial())
	fmt.Printf(buscaBinaria.RespostaBuscaBinaria())
	fmt.Printf(quickSort.RespostaQuickSort())
}
