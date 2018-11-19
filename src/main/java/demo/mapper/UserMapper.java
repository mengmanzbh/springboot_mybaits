/**  
 * All rights Reserved, Designed By Android_Robot     
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: CPSHEN     
 * @date:   2018年11月18日 下午3:41:32       
 */ 
package demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import demo.entity.User;

/**   
 * @ClassName:  UserMapper   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author:   CPSHEN
 * @date:   2018年11月18日 下午3:41:32   
 *      
 */
@Mapper
public interface UserMapper {
	
List<User> findUserByName(String name);
	
	public List<User> ListUser();
	
	public int insertUser(User user);
	
	public int delete(int id);
	
	public int Update(User user);



}
