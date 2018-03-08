package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entity.bookentity;
import model.Connectionwithmysql;

public class bookmodel {
public  List<bookentity>FindAll(){
		
		try{
			    List<bookentity> listBooks=new ArrayList<bookentity>();
			PreparedStatement ps=Connectionwithmysql.ConnDb().prepareStatement("select * from books");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				bookentity b=new bookentity();
				b.setId(rs.getInt("ID"));
				b.setName(rs.getString("Name"));
				listBooks.add(b);
			}
			return listBooks;
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,e);
			return null;
		}
		
		
	}
}
