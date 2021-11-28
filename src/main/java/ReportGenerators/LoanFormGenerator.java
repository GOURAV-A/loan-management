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
 
public class LoanFormGenerator {
 
 //public static void main(String[] args) {
public void	generateLoanFormPDF(String loanTypes, String incomeTypes, String fullNamePan, String panNumber,
		String dob, String aadharId, String mobileNumber, String fathersName, String mothersName,
		String curentAddress, String permanentAddress, String highestQualification, String loanAmount,
		String loanTerms, String otherEmi, String accountNumber, String ifsccode, String accountHolder,
		String bankAddress, String employerName, String employerAddress, String monthlyIncome, String employeeId,
		String employeeRole, String uan,String loanDescription,String regEmailId,String emiAmountPerMonth) {
  String pdfFilename = "LoanRegistrationForm.pdf";
  LoanFormGenerator printReport = new LoanFormGenerator();

  printReport.createPDF(pdfFilename,loanTypes, incomeTypes, fullNamePan, panNumber, dob, aadharId, mobileNumber, fathersName,
			mothersName, curentAddress, permanentAddress, highestQualification, loanAmount, loanTerms, otherEmi,
			accountNumber, ifsccode, accountHolder, bankAddress, employerName, employerAddress, monthlyIncome,
			employeeId, employeeRole, uan,loanDescription,regEmailId,emiAmountPerMonth);
  System.out.println("Loan Form PDF Generated successfully !!!!!!!!!!!!!!!!!!!!!");
 
 }
 
 private void createPDF (String pdfFilename,String loanTypes, String incomeTypes, String fullNamePan, String panNumber,
			String dob, String aadharId, String mobileNumber, String fathersName, String mothersName,
			String curentAddress, String permanentAddress, String highestQualification, String loanAmount,
			String loanTerms, String otherEmi, String accountNumber, String ifsccode, String accountHolder,
			String bankAddress, String employerName, String employerAddress, String monthlyIncome, String employeeId,
			String employeeRole, String uan,String loanDescription,String regEmailId,String emiAmountPerMonth){
 
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
   insertCell(table, "Loan Form At LoansToGo Application Plateform ...", Element.ALIGN_CENTER, 4, bfBold12);
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
   
			
     
    insertCell(table, "Loan Types" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, loanTypes, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Income Types" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, incomeTypes, Element.ALIGN_RIGHT, 1, bf12);
   
    insertCell(table, "Full Name as per Pan" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, fullNamePan, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Pan Number" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, panNumber, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "DOB" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, dob, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Aadhar Id" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, aadharId, Element.ALIGN_RIGHT, 1, bf12);
    
    
    insertCell(table, "Mobile Number" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, mobileNumber, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "father's Name" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, fathersName, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Mother's Name" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, mothersName, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Current Address" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, curentAddress, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Permanent Address" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, permanentAddress, Element.ALIGN_RIGHT, 1, bf12);
    
    
   
    
    insertCell(table, "Highest Qualification" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, highestQualification, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Loan Amount" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, loanAmount, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Loan Terms" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, loanTerms, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Other Emi" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, otherEmi, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Account Number" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, accountNumber, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "IFSC Code" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, ifsccode, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Account Holder" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, accountHolder, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Bank Address" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, bankAddress, Element.ALIGN_RIGHT, 1, bf12);
    
    
    insertCell(table, "Employer Name" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, employerName, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Employer Address" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, employerAddress, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Monthly Income" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, monthlyIncome, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Employee Id" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, employeeId, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Employee Role" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, employeeRole, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "UAN" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, uan, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Loan Description " , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, loanDescription, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "Registered EmailId" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, regEmailId, Element.ALIGN_RIGHT, 1, bf12);
    
    insertCell(table, "EMI Amount Per month" , Element.ALIGN_LEFT, 1, bf12);
    insertCell(table, emiAmountPerMonth, Element.ALIGN_RIGHT, 1, bf12);
     
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