/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Treinadores;

import TiposDePokemon.*;
import pokedexf.*;
import Pokemons.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/** Classe Julia é um Treinador com todos os seus dados definidos
 *
 * @author Mathews
 */
public final class Julia extends Treinador
{
    public Julia()
    {
        super("Julia", 19, "Feminino", 0, 5, 5, 10);
    }

    /**
     * Exibe os todos os dados do Treinador
     *
     */
    @Override
    public String apresentaTreinador()
    {
        return super.apresentaTreinador();
    }

    /**
     * Quantos pokemons o treinador pode ganhar a cada vitoria?
     *
     * @param x
     */
    @Override
    public void GanharPokemons(int x)
    {
        super.GanharPokemons(x);
    }

    /**
     * A cada 100 de xp, sobe de nivel. Essa classe funciona em conjunto com a
     * ganharXpT
     *
     * @param n
     */
    @Override
    public void subirDeNivel(int n)                     
    {
        super.subirDeNivel(n);
    }
    
    @Override
    public void setpokemons()
    {
        super.setpokemons();
    
    }
    
   

    /**
     * Ganhar um quantidade de XP Se a soma do xp atual e xp do parametro forem
     * maior que 100, Treinador sobe de nivel O valor de XP passado como
     * parâmetro deverá ser random entre 0 e 100
     *
     * @param xp
     */
    @Override
    public void ganharXpT(int xp)                                           
    {
        super.ganharXpT(xp);
    }

    @Override
    public String getNome()
    {
        return nome;
    }

    @Override
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    @Override
    public int getIdade()
    {
        return idade;
    }

    @Override
    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    @Override
    public String getGenero()
    {
        return genero;
    }

    @Override
    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    @Override
    public int getInsignias()
    {
        return insignias;
    }

    @Override
    public void setInsignias(int insignias)
    {
        this.insignias = insignias;
    }

    @Override
    public int getNumPokemons()
    {
        return numPokemons;
    }

    @Override
    public int getNivelAtual()
    {
        return nivel;
    }

    @Override
    public int getXpT()
    {
        return xpT;
    }

}
