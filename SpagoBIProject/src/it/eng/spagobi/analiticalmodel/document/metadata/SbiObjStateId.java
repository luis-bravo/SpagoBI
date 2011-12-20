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
package it.eng.spagobi.analiticalmodel.document.metadata;

import it.eng.spagobi.commons.metadata.SbiDomains;

import java.util.Date;




/**
 * SbiObjStateId generated by hbm2java
 */
public class SbiObjStateId  implements java.io.Serializable {

    // Fields    

     private SbiDomains sbiDomains;
     private SbiObjects sbiObjects;
     private Date startDt;


    // Constructors

    /**
     * default constructor.
     */
    public SbiObjStateId() {
    }
    
   
    
    

    // Property accessors

    /**
     * Gets the sbi domains.
     * 
     * @return the sbi domains
     */
    public SbiDomains getSbiDomains() {
        return this.sbiDomains;
    }
    
    /**
     * Sets the sbi domains.
     * 
     * @param sbiDomains the new sbi domains
     */
    public void setSbiDomains(SbiDomains sbiDomains) {
        this.sbiDomains = sbiDomains;
    }

    /**
     * Gets the sbi objects.
     * 
     * @return the sbi objects
     */
    public SbiObjects getSbiObjects() {
        return this.sbiObjects;
    }
    
    /**
     * Sets the sbi objects.
     * 
     * @param sbiObjects the new sbi objects
     */
    public void setSbiObjects(SbiObjects sbiObjects) {
        this.sbiObjects = sbiObjects;
    }

    /**
     * Gets the start dt.
     * 
     * @return the start dt
     */
    public Date getStartDt() {
        return this.startDt;
    }
    
    /**
     * Sets the start dt.
     * 
     * @param startDt the new start dt
     */
    public void setStartDt(Date startDt) {
        this.startDt = startDt;
    }

   /* (non-Javadoc)
    * @see java.lang.Object#equals(java.lang.Object)
    */
   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SbiObjStateId) ) return false;
		 SbiObjStateId castOther = ( SbiObjStateId ) other; 
         
		 return (this.getSbiDomains()==castOther.getSbiDomains()) || ( this.getSbiDomains()!=null && castOther.getSbiDomains()!=null && this.getSbiDomains().equals(castOther.getSbiDomains()) )
 && (this.getSbiObjects()==castOther.getSbiObjects()) || ( this.getSbiObjects()!=null && castOther.getSbiObjects()!=null && this.getSbiObjects().equals(castOther.getSbiObjects()) )
 && (this.getStartDt()==castOther.getStartDt()) || ( this.getStartDt()!=null && castOther.getStartDt()!=null && this.getStartDt().equals(castOther.getStartDt()) );
   }
   
   /* (non-Javadoc)
    * @see java.lang.Object#hashCode()
    */
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getSbiDomains().hashCode();
         result = 37 * result + this.getSbiObjects().hashCode();
         result = 37 * result + this.getStartDt().hashCode();
         return result;
   }   


}