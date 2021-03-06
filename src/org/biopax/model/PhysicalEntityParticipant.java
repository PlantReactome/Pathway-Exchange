package org.biopax.model;

import edu.stanford.smi.protegex.owl.model.RDFProperty;
import edu.stanford.smi.protegex.owl.model.RDFSLiteral;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.biopax.org/release/biopax-level2.owl#physicalEntityParticipant
 *
 * @version generated on Mon May 23 15:40:06 EDT 2005
 */
public interface PhysicalEntityParticipant extends UtilityClass {

    // Property http://www.biopax.org/release/biopax-level2.owl#CELLULAR-LOCATION

    OpenControlledVocabulary getCELLULAR_LOCATION();

    RDFProperty getCELLULAR_LOCATIONProperty();

    boolean hasCELLULAR_LOCATION();

    void setCELLULAR_LOCATION(OpenControlledVocabulary newCELLULAR_LOCATION);


    // Property http://www.biopax.org/release/biopax-level2.owl#PHYSICAL-ENTITY

    PhysicalEntity getPHYSICAL_ENTITY();

    RDFProperty getPHYSICAL_ENTITYProperty();

    boolean hasPHYSICAL_ENTITY();

    void setPHYSICAL_ENTITY(PhysicalEntity newPHYSICAL_ENTITY);


    // Property http://www.biopax.org/release/biopax-level2.owl#STOICHIOMETRIC-COEFFICIENT

    RDFSLiteral getSTOICHIOMETRIC_COEFFICIENT();

    RDFProperty getSTOICHIOMETRIC_COEFFICIENTProperty();

    boolean hasSTOICHIOMETRIC_COEFFICIENT();

    void setSTOICHIOMETRIC_COEFFICIENT(RDFSLiteral newSTOICHIOMETRIC_COEFFICIENT);
}
