package me.whiteship.designpatterns._02_structural_patterns._08_composite.moon;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component{

	// Bag이 Composite type 이므로 List<Item> -> List<Component>로 변경
//    private List<Item> items = new ArrayList<>();
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
    	components.add(component);
    }

	public List<Component> getComponents() {
		return components;
	}



	@Override
	public int getPrice() {
		 
		return components.stream().mapToInt(c-> c.getPrice()).sum();
	}
}
