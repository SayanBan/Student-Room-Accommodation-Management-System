package sample;

import java.io.*;
import java.io.PrintWriter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;


@WebServlet(urlPatterns = {"/Student"})

public class Student extends HttpServlet {

    static ArrayList studList = new ArrayList();
    static ArrayList room = new ArrayList();
    static String logid="";
    String Stud_No, user, id, pwd, cpwd;
    static int f;

    public void room(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
"    <meta name=\"description\" content=\"Dobro dosli u najbolji kafic na svetu\">\n" +
"    <meta name=\"keywords\" content=\"Kafic\">\n" +
"    <link href=\"//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.no-icons.min.css\" rel=\"stylesheet\">\n" +
"<link href=\"//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css\" rel=\"stylesheet\">\n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"css/style.css\">\n" +
"    <title>Web Tech Assignment</title>\n" +
"    <style>\n" +
"        body {\n" +
"            background-color: #303641;\n" +
"        }\n" +
"    </style>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    <header>\n" +
"        <nav id=\"navbar\">\n" +
"            <div class=\"container\">\n" +
"                <h1 class=\"logo\"><a href=\"index.html\">Student Accomodation System</a></h1>\n" +
"                <ul>\n" +
"                    <li><a class=\"current\" href=\"index.html\">Home</a></li>\n" +
"                    <li><a href=\"Admin.html\">Admin</a></li>\n" +
"                    <li><a href=\"Student.html\">Student</a></li>\n" +
"                    <li><a href=\"insert.html\">Insert</a></li>\n" +
"                    <li><a href=\"updatetable.html\">Update</a></li>\n" +
"                    <li><a href=\"delete.html\">Delete</a></li>\n" +                
"                </ul>\n" +
"            </div>\n" +
"        </nav>\n" +
"    </header>\n" +
"    &nbsp;&nbsp;&nbsp;&nbsp;\n" +
"    &nbsp;&nbsp;&nbsp;&nbsp;\n" +
"    &nbsp;&nbsp;&nbsp;&nbsp;\n" +
"\n" +
"    <h2 align=\"center\" style=\"color: white;\"><i>Room Reservation </i> </h2>\n" +
"\n" +
"    <table id=\"customers\">\n" +
"                <tr>\n" +
"                <th>Room ID</th>\n" +
"                <th>Room Type</th>\n" +
"                <th>Room Location</th>\n" +
"                <th>Room Charge</th>\n" +
"                <th>Room Status</th>\n" +
"                <th>Payment Status</th>\n" +
"              </tr>\n" );
 for(int i=0;i<room.size();)  
{
 
          pw.println(" <tr>\n" +
"    <td>"+room.get(i)+" </td>\n" +
"    <td> "+room.get(i+1)+"</td>\n" +
"    <td> "+room.get(i+2)+"</td>\n" +
"    <td> "+room.get(i+3)+"</td>\n" +
"    <td> "+room.get(i+4)+"</td>\n" +
"    <td>Not Paid</td>\n" +


"    \n" +
"  </tr>");
   
         i=i+5;
  
}
       
