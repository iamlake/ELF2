package com.elf.core.security.realm;

import com.elf.sys.security.entity.Role;
import com.elf.sys.security.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.elf.sys.org.entity.User;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Title UserRealm
 * @Description
 * @Author icelake
 * @Date 2018/3/11 18:31
 */
@Component
public class UserRealm extends AbstractUserRealm {

	@Autowired
	private RoleService roleService;

    @Override
    public UserRolesAndPermissions doGetGroupAuthorizationInfo(User userInfo) {
        Set<String> userRoles = new HashSet<>();
        Set<String> userPermissions = new HashSet<>();
        //TODO 获取当前用户下拥有的所有角色列表,及权限
        return new UserRolesAndPermissions(userRoles, userPermissions);
    }

    @Override
    public UserRolesAndPermissions doGetRoleAuthorizationInfo(User userInfo) {
        Set<String> userRoles = new HashSet<>();
        Set<String> userPermissions = new HashSet<>();
        //TODO 获取当前用户下拥有的所有角色列表,及权限
        List<Role> roleList = roleService.getRoleListByCurrentUser();
        for(Role role : roleList) {
        	userRoles.add(role.getRoleId());
        }
        return new UserRolesAndPermissions(userRoles, userPermissions);
    }
}
