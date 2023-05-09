public class ExemploSelectionSort {
    public static void selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int indiceMenor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            int temp = vetor[indiceMenor];
            vetor[indiceMenor] = vetor[i];
            vetor[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] vetor = {5, 3, 1, 4, 2};
        selectionSort(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
