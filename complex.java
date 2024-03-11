class complex{
double real,imaginary;

public complex(double real,double imaginary){
this.real=real;
this.imaginary=imaginary;
}
 public complex add(complex other){
double realSum=this.real+other.real;
double imaginarySum=this.imaginary+other.imaginary;
return new complex(realSum,imaginarySum);
}

public String toString(){
return "(" + real + " +"+ imaginary + "i)";
}

public static void main(String[] args){
complex num1=new complex(2,3);
complex num2=new complex(4,-1);
complex sum=num1.add(num2);
System.out.println("Sum: " + sum);
}
}

