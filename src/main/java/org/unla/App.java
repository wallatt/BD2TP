package org.unla;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.unla.mongodbtp.entidades.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class App
{
    //
    public static void main( String[] args )
    {
        //Intancio datos
        Tipo perfumeria = new Tipo("Perfumeria");
        Tipo medicamento = new Tipo("Medicamento");
        Laboratorio lab1 = new Laboratorio("Remediar");
        Laboratorio lab2 = new Laboratorio("DrograsPlus");

        //Tipo tipo, String descripcion, Laboratorio laboratorio, String codigo, double precio
        Producto producto01 = new Producto(new Tipo("Perfumeria"),"perfume barato", lab1, "001",50.5 );
        Producto producto02 = new Producto(new Tipo("Perfumeria"),"Pinta Labios", lab2, "002",120.9 );
        Producto producto03 = new Producto(new Tipo("Perfumeria"),"perfume caro", lab1, "003",4000 );
        Producto producto04 = new Producto(new Tipo("Medicamento"),"Insulina", lab2, "004",100 );
        Producto producto05 = new Producto(new Tipo("Medicamento"),"Alplac", lab1, "005",150 );
        Producto producto06 = new Producto(new Tipo("Medicamento"),"Aspirina", lab2, "006",500 );
        Producto producto07 = new Producto(new Tipo("Medicamento"),"Bilirubina", lab1, "007",780 );
        Producto producto08 = new Producto(new Tipo("Medicamento"),"Vitamina D", lab2, "008",1520 );
        Producto producto09 = new Producto(new Tipo("Medicamento"),"Ketorolac", lab1, "009",784 );
        Producto producto10 = new Producto(new Tipo("Medicamento"),"Ketamina", lab2, "010",4521 );

        List<Producto> catalogo = new ArrayList<Producto>();
        catalogo.add(producto01);
        catalogo.add(producto02);
        catalogo.add(producto03);
        catalogo.add(producto04);
        catalogo.add(producto05);
        catalogo.add(producto06);
        catalogo.add(producto07);
        catalogo.add(producto08);
        catalogo.add(producto09);
        catalogo.add(producto10);


        Metodos m = new Metodos();

        Domicilio dom1 = new Domicilio("Callao",500,"Lanus", "Buenos Aires");
        Domicilio dom2 = new Domicilio("Santa Fe",600,"Banfield", "Buenos Aires");
        Domicilio dom3 = new Domicilio("Alsina",510,"CABA", "Buenos Aires");
        Domicilio dom4 = new Domicilio("Maipu",785,"Burzaco", "Buenos Aires");
        Domicilio dom5 = new Domicilio("Capello",150,"Lanus", "Buenos Aires");
        Domicilio dom6 = new Domicilio("San Martin",462,"CABA", "Buenos Aires");
        Domicilio dom7 = new Domicilio("Santa Fe",782,"Quilmes", "Buenos Aires");
        Domicilio dom8 = new Domicilio("Callao",98,"Quilmes", "Buenos Aires");
        Domicilio dom9 = new Domicilio("Belgrano",493,"Lanus", "Buenos Aires");
        Domicilio dom10 = new Domicilio("Pueyrredon",782,"Burzaco", "Buenos Aires");
        Domicilio dom11 = new Domicilio("2 de Abril",163,"CABA", "Buenos Aires");
        Domicilio dom12 = new Domicilio("Cordoba",896,"Quilmes", "Buenos Aires");
        Domicilio dom13 = new Domicilio("Meeks",421,"Quilmes", "Buenos Aires");
        Domicilio dom14 = new Domicilio("Viamonte",10,"CABA", "Buenos Aires");
        Domicilio dom15 = new Domicilio("Oliden",7,"Lanus", "Buenos Aires");
        Domicilio dom16 = new Domicilio("Rincon",452,"San Vicente", "Buenos Aires");
        Domicilio dom18 = new Domicilio("Berlin",1005,"Lobos", "Buenos Aires");
        Domicilio dom19 = new Domicilio("Colombia",785,"Campana", "Buenos Aires");
        Domicilio dom20 = new Domicilio("Estados Unidos",638,"Avellaneda", "Buenos Aires");
        Domicilio dom21 = new Domicilio("Sarmiento",333,"Turdera", "Buenos Aires");
        Domicilio dom22 = new Domicilio("25 de Mayo",555,"Banfield", "Buenos Aires");
        Domicilio dom23 = new Domicilio("Colombres",777,"Burzaco", "Buenos Aires");
        Domicilio dom24 = new Domicilio("Cochabamba",999,"CABA", "Buenos Aires");


        ObraSocial obra1 = new ObraSocial("OSDE",100);
        ObraSocial obra2 = new ObraSocial("OSDE",101);
        ObraSocial obra3 = new ObraSocial("PAMI",102);
        ObraSocial obra4 = new ObraSocial("PAMI",103);
        ObraSocial obra5 = new ObraSocial("OSDE",104);
        ObraSocial obra6 = new ObraSocial("PAMI",105);
        ObraSocial obra7 = new ObraSocial("OSDE",106);
        ObraSocial obra8 = new ObraSocial("PAMI",107);
        ObraSocial obra9 = new ObraSocial("OSDE",108);
        ObraSocial obra10 = new ObraSocial("OSECAC",209);
        ObraSocial obra11 = new ObraSocial("OSECAC",310);
        ObraSocial obra12 = new ObraSocial("OSECAC",411);
        ObraSocial obra13 = new ObraSocial("OSECAC",512);
        ObraSocial obra14 = new ObraSocial("OSECAC",613);
        ObraSocial obra15 = new ObraSocial("OSECAC",714);
        ObraSocial obra16 = new ObraSocial("OSECAC",815);
        ObraSocial obra17 = new ObraSocial("OSECAC",916);
        ObraSocial obra18 = new ObraSocial("OSECAC",5617);
        ObraSocial obra19 = new ObraSocial("OSECAC",1618);
        ObraSocial obra20 = new ObraSocial("OSECAC",1519);


        Persona per1 = new Persona("Robertson","Matias",111,"Cliente",dom1,obra1);
        Persona per2 = new Persona("Franklin","Eduardo",222,"Cliente",dom2,obra2);
        Persona per3 = new Persona("Pattinson","Jorge",333,"Cliente",dom3,null);
        Persona per4 = new Persona("Arlan","Nicolas",444,"Cliente",dom4,obra4);
        Persona per5 = new Persona("Perez","Ruben",115551,"Cliente",dom5,obra5);
        Persona per6 = new Persona("Jackson","Franco",4434,"Cliente",dom6,null);
        Persona per7 = new Persona("Smith","Perez",1564611,"Cliente",dom7,obra7);
        Persona per8 = new Persona("Black","Monica",16761,"Cliente",dom8,null);
        Persona per9 = new Persona("Muller","Laura",117871,"Cliente",dom9,obra9);
        Persona per10 = new Persona("Klein","Isabel",112411,"Cliente",dom10,obra10);
        Persona per11 = new Persona("Baker","Sergio",11451,"Empleado",dom11,obra11);
        Persona per12 = new Persona("Coppola","Jose",176311,"Empleado",dom12,obra12);
        Persona per13 = new Persona("DeNiro","Pedro",86765,"Empleado",dom13,obra13);
        Persona per14 = new Persona("Nieves","Maria",3452,"Empleado",dom14,obra14);
        Persona per15 = new Persona("Cid","Gandalf",112341,"Empleado",dom15,obra15);
        Persona per16 = new Persona("Hamm","Voromir",134111,"Empleado",dom16,obra16);
        Persona per17 = new Persona("Grills","Frodo",114671,"Empleado",dom18,obra17);
        Persona per18 = new Persona("Targaryen","Daenerys",118641,"Empleado",dom19,obra18);
        Persona per19 = new Persona("Snow","Jon",1234511,"Empleado",dom20,obra19);
        Persona per20 = new Persona("Bond","Francis",6785,"Empleado",dom21,obra20);

        List<Persona> clientes = new ArrayList<Persona>();
        clientes.add(per1);
        clientes.add(per2);
        clientes.add(per3);
        clientes.add(per4);
        clientes.add(per5);
        clientes.add(per6);
        clientes.add(per7);
        clientes.add(per8);
        clientes.add(per9);
        clientes.add(per10);

        List<Persona> empleados1 = new ArrayList<Persona>();
        empleados1.add(per11);
        empleados1.add(per12);
        empleados1.add(per13);
        empleados1.add(per14);
        List<Persona> empleados2 = new ArrayList<Persona>();
        empleados1.add(per15);
        empleados1.add(per16);
        empleados1.add(per17);
        List<Persona> empleados3 = new ArrayList<Persona>();
        empleados1.add(per18);
        empleados1.add(per19);
        empleados1.add(per20);


        Sucursal sucursal1 = new Sucursal(dom22,empleados1,per11,101);
        Sucursal sucursal2 = new Sucursal(dom23,empleados2,per15,102);
        Sucursal sucursal3 = new Sucursal(dom24,empleados3,per18,103);


        //****Generacion Lista de Ventas
        //40 ventas para sucursal1
        //30 ventas para sucursal2
        //20 ventas para sucursal3
        List<Venta> ventas = new ArrayList<Venta>();
        for(int i = 0; i < 40; i++){
            Venta venta = m.generarVentaRandom(clientes,catalogo,sucursal1);
            String nroTicket = venta.getNroTicket() + (i+1);
            venta.setNroTicket(nroTicket);
            ventas.add(venta);
        }
        for(int i = 40; i < 70; i++){
            Venta venta = m.generarVentaRandom(clientes,catalogo,sucursal1);
            String nroTicket = venta.getNroTicket() + (i+1);
            venta.setNroTicket(nroTicket);
            ventas.add(venta);
        }for(int i = 70; i < 90; i++){
        Venta venta = m.generarVentaRandom(clientes,catalogo,sucursal1);
        String nroTicket = venta.getNroTicket() + (i+1);
        venta.setNroTicket(nroTicket);
        ventas.add(venta);
    }




        //Parseo a json
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonString = gson.toJson(ventas);

        System.out.println(jsonString);










    }
}
