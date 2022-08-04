package visao;

import controle.ControleFuncionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Funcionario;

public class VisaoFuncionario extends javax.swing.JFrame {

    List<Funcionario> lista = new ArrayList<>();
    ControleFuncionario controle = new ControleFuncionario();
    
    public VisaoFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFuncionarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bAdicionar = new javax.swing.JButton();
        tfPesquisar = new javax.swing.JTextField();
        bPesquisar = new javax.swing.JButton();
        bRemover = new javax.swing.JButton();
        bListarTodos = new javax.swing.JButton();
        bCalcularGanho = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Salário", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbFuncionarios);

        jLabel1.setText("Gerenciar Funcionários");

        jLabel2.setText("Pesquisar pelo id: ");

        bAdicionar.setText("Adicionar");
        bAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdicionarActionPerformed(evt);
            }
        });

        bPesquisar.setText("Pesquisar");
        bPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarActionPerformed(evt);
            }
        });

        bRemover.setText("Remover");
        bRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoverActionPerformed(evt);
            }
        });

        bListarTodos.setText("Exibir no Console");
        bListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarTodosActionPerformed(evt);
            }
        });

        bCalcularGanho.setText("Calcular Ganho Anual");
        bCalcularGanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcularGanhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(bAdicionar)
                .addGap(18, 18, 18)
                .addComponent(bRemover)
                .addGap(18, 18, 18)
                .addComponent(bListarTodos)
                .addGap(18, 18, 18)
                .addComponent(bCalcularGanho)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(bPesquisar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdicionar)
                    .addComponent(bRemover)
                    .addComponent(bListarTodos)
                    .addComponent(bCalcularGanho))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed
        Funcionario f = controle.pesquisar(Integer.parseInt(tfPesquisar.getText()));
        if(f!= null){
            System.out.println("Funcionario: "+f);
        }
    }//GEN-LAST:event_bPesquisarActionPerformed

    private void bListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarTodosActionPerformed
        controle.exibir();
    }//GEN-LAST:event_bListarTodosActionPerformed

    private void bRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverActionPerformed
        int linha = tbFuncionarios.getSelectedRow(); //pegando a linha selecionada na tabela
        
        if(linha == -1){ //o usuário não selecionou nenhuma linha
            JOptionPane.showMessageDialog(null, "Selecione um funcionário para excluir!"); //exibir mensagem
        }else{ //o usuário selecionou uma linha
            Funcionario f = lista.get(linha); //pegando funcionário selecionado
            controle.remover(f); //removendo funcionário da lista da classe controle
            JOptionPane.showMessageDialog(null, "Funcionário excluído!");
            atualizaTabela();
        }
    }//GEN-LAST:event_bRemoverActionPerformed

    private void bCalcularGanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcularGanhoActionPerformed
        int linha = tbFuncionarios.getSelectedRow(); //pegando a linha selecionada na tabela
        
        if(linha == -1){ //o usuário não selecionou nenhuma linha
            JOptionPane.showMessageDialog(null, "Selecione um funcionário para calcular!"); //exibir mensagem
        }else{
            Funcionario f = lista.get(linha); //pegando funcionário selecionado
            double resultado = controle.calcularBrutoAnual(f); //calculando o salario bruto anual e armazenando em uma variável
            System.out.println("Bruto anual do funcinário: "+resultado);
        }
    }//GEN-LAST:event_bCalcularGanhoActionPerformed

    private void bAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdicionarActionPerformed
        FuncionarioAdicionar tela = new FuncionarioAdicionar(null, true); //criando tela do tipo FuncionarioAdicionar
        tela.setVisible(true); // deixando a tela visível
        if(tela.isSalvou()){ //confimar que a pessoa clicou em "salvar" na outra tela
            Funcionario f = tela.getFuncionario(); //pegando as informações do funcionário da outra tela
            controle.adicionar(f);//adicionando o funcionário a lista da classe controle
        }
        atualizaTabela();
    }//GEN-LAST:event_bAdicionarActionPerformed

    public void atualizaTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tbFuncionarios.getModel(); //pegando o modelo da tabela pra poder alterar as linhas com as informações dos funcionários
        modelo.setNumRows(0);
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        lista.clear(); //limpando a lista 
        lista.addAll(controle.listar()); //adicionando todos os funcionários da lista da classe controle
        for (Funcionario f : lista) { //percorrendo a lista dos funcionários
            modelo.addRow(new Object[]{f.getId(), f.getNome(), f.getSalario(), f.getCargo()}); //adicionando as informações na tabela
        }
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
            java.util.logging.Logger.getLogger(VisaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisaoFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdicionar;
    private javax.swing.JButton bCalcularGanho;
    private javax.swing.JButton bListarTodos;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JButton bRemover;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbFuncionarios;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables
}
