package com.suma.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class Exercise1_MockingAndStubbingTest {

    @Test
    void testProcess() {

        Dependency mockDep = mock(Dependency.class);

        when(mockDep.getData()).thenReturn("MockedData");

        MyService service = new MyService(mockDep);

        assertEquals("Processed: MockedData", service.process());
    }
}
