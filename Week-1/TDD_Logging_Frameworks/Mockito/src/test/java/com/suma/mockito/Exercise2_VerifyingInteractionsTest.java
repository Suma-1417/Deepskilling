package com.suma.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class Exercise2_VerifyingInteractionsTest {

    @Test
    void testVerifyInteraction() {

        Dependency mockDep = mock(Dependency.class);

        when(mockDep.getData()).thenReturn("MockedData");

        MyService service = new MyService(mockDep);

        assertEquals("Processed: MockedData", service.process());

        verify(mockDep).getData();
    }
}
