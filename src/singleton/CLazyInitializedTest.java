/**
 * Project Name: DesignPattern
 * File: CLazyInitializedTest$
 * Author: Koushik Chandra Sarker
 * Date: 7/15/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/15/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package singleton;

public class CLazyInitializedTest {
    public static void main(String[] args) {
        CLazyInitialized instanceOne = CLazyInitialized.getInstance();
        CLazyInitialized instanceTwo = CLazyInitialized.getInstance();

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());

//      Output: hashCode will be same for both instances;
    }
}