        pw.println(
"            </table>\n" +

//"            <a href=\"insert.html\"><button name=\"subbtn\" class=\"subbutton\">Insert</button></a>\n" +
        
"</body>\n" +
"</html>");
    }
    
    public void student_room(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
"    <meta name=\"description\" content=\"Dobro dosli u najbolji kafic na svetu\">\n" +
"    <meta name=\"keywords\" content=\"Kafic\">\n" +
"    <link href=\"//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.no-icons.min.css\" rel=\"stylesheet\">\n" +
"<link href=\"//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css\" rel=\"stylesheet\">\n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"css/style.css\">\n" +
"    <title>Web Tech Assignment</title>\n" +
"    <style>\n" +
"        body {\n" +
"            background-color: #303641;\n" +
"        }\n" +
"    </style>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    <header>\n" +
"        <nav id=\"navbar\">\n" +
"            <div class=\"container\">\n" +
"                <h1 class=\"logo\"><a href=\"index.html\">Student Accomodation System</a></h1>\n" +
"                <ul>\n" +
"                    <li><a class=\"current\" href=\"index.html\">Home</a></li>\n" +
"                    <li><a href=\"Admin.html\">Admin</a></li>\n" +
"                    <li><a href=\"Student.html\">Student</a></li>\n" +
"         <li><a href=\"#\">  <form action=\"Student\" method=\"POST\"><button type=\"submit\" name=\"login\" value=\"Checkin\" >Checkin</button></form></a></li>\n" +               
"                </ul>\n" +
"            </div>\n" +
"        </nav>\n" +
"    </header>\n" +
"    &nbsp;&nbsp;&nbsp;&nbsp;\n" +
"    &nbsp;&nbsp;&nbsp;&nbsp;\n" +
"    &nbsp;&nbsp;&nbsp;&nbsp;\n" +
"\n" +
"    <h2 align=\"center\" style=\"color: white;\"><i>Room Reservation </i> </h2>\n" +
"\n" +
"    <table id=\"customers\">\n" +
"                <tr>\n" +
"                <th>Room ID</th>\n" +
"                <th>Room Type</th>\n" +
"                <th>Room Location</th>\n" +
"                <th>Room Charge</th>\n" +
"                <th>Payment Status</th>\n" +
"                <th>Check Status</th>\n" +                
"              </tr>\n" );
for(int i=0;i<room.size();)  
{
    if(logid.equals(room.get(i+4))){
          pw.println(" <tr>\n" +
"    <td>"+room.get(i)+" </td>\n" +
"    <td> "+room.get(i+1)+"</td>\n" +
"    <td> "+room.get(i+2)+"</td>\n" +
"    <td> "+room.get(i+3)+"</td>\n" + 
"    <td>Not Paid</td>\n" + 
"         <td><a href=\"#\"><form action=\"Student\" method=\"POST\"><button type=\"submit\" name=\"login\" value=\"checkout"+room.get(i)+"\" >Checkout</button></form></a></td>\n" +
"              </tr>\n" );
            
        }
    i=i+5;}
        pw.println(
"            </table>\n" +
//"            <a href=\"insert.html\"><button name=\"subbtn\" class=\"subbutton\">Insert</button></a>\n" +
        
"</body>\n" +
"</html>");
    }

    
public void room_available(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n" +
"    <meta name=\"description\" content=\"Dobro dosli u najbolji kafic na svetu\">\n" +
"    <meta name=\"keywords\" content=\"Kafic\">\n" +
"    <link href=\"//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.no-icons.min.css\" rel=\"stylesheet\">\n" +
"<link href=\"//netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css\" rel=\"stylesheet\">\n" +
"\n" +
"    <link rel=\"stylesheet\" href=\"css/style.css\">\n" +
"    <title>Web Tech Assignment</title>\n" +
"    <style>\n" +
"        body {\n" +
"            background-color: #303641;\n" +
"        }\n" +
"    </style>\n" +
"</head>\n" +
"\n" +
"<body>\n" +
"    <header>\n" +
"        <nav id=\"navbar\">\n" +
"            <div class=\"container\">\n" +
"                <h1 class=\"logo\"><a href=\"index.html\">Student Accomodation System</a></h1>\n" +
"                <ul>\n" +
"                    <li><a class=\"current\" href=\"index.html\">Home</a></li>\n" +
"                    <li><a href=\"Admin.html\">Admin</a></li>\n" +
"                    <li><a href=\"Student.html\">Student</a></li>\n" +
"         <li><a href=\"#\">  <form action=\"Student\" method=\"POST\"><button type=\"submit\" name=\"login\" value=\"Checkin\" >Checkin</button></form></a></li>\n" +
"                </ul>\n" +
"            </div>\n" +
"        </nav>\n" +
"    </header>\n" +
"    &nbsp;&nbsp;&nbsp;&nbsp;\n" +
"    &nbsp;&nbsp;&nbsp;&nbsp;\n" +
"    &nbsp;&nbsp;&nbsp;&nbsp;\n" +
"\n" +
"    <h2 align=\"center\" style=\"color: white;\"><i>Room Reservation </i> </h2>\n" +
"\n" +
"    <table id=\"customers\">\n" +
"                <tr>\n" +
"                <th>Room ID</th>\n" +
"                <th>Room Type</th>\n" +
"                <th>Room Location</th>\n" +
"                <th>Room Charge</th>\n" +
"                <th>Check Status</th>\n" +
"              </tr>\n" );
        
