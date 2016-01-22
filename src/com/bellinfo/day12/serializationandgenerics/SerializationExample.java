package com.bellinfo.day12.serializationandgenerics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {

	public static void main(String args[]) throws IOException, ClassNotFoundException {

		String path = System.getProperty("user.dir");
		String fileName = "objectWrite.txt";
		String absolutePath = path + File.separator + fileName;
		File file = new File(absolutePath);

		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Website website = new Website();
		website.setName("http://www.google.com");
		website.setRank(1);
		website.setPurpose("Search Engine");
		oos.writeObject(website);
		oos.flush();
		oos.close();
		
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Website retrievedWebsite=(Website) ois.readObject();
		System.out.println(retrievedWebsite.toString());
		
	}
}

class Website implements Serializable {

	private static final long serialVersionUID = -6666154404170460878L;

	private String name;
	private int rank;
	private String purpose;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	@Override
	public String toString() {
		return "Website Details " + name + " " + rank + " " + purpose;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((purpose == null) ? 0 : purpose.hashCode());
		result = prime * result + rank;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Website other = (Website) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (purpose == null) {
			if (other.purpose != null)
				return false;
		} else if (!purpose.equals(other.purpose))
			return false;
		if (rank != other.rank)
			return false;
		return true;
	}

}