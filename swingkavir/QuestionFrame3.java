/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swingkavir;

/**
 *
 * @author kaavi
 */
public class QuestionFrame3 extends javax.swing.JFrame implements QuestionInterface{

    /**
     * Creates new form QuestionFrame3
     */
    public QuestionFrame3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Question3 = new javax.swing.JPanel();
        answerProgressBar = new javax.swing.JProgressBar();
        questionSetPanel8 = new javax.swing.JPanel();
        questionPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        answersPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAnswer1 = new javax.swing.JTextArea();
        buttonNext = new javax.swing.JButton();
        buttonPrevious = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(700, 250));
        setResizable(false);

        Question3.setBackground(new java.awt.Color(108, 145, 191));

        questionSetPanel8.setBackground(new java.awt.Color(95, 154, 183));
        questionSetPanel8.setMaximumSize(new java.awt.Dimension(800, 500));
        questionSetPanel8.setMinimumSize(new java.awt.Dimension(800, 500));

        questionPanel8.setBackground(new java.awt.Color(95, 176, 183));
        questionPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel17.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Write the appropiate line of code to initialize a list of strings with 2 predefined values.");

        javax.swing.GroupLayout questionPanel8Layout = new javax.swing.GroupLayout(questionPanel8);
        questionPanel8.setLayout(questionPanel8Layout);
        questionPanel8Layout.setHorizontalGroup(
            questionPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanel8Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        questionPanel8Layout.setVerticalGroup(
            questionPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanel8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        answersPanel8.setBackground(new java.awt.Color(95, 176, 183));
        answersPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        textAnswer1.setColumns(20);
        textAnswer1.setRows(5);
        textAnswer1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                textAnswer1PropertyChange(evt);
            }
        });
        textAnswer1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textAnswer1KeyPressed(evt);
            }
        });
        textAnswer1.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                textAnswer1VetoableChange(evt);
            }
        });
        jScrollPane2.setViewportView(textAnswer1);

        javax.swing.GroupLayout answersPanel8Layout = new javax.swing.GroupLayout(answersPanel8);
        answersPanel8.setLayout(answersPanel8Layout);
        answersPanel8Layout.setHorizontalGroup(
            answersPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answersPanel8Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        answersPanel8Layout.setVerticalGroup(
            answersPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answersPanel8Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout questionSetPanel8Layout = new javax.swing.GroupLayout(questionSetPanel8);
        questionSetPanel8.setLayout(questionSetPanel8Layout);
        questionSetPanel8Layout.setHorizontalGroup(
            questionSetPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionSetPanel8Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(questionSetPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(questionPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(answersPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        questionSetPanel8Layout.setVerticalGroup(
            questionSetPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionSetPanel8Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(questionPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(answersPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        buttonNext.setBackground(new java.awt.Color(95, 176, 183));
        buttonNext.setText("Next");
        buttonNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonNextMouseClicked(evt);
            }
        });

        buttonPrevious.setBackground(new java.awt.Color(95, 176, 183));
        buttonPrevious.setText("Previous");
        buttonPrevious.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPreviousMouseClicked(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(95, 154, 183));
        jLabel18.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Java Evaluation");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel18.setOpaque(true);

        javax.swing.GroupLayout Question3Layout = new javax.swing.GroupLayout(Question3);
        Question3.setLayout(Question3Layout);
        Question3Layout.setHorizontalGroup(
            Question3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(answerProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Question3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question3Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question3Layout.createSequentialGroup()
                        .addGroup(Question3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Question3Layout.createSequentialGroup()
                                .addComponent(buttonPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(questionSetPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
        );
        Question3Layout.setVerticalGroup(
            Question3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(questionSetPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Question3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonNext, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(buttonPrevious, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(answerProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1012, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Question3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Question3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPreviousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPreviousMouseClicked
        // TODO add your handling code here:
        FormController.goPrevious(3);
    }//GEN-LAST:event_buttonPreviousMouseClicked

    private void buttonNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNextMouseClicked
        // TODO add your handling code here:
        FormController.goNext(3);
    }//GEN-LAST:event_buttonNextMouseClicked

    private void textAnswer1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_textAnswer1PropertyChange
        // TODO add your handling code here:
       FormController.handleAnswer(3 ,"text", evt.getSource());
    }//GEN-LAST:event_textAnswer1PropertyChange

    private void textAnswer1VetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_textAnswer1VetoableChange
        // TODO add your handling code here:
             //   FormController.handleAnswer(3 ,"text", evt.getSource());

    }//GEN-LAST:event_textAnswer1VetoableChange

    private void textAnswer1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAnswer1KeyPressed
        // TODO add your handling code here:
              //  FormController.handleAnswer(3 ,"text", evt.getSource());

    }//GEN-LAST:event_textAnswer1KeyPressed

    @Override
    public void updateProgressBar(int progress) {
        answerProgressBar.setValue(progress);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Question3;
    private javax.swing.JProgressBar answerProgressBar;
    private javax.swing.JPanel answersPanel8;
    private javax.swing.JButton buttonNext;
    private javax.swing.JButton buttonPrevious;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel questionPanel8;
    private javax.swing.JPanel questionSetPanel8;
    private javax.swing.JTextArea textAnswer1;
    // End of variables declaration//GEN-END:variables
}
