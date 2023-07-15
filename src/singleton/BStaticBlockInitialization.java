/**
 * Project Name: DesignPattern
 * File: BStaticBlockInitialization$
 * Author: Koushik Chandra Sarker
 * Date: 7/15/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/15/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package singleton;

public class BStaticBlockInitialization {
    private static final BStaticBlockInitialization instance;

    private BStaticBlockInitialization(){}

    static{
        try {
            instance = new BStaticBlockInitialization();
        }catch (Exception e){
            throw new RuntimeException("Exception during initialization of BStaticBlockInitialization : " + e.getMessage());
        }
    }

    public static BStaticBlockInitialization getInstance() {
        return instance;
    }
}
