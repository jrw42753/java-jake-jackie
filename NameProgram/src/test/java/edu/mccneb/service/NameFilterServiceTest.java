package edu.mccneb.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class NameFilterServiceTest {

    private List<String> listOfNames = List.of("Albanus", "Eutherius", "Sophoclidisca",
            "Decius", "Labrax", "Apellinus", "Sangarinus", "Synistor", "Sceledrus", "Saunio",
            "Baebio", "Osterius", "Citrio", "Sidonius", "Misargyrides", "Cogitatus", "Coquus",
            "Quietus", "Leonida", "Ianuarius");

    @Test
    public void getNamesXLong_getNamesXLongWorks () {
        List<String> actualNames = NameFilterService.getNamesXLong(listOfNames, 12);
        List<String> expectedNames = List.of("Sophoclidisca","Misargyrides");
        Assertions.assertIterableEquals(expectedNames, actualNames);
    }



}
