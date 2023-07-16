/**
 * Project Name: DesignPattern
 * File: Computer$
 * Author: Koushik Chandra Sarker
 * Date: 7/16/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/16/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package b_factory;

/*
* Super class in factory design pattern can be an interface, abstract class or a normal java class.
* */
public abstract class Computer {
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();
    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", CPU="+this.getCPU();
    }
}
