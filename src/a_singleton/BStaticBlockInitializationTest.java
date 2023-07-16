/**
 * Project Name: DesignPattern
 * File: BStaticBlockInitializationTest$
 * Author: Koushik Chandra Sarker
 * Date: 7/15/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/15/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package a_singleton;

public class BStaticBlockInitializationTest {

    public static void main(String[] args) {
        BStaticBlockInitialization instanceOne = BStaticBlockInitialization.getInstance();
        BStaticBlockInitialization instanceTwo = BStaticBlockInitialization.getInstance();


        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());

//      Output: hashCode will be same for both instances;
    }
}
