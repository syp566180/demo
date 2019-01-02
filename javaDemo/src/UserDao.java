import java.util.HashMap;
import java.util.Map;

/**
 * Created by syp on 2018/12/25.
 */
public class UserDao implements IUserDao<User>{

    public void get(User entiy){
        System.out.print("使用这个方法！"+entiy.get());
    }

    public Map<String,User> setMap(){
        Map<String,User> map = new HashMap<>();
        User user = new User();
        map.put("user",user);
        return map;
    }

    public void getMap(Map<String,User> map){
        System.out.println("2222"+map.get("user").getName());
    }


    public Object[] sort(Object[] objects){
        Object temp;//定义一个临时变量
        for(int i=0;i<objects.length-1;i++){//冒泡趟数
            for(int j=0;j<objects.length-i-1;j++){
                //如果顺序不对，则交换两个元素
//                if(objects[j+1]<objects[j]){
//                    temp = objects[j];
//                    objects[j] = objects[j+1];
//                    objects[j+1] = temp;
//                }
            }
        }
            return  objects;
    }


}
