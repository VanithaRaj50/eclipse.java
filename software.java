package collection_framework;

public class SoftwareDTO {
	
	private String name;	
	
	private double version;		
	
	private boolean autoSaveSupported;	
	
	private boolean internetApp;	
	
	public SoftwareDTO() {	
		
		super();
		
	}		
	public SoftwareDTO(String name, double version, boolean autoSaveSupported, boolean internetApp) {	
		super();	
		this.name = name;
		this.version = version;	
		this.autoSaveSupported = autoSaveSupported;	
		this.internetApp = internetApp;
		} 
	public String getName() {
		return name;	
		} 	
	public void setName(String name) {	
		this.name = name;	
		} 	
	public double getVersion() {	
		return version;	
		} 	
	public void setVersion(double version) {	
		this.version = version;	
		}	
	public boolean isAutoSaveSupported() {
		return autoSaveSupported;
		} 
	public void setAutoSaveSupported(boolean autoSaveSupported) {
		this.autoSaveSupported = autoSaveSupported;
		} 	
	public boolean isInternetApp() {	
		return internetApp;	
		} 	
	public void setInternetApp(boolean internetApp) {	
		this.internetApp = internetApp;	
		} 
	@Override	
	public String toString() {
		
		
		return "Software [name=" + name + ", version=" + version + ", autoSaveSupported=" + autoSaveSupported				+ ", internetApp=" + internetApp + "]";	
		
	}
	}


