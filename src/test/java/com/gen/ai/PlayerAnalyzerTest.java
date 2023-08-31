package com.gen.ai;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayerAnalyzerTest {

    @Test
    void testCalculateScore_SinglePlayer() {
        // Arrange
        Player player = new Player();
        player.setAge(25);
        player.setExperience(5);
        player.setSkills(Arrays.asList(2, 2, 2));

        List<Player> players = List.of(player);

        PlayerAnalyzer playerUtil = new PlayerAnalyzer();

        // Act
        double score = playerUtil.calculateScore(players);

        // Assert
        assertEquals(250, score);
    }

    @Test
    void testCalculateScore_SinglePlayer_Age15() {
        // Arrange
        Player player = new Player();
        player.setAge(15);
        player.setExperience(3);
        player.setSkills(Arrays.asList(3, 3, 3));

        List<Player> players = Arrays.asList(player);

        PlayerAnalyzer playerAnalyzer = new PlayerAnalyzer();

        // Act
        double score = playerAnalyzer.calculateScore(players);

        // Assert
        assertEquals(67.5, score);
    }

    @Test
    void testCalculateScore_SinglePlayer_Age35() {
        // Arrange
        Player player = new Player();
        player.setAge(35);
        player.setExperience(15);
        player.setSkills(Arrays.asList(4, 4, 4));

        List<Player> players = Arrays.asList(player);

        PlayerAnalyzer playerAnalyzer = new PlayerAnalyzer();

        // Act
        double score = playerAnalyzer.calculateScore(players);

        // Assert
        assertEquals(2520, score);
    }

    @Test
    void testCalculateScore_MultiplePlayers() {
        // Arrange
        Player player1 = new Player();
        player1.setAge(25);
        player1.setExperience(5);
        player1.setSkills(Arrays.asList(2, 2, 2));

        Player player2 = new Player();
        player2.setAge(15);
        player2.setExperience(3);
        player2.setSkills(Arrays.asList(3, 3, 3));

        Player player3 = new Player();
        player3.setAge(35);
        player3.setExperience(15);
        player3.setSkills(Arrays.asList(4, 4, 4));

        List<Player> players = Arrays.asList(player1, player2, player3);

        PlayerAnalyzer playerAnalyzer = new PlayerAnalyzer();

        // Act
        double score = playerAnalyzer.calculateScore(players);

        // Assert
        assertEquals(250 + 67.5 + 2520, score);
    }

    @Test
    void testCalculateScore_NullSkills_ShouldThrowError() {
        // Arrange
        Player player = new Player();
        player.setAge(25);
        player.setExperience(5);
        player.setSkills(null); // Skills set to null

        List<Player> players = Arrays.asList(player);

        PlayerAnalyzer playerAnalyzer = new PlayerAnalyzer();

        // Act & Assert
        assertThrows(NullPointerException.class, () -> playerAnalyzer.calculateScore(players));
    }

    @Test
    void testCalculateScore_EmptyArray_ShouldReturnZero() {
        // Arrange
        List<Player> players = Collections.emptyList();

        PlayerAnalyzer playerAnalyzer = new PlayerAnalyzer();

        // Act
        double score = playerAnalyzer.calculateScore(players);

        // Assert
        assertEquals(0, score);
    }


}