int j=0; 
for(int i=0;i<room.size();)  
{
  
    if(room.get(i+4).equals("Available")){
          pw.println(" <tr>\n" +
"    <td>"+room.get(i)+" </td>\n" +
"    <td> "+room.get(i+1)+"</td>\n" +
"    <td> "+room.get(i+2)+"</td>\n" +
"    <td> "+room.get(i+3)+"</td>\n" +
"<td><a href=\"#\"><form action=\"Student\" method=\"POST\"><button type=\"submit\" name=\"login\" value=\"check-in"+j+"\" >Checkin</button></form></a></td>\n" +

"    \n" +
"  </tr>");
    
    }
    i=i+5;
    j++;
  
}
    
        
pw.println(
"</table>\n" +
"\n" +
"</body>\n" +
"</html>\n" +
"\n" +
"");
    }
    
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        ArrayList err = new ArrayList();
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        String SN = req.getParameter("login");
        if (SN.equals("Sign up")) {
            f = 1;
            user = req.getParameter("username");
            id = req.getParameter("ID");
            pwd = req.getParameter("pwd");
            cpwd = req.getParameter("cpwd");
            res.sendRedirect("StdLogin.html");
        } 
        
        else if (SN.equals("update"))
        { 
            int c=0;
            
            id = req.getParameter("urid");
            pwd = req.getParameter("urt");
            String fname = req.getParameter("url");
            String lname = req.getParameter("urc");
            for(int i=0;i<room.size();i=i+5)
            {
                if(id.equals(room.get(i)))
                {
                    c=1;
                    room.set(i,id);
                room.set(i+1,pwd);
                room.set(i+2,fname);
                room.set(i+3,lname);
                room.set(i+4,"Available");
                room(req,res);
                }
            }
            if(c==0)
            {
                pw.println("<html>\n" +
"    \n" +
"    <body>\n" +
"        <script>\n" +
"            alert(\"Room id does not exist\");\n" +
                        "location.replace(\"update.html\")\n"+
"            </script>\n" +
"    </body>\n" +
"    \n" +
"</html>");
                
            }
            
        }
        
        else if(SN.equals("Checkin"))
        {
           room_available(req,res); 
        }
        
         else if(SN.startsWith("check-in"))
        {
           String s=SN.substring(8);
           int n=Integer.parseInt(s);
           room.set((n*5)+4,logid);
           student_room(req,res);
        }   
        
        else if(SN.startsWith("checkout"))
        {
           
           String s=SN.substring(8);
           for(int i=0;i<room.size();i=i+5)
           {
               if(s.equals(room.get(i)))
               {
                   room.set(i+4,"Available");
                   break;
               }
           }
           student_room(req,res);
        }   
    
        
        else if (SN.equals("login")) {

            user = req.getParameter("ID");
            pwd = req.getParameter("pwd");
//        Stud_Marks = req.getParameter("smarks");
            for (int i = 0; i < studList.size(); i = i + 2) {
                if (user.equals(studList.get(i)) && pwd.equals(studList.get(i+1))) {
//            res.sendRedirect("index.html");
                    logid = "Reserved by "+ user;
                    student_room(req,res);
                }
            }
        }
        else if(SN.equalsIgnoreCase("Admin")){
String usr= req.getParameter("username");
            String pwd= req.getParameter("pwd");

            if(usr.equalsIgnoreCase("admin") && pwd.equals("12345"))
            {    
                room(req,res);
            }
}
         else if (SN.equals("insert"))
        {
            f = 1;
            id = req.getParameter("rid");
            pwd = req.getParameter("rt");
            String fname = req.getParameter("rl");
            String lname = req.getParameter("rc");
            room.add(id);
            room.add(pwd);
            room.add(fname);
            room.add(lname);
            room.add("Available");
           room(req,res);
        }  
        
        else if(SN.equals("del"))
        {
           id = req.getParameter("urid");
           int c=0;
           for(int i=0;i<room.size();i=i+5)
           {
               if(id.equals(room.get(i)))
               {
                   c=1;
                   room.remove(i);
                   room.remove(i);
                   room.remove(i);
                   room.remove(i);
                   room.remove(i);
                   break;
               }
           }
           if(c==1)
           {
               room(req,res);
           }
           else
           {
              pw.println("<html>\n" +
"    \n" +
"    <body>\n" +
"        <script>\n" +
"            alert(\"Room id does not exist\");\n" +
                        "location.replace(\"delete.html\")\n"+
"            </script>\n" +
"    </body>\n" +
"    \n" +
"</html>"); 
           }
        }
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter pw = res.getWriter();
        Student ob = new Student();
        ob.doGet(req, res);
        if (f == 1) {
            f = 0;
            studList.add(ob.id);
            studList.add(ob.pwd);
        }
        pw.close();
    }

}