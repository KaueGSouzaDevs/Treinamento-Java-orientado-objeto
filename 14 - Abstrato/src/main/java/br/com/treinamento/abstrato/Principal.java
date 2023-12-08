package br.com.treinamento.abstrato;

public class Principal {

	public static void main(String[] args) {

		NuvemBrodis nuvem1 = new NuvemBrodis();
		nuvem1.setNomeImagem("foto_perfil.png");
		
		String base64 = nuvem1.converteBase64(nuvem1.getNomeImagem());
		
		nuvem1.upload(base64);

		System.out.println(nuvem1.getUrlImagem());
		
	}

}
