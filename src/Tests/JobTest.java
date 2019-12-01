package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {
    @Test
    public void testSettingJobId() {
        Job test_job_id = new Job();
        Job test_job_id1 = new Job();
        assertEquals(test_job_id.getId(), test_job_id1.getId(), 1);
    }


    @Before
    public void createJobObject() {

        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job1 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));

        assertTrue(new Employer("LaunchCode") instanceof Employer);
        assertTrue(new Location("St. Louis") instanceof Location);
        assertTrue(new PositionType("Front-end developer") instanceof PositionType);
        assertTrue(new CoreCompetency("JavaScript") instanceof CoreCompetency);


        //test equals method//

        assertEquals(2, test_job1.getId());
        assertEquals("Web Developer", test_job1.getName());
        String employer = test_job1.getEmployer().getValue();
        assertEquals("LaunchCode", employer);
        String location = test_job1.getLocation().getValue();
        assertEquals("St. Louis", location);
        String positionType = test_job1.getPositionType().getValue();
        assertEquals("Front-end developer", positionType);
        String coreCompetency = test_job1.getCoreCompetency().getValue();
        assertEquals("JavaScript", coreCompetency);

    }

    @Test
    public void testJobsForEquality() {
        Job test_job2 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
        Job test_job3 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));

        assertFalse(test_job2.equals(test_job3));

    }

    @Test
    public void toStringTest() {
        Job test_job1 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
        test_job1.toString().contains("\n");
    }
        @Test
        public void toStringTestTwo(){
            Job test_job1 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
            test_job1.toString().contains("id: " + "\n");
            test_job1.toString().contains("name: " + "\n");
            test_job1.toString().contains("employer: " + "\n");
            test_job1.toString().contains("location: " + "\n");
            test_job1.toString().contains("positionType: " + "\n");
            test_job1.toString().contains("coreCompetency: " + "\n");
        }
        @Test
    public void toStringTestThree(){
            Job test_job1 = new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
            test_job1.toString().contains("Data not available");
        }

    }
