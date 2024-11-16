package _05_EXCEPTION._08_ThrowAndThrows;

public class _08_Throw_Throws {
    /*
       throw                              throws
1) Tu khoa throw trong java    Tu khoa throws trong java duoc su dung de
duoc su dung de nem ra mot      khai bao mot ngoai le
ngoai le ro rang

2) Ngoai le checked             Ngoai le checked duoc truyen ra ngay ca khi
khong duoc truyen ra neu        chi su dung tu khoa throws
khi su dung tu khoa throw

3) Sau throw la mot instance        Sau throws la mot hoac nhieu class
//throw new InvalidAgeException()   throws InvalidAgeException, UnderageException()
4) Throw duoc su dung trong      Throws duoc khai bao ngay sau dau dong ngoac
phuong thuc                      don cua phuong thuc

5)Ban khong the throw             Ban co the khai bao nhieu exceptions. VD:
nhieu exceptions                  public void method() throws IOException, SQLException
*/

    //Example throws trong Java
    void m() throws ArithmeticException {
        //method code
    }


    //Example throw and throws trong Java
    void n() throws ArithmeticException{
        throw new ArithmeticException("sorry");
    }
}
