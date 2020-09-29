package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface
{
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {
        // TODO -- add your code here

        //  Upper line of the box (Horizontally)
        mOut.print('+');
        for(int i = 0; i < size*2; i++)
        {
            mOut.print('-');
        }
        mOut.print('+');
        mOut.println("");

        // Body of Diamond
        for(int i = 0; i < size*2-1; i++)
        {
            mOut.print('|'); // Vertically border of Diamond box
            // print space in upper left side (2nd quadrant)
            if(i < size-1)
            {
                for (int spc = 1; spc < size - i; spc++)
                {
                    mOut.print(" ");
                }
            }
            // print space in lower left (3rd quadrant)
            else
            {
                for(int spc = size; spc <= i; spc++)
                {
                    mOut.print(" ");
                }
            }
            // print forward slash in upper left area (2nd quadrant)
            if(i < size-1)
            {
                mOut.print('/');
            }
            // middle <----> line
            else if(i < size)
            {
                mOut.print('<');
            }
            // print backward slash in lower left area (3rd quadrant )
            else
            {
                mOut.print('\\');
            }

                //   check if the line is even or odd
            //       if even
            if((i+1)%2 == 0)
            {
                //           print " -- " under  Upper  side of diamond
                if(i < size)
                {
                    for (int bar = 1; bar <= i * 2; bar++)
                    {
                        mOut.print('-');
                    }
                }
                //            print " -- " in Lower side of diamond
                else
                {
                    for(int bar = ((size*2)-2)*2; bar > i*2 ; bar--)
                    {
                        mOut.print('-');
                    }
                }
                //             if odd
            }
            //                 print " == " upper side of diamond
            else
            {
                if(i < size)
                {
                    for (int bar = 1; bar <= i * 2; bar++)
                    {
                        mOut.print('=');
                    }
                }
                //              print " == " Lower side of diamond
                else
                {
                    for(int bar = ((size*2)-2)*2; bar > i*2 ; bar--)
                    {
                        mOut.print('=');
                    }
                }
            }
            // back slash in Upper right side (1st quadrant)
            if(i < size-1)
            {
                mOut.print('\\');
            }
            // middle line
            else if(i < size)
            {
                mOut.print('>');
            }
            // forward slash in lower right side (4th Quadrant)
            else
            {
                mOut.print('/');
            }
            // print space on the upper right side of diamond (1st quadrant)
            if(i < size-1)
            {
                for (int spc = 1; spc < size - i; spc++)
                {
                    mOut.print(" ");
                }
            }
            //  print space on the Lower right side of diamond (4th quadrant)

            else
            {
                for(int spc = size; spc <= i; spc++)
                {
                    mOut.print(" ");
                }
            }
            mOut.print('|');

            mOut.println("");
        }

        //                   Lower Border
        mOut.print('+');
        for(int i = 1; i <= size*2; i++)
        {
            mOut.print('-');
        }
        mOut.print("+");

    // TODO -- add any helper methods here

    }


}
