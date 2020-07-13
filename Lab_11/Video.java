import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Video {
    JFrame frame;
    JComboBox<String> movieList = new JComboBox<>();
    JTextField priceField;

    public static void main(String[] args){
        Video gui = new Video();
        gui.go();
    }

    public void go(){
        initMovieList();
        //movieList.setBorder(BorderFactory.createTitledBorder("Movie List111"));
        movieList.addItemListener(new priceListener());

        frame = new JFrame("Play It Again Videos");
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        priceField = new JTextField("Movie Price $Null",16);
        priceField.setEditable(false);


        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        JLabel listNote = new JLabel("Movie List");
        panel1.add(listNote);
        panel1.add(movieList);
        frame.getContentPane().add(BorderLayout.NORTH,panel1);

        JLabel priceBox = new JLabel("Yunnan Uni Videos");
        panel2.add(priceBox);
        panel2.add(priceField);
        frame.getContentPane().add(BorderLayout.CENTER,panel2);

        frame.setVisible(true);

    }

    class priceListener implements ItemListener{
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(ItemEvent.SELECTED==e.getStateChange()) {
                String item = movieList.getSelectedItem().toString();
                //System.out.println(item);
                switch (item) {
                    case "Forest Gump":
                        //System.out.println(item + " ---");
                        priceField.setText("Movie Price $2.50");
                        break;
                    case "none":
                        priceField.setText("Movie Price $Null");
                        break;
                    default:
                        priceField.setText("Movie Price $2.00");
                        break;
                }
            }

        }
    }


    public void initMovieList(){
        movieList.addItem("none");
        movieList.addItem("I saw the Devil");
        movieList.addItem("Train to Busan");
        movieList.addItem("Iron Man");
        movieList.addItem("Bat Man");
        movieList.addItem("Super Man");
        movieList.addItem("Saitama");
        movieList.addItem("James Bond");
        movieList.addItem("Hackers");
        movieList.addItem("IT guy");
        movieList.addItem("Source Code");
        movieList.addItem("Wolf warrior");
    }
}
