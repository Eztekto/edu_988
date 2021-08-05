import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Room[] rooms = {
                new Room((byte) 1,false,false,true,(byte) 11),
                new Room((byte) 2,true,true,false,(byte) 12),
                new Room((byte) 1,false,true,true,(byte) 13),
                new Room((byte) 3,true,false,false,(byte) 21),
                new Room((byte) 2,false,false,false,(byte) 22),
                new Room((byte) 1,true,true,true,(byte) 23),
                new Room((byte) 3,false,true,false,(byte) 31),
                new Room((byte) 3,true,true,false,(byte) 32),
                new Room((byte) 1,false,false,true,(byte) 33),
        };
        Hotel hotel = new Hotel(rooms);
        Scanner scanner = new Scanner(System.in);
        String command ;
        while (true){
            System.out.println("Введите команду");
            command = scanner.nextLine();
            if(command.equals("getFreeRooms")){
                hotel.getFreeRooms();
            }else if(command.equals("reserveRoom")){
                System.out.print("Введите номер комнаты для бронирования: ");
                byte roomNumber = (byte) scanner.nextInt();
                hotel.reserveRoom(roomNumber);
            }else if(command.equals("Wifi")){
                hotel.getWiFiRooms();
            }else if(command.equals("exRoom")){
                System.out.print("Введите номер комнаты, которую нужно освободить: ");
                byte roomNumber = (byte) scanner.nextInt();
                hotel.exRoom(roomNumber);
            }else if(command.equals("Eat")){
            hotel.getEatRooms();}
            else if(command.equals("showRoom")){
            System.out.print("Какой номер интересует? ");
            byte roomNumber = (byte) scanner.nextInt();
            hotel.showRoom(roomNumber);
        }
            else if(command.equals("help")){
                command = "*----*\n" +
                        "getFreeRooms - показать все свободные комнтаы\n" +
                        "reserveRoom - забронировать номер\n" +
                        "getReservedRooms - показать зарезервированные номера\n" +
                        "Wifi - комнаты с Wifi\n"+
                        "Eat - комнаты с завтраком\n"+
                        "exRoom - освободить комнату\n"+
                        "*----*";
                System.out.println(command);
            }else if(command.equals("WC")){
            hotel.getWcRooms();}
            else if(command.equals("Quantity")){
                hotel.getQuantityRooms();}

            else if (command.equals("exit")){
                break;
            }
        }

    }
}
