package org.pagemanager;

import org.base.Utility;
import org.pages.BookedItineraryPages;
import org.pages.BookingHotelPages;
import org.pages.LoginPages;
import org.pages.SearchHotelPages;
import org.pages.SelectHotelPages;


public class PageManager extends Utility{

	private LoginPages lp;
	private SearchHotelPages sh;
	private SelectHotelPages sp;
	private BookingHotelPages bh;
	private BookedItineraryPages bi;
	
	
	public LoginPages getLp() {
		return (lp == null)? lp = new LoginPages(): lp;
	}
	public SearchHotelPages getSh() {
		return (sh == null)? sh = new SearchHotelPages(): sh;
	}
	public SelectHotelPages getSp() {
		return (sp == null)? sp = new SelectHotelPages(): sp;
	}
	public BookingHotelPages getBh() {
		return (bh == null)? bh = new BookingHotelPages(): bh;
	}
	public BookedItineraryPages getBi() {
		return (bi == null)? bi = new BookedItineraryPages(): bi;
	}
	
	
}
