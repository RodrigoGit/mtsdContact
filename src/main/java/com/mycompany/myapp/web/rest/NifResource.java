package com.mycompany.myapp.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.*;
import java.io.*;
import java.util.List;
import java.util.Optional;

/**
 * Nif controller
 */
@RestController
@RequestMapping("/api/nif")
public class NifResource {

    private final Logger log = LoggerFactory.getLogger(NifResource.class);


    /**
     * GET getNif
     */
    @GetMapping("/get-nif/{nif}")
    public String getNif(@PathVariable String nif) {
        String resultado = "";
        boolean resposta = false;
        int key = 0;
        String[] arrayKeys = {
            "c0a3579bed5b43bc86ac5a348914d175", "7852206e0ef4496f7c0d3785e065f1fa", "04a98a6484b51d52c710184c14a04feb", "d2b32855bad2cbce9010bf80acccac6f", "7884038aa6fb7e238ab20ca3721d9558", "b9b7d2bc48589cbac7effc80ac9c00bc", "6cf8fae0b4c7a5de55432e50d4d3e6ea", "5508f74588a775298e71a2aea5c848d7", "cb5b22feaae4cc5f8bd5b9e586486a79", "6ded560599311922877b1f87efa6a8d3", "15d550e674b8e10a6bfacd7333ac0f43", "8d7f2f0031dcac49aa9489f3e66ad254", "15bf4e4be14891f9e5f63204c85685fd", "bb313b99df401dbfaf9b7d5271a08cbd", "9b2049dfd1a973f1c804c2c188b5269c"
        };

        while (resposta == false && key < 15) {
            resultado = "";
            try {
                URL obj = new URL("http://www.nif.pt/?json=1&q=" + nif + "&key=" + arrayKeys[key]);

                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                // optional default is GET
                con.setRequestMethod("GET");
                //add request header
                //get data from nif api
                //return result to gateway view
                //save data
                int responseCode = con.getResponseCode();
                log.debug("\nSending 'GET' request to URL : http://www.nif.pt/?json=1&q=509442013");
                log.debug("Response Code : " + responseCode);
                BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();


                log.debug(response.toString());
                resultado = response.toString();
            } catch (Exception e) {
                log.debug("erro");
            }
            if (!resultado.contains("Key necessary") && !resultado.contains("Limit per minute reached")) {
                resposta = true;
            }

            key++;
        }
        return resultado;
    }


}
