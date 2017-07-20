package designPattern.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializedSingleton implements Serializable{

	private static final long serialVersionUID = -7604766932017737115L;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}
	
	protected Object readResolve() {
	    return getInstance();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}

	public static void main(String[] args)
			throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedSingleton instanceOne = SerializedSingleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(
				new FileOutputStream("/Users/satypatt/Desktop/Satya/Projects/Cme/Codebase/modularcme/cme/cme-controller/src/main/resources/filename.txt"));
		out.writeObject(instanceOne);
		out.close();
		System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
	
		
		System.out.println("Instance Serialized.....");

		// deserailize from file to object
		ObjectInput in = new ObjectInputStream(
				new FileInputStream("/Users/satypatt/Desktop/Satya/Projects/Cme/Codebase/modularcme/cme/cme-controller/src/main/resources/filename.txt"));
		SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
		in.close();
		System.out.println("Instance DESerialized.....");
		System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());

	}

}
