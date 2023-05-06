/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import projet.entities.diet;
import projet.tools.MyConnection;

/**
 *
 * @author Oussama, Sana, Manel
 */
public class dietCRUD {

    public void addDiet(diet d) {
        try {
            String requete = "INSERT INTO diet (breakfast,lunch,dinner,snacks,calories)" + "VALUES (?,?,?,?,?)";
            PreparedStatement pst
                    = new MyConnection().cn.prepareStatement(requete);
            pst.setString(1, d.getBreakfast());
            pst.setString(2, d.getLunch());
            pst.setString(3, d.getDinner());
            pst.setString(4, d.getSnacks());
            pst.setString(5, d.getCalories());
            pst.executeUpdate();

            System.out.println("Diet ajoutée!");
        } catch (SQLException ex) {
            Logger.getLogger(workoutCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ObservableList<diet> showDiet() {
        ObservableList<diet> list = FXCollections.observableArrayList();
        try {
            String requete = "SELECT * FROM diet";
            PreparedStatement pst
                    = new MyConnection().cn.prepareStatement(requete);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                list.add(new diet(rs.getInt("id"), rs.getString("breakfast"), rs.getString("lunch"), rs.getString("dinner"), rs.getString("snacks"), rs.getString("calories")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(workoutCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void editDiet(diet d) {
        try {

            String requete = "UPDATE diet SET breakfast= ? ,lunch= ? ,dinner= ? ,snacks= ? ,calories= ? where id = ? ";
            PreparedStatement pst
                    = new MyConnection().cn.prepareStatement(requete);
            pst.setString(1, d.getBreakfast());
            pst.setString(2, d.getLunch());
            pst.setString(3, d.getDinner());
            pst.setString(4, d.getSnacks());
            pst.setString(5, d.getCalories());
            pst.setInt(6, d.getId());
            pst.executeUpdate();

            System.out.println("Diet modifiée!");

        } catch (SQLException ex) {
            Logger.getLogger(workoutCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deleteDiet(int id) {
        try {
            String requete = "DELETE FROM diet WHERE id = ?";
            PreparedStatement pst
                    = new MyConnection().cn.prepareStatement(requete);
            pst.setInt(1, id);
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(workoutCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ObservableList<diet> showDietUser(String calories) {
        ObservableList<diet> list = FXCollections.observableArrayList();
        try {
            String requete = "SELECT * FROM `diet` WHERE calories= ? ORDER BY RAND() LIMIT 1";
            PreparedStatement pst
                    = new MyConnection().cn.prepareStatement(requete);
            pst.setString(1, calories);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                list.add(new diet( rs.getString("breakfast"), rs.getString("lunch"), rs.getString("dinner"), rs.getString("snacks"), rs.getString("calories")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(workoutCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
