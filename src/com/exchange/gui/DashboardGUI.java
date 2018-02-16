
package com.exchange.gui;
import com.exchange.*;


public class DashboardGUI extends javax.swing.JFrame implements Runnable
{
	
	CurrencySystem system;
	CryptoCurrency[] currency=new CryptoCurrency[3];

    public DashboardGUI(CurrencySystem system)
    {
    	this.system=system;
        initComponents();
    }
    
	public void run()
	{
	
	}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bitcoinBuy = new javax.swing.JButton();
        bitcoinSell = new javax.swing.JButton();
        ethereumBuy = new javax.swing.JButton();
        ethereumSell = new javax.swing.JButton();
        litecoinBuy = new javax.swing.JButton();
        litecoinSell = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        schedule = new javax.swing.JButton();
        alerts = new javax.swing.JButton();
        convert = new javax.swing.JButton();
        transaction = new javax.swing.JButton();
        autoSchedule = new javax.swing.JButton();
        paymentMethod = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Current Bitcoin Price");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Current Litecoin Price");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Current Ethereum Price");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("$12,000");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("$1000");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("$350");

        bitcoinBuy.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bitcoinBuy.setText("Buy");
        bitcoinBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitcoinBuyActionPerformed(evt);
            }
        });

        bitcoinSell.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bitcoinSell.setText("Sell");
        bitcoinSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bitcoinSellActionPerformed(evt);
            }
        });

        ethereumBuy.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ethereumBuy.setText("Buy");

        ethereumSell.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ethereumSell.setText("Sell");

        litecoinBuy.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        litecoinBuy.setText("Buy");

        litecoinSell.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        litecoinSell.setText("Sell");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("% Change in last 2 min");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("% Change in last 2 min");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("% Change in last 2 min");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("+26.53%");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("-7.64%");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("-19.53%");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Crypto Currency Dash Board");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Crypto Currency Wallet");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Bitcoin Balance");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("Ethereum Balance");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Litecoin Balance");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("$24000");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setText("$1259.67");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setText("$20000");

        schedule.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        schedule.setText("Create Schedule");
        schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleActionPerformed(evt);
            }
        });

        alerts.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        alerts.setText("Create Alerts");
        alerts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertsActionPerformed(evt);
            }
        });

        convert.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        convert.setText("Convert Currency");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });

        transaction.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        transaction.setText("Transcation History");

        autoSchedule.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        autoSchedule.setText("Create Auto Schedule");

        paymentMethod.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        paymentMethod.setText("Add Payment Method");
        paymentMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentMethodActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setText("ROI");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("$13,000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel20)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(convert)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel8))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(87, 87, 87)
                                                .addComponent(jLabel9)))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bitcoinBuy)
                                            .addComponent(ethereumBuy)
                                            .addComponent(litecoinBuy)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(paymentMethod)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addGap(72, 72, 72)
                                                .addComponent(jLabel18)
                                                .addGap(54, 54, 54)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel19)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel15)
                                                        .addGap(150, 150, 150)))))))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(litecoinSell)
                                    .addComponent(bitcoinSell)
                                    .addComponent(ethereumSell))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(schedule)
                                .addGap(43, 43, 43)
                                .addComponent(autoSchedule)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(alerts)
                                .addGap(29, 29, 29))))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(transaction))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(536, 536, 536)
                        .addComponent(jLabel21)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel22)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(417, 417, 417))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(bitcoinBuy)
                    .addComponent(bitcoinSell)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(ethereumBuy)
                    .addComponent(ethereumSell)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(litecoinBuy)
                    .addComponent(litecoinSell)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel16)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel19))
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addComponent(paymentMethod)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transaction)
                    .addComponent(convert)
                    .addComponent(schedule)
                    .addComponent(alerts)
                    .addComponent(autoSchedule))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>                        

    private void bitcoinBuyActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void bitcoinSellActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void scheduleActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void alertsActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void paymentMethodActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

   

    // Variables declaration - do not modify                     
    private javax.swing.JButton alerts;
    private javax.swing.JButton autoSchedule;
    private javax.swing.JButton bitcoinBuy;
    private javax.swing.JButton bitcoinSell;
    private javax.swing.JButton convert;
    private javax.swing.JButton ethereumBuy;
    private javax.swing.JButton ethereumSell;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton litecoinBuy;
    private javax.swing.JButton litecoinSell;
    private javax.swing.JButton paymentMethod;
    private javax.swing.JButton schedule;
    private javax.swing.JButton transaction;
    // End of variables declaration                   
}
