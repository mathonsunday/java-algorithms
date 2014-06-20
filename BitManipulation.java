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
		int mask = (1 << (i+1)) - 1 );
		return num & mask;
	}

	int updateBit(int num, int i, int v) {
		int mask = ~(1 << i);
		return (num & mask) | (v << i);
	}
}