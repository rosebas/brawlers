/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.umg;

/**
 *
 * @author Edgar Montejo
 */
public class Brawlers {

    public static void main(String[] args) {
       
        BrawlClass collete = new BrawlClass("Collete",11, 10, 123, 1, 1);
        BrawlClass crow = new BrawlClass("Crow", 11, 320, 320, 3, 5);
        BrawlClass eve = new BrawlClass("Eve", 11, 540, 1800, 2, 7);
        
        System.out.println(crow.nombre + crow.danioBasico);
        System.out.println(collete.nombre + collete.danioBasico);
        System.out.println(eve.nombre + eve.danioBasico);
    }
}
