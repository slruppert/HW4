
package model;

public class Places {
    
    private int placesID;
    private String placeName;
    private String placeLocation;

    public Places() {
        this.placesID = 0;
        this.placeName = "";
        this.placeLocation = "";
    }
     public Places(int placesID, String placeName, String placeLocation) {
        this.placesID = placesID;
        this.placeName = placeName;
        this.placeLocation = placeLocation;
     }

    public int getPlacesID() {
        return placesID;
    }

    public void setPlacesID(int placesID) {
        this.placesID = placesID;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceLocation() {
        return placeLocation;
    }

    public void setPlaceLocation(String placeLocation) {
        this.placeLocation = placeLocation;
    }

    @Override
    public String toString() {
        return "Places{" + "placesID=" + placesID + ", placeName=" + placeName + ", placeLocation=" + placeLocation + '}';
    }

    public void setPlaceID(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
     
   }
