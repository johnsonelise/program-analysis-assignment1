
// import SQLiteLexer.*;
// import SQLiteParser.*;
// import SQLiteParserBaseVisitor.*;

import java.io.FileInputStream;
import java.io.IOException;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


class test2
{
    public static void main(String []args)
    {
        SQLiteLexer lexer = new SQLiteLexer(CharStreams.fromString(
                          "CREATE TABLE EMPLOYEES (" +
                          "ID, " +
                          "NAME, " +
                          "SALARY);" +
                        //   "CREATE VIRTUAL TABLE DOCS USING FTS5( XXX, TENNIS, FRISBEE );" +
                        //   "INSERT INTO employees (id, name, salary) VALUES (1, 'Alice', 75000.00);" +
                          "SELECT NAME, ID FROM EMPLOYEES;" + 
                          "SELECT 4 + (2 + 1) AS ABC;" +
                          "SELECT 7 + 8 AS SUM;" +
                        //   "SELECT HIPPO FROM EMPLOYEES;" + 
                          "SELECT 'hello' + 5 AS DEF;" +
                        //   "SELECT 6 + 5.5 AS GHI;" +
                        //   "SELECT 'hello' + (5 + 'elise') AS JKL;" +
                          "SELECT 5 + (3 + 2) AS MNO;"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLiteParser parser = new SQLiteParser(tokens);

        SQLiteParser.Sql_stmt_listContext tree = parser.sql_stmt_list();
        SQLiteParserBaseVisitor visitor = new SQLiteParserBaseVisitor();
        visitor.visit(tree);  // This will trigger your modified visitor
        // System.out.println("done!");
    }
};