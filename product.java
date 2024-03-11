public class product{
String pcode;
String pname;
double price;

public product(String pcode,String pname,double price){
this.pcode=pcode;
this.pname=pname;
this.price=price;
}

public static void main(String[]args)
{

product product1=new product("P001","product1",20.5);
product product2=new product("P002","product2",17.0);
product product3=new product("P003","product3",14.7);
product minPriceProduct=product1;
if(product2.price<minPriceProduct.price)
{
minPriceProduct=product2;
}
if(product3.price<minPriceProduct.price)
{
minPriceProduct=product3;
}
System.out.println("The product with lowest price is " + minPriceProduct.pname + " with code" + minPriceProduct.pcode + " and price " + minPriceProduct.price + ".");
}
}

















