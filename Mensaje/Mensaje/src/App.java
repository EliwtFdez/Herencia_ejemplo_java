public class App {
    public static void main(String[] args) {
        System.out.println("Sistema de Mensajería");
            Mensaje msg1= new Mensaje();
            Mensaje msg2= new Mensaje("Saludo","Hola, espero se encuentren muy bien");
          
              msg1.setTitulo("Recordatorio");
              msg1.setTexto("TE recuerdo que mañana tienes que asistir a una reunión");
          
              //cambiar mensaje 1
              msg1.setTexto("te invito a una pijamada");
          
              //Cambiar mensaje 2
          
              msg2.setTexto("Hola te invito a una Fiesta.");
          
             System.out.println(msg1.getTexto());
             System.out.println(msg2.getTexto());
        
        


    }
}