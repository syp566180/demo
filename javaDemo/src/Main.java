import java.math.BigInteger;
import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Map<String,String> map = new HashMap<String,String>();
        System.out.print(Main.putMaphash("gc"));
        UserDao userDao = new UserDao();
        User user = new User();
        userDao.get(user);
        userDao.getMap(userDao.setMap());
        int[] intArray = new int[11];
        for(int i = 0; i<11; i++){
            intArray[i] = i;
        }


        int t = 2 + 5 >>> 1;

        System.out.println("2>>>    "+decimalToBinary(2));
        System.out.println("2>>>    "+decimalToBinary(5));
        System.out.println("2>>>    "+decimalToBinary(7));
        System.out.println("2>>>    "+decimalToBinary(3));



        System.out.println("t   "+t);


        int i = Arrays.binarySearch(intArray,2);

        System.out.println("i   "+i);




    }




    static int putMaphash(Object key){
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }




    /**
     * @Description:	十进制转换成二进制 ()
     * @param decimalSource
     * @return String
     */
    public static String decimalToBinary(int decimalSource) {
        BigInteger bi = new BigInteger(String.valueOf(decimalSource));	//转换成BigInteger类型
        return bi.toString(2);	//参数2指定的是转化成X进制，默认10进制
    }

    /**
     * @Description:	二进制转换成十进制
     * @param binarySource
     * @return int
     */
    public static int binaryToDecimal(String binarySource) {
        BigInteger bi = new BigInteger(binarySource, 2);	//转换为BigInteger类型
        return Integer.parseInt(bi.toString());		//转换成十进制
    }







}
