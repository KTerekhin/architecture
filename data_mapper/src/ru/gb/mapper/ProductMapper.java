package ru.gb.mapper;

import ru.gb.exceptions_handling.ProductNotFoundException;
import ru.gb.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper {
    private final Connection connection;

    public ProductMapper(Connection connection) {
        this.connection = connection;
    }

    public Product findById(long id) throws SQLException, ProductNotFoundException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT id, title, price  FROM products WHERE id = ?");
        statement.setLong(1, 1);
        try (ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                return new Product(resultSet.getLong(1), resultSet.getString(2), resultSet.getInt(3));
            }
        }
        throw new ProductNotFoundException("Product not found.");
    }

    public void insertIntoProduct (String title, int price) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("INSERT INTO products (title, price) VALUES (?, ?)");
        statement.setString(1, "Fanta");
        statement.setInt(2, 55);
        ResultSet resultSet = statement.executeQuery();
    }

    public void updateProductById(long id, int price) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("UPDATE products SET price = ? WHERE id = ?");
        statement.setInt(1, 357);
        statement.setLong(2, 2);
        ResultSet resultSet = statement.executeQuery();
    }

    public void deleteProductById(long id) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("DELETE FROM products WHERE id = ?");
        statement.setInt(1, 3);
        ResultSet resultSet = statement.executeQuery();
    }
}
