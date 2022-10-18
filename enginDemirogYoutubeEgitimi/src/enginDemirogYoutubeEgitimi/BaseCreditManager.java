package enginDemirogYoutubeEgitimi;

public abstract class BaseCreditManager implements ICreditManager{
	
	@Override
	public abstract void calculate();

	@Override
	public void Save() {
		System.out.println("Kaydedildi.");
		
	}
	
}
