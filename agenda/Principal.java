import Agenda;

public class Principal {
  public static void main (String args[]) {
    Agenda agenda = new Agenda();
    agenda.show();
    //vazio=>
    agenda.init("Livia");
    agenda.show();
    //Livia=>
    agenda.add("casa", "1234");
    agenda.show();
    //Livia=>[casa:1234]
    agenda.rm("1234");
    agenda.show("1234");
    //Livia=>
    agenda.update("vivo", "a123");
    //fail: fone invalido
    agenda.update("vivo", "(99)1234");
    agenda.show();
    //Livia=>[vivo:(99)1234]
  }
}