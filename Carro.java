
 class Carro {
	 
	 // PROPRIEDADES
	private String marca;
	private String modelo;
	private int ano;
	 
	 //METODOS GET E SETTERS
	public String getMarca() 
	{
		return marca;
	}

	public void setMarca(String marca) 
	{
		if(marca != null && !marca.isEmpty()) 
		{
			this.marca = marca;
		}
		else 
		{
			System.out.println("Marca invalida! Escreva (GM, VW, ...)");
		}
			
	}

	public String getModelo() 
	{
	return modelo;
	}

	public void setModelo(String modelo) 
	{
		if(modelo != null && !modelo.isEmpty()) // Verifica se modelo é diferente de Null e Não está vazia
			this.modelo = modelo;
		else 
		{
			System.out.println("Modelo Invalido! Escreva (Corsa, Palio, ...)");
		}
	}

	public int getAno() 
	{
		return ano;
	}

	public void setAno(int ano) 
	{
		if(ano>0)
			this.ano = ano;
		else 
		{
			System.out.println("Ano Invalido, valor não pode ser negativo! Escreva (1999, 2020, ...)");
		}
	}	
	
	
	// Metodo sem retorno, apenas imprime no console as infomações do veiculo:
	public void exibirInfo() 
	{
		System.out.println("Marca: "+marca);
		System.out.println("Modelo: "+modelo);
		System.out.println("Ano: "+ano);
	}

	
	


}
