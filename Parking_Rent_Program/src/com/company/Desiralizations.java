package com.company;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Desiralizations {

    public static void main(String[] args) throws Exception{

        ArrayList BogotaWeekDays = new ArrayList();

        try
        {
            FileInputStream fis = new FileInputStream("Bogota Week Days");
            ObjectInputStream ois = new ObjectInputStream(fis);

           BogotaWeekDays = (ArrayList) ois.readObject();

            ois.close();
            fis.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }

        //Verify list data
        for (Object name : BogotaWeekDays) {
            System.out.println(name);
        }

    }


}
