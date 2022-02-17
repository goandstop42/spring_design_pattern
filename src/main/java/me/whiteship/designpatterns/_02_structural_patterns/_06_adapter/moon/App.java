package me.whiteship.designpatterns._02_structural_patterns._06_adapter.moon;

import me.whiteship.designpatterns._02_structural_patterns._06_adapter.moon.security.LoginHandler;
import me.whiteship.designpatterns._02_structural_patterns._06_adapter.moon.security.UserDetailsService;

/* target을 직접 구현해도 됨
 * - 실용적으로  접근 필요
 * - 단일책임 원칙에 따르면 class를 분리해야 함
 * -
 * */
public class App {

	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
		LoginHandler loginHandler = new LoginHandler(userDetailsService);
		String login = loginHandler.login("moon", "moon");
		System.out.println(login);
	}
}
