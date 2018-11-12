/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pokemons;

import TiposDePokemon.*;
import Sons.*;
import java.util.Random;
import pokedexf.*;

/**
 *
 * @author Mathews
 */
public class Pidgey extends Pokemon implements Normal, Voador
{

    public Pidgey()
    {
                super();
        this.nome = "Pidgey";
        this.peso = 1.8f;
        
        Random s = new Random();
        int x = s.nextInt(1);
        if (x == 1)
        {
            this.sexo = 'M';
        }
        else
        {
            this.sexo = 'F';
        }
        this.nivel = 0;
        this.xp = 0;
        
        this.hp = 190;
        this.ataque = 85;
        this.defesa = 76;
        this.ataqueEspecial = 67;
        this.defesaEspecial = 67;
        this.velocidade = 105;
    }

    /**
     * Sobrescrição da Classe Mãe
     *
     * Função: Tocar o Som do Pokemon
     *
     * @author Mathews
     */

    public void emitesom()
    {
        TocarSom som = new TocarSom();
        som.play("PidgeySound");
    }

    /**
     * Sobrescrição da Interface Normal
     *
     * Função: Definir ataques especiais
     *
     * @author Mathews
     * @return
     */
    @Override
    public int cut()
    {
        System.out.println("Corte");
        return -90;
    }

    @Override
    public int furyAttack()
    {
        System.out.println("ataque de furia!");
        return -40;
    }

    @Override
    public int gigaImpact()
    {
        System.out.println("Giga Impact");
        return -80;
    }

    @Override
    public int hornAttack()
    {
         System.out.println("Ataque de cifre");
        return -100;
    }

    /**
     * Sobrescrição da Interface Voador
     *
     * Função: Definir ataques especiais
     *
     * @author Mathews
     * @return
     */
    @Override
    public int aerialAce()
    {
        return 1;
    }

    @Override
    public int airCutter()
    {
        return 1;
    }

    @Override
    public int drillPeck()
    {
        return 1;
    }

    @Override
    public int hurricane()
    {
        return 1;
    }

}