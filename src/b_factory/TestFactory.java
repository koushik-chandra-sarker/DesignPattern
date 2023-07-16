/**
 * Project Name: DesignPattern
 * File: TestFectory$
 * Author: Koushik Chandra Sarker
 * Date: 7/16/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/16/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package b_factory;

public class TestFactory {
    public static void main(String[] args) {
        Computer laptop = ComputerFactory.getComputer("Laptop","2 GB","500 GB","2.4 GHz");
        Computer desktop = ComputerFactory.getComputer("Desktop","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory class::"+laptop.getClass());
        System.out.println("Factory Laptop Config::"+laptop);
        System.out.println("Factory class::"+desktop.getClass());
        System.out.println("Factory Desktop Config::"+desktop);
    }
}
