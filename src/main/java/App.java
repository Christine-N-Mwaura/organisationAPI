import com.google.gson.Gson;
import models.Departments;
import models.News;
import models.Users;
import models.dao.Sql2oDepartmentsDao;
import models.dao.Sql2oNewsDao;
import models.dao.Sql2oUsersDao;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static spark.Spark.get;
import static spark.Spark.post;


public class App {
    public static void main(String[] args) {
        Sql2oUsersDao usersDao;
        Sql2oNewsDao newsDao;
        Sql2oDepartmentsDao departmentsDao;
        Connection conn;
        Gson gson = new Gson();

        String connectionString = "jdbc:h2:~/organisationAPI.db;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "", "");

        usersDao = new Sql2oUsersDao(sql2o);
        newsDao = new Sql2oNewsDao(sql2o);
        departmentsDao = new Sql2oDepartmentsDao(sql2o);
        conn = sql2o.open();
        Departments departments = new Departments("hr","tr",6);
        departmentsDao.add(departments);
        News news = new News("Christine","my news");
        newsDao.add(news);



        post("/department/new", "application/json",(req,res)->{
            Departments department = gson.fromJson(req.body(),Departments.class);
            departmentsDao.add(department);
            res.status(201);
            res.type("application/json");
            return gson.toJson(department);
        });
        get("/departments", "application/json",(req,res)->{

            return gson.toJson(departmentsDao.all());
        });


        post("/user/new", "application/json",(req,res)->{
            Users user = gson.fromJson(req.body(),Users.class);
            usersDao.add(user);
            res.status(201);
            res.type("application/json");
            return gson.toJson(user);
        });


        post("/news/new", "application/json",(req,res)->{
            News nNews = gson.fromJson(req.body(),News.class);
            newsDao.add(nNews);
            res.status(201);
            res.type("application/json");
            return gson.toJson(nNews);
        });


        get("/departments", "application/json", (req, res) -> { //accept a request in format JSON from an app
            res.type("application/json");
            return gson.toJson(departmentsDao.all());//send it back to be displayed
        });

        get("/departments/:id", "application/json", (req, res) -> { //accept a request in format JSON from an app
            res.type("application/json");
            int dptId = Integer.parseInt(req.params("id"));
            res.type("application/json");
            return gson.toJson(departmentsDao.findById(dptId));
        });


    }

}
