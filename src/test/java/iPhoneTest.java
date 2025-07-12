package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class iPhoneTest {

    private iPhone iphone;

    @BeforeEach
    void setUp() {
        iphone = new iPhone();
    }

    @Test
    void testTocar() {
        // Você pode apenas garantir que não lança exceções
        assertDoesNotThrow(() -> iphone.tocar());
    }

    @Test
    void testSelecionarMusica() {
        assertDoesNotThrow(() -> iphone.selecionarMusica("Imagine - John Lennon"));
    }

    @Test
    void testLigar() {
        assertDoesNotThrow(() -> iphone.ligar("41-99999-8888"));
    }

    @Test
    void testExibirPagina() {
        assertDoesNotThrow(() -> iphone.exibirPagina("https://www.exemplo.com"));
    }

    @Test
    void testAtualizarPagina() {
        assertDoesNotThrow(() -> iphone.atualizarPagina());
    }

    @Test
    void testAdicionarNovaAba() {
        assertDoesNotThrow(() -> iphone.adicionarNovaAba());
    }
}
