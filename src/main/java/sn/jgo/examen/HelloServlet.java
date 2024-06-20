package sn.jgo.examen;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sn.jgo.examen.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("immoPU");
        EntityManager em = emf.createEntityManager();

        try{
            em.getTransaction().begin();
            User u = new User();
            u.setPrenom("Mouhamad");
            u.setNom("DJIGO");
            u.setIdentifiant("jgotechmaker");
            u.setMdp("passer");
            em.persist(u);
            em.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            if (em.getTransaction().isActive())
                em.getTransaction().rollback();
        }

        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}