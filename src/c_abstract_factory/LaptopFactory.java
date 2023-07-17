/**
 * Project Name: DesignPattern
 * File: LaptopFactory$
 * Author: Koushik Chandra Sarker
 * Date: 7/17/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/17/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package c_abstract_factory;

public class LaptopFactory implements ComputerAbstractFactory{
    private String ram;
    private String hdd;
    private String cpu;

    public LaptopFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Laptop(ram, hdd, cpu);
    }
}
