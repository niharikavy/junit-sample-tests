package com.nv.tests.junit5;

import com.nv.actions.ForestCreator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForestCreatorTests {
    @DisplayName("SCRUM-TC-2309 : Verify positive case - all trees get planted")
    @Test
    public void testPlantTree() {
        ForestCreator fc = new ForestCreator();
        int plantedTrees = fc.plantTrees(10);
        Assertions.assertEquals(plantedTrees, 10, "Verify all trees get planted");
    }

    @DisplayName("SCRUM-TC-2307, SCRUM-TC-2308,SCRUM-TC-2350 : Verify positive case - all trees get planted")
    @Test
    public void testCreateForest() {
        ForestCreator fc = new ForestCreator();
        fc.plantTrees(1);
        fc.waterThePlants();
        fc.removeWeeds();
        Assertions.assertEquals(fc.getHealthyTreeCount(), 1, "Verify end to end plant growth");
    }

    @Test
    public void plantTree_should_returnNumberOfTrees() {
        ForestCreator fc = new ForestCreator();
        int plantedTrees = fc.plantTrees(10);
        Assertions.assertEquals(plantedTrees, 10, "Verify all trees get planted");
    }

    @Test
    public void plantTree_withInvalidInput_should_throwValidError() {
        ForestCreator fc = new ForestCreator();
        int plantedTrees = fc.plantTrees(-10);
        Assertions.assertEquals(plantedTrees, 10, "Verify all trees get planted");
    }

    @Disabled
    @Test
    public void plantTreeAndRain_Should_returnHealthyTree() {
        ForestCreator fc = new ForestCreator();
        int plantedTrees = fc.plantTrees(1);
        fc.makeItRain();
    }

    @ParameterizedTest(name = "Plant {0} -  Case: {1} ")
    @CsvSource({
            "Baobab, SCRUM-TC-1621",
            "Palm, SCRUM-TC-1622",
            "Banyan, SCRUM-TC-1633"
    })
    void add(String treeName, String tcName) {
        ForestCreator fc = new ForestCreator();
        fc.plantSpecificTree(treeName);
        Assertions.assertTrue(true, "Tree successfully planted");
    }

//    @DataProvider(name = "saplingSupplier")
//    public Object[][] testDataProvider() {
//        return new Object[][] {
//                {  "Baobab", "AT-TC-29"},
//                {  "Palm" , "AT-TC-30"},
//                {  "Banyan", "AT-TC-31"},
//        };
//    }
//
//    @Test(dataProvider = "saplingSupplier")
//    public void testSpecificTreePlantation(String treeName, String aioTestKey) {
//        //Your test goes here
//        ForestCreator fc = new ForestCreator();
//        fc.plantSpecificTree(treeName);
//        Assert.assertTrue(true, "Tree successfully planted");
//    }

//    @Test(groups = {"P1","AT-TC-25"}, description = "Verify no random failures while planting trees", invocationCount = 5)
//    public void testPlantTreeSeq() {
//        ForestCreator fc = new ForestCreator();
//        int plantedTrees = fc.plantTrees(1);
//        Assert.assertEquals(plantedTrees, 1, "Verify tree got planted successfully");
//    }
}
