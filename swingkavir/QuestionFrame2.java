/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swingkavir;

/**
 *
 * @author kaavi
 */
public class QuestionFrame2 extends javax.swing.JFrame implements QuestionInterface{

    /**
     * Creates new form QuestionFrame2
     */
    public QuestionFrame2() {
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

        Question2 = new javax.swing.JPanel();
        answerProgressBar = new javax.swing.JProgressBar();
        questionSetPanel4 = new javax.swing.JPanel();
        questionPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        answersPanel4 = new javax.swing.JPanel();
        answer1 = new java.awt.Button();
        answer2 = new java.awt.Button();
        imgClassDefinition = new javax.swing.JLabel();
        buttonNext = new javax.swing.JButton();
        buttonPrevious = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(700, 250));
        setResizable(false);

        Question2.setBackground(new java.awt.Color(108, 145, 191));
        Question2.setMaximumSize(new java.awt.Dimension(1000, 800));
        Question2.setMinimumSize(new java.awt.Dimension(1000, 800));

        questionSetPanel4.setBackground(new java.awt.Color(95, 154, 183));
        questionSetPanel4.setMaximumSize(new java.awt.Dimension(800, 500));
        questionSetPanel4.setMinimumSize(new java.awt.Dimension(800, 500));

        questionPanel4.setBackground(new java.awt.Color(95, 176, 183));
        questionPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel9.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Is this a valid Class definition?");

        javax.swing.GroupLayout questionPanel4Layout = new javax.swing.GroupLayout(questionPanel4);
        questionPanel4.setLayout(questionPanel4Layout);
        questionPanel4Layout.setHorizontalGroup(
            questionPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
        questionPanel4Layout.setVerticalGroup(
            questionPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        answersPanel4.setBackground(new java.awt.Color(95, 176, 183));
        answersPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        answer1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        answer1.setLabel("FALSE");
        answer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                answer1MouseClicked(evt);
            }
        });

        answer2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        answer2.setLabel("TRUE");
        answer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                answer2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout answersPanel4Layout = new javax.swing.GroupLayout(answersPanel4);
        answersPanel4.setLayout(answersPanel4Layout);
        answersPanel4Layout.setHorizontalGroup(
            answersPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answersPanel4Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(answer1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addComponent(answer2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
        );
        answersPanel4Layout.setVerticalGroup(
            answersPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answersPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(answersPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(answer1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answer2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        imgClassDefinition.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swingkavir/images/imgClassDefinition.jpg"))); // NOI18N

        javax.swing.GroupLayout questionSetPanel4Layout = new javax.swing.GroupLayout(questionSetPanel4);
        questionSetPanel4.setLayout(questionSetPanel4Layout);
        questionSetPanel4Layout.setHorizontalGroup(
            questionSetPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionSetPanel4Layout.createSequentialGroup()
                .addGap(0, 57, Short.MAX_VALUE)
                .addGroup(questionSetPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionSetPanel4Layout.createSequentialGroup()
                        .addGroup(questionSetPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(answersPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(questionPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, questionSetPanel4Layout.createSequentialGroup()
                        .addComponent(imgClassDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))))
        );
        questionSetPanel4Layout.setVerticalGroup(
            questionSetPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionSetPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(questionPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgClassDefinition, javax.swing.GroupLayout.PREFERRED_SIZE, 315, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(answersPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
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

        jLabel10.setBackground(new java.awt.Color(95, 154, 183));
        jLabel10.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Java Evaluation");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel10.setOpaque(true);

        javax.swing.GroupLayout Question2Layout = new javax.swing.GroupLayout(Question2);
        Question2.setLayout(Question2Layout);
        Question2Layout.setHorizontalGroup(
            Question2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(answerProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Question2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question2Layout.createSequentialGroup()
                        .addGroup(Question2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Question2Layout.createSequentialGroup()
                                .addComponent(buttonPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(questionSetPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
        );
        Question2Layout.setVerticalGroup(
            Question2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(questionSetPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Question2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                    .addComponent(Question2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 787, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Question2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPreviousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPreviousMouseClicked
        // TODO add your handling code here:
        FormController.goPrevious(2);
    }//GEN-LAST:event_buttonPreviousMouseClicked

    private void buttonNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonNextMouseClicked
         // TODO add your handling code here:
         FormController.goNext(2);
    }//GEN-LAST:event_buttonNextMouseClicked

    private void answer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answer1MouseClicked
        // TODO add your handling code here:
        FormController.handleAnswer(2,"bool", evt.getSource());
    }//GEN-LAST:event_answer1MouseClicked

    private void answer2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answer2MouseClicked
        // TODO add your handling code here:
        FormController.handleAnswer(2,"bool", evt.getSource());
    }//GEN-LAST:event_answer2MouseClicked
    
    @Override
    public void updateProgressBar(int progress) {
        answerProgressBar.setValue(progress);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Question2;
    private java.awt.Button answer1;
    private java.awt.Button answer2;
    private javax.swing.JProgressBar answerProgressBar;
    private javax.swing.JPanel answersPanel4;
    private javax.swing.JButton buttonNext;
    private javax.swing.JButton buttonPrevious;
    private javax.swing.JLabel imgClassDefinition;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel questionPanel4;
    private javax.swing.JPanel questionSetPanel4;
    // End of variables declaration//GEN-END:variables
}
