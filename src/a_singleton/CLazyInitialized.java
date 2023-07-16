/**
 * Project Name: DesignPattern
 * File: CLazyInitialized$
 * Author: Koushik Chandra Sarker
 * Date: 7/15/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/15/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package a_singleton;

public class CLazyInitialized {
    private static CLazyInitialized instance;

    public static CLazyInitialized getInstance() {
        if (instance == null) {
            instance = new CLazyInitialized();
        }
        return instance;
    }
}
