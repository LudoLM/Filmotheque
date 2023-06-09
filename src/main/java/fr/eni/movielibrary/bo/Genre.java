package fr.eni.movielibrary.bo;

public class Genre {

	protected int id;
	protected String label;

	/**
	 * @param id
	 * @param label
	 */
	public Genre(int id, String label) {
		super();
		this.id = id;
		this.label = label;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}




}