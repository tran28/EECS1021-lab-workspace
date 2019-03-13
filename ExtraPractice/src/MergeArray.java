
public class MergeArray {

	public static void main(String[] args) {
		int[] seq1 = {};
		int[] seq2 = {2, 6, 11, -7, -80, 0, 2};
		
		int length = seq1.length + seq2.length;
		int[] result = new int[length];
		for(int i = 0; i < seq1.length; i++) {
			result[i] = seq1[i];
		}
		for(int j = seq1.length; j < result.length; j++) {
			result[j] = seq2[j - seq1.length];
		}
		for(int i = 0; i < result.length; i++) {
			for(int j = i + 1; j <  result.length; j++) {
				int tmp = 0;
				if(result[i] > result[j]) {
					tmp = result[i];
					result[i] = result[j];
					result[j] = tmp;
				}
			}
		}
		
	
		
		for(int i = 0; i < result.length; i++){
			System.out.println(result[i]);
		}
	}

}