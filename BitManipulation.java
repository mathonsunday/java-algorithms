public class BitManipulation {
	boolean getBit(int num, int i) {
		return ((num & (1 << i)) != 0);
	}

	int setBit(int num, int i) {
		return num | (1 << i);
	}

	int clearBit(int num, int i) {
		int mask = ~(1 << i);
		return num & mask;
	}

	int clearBitsMSBthroughI(int num, int i) {
		int mask = (1 << (i+1)) - 1;
		return num & mask;
	}

	int updateBit(int num, int i, int v) {
		int mask = ~(1 << i);
		return (num & mask) | (v << i);
	}

	public static void main(String[] args) {
		BitManipulation bit = new BitManipulation();
		int a = 0b11111111; 
		int b = 0b1000000;
		int new_a = a;
		int i = 2;
		int j = 4;
		while(i <= j) {
			System.out.println(i);
			new_a = bit.clearBit(new_a, i);
			i++;
		}
		System.out.println(Integer.toBinaryString(new_a));



	}
}