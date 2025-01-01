package my.work.creational.singleton;

public class SerializableSingleton implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private SerializableSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializableSingleton INSTANCE = new SerializableSingleton();
	}

	public static SerializableSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}
}
