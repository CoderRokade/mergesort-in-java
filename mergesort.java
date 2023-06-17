import java.util.*;

public class mergesort{
  
    public static void split(int a[],int si, int ei){
        if(si==>ei){
            return;
        }

        int mid = si + (ei-si)/2;
            // kaam
            split(a,si,mid);
            split(a,mid+1,ei);   
            sortedmerge(a,si,ei,mid);  

        }

    public static void sortedmerge(int a[],int si,int ei,int mid){
        int temp[] = new int[ei-si+1];
        
        int i=si; //left part ko traverse krne wala itrator
        int j=mid+1;  //right
        int l=0;  //itrator temp ke liye

        while(i<=mid && j<=ei){
            if(a[i]<a[j]){
                temp[l] = a[i];
                i++;
            }

            else{
                temp[l] = a[j];
                j++;
            }
            l++;
        } 
        
        // now is wale while loop me right me jo value chut jayege usko 
        // temp me store kra dege

        // int i=si; 
        // int j=mid+1;

        while(i<=mid){
            // temp[l] = a[i];
            // i++;
            // l++;   or 
            temp[l++] = a[i++];
        }
        // abhi left part ke liye 
        while(j<=ei){
            temp[l++] = a[j++];
            // j++;
            // l++;
        }
        
    }
  public static void printarry(int a[]){

        for(int i=0;i<a.length;i++){

            System.out.print(a[i] + " ") ;

        }

    }

    public static void main(String args[]){
        
        int a[] = {2,6,9,7,1,5};
        // System.out.print(a[0]);
        split(a,0,a.length);
        printarry(a);
        

    }
}