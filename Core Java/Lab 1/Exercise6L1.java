class Difference {


int calculateDifference(int n) {
int sumofSquares;
int squareofSum;
int diff;

sumofSquares = (n * (n + 1) * (2 * n + 1)) / 6;
squareofSum = (n * (n + 1)) / 2;
squareofSum = squareofSum * squareofSum;
diff = sumofSquares - squareofSum;
return diff;
}

}

class Exercise6L1 {

public static void main(String[] args) {

int ans;
Difference difference = new Difference();
ans = difference.calculateDifference(10);
System.out.println("Difference is "+ans);

}

}