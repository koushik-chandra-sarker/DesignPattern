/**
 * Project Name: DesignPattern
 * File: ComputerFactory$
 * Author: Koushik Chandra Sarker
 * Date: 7/16/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/16/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package factory;

public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("Laptop".equalsIgnoreCase(type)) return new Laptop(ram, hdd, cpu);
        else if("Desktop".equalsIgnoreCase(type)) return new Desktop(ram, hdd, cpu);

        return null;
    }
}
