/**
 * Project Name: DesignPattern
 * File: AEagerInitialization$
 * Author: Koushik Chandra Sarker
 * Date: 7/15/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/15/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package a_singleton;

public class AEagerInitialization {
    private static final AEagerInitialization INSTANCE = new AEagerInitialization();
    private AEagerInitialization() {}
    public static AEagerInitialization getInstance() { return INSTANCE;}

}
