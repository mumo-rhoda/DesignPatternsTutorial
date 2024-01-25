package FactoryDesign;

public class ClientTest {
    public static void main(String [] args){
        Computer pc = ComputerFactory.getComputer(ComputerType.PC, "16 GB","120GB","2,23 HGZ",true,true);
        System.out.println("PC Config::"+ pc);
    }

}
