package pianvirtualde;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class PianVirtualDE extends javax.swing.JFrame {

    /**
     * Creates new form PianVirtualDE
     */
    public PianVirtualDE() {
        initComponents();
    }
    
    //C DIEZ
    private void notePianoCdiezDE() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
                                     //incercati fara throws  si observati ca obtineti erori de compilare  in fata liniilor de cod din mijloc
                                     //una dintre recomandarile de pe bulina rosie de eroare din fata liniei fiind Add throws clause pentru
                                    //anumite  pachete/clase…bifati pe aceste recomandari si observati ca se adauga automat declaratia throws 
                                    //dupa semnatura metodei si se rezolva progresiv erorile 
      File file = new File("C:\\Users\\enyae\\OneDrive - Universitatea Politehnica Bucuresti\\2nd Year\\2nd Year, 1st Semester\\TEME & PROIECTE\\4.Programare orientat pe obiecte ()\\ProiecteJavaSeminar2022\\Seminar nr.7 POO\\PianVirtualDE\\Note-pian\\Pian-Cdiez.wav"); 
                                                                    //punem calea copiata intre ghilimele si avem grija ca toate separatoarele sa fie \\
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      clip.start();
    }
    
    //C SIMPLU
    private void notePianoCsimpluDE() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
                                     //incercati fara throws  si observati ca obtineti erori de compilare  in fata liniilor de cod din mijloc
                                     //una dintre recomandarile de pe bulina rosie de eroare din fata liniei fiind Add throws clause pentru
                                    //anumite  pachete/clase…bifati pe aceste recomandari si observati ca se adauga automat declaratia throws 
                                    //dupa semnatura metodei si se rezolva progresiv erorile 
      File file = new File("C:\\Users\\enyae\\OneDrive - Universitatea Politehnica Bucuresti\\2nd Year\\2nd Year, 1st Semester\\TEME & PROIECTE\\4.Programare orientat pe obiecte ()\\ProiecteJavaSeminar2022\\Seminar nr.7 POO\\PianVirtualDE\\Note-pian\\Pian-C.wav"); 
                                                                    //punem calea copiata intre ghilimele si avem grija ca toate separatoarele sa fie \\
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      clip.start();
    }
    
    //D SIMPLU
    private void notePianoDsimpluDE() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
                                     //incercati fara throws  si observati ca obtineti erori de compilare  in fata liniilor de cod din mijloc
                                     //una dintre recomandarile de pe bulina rosie de eroare din fata liniei fiind Add throws clause pentru
                                    //anumite  pachete/clase…bifati pe aceste recomandari si observati ca se adauga automat declaratia throws 
                                    //dupa semnatura metodei si se rezolva progresiv erorile 
      File file = new File("C:\\Users\\enyae\\OneDrive - Universitatea Politehnica Bucuresti\\2nd Year\\2nd Year, 1st Semester\\TEME & PROIECTE\\4.Programare orientat pe obiecte ()\\ProiecteJavaSeminar2022\\Seminar nr.7 POO\\PianVirtualDE\\Note-pian\\Pian-D.wav"); 
                                                                    //punem calea copiata intre ghilimele si avem grija ca toate separatoarele sa fie \\
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      clip.start();
    }
    
    //D DIEZ
    private void notePianoDdiezDE() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
                                     //incercati fara throws  si observati ca obtineti erori de compilare  in fata liniilor de cod din mijloc
                                     //una dintre recomandarile de pe bulina rosie de eroare din fata liniei fiind Add throws clause pentru
                                    //anumite  pachete/clase…bifati pe aceste recomandari si observati ca se adauga automat declaratia throws 
                                    //dupa semnatura metodei si se rezolva progresiv erorile 
      File file = new File("C:\\Users\\enyae\\OneDrive - Universitatea Politehnica Bucuresti\\2nd Year\\2nd Year, 1st Semester\\TEME & PROIECTE\\4.Programare orientat pe obiecte ()\\ProiecteJavaSeminar2022\\Seminar nr.7 POO\\PianVirtualDE\\Note-pian\\Pian-Ddiez.wav"); 
                                                                    //punem calea copiata intre ghilimele si avem grija ca toate separatoarele sa fie \\
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      clip.start();
    }
    
    //E SIMPLU
    private void notePianoEsimpluDE() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
                                     //incercati fara throws  si observati ca obtineti erori de compilare  in fata liniilor de cod din mijloc
                                     //una dintre recomandarile de pe bulina rosie de eroare din fata liniei fiind Add throws clause pentru
                                    //anumite  pachete/clase…bifati pe aceste recomandari si observati ca se adauga automat declaratia throws 
                                    //dupa semnatura metodei si se rezolva progresiv erorile 
      File file = new File("C:\\Users\\enyae\\OneDrive - Universitatea Politehnica Bucuresti\\2nd Year\\2nd Year, 1st Semester\\TEME & PROIECTE\\4.Programare orientat pe obiecte ()\\ProiecteJavaSeminar2022\\Seminar nr.7 POO\\PianVirtualDE\\Note-pian\\Pian-E.wav"); 
                                                                    //punem calea copiata intre ghilimele si avem grija ca toate separatoarele sa fie \\
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      clip.start();
    }
    
    //F SIMPLU
    private void notePianoFsimpluDE() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
                                     //incercati fara throws  si observati ca obtineti erori de compilare  in fata liniilor de cod din mijloc
                                     //una dintre recomandarile de pe bulina rosie de eroare din fata liniei fiind Add throws clause pentru
                                    //anumite  pachete/clase…bifati pe aceste recomandari si observati ca se adauga automat declaratia throws 
                                    //dupa semnatura metodei si se rezolva progresiv erorile 
      File file = new File("C:\\Users\\enyae\\OneDrive - Universitatea Politehnica Bucuresti\\2nd Year\\2nd Year, 1st Semester\\TEME & PROIECTE\\4.Programare orientat pe obiecte ()\\ProiecteJavaSeminar2022\\Seminar nr.7 POO\\PianVirtualDE\\Note-pian\\Pian-F.wav"); 
                                                                    //punem calea copiata intre ghilimele si avem grija ca toate separatoarele sa fie \\
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      clip.start();
    }
    
    //F DIEZ
    private void notePianoFdiezDE() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
                                     //incercati fara throws  si observati ca obtineti erori de compilare  in fata liniilor de cod din mijloc
                                     //una dintre recomandarile de pe bulina rosie de eroare din fata liniei fiind Add throws clause pentru
                                    //anumite  pachete/clase…bifati pe aceste recomandari si observati ca se adauga automat declaratia throws 
                                    //dupa semnatura metodei si se rezolva progresiv erorile 
      File file = new File("C:\\Users\\enyae\\OneDrive - Universitatea Politehnica Bucuresti\\2nd Year\\2nd Year, 1st Semester\\TEME & PROIECTE\\4.Programare orientat pe obiecte ()\\ProiecteJavaSeminar2022\\Seminar nr.7 POO\\PianVirtualDE\\Note-pian\\Pian-Fdiez.wav"); 
                                                                    //punem calea copiata intre ghilimele si avem grija ca toate separatoarele sa fie \\
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      clip.start();
    }
    
    //G SIMPLU
    private void notePianoGsimpluDE() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
                                     //incercati fara throws  si observati ca obtineti erori de compilare  in fata liniilor de cod din mijloc
                                     //una dintre recomandarile de pe bulina rosie de eroare din fata liniei fiind Add throws clause pentru
                                    //anumite  pachete/clase…bifati pe aceste recomandari si observati ca se adauga automat declaratia throws 
                                    //dupa semnatura metodei si se rezolva progresiv erorile 
      File file = new File("C:\\Users\\enyae\\OneDrive - Universitatea Politehnica Bucuresti\\2nd Year\\2nd Year, 1st Semester\\TEME & PROIECTE\\4.Programare orientat pe obiecte ()\\ProiecteJavaSeminar2022\\Seminar nr.7 POO\\PianVirtualDE\\Note-pian\\Pian-G.wav"); 
                                                                    //punem calea copiata intre ghilimele si avem grija ca toate separatoarele sa fie \\
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      clip.start();
    }
    
    //G DIEZ
    private void notePianoGdiezDE() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
                                     //incercati fara throws  si observati ca obtineti erori de compilare  in fata liniilor de cod din mijloc
                                     //una dintre recomandarile de pe bulina rosie de eroare din fata liniei fiind Add throws clause pentru
                                    //anumite  pachete/clase…bifati pe aceste recomandari si observati ca se adauga automat declaratia throws 
                                    //dupa semnatura metodei si se rezolva progresiv erorile 
      File file = new File("C:\\Users\\enyae\\OneDrive - Universitatea Politehnica Bucuresti\\2nd Year\\2nd Year, 1st Semester\\TEME & PROIECTE\\4.Programare orientat pe obiecte ()\\ProiecteJavaSeminar2022\\Seminar nr.7 POO\\PianVirtualDE\\Note-pian\\Pian-Gdiez.wav"); 
                                                                    //punem calea copiata intre ghilimele si avem grija ca toate separatoarele sa fie \\
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      clip.start();
    }
    
    //A SIMPLU
    private void notePianoAsimpluDE() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
                                     //incercati fara throws  si observati ca obtineti erori de compilare  in fata liniilor de cod din mijloc
                                     //una dintre recomandarile de pe bulina rosie de eroare din fata liniei fiind Add throws clause pentru
                                    //anumite  pachete/clase…bifati pe aceste recomandari si observati ca se adauga automat declaratia throws 
                                    //dupa semnatura metodei si se rezolva progresiv erorile 
      File file = new File("C:\\Users\\enyae\\OneDrive - Universitatea Politehnica Bucuresti\\2nd Year\\2nd Year, 1st Semester\\TEME & PROIECTE\\4.Programare orientat pe obiecte ()\\ProiecteJavaSeminar2022\\Seminar nr.7 POO\\PianVirtualDE\\Note-pian\\Pian-A.wav"); 
                                                                    //punem calea copiata intre ghilimele si avem grija ca toate separatoarele sa fie \\
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      clip.start();
    }
    
    //A DIEZ
    private void notePianoAdiezDE() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
                                     //incercati fara throws  si observati ca obtineti erori de compilare  in fata liniilor de cod din mijloc
                                     //una dintre recomandarile de pe bulina rosie de eroare din fata liniei fiind Add throws clause pentru
                                    //anumite  pachete/clase…bifati pe aceste recomandari si observati ca se adauga automat declaratia throws 
                                    //dupa semnatura metodei si se rezolva progresiv erorile 
      File file = new File("C:\\Users\\enyae\\OneDrive - Universitatea Politehnica Bucuresti\\2nd Year\\2nd Year, 1st Semester\\TEME & PROIECTE\\4.Programare orientat pe obiecte ()\\ProiecteJavaSeminar2022\\Seminar nr.7 POO\\PianVirtualDE\\Note-pian\\Pian-Adiez.wav"); 
                                                                    //punem calea copiata intre ghilimele si avem grija ca toate separatoarele sa fie \\
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      clip.start();
    }
    
    //B SIMPLU
    private void notePianoBsimpluDE() throws UnsupportedAudioFileException, IOException, LineUnavailableException{
                                     //incercati fara throws  si observati ca obtineti erori de compilare  in fata liniilor de cod din mijloc
                                     //una dintre recomandarile de pe bulina rosie de eroare din fata liniei fiind Add throws clause pentru
                                    //anumite  pachete/clase…bifati pe aceste recomandari si observati ca se adauga automat declaratia throws 
                                    //dupa semnatura metodei si se rezolva progresiv erorile 
      File file = new File("C:\\Users\\enyae\\OneDrive - Universitatea Politehnica Bucuresti\\2nd Year\\2nd Year, 1st Semester\\TEME & PROIECTE\\4.Programare orientat pe obiecte ()\\ProiecteJavaSeminar2022\\Seminar nr.7 POO\\PianVirtualDE\\Note-pian\\Pian-B.wav"); 
                                                                    //punem calea copiata intre ghilimele si avem grija ca toate separatoarele sa fie \\
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      clip.start();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnDD = new javax.swing.JButton();
        jbtnFD = new javax.swing.JButton();
        jbtnAD = new javax.swing.JButton();
        jbtnCD1 = new javax.swing.JButton();
        jbtnCD = new javax.swing.JButton();
        jbtnDD1 = new javax.swing.JButton();
        jbtnGD = new javax.swing.JButton();
        jbtnD = new javax.swing.JButton();
        jbtnE = new javax.swing.JButton();
        jbtnF = new javax.swing.JButton();
        jbtnG = new javax.swing.JButton();
        jbtnA = new javax.swing.JButton();
        jbtnB = new javax.swing.JButton();
        jbtnC1 = new javax.swing.JButton();
        jbtnD1 = new javax.swing.JButton();
        jbtnE1 = new javax.swing.JButton();
        jbtnF1 = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 350));
        setPreferredSize(new java.awt.Dimension(900, 350));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnDD.setBackground(new java.awt.Color(0, 0, 0));
        jbtnDD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnDD.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDD.setText("D#");
        jbtnDD.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDDActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 75, 150));

        jbtnFD.setBackground(new java.awt.Color(0, 0, 0));
        jbtnFD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnFD.setForeground(new java.awt.Color(255, 255, 255));
        jbtnFD.setText("F#");
        jbtnFD.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFDActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnFD, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 75, 150));

        jbtnAD.setBackground(new java.awt.Color(0, 0, 0));
        jbtnAD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnAD.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAD.setText("A#");
        jbtnAD.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnADActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 75, 150));

        jbtnCD1.setBackground(new java.awt.Color(0, 0, 0));
        jbtnCD1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnCD1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCD1.setText("C#1");
        jbtnCD1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnCD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCD1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 75, 150));

        jbtnCD.setBackground(new java.awt.Color(0, 0, 0));
        jbtnCD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnCD.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCD.setText("C#");
        jbtnCD.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCDActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 75, 150));

        jbtnDD1.setBackground(new java.awt.Color(0, 0, 0));
        jbtnDD1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnDD1.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDD1.setText("D#1");
        jbtnDD1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnDD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDD1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 75, 150));

        jbtnGD.setBackground(new java.awt.Color(0, 0, 0));
        jbtnGD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnGD.setForeground(new java.awt.Color(255, 255, 255));
        jbtnGD.setText("G#");
        jbtnGD.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnGD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGDActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnGD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 75, 150));

        jbtnD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnD.setText("D");
        jbtnD.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 75, 250));

        jbtnE.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnE.setText("E");
        jbtnE.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 75, 250));

        jbtnF.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnF.setText("F");
        jbtnF.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnFActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnF, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 75, 250));

        jbtnG.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnG.setText("G");
        jbtnG.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnG, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 75, 250));

        jbtnA.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnA.setText("A");
        jbtnA.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 75, 250));

        jbtnB.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnB.setText("B");
        jbtnB.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 75, 250));

        jbtnC1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnC1.setText("C1");
        jbtnC1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnC1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 75, 250));

        jbtnD1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnD1.setText("D1");
        jbtnD1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnD1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 75, 250));

        jbtnE1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnE1.setText("E1");
        jbtnE1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnE1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 75, 250));

        jbtnF1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnF1.setText("F1");
        jbtnF1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnF1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 75, 250));

        jbtnC.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jbtnC.setText("C");
        jbtnC.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 75, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //C DIEZ
    private void jbtnCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCDActionPerformed
        try {
            notePianoCdiezDE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnCDActionPerformed

    //C SIMPLU
    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
        try {
            notePianoCsimpluDE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnCActionPerformed

    //D SIMPLU
    private void jbtnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDActionPerformed
        try {
            notePianoDsimpluDE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnDActionPerformed

    //D DIEZ
    private void jbtnDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDDActionPerformed
        try {
            notePianoDdiezDE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnDDActionPerformed

    //E SIMPLU
    private void jbtnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEActionPerformed
        try {
            notePianoEsimpluDE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnEActionPerformed

    //F SIMPLU
    private void jbtnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFActionPerformed
        try {
            notePianoFsimpluDE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnFActionPerformed

    //F DIEZ
    private void jbtnFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnFDActionPerformed
        try {
            notePianoFdiezDE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnFDActionPerformed

    //G SIMPLU
    private void jbtnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGActionPerformed
        try {
            notePianoGsimpluDE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnGActionPerformed

    //G DIEZ
    private void jbtnGDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGDActionPerformed
        try {
            notePianoGdiezDE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnGDActionPerformed

    //A SIMPLU
    private void jbtnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAActionPerformed
        try {
            notePianoAsimpluDE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnAActionPerformed

    //A DIEZ
    private void jbtnADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnADActionPerformed
        try {
            notePianoAdiezDE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnADActionPerformed

    //B SIMPLU
    private void jbtnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBActionPerformed
        try {
            notePianoBsimpluDE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnBActionPerformed

    //C1 SIMPLU
    private void jbtnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnC1ActionPerformed
        try {
            notePianoCsimpluDE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnC1ActionPerformed

    //C1 DIEZ
    private void jbtnCD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCD1ActionPerformed
        try {
            notePianoCdiezDE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnCD1ActionPerformed

    //D1 SIMPLU
    private void jbtnD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnD1ActionPerformed
        try {
            notePianoDsimpluDE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnD1ActionPerformed

    private void jbtnDD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDD1ActionPerformed
        try {
            notePianoDdiezDE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnDD1ActionPerformed

    //E1 SIMPLU
    private void jbtnE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnE1ActionPerformed
        try {
            notePianoEsimpluDE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnE1ActionPerformed

    private void jbtnF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnF1ActionPerformed
        try {
            notePianoFsimpluDE();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(PianVirtualDE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnF1ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PianVirtualDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PianVirtualDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PianVirtualDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PianVirtualDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PianVirtualDE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnA;
    private javax.swing.JButton jbtnAD;
    private javax.swing.JButton jbtnB;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnC1;
    private javax.swing.JButton jbtnCD;
    private javax.swing.JButton jbtnCD1;
    private javax.swing.JButton jbtnD;
    private javax.swing.JButton jbtnD1;
    private javax.swing.JButton jbtnDD;
    private javax.swing.JButton jbtnDD1;
    private javax.swing.JButton jbtnE;
    private javax.swing.JButton jbtnE1;
    private javax.swing.JButton jbtnF;
    private javax.swing.JButton jbtnF1;
    private javax.swing.JButton jbtnFD;
    private javax.swing.JButton jbtnG;
    private javax.swing.JButton jbtnGD;
    // End of variables declaration//GEN-END:variables
}
