/**
 * Project Name: DesignPattern
 * File: ComputerFactory$
 * Author: Koushik Chandra Sarker
 * Date: 7/17/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/17/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package c_abstract_factory;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
