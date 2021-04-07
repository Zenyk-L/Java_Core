package ua.lviv.lgs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Map<K, V> {

	HashMap<K, V> map = new HashMap<K, V>();
	K obj1;
	V obj2;

	public Map() {
	}

	public Map(K obj1, V obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	@Override
	public String toString() {
		return "Map [map=" + map + "]";
	}

	public HashMap<K, V> getMap() {
		return map;
	}

	public void setMap(HashMap<K, V> map) {
		this.map = map;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((map == null) ? 0 : map.hashCode());
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
		Map other = (Map) obj;
		if (map == null) {
			if (other.map != null)
				return false;
		} else if (!map.equals(other.map))
			return false;
		return true;
	}

	public void add(K obj1, V obj2) {
		map.put(obj1, obj2);
	}

	public void removeByK(K obj1) {
		System.out.println("Remove by key " + obj1 + " :");
		map.remove(obj1);
	}

	public void removeByV(V obj2) {
		System.out.println("Remove by value " + obj2 + " :");
		Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> entry = iterator.next();
			if (obj2.equals(entry.getValue())) {
				iterator.remove();
			}
		}
	}

	public void setOfKeys() {
		System.out.println("Set of key :");
		System.out.println(map.keySet());
	}

	public void listOfValues() {
		System.out.println("List of values :");
		System.out.println(map.values());
	}

}
