import 'dart:ffi';

void main() {
print( 12.compareTo(13));
print(int.tryParse("1"));

print("..................................");
//////////////////

dynamic x= "";
x=5;
var y = 6;
//y= "";
  print("..................................");

///////////////////

List<String> l1 = List.filled(5, "fill");
print(l1);

for(var i in l1){
  print(i);
}

  print("..................................");

//////////////////

List<int> l2 = [1,2,3,4,4];
print(l2[0]);
print(l2);
print(l2.toSet());
l2.add(6);
print(l2);



  for(var i in l2){
    print(i);
  }

  print("//////////////////////////////");
  l2.forEach((element) {
    print(element);
  });

  print("..................................");

/////////////

Set<int> s1={1,1,1,1,2,2,2,3,3,3,4,4,4};
print(s1);
s1.add(5);
print(s1);
print(s1.toList());

  print("..................................");

///////////////

Map<String,int> M1= {"a":1,"b":2};
print(M1);
print(M1["a"]);
print(M1["c"]);

  print("..................................");

//////////////
final int f1 =5;
final f2 =5;

const String s = "";
const ss = "";

////////////

  print("..................................");

  print(5 ~/ 6);
print(5 / 6);

////////////

  print("..................................");

  var a;
var b= 10;
var d = 10;
var c;
c ??= b+d;
print(c);
c = a ?? b;
print(c);
print(a);
c = a ??= b;
print(c);
print(a);

  print("..................................");
///////////////////////////////////////////////

try{
  int v = 5~/0;
}on UnsupportedError{
  print("Cant divide by zero");
}catch(e){
  print(e);
}finally{
  print("done");
}
print("//////////////////////////////");
  try{
    int v = 5~/0;
  }catch(e){
    print(e);
  }finally{
    print("done");
  }


}
