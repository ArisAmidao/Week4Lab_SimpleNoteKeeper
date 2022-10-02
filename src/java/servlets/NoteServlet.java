package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author amida
 */
public class NoteServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
            //find the file.
            String path = getServletContext().getRealPath("/WEB-INF/note.txt");
                
            //read the file.
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));
                
            //assign the first line as the title and the second line as the content.
            String title = br.readLine();
            String contents = br.readLine();
            br.close();
                
            //create a new note with the title and the contents.
            Note note = new Note(title, contents);
            request.setAttribute("note", note);
                 
            String edit = request.getParameter("edit");
                 
            if (edit == null) {
                getServletContext().getRequestDispatcher("/WEB-INF/viewNote.jsp")
                    .forward(request, response);
            } 
            else {
                getServletContext().getRequestDispatcher("/WEB-INF/editNote.jsp")
                    .forward(request, response);
                 }
        }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            //find the file
            String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
            //get the title and the contents
            String title = request.getParameter("title");
            String contents = request.getParameter("contents");        
        
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)))) {
            Note note = new Note(title, contents);
            request.setAttribute("note", note);
        
            pw.print(note.getTitle());
            pw.print(note.getContents());
        }
        
            getServletContext().getRequestDispatcher("/WEB-INF/viewNote.jsp")
                    .forward(request, response);
    }
}
