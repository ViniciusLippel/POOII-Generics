package q2;

public class Id<T> {
	
	private T id;

	public Id(T id) {
		this.id = id;
	}

	public T getId() {
		return id;
	}

	public void setId(T id) {
		this.id = id;
	}
	
}
