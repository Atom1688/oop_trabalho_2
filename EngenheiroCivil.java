/*
 * Especialista.java
 * 
 * Copyright 2019 Lucas Dantas Romankiu <lucas@lucas-NC215S>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
package Especialista;
import Matematica.Retangulo;

public class EngenheiroCivil{
	
	private String nome;
	private int idade;
	private double ladoH = 4.7;
	private double ladoV = 8.2;
	
	public EngenheiroCivil(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	private void exibir_dados_pessoais(){
		System.out.println(nome);
		System.out.println(idade + "anos");
		System.out.println();
	}
	
	public void main(){
		this.exibir_dados_pessoais();
		Retangulo retangulo = new Retangulo();
		retangulo.definir_lados(this.ladoH,this.ladoV);
		System.out.printf("%.2f", retangulo.area);
		System.out.printf("%.2f", retangulo.perimetro);
	}

}

