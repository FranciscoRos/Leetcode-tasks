public class Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
    int valorUltimoAgregado =nums[0];
    int posicionUltimaAgregada=0;
    int sumaUnicos=1;
    for (int j = 1; j < nums.length; j++) {
        if(nums[j]!=valorUltimoAgregado){
            nums[posicionUltimaAgregada+1] = nums[j];
            posicionUltimaAgregada++;
            valorUltimoAgregado = nums[j];
            sumaUnicos++;
        }
    }
    return sumaUnicos;
    }
}
