package db;

import java.util.List;
import java.util.Set;

import entity.Item;

public interface DBConnection {
	public void close();
	
	public void setFavoriteItems(String userId, List<String> itemIds);
	
	public void unsetFavoriteItems(String userId, List<String> itemIds);
	
	public Set<String> getFavoriteItemIds(String userId);
	
	public Set<Item> getFavoriteItems(String userId);
	
	public Set<String> getCategories(String itemId);
	
	public List<Item> searchItems(double lat, double lon, String term);
	
	public void saveItem(Item item);
	
	public String getFullname(String userId);
	
	public boolean verifyLogin(String userId, String password);
	
	/**
	 * Register one user
	 * 
	 * @param userId
	 * @param password
	 * @param firstname
	 * @param lastname
	 * @return boolean
	 */
	public boolean registerUser(String userId, String password, String firstname, String lastname);
}
