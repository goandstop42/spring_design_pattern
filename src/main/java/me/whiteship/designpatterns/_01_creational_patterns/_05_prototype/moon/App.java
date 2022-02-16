package me.whiteship.designpatterns._01_creational_patterns._05_prototype.moon;

/* Prototype
 * - 기존 객체를 복제하여 새로운 인스턴스를 만드는 방법
 * - http 통신이나 DB 데이터를 기반으로 인스턴스를 만들 경우 시간이 오래 걸리고 리소스 많이 사용함
 * - java에서 제공하는 clone은 shallow copy 얕은 복사임
 * - 
 * */
public class App {
	public static void main(String[] args) throws CloneNotSupportedException {

		GithubRepository repository = new GithubRepository();
		repository.setUser("whiteship");
		repository.setName("live-study");

		GithubIssue githubIssue = new GithubIssue(repository);
		githubIssue.setId(1);
		githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

		String url = githubIssue.getUrl();
		System.out.println(url);

//		repository.setName("moon"); // 만약 repository가 변경이 발생한다면 Clone 메서드에 repository를 새로 생성함
		
		// GithubIssue clone = githubIssue.clone()
		// clone != githubIssue : 참조하는 것이 같은가? 다르다
		// clone.equals(githubIssue) : 참조를 비교하는 것이 아니라 데이터를 비교하므로 같다. 내용물은 같다
		
		GithubIssue clone = (GithubIssue)githubIssue.clone();
		System.out.println(clone.getUrl());
		System.out.println(clone != githubIssue );
		System.out.println(clone.equals(githubIssue)); // GithubIssue에 equals 생성 필요
		System.out.println(clone.getClass() == githubIssue.getClass());
		System.out.println(clone.getRepository() == githubIssue.getRepository()); // true : shallow copy, false : deep copy 

 
		System.out.println(clone.toString());
		System.out.println(githubIssue.toString());
		
	}

}
