package com.company;

import java.sql.*;
// In this class, employee salary data is taken from the database and used to calculate the project cost.
public class Calculation{
    Manager manager1 = new Manager();
    BackEndDeveloper backender1 = new BackEndDeveloper();
    FrontEndDeveloper frontender1 = new FrontEndDeveloper();
    Designer designer1 = new Designer();
    QA qa1 = new QA();
    DataBaseConnection connect1 = new DataBaseConnection();

    public int calculations(int nmanager, int nback, int nfront, int ndesigner, int nqa, int months) throws SQLException, ClassNotFoundException {
        Manager manager1 = new Manager();
        BackEndDeveloper backender1 = new BackEndDeveloper();
        FrontEndDeveloper frontender1 = new FrontEndDeveloper();
        Designer designer1 = new Designer();
        QA qa1 = new QA();

        int num = 0;
        try {
            Connection con = connect1.getConnection();
            Statement stmt = connect1.getStatement();
            ResultSet rs = connect1.getResultSet();

            stmt = con.createStatement();

            rs = stmt.executeQuery("SELECT salary FROM positions WHERE id = 1;");
            while (rs.next()) {
                num = rs.getInt("salary");
                manager1.setSalary(num);
            }
            rs = stmt.executeQuery("SELECT salary FROM positions WHERE id = 2;");
            while (rs.next()) {
                num = rs.getInt("salary");
                backender1.setSalary(num);
            }
            rs = stmt.executeQuery("SELECT salary FROM positions WHERE id = 3;");
            while (rs.next()) {
                num = rs.getInt("salary");
                frontender1.setSalary(num);
            }
            rs = stmt.executeQuery("SELECT salary FROM positions WHERE id = 4;");
            while (rs.next()) {
                num = rs.getInt("salary");
                designer1.setSalary(num);
            }
            rs = stmt.executeQuery("SELECT salary FROM positions WHERE id = 5;");
            while (rs.next()) {
                num = rs.getInt("salary");
                qa1.setSalary(num);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }

        int cost = ((nmanager * manager1.getSalary()) + (nback * backender1.getSalary()) + (nfront * frontender1.getSalary()) +
                (ndesigner * designer1.getSalary()) + (nqa * qa1.getSalary()) * months);
        return cost;
    }
}
