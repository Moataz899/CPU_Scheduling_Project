
package Project;


import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class OpeatingSystems extends javax.swing.JFrame {
    
     
     DefaultTableModel model;
     int  rowCount =0;

     
     
  
    public OpeatingSystems() {
       
        initComponents();
        NumberProcess.setText("1");
        
        
                
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RunAlgorithm = new javax.swing.JButton();
        AddProcessInTable = new javax.swing.JButton();
        AlgorithmsList = new javax.swing.JComboBox<>();
        NumberProcess = new javax.swing.JTextField();
        CPUTime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        stateofProcess = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        QuantamTimeField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operating System");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Left.setMinimumSize(new java.awt.Dimension(400, 600));
        Left.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Algorithm");
        Left.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Number of Process");
        Left.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CPU Time");
        Left.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        RunAlgorithm.setBackground(new java.awt.Color(30, 62, 98));
        RunAlgorithm.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        RunAlgorithm.setForeground(new java.awt.Color(255, 255, 255));
        RunAlgorithm.setText("Run Algorithm");
        RunAlgorithm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunAlgorithmActionPerformed(evt);
            }
        });
        Left.add(RunAlgorithm, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 252, 46));

        AddProcessInTable.setBackground(new java.awt.Color(30, 62, 98));
        AddProcessInTable.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        AddProcessInTable.setForeground(new java.awt.Color(255, 255, 255));
        AddProcessInTable.setText("Add Process");
        AddProcessInTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddProcessInTableMouseEntered(evt);
            }
        });
        AddProcessInTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddProcessInTableActionPerformed(evt);
            }
        });
        Left.add(AddProcessInTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 340, 36));

        AlgorithmsList.setBackground(new java.awt.Color(255, 255, 255));
        AlgorithmsList.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        AlgorithmsList.setForeground(new java.awt.Color(0, 0, 0));
        AlgorithmsList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFS", "SJF", "Priority", "Round Robin", " " }));
        AlgorithmsList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 150, 136)));
        AlgorithmsList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlgorithmsListActionPerformed(evt);
            }
        });
        Left.add(AlgorithmsList, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 252, 33));

        NumberProcess.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NumberProcess.setForeground(new java.awt.Color(102, 102, 102));
        NumberProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberProcessActionPerformed(evt);
            }
        });
        Left.add(NumberProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 343, 40));

        CPUTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CPUTime.setForeground(new java.awt.Color(102, 102, 102));
        CPUTime.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Left.add(CPUTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 343, 40));

        jLabel6.setFont(new java.awt.Font("SimSun", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CPU Scheduling");
        Left.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 288, -1));

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("State of Processes");
        Left.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        stateofProcess.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stateofProcess.setForeground(new java.awt.Color(0, 0, 0));
        stateofProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateofProcessActionPerformed(evt);
            }
        });
        Left.add(stateofProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 140, 40));

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Quantam Time");
        Left.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 137, -1));

        QuantamTimeField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        QuantamTimeField.setForeground(new java.awt.Color(102, 102, 102));
        Left.add(QuantamTimeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 119, 40));

        Table.setBackground(new java.awt.Color(255, 255, 255));
        Table.setForeground(new java.awt.Color(0, 0, 0));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N.Process", "CPU.T", "Wait.T", "Turn.T"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setOpaque(false);
        Table.setSelectionForeground(new java.awt.Color(0, 0, 0));
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setResizable(false);
            Table.getColumnModel().getColumn(2).setResizable(false);
            Table.getColumnModel().getColumn(3).setResizable(false);
        }

        Left.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 870, 177));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Raizero.com");
        Left.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("You Must Select one");
        Left.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/WhatsApp Image 2024-12-18 at 21.46.42_815ee746.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        Left.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 650));

        jLabel8.setFont(new java.awt.Font("SimSun", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CPU Scheduling");
        Left.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 288, -1));

        jPanel1.add(Left);
        Left.setBounds(0, 0, 930, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RunAlgorithmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunAlgorithmActionPerformed
       rowCount = model.getRowCount();
       ChangeState("Running");
       
        int Cputime [] = new int[rowCount];
        
        int WaitingTime[]= new int[rowCount];
        int TrunaroundTime []= new int[rowCount];
        
//        ALgorithm FCFS (Motaz Dahy)
      if(AlgorithmsList.getSelectedItem().equals("FCFS")){
                 for(int i=0; i< rowCount; i++ ){
              Cputime[i] = Integer.parseInt(model.getValueAt(i, 1).toString());//Cpu time
              
        }
        WaitingTime[0]=0;
        for(int i=1;i<rowCount;i++){
            WaitingTime[i]= WaitingTime[i-1]+Cputime[i-1];
            
        }
        for(int i=0;i<rowCount; i++){
           TrunaroundTime[i]= WaitingTime[i]+Cputime[i];
           
        }
        SetWaitingAndTrunAroud(WaitingTime,TrunaroundTime);
        ShowMessageAverageWT("FCFS");
      }
      
      
//        ALgorithm SJF (Abolyazeed)
      
      
      else if (AlgorithmsList.getSelectedItem().equals("SJF")){ // Short Job Frist 
           List<Object[]> TableData = new ArrayList<>();
         
         for(int i=0; i<rowCount; i++){
             Object[] row = new Object[4];
             row[0] = model.getValueAt(i, 0);
             row[1] = Integer.parseInt(model.getValueAt(i, 1).toString());
             row[2] = 0;//waiting Time 
             row[3] = 0; //turnAround Time ;
             TableData.add(row);
             
             
             
         }
//         Sort Based on Cpu Time 

     TableData.sort((a,b) -> Integer.compare((int) a[1], (int)b[1]));
     
     
//     Operation 


   int CurrentTime = 0;
    for(int i=0; i<rowCount; i++){
       Object[] row = TableData.get(i);
       int CpuTime = (int) row[1];
       row[2] = CurrentTime ;
       row[3] = (int)row[2] + CpuTime;
       CurrentTime += CpuTime;
       
       
    }
          
    
    
    SeaderTableData(TableData);
        ShowMessageAverageWT("SJF");
      }
      
      
//        ALgorithm Priority (Ahmed Badawi)
      
      else if (AlgorithmsList.getSelectedItem().equals("Priority")){
//          Add Column "Proriy Process "
      if(model.getColumnCount() == 4){
                    model.addColumn("Priority.P");

      }
    
         for(int i=0 ;i < rowCount; i++){
             int number = i+1;
             
            String InputPriority = JOptionPane.showInputDialog(this, "Enter Number of Priority process"+number+":","Input Priority Process",JOptionPane.QUESTION_MESSAGE);
            model.setValueAt(InputPriority, i, 4);
         }
         
         
         List<Object[]> TableData = new ArrayList<>();
         
         for (int i=0; i<rowCount; i++){
             Object[] Process = new Object[5];
             Process[0] = model.getValueAt(i, 0);
             Process[1] = Integer.parseInt(model.getValueAt(i, 1).toString());//CPU time
             Process[2] = 0;
             Process[3] = 0;
             Process[4] = Integer.parseInt(model.getValueAt(i, 4).toString()) ;//Priority Process 
             TableData.add(Process);
             
         }
//         Sorting 
         TableData.sort((a,b) -> Integer.compare((int) a[4], (int )b[4]));
         
         
         
//         opertionS


         int currentTime = 0;
         for (int i=0 ;i <rowCount; i++){
             
             Object[] Process =TableData.get(i);
             int CPUTime = (int ) Process[1];
             Process[2] = currentTime;// Waiting Time 
             Process[3] = (int)Process[2] + CPUTime;//TrunAround Time 
             
             currentTime += CPUTime;
             
             
             
             
         }
          SeaderTableData(TableData);// in Algorithm FJS
          ShowMessageAverageWT("Priority Algorithm");// in Algorithm FCFS
          
    
      }
      
      
//        ALgorithm Round Robin  (Mahmoued Hazem)
      
      else if (AlgorithmsList.getSelectedItem().equals("Round Robin")){
//          Quyantam Time 
               String inputQuantam =  JOptionPane.showInputDialog(this,
                        "Enter Quantam time for all process ",
                        "Quantam Time ", 
                        JOptionPane.QUESTION_MESSAGE);
                QuantamTimeField.setText(inputQuantam);
                int QuantamTime = Integer.parseInt(inputQuantam);
                
                 List<Object[]> tableData = new ArrayList<>();
                 int [] backupCpuTime = new int[rowCount];
                 
                 for (int i=0; i< rowCount; i++){
                    Object[] process = new Object[4];
                    
                    process[0] = model.getValueAt(i, 0);
                    process[1]= Integer.parseInt(model.getValueAt(i, 1).toString());
                    backupCpuTime[i] = Integer.parseInt(model.getValueAt(i, 1).toString());//Cpu time of process 
                    process[2] = 0;
                    process[3] = 0;
                    
                    tableData.add(process);
                    
                    
                 }
//                 Operations 
                     boolean allProcessesIscomplete;
                     int currentTime = 0;
                     do{
                         allProcessesIscomplete = true;
                         for(Object[] process : tableData){
                             int CPUTime= (int) process[1];
                             
                             if(CPUTime > 0 ){
                                 allProcessesIscomplete = false;
                                 if(CPUTime > QuantamTime){
//                                     process is n`t finshed 
                                        currentTime += QuantamTime;
                                        process[1] = (int) process[1] - QuantamTime;
                                        
                                 }
                                 else {
//                                     process is finshed 
                                          currentTime += CPUTime;
                                          process[1] = 0;//cpu Time Finshed
                                          process[3] = currentTime;//trun Around time 
                                          process[2] = (int) process[3]- CPUTime;
                                          
                                          
                                          
                                 }
                             }
                         }
//                         opertion 
                     }while (!allProcessesIscomplete);
                     for(int i=0 ;i< rowCount;i++){
                          Object[] process = tableData.get(i);
                          model.setValueAt(process[0], i, 0);
                          model.setValueAt(backupCpuTime[i], i, 1);
                          model.setValueAt(process[2], i, 2);
                          model.setValueAt(process[3], i, 3);
                     }
                     
                     ShowMessageAverageWT("Round Robin");
   
      }             
        
    }//GEN-LAST:event_RunAlgorithmActionPerformed

    private void AddProcessInTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddProcessInTableActionPerformed
                model = (DefaultTableModel) Table.getModel();
                if(CPUTime.getText().isEmpty()   ){
                    JOptionPane.showMessageDialog(this, "CPU Time UnVailed","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(Integer.parseInt(CPUTime.getText()) <= 0 ){
                    JOptionPane.showMessageDialog(this, "CPU is less than Zero","Error",JOptionPane.ERROR_MESSAGE);

                }
                
                else{
                     
//                  1-  Add to Table   
                        Add_To_Table();

//                  2-  Clear Cpu Time 
                            ClearCPUTime();
//                  3-  Increament Number of Process 
                        IncreamentNumberProcess();
                        ChangeState("Ready");
                        
                }
    }//GEN-LAST:event_AddProcessInTableActionPerformed
    private void AlgorithmsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlgorithmsListActionPerformed
    }//GEN-LAST:event_AlgorithmsListActionPerformed
    private void AddProcessInTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddProcessInTableMouseEntered
 
    }//GEN-LAST:event_AddProcessInTableMouseEntered

    private void stateofProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateofProcessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateofProcessActionPerformed

    private void NumberProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberProcessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberProcessActionPerformed
           
    
        
            private void ChangeState(String state){
                
                stateofProcess.setText(state);
            }
            
            private void SeaderTableData(List<Object[]> TableDate ){ // ٍShorts Job First
                for (int i=0 ; i< TableDate.size(); i++){
                    Object[] row = TableDate.get(i);
                    model.setValueAt(row[0], i, 0);
                    model.setValueAt(row[1], i, 1);
                    model.setValueAt(row[2], i, 2);
                    model.setValueAt(row[3], i, 3);
                    if(model.getColumnCount() == 5){
                        model.setValueAt(row[4],i, 4);
                    }
      
                }
            }
            private void Add_To_Table(){
                model.addRow(new Object[]{"p"+NumberProcess.getText(),CPUTime.getText(),0,0});
            }
            private void ClearCPUTime(){
                CPUTime.setText("");
            }
            private void IncreamentNumberProcess(){
              int Number = Integer.parseInt(NumberProcess.getText())  ;
              Number++;
              NumberProcess.setText(Number+"");
              
            }
            private void SetWaitingAndTrunAroud(int waitingTime[],int trunAround[]){
                for(int i=0;i<model.getRowCount();i++){
                    model.setValueAt(waitingTime[i], i, 2);
                    model.setValueAt(trunAround[i], i, 3);

                }
            }
            private void ShowMessageAverageWT(String Algorithm){
                double totalwaiting=0;
                double totalTrunaround = 0;
                for(int i=0;i<model.getRowCount();i++){
                    totalwaiting += Integer.parseInt(model.getValueAt(i, 2).toString());
                    totalTrunaround += Integer.parseInt(model.getValueAt(i, 3).toString());
                }
              totalwaiting /= model.getRowCount();
              totalTrunaround /=model.getRowCount();
              JOptionPane.showMessageDialog(this, 
                      "in "+Algorithm+" ]\n Average Waiting Time :"+totalwaiting+"\n average Trun Around Time :"+totalTrunaround,"Result",JOptionPane.INFORMATION_MESSAGE);
            }
           
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddProcessInTable;
    private javax.swing.JComboBox<String> AlgorithmsList;
    private javax.swing.JTextField CPUTime;
    private javax.swing.JPanel Left;
    private javax.swing.JTextField NumberProcess;
    private javax.swing.JTextField QuantamTimeField;
    private javax.swing.JButton RunAlgorithm;
    private javax.swing.JTable Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField stateofProcess;
    // End of variables declaration//GEN-END:variables
}
