package net.mynym.doxy.main;

import java.time.LocalDateTime;

public class Version {
	public String libDocRev;
	public Integer versionNumber;
	public String URL;
	public String createdBy;
	public LocalDateTime creationDateTime;
	
	public String incrementVersion() {
		return String.format("%04d", ++versionNumber);
	}
	
	public String getVersion() {
		return String.format("%04d", versionNumber);
	}
	

}
