package com.oldwang.oldwangcrm.mapping;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.oldwang.oldwangcrm.model.Users;

/**
 * 用户数据层
 * 
 * @author Administrator
 */
public interface UserMapper {

	/**
	 * 用户登录
	 * 
	 * @param name
	 *            用户名
	 * @param pwd
	 *            用户密码
	 * @return 用户信息
	 */
	@Select("select * from users where name=#{name} and password=#{password}")
	public Users loging(@Param("name") String name, @Param("password") String password);

	/**
	 * 查询所有用户
	 */
	@Select("select * from users")
	public List<Users> selectAllUsers();

	/**
	 * 添加用户
	 * 
	 * @param 要添加的用户
	 */
	@Insert("insert into users values(id,#{user.name},#{user.pwd},#{user.tel},#{user.idcard},#{user.store},state,#{user.ulevel})")
	public int addUser(@Param("user") Users user);

	/**
	 * 修改密码
	 * 
	 * @param users
	 *            修改的用户
	 */
	@Update("update users set pwd=#{pwd} where name=#{name} and pwd=#{password}")
	public int modifyPwd(@Param("pwd") String pwd, @Param("name") String name, @Param("password") String password);

	/**
	 * 通过id查询用户信息
	 * 
	 * @param id
	 * @return
	 */
	@Select("select * from users where id=#{id}")
	public Users selectById(@Param("id") int id);

	/**
	 * 编辑用户
	 * 
	 * @param users
	 *            要编辑的用户
	 */
	@Update("update users set phone=#{user.phone},idcard=#{user.idcard},"
			+ "storeid=#{user.storeid},state=#{user.state},ulevel=#{user.ulevel} where name=#{user.name}")
	public void editUser(@Param("user") Users user);

}
