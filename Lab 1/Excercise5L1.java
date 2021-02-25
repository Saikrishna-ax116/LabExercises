//class of sum of natural numbers % by 3 and 5

class SumofNaturalNum {

int calculateSum(int n) {
int sum = 0;
for (int num=0; num<=n; num++) {
if (num % 3 == 0 || num % 5 == 0) {
sum += num;
}

} 
return sum;
}

}

class Excercise5L1 {

public static void main(String[] args) {

int sumofNum;
SumofNaturalNum total = new SumofNaturalNum();
sumofNum = total.calculateSum(10);
System.out.println("Sum is: "+sumofNum); 

}

}