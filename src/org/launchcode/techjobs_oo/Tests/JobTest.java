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
        Assert.assertFalse(testJob2.getId() ==testJob1.getId());

    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(testJob.getName(),  "Product tester");
        assertEquals(testJob.getEmployer().getValue(), "ACME");
        assertEquals(testJob.getLocation().getValue(), "Desert");
        assertEquals(testJob.getPositionType().getValue(), "Quality control");
        assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");

    }

    @Test
    public void testJobsForEquality(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob1.equals(testJob2));
    }

    @Test
    public void testJobStringFormat(){
        Job testJob = new Job("Product tester", new Employer(), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String[] testJobArr = testJob.toString().split("\n");
        assertEquals(testJobArr[0], "");
        assertEquals(testJobArr[1], "ID: 1");
        assertEquals(testJobArr[2], "Name: Product tester");
        assertEquals(testJobArr[3], "Employer: Data not available");
        assertEquals(testJobArr[4], "Location: Desert");
        assertEquals(testJobArr[5], "Position Type: Quality control");
        assertEquals(testJobArr[6], "Core Competency: Persistence");


    }
}
