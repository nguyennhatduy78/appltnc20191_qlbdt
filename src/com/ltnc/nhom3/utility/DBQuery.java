/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ltnc.nhom3.utility;

/**
 *
 * @author admin
 */
public class DBQuery {

    /* =========== Bill =========== */
    private static final String BILL_TABLE = "Bill";
    
    public static final String FIND_ALL_BILLS = "SELECT * FROM " + BILL_TABLE;
    public static final String FIND_ALL_BILLS_OFFSET_LIMIT = FIND_ALL_BILLS + " LIMIT ?,?";
    public static final String COUNT_ALL_BILLS = "SELECT COUNT(*) FROM " + BILL_TABLE;
    public static final String FIND_BILL_BY_ID = FIND_ALL_BILLS + " WHERE bill_id = ?";
    public static final String CREATE_NEW_BILL = "INSERT INTO " + BILL_TABLE + " VALUES(NULL,?,?,?,?,?)";
    public static final String UPDATE_BILL = "UPDATE "+ BILL_TABLE + " SET total=?, note=? WHERE bill_id=?"; 

    /* ============================ */
    
    /* =========== Manufacturer =========== */
    private static final String MANUFACTURER_TABLE = "Manufacturer";
    
    public static final String FIND_ALL_MANUFACTURERS = "SELECT * FROM " + MANUFACTURER_TABLE;
    public static final String CREATE_NEW_MANUFACTURER = "INSERT INTO " + MANUFACTURER_TABLE + " VALUES(NULL,?,?)";
    public static final String FIND_MANUFACTURER_BY_ID = FIND_ALL_MANUFACTURERS + " WHERE manufacturer_id = ?";
    public static final String UPDATE_MANUFACTUER = "UPDATE " + MANUFACTURER_TABLE 
            + " SET name = ? , country = ? WHERE manufacturer_id = ?";
    public static final String DELETE_MANUFACTUER_BY_ID = "DELETE FROM " + MANUFACTURER_TABLE 
                + " WHERE manufacturer_id = ?";
    public static final String FIND_MANUFACTURER_BY_NAME = FIND_ALL_MANUFACTURERS + " WHERE name = ?";

    /* ============================ */
    
    /* =========== Product =========== */
    private static final String PRODUCT_TABLE = "Product";
    
    public static final String UPDATE_PRODUCT_MANUFACTURER_ID_NULL = "UPDATE " + PRODUCT_TABLE 
            + " SET manufacturer_id = NULL WHERE manufacturer_id = ?";
    
    public static final String FIND_ALL_PRODUCTS = "SELECT * FROM " + PRODUCT_TABLE;
    public static final String FIND_ALL_PRODUCTS_OFFSET_LIMIT = FIND_ALL_PRODUCTS + " WHERE deleted=0 LIMIT ?,?";
    public static final String FIND_ALL_PRODUCTS_BY_NAME = FIND_ALL_PRODUCTS + " WHERE name LIKE ? LIMIT ?,?";
    public static final String DELETE_PRODUCT_BY_ID = "DELETE FROM " + PRODUCT_TABLE 
                + " WHERE product_id = ?";
    public static final String DELETE_MANY_PRODUCT_BY_IDS = "UPDATE " + PRODUCT_TABLE 
                + " SET deleted = 1 WHERE product_id IN (";
    public static final String FIND_PRODUCT_BY_ID = FIND_ALL_PRODUCTS
            + " WHERE product_id = ?";
    public static final String CREATE_NEW_PRODUCT = "INSERT INTO " + PRODUCT_TABLE 
            + " VALUES(NULL,?,?,?,?,?,?,0)";
    public static final String UPDATE_PRODUCT = "UPDATE " + PRODUCT_TABLE 
            + " SET name = ? , manufacturer_id = ?, specifications = ?,"
            + "description = ?, release_date =?, available = ? WHERE product_id = ?";
    public static final String COUNT_ALL_PRODUCTS = "SELECT COUNT(*) FROM " + PRODUCT_TABLE + " WHERE deleted=0";
    public static final String COUNT_ALL_PRODUCTS_BY_NAME = "SELECT COUNT(*) FROM " + PRODUCT_TABLE
            + " WHERE name LIKE ? AND deleted=0";
    
