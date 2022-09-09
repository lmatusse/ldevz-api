package co.ldevz.model;

import java.util.Date;

public class Blog {
private long id;
private String title;
private String content;
private Date publication_date;
private String category;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Date getPublication_date() {
	return publication_date;
}
public void setPublication_date(Date publication_date) {
	this.publication_date = publication_date;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Blog(Long id, String title, String content, Date publication_date, String category) {
	this.id = id;
	this.title = title;
	this.content = content;
	this.publication_date = publication_date;
	this.category = category;
}
@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	return super.equals(obj);
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}

}
