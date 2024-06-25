package org.example;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleTest {

    private Example example;

    @BeforeEach
    public void init(){
        this.example = new Example();
    }

    @Test
    public void testSumar(){
        //Given
        int numberA = 3;
        int numberB = 3;

        //When
        int result = example.sumar(numberA,numberB);

        //Then
        assertEquals(6, result);
        assertNotNull(result);
        assertInstanceOf(Integer.class, result);
    }

    @Test
    public void testCheckPositivo(){
        //Given
        int number = 4;
        //When
        boolean result = example.checkPositivo(number);
        //Then
        assertTrue(result);
    }

    @Test
    public void testCheckPositivoError(){
        //Given
        int number = -1;
        //Then
        assertThrows(IllegalArgumentException.class, () -> {
            example.checkPositivo(number);
        });

    }

    @Test
    public void testContarLetrasA(){
        //Given
        String cadena = "unprogramadornace";

        //When
        int result = example.contarLetrasA(cadena);

        //Then
        assertNotNull(result);
        assertEquals(3, result);
    }

    @Test
    public void testContieneElemento(){
        // Given
        List<String> paises = List.of("Colombia", "Mexico", "Peru");
        String pais = "Colombia";

        // When
        boolean result = example.contieneElemento(paises, pais);

        // Then
        assertTrue(result);
    }

    @Test
    public void testRevertirCadena(){
        // Given
        String cadena = "arbusto";

        // When
        String result = example.revertirCadena(cadena);

        // Then
        assertEquals("otsubra", result);
    }

    @Test
    public void testFactorial(){
        //Given
        int numero = 2;
        //When
        long resultado = example.factorial(numero);
        //Then
        assertEquals(2,resultado);
    }
    @Test
    public void testFactorialError(){
        //Given
        int numero = -1;

        //Then
        assertThrows(IllegalArgumentException.class, () -> {
            example.factorial(numero);
        });
    }

    @Test
    public void testEsPrimoMenorOIgualA1(){
        //Given
        int numero = 1;

        //When
        boolean resultado = example.esPrimo(numero);

        //Then
        assertFalse(resultado);
    }

    @Test
    public void testNoEsPrimo(){
        //Given
        int numero = 4;

        //When
        boolean resultado = example.esPrimo(numero);

        //Then
        assertFalse(resultado);
    }

    @Test
    public void testEsPrimo(){
        //Given
        int numero = 3;

        //When
        boolean resultado = example.esPrimo(numero);

        //Then
        assertTrue(resultado);
    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        //Given

        //When
        String result = this.example.mensajeConRetraso();
        //Then
        assertEquals("Listo después de retraso", result);
    }

    @Test
    public void testConvertirAString(){
        //Given
        List<Integer> numeros = List.of(1, 6, 68);

        //When
        List<String> numerosStr = this.example.convertirAString(numeros);

        //Then
        assertEquals(List.of("1", "6", "68"),numerosStr);
    }

    @Test
    public void testCalcularMediaLista(){
        //Given
        List<Integer>numeros = List.of(1,2,3);//Lista vacia

        //When
        double resultado = this.example.calcularMedia(numeros);

        //Then
        assertEquals(2,resultado);
    }

    @Test
    public void testCalcularMediaListaVacia(){
        //Given
        List<Integer>numeros = Collections.emptyList();//Lista vacia

        //Then
        assertThrows(IllegalArgumentException.class, () -> {
            example.calcularMedia(numeros);
        });
    }

    @Test
    public void testCalcularMediaListaNull(){
        //Given
        List<Integer>numeros = null;//Lista vacia

        //Then
        assertThrows(IllegalArgumentException.class, () -> {
            example.calcularMedia(numeros);
        });
    }

    @Test
    public void testConvertirListaAString(){
        List<String> texto = Arrays.asList("hola", "mundo", "java");
        String resultado = example.convertirListaAString(texto);

        assertEquals("HOLA,MUNDO,JAVA", resultado);
    }

}
