package ua.lviv.lgs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Application {
	public static void main(String[] args)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		Class petClass = Pet.class;
		Pet p = new Pet();
		Class petClass2 = p.getClass();
		Class petClass3 = Class.forName("ua.lviv.lgs.Pet");

		String nameOfClass = petClass.getName();
		System.out.println("Class name = " + nameOfClass);

		int modifire = petClass.getModifiers();
		System.out.println("Modifire = " + modifire);
		System.out.println("is public " + Modifier.isPublic(modifire));
		System.out.println("is abstract " + Modifier.isAbstract(modifire));

		String getPackage = petClass.getPackageName();
		System.out.println("package " + getPackage);

		Class superclass = petClass.getSuperclass();
		System.out.println("Superclass " + superclass);

		Class[] interfaces = petClass.getInterfaces();
		System.out.println(Arrays.toString(interfaces));

		Constructor<Pet>[] petConstructor = petClass.getConstructors();
		for (int i = 0; i < petConstructor.length; i++) {
			Constructor<Pet> constructor2 = petConstructor[i];
			System.out.println("Constructor " + constructor2);
		}

		System.out.println("Constructor size = " + petConstructor.length);

		System.out.println("parameter type:");
		Constructor<Pet> constuctor3 = petConstructor[2];
		Class[] parameterType = constuctor3.getParameterTypes();
		for (int i = 0; i < parameterType.length; i++) {
			System.out.println(parameterType[i]);

		}

		Constructor<Pet> singleconstructor = petClass.getConstructor(String.class, int.class);
		System.out.println(" Single constructor :" + singleconstructor);
		System.out.println("New instance Pet : " + singleconstructor.newInstance("Bob", 5));

		System.out.println(" Fields :");
		Field[] fields = petClass.getFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println(field);
		}

		System.out.println(" All Fields :");
		Field[] fields2 = petClass.getDeclaredFields();
		for (int i = 0; i < fields2.length; i++) {
			Field field = fields2[i];
			System.out.println(field);
		}

		System.out.println("Methods :");
		Method[] methods = petClass.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println(method);
		}

		Pet pet1 = (Pet) petClass.getConstructor(String.class, int.class, String.class).newInstance("Rex", 9, "Alex");
		System.out.println(pet1);
		Constructor<Pet> petConstr = petClass.getConstructor(String.class, int.class, String.class);
		Pet pet2 = petConstr.newInstance("Rex", 9, "Alex");
		System.out.println(pet2);

		System.out.println();
		Field petName = petClass.getField("name");
		petName.set(pet2, "Lord");
		Field petAge = petClass.getField("age");
		petAge.set(pet2, 3);
		Field petOwner = fields2[2];
		petOwner.setAccessible(true);
		petOwner.set(pet2, "Alehandro");
		System.out.println(pet2);
		
		
		Method myMethodOne = petClass.getMethod("myMethod", String.class, int.class, int.class) ;  
		System.out.println("Before MyMethod one: " + pet2);
		myMethodOne.invoke(pet2, "Felix", 1, 1);
		System.out.println("After MyMethod one: " + pet2);
		
		Method myMethodTwo = petClass.getMethod("myMethod", String.class, String.class);
		myMethodTwo.invoke(pet2, "First", "Second");
		System.out.println("After MyMethod one: " + pet2);
		
	}

}
