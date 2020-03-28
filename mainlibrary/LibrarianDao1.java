package mainlibrary;

import java.sql.*;
public class LibrarianDao1 {

	
	public static int save(String name,String password,String email,String address,String city,String contact){
		int status=0;
		try{
			
                    Connection con=DB1.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into library.librarian(name,password,email,address,city,contact) values(?,?,?,?,?,?)");
			ps.setString(1,name);
			ps.setString(2,password);
			ps.setString(3,email);
			ps.setString(4,address);
			ps.setString(5,city);
			ps.setString(6,contact);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(int id){
		int status=0;
		try{
			Connection con=DB1.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from library.Librarian where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

	public static boolean validate(String name,String password){
		boolean status=false;
		try{
			Connection con=DB1.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from library.Librarian where LibrarianID=? and Password=?");
			ps.setString(1,name);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

}
