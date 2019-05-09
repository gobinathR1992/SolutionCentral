package DataStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dataset {
	
	public static Map<String, String> datamap = new HashMap<String, String>();
	public static ArrayList<String> datalist= null;
	public static Map<String, String> getDatamap() {
		return datamap;
	}
	public static void setDatamap(Map<String, String> datamap) {
		Dataset.datamap = datamap;
	}
	public static ArrayList<String> getDatalist() {
		return datalist;
	}
	public static void setDatalist(ArrayList<String> dataset) {
		Dataset.datalist = dataset;
	}
	

}
