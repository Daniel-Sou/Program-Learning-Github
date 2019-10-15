# Lab 1 

## Example 4. Java input

**Scanner class​**
- in package util​
- input is obtained by Space, Tab and Enter,​

and Enter​

**BufferedReader class​**
- in package io​
- input can include Space​

​Q1. Code
```Java


import java.io.*;

class Q1
{
  public static void main(String args[]) throws IOException 
  {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
           String str = null; 
           while(true)
           {
             System.out.println("Enter your value:"); 
             str = br.readLine(); 
             System.out.println("your value is :"+str); 
             int n = Integer.parseInt(str);
             if(n==0)
               break;
             int m=2;
             isMultiple(m,n);
           }
  }
  public static void isMultiple(int m,int n)
  {
    if(n%m==0)
    {
      System.out.println("True");//Output
    }
    else
    {
      System.out.println("False");//Output
    }
  }
}

```


```