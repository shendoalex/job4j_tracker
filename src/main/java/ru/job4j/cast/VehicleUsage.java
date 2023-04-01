package ru.job4j.cast;

public class VehicleUsage {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Train train = new Train();
        Bus bus = new Bus();
        Vehicle planeV = plane;
        Vehicle trainV = train;
        Vehicle busV = bus;
        Vehicle[] vehicles = {planeV, trainV, busV};
        for (Vehicle vehicle : vehicles) {
            vehicle.move();
        }
    }
}