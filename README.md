public class GraphicalCGPAApp {
    public static void main(String[] args) {
        javax.swing.JFrame frame = new javax.swing.JFrame("CGPA Calculator");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        javax.swing.JPanel panel = new javax.swing.JPanel();
        frame.add(panel);
        placeComponents(panel);
        
        frame.setVisible(true);
    }
    private static void placeComponents(javax.swing.JPanel panel) {
        panel.setLayout(null);
        
        javax.swing.JLabel userLabel = new javax.swing.JLabel("Student Name:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        
        javax.swing.JTextField userText = new javax.swing.JTextField(20);
        userText.setBounds(150, 20, 165, 25);
        panel.add(userText);
        
        javax.swing.JLabel scoreLabel = new javax.swing.JLabel("Score:");
        scoreLabel.setBounds(10, 50, 80, 25);
        panel.add(scoreLabel);
        
        javax.swing.JTextField scoreText = new javax.swing.JTextField(20);
        scoreText.setBounds(150, 50, 165, 25);
        panel.add(scoreText);
        
        javax.swing.JButton calculateButton = new javax.swing.JButton("Calculate CGPA");
        calculateButton.setBounds(10, 80, 150, 25);
        panel.add(calculateButton);
        
        javax.swing.JLabel resultLabel = new javax.swing.JLabel("");
        resultLabel.setBounds(10, 110, 300, 25);
        panel.add(resultLabel);
        
        calculateButton.addActionListener(e -> {
            String studentName = userText.getText();
            double score;
            try {
                score = Double.parseDouble(scoreText.getText());
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid score entered.");
                return;
            }
            
            String grade;
            if (score >= 90) {
                grade = "A - Pass";
            } else if (score >= 80) {
                grade = "B - Pass";
            } else if (score >= 70) {
                grade = "C - Pass";
            } else if (score >= 60) {
                grade = "D - Pass";
            } else {
                grade = "F - Fail";
            }
            
            resultLabel.setText("Student Name: " + studentName + ", Grade: " + grade);
        });
    }
}