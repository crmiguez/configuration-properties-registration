package sample.thirdparty;

public class ThirdParty1Properties {

	private final String name;

	private final int counter;

	public ThirdParty1Properties(String name, Integer counter) {
		this.name = name;
		this.counter = (counter != null) ? counter : 42;
	}

	public String getName() {
		return this.name;
	}

	public int getCounter() {
		return this.counter;
	}

}
