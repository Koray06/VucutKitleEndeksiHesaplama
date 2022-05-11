import java.util.Scanner;

public class vucutKitleEndeksiHesaplama {

	public static void main(String[] args) {
		/*Java ile kullanıcıdan boy ve kilo değerlerini alıp 
		bir değişkene atayın. Aşağıdaki formüle göre kullanıcının 
		"Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.*/
		
		// Kilo (kg) / (Boy(m) * Boy(m))
		
		double boy, kilo, vucutkitleendeksi;
		
		Scanner imput = new Scanner(System.in);

		System.out.println("lütfen boyunuzu giriniz : ");
		boy= imput.nextDouble();
		System.out.println("lütfen kilonuzu giriniz : ");
		kilo = imput.nextDouble();
		vucutkitleendeksi = kilo / (boy*boy);
		System.out.println("Vücut Kitle Endeksiniz : " + vucutkitleendeksi);
	}

}