    public static String getQueryDeleteManyProductIds(int numberIds) {
        StringBuilder query = new StringBuilder(DELETE_MANY_PRODUCT_BY_IDS);
        for (int i = 1; i <= numberIds; i++ ) {
            query.append("?");
            if (i != numberIds) query.append(",");
        }
        query.append(")");
        return query.toString();
    }
    /* ============ Price ============ */
    private static final String PRICE_TABLE = "Price";
    public static final String FIND_ALL_PRICES = "SELECT * FROM " + PRICE_TABLE;
    public static final String FIND_PRICE_BY_PRODUCT_ID = FIND_ALL_PRICES + " WHERE product_id=? "
            + "AND current=1";
    public static final String CREATE_NEW_PRICE = "INSERT INTO " + PRICE_TABLE 
            + " VALUES(NULL,?,?,?,NULL,DEFAULT)";
    public static final String UPDATE_PRICE = "UPDATE " + PRICE_TABLE
            + " SET end_date = ?,  current = ? WHERE price_id = ?";
    public static final String FIND_ALL_PRICES_BY_PRODUCT_ID = FIND_ALL_PRICES + " WHERE product_id = ? ORDER BY start_date DESC LIMIT ?,?";
    public static final String COUNT_ALL_PRICES_BY_PRODUCT_ID = "SELECT COUNT(*) FROM "+ PRICE_TABLE + " WHERE product_id=?";

    /* =============================== */
    
    /* =========== Employee =========== */
    private static final String EMPLOYEE_TABLE = "Employee";
    
    public static final String FIND_ALL_EMPLOYEES = "SELECT * FROM " + EMPLOYEE_TABLE;
    public static final String FIND_ALL_EMPLOYEES_OFFSET_LIMIT = FIND_ALL_EMPLOYEES + " WHERE admin=0 LIMIT ?,?";
    public static final String FIND_ALL_EMPLOYEES_LIKE_FULLNAME = FIND_ALL_EMPLOYEES + " WHERE admin=0 AND fullname LIKE ? LIMIT ?,?";
    public static final String CREATE_NEW_EMPLOYEE = "INSERT INTO " + EMPLOYEE_TABLE + " VALUES(NULL,?,?,?,?,?,?,?,?,1)";
    public static final String FIND_EMPLYEE_BY_ID = FIND_ALL_EMPLOYEES + " WHERE employee_id = ?";
    public static final String UPDATE_EMPLOYEE = "UPDATE " + EMPLOYEE_TABLE
            + " SET fullname = ?,  address = ?, phone= ?, male = ?, identity_card= ? WHERE employee_id = ?";
    public static final String DISABLE_EMPLOYEE_BY_ID = "UPDATE " + EMPLOYEE_TABLE
            + " SET active=0 WHERE employee_id = ?";
    public static final String ENABLE_EMPLOYEE_BY_ID = "UPDATE " + EMPLOYEE_TABLE
            + " SET active=1 WHERE employee_id = ?";
    public static final String FIND_EMPLYEE_BY_USERNAME = FIND_ALL_EMPLOYEES + " WHERE username=?";
    public static String UPDATE_EMPLOYEE_PASSWORD_BY_ID = "UPDATE " + EMPLOYEE_TABLE
            + " SET password = ? WHERE employee_id = ?";
    public static final String DISABLE_MANY_EMPLOYEE_BY_IDS = "UPDATE " + EMPLOYEE_TABLE 
            + " SET active=0 WHERE employee_id IN (";
    public static final String COUNT_ALL_EMPLOYEES = "SELECT COUNT(*) FROM " + EMPLOYEE_TABLE
            + " WHERE admin = 0";
    public static final String COUNT_ALL_EMPLOYEES_BY_NAME = "SELECT COUNT(*) FROM " + EMPLOYEE_TABLE
            + " WHERE admin = 0 AND fullname LIKE ?";
    public static String getQueryDisableManyEmployeeIds(int numberIds) {
        StringBuilder query = new StringBuilder(DISABLE_MANY_EMPLOYEE_BY_IDS);
        for (int i = 1; i <= numberIds; i++) {
            query.append("?");
            if (i != numberIds) query.append(",");
        }
        query.append(")");
        return query.toString();
    }
    /* ============================ */
    
