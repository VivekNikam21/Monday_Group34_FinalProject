/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.AdminDirectory;
import model.AdminProfile;
import model.Business;
import model.ClinicManagement.NurseDirectory;
import model.ClinicManagement.NurseProfile;
import model.ClinicManagement.Patient;
import model.ClinicManagement.PatientManagement;
import model.ClinicManagement.Therapist;
import model.ClinicManagement.TherapistDirectory;
import model.ClinicManagement.TherapistProfile;
import model.InnovationManagement.Innovation;
import model.InnovationManagement.InnovationManagement;
import model.InnovationManagement.Research;
import model.InnovationManagement.ResearchManagement;
import model.InnovationManagement.Researcher;
import model.InnovationManagement.ResearcherDirectory;
import model.InnovationManagement.ResearcherProfile;
import model.InnovationManagement.Specialist;
import model.InnovationManagement.SpecialistDirectory;
import model.InnovationManagement.SpecialistProfile;
import model.InsuranceManagement.Agent;
import model.InsuranceManagement.AgentDirectory;
import model.InsuranceManagement.AgentProfile;
import model.InsuranceManagement.Claim;
import model.InsuranceManagement.ClaimManagement;
import model.InsuranceManagement.Client;
import model.InsuranceManagement.ClientManagement;
import model.InsuranceManagement.Doc;
import model.InsuranceManagement.DocManagement;
import model.InsuranceManagement.Policy;
import model.InsuranceManagement.PolicyManagement;
import model.InsuranceManagement.Processor;
import model.InsuranceManagement.ProcessorDirectory;
import model.InsuranceManagement.ProcessorProfile;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.PreHealthcareManagement.Coach;
import model.PreHealthcareManagement.CoachDirectory;
import model.PreHealthcareManagement.CoachProfile;
import model.PreHealthcareManagement.Educator;
import model.PreHealthcareManagement.EducatorDirectory;
import model.PreHealthcareManagement.EducatorProfile;
import model.PreHealthcareManagement.Meal;
import model.PreHealthcareManagement.MealManagement;
import model.PreHealthcareManagement.Nutritionist;
import model.PreHealthcareManagement.NutritionistDirectory;
import model.PreHealthcareManagement.NutritionistProfile;
import model.PreHealthcareManagement.People;
import model.PreHealthcareManagement.PeopleManagement;
import model.PreHealthcareManagement.Program;
import model.PreHealthcareManagement.ProgramManagement;
import model.PreHealthcareManagement.Resource;
import model.PreHealthcareManagement.ResourceManagement;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author nikam
 */
