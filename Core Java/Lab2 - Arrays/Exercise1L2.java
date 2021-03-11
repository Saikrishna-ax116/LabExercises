class SmallestNumber {

int getSecondSmallest(int[] ary){

for (int i=0; i<ary.length; i++) {

for (int j=i+1; j<ary.length; j++) {

int temp = 0;
if (ary[i]>ary[j]) {

temp = ary[i];
ary[i] = ary[j];
ary[j] = temp;

}

}

}
return ary[1];
}
}

class Exercise1L2 {

public static void main(String[] args) {

int ans;
int [] arr = new int[]{20, 22, 5, 40, 10};
SmallestNumber newArray = new SmallestNumber();
ans = newArray.getSecondSmallest(arr);
System.out.println(+ans);

}


}