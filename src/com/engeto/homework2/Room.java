package com.engeto.homework2;

public class Room {

    int roomId;
    int numberOfBeds;
    boolean hasBalcony;
    boolean hasSeaView;
    int pricePerNight;

    public Room(int roomId, int numberOfBeds, boolean hasBalcony, boolean hasSeaView, int pricePerNight) {
        this.roomId = roomId;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = hasBalcony;
        this.hasSeaView = hasSeaView;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasSeaView() {
        return hasSeaView;
    }

    public void setHasSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String balcony() {
        if (hasBalcony) {
            return "s balkónem";
        }
        else {
            return "bez balkónu";
        }
    }

    public String seaView() {
        if (hasSeaView) {
            return "s výhledem na moře";
        }
        else {
            return "bez váhledu na moře";
        }
    }

    public String getDescription() {
        return "Pokoj "+roomId+": "+numberOfBeds+" lůžek, "+balcony()+", "+seaView()+" - "+pricePerNight+" Kč/noc";
    }
}
