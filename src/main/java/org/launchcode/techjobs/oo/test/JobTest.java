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
        assertEquals(employer, testJob.getEmployer());
        assertEquals(location, testJob.getLocation());
        assertEquals(positionType, testJob.getPositionType());
        assertEquals(coreCompetency, testJob.getCoreCompetency());

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
}
