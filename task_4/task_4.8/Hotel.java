import java.lang.reflect.Array;
import java.util.Dictionary;
import java.util.Scanner;
public class Hotel {
    Room[] rooms;
    Scanner scanner = new Scanner(System.in);

    public Hotel(Room[] rooms) {
        this.rooms = rooms;
    }

    public void getFreeRooms() {
        String freeRoomsList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isFree()) freeRoomsList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("Номера свободных комнат " + freeRoomsList);
    }

    public void reserveRoom(byte roomNumber) {
        String info = "Такой комнаты не существует";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if (room.getRoomNumber() == roomNumber && room.isFree()) {
                room.setFree(false);
                info = ("Комната номер " + roomNumber + " успешно забронированна");
                break;
            } else if (room.getRoomNumber() == roomNumber && !room.isFree()) {
                info = "Комната " + roomNumber + " занята";
                break;
            }

        }
        System.out.println(info);
    }

    public void getWiFiRooms() {
        String wifiRoomsList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isWifi()) wifiRoomsList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("Номера с WiFi: " + wifiRoomsList);
    }

    public void exRoom(byte roomNumber) {
        String info = "Такой комнаты не существует";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
            if (room.getRoomNumber() == roomNumber && !room.isFree()) {
                room.setFree(true);
                info = ("Комната " + roomNumber + " освобождена");
                break;
            } else if (room.getRoomNumber() == roomNumber && room.isFree()) {
                info = "В комнате " + roomNumber + " никто не живёт";
                break;
            }
        }
    }

    public void getEatRooms() {
        String eatRoomsList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].isEat()) eatRoomsList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("Номера с завтраком: " + eatRoomsList);
    }

    public void getWcRooms() {
        String wcRoomsList = "";
        for (int i = 0; i < rooms.length; i++) {
        }
        System.out.println("Номера с санузлом: " + wcRoomsList);
}
    public void getQuantityRooms() {
        String quantityRoomsList = "";
        for (int i = 0; i < rooms.length; i++){
            if ( rooms[i].getQuantity() == 1) quantityRoomsList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("Односпальные "+ quantityRoomsList);
        quantityRoomsList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getQuantity() == 2) quantityRoomsList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("Двуспальные "+ quantityRoomsList);
        quantityRoomsList = "";
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getQuantity() == 3) quantityRoomsList += rooms[i].getRoomNumber() + ", ";
        }
        System.out.println("Трёхспальные "+ quantityRoomsList);

    }

    public void showRoom(byte roomNumber) {
        String info = "Такой комнаты не существует";
        for (int i = 0; i < rooms.length; i++) {
            Room room = rooms[i];
             {info = ("Комната номер "+ roomNumber + " имеет следующие особенности: \n" +
                     "Санузел: " + room.isWc()+ "\n"+
                     "WiFi: " + room.isWifi() + "\n"+
                     "Количество коек: " + room.getQuantity() +"\n"+
                     "Завтрак в наличии: " + room.isEat()+"\n"
                     );
                break;

            }

        }
        System.out.println(info);
    }
}