    /* ========= Customer ========= */
    private static final String CUSTOMER_TABLE = "Customer";
    
    public static final String FIND_ALL_CUSTOMERS = "SELECT * FROM " + CUSTOMER_TABLE;
    public static final String FIND_CUSTOMER_BY_ID = FIND_ALL_CUSTOMERS + " WHERE customer_id = ?";
    public static final String CREATE_NEW_CUSTOMER = "INSERT INTO " + CUSTOMER_TABLE + " VALUES(NULL,?,?,?)";
    public static final String DELETE_CUSTOMER_BY_ID = "UPDATE " + BILL_TABLE + " SET customer_id=NULL WHERE customer_id=?;DELETE FROM " + CUSTOMER_TABLE 
                + " WHERE customer_id = ?";
    public static final String UPDATE_CUSTOMER = "UPDATE " + CUSTOMER_TABLE 
            + " SET fullname = ? , address = ?, phone = ? WHERE customer_id = ?";
    public static final String FIND_CUSTOMER_BY_FULLNAME = FIND_ALL_CUSTOMERS + " WHERE fullname LIKE ?";
    public static final String FIND_ALL_CUSTOMERS_OFFSET_LIMIT = FIND_ALL_CUSTOMERS + " LIMIT ?,?";
    public static final String FIND_ALL_CUSTOMERS_LIKE_FULLNAME = FIND_CUSTOMER_BY_FULLNAME +  " LIMIT ?,?";
    public static final String COUNT_ALL_CUSTOMERS = "SELECT COUNT(*) FROM " + CUSTOMER_TABLE;
    public static final String COUNT_ALL_CUSTOMERS_BY_NAME = "SELECT COUNT(*) FROM "+CUSTOMER_TABLE+" WHERE fullname LIKE ?";
    
    /* ============================ */
    
    /* ========= BillDetail ========= */
    private static final String BILLDETAIL_TABLE = "Bill_detail";
    public static final String FIND_ALL_BILLDETAILS_BY_BILL_ID_OFFSET_LIMIT = "SELECT * FROM " + BILLDETAIL_TABLE
            + " WHERE bill_id=? LIMIT ?,?";
    public static final String COUNT_ALL_BILLDETAILS_BY_BILL_ID = "SELECT COUNT(*) FROM " + BILLDETAIL_TABLE
            + " WHERE bill_id=?";
    public static final String CREATE_NEW_BILLDETAIL = "INSERT INTO " + BILLDETAIL_TABLE + " VALUES(NULL, ?,?,?,?)";
    public static final String CREATE_MANY_NEW_BILLDETAILS = "INSERT INTO " + BILLDETAIL_TABLE + " VALUES";
    public static final String COUNT_SUM_QUANTITY_BY_BILL_ID = "SELECT SUM(quantity) FROM " + BILLDETAIL_TABLE
            + " WHERE bill_id=?";
    public static final String FIND_ALL_BILLDETAILS_BY_BILL_ID = "SELECT * FROM " + BILLDETAIL_TABLE
            + " WHERE bill_id=?";
    public static String DELETE_ALL_BILLDETAILS_BY_BILL_ID = "DELETE FROM " + BILLDETAIL_TABLE + " WHERE bill_id=?";

    public static String getQueryCreateManyBillDetails(int length) {
        StringBuilder query = new StringBuilder(CREATE_MANY_NEW_BILLDETAILS);
        for (int i = 1; i <= length; i++) {
            query.append("(NULL, ?,?,?,?)");
            if (i != length) query.append(",");
        }
        return query.toString();
    }
    
    /* =============================== */
}
