/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swingkavir;

import java.awt.Button;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/**
 *
 * @author kaavi
 */
public class FormController {

    public static int progressValue = 0;
    private static int resultValue = 10;
    private static List<javax.swing.JFrame> questionFrames;
    private static ArrayList<ArrayList<Object>> correctAnswers = new ArrayList<ArrayList<Object>>();
    private static ArrayList<ArrayList<Object>> inputAnswers = new ArrayList<ArrayList<Object>>();

    public FormController() {
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            correctAnswers.add(new ArrayList<Object>());
            inputAnswers.add(new ArrayList<Object>());
        }

        setCorrectAnswers();

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuestionFrame0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionFrame0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionFrame0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionFrame0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // javax.swing.JFrame myFrame = new QuestionFrame0();
        questionFrames = Arrays.asList(new QuestionFrame0(), new QuestionFrame1(), new QuestionFrame2(), new QuestionFrame3(), new QuestionFrame4(),
                new QuestionFrame5(), new QuestionFrame6(), new QuestionFrame7(), new QuestionFrame8(), new QuestionFrame9(), new QuestionFrameEnd());
        javax.swing.JFrame initialFrame = questionFrames.get(0);
        initialFrame.setVisible(true);
    }

    public static void goNext(int currentFrame) {
        updateProgress(currentFrame, true);
        questionFrames.get(currentFrame).dispose();
        if (currentFrame == 9) {
            checkCorrectAnswers();
            setFinishText();
        }
        questionFrames.get(currentFrame + 1).setVisible(true);
    }

    public static void goPrevious(int currentFrame) {
        updateProgress(currentFrame, false);        
        questionFrames.get(currentFrame).dispose();
        questionFrames.get(currentFrame - 1).setVisible(true);

    }

    public static void handleAnswer(int currentFrame, String answerType, Object source) {
        switch (answerType) {
            case "radio":
                handleRadioAnswer(currentFrame, source);
                break;
            case "bool":
                handleBoolAnswer(currentFrame, source);
                break;
            case "text":
                handleTextAnswer(currentFrame, source);
                break;
            default:
                System.out.println("something went wrong");
        }
    }

    public static void handleRadioAnswer(int currentFrame, Object source) {
        JRadioButton radioAnswer = (JRadioButton) source;
        if (radioAnswer.isSelected()) {
            inputAnswers.get(currentFrame).add(radioAnswer.getText());
        } else {
            inputAnswers.get(currentFrame).remove(radioAnswer.getText());
        }

    }

    public static void handleBoolAnswer(int currentFrame, Object source) {
        Button buttonAnswer = (Button) source;
        if (buttonAnswer.getLabel().toLowerCase().equals("true")) {
            inputAnswers.set(currentFrame, new ArrayList<>(Arrays.asList(true)));
        } else {
            inputAnswers.set(currentFrame, new ArrayList<>(Arrays.asList(false)));
        }

    }

    public static void handleTextAnswer(int currentFrame, Object source) {
        JTextArea textAnswer = (JTextArea) source;
        if (textAnswer.getText() != null && !textAnswer.getText().equals("")) {
            inputAnswers.set(currentFrame, new ArrayList<>(Arrays.asList((String) textAnswer.getText())));
        } else {
            inputAnswers.set(currentFrame, null);
        }
        if (questionFrames  != null) {
            progressValue = 0;
            for (ArrayList<Object> eachAnswerList: inputAnswers) {
                if (eachAnswerList != null && eachAnswerList.size() > 0 && eachAnswerList.get(0) != "") {
                    progressValue += 10;
                }
            }

            for (JFrame eachFrame:  questionFrames) {
            QuestionInterface myFrame = (QuestionInterface) eachFrame;
            myFrame.updateProgressBar(progressValue);
        }

        }
        
    }

    public static void setCorrectAnswers() {
        correctAnswers.get(0).addAll(Arrays.asList("int", "float", "long", "double"));
        correctAnswers.get(1).add(true);
        correctAnswers.get(2).add(true);
        correctAnswers.get(3).add("List<String> myList = Arrays.asList(\"value1\", \"value2\");");
        correctAnswers.get(4).addAll(Arrays.asList("Encapsulation", "Abstraction", "Polymorphism", "Inheritance"));
        correctAnswers.get(5).add("extends");
        correctAnswers.get(6).add(true);
        correctAnswers.get(7).add("Swing");
        correctAnswers.get(8).add("import");
        correctAnswers.get(9).add("Free answer");
    }

    public static void checkCorrectAnswers() {
        resultValue = 10;
        for (int index = 0; index < inputAnswers.size(); index++) {
            if (inputAnswers.get(index) != null && inputAnswers.get(index).containsAll(correctAnswers.get(index))) {
                resultValue += 10;
            } else {
                System.out.println("nono");
            }
        }
    }
    
    public static void finish() {
        questionFrames.get(10).dispose();
    }

    public static void setFinishText() {
        String finishText = "Questionaire finished, result: " + Integer.toString(resultValue);
        QuestionFrameEnd endFrame = (QuestionFrameEnd) questionFrames.get(10);
        endFrame.setLabelText(finishText);
    }
    
    public static String setFinishText2() {
        return "hey this is just a text";
    }

    public static void updateProgress(int currentFrame, Boolean isNext) {
        int targetFrame;
        targetFrame = isNext ? 1 : -1;
        progressValue = 0;
        
        for (ArrayList<Object> eachAnswerList: inputAnswers) {
            if (eachAnswerList != null && eachAnswerList.size() > 0 && eachAnswerList.get(0) != "") {
                progressValue += 10;
            }
        }
        
        for (JFrame eachFrame:  questionFrames) {
            QuestionInterface myFrame = (QuestionInterface) eachFrame;
            myFrame.updateProgressBar(progressValue);
        }
    }

    public static List<JFrame> getQuestionFrames() {
        return questionFrames;
    }

    public static ArrayList<ArrayList<Object>> getCorrectAnswers() {
        return correctAnswers;
    }

    public static ArrayList<ArrayList<Object>> getInputAnswers() {
        return inputAnswers;
    }


    public static void setQuestionFrames(List<JFrame> questionFrames) {
        FormController.questionFrames = questionFrames;
    }

    public static void setCorrectAnswers(ArrayList<ArrayList<Object>> correctAnswers) {
        FormController.correctAnswers = correctAnswers;
    }

    public static void setInputAnswers(ArrayList<ArrayList<Object>> inputAnswers) {
        FormController.inputAnswers = inputAnswers;
    }

}
