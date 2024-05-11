import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class LandingPage extends JFrame {
    JLabel titleBar, title, author, genre, status;
    JTextField titleText, authorText, genreText;
    JComboBox statusCombo;


    LandingPage() {

        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 800);
        setLayout(null);
        ImageIcon logo = new ImageIcon("src\\logo.jpg");
        setIconImage(logo.getImage());

        // ALL TITLE BAR LABELS

        titleBar = new JLabel();
        titleBar.setText("Book Library");

        ImageIcon bookImage = new ImageIcon("src\\image.png");
        titleBar.setIcon(bookImage);

        titleBar.setHorizontalTextPosition(JLabel.CENTER);
        titleBar.setVerticalTextPosition(JLabel.TOP);

        titleBar.setForeground(new Color(10, 56, 240));
        titleBar.setFont(new Font("MV Boli", Font.BOLD, 60));
        titleBar.setIconTextGap(10);




//        titleBar.setBackground(new Color(220, 240, 244));
//        titleBar.setOpaque(true);

//        Border TitleBarBorder = BorderFactory.createLineBorder(Color.black,3);
//        titleBar.setBorder(TitleBarBorder);

        titleBar.setVerticalAlignment(JLabel.TOP);
        titleBar.setHorizontalAlignment(JLabel.CENTER);


        // ALL FORM LABELS
        title = new JLabel("Title: ");
        title.setFont(new Font("Roboto Slab", Font.BOLD, 20));
        title.setForeground(new Color(3, 40, 111, 255));
        title.setBounds(300, 20, 200, 30);


        titleText = new JTextField(20);
        titleText.setPreferredSize(new Dimension(300,30));
        titleText.setBounds(450, 20, 200, 30);


        author = new JLabel("Author: ");
        author.setFont(new Font("Roboto Slab", Font.BOLD, 20));
        author.setForeground(new Color(3, 40, 111, 255));
        author.setBounds(300, 70, 200, 30);

        authorText = new JTextField();
        authorText.setBounds(450, 70, 200, 30);

        genre = new JLabel("Genre: ");
        genre.setFont(new Font("Roboto Slab", Font.BOLD, 20));
        genre.setForeground(new Color(3, 40, 111, 255));
        genre.setBounds(300, 120, 200, 30);

        genreText = new JTextField();
        genreText.setBounds(450, 120, 200, 30);

        status = new JLabel("Status: ");
        status.setFont(new Font("Roboto Slab", Font.BOLD, 20));
        status.setForeground(new Color(3, 40, 111, 255));
        status.setBounds(300, 170, 200, 30);

        statusCombo = new JComboBox(new String[]{"Want to read", "Read", "Reading", "Dropped"});
        statusCombo.setBounds(450, 170, 200, 30);

//        titleText.setHorizontalAlignment(JLabel.CENTER);
        //titleText.setBounds(350, 20, 200, 30);


        //Buttons:

        JButton addBook = new JButton("Add Book");
        addBook.setBackground(Color.BLUE);
        addBook.setForeground(Color.WHITE);
        addBook.setBounds(350, 240, 100, 30);
        addBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addBook();
            }
        });
        JButton viewBooks = new JButton("View Books");
        viewBooks.setBackground(Color.BLUE);
        viewBooks.setForeground(Color.WHITE);
        viewBooks.setBounds(500, 240, 120, 30);
        viewBooks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                viewBooks();
            }
        });


        //CREATING PANELS TO ADD LABELS
        JPanel titleBarPanel = new JPanel();
        titleBarPanel.setBackground(new Color(220, 240, 244));
        titleBarPanel.setBounds(400,200, 900,220);

        titleBarPanel.add(titleBar, BorderLayout.CENTER);

        Border titleBarPanelBorder = BorderFactory.createLineBorder(new Color(3, 40, 111),3);
        titleBarPanel.setBorder(titleBarPanelBorder);


        JPanel formPanel = new JPanel();
        formPanel.setLayout(null);
        formPanel.setBackground(new Color(255, 240, 230));
        formPanel.setBounds(400,220+200, 900,320);

        Border formPanelBorder = BorderFactory.createLineBorder(new Color(121, 49, 0),3);
        formPanel.setBorder(formPanelBorder);


        //ADDING LABELS TO PANEL
        formPanel.add(title);
        formPanel.add(titleText);
        formPanel.add(author);
        formPanel.add(authorText);
        formPanel.add(genre);
        formPanel.add(genreText);
        formPanel.add(status);
        formPanel.add(statusCombo);

        //ADDING BUTTONS
        formPanel.add(addBook);
        formPanel.add(viewBooks);

        // ADD PANELS TO FRAME:
        add(titleBarPanel);
        add(formPanel);
        setVisible(true);

        //frame.pack();

    }

     public void addBook() {

        // Write the book data
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("books.txt", true))) {
            writer.write("Title: " + titleText.getText() + "\n");
            writer.write("Author: " + authorText.getText() + "\n");
            writer.write("Genre: " + genreText.getText() + "\n");
            writer.write("Status: " + statusCombo.getSelectedItem() + "\n");
            writer.write("--------------------");
            writer.write("\n");
            writer.close();
            JOptionPane.showMessageDialog(this, "Book details added successfully.");

            // CLEAR THE TEXT FIELD AFTER ADDING BOOK
            titleText.setText("");
            authorText.setText("");
            genreText.setText("");
            statusCombo.setSelectedIndex(0);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving book details: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void viewBooks() {
        try {
            // Read the book data
            BufferedReader reader = new BufferedReader(new FileReader("books.txt"));
            StringBuilder booksContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                booksContent.append(line).append("\n");
            }
            reader.close();

            // Display books in a pop up window
            JOptionPane.showMessageDialog(this, booksContent.toString(), "All Books", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error reading books: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}