package com.qingcheng.service.system;
import com.qingcheng.entity.PageResult;
import com.qingcheng.pojo.system.Role;
import com.qingcheng.pojo.system.RoleVO;

import java.util.*;

/**
 * role业务逻辑层
 */
public interface RoleService {


    public List<Role> findAll();


    public PageResult<Role> findPage(int page, int size);


    public List<Role> findList(Map<String,Object> searchMap);


    public PageResult<Role> findPage(Map<String,Object> searchMap,int page, int size);


    public Role findById(Integer id);

    public void add(RoleVO roleVO);


    public void update(Role role);


    public void delete(Integer id);

    public List<Integer> findResourceByRoleId(Integer id);

}
