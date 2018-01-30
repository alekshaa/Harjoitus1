public class Terve{
	
	public static void main(String[] args){
		int kertoja = Integer.parseInt(args[0]);
		String tervehdys = args[1];
		for(int i = 0; i < kertoja; i++){
			System.out.println(tervehdys);
		}
	}
}