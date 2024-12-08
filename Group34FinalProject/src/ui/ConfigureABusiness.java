/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.Business;
import model.ClinicManagement.NurseDirectory;
import model.ClinicManagement.NurseProfile;
import model.ClinicManagement.Patient;
import model.ClinicManagement.PatientManagement;
import model.ClinicManagement.Therapist;
import model.ClinicManagement.TherapistDirectory;
import model.ClinicManagement.TherapistProfile;
import model.InnovationManagement.ResearcherDirectory;
import model.InnovationManagement.ResearcherProfile;
import model.InnovationManagement.SpecialistDirectory;
import model.InnovationManagement.SpecialistProfile;
import model.InsuranceManagement.AgentDirectory;
import model.InsuranceManagement.AgentProfile;
import model.InsuranceManagement.ProcessorDirectory;
import model.InsuranceManagement.ProcessorProfile;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.PreHealthcareManagement.CoachDirectory;
import model.PreHealthcareManagement.CoachProfile;
import model.PreHealthcareManagement.EducatorDirectory;
import model.PreHealthcareManagement.EducatorProfile;
import model.PreHealthcareManagement.NutritionistDirectory;
import model.PreHealthcareManagement.NutritionistProfile;
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
        
     
        //creating patients
        
        Therapist therapist1 = therapistdirectory.newTherapist("Dr.Roy"); 
        PatientManagement patientmanagement = therapist1.getPatientManagement();
        Patient p1 = patientmanagement.newPatient("Ronaldo", 1456, 35, "Ronaldo@gmail.com", "6174380438");
        Patient p2= patientmanagement.newPatient("Ronaldo", 1456, 35, "Ronaldo@gmail.com", "6174380438");
        Patient p3 = patientmanagement.newPatient("Ronaldo", 1456, 35, "Ronaldo@gmail.com", "6174380438");
        Patient p4 = patientmanagement.newPatient("Ronaldo", 1456, 35, "Ronaldo@gmail.com", "6174380438");
        Patient p5 = patientmanagement.newPatient("Ronaldo", 1456, 35, "Ronaldo@gmail.com", "6174380438");
        Patient p6 = patientmanagement.newPatient("Ronaldo", 1456, 35, "Ronaldo@gmail.com", "6174380438");
        
        Therapist therapist2 = therapistdirectory.newTherapist("Dr.5"); 
     
        Therapist therapist3 = therapistdirectory.newTherapist("Dr.5"); 
      
        Therapist therapist4 = therapistdirectory.newTherapist("Dr.6"); 
  
        return business;
    }
}
