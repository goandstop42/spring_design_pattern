package me.whiteship.designpatterns._01_creational_patterns._05_prototype.moon;

import java.util.Objects;

// Object Clone은 protected 이므로 Cloneable 를 구현
// clone() 메서드를 통해 자바가 제공하는 기능 사용
public class GithubIssue implements Cloneable{

    private int id;

    private String title;

    @Override
    // shallow copy
	/*	protected Object clone() throws CloneNotSupportedException {
			 
			return super.clone();
		}
	*/

	// deep copy
    protected Object clone() throws CloneNotSupportedException {
		GithubRepository repository = new GithubRepository();
		repository.setUser(this.repository.getUser());
		repository.setName(this.repository.getName());
		
		GithubIssue githubIssue = new GithubIssue(repository);
		githubIssue.setId(this.id);
		githubIssue.setTitle(this.title);
		
		return githubIssue;
	}
    
    
    
	private GithubRepository repository;

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GithubRepository getRepository() {
        return repository;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                repository.getUser(),
                repository.getName(),
                this.getId());
    }



	@Override
	public String toString() {
		return "GithubIssue [id=" + id + ", title=" + title + ", repository=" + repository + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GithubIssue other = (GithubIssue) obj;
		return id == other.id && Objects.equals(repository, other.repository) && Objects.equals(title, other.title);
	}
    
    
}
