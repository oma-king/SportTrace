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
import projet.entities.ingredient;
import projet.tools.MyConnection;

/**
 *
 * @author Oussama, Sana, Manel
 */
public class ingredientCRUD {

    public void addIngredient(ingredient i) {
        try {
            String requete = "INSERT INTO ingredient (name,category,calories_category)" + "VALUES (?,?,?)";
            PreparedStatement pst
                    = new MyConnection().cn.prepareStatement(requete);
            pst.setString(1, i.getName());
            pst.setString(2, i.getCategory());
            pst.setString(3, i.getCalories_category());
            pst.executeUpdate();

            System.out.println("Ingrediant ajoutée!");
        } catch (SQLException ex) {
            Logger.getLogger(workoutCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ObservableList<ingredient> showIngredient() {
        ObservableList<ingredient> list = FXCollections.observableArrayList();
        try {
            String requete = "SELECT * FROM ingredient";
            PreparedStatement pst
                    = new MyConnection().cn.prepareStatement(requete);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                list.add(new ingredient(rs.getInt("id"), rs.getString("name"), rs.getString("category"), rs.getString("calories_category")));
            }

        } catch (SQLException ex) {
            Logger.getLogger(workoutCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void deleteWorkout(int id) {
        try {
            String requete = "DELETE FROM ingredient WHERE id = ?";
            PreparedStatement pst
                    = new MyConnection().cn.prepareStatement(requete);
            pst.setInt(1, id);
            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(workoutCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editIngredient(ingredient i) {
        try {

            String requete = "UPDATE ingredient SET name=? ,category=? ,calories_category=? where id = ? ";
            PreparedStatement pst
                    = new MyConnection().cn.prepareStatement(requete);;
            pst.setString(1, i.getName());
            pst.setString(2, i.getCategory());
            pst.setString(3, i.getCalories_category());
            pst.setInt(4, i.getId());
            pst.executeUpdate();

            System.out.println("Ingredient modifiée!");

        } catch (SQLException ex) {
            Logger.getLogger(workoutCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ObservableList<String> showIngredientBreakfast(String CaloriesC) {
        ObservableList<String> list = FXCollections.observableArrayList();
        try {
            String requete = "SELECT name FROM ingredient where category like 'breakfast' AND calories_category like ?";
            PreparedStatement pst
                    = new MyConnection().cn.prepareStatement(requete);
            pst.setString(1, CaloriesC);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                list.add(rs.getString("name"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(workoutCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ObservableList<String> showIngredientDinner(String CaloriesC) {
        ObservableList<String> list = FXCollections.observableArrayList();
        try {
            String requete = "SELECT name FROM ingredient where category like 'dinner' AND calories_category like ?";
            PreparedStatement pst
                    = new MyConnection().cn.prepareStatement(requete);
            pst.setString(1, CaloriesC);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                list.add(rs.getString("name"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(workoutCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ObservableList<String> showIngredientLunch(String CaloriesC) {
        ObservableList<String> list = FXCollections.observableArrayList();
        try {
            String requete = "SELECT name FROM ingredient where category like 'lunch' AND calories_category like ?";
            PreparedStatement pst
                    = new MyConnection().cn.prepareStatement(requete);
            pst.setString(1, CaloriesC);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                list.add(rs.getString("name"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(workoutCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ObservableList<String> showIngredientSnack(String CaloriesC) {
        ObservableList<String> list = FXCollections.observableArrayList();
        try {
            String requete = "SELECT name FROM ingredient where category like 'snack' AND calories_category like ?";
            PreparedStatement pst
                    = new MyConnection().cn.prepareStatement(requete);
            pst.setString(1, CaloriesC);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                list.add(rs.getString("name"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(workoutCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
