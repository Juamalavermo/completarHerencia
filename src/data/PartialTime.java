/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class PartialTime extends Professor {
    private String category;
    private int classHours;

    public PartialTime(String Category, int classHours, String school, String department, String id, String name, Date hiringDate) {
        super(school, department, id, name, hiringDate);
        this.category = category;
        this.classHours = classHours;
    }

    @Override
    public float paySalary() {
         if (this.category.equals("A"))
                return 60000*this.classHours;
         else if (this.category.equals("B"))
             return 80000*this.classHours;
         else if (this.category.equals("C"))
             return 100000*this.classHours;
         else 
             throw new IllegalArgumentException("Category not found");
    }
    
}
   
    
    
