/**
 * Project Name: DesignPattern
 * File: FSerializedSingleton$
 * Author: Koushik Chandra Sarker
 * Date: 7/16/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/16/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package singleton;

import java.io.Serializable;

public class FSerializedSingleton implements Serializable {
    private static final long serialVersionUID = 132423452342324L;

    private static class SingletonHelper {
        private static final FSerializedSingleton instance = new FSerializedSingleton();
    }

    public static FSerializedSingleton getInstance() {
        return SingletonHelper.instance;
    }
    protected Object readResolve() {
        return getInstance();
    }
}
