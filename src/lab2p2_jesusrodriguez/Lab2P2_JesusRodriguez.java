package lab2p2_jesusrodriguez;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JColorChooser;

public class Lab2P2_JesusRodriguez {

    static Scanner leer = new Scanner(System.in);
    static Random ran = new Random();

    public static void main(String[] args) {
        String contraseña = "g3r$nt0";
        String con = "";
        String Usuario = "";
        int res1 = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int cont6 = 0;
        int cont7 = 0;
        ArrayList<Chefs> chefs = new ArrayList<>();
        ArrayList<Meseros> meseros = new ArrayList<>();
        ArrayList<Bartenders> bart = new ArrayList<>();
        ArrayList<Mesas> mesas = new ArrayList<>();

        while (!con.equals(contraseña) || !Usuario.equals("gerente")) {
            System.out.println("Ingrese Usuario: ");
            Usuario = leer.next().toLowerCase();
            System.out.println("Ingrese la contraseña");
            con = leer.next();
            if (!con.equals(contraseña) || !Usuario.equals("gerente")) {
                System.out.println("Incorrecto, Ingrese denuevo");

            } else {
                System.out.println("Bienvenido Big boss");

            }

        }
        do {
            System.out.println("Menu \n 1. Crear \n 2.Listar \n 3. Modificar \n 4. Eliminar \n 0. Salir ");
            res1 = leer.nextInt();
            switch (res1) {
                case 1: {
                    System.out.println("Que desea crear:\n 1. Chefs \n2. Meseros \n 3. Bartenders \n 4. Mesas ");
                    int res2 = leer.nextInt();
                    switch (res2) {
                        case 1: {
                            System.out.println("Ingrese el Nombre");
                            leer.nextLine();
                            String nombre = leer.nextLine();
                            System.out.println("Ingrese Edad: ");
                            int edad = leer.nextInt();
                            System.out.println("Ingrese sueldo: ");
                            int sueldo = leer.nextInt();
                            System.out.println("Ingrese Estrellas: ");
                            int estrellas = leer.nextInt();
                            System.out.println("Ingrese Turno (1. Matutino \n2. Vespertino: ");
                            int turno = leer.nextInt();

                            if (turno == 1 && cont1 <= 7) {
                                System.out.println("Ha Ingresado el turno matutino");
                                cont1++;
                            } else if (turno == 2 && cont2 <= 7) {
                                System.out.println("Ha ingresado el turno Vespertino");
                                cont2++;
                            } else {
                                System.out.println("No valido");
                                break;
                            }
                            if (turno == 1) {
                                if (cont1 <= 7 && turno == 1) {
                                    Chefs n1 = new Chefs(nombre, edad, sueldo, estrellas, turno);
                                    chefs.add(n1);
                                    System.out.println("Chef Agregado Exitosamente");
                                } else {
                                    
                                    System.out.println("Esta lleno");
                                     cont1--;
                                }
                            } else if (turno == 2) {
                                if (cont2 <= 7 && turno == 2) {
                                    Chefs n1 = new Chefs(nombre, edad, sueldo, estrellas, turno);
                                    chefs.add(n1);
                                    System.out.println("Chef Agregado Exitosamente");

                                } else {
                                    System.out.println("Esta lleno");
                                     cont2--;

                                }
                            }
                        }
                        break;
                        case 2: {
                            System.out.println("Ingrese el Nombre");
                            leer.nextLine();
                            String nombre = leer.nextLine();
                            System.out.println("Ingrese Edad: ");
                            int edad = leer.nextInt();
                            System.out.println("Ingrese sueldo: ");
                            int sueldo = leer.nextInt();
                            System.out.println("Ingrese Propina: ");
                            int Propinas = leer.nextInt();
                            System.out.println("Ingrese Turno (1. Matutino \n 2. Vespertino: ");
                            int turno = leer.nextInt();
                            if (turno == 1 && cont3 <= 4) {
                                System.out.println("Ha Ingresado el turno matutino");
                                cont3++;
                            } else if (turno == 2 && cont4 <= 4) {
                                System.out.println("Ha ingresado el turno Vespertino");
                                cont4++;
                            } else {
                                System.out.println("No Valido");
                                break;
                            }
                            if (turno == 1) {
                                if (cont1 <= 4 && turno == 1) {
                                    Meseros n1 = new Meseros(nombre, edad, sueldo, Propinas, turno);
                                    meseros.add(n1);
                                    System.out.println("Meseros Agregado Exitosamente");
                                } else {

                                    System.out.println("Esta lleno");
                                     cont3--;
                                }
                            } else if (turno == 2) {

                                if (cont2 <= 4 && turno == 2) {
                                    Meseros n1 = new Meseros(nombre, edad, sueldo, Propinas, turno);
                                    meseros.add(n1);
                                    System.out.println("Mesero Agregado Exitosamente");

                                } else {

                                    System.out.println("Esta lleno");
                                     cont4--;
                                }
                            }

                        }
                        break;

                        case 3: {
                            System.out.println("Ingrese el Nombre");
                            leer.nextLine();
                            String nombre = leer.nextLine();
                            System.out.println("Ingrese Edad: ");
                            int edad = leer.nextInt();
                            System.out.println("Ingrese sueldo: ");
                            int sueldo = leer.nextInt();
                            System.out.println("Ingrese Licores: ");
                            int licores = leer.nextInt();
                            System.out.println("Ingrese Turno (1. Matutino \n2. Vespertino: ");
                            int turno = leer.nextInt();
                            if (turno == 1 && cont5 <= 2) {
                                System.out.println("Ha Ingresado el turno matutino");
                                cont5++;
                            } else if (turno == 2 && cont6 <= 2) {
                                System.out.println("Ha ingresado el turno Vespertino");
                                cont6++;
                            } else {
                                System.out.println("No Valido");
                                 
                                break;
                            }
                            if (turno == 1) {
                                if (cont5 <= 2 && turno == 1) {
                                    Bartenders n1 = new Bartenders(nombre, edad, sueldo, licores, turno);
                                    bart.add(n1);
                                    System.out.println("Bartender Agregado Exitosamente");
                                } else {
                                    System.out.println("Esta lleno");
                                     cont5--;

                                }

                            } else if (turno == 2) {
                                if (cont6 <= 2 && turno == 2) {
                                    Bartenders n1 = new Bartenders(nombre, edad, sueldo, licores, turno);
                                    bart.add(n1);
                                    System.out.println("Bartender Agregado Exitosamente");

                                } else {
                                    System.out.println("Esta lleno");
                                     cont6--;

                                }
                            }

                        }
                        break;

                        case 4: {
                            System.out.println("Ingrese el Numero de platos: ");
                            int platos = leer.nextInt();
                            System.out.println("Ingrese el numero de Utensilios: ");
                            int uten = leer.nextInt();
                            System.out.println("Ingrese el precio total: ");
                            int precio = leer.nextInt();

                            if (cont7 == 10) {
                                System.out.println("No disponible");
                            } else {

                                mesas.add(new Mesas(platos, uten, precio));
                                System.out.println("Mesa Agregada Exitosamente");
                                cont7++;

                            }

                        }
                        break;
                        default: {
                            System.out.println("No valido");
                        }
                        break;
                    }

                }
                break;
                case 2: {
                    System.out.println("Que desea Listar:\n 1. Chefs \n2. Meseros \n 3. Bartenders \n 4. Mesas ");
                    int res3 = leer.nextInt();
                    String lista = "";
                    switch (res3) {
                        case 1: {
                            for (Chefs cf : chefs) {
                                lista += chefs.indexOf(cf) + " - " + cf;
                            }
                            System.out.println(lista);

                        }
                        break;
                        case 2: {
                            for (Meseros mes : meseros) {
                                lista += meseros.indexOf(mes) + 1 + " - " + mes;
                            }
                            System.out.println(lista);

                        }
                        break;
                        case 3: {
                            for (Bartenders bt : bart) {
                                lista += bart.indexOf(bt) + 1 + " - " + bt;
                            }
                            System.out.println(lista);

                        }
                        break;
                        case 4: {
                            for (Mesas ms : mesas) {
                                lista += mesas.indexOf(ms) + 1 + " - " + ms;
                            }
                            System.out.println(lista);

                        }
                        break;
                        default: {
                            System.out.println("No valido");
                            break;
                        }

                    }

                }
                break;
                case 3: {
                    System.out.println("Que desea Listar:\n 1. Chefs \n2. Meseros \n 3. Bartenders \n 4. Mesas ");
                    int res4 = leer.nextInt();
                    String lista = "";
                    switch (res4) {
                        case 1: {
                            for (Chefs cf : chefs) {
                                lista += chefs.indexOf(cf) + 1 + " - " + cf;
                            }
                            System.out.println(lista);
                            System.out.println("A quien desea Modificar?");
                            int eleccion = leer.nextInt();
                            int Index = eleccion - 1;
                            

                            System.out.println("Que desea modificar: 1. Nombre \n 2.Edad \n 3. Estrellas \n 4.Sueldo \n 5.Turno ");
                            int Canmod = leer.nextInt();
                            switch (Canmod - 1) {
                                case 0: {
                                    String nom;
                                    System.out.println("Ingrese Nombre: ");
                                    leer.nextLine();
                                    nom = leer.nextLine();
                                    chefs.get(Index).setNombre(nom);
                                }
                                break;
                                case 1: {
                                    int e;
                                    System.out.println("Ingrese edad");
                                    e = leer.nextInt();
                                    chefs.get(Index).setEdad(e);

                                }
                                break;
                                case 2: {
                                    int es;
                                    System.out.println("Ingrese estrellas: ");
                                    es = leer.nextInt();
                                    chefs.get(Index).setEstrellas(es);
                                }
                                break;
                                case 3: {
                                    int su;
                                    System.out.println("Ingrese sueldo: ");
                                    su = leer.nextInt();
                                    chefs.get(Index).setSueldo(su);
                                }
                                break;
                                case 4: {
                                    int tur;
                                    System.out.println("Ingrese turno: ");
                                    int type= chefs.get(Index).getTurno();
                                    tur = leer.nextInt();
                                    
                                    
                                    chefs.get(Index).setTurno(tur);
                                    if (type==1 && chefs.get(Index).getTurno()==2 ) {
                                        cont1--;
                                        cont2++;
                                        if (cont2 > 7) {
                                            System.out.println("No se puede");
                                            cont1++;
                                            cont2--;
                                             chefs.get(Index).setTurno(1);
                                        }
                                    }
                                    else if(type==2 && chefs.get(Index).getTurno()==1) {
                                        cont1++;
                                        cont2--;
                                        if (cont1 > 7) {
                                            System.out.println("No se puede");
                                            cont1--;
                                            cont2++;
                                             chefs.get(Index).setTurno(2);
                                        }
                                    }
                                    
                                }
                                break;

                            }

                        }
                        break;
                        case 2: {
                            for (Meseros mes : meseros) {
                                lista += meseros.indexOf(mes) + 1 + " - " + mes;
                            }
                            System.out.println(lista);
                            System.out.println("A quien desea Modificar?");
                            int eleccion = leer.nextInt();
                            int Index = eleccion - 1;
                            Meseros Infor = meseros.get(Index);

                            System.out.println("Que desea modificar: 1. Nombre \n 2.Edad \n 3. Sueldo \n 4.Propina \n 5.turno ");
                            int Canmod = leer.nextInt();
                            switch (Canmod - 1) {
                                case 0: {
                                    String nom;

                                    System.out.println("Ingrese Nombre: ");
                                    leer.nextLine();
                                    nom = leer.nextLine();
                                    meseros.get(Index).setNombre(nom);
                                }
                                break;
                                case 1: {
                                    int e;
                                    System.out.println("Ingrese edad");
                                    e = leer.nextInt();
                                    Infor.setEdad(e);

                                }
                                break;
                                case 2: {

                                    int su;
                                    System.out.println("Ingrese sueldo: ");
                                    su = leer.nextInt();
                                    meseros.get(Index).setSueldo(su);
                                }
                                break;
                                case 3: {
                                    int prop;
                                    System.out.println("Ingrese propina: ");
                                    prop = leer.nextInt();
                                    meseros.get(Index).setPropina(prop);
                                }
                                break;
                                case 4: {
                                    int tur;
                                    System.out.println("Ingrese turno: ");
                                    tur = leer.nextInt();
                                    int type= meseros.get(Index).getTurno();
                                    meseros.get(Index).setTurno(tur);
                                 
                                    if (type==1 && meseros.get(Index).getTurno()==2 ) {
                                        cont3--;
                                        cont4++;
                                        if (cont4 > 4) {
                                            System.out.println("No se puede");
                                            cont3++;
                                            cont4--;
                                             meseros.get(Index).setTurno(1);
                                        }
                                    }
                                    else if(type==2 && meseros.get(Index).getTurno()==1) {
                                        cont4++;
                                        cont3--;
                                         if (cont3 > 4) {
                                            System.out.println("No se puede");
                                            cont4--;
                                            cont3++;
                                             meseros.get(Index).setTurno(2);
                                             }
                                    }
                                    
                                }
                                break;

                            }

                        }
                        break;
                        case 3: {
                            for (Bartenders bt : bart) {
                                lista += bart.indexOf(bt) + 1 + " - " + bt;
                            }
                            System.out.println(lista);
                            System.out.println("A quien desea Modificar?");
                            int eleccion = leer.nextInt();
                            int Index = eleccion - 1;
                            

                            System.out.println("Que desea modificar: 1. Nombre \n 2.Edad \n 3. Sueldo \n 4.Licores \n 5.turno ");
                            int Canmod = leer.nextInt();
                            switch (Canmod - 1) {
                                case 0: {
                                    String nom;
                                    System.out.println("Ingrese Nombre: ");
                                    leer.nextLine();
                                    nom = leer.nextLine();
                                    bart.get(Index).setNombre(nom);
                                }
                                break;
                                case 1: {
                                    int e;
                                    System.out.println("Ingrese edad");
                                    e = leer.nextInt();
                                    bart.get(Index).setEdad(e);

                                }
                                break;
                                case 2: {

                                    int su;
                                    System.out.println("Ingrese sueldo: ");
                                    su = leer.nextInt();
                                   bart.get(Index).setSueldo(su);
                                }
                                break;
                                case 3: {
                                    int lic;
                                    System.out.println("Ingrese Licores: ");
                                    lic = leer.nextInt();
                                  bart.get(Index).setLicores(lic);
                                }
                                break;
                                case 4: {
                                    int tur;
                                    System.out.println("Ingrese turno: ");
                                    tur = leer.nextInt();
                                    int type= bart.get(Index).getTurno();
                                    bart.get(Index).setTurno(tur);
                                    
                                    
                                    if (type==1 && bart.get(Index).getTurno()==2 ) {
                                        cont5--;
                                        cont6++;
                                        if (cont6 > 2) {
                                            System.out.println("No se puede");
                                            cont5++;
                                            cont6--;
                                             bart.get(Index).setTurno(1);
                                        }
                                    }
                                    else if(type==2 && bart.get(Index).getTurno()==1) {
                                        cont5++;
                                        cont6--;
                                        if (cont5 > 2) {
                                            System.out.println("No se puede");
                                            cont6++;
                                            cont5--;
                                             bart.get(Index).setTurno(2);
                                        }
                                    }
                                }
                                break;

                            }

                        }
                        break;
                        case 4: {
                            for (Mesas ms : mesas) {
                                lista += mesas.indexOf(ms) + 1 + " - " + ms;
                            }
                            System.out.println(lista);
                            System.out.println("A quien desea Modificar?");
                            int eleccion = leer.nextInt();
                            int Index = eleccion - 1;
                            Mesas Infor = mesas.get(Index);

                            System.out.println("Que desea modificar: 1. Platos \n 2.Utensilios \n 3. Precio");
                            int Canmod = leer.nextInt();
                            switch (Canmod - 1) {
                                case 0: {
                                    int plat;
                                    System.out.println("Ingrese Platos: ");
                                    plat = leer.nextInt();
                                    mesas.get(Index).setPlatos(plat);
                                }
                                break;
                                case 1: {
                                    int Utl;
                                    System.out.println("Ingrese Utensilios");
                                    Utl = leer.nextInt();
                                   mesas.get(Index).setUtensilios(Utl);

                                }
                                break;
                                case 2: {

                                    int prec;
                                    System.out.println("Ingrese Precio: ");
                                    prec = leer.nextInt();
                                   mesas.get(Index).setPrecio(prec);
                                }
                                break;

                            }
                        }
                        break;
                        default: {
                            System.out.println("No valido");
                            break;
                        }

                    }
                }
                break;
                case 4: {

                    System.out.println("Que desea Listar:\n 1. Chefs \n2. Meseros \n 3. Bartenders \n 4. Mesas ");
                    int res5 = leer.nextInt();
                    String lista = "";
                    switch (res5) {
                        case 1: {
                            for (Chefs cf : chefs) {
                                lista += chefs.indexOf(cf) + 1 + " - " + cf;
                            }
                            System.out.println(lista);
                            System.out.println("A quien desea eliminar: ");
                            int elim = leer.nextInt();
                            if (chefs.get(elim - 1).getTurno() == 1) {
                                cont1--;

                            } else {
                                cont2--;

                            }
                            chefs.remove(elim - 1);

                        }
                        break;
                        case 2: {
                            for (Meseros mes : meseros) {
                                lista += meseros.indexOf(mes) + 1 + " - " + mes;
                            }
                            System.out.println(lista);
                            System.out.println("A quien desea eliminar: ");
                            int elim = leer.nextInt();
                            if (meseros.get(elim - 1).getTurno() == 1) {
                                cont3--;

                            } else {
                                cont4--;

                            }
                            meseros.remove(elim - 1);

                        }
                        break;
                        case 3: {

                            for (Bartenders bt : bart) {
                                lista += bart.indexOf(bt) + 1 + " - " + bt;
                            }
                            System.out.println(lista);
                            System.out.println("A quien desea eliminar: ");
                            int elim = leer.nextInt();
                            if (bart.get(elim - 1).getTurno() == 1) {
                                cont5--;

                            } else {
                                cont6--;

                            }

                            bart.remove(elim - 1);

                        }
                        break;
                        case 4: {
                            for (Mesas ms : mesas) {
                                lista += mesas.indexOf(ms) + 1 + " - " + ms;
                            }
                            System.out.println(lista);
                            System.out.println("A quien desea eliminar: ");
                            int elim = leer.nextInt();
                            cont7--;
                            mesas.remove(elim - 1);

                        }
                    }
                }
                break;
                case 0: {
                    System.out.println("Adios ");
                }
                break;
            }

        } while (res1 != 0);
    }

}
