package calculadora;

public class FrmCalculator extends javax.swing.JFrame {

    Double num1, num2, result = 0.0, memory = 0.0;
    String operation = "", invalidDivision = "Invalid division";

    public FrmCalculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        lblDisplay = new javax.swing.JLabel();
        lblMemory = new javax.swing.JLabel();
        lblTagMemory = new javax.swing.JLabel();
        btnMClear = new javax.swing.JButton();
        btnMMinus = new javax.swing.JButton();
        btnMRecall = new javax.swing.JButton();
        btnMPlus = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnPM = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnMultiplication = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnCot = new javax.swing.JButton();
        btnSec = new javax.swing.JButton();
        btnCsc = new javax.swing.JButton();
        btnExp = new javax.swing.JButton();
        btnSqrt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(224, 255, 255));

        panelMain.setBackground(new java.awt.Color(224, 232, 243));
        panelMain.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lblDisplay.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        lblDisplay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDisplay.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblDisplay.setBorder(javax.swing.BorderFactory.createTitledBorder("Calculator"));
        lblDisplay.setFocusable(false);
        lblDisplay.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        lblMemory.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lblMemory.setForeground(new java.awt.Color(153, 153, 153));
        lblMemory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMemory.setText("0.0");

        lblTagMemory.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lblTagMemory.setForeground(new java.awt.Color(153, 153, 153));
        lblTagMemory.setText("Mem:");

        btnMClear.setBackground(new java.awt.Color(224, 232, 243));
        btnMClear.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btnMClear.setForeground(new java.awt.Color(102, 102, 102));
        btnMClear.setText("MC");
        btnMClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMClearActionPerformed(evt);
            }
        });

        btnMMinus.setBackground(new java.awt.Color(224, 232, 243));
        btnMMinus.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btnMMinus.setForeground(new java.awt.Color(102, 102, 102));
        btnMMinus.setText("M-");
        btnMMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMMinusActionPerformed(evt);
            }
        });

        btnMRecall.setBackground(new java.awt.Color(224, 232, 243));
        btnMRecall.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btnMRecall.setForeground(new java.awt.Color(102, 102, 102));
        btnMRecall.setText("MR");
        btnMRecall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMRecallActionPerformed(evt);
            }
        });

        btnMPlus.setBackground(new java.awt.Color(224, 232, 243));
        btnMPlus.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btnMPlus.setForeground(new java.awt.Color(102, 102, 102));
        btnMPlus.setText("M+");
        btnMPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMPlusActionPerformed(evt);
            }
        });

        btnAC.setBackground(new java.awt.Color(224, 232, 243));
        btnAC.setFont(new java.awt.Font("Liberation Sans", 0, 30)); // NOI18N
        btnAC.setForeground(new java.awt.Color(102, 102, 102));
        btnAC.setText("ac");
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });

        btnC.setBackground(new java.awt.Color(224, 232, 243));
        btnC.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        btnC.setForeground(new java.awt.Color(102, 102, 102));
        btnC.setText("c");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnPM.setBackground(new java.awt.Color(224, 232, 243));
        btnPM.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btnPM.setForeground(new java.awt.Color(102, 102, 102));
        btnPM.setText("+/-");
        btnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPMActionPerformed(evt);
            }
        });

        btnDivision.setBackground(new java.awt.Color(224, 232, 243));
        btnDivision.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        btnDivision.setForeground(new java.awt.Color(102, 102, 102));
        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnSeven.setBackground(new java.awt.Color(224, 232, 243));
        btnSeven.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        btnSeven.setForeground(new java.awt.Color(102, 102, 102));
        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnZero.setBackground(new java.awt.Color(224, 232, 243));
        btnZero.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        btnZero.setForeground(new java.awt.Color(102, 102, 102));
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnFive.setBackground(new java.awt.Color(224, 232, 243));
        btnFive.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        btnFive.setForeground(new java.awt.Color(102, 102, 102));
        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnFour.setBackground(new java.awt.Color(224, 232, 243));
        btnFour.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        btnFour.setForeground(new java.awt.Color(102, 102, 102));
        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnTwo.setBackground(new java.awt.Color(224, 232, 243));
        btnTwo.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        btnTwo.setForeground(new java.awt.Color(102, 102, 102));
        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnThree.setBackground(new java.awt.Color(224, 232, 243));
        btnThree.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        btnThree.setForeground(new java.awt.Color(102, 102, 102));
        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        btnSix.setBackground(new java.awt.Color(224, 232, 243));
        btnSix.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        btnSix.setForeground(new java.awt.Color(102, 102, 102));
        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnPlus.setBackground(new java.awt.Color(224, 232, 243));
        btnPlus.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        btnPlus.setForeground(new java.awt.Color(102, 102, 102));
        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnOne.setBackground(new java.awt.Color(224, 232, 243));
        btnOne.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        btnOne.setForeground(new java.awt.Color(102, 102, 102));
        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnMinus.setBackground(new java.awt.Color(224, 232, 243));
        btnMinus.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        btnMinus.setForeground(new java.awt.Color(102, 102, 102));
        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnEight.setBackground(new java.awt.Color(224, 232, 243));
        btnEight.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        btnEight.setForeground(new java.awt.Color(102, 102, 102));
        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });

        btnMultiplication.setBackground(new java.awt.Color(224, 232, 243));
        btnMultiplication.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        btnMultiplication.setForeground(new java.awt.Color(102, 102, 102));
        btnMultiplication.setText("*");
        btnMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicationActionPerformed(evt);
            }
        });

        btnNine.setBackground(new java.awt.Color(224, 232, 243));
        btnNine.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        btnNine.setForeground(new java.awt.Color(102, 102, 102));
        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });

        btnEqual.setBackground(new java.awt.Color(224, 232, 243));
        btnEqual.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        btnEqual.setForeground(new java.awt.Color(102, 102, 102));
        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        btnSin.setBackground(new java.awt.Color(224, 232, 243));
        btnSin.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        btnSin.setForeground(new java.awt.Color(102, 102, 102));
        btnSin.setText("Sin");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });

        btnCos.setBackground(new java.awt.Color(224, 232, 243));
        btnCos.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        btnCos.setForeground(new java.awt.Color(102, 102, 102));
        btnCos.setText("Cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });

        btnTan.setBackground(new java.awt.Color(224, 232, 243));
        btnTan.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        btnTan.setForeground(new java.awt.Color(102, 102, 102));
        btnTan.setText("Tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });

        btnCot.setBackground(new java.awt.Color(224, 232, 243));
        btnCot.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        btnCot.setForeground(new java.awt.Color(102, 102, 102));
        btnCot.setText("Cot");
        btnCot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotActionPerformed(evt);
            }
        });

        btnSec.setBackground(new java.awt.Color(224, 232, 243));
        btnSec.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        btnSec.setForeground(new java.awt.Color(102, 102, 102));
        btnSec.setText("Sec");
        btnSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSecActionPerformed(evt);
            }
        });

        btnCsc.setBackground(new java.awt.Color(224, 232, 243));
        btnCsc.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        btnCsc.setForeground(new java.awt.Color(102, 102, 102));
        btnCsc.setText("Csc");
        btnCsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCscActionPerformed(evt);
            }
        });

        btnExp.setBackground(new java.awt.Color(224, 232, 243));
        btnExp.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btnExp.setForeground(new java.awt.Color(102, 102, 102));
        btnExp.setText("x²");
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        btnSqrt.setBackground(new java.awt.Color(224, 232, 243));
        btnSqrt.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        btnSqrt.setForeground(new java.awt.Color(102, 102, 102));
        btnSqrt.setText("√x");
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelMainLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(btnCsc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSec, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCot, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelMainLayout.createSequentialGroup()
                                    .addComponent(btnMClear, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMRecall, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                                    .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                                    .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnPM, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addComponent(lblTagMemory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMemory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMemory)
                    .addComponent(lblTagMemory))
                .addGap(34, 34, 34)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMClear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMRecall, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnDivision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPM, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiplication, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSin)
                    .addComponent(btnCos)
                    .addComponent(btnTan)
                    .addComponent(btnExp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCsc)
                    .addComponent(btnSec)
                    .addComponent(btnCot)
                    .addComponent(btnSqrt))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // methods for digit buttons
    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        // TODO add your handling code here:
        displayOnClick("1");
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        // TODO add your handling code here:
        displayOnClick("2");
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        // TODO add your handling code here:
        displayOnClick("3");
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        // TODO add your handling code here:
        displayOnClick("4");
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        // TODO add your handling code here:
        displayOnClick("5");
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        // TODO add your handling code here:
        displayOnClick("6");
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        // TODO add your handling code here:
        displayOnClick("7");
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        // TODO add your handling code here:
        displayOnClick("8");
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        // TODO add your handling code here:
        displayOnClick("9");
    }//GEN-LAST:event_btnNineActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        // TODO add your handling code here:
        displayOnClick("0");
    }//GEN-LAST:event_btnZeroActionPerformed

    // method for operation buttons
    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        // TODO add your handling code here:
        saveNum1("+");
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        // TODO add your handling code here:
        saveNum1("-");
    }//GEN-LAST:event_btnMinusActionPerformed

    private void btnMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicationActionPerformed
        // TODO add your handling code here:
        saveNum1("*");
    }//GEN-LAST:event_btnMultiplicationActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        // TODO add your handling code here:
        saveNum1("/");
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPMActionPerformed
        // TODO add your handling code here:
        String display = lblDisplay.getText();
        if (display.isEmpty() || display.startsWith(this.invalidDivision)) {
            return;
        }

        Double plusMinusResult = -1 * Double.parseDouble(display);
        lblDisplay.setText(String.valueOf(plusMinusResult));
    }//GEN-LAST:event_btnPMActionPerformed

    // methods for memory buttons
    private void btnMClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMClearActionPerformed
        // TODO add your handling code here:
        this.memory = 0.0;
        lblMemory.setText(String.valueOf(this.memory));
    }//GEN-LAST:event_btnMClearActionPerformed

    private void btnMRecallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMRecallActionPerformed
        // TODO add your handling code here:
        lblDisplay.setText(String.valueOf(this.memory));
    }//GEN-LAST:event_btnMRecallActionPerformed

    private void btnMPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMPlusActionPerformed
        // TODO add your handling code here:
        addToMemory("plus");
    }//GEN-LAST:event_btnMPlusActionPerformed

    private void btnMMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMMinusActionPerformed
        // TODO add your handling code here:
        addToMemory("minus");
    }//GEN-LAST:event_btnMMinusActionPerformed

    // method for clear buttons
    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACActionPerformed
        // TODO add your handling code here:
        lblDisplay.setText("");
        this.num1 = null;
        this.num2 = null;
        this.operation = "";
    }//GEN-LAST:event_btnACActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
        String display = lblDisplay.getText();

        if (display != null && !display.isEmpty() && !display.startsWith(this.invalidDivision)) {
            String newDisplay = display.substring(0, display.length() - 1);
            lblDisplay.setText(newDisplay);
        }
    }//GEN-LAST:event_btnCActionPerformed

    // method for equal button
    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        // TODO add your handling code here:
        if (this.num1 == null && this.num2 == null) {
            return;
        }

        this.num2 = Double.valueOf(lblDisplay.getText());

        switch (this.operation) {
            case "+":
                this.result = this.num1 + this.num2;
                break;
            case "-":
                this.result = this.num1 - this.num2;
                break;
            case "*":
                this.result = this.num1 * this.num2;
                break;
            case "/":
                if (this.num2 == 0) {
                    lblDisplay.setText(this.invalidDivision);
                    return;
                }
                this.result = this.num1 / this.num2;
                break;
            default:
                break;
        }

        this.operation = "";
        lblDisplay.setText(String.valueOf(result));
        this.num1 = 0.0;
        this.num2 = 0.0;
    }//GEN-LAST:event_btnEqualActionPerformed

    // method for expontent and radical buttons
    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        // TODO add your handling code here:
        calculateExpSqrtRT("exp");
    }//GEN-LAST:event_btnExpActionPerformed

    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqrtActionPerformed
        // TODO add your handling code here:
        calculateExpSqrtRT("sqrt");
    }//GEN-LAST:event_btnSqrtActionPerformed

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
        // TODO add your handling code here:
        calculateExpSqrtRT("sin");
    }//GEN-LAST:event_btnSinActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
        // TODO add your handling code here:
        calculateExpSqrtRT("cos");
    }//GEN-LAST:event_btnCosActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
        // TODO add your handling code here:
        calculateExpSqrtRT("tan");
    }//GEN-LAST:event_btnTanActionPerformed

    private void btnCscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCscActionPerformed
        // TODO add your handling code here:
        calculateExpSqrtRT("csc");
    }//GEN-LAST:event_btnCscActionPerformed

    private void btnSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSecActionPerformed
        // TODO add your handling code here:
        calculateExpSqrtRT("sec");
    }//GEN-LAST:event_btnSecActionPerformed

    private void btnCotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotActionPerformed
        // TODO add your handling code here:
        calculateExpSqrtRT("cot");
    }//GEN-LAST:event_btnCotActionPerformed

    // methods
    private void displayOnClick(String value) {
        String strResult = lblDisplay.getText();

        if ("0.0".equals(strResult) || strResult.startsWith(this.invalidDivision)) {
            lblDisplay.setText(value);
            return;
        }

        lblDisplay.setText(strResult + value);
    }

    private void saveNum1(String operationValue) {
        String display = lblDisplay.getText();
        if (display.isEmpty() || display.startsWith(this.invalidDivision)) {
            return;
        }

        this.num1 = Double.valueOf(display);
        this.operation = operationValue;
        lblDisplay.setText("");
    }

    private void calculateExpSqrtRT(String expSqrtRTOperation) {
        String strDisplay = lblDisplay.getText();
        if (strDisplay.isEmpty() || strDisplay.startsWith(this.invalidDivision)) {
            return;
        }

        Double display = Double.valueOf(strDisplay);
        Double resultOperation = 0.0;

        switch (expSqrtRTOperation) {
            case "sin" ->
                resultOperation = Math.sin(display);
            case "cos" ->
                resultOperation = Math.cos(display);
            case "tan" ->
                resultOperation = Math.tan(display);
            case "cot" ->
                resultOperation = 1.0 / Math.tan(display);
            case "sec" ->
                resultOperation = 1.0 / Math.cos(display);
            case "csc" ->
                resultOperation = 1.0 / Math.sin(display);
            case "exp" ->
                resultOperation = Math.pow(display, 2);
            case "sqrt" ->
                resultOperation = Math.sqrt(display);
            default -> {
            }
        }

        lblDisplay.setText(String.valueOf(resultOperation));
    }

    private void addToMemory(String operation) {
        String display = lblDisplay.getText();
        if (display.isEmpty() || display.startsWith(this.invalidDivision)) {
            return;
        }

        Double doubleDisplay = Double.valueOf(display);
        if (operation.equals("plus")) {
            this.memory += doubleDisplay;
        } else {
            this.memory -= doubleDisplay;
        }
        lblMemory.setText(String.valueOf(this.memory));
    }

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
            java.util.logging.Logger.getLogger(FrmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnCot;
    private javax.swing.JButton btnCsc;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnMClear;
    private javax.swing.JButton btnMMinus;
    private javax.swing.JButton btnMPlus;
    private javax.swing.JButton btnMRecall;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMultiplication;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnPM;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnSec;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnTan;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JLabel lblMemory;
    private javax.swing.JLabel lblTagMemory;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}
