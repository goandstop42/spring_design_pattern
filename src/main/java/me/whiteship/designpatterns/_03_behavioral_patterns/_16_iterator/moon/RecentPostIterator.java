package me.whiteship.designpatterns._03_behavioral_patterns._16_iterator.moon;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecentPostIterator implements Iterator<Post> {

	private Iterator<Post> internalInIterator;
	
	private Board board;
	
	public RecentPostIterator(List<Post> posts) {
		Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
		this.internalInIterator = posts.iterator();
	}

	@Override
	public boolean hasNext() {
		return this.internalInIterator.hasNext();
	}

	@Override
	public Post next() {
		return this.internalInIterator.next();
	}

	
}
