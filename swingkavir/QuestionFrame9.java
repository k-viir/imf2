/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package swingkavir;

/**
 *
 * @author kaavi
 */
public class QuestionFrame9 extends javax.swing.JFrame implements QuestionInterface{

    /**
     * Creates new form QuestionFrame9
     */
    public QuestionFrame9() {
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

        Question9 = new javax.swing.JPanel();
        answerProgressBar = new javax.swing.JProgressBar();
        questionSetPanel9 = new javax.swing.JPanel();
        questionPanel9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        answersPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textAnswer1 = new javax.swing.JTextArea();
        buttonFinish = new javax.swing.JButton();
        buttonPrevious = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(700, 250));

        Question9.setBackground(new java.awt.Color(108, 145, 191));
        Question9.setMaximumSize(new java.awt.Dimension(1000, 800));
        Question9.setMinimumSize(new java.awt.Dimension(1000, 800));

        questionSetPanel9.setBackground(new java.awt.Color(95, 154, 183));
        questionSetPanel9.setMaximumSize(new java.awt.Dimension(800, 500));
        questionSetPanel9.setMinimumSize(new java.awt.Dimension(800, 500));

        questionPanel9.setBackground(new java.awt.Color(95, 176, 183));
        questionPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel19.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("What are your career expectations?");

        javax.swing.GroupLayout questionPanel9Layout = new javax.swing.GroupLayout(questionPanel9);
        questionPanel9.setLayout(questionPanel9Layout);
        questionPanel9Layout.setHorizontalGroup(
            questionPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanel9Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        questionPanel9Layout.setVerticalGroup(
            questionPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionPanel9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        answersPanel9.setBackground(new java.awt.Color(95, 176, 183));
        answersPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        textAnswer1.setColumns(20);
        textAnswer1.setRows(5);
        textAnswer1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                textAnswer1PropertyChange(evt);
            }
        });
        jScrollPane4.setViewportView(textAnswer1);

        javax.swing.GroupLayout answersPanel9Layout = new javax.swing.GroupLayout(answersPanel9);
        answersPanel9.setLayout(answersPanel9Layout);
        answersPanel9Layout.setHorizontalGroup(
            answersPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answersPanel9Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        answersPanel9Layout.setVerticalGroup(
            answersPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(answersPanel9Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout questionSetPanel9Layout = new javax.swing.GroupLayout(questionSetPanel9);
        questionSetPanel9.setLayout(questionSetPanel9Layout);
        questionSetPanel9Layout.setHorizontalGroup(
            questionSetPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionSetPanel9Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(questionSetPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(questionPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(answersPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        questionSetPanel9Layout.setVerticalGroup(
            questionSetPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionSetPanel9Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(questionPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(answersPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        buttonFinish.setBackground(new java.awt.Color(95, 176, 183));
        buttonFinish.setText("Finish");
        buttonFinish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonFinishMouseClicked(evt);
            }
        });

        buttonPrevious.setBackground(new java.awt.Color(95, 176, 183));
        buttonPrevious.setText("Previous");
        buttonPrevious.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPreviousMouseClicked(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(95, 154, 183));
        jLabel20.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Java Evaluation");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel20.setOpaque(true);

        javax.swing.GroupLayout Question9Layout = new javax.swing.GroupLayout(Question9);
        Question9.setLayout(Question9Layout);
        Question9Layout.setHorizontalGroup(
            Question9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(answerProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Question9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question9Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question9Layout.createSequentialGroup()
                        .addGroup(Question9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Question9Layout.createSequentialGroup()
                                .addComponent(buttonPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(questionSetPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
        );
        Question9Layout.setVerticalGroup(
            Question9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(questionSetPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Question9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonFinish, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
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
                    .addComponent(Question9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Question9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPreviousMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPreviousMouseClicked
        // TODO add your handling code here:
        FormController.goPrevious(9);
    }//GEN-LAST:event_buttonPreviousMouseClicked

    private void buttonFinishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFinishMouseClicked
        // TODO add your handling code here:
        FormController.goNext(9);
    }//GEN-LAST:event_buttonFinishMouseClicked

    private void textAnswer1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_textAnswer1PropertyChange
        // TODO add your handling code here:
        FormController.handleAnswer(9,"text", evt.getSource());
    }//GEN-LAST:event_textAnswer1PropertyChange
    
    @Override
    public void updateProgressBar(int progress) {
        answerProgressBar.setValue(progress);
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Question9;
    private javax.swing.JProgressBar answerProgressBar;
    private javax.swing.JPanel answersPanel9;
    private javax.swing.JButton buttonFinish;
    private javax.swing.JButton buttonPrevious;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel questionPanel9;
    private javax.swing.JPanel questionSetPanel9;
    private javax.swing.JTextArea textAnswer1;
    // End of variables declaration//GEN-END:variables
}