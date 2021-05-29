package org.launchcode.techjobs_oo.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public
    void testSettingJobId(){
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testJob2.getId(),testJob1.getId());

     }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", testJob3.getName());
        assertEquals( "ACME", testJob3.getEmployer().getValue());
        assertEquals("Desert", testJob3.getLocation().getValue());
        assertEquals("Quality control", testJob3.getPositionType().getValue());
        assertEquals("Persistence", testJob3.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality(){
        Job testJob4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(testJob4, testJob5);

    }

    @Test
    public void testJobStringFormat(){
        Job testJob6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String[] testJobArr = testJob6.toString().split("\n");
        assertEquals("", testJobArr[0]);
        assertEquals("ID: 6", testJobArr[1]);
        assertEquals("Name: Product tester", testJobArr[2]);
        assertEquals("Employer: ACME", testJobArr[3]);
        assertEquals("Location: Desert", testJobArr[4]);
        assertEquals("Position Type: Quality control", testJobArr[5]);
        assertEquals("Core Competency: Persistence", testJobArr[6]);
    }
}
