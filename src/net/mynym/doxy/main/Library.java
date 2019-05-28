package net.mynym.doxy.main;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private String id = DocIdGen.getKey3();
	String name;
	List<Document> documents = new ArrayList<>();
	public String getId() {
		return id;
	}
}
