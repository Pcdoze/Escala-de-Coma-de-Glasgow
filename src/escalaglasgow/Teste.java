/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package escalaglasgow;

import java.awt.event.*;

/**
 *
 * @author Matheus Fialho Barbosa
 */
public class Teste extends javax.swing.JFrame {
    
    int valores[] = new int[4];
    int resultado;
    
    boolean janela_fechada = false;
    
    public Teste() {
        initComponents();
    }
    public void setup(){
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                janela_fechada = true;
            }
        });
        
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setVisible(true);
        
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        
        jButton1.setVisible(false);
        jButton3.setVisible(false);
        jButton4.setVisible(false);
        jButton6.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton5 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton15 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jProgressBar3 = new javax.swing.JProgressBar();
        jRadioButton6 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton20 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();
        jProgressBar4 = new javax.swing.JProgressBar();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jProgressBar6 = new javax.swing.JProgressBar();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "1 - Abertura Ocular", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 0, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel1.setText("Selecionar uma opção:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 39, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton1.setText("<html><strong>Espontânea:</strong> Paciente abre os olhos sem a necessidade de estímulo externo. </html>");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 78, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton2.setText("<html><strong>Ao som:</strong> Paciente abre os olhos quando é chamado(a). </html>");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 119, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton3.setText("<html><strong>À pressão:</strong> À pressão: paciente abre os olhos após pressão na<br>extremidade dos dedos (aumentando progressivamente a intensidade por 10 segundos).</html>");
        jRadioButton3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 160, -1, -1));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton4.setText("<html><strong>Ausente:</strong> Não abre os olhos, apesar de ser fisicamente capaz de abri-los.</html>");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel2.setText("N/A");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 310, -1, -1));

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton5.setText("<html><strong>Não testável:</strong> Avaliação ocular impossibilitada.</html>");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Avançar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 90, 30));

        jProgressBar1.setValue(20);
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 316, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "2 - Reposta Verbal", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel5.setText("Selecionar uma opção:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 39, -1, -1));

        buttonGroup2.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton11.setText("<html><strong>Orientada:</strong> Consegue responder adequadamente o nome, local e data.</html>");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 78, -1, -1));

        buttonGroup2.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton12.setText("<html><strong>Confusa:</strong> Consegue conversar em frases, mas não responde corretamente as<br>perguntas de nome, local e data.</html>");
        jRadioButton12.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        buttonGroup2.add(jRadioButton13);
        jRadioButton13.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton13.setText("<html><strong>Palavras:</strong> Não consegue falar em frases, mas interage através de palavras isoladas.</html>");
        jRadioButton13.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        buttonGroup2.add(jRadioButton14);
        jRadioButton14.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton14.setText("<html><strong>Sons:</strong> Não consegue falar em frases, mas interage através de palavras isoladas.</html>");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel6.setText("N/A");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 310, -1, -1));

        buttonGroup2.add(jRadioButton15);
        jRadioButton15.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton15.setText("<html><strong>Não testável:</strong> Avaliação ocular impossibilitada.</html>");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Avançar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 90, 30));

        jProgressBar3.setValue(40);
        jPanel2.add(jProgressBar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 316, -1, -1));

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jRadioButton6.setText("<html><strong>Ausente:</strong> Não produz sons, apesar de ser fisicamente capaz de realizá-los.</html>");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "3 - Reposta Motora", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 0, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel7.setText("Selecionar uma opção:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 39, -1, -1));

        buttonGroup3.add(jRadioButton16);
        jRadioButton16.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton16.setText("<html><strong>À ordem:</strong> cumpre ordens de atividade motora (duas ações)<br>como apertar a mão do profissional e colocar a língua para fora.</html>");
        jRadioButton16.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jRadioButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton16ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        buttonGroup3.add(jRadioButton17);
        jRadioButton17.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton17.setText("<html><strong>Flexão normal:</strong> a mão não alcança a fonte do estímulo, mas há uma flexão rápida do braço<br>ao nível do cotovelo e na direção externa ao corpo.</html>");
        jRadioButton17.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jRadioButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton17ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        buttonGroup3.add(jRadioButton18);
        jRadioButton18.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton18.setText("<html><strong>Flexão anormal:</strong> a mão não alcança a fonte do estímulo, mas há uma flexão lenta do<br>braço na direção interna do corpo.</html>");
        jRadioButton18.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jRadioButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton18ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 600, -1));

        buttonGroup3.add(jRadioButton19);
        jRadioButton19.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton19.setText("<html><strong>Extensão:</strong> Há uma extensão do braço ao nível do cotovelo</html>");
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 20));

        jLabel8.setText("N/A");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        buttonGroup3.add(jRadioButton20);
        jRadioButton20.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton20.setText("<html><strong>Não testável:</strong> Avaliação ocular impossibilitada.</html>");
        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("Avançar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 90, 30));

        jProgressBar4.setValue(60);
        jPanel3.add(jProgressBar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        buttonGroup3.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jRadioButton7.setText("<html><strong>Ausente:</strong> não há resposta motora dos membros superiores e inferiores, apesar de o<br>paciente ser fisicamente capaz de realizá-la.</html>");
        jRadioButton7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        buttonGroup3.add(jRadioButton21);
        jRadioButton21.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton21.setText("<html><strong>Localizadora:</strong> eleva a mão acima do nível da clavícula em uma tentativa de interromper<br>o estímulo (durante o pinçamento do trapézio ou incisura supraorbitária).</html>");
        jRadioButton21.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jRadioButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton21ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "4 - Reatividade Pupilar", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 0, 14))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel11.setText("Selecionar uma opção:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 39, -1, -1));

        buttonGroup4.add(jRadioButton28);
        jRadioButton28.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton28.setText("<html><strong>Nenhuma pupila</strong> reage ao estímulo de luz.</html>");
        jRadioButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton28ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 78, -1, -1));

        buttonGroup4.add(jRadioButton29);
        jRadioButton29.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton29.setText("<html><strong>Uma pupila</strong> não reage ao estímulo de luz</html>");
        jRadioButton29.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jRadioButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton29ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        buttonGroup4.add(jRadioButton30);
        jRadioButton30.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jRadioButton30.setText("<html><strong>Ambas as pupilas</strong> Reagem ao estímulo de luz.</html>");
        jRadioButton30.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jRadioButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton30ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel12.setText("N/A");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 310, -1, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton6.setText("Calcular Resultado");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 284, 150, -1));

        jProgressBar6.setValue(80);
        jPanel4.add(jProgressBar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 316, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "5 - Resultado", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("sansserif", 0, 14))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("<html>\n    <p align=\"center\">\n        Resultado: <br>\n        E V M  – P = \n    </p>\n</html>");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 190, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        valores[0] = 4;
        jLabel2.setText("4");
        jButton1.setVisible(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        valores[0] = 3;
        jLabel2.setText("3");
        jButton1.setVisible(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        valores[0] = 2;
        jLabel2.setText("2");
        jButton1.setVisible(true);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        valores[0] = 1;
        jLabel2.setText("1");
        jButton1.setVisible(true);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
        valores[0] = 0;
        jLabel2.setText("NT");
        jButton1.setVisible(true);
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
        valores[1] = 5;
        jLabel6.setText("5");
        jButton3.setVisible(true);
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
        valores[1] = 4;
        jLabel6.setText("4");
        jButton3.setVisible(true);
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
        valores[1] = 3;
        jLabel6.setText("3");
        jButton3.setVisible(true);
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
        valores[1] = 2;
        jLabel6.setText("2");
        jButton3.setVisible(true);
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        // TODO add your handling code here:
        valores[1] = 0;
        jLabel6.setText("NT");
        jButton3.setVisible(true);
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
        valores[1] = 1;
        jLabel6.setText("1");
        jButton3.setVisible(true);
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jPanel3.setVisible(true);
        
        this.setSize(738,430);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton16ActionPerformed
        // TODO add your handling code here:
        valores[2] = 6;
        jLabel8.setText("6");
        jButton4.setVisible(true);
    }//GEN-LAST:event_jRadioButton16ActionPerformed

    private void jRadioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton17ActionPerformed
        // TODO add your handling code here:
        valores[2] = 4;
        jLabel8.setText("4");
        jButton4.setVisible(true);
    }//GEN-LAST:event_jRadioButton17ActionPerformed

    private void jRadioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton18ActionPerformed
        // TODO add your handling code here:
        valores[2] = 3;
        jLabel8.setText("3");
        jButton4.setVisible(true);
    }//GEN-LAST:event_jRadioButton18ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        // TODO add your handling code here:
        valores[2] = 2;
        jLabel8.setText("2");
        jButton4.setVisible(true);
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed
        // TODO add your handling code here:
        valores[2] = 0;
        jLabel8.setText("NT");
        jButton4.setVisible(true);
    }//GEN-LAST:event_jRadioButton20ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jPanel3.setVisible(false);
        jPanel4.setVisible(true);
        
        this.setSize(738,400);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
        valores[2] = 1;
        jLabel8.setText("1");
        jButton4.setVisible(true);
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton21ActionPerformed
        // TODO add your handling code here:
        valores[2] = 5;
        jLabel8.setText("5");
        jButton4.setVisible(true);
    }//GEN-LAST:event_jRadioButton21ActionPerformed

    private void jRadioButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton28ActionPerformed
        // TODO add your handling code here:
        valores[3] = 2;
        jLabel12.setText("2");
        jButton6.setVisible(true);
    }//GEN-LAST:event_jRadioButton28ActionPerformed

    private void jRadioButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton29ActionPerformed
        // TODO add your handling code here:
        valores[3] = 1;
        jLabel12.setText("1");
        jButton6.setVisible(true);
    }//GEN-LAST:event_jRadioButton29ActionPerformed

    private void jRadioButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton30ActionPerformed
        // TODO add your handling code here:
        valores[3] = 0;
        jLabel12.setText("0");
        jButton6.setVisible(true);
    }//GEN-LAST:event_jRadioButton30ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jPanel4.setVisible(false);
        jPanel5.setVisible(true);
        
        resultado = valores[0]+valores[1]+valores[2]-valores[3];
        
        boolean resultado_inconclusivo = false;
        for(int item : valores){
            if(item == 0){
                resultado_inconclusivo = true;
            }
        }
        String string_resultado = (String.format("""
                         <html>
                             <p align="center">
                                 Resultado: %s<br>
                                 E%dV%dM%d - P%d = %s
                             </p>""",
                        resultado, valores[0],valores[1],
                        valores[2], valores[3],
                        resultado));
        if(resultado_inconclusivo){
            string_resultado += "<br>Resultado Inconclusivo</p></html>";
        }
        else{
            string_resultado += "</p></html>";
        }
        jLabel13.setText(string_resultado);
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    // End of variables declaration//GEN-END:variables
}
