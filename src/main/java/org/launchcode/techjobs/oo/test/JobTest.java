package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job testJobOne = new Job();
        Job testJobTwo = new Job();
        assertNotEquals(testJobOne, testJobTwo);
}

    @Test
    public void testJobConstructorSetsAllFields() {

        String name = "Product tester";
        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType positionType = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");

        Job testJob = new Job(name, employer, location, positionType, coreCompetency);

        assertEquals(name, testJob.getName());
        assertEquals(employer.toString(), testJob.getEmployer().toString());
        assertEquals(location.toString(), testJob.getLocation().toString());
        assertEquals(positionType.toString(), testJob.getPositionType().toString());
        assertEquals(coreCompetency.toString(), testJob.getCoreCompetency().toString());

        assertTrue(testJob instanceof Job);
        assertTrue(employer instanceof Employer);
        assertTrue(location instanceof Location);
        assertTrue(positionType instanceof PositionType);
        assertTrue(coreCompetency instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {

        String name = "Product tester";
        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType positionType = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");

        Job testJobOne = new Job(name, employer, location, positionType, coreCompetency);
        Job testJobTwo = new Job(name, employer, location, positionType, coreCompetency);

        assertFalse(testJobOne.equals(testJobTwo));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {

        String name = "Product tester";
        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType positionType = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");

        Job testJobThree = new Job(name, employer, location, positionType, coreCompetency);

        assertEquals('\n', testJobThree.toString().charAt(0));
        assertEquals('\n', testJobThree.toString().charAt(testJobThree.toString().length()-1));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        String name = "Product tester";
        Employer employer = new Employer("ACME");
        Location location = new Location("Desert");
        PositionType positionType = new PositionType("Quality control");
        CoreCompetency coreCompetency = new CoreCompetency("Persistence");

        Job testJobFour = new Job(name, employer, location, positionType, coreCompetency);

        assertEquals("\nID: " + testJobFour.getId() +
                            "\nName: " + name +
                            "\nEmployer: " + employer +
                            "\nLocation: " + location +
                            "\nPosition Type: " + positionType +
                            "\nCore Competency: " + coreCompetency +
                            '\n', testJobFour.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {

        String name = "Product Tester";
        Employer employer = new Employer("");
        Location location = new Location("");
        PositionType positionType = new PositionType("");
        CoreCompetency coreCompetency = new CoreCompetency("");

        Job testJobFive = new Job(name, employer, location, positionType, coreCompetency);

        assertEquals("\nID: " + testJobFive.getId() +
                             "\nName: " + testJobFive.getName() +
                             "\nEmployer: Data not available" +
                             "\nLocation: Data not available" +
                             "\nPosition Type: Data not available" +
                             "\nCore Competency: Data not available" +
                             '\n', testJobFive.toString());
    }
}
