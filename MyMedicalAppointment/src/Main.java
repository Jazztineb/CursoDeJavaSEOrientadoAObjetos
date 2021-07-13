import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import java.util.Date;

import static ui.UIMenu.showMenu;


public class Main {
    public static void main(String[] args) {
        showMenu();

        /*
        1.-Declaras nombre de la clase (model.Doctor).
        2.- Nombre de objeto (myDoctor)
        3.- Poner en orbita el objeto (new model.Doctor()). Es el método constructor.
         */

                            //Método constructor.
        //model.Doctor myDoctor =   new model.Doctor();
        //myDoctor.name= "Blanca Briceño Silva";
        //myDoctor.showName();
        //myDoctor.showIdDoctor();
        //System.out.println(model.Doctor.id);

        //model.Doctor myDoctorAracely = new model.Doctor();
        //myDoctor.showIdDoctor();
        //System.out.println(model.Doctor.id);

        /*
        Doctor myDoctor = new Doctor("Blanca Esther Briceño Silva ","dermablanca@mail.com");
        myDoctor.addAvailableAppointment(new Date(), "4 pm");
        myDoctor.addAvailableAppointment(new Date(), "10 pm");
        myDoctor.addAvailableAppointment(new Date(), "1 pm");
        System.out.println(myDoctor);*/

        //Usando metodos abstractos.

        /*
        User user = new Doctor("Aracely de la Torre", "delatorre@mail.com");
        user.showDataUser();

        User userPa = new Patient("Justine Briceño Cortez", "jbc@mail.com");
        userPa.showDataUser();*/

        //Instanciando clases anónimas con métodos anonimos.
        /*User user1 = new User("Angel Briceño Cortez", "abc@mail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Galenia");
                System.out.println("Departamento: Geriatría");
            }
        };
            user1.showDataUser();*/

        /*ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };*/

        /*for (model.Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }*/

        /*
        Patient patient = new Patient("Heriberto Alva Trujillo", "heriberto@mail.com");
        patient.setWeight(54.6); //setter
        System.out.println(patient.getWeight()); //getter
        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());
        System.out.println(patient);*/



        /*Explicación de variables y objetos en memoria
        int i = 0;
        int b = 2;
        b = i;

        System.out.println();
        System.out.println();
        model.Patient patient     = new model.Patient("Angel", "abc123@mail.com");
        model.Patient patient1    = new model.Patient("Fernanda", "fernanda@mail.com");

        System.out.println(patient.name); //Si no ponemos .name solo imprime la memoria.
        System.out.println(patient1.name);
        patient1 = patient;

        System.out.println(patient.name);
        System.out.println(patient1.name);*/

        //patient1.setName("Manuel");

    }
}
