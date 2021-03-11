class Reverse {

int getSorted(int[] ary) {

for (int i=0; i<=ary.length; i++) {
rev = 0;
while (i !=0) {
int digit = i % 10;
rev = rev * 10 + digit;
i = i / 10;
}
}
for (int j=0; i<ary.length; j++) {

for (int k=j+1; k<ary.length; k++) {

int temp = 0;
if (ary[j]>ary[k]) {

temp = ary[j];
ary[j] = ary[k];
ary[k] = temp;
}
}
}
return ary;
}

}

class Exercise2L2 {

public static void main(String[] main) {

int [] arr = new int[]{23, 45, 3, 12, 77, 45};
Reverse newArr = new Reverse();
ans = newArr.getSoeted(arr);
System.out.println(+ans);

}

}