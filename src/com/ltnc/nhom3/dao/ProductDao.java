/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ltnc.nhom3.dao;

import com.ltnc.nhom3.connect.DatabaseConnect;
import com.ltnc.nhom3.entity.Product;
import com.ltnc.nhom3.utility.DBQuery;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class ProductDao {
    public int createAndReturnId(Product product, boolean isReturnNewId) throws SQLException {
        int newId = 0;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DatabaseConnect.getInstance().getConnection();
            preparedStatement = connection.prepareStatement(DBQuery.CREATE_NEW_PRODUCT,
                    PreparedStatement.RETURN_GENERATED_KEYS);     
            preparedStatement.setString(1, product.getName());
            if (product.getManufacturerId() == 0) 
                //set null
                preparedStatement.setNull(2,Types.BIGINT);
            else preparedStatement.setInt(2, product.getManufacturerId());
            preparedStatement.setString(3, product.getSpecifications());
            preparedStatement.setString(4, product.getDecription());
            preparedStatement.setString(5, product.getReleaseDate());
            preparedStatement.setBoolean(6, product.isAvailable());
            preparedStatement.executeUpdate();
            ResultSet rs = preparedStatement.getGeneratedKeys();
            if (rs.next()) newId=rs.getInt(1);
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return newId;
    }

    public List<Product> findAll(int offset, int limit) throws SQLException {
        List<Product> products = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DatabaseConnect.getInstance().getConnection();
            preparedStatement = connection.prepareStatement(DBQuery.FIND_ALL_PRODUCTS_OFFSET_LIMIT);
            preparedStatement.setInt(1, offset);
            preparedStatement.setInt(2, limit);
            ResultSet resultSet = preparedStatement.executeQuery();
            Product product = null;
            products = new ArrayList<>();

            while (resultSet.next()) {
                    product = extractFromResultSet(resultSet);
                    products.add(product);
            }
        } finally {            
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        }
        return products;
    }

    public Product findById(int id) throws SQLException {
        Product product  = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
                connection = DatabaseConnect.getInstance().getConnection();
                preparedStatement = connection.prepareStatement(DBQuery.FIND_PRODUCT_BY_ID);

                preparedStatement.setInt(1, id);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) { 
                    product = extractFromResultSet(resultSet);
                    
                    break;
                }
        } finally {
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        }
        return product;
    }

    public boolean update(Product product) throws SQLException {
        int count = 0;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DatabaseConnect.getInstance().getConnection();
            preparedStatement = connection.prepareStatement(DBQuery.UPDATE_PRODUCT);

            preparedStatement.setString(1, product.getName());
            if (product.getManufacturerId() == 0) 
                //set null
                preparedStatement.setNull(2,Types.BIGINT);
            else preparedStatement.setInt(2, product.getManufacturerId());
            preparedStatement.setString(3, product.getSpecifications());
            preparedStatement.setString(4, product.getDecription());
            preparedStatement.setString(5, product.getReleaseDate());
            preparedStatement.setBoolean(6, product.isAvailable());
            preparedStatement.setInt(7, product.getId());
            
            count = preparedStatement.executeUpdate();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return count > 0;
    }

    public boolean deleteById(int id) throws SQLException {
        int count = 0;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DatabaseConnect.getInstance().getConnection();
            preparedStatement = connection.prepareStatement(DBQuery.DELETE_PRODUCT_BY_ID);

            preparedStatement.setInt(1, id);

            count = preparedStatement.executeUpdate();
        } finally {
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        }
        return count > 0; 
    }

    private Product extractFromResultSet(ResultSet resultSet) throws SQLException {
        Product product = new Product();
        product.setId(resultSet.getInt(1));
        product.setName(resultSet.getString(2));
        product.setManufacturerId(resultSet.getInt(3));
        product.setSpecifications(resultSet.getString(4));
        product.setDecription(resultSet.getString(5));
        product.setReleaseDate(resultSet.getString(6));
        product.setAvailable(resultSet.getBoolean(7));
        return product;
    }

    public boolean deleteManyByIds(int[] listIds) throws SQLException {
        int count = 0;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {            
            connection = DatabaseConnect.getInstance().getConnection();
            preparedStatement = connection.prepareStatement(DBQuery.getQueryDeleteManyProductIds(listIds.length));
            
            for (int i = 0; i < listIds.length; i++)
                preparedStatement.setInt(i+1, listIds[i]);

            count = preparedStatement.executeUpdate();
        } finally {
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        }
        return count == listIds.length; 
    }

    public List<Product> findAllLikeName(String name, int offset, int limit) throws SQLException {
        List<Product> products = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DatabaseConnect.getInstance().getConnection();
            preparedStatement = connection.prepareStatement(DBQuery.FIND_ALL_PRODUCTS_BY_NAME);
            preparedStatement.setString(1, "%"+name+"%");
            preparedStatement.setInt(2, offset);
            preparedStatement.setInt(3, limit);
            ResultSet resultSet = preparedStatement.executeQuery();
            Product product = null;
            products = new ArrayList<>();

            while (resultSet.next()) {
                    product = extractFromResultSet(resultSet);
                    products.add(product);
            }
        } finally {            
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        }
        return products;
    }

    public int countAll() throws SQLException {
        int count = 0;
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DatabaseConnect.getInstance().getConnection();
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(DBQuery.COUNT_ALL_PRODUCTS);
            if (resultSet.next()) count = resultSet.getInt(1);
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return count;
    }

    public int countAllLikeName(String name) throws SQLException {
        int count = 0;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DatabaseConnect.getInstance().getConnection();
            preparedStatement = connection.prepareStatement(DBQuery.COUNT_ALL_PRODUCTS_BY_NAME);
            preparedStatement.setString(1, "%"+name+"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                    count = resultSet.getInt(1);
            }
        } finally {            
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        }
        return count;
    }
}
