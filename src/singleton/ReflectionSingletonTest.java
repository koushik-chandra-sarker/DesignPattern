/**
 * Project Name: DesignPattern
 * File: ReflectionSingletonTest$
 * Author: Koushik Chandra Sarker
 * Date: 7/16/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/16/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main(String[] args) {
        BStaticBlockInitialization instanceOne = BStaticBlockInitialization.getInstance(); // you can use any singleton methods here
        BStaticBlockInitialization instanceTwo = null;

        try {
            Constructor[] constructors = BStaticBlockInitialization.class.getDeclaredConstructors();

            for (Constructor c : constructors) {
                c.setAccessible(true);
                instanceTwo = (BStaticBlockInitialization) c.newInstance();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());

//        the hash code will be different for both instances because the Reflection destroy singleton
    }
}
