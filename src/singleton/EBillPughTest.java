/**
 * Project Name: DesignPattern
 * File: EBillPughTest$
 * Author: Koushik Chandra Sarker
 * Date: 7/15/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/15/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package singleton;

public class EBillPughTest {
    public static void main(String[] args) {
        EBillPugh instanceOne = EBillPugh.getInstance();
        EBillPugh instanceTwo = EBillPugh.getInstance();

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());

//      Output: hashCode will be same for both instances;
    }
}
