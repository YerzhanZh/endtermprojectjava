package com.project;

import com.project.coffeeSystem.CoffeeBarista;
import com.project.coffeeSystem.UsualCashier;
import com.project.shop.SuperBarista;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Staff {
    public static void main(String[] args) {
        Connection conn;
        ResultSet rs;
        try{
            conn = DriverManager.getConnection("jdbc:mysql//localhost/dbzhahanger");
            rs=conn.createStatement().executeQuery("select * from table1");
            int i=0;
            while (rs.next()){
                String name =rs.getString(rs.findColumn("itemname"));
                String cost =rs.getString(rs.findColumn("name"));
                System.out.println(name);
            }
        } catch (SQLException e){
            System.out.println("error" + e.toString());
        }
        Team team = new Team();

        Barista firstBarista = new CoffeeBarista();
        Cashier firstCashier = new UsualCashier();
        Cashier secondCashier = new UsualCashier();

        Cashier thirdCashier = new UsualCashier();

        team.addBarista(firstBarista);
        team.addCashier(firstCashier);
        team.addCashier(secondCashier);
        team.removeCashier(firstCashier);
        team.addCashier(thirdCashier);

        team.createStaff();

    }
}
