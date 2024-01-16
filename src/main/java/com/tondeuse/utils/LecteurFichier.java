package com.tondeuse.utils;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LecteurFichier {

    public static List<String> lireFichier(String chemin) {

        try (Stream<String> lignes = java.nio.file.Files.lines(Paths.get(chemin))) {
            return  lignes.collect(Collectors.toList());
        } catch (IOException ex) {
            throw new Error(ex);
        }
    }
}
