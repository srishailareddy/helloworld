package onedirectpackage;

import java.util.Scanner;




class SalesTax{
	public void salesTaxLiability( String itemtype,double itemprice){
if (itemtype.equals("raw")){
	System.out.println("raw tax");
	
	 double rawtax=((12.5*itemprice)/100);
	 double totalprice =(rawtax+itemprice);
	 System.out.println("itemtype="+itemtype);
	 System.out.println("itemprice="+itemprice);
	 System.out.println("rawtax="+rawtax);
	 System.out.println("toatal price="+totalprice);
}
		 else if(itemtype.equals("manufactured")){
			 System.out.println("manufactured tax");
			 double rawtax=((12.5*itemprice)/100);
			 
			 double manufacturedtax=(rawtax+(2*(itemprice+rawtax)/100));
			 double totalprice=(manufacturedtax+itemprice);
			 System.out.println("itemtype="+itemtype);
			 System.out.println("itemprice="+itemprice);
			 System.out.println("manufacturedtax="+manufacturedtax);
			 System.out.println("toatal price="+totalprice);
			 
		 }else{
			 System.out.println("product tax");
			 if(itemprice<=100){
				 int surcharge=5;
				 double producttax=(((10*itemprice)/100)+surcharge);
				 double totalprice=(producttax+itemprice);
				 System.out.println("itemtype="+itemtype);
				 System.out.println("itemprice="+itemprice);
				 System.out.println("manufacturedtax="+producttax);
				 System.out.println("toatal price="+totalprice);
				
			 }
			 else if(itemprice<=200){
				 int surcharge=10;
				 double producttax=(((10*itemprice)/100)+surcharge);
				 double totalprice=(producttax+itemprice);
				 System.out.println("itemtype="+itemtype);
				 System.out.println("itemprice="+itemprice);
				 System.out.println("manufacturedtax="+producttax);
				 System.out.println("toatal price="+totalprice);
			 }
			 else
			 {
			 double surcharge=((5*itemprice)/100);
			 double producttax=(((10*itemprice)/100)+surcharge);
			 double totalprice=(producttax+itemprice);
			 System.out.println("itemtype="+itemtype);
			 System.out.println("itemprice="+itemprice);
			 System.out.println("manufacturedtax="+producttax);
			 System.out.println("toatal price="+totalprice);
		 }
			
			
	}

}

public static class ShoppingCart {


    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
         
       
          
        String isContinue = "yes";
        
        
        String itemname;  
        double itemprice;
        
        int itemquantity ;
        String itemtype;
       
        
 
     // Initialized to summation
 
        while(isContinue.equals("yes"))
        {           
        	//name of an item as String value;
        	 System.out.println("Please enter the name of a new item  ");
             itemname = in.next();
             //type of an item as String value;
             System.out.println("Please enter the type of a new item  ");
             itemtype = in.next();
        	
            
        // Read the unit price as a double value
            System.out.println("Please enter the price of a new item  ");
            itemprice = in.nextDouble();
            
         
 
        // quantity of items as int
            System.out.println("Please enter the quantity of this item  ");
            itemquantity  = in.nextInt();

           
             
            System.out.println("Continue? (yes/no)");
            
            isContinue =in.next();
           
             SalesTax st=new SalesTax();
            st.salesTaxLiability(itemtype, itemprice);
      
        }
        }  
        }
        
    }
         
    
  
   
                  
    



