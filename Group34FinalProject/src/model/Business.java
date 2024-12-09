/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.ClinicManagement.NurseDirectory;
import model.ClinicManagement.TherapistDirectory;
import model.InnovationManagement.ResearcherDirectory;
import model.InnovationManagement.SpecialistDirectory;
import model.InsuranceManagement.AgentDirectory;
import model.InsuranceManagement.ProcessorDirectory;
import model.Personnel.PersonDirectory;
import model.PreHealthcareManagement.CoachDirectory;
import model.PreHealthcareManagement.EducatorDirectory;
import model.PreHealthcareManagement.NutritionistDirectory;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author nikam
 */
public class Business {
    UserAccountDirectory useraccountdirectory;
    NurseDirectory nursedirectory;
    PersonDirectory persondirectory;
    TherapistDirectory therapistdirectory;
    ResearcherDirectory researcherdirectory;
    SpecialistDirectory specialistdirectory;
    AgentDirectory agentdirectory;
    ProcessorDirectory processordirectory;
    CoachDirectory coachdirectory;
    EducatorDirectory educatordirectory;
    NutritionistDirectory nutritionistdirectory;
    
    public Business(String n) {
        this.useraccountdirectory = new UserAccountDirectory();
        this.persondirectory = new PersonDirectory();
        this.nursedirectory = new NurseDirectory();
        this.agentdirectory = new AgentDirectory();
        this.therapistdirectory = new TherapistDirectory();
        this.researcherdirectory = new ResearcherDirectory();
        this.specialistdirectory = new SpecialistDirectory();
        this.processordirectory = new ProcessorDirectory();
        this.coachdirectory = new CoachDirectory();
        this.educatordirectory = new EducatorDirectory();
        this.nutritionistdirectory = new NutritionistDirectory();
    }
    
    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }
    
    public NurseDirectory getNurseDirectory() {
        return nursedirectory;
    }
    
    public TherapistDirectory getTherapistDirectory() {
        return therapistdirectory;
    }
    
    public ResearcherDirectory getResearcherDirectory() {
        return researcherdirectory;
    }
    
    public SpecialistDirectory getSpecialistDirectory() {
        return specialistdirectory;
    }
    
    public AgentDirectory getAgentDirectory() {
        return agentdirectory;
    }
    
    public ProcessorDirectory getProcessorDirectory() {
        return processordirectory;
    }
    
    public CoachDirectory getCoachDirectory() {
        return coachdirectory;
    }
    
    public EducatorDirectory getEducatorDirectory() {
        return educatordirectory;
    }
    
    public NutritionistDirectory getNutritionistDirectory() {
        return nutritionistdirectory;
    }
}
