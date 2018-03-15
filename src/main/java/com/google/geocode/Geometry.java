package com.google.geocode;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Geometry{

	@JsonProperty("viewport")
	private Viewport viewport;

	@JsonProperty("bounds")
	private Bounds bounds;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("location_type")
	private String locationType;

	public void setViewport(Viewport viewport){
		this.viewport = viewport;
	}

	public Viewport getViewport(){
		return viewport;
	}

	public void setBounds(Bounds bounds){
		this.bounds = bounds;
	}

	public Bounds getBounds(){
		return bounds;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	public Location getLocation(){
		return location;
	}

	public void setLocationType(String locationType){
		this.locationType = locationType;
	}

	public String getLocationType(){
		return locationType;
	}

	@Override
 	public String toString(){
		return 
			"Geometry{" + 
			"viewport = '" + viewport + '\'' + 
			",bounds = '" + bounds + '\'' + 
			",location = '" + location + '\'' + 
			",location_type = '" + locationType + '\'' + 
			"}";
		}
}