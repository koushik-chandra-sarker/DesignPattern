/**
 * Project Name: DesignPattern
 * File: DThreadSafeTest$
 * Author: Koushik Chandra Sarker
 * Date: 7/15/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/15/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package a_singleton;

public class DThreadSafeTest {
    public static void main(String[] args) {
        DThreadSafe instanceOne = DThreadSafe.getInstance();
        DThreadSafe instanceTwo = DThreadSafe.getInstance();
        DThreadSafe instanceThree = DThreadSafe.getInstanceUsingDoubleLocking();
        DThreadSafe instanceFour = DThreadSafe.getInstanceUsingDoubleLocking();

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
        System.out.println(instanceThree.hashCode());
        System.out.println(instanceFour.hashCode());

        //      Output: hashCode will be same for all instances;
    }
}
