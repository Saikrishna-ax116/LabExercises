class IncreasingNum {


boolean checkNumber (int number) {
boolean flag = true;

int currentDigit = number % 10;
number /= 10;

while (number>0) {
if (currentDigit<number % 10) {

flag = false;
break;

}
else {

currentDigit = number % 10;
number /= 10;
}

}
return flag;
}

}

class Exercise7L1 {

public static void main(String[] args) {

boolean ans;
IncreasingNum num = new IncreasingNum();
ans = num.checkNumber(122345);
if (ans) {

System.out.println("Given num is an increasing number");
}
else {
System.out.println("Given num is not an increasing number");

}


}

}