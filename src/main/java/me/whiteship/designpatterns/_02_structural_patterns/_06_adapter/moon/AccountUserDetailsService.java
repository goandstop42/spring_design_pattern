package me.whiteship.designpatterns._02_structural_patterns._06_adapter.moon;

import me.whiteship.designpatterns._02_structural_patterns._06_adapter.moon.security.UserDetails;
import me.whiteship.designpatterns._02_structural_patterns._06_adapter.moon.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

	AccountService accountService;
	
	public AccountUserDetailsService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	@Override
	public UserDetails loadUser(String username) {
		 
		Account  account = accountService.findAccountByUsername(username);
		return new AccountUserDetails(account);
	}

}
