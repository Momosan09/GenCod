package application.dicionario.c128;

public enum Code128 {

	/**
	 * 11 Modulos (cantidad de numeros)
	 * los valores son el ancho de la linea, del 1 al 4
	 */
	START_CODE_B(2,1,2,1,2,2,1,2,1,2,1);

	public int[] val11 = new int[11];
	
	Code128(int i, int j, int k, int l, int m, int n, int o, int p, int q, int r, int s) {
		val11[0] = i;
		val11[1] = j;
		val11[2] = k;
		val11[3] = l;
		val11[4] = m;
		val11[5] = n;
		val11[6] = o;
		val11[7] = p;
		val11[8] = q;
		val11[9] = r;
		val11[10] = s;

		
	}
}
