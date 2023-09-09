package quickSort

func show(array []int){
    for _, value := range array {
        println("%d ", value)
    }
}

func swap(array []int, index1 int, index2 int) {
    temp := array[index1]
    array[index1] = array[index2]
    array[index2] = temp
}

func quickSort(array []int, low_index int, high_index int) (string, []int) {
    if (low_index >= high_index) {
        return "Array ordenado: %d\n", array
    }

    pivot := array[high_index]

    left_pointer := low_index
    right_pointer := high_index

    for left_pointer < right_pointer {
        for array[left_pointer] <= pivot && left_pointer < right_pointer {
            left_pointer++
        }

        for array[right_pointer] >= pivot && left_pointer < right_pointer {
            right_pointer--
        }

        swap(array, left_pointer, right_pointer)
    }

    swap(array, left_pointer, high_index);
    quickSort(array, low_index, left_pointer - 1);
    quickSort(array, left_pointer + 1, high_index);

    // show(array) /* Ordened array */

    return "Array ordenado: %d\n", array
}


func RespostaQuickSort() (string, []int) {
	array := []int{6, 3, 9, 2, 1}
    low_index := 0
    high_index := len(array) - 1

    // show(array)
    // _, array = quickSort(array, low_index, high_index)

    /* return "Array ordenado: %d", array */

    return quickSort(array, low_index, high_index)
}
