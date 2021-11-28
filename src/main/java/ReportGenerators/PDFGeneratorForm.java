package ReportGenerators;




import java.io.FileOutputStream;
import java.text.DecimalFormat;
 
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
 
public class PDFGeneratorForm {
 
 //public static void main(String[] args) {
public void	generatePDF(String userTypes,String firstName,String lastName,String mobile,
		String emailId,String fathersName,String mothersName,String curentAddress,String permanentAddress) {
  String pdfFilename = "UserRegistrationForm.pdf";
  PDFGeneratorForm printReport = new PDFGeneratorForm();

  printReport.createPDF(pdfFilename,userTypes,firstName,lastName,mobile,emailId,fathersName,mothersName,curentAddress,permanentAddress);
  System.out.println("PDF Generated successfully !!!!!!!!!!!!!!!!!!!!!");
 
 }
 
 private void createPDF (String pdfFilename,String userTypes,String firstName,String lastName,String mobile,
			String emailId,String fathersName,String mothersName,String curentAddress,String permanentAddress){
 
  Document doc = new Document();
  PdfWriter docWriter = null;
 
  DecimalFormat df = new DecimalFormat("0.00");
 
  try {
   
   //special font sizes
   Font bfBold12 = new Font(FontFamily.TIMES_ROMAN, 12, Font.BOLD, new BaseColor(0, 0, 0));
   Font bf12 = new Font(FontFamily.TIMES_ROMAN, 12);
 
   //file path
   String path = "D://Final Imlemented Projet latest//Reports of Project/" + pdfFilename;
   docWriter = PdfWriter.getInstance(doc , new FileOutputStream(path));
   
   //document header attributes
   doc.addAuthor("betterThanZero");
   doc.addCreationDate();
   doc.addProducer();
   doc.addCreator("MySampleCode.com");
   doc.addTitle("Report with Column Headings");
   doc.setPageSize(PageSize.LETTER);
   
   //open document
   doc.open();
 
   //create a paragraph
   Paragraph paragraph = new Paragraph("Welcome to LoansToGo. Congratulations for you business with Loans to Go. The registration form is shred as below. LoansToGo is a loan management system to provide the best financial solutions as per the market standard.");
   
   
   //specify column widths
   float[] columnWidths = {5f, 5f};
   //create PDF table with the given widths
   PdfPTable table = new PdfPTable(columnWidths);
   // set table width a percentage of the page width
   table.setWidthPercentage(90f);
 
   //insert column headings
   insertCell(table, "Registration At LoansToGo ...", Element.ALIGN_CENTER, 4, bfBold12);
 //insert an empty row
   insertCell(table, "", Element.ALIGN_LEFT, 4, bfBold12);
   insertCell(table, "Registration Form Fields", Element.ALIGN_LEFT, 1, bfBold12);
   insertCell(table, "Registration Form Field values", Element.ALIGN_LEFT, 1, bfBold12);
   
   
   
   
   
   
   
   
  //insertCell(table, "Account Name", Element.ALIGN_LEFT, 1, bfBold12);
   //insertCell(table, "Order Total", Element.ALIGN_RIGHT, 1, bfBold12);
   table.setHeaderRows(1);
 
   //insert an empty row
   insertCell(table, "", Element.ALIGN_LEFT, 4, bfBold12);
   //create section heading by cell merging
   
   double orderTotal, total = 0;
   
   //just some random data to fill
   
   //,String ,
	//String ,String ,String ,String ,String 
     
    insertCell(table, "Fisrt Name" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, firstName, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Last Name" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, lastName, Element.ALIGN_RIGHT, 1, bf12);
   
    insertCell(table, "User Types" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, userTypes, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Mobile" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, mobile, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Email Id" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, emailId, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Father's Name" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, fathersName, Element.ALIGN_RIGHT, 1, bf12);
    
    
    insertCell(table, "Mother's Name" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, mothersName, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Current Address" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, curentAddress, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Permanent Address" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, permanentAddress, Element.ALIGN_RIGHT, 1, bf12);
     
    //insert an empty row
    insertCell(table, "", Element.ALIGN_LEFT, 4, bfBold12);
    insertCell(table, "Thank you  ...", Element.ALIGN_CENTER, 4, bfBold12);
   
 
   
   //add the PDF table to the paragraph
   paragraph.add(table);
   // add the paragraph to the document
   doc.add(paragraph);
 
  }
  catch (DocumentException dex)
  {
   dex.printStackTrace();
  }
  catch (Exception ex)
  {
   ex.printStackTrace();
  }
  finally
  {
   if (doc != null){
    //close the document
    doc.close();
   }
   if (docWriter != null){
    //close the writer
    docWriter.close();
   }
  }
 }
 
 private void insertCell(PdfPTable table, String text, int align, int colspan, Font font){
   
  //create a new cell with the specified Text and Font
  PdfPCell cell = new PdfPCell(new Phrase(text.trim(), font));
  //set the cell alignment
  cell.setHorizontalAlignment(align);
  //set the cell column span in case you want to merge two or more cells
  cell.setColspan(colspan);
  //in case there is no text and you wan to create an empty row
  if(text.trim().equalsIgnoreCase("")){
   cell.setMinimumHeight(10f);
  }
  //add the call to the table
  table.addCell(cell);
   
 }
 
}