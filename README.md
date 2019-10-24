# OOP Review
## Sự khác nhau giữa Abstract và Interface
+ Chúng ta dùng từ khoá abstract để tạo một lớp (class) là abstract class.  Chúng ta dùng từ khoá interface để tạo một interface.
+ Các lớp con dùng từ khoá  extends để kế thừa các thuộc tính và phương thức abstract của lớp abstract . Trong khi đó chúng ta dùng từ khoá implements để kế thừa các phương thức của interface 
+ Trong Abstract classes các phương thức abstract có thể viết code trong các phương thức còn interface thì không có code trong phương thức 
++  Note that from Java 8 onwards, we can create default and static methods in interface that contains the method implementations.
+ Abstract classes có hàm khởi tạo (constructors) Nhưng interface thì không có hàm khởi tạo 
+ Abstract class có các chức năng như một lớp java bình thường ngoại trừ việc ta không thể khởi tạo đối tượng với toán tử new từ lớp abstract.Interface thì chỉ có public static final constants và các phương thức can have only public static final constants and method declarations.
+ Abstract classes methods có thể có các modifier như public, private, protected, static nhưng interface methods chỉ có public và abstract.
+ Một lớp con có thể kế thừa 1 lớp abstract và nhiều lớp interface
+ Abstract classes có thể kế thứa 1 lớp abstract nhưng có thể cài đặt nhiều interface.
+ Interfaces are used to define contract for the subclasses whereas abstract class also define contract but it can provide other methods implementations for subclasses to use.

## Khi nào dùng Interface hoặc Abstract Class
### Chúng ta sử dụng Abstract Class khi
+ Chúng ta muốn share code giữa các lớp có quan hệ (is -a ) với nhau .
+ Chúng ta muốn các phương thức và thuộc tính chỉ được access bằng private và protected hơn là public
+ Chúng ta muốn lớp con kế thừa những phương thức chung , mặc định có sẳn của cha . Đồng thời cho phép lớp con tuỳ ý thay đổi cách cài đặt cho những phương thức riêng biệt. Có thể lớp con không cần cài đặt hoặc cài đặt 

### Chúng ta sử dụng Interface khi
+ Chúng ta muốn các lớp không liên quan với nhau liên kết được với nhau.
+ Chúng ta muốn chú trọng vào hành động hơn là về cấu trúc đối tượng (abstract class) 
+ Chúng ta muốn sử dụng đa kế thừa 

## Nói tóm lại 
+ Chọn abstract  khi mình có thể tạo ra 1 câu  “A là B”
+ Chọn interface khi mình có thể  tạo ra 1 câu “A có khả năng làm được gì?”
+ Use abstract classes and inheritance if you can make the statement “A is a B”. Use interfaces if you can make the statement “A is capable of [doing] as”

## Có nên sử dụng chung Abstract và Interface
Chúng ta nên kết hợp chung abstract và interface cùng nhau . Đó là cách tốt nhất khi thiết kế chương trình
