package by.htp.les22.entity.ex;

import by.htp.les22.entity.ApplianceProduct;

import java.util.Objects;


public class ApplianceProductLaptop extends ApplianceProduct {

    private String name;
    private float batteryCapacity;
    private String OS;
    private int memoryRom;
    private int systemMemory;
    private float CPU;
    private int displayInches;

    public ApplianceProductLaptop(String nameProduct, float batteryCapacity, String OS, int memoryRom,
                                  int systemMemory, float CPU, int displayInchs) {
        super(nameProduct);
        this.name = nameProduct;
        this.batteryCapacity = batteryCapacity;
        this.OS = OS;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.CPU = CPU;
        this.displayInches = displayInchs;
    }

    public String getNameProduct() {
        return name;
    }

    public void setNameProduct(String nameProduct) {
        this.name = nameProduct;
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public float getCPU() {
        return CPU;
    }

    public void setCPU(float CPU) {
        this.CPU = CPU;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApplianceProductLaptop that = (ApplianceProductLaptop) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(batteryCapacity, that.batteryCapacity) &&
                Objects.equals(OS, that.OS) &&
                Objects.equals(memoryRom, that.memoryRom) &&
                Objects.equals(systemMemory, that.systemMemory) &&
                Objects.equals(CPU, that.CPU) &&
                Objects.equals(displayInches, that.displayInches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, batteryCapacity, OS, memoryRom, systemMemory, CPU, displayInches);
    }
    public boolean isExist(String key, String value) {
        switch (key) {
            case "CPU":
                return String.valueOf(this.CPU).equals(value);
            case "BATTERY_CAPACITY":
                return String.valueOf(this.batteryCapacity).equals(value);
            case "OS":
                return this.OS.equals(value);
            case "MEMORY_ROM":
                return String.valueOf(this.memoryRom).equals(value);
            case "SYSTEM_MEMORY":
                return String.valueOf(this.systemMemory).equals(value);
            case "DISPLAY_INCHS":
                return String.valueOf(this.displayInches).equals(value);
            default:
                return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %.1f %s %d %d %.1f %d",
                this.getNameProduct(), this.getBatteryCapacity(),
                this.getOS(), this.getMemoryRom(), this.getSystemMemory(),
                this.getCPU(), this.getDisplayInches());
    }

}
