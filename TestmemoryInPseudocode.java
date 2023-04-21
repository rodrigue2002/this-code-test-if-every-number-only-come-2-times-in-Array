public class TestmemoryInPseudocode {
    
    public static void main(String[] args) {
        int[] array = {1,2,1,2};
        int[] array2 = {1,2,1,2,1};
        int[] array3 = {1,2,3,1,2,3};
        System.out.println(verif(array));
        System.out.println(verif(array2));
        System.out.println(verif(array3));
    }
    
     public static boolean verif(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array2[i]++;
                }
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] != 2) {
                return false;
            }
        }
        return true;
    }
}