package net.nordicgaming.PlayerJobs;
/*
 * Describes a Job
 * 
 * 
 */
public class Job {

	private String _description;
	private int _basepay;
	private int _itemID;
	private int _numItems;
	
	public Job(String description, int basepay, int itemID, int numItems)
	{
		_description = description;
		_basepay = basepay;
		_itemID = itemID;
		_numItems = numItems;
	}
	public String getDescription()
	{
		return _description;
	}
	public int getBasePay()
	{
		return _basepay;
	}
	public int getItemID()
	{
		return _itemID;
	}
	public int getNumItems()
	{
		return _numItems;
	}
	
}
