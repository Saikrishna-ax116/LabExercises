class PowerOf2 {

boolean checkNumber(int n) {

boolean flag = true;

if (n % 2 != 0) {
flag = false;
}
return flag;
}

}

class Exercise8L1 {

public static void main(String[] args) {

boolean ans;
PowerOf2 number = new PowerOf2();
ans = number.checkNumber(136);
if (ans) {
System.out.println("Given no. is a power of 2");
}
else {
System.out.println("Given no. is not a power of 2");
}
}

}