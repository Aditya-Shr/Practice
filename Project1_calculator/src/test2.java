
    // Java program to create a
// frame using inheritance().

import javax.swing.*;

    // inheriting JFrame
    public class test2 extends JFrame
    {
        JFrame frame;
        test2()
        {
            setTitle("this is also a title");

            // create button
            JButton button = new JButton("click");

            button.setBounds(165, 135, 115, 55);

            // adding button on frame
            add(button);

            // setting close operation
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            setSize(400, 500);
            setLayout(null);
            setVisible(true);
        }

        public static void main(String[] args)
        {
            new test2();
        }
    }


