package mainlibrary;

import com.itextpdf.text.Chapter;
import  com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Header;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mainlibrary.DB1;

public class pdf
{
    public static int main(String args[])
    {
        int coloum,i;
        String[]  row=new String[3];
    
        Document document=new Document();
        
                
        
        try(Connection Con = DB1.getConnection()) {
        
        
            PreparedStatement ps=Con.prepareStatement("select IssuedBook.BookID,IssuedBook.UserID,Books.BookName , IssuedBook.IssueDate, IssuedBook.ReturnDate from library.Books,library.IssuedBook where Books.BookID=IssuedBook.BookID",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs= ps.executeQuery();
            
            ResultSetMetaData rsmd = rs.getMetaData();
            
            try
            {
                PdfWriter writer;
                writer =PdfWriter.getInstance(document,new  FileOutputStream("Report.pdf"));
                document.open();
                document.add(new LineSeparator());
                document.add( new Paragraph("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\\t\t\t\t\t\t\t\t\t\t Welcome To Library managment system"));
                document.add( new Paragraph(" \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t****************************   REPORT  ******************************"));
              
                ;
                document.add( new Paragraph("Issued Book List \n"));
                document.add( new Paragraph(" \n"));
                        document.add( new Paragraph(" \n"));
                document.add(new LineSeparator());
                PdfPTable table=new PdfPTable(5);
                table.setWidthPercentage(105);
                table.setSpacingBefore(11f);
                table.setSpacingAfter(11f);
                float[] colWidth={2f,2f,2f,2f,2f};
                table.setWidths(colWidth);
                PdfPCell c1=new PdfPCell(new Paragraph("BookId"));
                PdfPCell c2=new PdfPCell(new Paragraph("UserId"));
                PdfPCell c3=new PdfPCell(new Paragraph("Book"));
                PdfPCell c4=new PdfPCell(new Paragraph("IssuedDate"));
                PdfPCell c5=new PdfPCell(new Paragraph("returnDate"));
                table.addCell(c1);
                table.addCell(c2);
                table.addCell(c3);
                table.addCell(c4);
                table.addCell(c5);
                document.add(table);
List orderList=new List(List.ORDERED);
//orderList.add(new ListItem(rs.getString(i)));
                
                while(rs.next()){
                    
                
                table.setWidths(colWidth);
                PdfPCell c6=new PdfPCell(new Paragraph(rs.getString(1)));
                PdfPCell c7=new PdfPCell(new Paragraph(rs.getString(2)));
                PdfPCell c8=new PdfPCell(new Paragraph(rs.getString(3)));
                PdfPCell c9=new PdfPCell(new Paragraph(rs.getString(4)));
                PdfPCell c10=new PdfPCell(new Paragraph(rs.getString(5)));
                table.addCell(c6);
                table.addCell(c7);
                table.addCell(c8);
                table.addCell(c9);
                table.addCell(c10);
                document.add(table);
                  
                    
                    
                }
                document.close();
                
            }   catch (SQLException ex) {
                return 1;
                
            } catch (DocumentException ex) {
               return 2;
            } catch (FileNotFoundException ex) {
                return 3;
                
            }
            
            
            
        }   catch (SQLException ex) {
            return 1;        }
        return 0;
    
    
    
}
    }
