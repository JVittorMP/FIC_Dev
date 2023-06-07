package Dia05.Desafio05;

import java.awt.event.KeyEvent;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Main {
    public static void main(String[] args) {
        MaquinaAutomatica auto = new MaquinaAutomatica();
        boolean parar = false;

        JTextField nome = new JTextField(15);
        JTextField valor = new JTextField(15);

        String selecaoA[] = {"Inserir Produto", "Realizar Compra", "Fechar"};
        String selecaoB[] = {"Adicionar Produto", "Finalizar Compra"};
        String selecaoC[] = {"Concluir", "Cancelar"};

        Object[] produto = {"Nome: ", nome, "Valor: ", valor};
        
        while(!parar) {
            int op = JOptionPane.showOptionDialog(
                null,
                "Selecione a opção desejada: ",
                "Máquina Automática",
                JOptionPane.PLAIN_MESSAGE,
                0,
                null,
                selecaoA,
                selecaoA[1]
            );

            switch(op) {
                case 0:
                    int val = JOptionPane.showOptionDialog(
                        null,
                        produto,
                        "Produto",
                        JOptionPane.PLAIN_MESSAGE,
                        0,
                        null,
                        selecaoC,
                        selecaoC[1]
                    );
                    if(val == 0) {
                        Produto novo = new Produto(nome.getText(), Double.parseDouble(valor.getText()));
                        auto.incluirProduto(novo);
                    }
                    break;
                case 1:
                    double total = 0.0;
                    while(true) {
                        String produtos = "<html>" + "Cardápio" + "<br>";
                        for(var p : auto.getProdutos()){
                            produtos += String.format("<br>" + p.getNome() + ": R$ " + p.getValor());
                        }
                        produtos += "<html>";
                        
                        JTextField item = new JTextField(15);
                        JTextField qtdd = new JTextField(5);
                        JTabbedPane tabbedPane = new JTabbedPane();

                        JPanel panel1 = new JPanel();
                        JPanel panel2 = new JPanel();
                        panel1.add(new JLabel(produtos));
                        panel2.add(new JLabel("Produto: "));
                        panel2.add(item);
                        panel2.add(Box.createHorizontalStrut(15));
                        panel2.add(new JLabel("Quantidade: "));
                        panel2.add(qtdd);
                        tabbedPane.addTab("Lista de Produtos", null, panel1, "");
                        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
                        tabbedPane.addTab("Compra", null, panel2, "");
                        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

                        int ans = JOptionPane.showOptionDialog(
                            null,
                            tabbedPane,
                            "Insira o Produto Desejado",
                            JOptionPane.PLAIN_MESSAGE,
                            0,
                            null,
                            selecaoB,
                            selecaoB[1]
                        );

                        if(ans == 0 && qtdd.getText().matches("[0-9]+")) {
                            String compra = item.getText();
                            for(var p : auto.getProdutos()){
                                if(p.getNome().equals(compra))
                                    total += p.getValor() * Integer.parseInt(qtdd.getText());  
                            }
                        } else if(ans == 1) {
                            JOptionPane.showMessageDialog(null, String.format("Total: R$ " + total));
                            break;
                        }
                    }
                    break;
                case 2:
                    parar = true;
                    break;
            }

            nome.setText("");
            valor.setText("");
        }

    }
}
