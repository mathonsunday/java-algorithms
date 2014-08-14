public class SieveOfEratosthenes {
	boolean[] sieveOfE(int max) {
	boolean[] flags = new boolean[max + 1];

	flags[0] = false;
	flags[1] = false;
	for(int i = 2; i < flags.length; i++) {
		flags[i] = true;
	}

	int prime = 2;

	while(prime <= max) {
		crossOff(flags, prime);
		prime = getNextPrime(flags, prime);

		// if(prime >= flags.length) {
		// 	break;
		// }
	}
	return flags;
	}

	void crossOff(boolean[] flags, int prime) {
	for(int i = prime*prime; i < flags.length; i+= prime) {
		flags[i] = false;
 	}
	}

	int getNextPrime(boolean[] flags, int prime) {
		int next = prime + 1;
		while (next < flags.length && !flags[next]) {
			next++;
		}
		return next;
	}

	public static void main(String[] args) {
		SieveOfEratosthenes sieve = new SieveOfEratosthenes();
		boolean[] result = sieve.sieveOfE(10);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}

