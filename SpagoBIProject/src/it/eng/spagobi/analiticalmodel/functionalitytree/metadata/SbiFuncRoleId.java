/**

SpagoBI - The Business Intelligence Free Platform

Copyright (C) 2004 - 2011 Engineering Ingegneria Informatica S.p.A.

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 2.1 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, write to the Free Software
Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

**/
package it.eng.spagobi.analiticalmodel.functionalitytree.metadata;

import it.eng.spagobi.commons.metadata.SbiDomains;
import it.eng.spagobi.commons.metadata.SbiExtRoles;





/**
 * SbiFuncRoleId generated by hbm2java
 */
public class SbiFuncRoleId  implements java.io.Serializable {

    // Fields    

     private SbiDomains state;
     private SbiExtRoles role;
     private SbiFunctions function;


    // Constructors

    /**
     * default constructor.
     */
    public SbiFuncRoleId() {
    }
    
   
    
    

    // Property accessors

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SbiFuncRoleId) ) return false;
		 SbiFuncRoleId castOther = ( SbiFuncRoleId ) other; 
         
		 return (this.getState()==castOther.getState()) || ( this.getState()!=null && castOther.getState()!=null && this.getState().equals(castOther.getState()) )
 && (this.getRole()==castOther.getRole()) || ( this.getRole()!=null && castOther.getRole()!=null && this.getRole().equals(castOther.getRole()) )
 && (this.getFunction()==castOther.getFunction()) || ( this.getFunction()!=null && castOther.getFunction()!=null && this.getFunction().equals(castOther.getFunction()) );
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getState().hashCode();
         result = 37 * result + this.getRole().hashCode();
         result = 37 * result + this.getFunction().hashCode();
         return result;
   }   


	/**
	 * Gets the function.
	 * 
	 * @return the function
	 */
	public SbiFunctions getFunction() {
		return function;
	}
	
	/**
	 * Sets the function.
	 * 
	 * @param function the new function
	 */
	public void setFunction(SbiFunctions function) {
		this.function = function;
	}
	
	/**
	 * Gets the role.
	 * 
	 * @return the role
	 */
	public SbiExtRoles getRole() {
		return role;
	}
	
	/**
	 * Sets the role.
	 * 
	 * @param role the new role
	 */
	public void setRole(SbiExtRoles role) {
		this.role = role;
	}
	
	/**
	 * Gets the state.
	 * 
	 * @return the state
	 */
	public SbiDomains getState() {
		return state;
	}
	
	/**
	 * Sets the state.
	 * 
	 * @param state the new state
	 */
	public void setState(SbiDomains state) {
		this.state = state;
	}
}