import java.util.Map;

/**
 * Created by syp on 2018/12/25.
 */

public interface IUserDao<T>{
    void get(T entiy);

    Map<String,T> setMap();

    default void getMap(Map<String,T> map){
        System.out.print("吃");
    }


    //冒泡排序
    Object[] sort(Object[] objects);

}
