package course;

public class Programa {

	public static void main(String[] args) {
		String original = "abcde FGHIJ  ABC abc  DEFG  ";
		String s01 = original.toLowerCase(); //converter para minúsculas
		String s02 = original.toUpperCase(); //letras maiúsculas
		String s03 = original.trim();//elemina os espaços nos cantos da string
		String s04= original.substring(2);//a partir da letra 2
		String s05= original.substring(2,9);//a partir de quanto quero recortar e o limite
		String s06= original.replace('a','x');//trocar sempre que achar o a minúsculo pelo x minúsculo
		String s07= original.replace("abc","xy"); //sempre que achar abc trocar por xy
		
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		System.out.println("Original:- " + original + "-");
		System.out.println("toLowerCase:- " + s01 + "-");
		System.out.println("toUpperCase:- " + s02 + "-");
		System.out.println("trim:- " + s03 + "-");
		System.out.println("substring(2):- " + s04 + "-");
		System.out.println("substring(2,9):- " + s05 + "-");
		System.out.println("replace('a''x'):- " + s06 + "-");
		System.out.println("replace('abc''xy'):- " + s07 + "-");
		System.out.println("IndexOf 'bc': " + i);
		System.out.println("LastIndex 'bc': " + j);
		

	}

}
