package Unid2Code4;

public class Unid2Code4 {

    public static void main(String[] args) {
        //Pode ser feito assim.... mais burocrático
        PersonalidadeObj personalidade      	= new PersonalidadeObj();
        PersonalidadePessimista pessimista  	= new PersonalidadePessimista();
        PersonalidadeOtimista otimista      	= new PersonalidadeOtimista();
        PersonalidadeIntrovertido introvertido  = new PersonalidadeIntrovertido();
        PersonalidadeExtrovertido extrovertido  = new PersonalidadeExtrovertido();
        System.out.println("=============[ Forma 1 ]");
        System.out.println("PersonalidadeObj Falando: " + personalidade.falar());
        System.out.println("Pessimista Falando: "   	+ pessimista.falar());
        System.out.println("Otimista Falando: "     	+ otimista.falar());
        System.out.println("Introvertido Falando: " 	+ introvertido.falar());
        System.out.println("Extrovertido Falando: " 	+ extrovertido.falar());


        //Mas podemos substituir assim... bem mais elegante
        PersonalidadeObj [] personalidades = new PersonalidadeObj[5];

        personalidades[0] = personalidade;
        personalidades[1] = pessimista;
        personalidades[2] = otimista;
        personalidades[3] = introvertido;
        personalidades[4] = extrovertido;

        //gerando  distúrbio de personalidade em OO :)
        System.out.println("=============[ Forma 2 ]");
        System.out.println("PersonalidadeObj Falando: " + personalidades[0].falar());
        System.out.println("PersonalidadeObj Falando: " + personalidades[1].falar());
        System.out.println("PersonalidadeObj Falando: " + personalidades[2].falar());
        System.out.println("PersonalidadeObj Falando: " + personalidades[3].falar());
        System.out.println("PersonalidadeObj Falando: " + personalidades[4].falar());
    }
}