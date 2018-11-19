/**  
 * All rights Reserved, Designed By Android_Robot     
 * @Description:    TODO(用一句话描述该文件做什么)   
 * @author: CPSHEN     
 * @date:   2018年11月18日 下午3:40:05       
 */ 
package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.entity.User;
import demo.service.UserService;

/**   
 * @ClassName:  UserCtroller   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author:   CPSHEN
 * @date:   2018年11月18日 下午3:40:05   
 *      
 */
@RestController
@RequestMapping(value ="/CRUD", method = { RequestMethod.GET, RequestMethod.POST })
public class CRUD {
	
	@Autowired
	private UserService userservice;
 /**
  * 
  * @Title: delete   
  * @Description: 删除方法 
  * @param: @param id
  * @param: @return      
  * @return: String      
  * @throws 
  * @author:   CPSHEN
  * @date:   2018年11月18日 下午3:55:17
  */
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(int id) {
		int result = userservice.delete(id);
		if (result >= 1) {
			return "删除成功";
		} else {
			return "删除失败";
		}
	}
 
	/**
	 * 
	 * @Title: update   
	 * @Description: 更新方法  
	 * @param: @param user
	 * @param: @return      
	 * @return: String      
	 * @throws 
	 * @author:   CPSHEN
	 * @date:   2018年11月18日 下午3:55:38
	 */
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(User user) {
		int result = userservice.Update(user);
		if (result >= 1) {
			return "修改成功";
		} else {
			return "修改失败";
		}
 
	}
	
	/**
	 * 
	 * @Title: insert   
	 * @Description: 添加方法
	 * @param: @param user
	 * @param: @return      
	 * @return: User      
	 * @throws 
	 * @author:   CPSHEN
	 * @date:   2018年11月18日 下午3:56:21
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public User insert(User user) {
		return userservice.insertUser(user);
		}
	
	@RequestMapping("/ListUser")
	@ResponseBody
	public List<User> ListUser(){
		return userservice.ListUser();
	}
 
	@RequestMapping("/ListUserByname")
	@ResponseBody
	public List<User> ListUserByname(String name){
		return userservice.findByName(name);
	}


}
