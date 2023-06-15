package Dia10.Desafio10;

import Dia10.Desafio10.Classes.Aluno;
import Dia10.Desafio10.Classes.Escola;
import Dia10.Desafio10.Panels.AlunoPanel;
import Dia10.Desafio10.Panels.EscolaPanel;
import Dia10.Desafio10.Panels.Panels;
import Dia10.Desafio10.Repository.AlunoRepository;
import Dia10.Desafio10.Repository.EscolaRepository;

public class Main {

    public static void main(String[] args) {
        EscolaRepository er = new EscolaRepository();
        AlunoRepository ar = new AlunoRepository();

        EscolaPanel ep = new EscolaPanel();
        AlunoPanel ap = new AlunoPanel();

        while(true) {
            int tableOption = Panels.mainPanel();
            
            if(tableOption == 2)
                break;
            
            int operationOption = Panels.operationOption();
            
            switch (tableOption) {
                case 0:
                    Escola escola;
                    switch(operationOption) {
                        case 0:
                            escola = ep.insertPanel();
                            if(escola != null)
                                er.insert(escola);
                            break;
                        case 1:
                            escola = ep.selectionPanel();
                            if(escola != null){
                                Escola novo = ep.updatePanel(escola);
                                er.update(novo);
                            }
                            break;
                        case 2:
                            escola = ep.selectionPanel();
                            if(escola != null)
                                er.delete(escola);
                            break;
                        case 3:
                            ep.consultationPanel();
                            break;
                        default:
                            break;
                    }
                    break;
                case 1:
                    Aluno aluno;
                    switch(operationOption) {
                        case 0:
                            aluno = ap.insertPanel();
                            if(aluno != null)
                                ar.insert(aluno);
                            break;
                        case 1:
                            aluno = ap.selectionPanel();
                            if(aluno != null){
                                Aluno novo = ap.updatePanel(aluno);
                                ar.update(novo);
                            }
                            break;
                        case 2:
                            aluno = ap.selectionPanel();
                            if(aluno != null)
                                ar.delete(aluno);
                            break;
                        case 3:
                            ap.consultationPanel();
                            break;
                        default:
                            break;
                    }
                    break;
            }
        }
    }
}
