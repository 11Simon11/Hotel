package com.engeto.homework2;

import java.time.LocalDate;

public class Booking {

    String name1;
    String name2;
    int room;
    LocalDate beginning;
    LocalDate end;

    public Booking(String name1, String name2, int room, LocalDate beginning, LocalDate end) {
        this.name1 = name1;
        this.name2 = name2;
        this.room = room;
        this.beginning = beginning;
        this.end = end;
    }

    public Booking(String name1, int room, LocalDate beginning, LocalDate end) {
        this.name1 = name1;
        this.name2 = "";
        this.room = room;
        this.beginning = beginning;
        this.end = end;
    }

    public Booking(String name1, int room) {
        this(name1,"", room, LocalDate.now(), LocalDate.now().plusDays(7));
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public LocalDate getBeginning() {
        return beginning;
    }

    public void setBeginning(LocalDate beginning) {
        this.beginning = beginning;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public String getDescription() {
            StringBuilder description = new StringBuilder("Rezervace pro: "+name1+" "+name2+", pokoj: "
                    +room+", od: "+beginning.toString()+" do: "+end.toString());
            return description.toString();
        }
}
