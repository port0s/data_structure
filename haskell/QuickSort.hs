module QuickSort where


-- Uso da função no ghci (depois de ter importado o módulo "QuickSort") -> quickSort [4, 3, 6, 1]
quickSort :: [Int] -> [Int]
quickSort   []   = []
quickSort (x:xs) = quickSort esq_x ++ [x] ++ quickSort dir_x
                 where
                     esq_x = [y | y <- xs, y < x]
                     dir_x = [y | y <- xs, y >= x]

