/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.SushiDao;
import java.util.ArrayList;
import model.Sushi;

/**
 *
 * @author Vu Ngoc Thinh
 */
public class test {
    public static void main(String[] args) {
         SushiDao sdao = new SushiDao();
         ArrayList<Sushi> list = sdao.getSushis(4, 3);
         for (Sushi sushi : list) {
             System.out.println(sushi);
        }
    }
}
