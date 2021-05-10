package com.dev.kleber.github

import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test
import java.lang.UnsupportedOperationException

class SearchRepoUseCaseTest {

    object teste

    @Test
    fun testeSoma(){

        val result = soma(2,3)
        var aux = teste
        assertEquals(5,result)
        assertTrue(5 == result)
        assertNotNull(result)
        assertFalse(result != 5)
        assertSame(teste, aux)
        assertNotSame(teste,result)
    }

    fun soma(valor1 : Int, valor2 : Int) : Int {

        if (valor1 < 0 || valor2 < 0)
            throw  NotImplementedError()

        return valor1 + valor2
    }

    @Test(expected = UnsupportedOperationException::class)
    fun testException(){
        soma(-1, -1)
    }
}