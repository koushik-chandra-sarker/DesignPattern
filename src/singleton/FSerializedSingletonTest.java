/**
 * Project Name: DesignPattern
 * File: FSerializedSingletonTest$
 * Author: Koushik Chandra Sarker
 * Date: 7/16/2023$ (MM/DD/YYYY)
 * Description: .
 * History:
 * - 7/16/2023$: Koushik Chandra Sarker - Initial version
 * - [Date]: [Author's Name] - [Modification description]
 */
package singleton;

import java.io.*;

public class FSerializedSingletonTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FSerializedSingleton instanceOne = FSerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("test.ser"));
        out.writeObject(instanceOne);
        out.close();

        // deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream( "test.ser"));
        FSerializedSingleton instanceTwo = (FSerializedSingleton) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode=" + instanceOne.hashCode());
        System.out.println("instanceTwo hashCode=" + instanceTwo.hashCode());
	/*
        Output: if readResolve() method is not available in FSerializedSingleton class then output will be
        different for both instanceOne and instanceTwo. if readResolve() method is available in FSerializedSingleton
        then output will be same for both instanceOne and instanceTwo.
 	*/
    }
}