public class ConfigureABusiness {
    static Business initialize() {
        Business business = new Business("Service");
        PersonDirectory persondirectory = business.getPersonDirectory();
// creating person in sales org 
        Person nurseperson001 = persondirectory.newPerson("P1");
        Person therapistperson001 = persondirectory.newPerson("P1");
        Person researcherperson001 = persondirectory.newPerson("P1");
        Person specialistperson001 = persondirectory.newPerson("P1");
        Person agentperson001 = persondirectory.newPerson("P1");
        Person processorperson001 = persondirectory.newPerson("P1");
        Person coachperson001 = persondirectory.newPerson("P1");
        Person educatorperson001 = persondirectory.newPerson("P1");
        Person nutritionistperson001 = persondirectory.newPerson("P1");
         Person admin001 = persondirectory.newPerson("P1");
        
        NurseDirectory nursedirectory = business.getNurseDirectory();
        NurseProfile nurseprofile = nursedirectory.addNurseProfile(nurseperson001);
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount ua1 = uadirectory.newUserAccount(nurseprofile, "nurse", "n123");
        
        TherapistDirectory therapistdirectory = business.getTherapistDirectory();
        TherapistProfile therapistprofile = therapistdirectory.addTherapistProfile(therapistperson001);
        UserAccount ua2 = uadirectory.newUserAccount(therapistprofile, "therapist", "t123");
        
        ResearcherDirectory researcherdirectory = business.getResearcherDirectory();
        ResearcherProfile researcherprofile = researcherdirectory.addResearcherProfile(researcherperson001);
        UserAccount ua3 = uadirectory.newUserAccount(researcherprofile, "researcher", "r123");
        
       SpecialistDirectory specialistdirectory = business.getSpecialistDirectory();
        SpecialistProfile specialistprofile = specialistdirectory.addSpecialistProfile(specialistperson001);
        UserAccount ua4 = uadirectory.newUserAccount(specialistprofile, "specialist", "s123");
        
         AgentDirectory agentdirectory = business.getAgentDirectory();
        AgentProfile agentprofile = agentdirectory.addAgentProfile(agentperson001);
        UserAccount ua5 = uadirectory.newUserAccount(agentprofile, "agent", "a123");
        
        ProcessorDirectory processordirectory = business.getProcessorDirectory();
        ProcessorProfile processorprofile = processordirectory.addProcessorProfile(processorperson001);
        UserAccount ua6 = uadirectory.newUserAccount(processorprofile, "processor", "p123");
        
        CoachDirectory coachdirectory = business.getCoachDirectory();
        CoachProfile coachprofile = coachdirectory.addCoachProfile(coachperson001);
        UserAccount ua7 = uadirectory.newUserAccount(coachprofile, "coach", "c123");
        
        EducatorDirectory educatordirectory = business.getEducatorDirectory();
        EducatorProfile educatorprofile = educatordirectory.addEducatorProfile(educatorperson001);
        UserAccount ua8 = uadirectory.newUserAccount(educatorprofile, "educator", "e123");
        
        NutritionistDirectory nutritionistdirectory = business.getNutritionistDirectory();
        NutritionistProfile nutritionistprofile = nutritionistdirectory.addNutritionistProfile(nutritionistperson001);
        UserAccount ua9 = uadirectory.newUserAccount(nutritionistprofile, "nutritionist", "n123");
        
        AdminDirectory admindirectory = business.getAdmindirectory();
        AdminProfile adminprofile = admindirectory.addAdminProfile(admin001);
        UserAccount ua10 = uadirectory.newUserAccount(adminprofile, "admin", "admin001");
        
     
        //creating patients
        
        Therapist therapist1 = therapistdirectory.newTherapist("Dr.Modi"); 
        PatientManagement patientmanagement = therapist1.getPatientManagement();
        Patient p1 = patientmanagement.newPatient("Ronaldo", 1456, 35, "Ronaldo@gmail.com", "6174380421", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        Patient p2= patientmanagement.newPatient("Akash", 1457, 25, "akash@gmail.com", "6174380439", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        Patient p3 = patientmanagement.newPatient("Vilas", 1458, 28, "vilas@gmail.com", "6174380432", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        Patient p4 = patientmanagement.newPatient("Shreyas", 1459, 24, "shreyas@gmail.com", "6174380433", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        Patient p5 = patientmanagement.newPatient("Rahul", 1460, 18, "rahul@gmail.com", "5237438043", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        Patient p6 = patientmanagement.newPatient("Joy", 1461, 23, "reva@gmail.com", "7974380438", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        Patient p7 = patientmanagement.newPatient("Coy", 1462, 23, "neha@gmail.com", "2174380438", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        Patient p8 = patientmanagement.newPatient("Toy", 1463, 38, "udit@gmail.com", "9774380438", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        Patient p9 = patientmanagement.newPatient("Soy", 1464, 24, "renuka@gmail.com", "4574380438", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        Patient p10 = patientmanagement.newPatient("Boy", 1465, 52, "kavya@gmail.com", "1274380438", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        
        Therapist therapist2 = therapistdirectory.newTherapist("Dr.Roy"); 
        PatientManagement patientmanagement2 = therapist2.getPatientManagement();
        Patient p11 = patientmanagement2.newPatient("Rofl", 1432, 35, "Ronaldo@gmail.com", "6174380421", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        Patient p12= patientmanagement2.newPatient("lol", 1431, 25, "akash@gmail.com", "6174380439", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        Patient p13 = patientmanagement2.newPatient("Idaho", 1433, 28, "vilas@gmail.com", "6174380432", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        Patient p14 = patientmanagement2.newPatient("Tulip", 1434, 24, "shreyas@gmail.com", "6174380433", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        Patient p15 = patientmanagement2.newPatient("onion", 1435, 18, "rahul@gmail.com", "5237438043", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        Patient p16 = patientmanagement2.newPatient("Squid", 1436, 23, "reva@gmail.com", "7974380438", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        Patient p17 = patientmanagement2.newPatient("Kool", 1437, 23, "neha@gmail.com", "2174380438", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        Patient p18 = patientmanagement2.newPatient("Neil", 1438, 38, "udit@gmail.com", "9774380438", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        Patient p19 = patientmanagement2.newPatient("Slang", 1439, 24, "renuka@gmail.com", "4574380438", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
        Patient p20 = patientmanagement2.newPatient("Option", 1440, 52, "kavya@gmail.com", "1274380438", "ADHD", "First Session Done, second scheduled on 2nd October", "Person progress is good. 2 more appointments needed", "Bill Paid", "Paracetamol *2", 200, 5);
     
        Therapist therapist3 = therapistdirectory.newTherapist("Dr.Khanna"); 
      
        Therapist therapist4 = therapistdirectory.newTherapist("Dr. Lol "); 
        
        Therapist therapist5= therapistdirectory.newTherapist("Dr. Rofl "); 
        Therapist therapist6 = therapistdirectory.newTherapist("Dr. Renuka"); 
        
        Therapist therapist7 = therapistdirectory.newTherapist("Dr. Reva"); 
        Therapist therapist8 = therapistdirectory.newTherapist("Dr. Neha"); 
        
        Agent agent1 = agentdirectory.newAgent("Raul"); 
        PolicyManagement policymanagement = agent1.getPolicyManagement();
        Policy pl1 = policymanagement.newPolicy("Lola 1", 123, 10000, "1 year");
        Policy pl2= policymanagement.newPolicy("Lola 2", 123, 10000, "1 year");
        Policy pl3 = policymanagement.newPolicy("Lola 3", 123, 10000, "1 year");
        Policy pl4 = policymanagement.newPolicy("Lola 4", 123, 10000, "1 year");
        Policy pl5 = policymanagement.newPolicy("Lola 5", 123, 10000, "1 year");
        Policy pl6 = policymanagement.newPolicy("Lola 6", 123, 10000, "1 year");
        Policy pl7 = policymanagement.newPolicy("Lola 7", 123, 10000, "1 year");
        
        ClientManagement clientmanagement = agent1.getClientManagement();
        Client c1 = clientmanagement.newClient("Lola", 123, "Policy 1", "Valid till 1st November");
        Client c2= clientmanagement.newClient("Lola", 123, "Policy 1", "Valid till 1st November");
        Client c3 = clientmanagement.newClient("Lola", 123, "Policy 1", "Valid till 1st November");
        Client c4 = clientmanagement.newClient("Lola", 123, "Policy 1", "Valid till 1st November");
        Client c5 = clientmanagement.newClient("Lola", 123, "Policy 1", "Valid till 1st November");
        
        
        Processor pp1 = processordirectory.newProcessor("Saul"); 
        ClaimManagement claimmanagement = pp1.getClaimManagement();
        Claim cc1 = claimmanagement.newClaim("Claim 1", 123, 456, 10000, "3 sessions", "Pending");
        Claim cc2= claimmanagement.newClaim("Claim 1", 123, 456, 10000, "3 sessions", "Pending");
        Claim cc3 = claimmanagement.newClaim("Claim 1", 123, 456, 10000, "3 sessions", "Pending");
        Claim cc4 = claimmanagement.newClaim("Claim 1", 123, 456, 10000, "3 sessions", "Pending");
        Claim cc5 = claimmanagement.newClaim("Claim 1", 123, 456, 10000, "3 sessions", "Pending");
        Claim cc6 = claimmanagement.newClaim("Claim 1", 123, 456, 10000, "3 sessions", "Pending");
        Claim cc7 = claimmanagement.newClaim("Claim 1", 123, 456, 10000, "3 sessions", "Pending");
        
        DocManagement docmanagement = pp1.getDocManagement();
        Doc d1 = docmanagement.newDoc("Cindrella", 123, "Bill", "PDF");
        Doc d2= docmanagement.newDoc("Cindrella", 123, "Bill", "PDF");
        Doc d3 = docmanagement.newDoc("Cindrella", 123, "Bill", "PDF");
        Doc d4 = docmanagement.newDoc("Cindrella", 123, "Bill", "PDF");
        Doc d5 = docmanagement.newDoc("Cindrella", 123, "Bill", "PDF");
        Doc d6 = docmanagement.newDoc("Cindrella", 123, "Bill", "PDF");
        
        
         Coach ch1 = coachdirectory.newCoach("Zidane"); 
        ProgramManagement programmanagement = ch1.getProgramManagement();
        Program cp1 = programmanagement.newProgram("Program 1", "November 20", "March 30", "Ayush, Rahul, Preeti, Lol");
        Program cp2 = programmanagement.newProgram("Program 1", "November 20", "March 30", "Ayush, Rahul, Preeti, Lol");
        Program cp3 = programmanagement.newProgram("Program 1", "November 20", "March 30", "Ayush, Rahul, Preeti, Lol");
        Program cp4 = programmanagement.newProgram("Program 1", "November 20", "March 30", "Ayush, Rahul, Preeti, Lol");
        Program cp5 = programmanagement.newProgram("Program 1", "November 20", "March 30", "Ayush, Rahul, Preeti, Lol");
        
        PeopleManagement peoplemanagement = ch1.getPeopleManagement();
        People chp1 = peoplemanagement.newPeople("Koyal", 23, 5.20f, 56.52f, 40.28f);
        People chp2 = peoplemanagement.newPeople("Roro", 23, 5.20f, 56.52f, 40.28f);
        People chp3 = peoplemanagement.newPeople("Koko", 23, 5.20f, 56.52f, 40.28f);
        People chp4 = peoplemanagement.newPeople("Popo", 23, 5.20f, 56.52f, 40.28f);
        People chp5 = peoplemanagement.newPeople("Toto", 23, 5.20f, 56.52f, 40.28f);
        People chp6 = peoplemanagement.newPeople("Wowo", 23, 5.20f, 56.52f, 40.28f);
        
        Educator e1 = educatordirectory.newEducator("Master"); 
        ResourceManagement resourcemanagement = e1.getResourceManagement();
        Resource r1 = resourcemanagement.newResource("Title 1", "Online Video", "7 November");
        Resource r2= resourcemanagement.newResource("Title 1", "Online Video", "7 November");
        Resource r3 = resourcemanagement.newResource("Title 1", "Online Video", "7 November");
        Resource r4 = resourcemanagement.newResource("Title 1", "Online Video", "7 November");
        
        Nutritionist n1 = nutritionistdirectory.newNutritionist("Foodie"); 
        MealManagement mealmanagement = n1.getMealManagement();
        Meal m1 = mealmanagement.newMeal("Person 1", "Healthy carbs", "Lactose", "M,W,F");
        Meal m2= mealmanagement.newMeal("Person 1", "Healthy carbs", "Lactose", "M,W,F");
        Meal m3 = mealmanagement.newMeal("Person 1", "Healthy carbs", "Lactose", "M,W,F");
        Meal m4 = mealmanagement.newMeal("Person 1", "Healthy carbs", "Lactose", "M,W,F");
        Meal m5 = mealmanagement.newMeal("Person 1", "Healthy carbs", "Lactose", "M,W,F");
        
        
          Researcher rr1 = researcherdirectory.newResearcher("Dr. Reddy"); 
        ResearchManagement researchmanagement = rr1.getResearchManagement();
        Research rrd1 = researchmanagement.newResearch("Research 1", "Toto", "7th November");
        Research rrd2 = researchmanagement.newResearch("Research 1", "Toto", "7th November");
        Research rrd3 = researchmanagement.newResearch("Research 1", "Toto", "7th November");
        Research rrd4 = researchmanagement.newResearch("Research 1", "Toto", "7th November");
        Research rrd5 = researchmanagement.newResearch("Research 1", "Toto", "7th November");
        
        Specialist s1 = specialistdirectory.newSpecialist("Sp 1"); 
        InnovationManagement innovationmanagement = s1.getInnovationManagement();
        Innovation i1 =innovationmanagement.newInnovation("Inn 1", "Skye", "14th Dec");
        Innovation i2 =innovationmanagement.newInnovation("Inn 1", "Skye", "14th Dec");
        Innovation i3 =innovationmanagement.newInnovation("Inn 1", "Skye", "14th Dec");
        Innovation i4 =innovationmanagement.newInnovation("Inn 1", "Skye", "14th Dec");
        Innovation i5 =innovationmanagement.newInnovation("Inn 1", "Skye", "14th Dec");
        
        return business;
    }
}
