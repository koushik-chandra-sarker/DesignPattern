/**
 * Project Name: DesignPattern
 * File: DThreadSafe$
 * Author: Koushik Chandra Sarker
 * Date: 7/15/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/15/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package a_singleton;

/**
 * To make Thread safe, singleton class, just create methods with 'synchronized' keys.
 */
public class DThreadSafe {
    private static DThreadSafe INSTANCE;

//     this approach will reduce performance because synchronized methods is costly
    public static synchronized DThreadSafe getInstance() { // synchronized will make sure that the instance is thread safe
        if (INSTANCE == null) {
            INSTANCE = new DThreadSafe();
        }
        return INSTANCE;
    }
    public static DThreadSafe getInstanceUsingDoubleLocking(){  // this approach will increase performance
        if (INSTANCE == null) {
            synchronized (DThreadSafe.class){
                if (INSTANCE ==null){
                    INSTANCE = new DThreadSafe();
                }
            }
        }
        return INSTANCE;
    }
}
