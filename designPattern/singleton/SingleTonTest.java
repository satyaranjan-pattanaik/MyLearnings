package designPattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleTonTest {

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	
		EnumSingleTon si = EnumSingleTon.sai;
		si.doSomething();
		
		
		System.out.println(si.hashCode());
		EnumSingleTon si1 = EnumSingleTon.sai;
		System.out.println(si1.hashCode());
		
		
		
		
		SingletonDemo singletonDemoInstance = SingletonDemo.getSingletonDemoInstance();
		System.out.println(singletonDemoInstance.hashCode());
		SingletonDemo singletonDemoInstance2 = SingletonDemo.getSingletonDemoInstance();
		System.out.println(singletonDemoInstance2.hashCode());
		
		
		
		
		SingletonDemo instanceTwo = null;
		try {
            Constructor[] constructors = SingletonDemo.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (SingletonDemo) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(singletonDemoInstance.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
	}
