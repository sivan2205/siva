package DR;
import java.util.*;
interface A5
{
 void m1(int a);
 void m2(String b);
}
interface b
{
 void m3(char c);
 static void m4(int a)
 {
  System.out.println(a);
 }
 static void m5(String b)
 {
  System.out.print(b);
 }
}
abstract class B
{
 B(int a)
 {
  System.out.print(a);
 }
 abstract void m6(double b);
 void m7(boolean c)
 {
  System.out.println(c);
 }
}
abstract class C
{
 C(float a)
 {
  System.out.println(a);
 }
 abstract void m8(char b);
}












































