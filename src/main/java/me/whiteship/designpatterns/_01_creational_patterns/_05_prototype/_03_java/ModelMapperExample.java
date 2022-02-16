package me.whiteship.designpatterns._01_creational_patterns._05_prototype._03_java;

import me.whiteship.designpatterns._01_creational_patterns._05_prototype._02_after.GithubIssue;
import me.whiteship.designpatterns._01_creational_patterns._05_prototype._02_after.GithubRepository;
import org.modelmapper.ModelMapper;

public class ModelMapperExample {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        // 이렇게 담아야 할 경우 ModelMapper 사용
		/* GithubIssueData githubIssueData = new GithubIssueData();
		githubIssueData.setId(githubIssue.getId());
		githubIssueData.setRepositoryName(githubIssue.getRepository().getName());*/
        
        // ModeMapper 리플렉션 기술로 set 메서드 명으로 바인딩 된다.
        // ex) setRepository_Name -> x,  
        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData githubIssueData = modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println(githubIssue);
        System.out.println(githubIssueData);
    }
}
