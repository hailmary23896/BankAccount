import java.util.*;
public class MainAccount
{
    public static void main(String args[])
    {
        int a,m,i;
        double b;
        String type;
    
        Scanner in =new Scanner(System.in);
        Scanner ins =new Scanner(System.in);
        
        System.out.print("Total number of accounts :");
        int n=in.nextInt();
        
        
        Current curr[]=new Current[n];
        Saving sav[]=new Saving[n];
    
        for(i=0 ; i<n ; i++)
        {
            System.out.println("");
            System.out.print("Account number : ");
            a=in.nextInt();
            System.out.print("Initial balance : ");
            b=in.nextDouble();
            System.out.print("No of months since you activated you account : ");
            m=in.nextInt();
            
            curr[i]=new Current(a,b,"current");
            
            if(m>=12)
            {
                int d=m/12;
                double y=Math.pow(1.05,d);
                double k=b*y;
                sav[i]=new Saving(a,k,"saving",m);
            }
            else
                sav[i]=new Saving(a,b,"saving",m);
                
        }
        System.out.println("");
        System.out.print("Account number where operations have to be performed : ");
        int ref=in.nextInt();
        int c=1;
        while(c==1)
        {
            int indexc=-1;
            int indexs=-1;
                   
           System.out.println("");
           System.out.println("1.debit     2.credit    3.details of account");
           System.out.print("Enter your choice : ");
           int choice=in.nextInt();
           
           System.out.print("Choose account type where operation has to be performed(saving / current ) : ");
           String ref_type=ins.nextLine();
           
           if(ref_type.equals("saving"))
           {
               for(i=0;i<n;i++)
               {
                   if(sav[i].ac_no==ref)
                   {
                       indexs=i;
                   }
                }
            }
            else if(ref_type.equals("current"))
           {
               for(i=0;i<n;i++)
               {
                   if(curr[i].ac_no==ref)
                   {
                       indexc=i;
                   }
                }
            }
            if( indexc==-1 && indexs== -1)
            System.out.println("Invalid ID !!!");
            
            switch(choice)
            {
                case 1:
                    if(indexc!=-1)
                        curr[indexc].debit();
                    else if(indexs!=-1)
                        sav[indexs].debit();
                        break;
                case 2:
                    if(indexc!=-1)
                        curr[indexc].credit();
                    else if(indexs!=-1)
                        sav[indexs].credit();
                        break;
                case 3:
                    if(indexc!=-1)
                        curr[indexc].display();
                    else if(indexs!=-1)
                        sav[indexs].display();
                        break;
                default:
                    System.out.println("Incorrect choice!!");
             }
             
            System.out.println("Do you want to continue (yes (1) / no (0) : ");
            c=in.nextInt();
            
         }
                    
                    
            
            
            
            
            
            
            
        }
    }
        
    
    
    
    
    
    
    
