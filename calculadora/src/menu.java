
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author callo
 */
public class menu extends javax.swing.JFrame {

    String memoria1;
    String signo;
    String memoria2;
    
   
    
    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pantalla = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multi = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        division = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        instrucciones = new javax.swing.JButton();
        borratodo = new javax.swing.JButton();
        log = new javax.swing.JButton();
        potencia = new javax.swing.JButton();
        borra1 = new javax.swing.JButton();
        lab = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        pantalla2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pantalla.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pantalla.setForeground(new java.awt.Color(255, 255, 255));
        pantalla.setAlignmentX(10.0F);
        pantalla.setAlignmentY(0.9F);
        pantalla.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(pantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 230, 100));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 60, 40));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 60, 40));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 60, 40));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 60, 40));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 60, 40));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 60, 40));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 60, 40));

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 60, 40));

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 60, 40));

        suma.setBackground(new java.awt.Color(51, 51, 51));
        suma.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        suma.setForeground(new java.awt.Color(255, 255, 255));
        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });
        getContentPane().add(suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 60, 40));

        resta.setBackground(new java.awt.Color(51, 51, 51));
        resta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        resta.setForeground(new java.awt.Color(255, 255, 255));
        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });
        getContentPane().add(resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 60, 40));

        multi.setBackground(new java.awt.Color(51, 51, 51));
        multi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        multi.setForeground(new java.awt.Color(255, 255, 255));
        multi.setText("*");
        multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiActionPerformed(evt);
            }
        });
        getContentPane().add(multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 60, 40));

        igual.setBackground(new java.awt.Color(0, 51, 255));
        igual.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        igual.setForeground(new java.awt.Color(255, 255, 255));
        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        getContentPane().add(igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 60, 40));

        division.setBackground(new java.awt.Color(0, 0, 0));
        division.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        division.setForeground(new java.awt.Color(255, 255, 255));
        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });
        getContentPane().add(division, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 60, 40));

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("0");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 60, 40));

        punto.setBackground(new java.awt.Color(0, 0, 0));
        punto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        punto.setForeground(new java.awt.Color(255, 255, 255));
        punto.setText(".");
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });
        getContentPane().add(punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 60, 40));

        instrucciones.setBackground(new java.awt.Color(51, 51, 255));
        instrucciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        instrucciones.setForeground(new java.awt.Color(255, 255, 255));
        instrucciones.setText("?");
        instrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instruccionesActionPerformed(evt);
            }
        });
        getContentPane().add(instrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, 40));

        borratodo.setBackground(new java.awt.Color(51, 51, 51));
        borratodo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        borratodo.setForeground(new java.awt.Color(255, 255, 255));
        borratodo.setText("Ce");
        borratodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borratodoActionPerformed(evt);
            }
        });
        getContentPane().add(borratodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 60, 40));

        log.setBackground(new java.awt.Color(51, 51, 51));
        log.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        log.setForeground(new java.awt.Color(255, 255, 255));
        log.setText("Log");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });
        getContentPane().add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 60, 40));

        potencia.setBackground(new java.awt.Color(51, 51, 51));
        potencia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        potencia.setForeground(new java.awt.Color(255, 255, 255));
        potencia.setText("x???");
        potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potenciaActionPerformed(evt);
            }
        });
        getContentPane().add(potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 60, 40));

        borra1.setBackground(new java.awt.Color(51, 51, 51));
        borra1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        borra1.setForeground(new java.awt.Color(255, 255, 255));
        borra1.setText("C");
        borra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borra1ActionPerformed(evt);
            }
        });
        getContentPane().add(borra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 60, 40));

        lab.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lab.setForeground(new java.awt.Color(255, 255, 255));
        lab.setText("Basica");
        lab.setAlignmentX(10.0F);
        lab.setAlignmentY(0.9F);
        lab.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 40));

        fondo.setBackground(new java.awt.Color(51, 51, 51));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 420));

        pantalla2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pantalla2.setForeground(new java.awt.Color(255, 255, 255));
        pantalla2.setAlignmentX(10.0F);
        pantalla2.setAlignmentY(0.9F);
        pantalla2.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(pantalla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 160, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"1");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         pantalla.setText(pantalla.getText()+"2");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         pantalla.setText(pantalla.getText()+"3");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         pantalla.setText(pantalla.getText()+"4");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         pantalla.setText(pantalla.getText()+"5");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         pantalla.setText(pantalla.getText()+"6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
         pantalla.setText(pantalla.getText()+"7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
         pantalla.setText(pantalla.getText()+"8");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         pantalla.setText(pantalla.getText()+"9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiActionPerformed
        // TODO add your handling code here:
         if(!pantalla.getText().equals("")){
        memoria1=pantalla.getText();
        signo="*";
        pantalla.setText("");
        
        }
    }//GEN-LAST:event_multiActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
         pantalla.setText(pantalla.getText()+"0");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        // TODO add your handling code here:
        String memo;
        memo= pantalla.getText();
        
        if(memo.length()<=0){
         pantalla.setText("0.1"); 
        } else{
               if(!existepunto(pantalla.getText())){
                pantalla.setText(pantalla.getText()+".");
                
               }
        
        }
        
            
    }//GEN-LAST:event_puntoActionPerformed

    private void instruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instruccionesActionPerformed
       
      Icon intru=new ImageIcon(getClass().getResource(""));
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Instrucciones:\n" +
            "Autores: Carlos Enrique Guzman Cabrera.\n" +
            "\n" +
            "Uso del Log (logaritmo):\n" +
            "- como primer paso introducimos cualquier numero \n"+
            "- presionamos el boton log" +
            "- eligimos cual sera la base de logaritmo introduciendo el numero.\n" +
            "- damos click en el boton igual y el resultado se mostrara en pantalla\n" +
            "uso del boton x??? (potencia) :\n" +
              "- como primer paso introducimos cualquier numero para la base  \n"+
            "- presionamos el boton x???" +
            "- eligimos cual sera el exponente introduciendo el numero.\n" +
            "- damos click en el boton igual y el resultado se mostrara en pantalla\n" +
            ".\n", "Calculadora basica- Instrucciones", JOptionPane.INFORMATION_MESSAGE,intru);  
        
    }//GEN-LAST:event_instruccionesActionPerformed

    private void borratodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borratodoActionPerformed
            
        pantalla.setText("");
        
    }//GEN-LAST:event_borratodoActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        // TODO add your handling code here:
        if(!pantalla.getText().equals("")){
        memoria1=pantalla.getText();
        signo="-";
        pantalla.setText("");
        
        }
        
    }//GEN-LAST:event_restaActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        // TODO add your handling code here:
         if(!pantalla.getText().equals("")){
        memoria1=pantalla.getText();
        signo="+";
        pantalla.setText("");
        
        }
    }//GEN-LAST:event_sumaActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        // TODO add your handling code here:
        
         if(!pantalla.getText().equals("")){
        memoria1=pantalla.getText();
        signo="/";
        pantalla.setText("");
        
        }
    }//GEN-LAST:event_divisionActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        // TODO add your handling code here:
        
        String resultado;
        memoria2= pantalla.getText();
        
        if(!memoria2.equals("")){
            resultado= calculadora(memoria1, memoria2,signo);
            pantalla.setText(resultado);
        
        }
    }//GEN-LAST:event_igualActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        // TODO add your handling code here:
         if(!pantalla.getText().equals("")){
        memoria1=pantalla.getText();
        signo="log";
        pantalla.setText("");
        
        }

        
    }//GEN-LAST:event_logActionPerformed

    private void potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potenciaActionPerformed
        // TODO add your handling code here:
         if(!pantalla.getText().equals("")){
        memoria1=pantalla.getText();
        signo="pow";
        pantalla.setText("");
        
        }
        
    }//GEN-LAST:event_potenciaActionPerformed

    private void borra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borra1ActionPerformed
        // TODO add your handling code here:
        
          String memo;
        memo=pantalla.getText();
        
        if(memo.length()>0){
            memo = memo.substring(0,memo.length()-1);
            pantalla.setText(memo);
        }        
        
    }//GEN-LAST:event_borra1ActionPerformed

    public static String calculadora(String memoria1, String memoria2, String signo){
    
    Double resultado=0.0;
    String respuesta;
    
    
    if(signo.equals("-")){
      resultado= Double.parseDouble(memoria1)- Double.parseDouble(memoria2);
      
    
    }if(signo.equals("+")){
      resultado= Double.parseDouble(memoria1)+ Double.parseDouble(memoria2);
      
    
    }if(signo.equals("*")){
      resultado= Double.parseDouble(memoria1)* Double.parseDouble(memoria2);
      
    
    }if(signo.equals("/")){
      resultado= Double.parseDouble(memoria1)/ Double.parseDouble(memoria2);
      
    
    }
    if(signo.equals("log")){
      resultado= (Math.log10(Double.parseDouble(memoria1)) / Math.log10(Double.parseDouble(memoria2)));
      
     
    }
    
    if(signo.equals("pow")){
      resultado= Math.pow(Double.parseDouble(memoria1),Double.parseDouble(memoria2));
      
     
    }
    
    
    respuesta = resultado.toString();
    
    return respuesta; 
    
    }
    
    
    public static boolean existepunto(String memo){

    boolean resultado;
    resultado =false;

    for(int i=0; i<memo.length() ;i++ ){
    
       if(memo.substring(i, i+1).equals(".")){
       resultado=true; 
       break;
       
       
       
       
       } 
    
    }
     
    return resultado;   

}
    
    
    
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borra1;
    private javax.swing.JButton borratodo;
    private javax.swing.JButton division;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton igual;
    private javax.swing.JButton instrucciones;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab;
    private javax.swing.JButton log;
    private javax.swing.JButton multi;
    private javax.swing.JLabel pantalla;
    private javax.swing.JLabel pantalla2;
    private javax.swing.JButton potencia;
    private javax.swing.JButton punto;
    private javax.swing.JButton resta;
    private javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables
}
