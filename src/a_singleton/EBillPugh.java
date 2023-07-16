/**
 * Project Name: DesignPattern
 * File: BillPugh$
 * Author: Koushik Chandra Sarker
 * Date: 7/15/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/15/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package a_singleton;

public class EBillPugh { // for java 5

    private static class SingletonHelper {
        private static final EBillPugh INSTANCE = new EBillPugh();
    }

    public static EBillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
