import 'lib.dart';
import 'modifiers.dart';
import 'test_setter_getter.dart';
import 'dart:math' as math;
void main(){
  var c1 = Circle(r:5);
  var c2 = Circle.raduis(10);
  print(c1.findArea());
  print(c2.findArea());
  c1._raduis = 5;

}

class Circle{
  double _raduis = 1;
  double raduis = 1;

  Circle.raduis(this._raduis);

///////////////////////////

  // Circle(){
  //   this.raduis = 5;
  // }

  //////////////////////////

  // Circle(double r){
  //   this.raduis = r;
  // }

  ////////////////////

  // Circle(this.raduis);

  ///////////////////

  Circle({double r = 5}){
    this.raduis = r;
  }


  double findArea() => math.pi * raduis;

}