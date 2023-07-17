/**
 * Project Name: DesignPattern
 * File: TestDesignPattern$
 * Author: Koushik Chandra Sarker
 * Date: 7/17/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/17/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package c_abstract_factory;

public class TestDesignPattern {
    public static void main(String[] args) {
        Computer laptop = ComputerFactory.getComputer(new LaptopFactory("8 GB", "500 GB", "2.4 GHz"));
        Computer desktop = ComputerFactory.getComputer(new DesktopFactory("16 GB", "500 GB", "2.4 GHz"));
        System.out.println("AbstractFactory Laptop Config::" + laptop);
        System.out.println("AbstractFactory Desktop Config::" + desktop);
    }
}

