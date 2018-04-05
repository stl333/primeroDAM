package ejercicio1;

public class Main {

	public static void main(String[] args) {

		int[] nums1 = {1, 2, 3, 4, 5, 6};
		int[] nums2 = {1, 1, 9, 0, 33, 2, 3};

		System.out.println("Hay dos pares o más en nums1:" +
					Utilidades.hayDosParesOMas(nums1));

		System.out.println("Hay repetidos en nums1:" +
					Utilidades.hayRepetidos(nums1));

		System.out.println("Valor medio en nums2: " +
					Utilidades.valorMedio(nums2));

		System.out.println("Impares en nums1 y nums2:");
		for(int num: Utilidades.soloImpares(nums1, nums2))
		{
			System.out.println(num + " ");
		}

	}

}
