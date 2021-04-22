void merge(int vetor[], int inicio, int meio, int fim)
    {
        int n1 = meio - inicio + 1;
        int n2 = fim - meio;
  
        int inicio[] = new int [n1];
        int fim[] = new int [n2];
  
        for (int i=0; i<n1; ++i)
            inicio[i] = vetor[l + i];
        for (int j=0; j<n2; ++j)
            fim[j] = vetor[m + 1+ j];
  
  
       
        int i = 0, j = 0;
  
        int k = inicio;
        while (i < n1 && j < n2)
        {
            if (inicio[i] <= fim[j])
            {
                vetor[k] = inicio[i];
                i++;
            }
            else
            {
                vetor[k] = fim[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            vetor[k] = inicio[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            vetor[k] = fim[j];
            j++;
            k++;
        }
    }


    void sort(int vetor[], int inicio, int fim)
    {
        if (inicio < fim)
        {
            int meio = (inicio+fim)/2;
            sort(vetor, inicio, fim);
            sort(vetor , meio+1, fim)
            merge(vetor, inicio, meio, fim);
        }
    }

    static void printaVetor(int vetor[])
    {
        int n = vetor.length;
        for (int i=0; i<n; ++i)
            System.out.print(vetor[i] + " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        int vetor[] = {12, 11, 13, 5, 6, 7};
  
        System.out.println("Given Array");
        printaVetor(vetor);
  
        MergeSort ob = new MergeSort();
        ob.sort(vetor, 0, vetor.length-1);
  
        System.out.println("\nSorted array");
        printaVetor(vetor);
    }
}

