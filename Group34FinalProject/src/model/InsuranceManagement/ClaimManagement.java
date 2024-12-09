/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.InsuranceManagement;

import java.util.ArrayList;

/**
 *
 * @author nikam
 */
public class ClaimManagement {
    
     ArrayList<Claim> claims;
    
    public ClaimManagement(String n) {
         claims = new ArrayList();  ///create the list of elements otherwise it is null
    }
    
    public Claim newClaim(String n, int id, int pno, int am, String r, String s) {
        Claim c = new Claim(n,id, pno, am, r, s);
        claims.add(c);
        return c;
    }
    public ArrayList<Claim> getClaimList(){
        return claims;
    }

    public void removeClaim(Claim c) {
        claims.remove(c);
    }
    
    public Claim searchClaim(String search){
        for (Claim c:claims){
            if(c.getName().contains(search)) {
                return c;
        }
        }
        return null;
    }
}
