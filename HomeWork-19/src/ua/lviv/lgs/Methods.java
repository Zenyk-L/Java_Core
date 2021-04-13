package ua.lviv.lgs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Methods {
	
	public static void serialize(File file, Object object ) throws IOException {
		OutputStream of = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(of);
		oos.writeObject(object);
		oos.close();
		of.close();
		System.out.println(" Seserealized \n" + object );
	}
	
	
	
	public static void deserealize(File file) throws IOException, ClassNotFoundException {
		InputStream inf = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(inf);
		
		//Employee emp = (Employee) ois.readObject();
		Object emp = ois.readObject();
		System.out.println();
		System.out.println("Deserealized");
		System.out.println(emp);
		ois.close();
		inf.close();
		
		
	}

}
