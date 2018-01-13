package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.ContactApp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
/**
 * Test class for the Nif REST controller.
 *
 * @see NifResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ContactApp.class)
public class NifResourceIntTest {

    private MockMvc restMockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        NifResource nifResource = new NifResource();
        restMockMvc = MockMvcBuilders
            .standaloneSetup(nifResource)
            .build();
    }

    /**
    * Test getNif
    */
    @Test
    public void testGetNif() throws Exception {
        restMockMvc.perform(get("/api/nif/get-nif"))
            .andExpect(status().isOk());
    }

}
