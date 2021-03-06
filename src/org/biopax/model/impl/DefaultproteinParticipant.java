package org.biopax.model.impl;

import java.util.Collection;
import java.util.Iterator;

import org.biopax.model.ProteinParticipant;
import org.biopax.model.SequenceFeature;

import edu.stanford.smi.protege.model.FrameID;
import edu.stanford.smi.protegex.owl.model.OWLModel;
import edu.stanford.smi.protegex.owl.model.RDFProperty;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.biopax.org/release/biopax-level2.owl#proteinParticipant
 *
 * @version generated on Mon May 23 15:40:06 EDT 2005
 */
public class DefaultproteinParticipant extends DefaultphysicalEntityParticipant
         implements ProteinParticipant {

    public DefaultproteinParticipant(OWLModel owlModel, FrameID id) {
        super(owlModel, id);
    }


    public DefaultproteinParticipant() {
    }



    // Property http://www.biopax.org/release/biopax-level2.owl#SEQUENCE-FEATURE-LIST

    public Collection getSEQUENCE_FEATURE_LIST() {
        return getPropertyValuesAs(getSEQUENCE_FEATURE_LISTProperty(), SequenceFeature.class);
    }


    public RDFProperty getSEQUENCE_FEATURE_LISTProperty() {
        final String uri = "http://www.biopax.org/release/biopax-level2.owl#SEQUENCE-FEATURE-LIST";
        final String name = getOWLModel().getResourceNameForURI(uri);
        return getOWLModel().getRDFProperty(name);
    }


    public boolean hasSEQUENCE_FEATURE_LIST() {
        return getPropertyValueCount(getSEQUENCE_FEATURE_LISTProperty()) > 0;
    }


    public Iterator listSEQUENCE_FEATURE_LIST() {
        return listPropertyValuesAs(getSEQUENCE_FEATURE_LISTProperty(), SequenceFeature.class);
    }


    public void addSEQUENCE_FEATURE_LIST(SequenceFeature newSEQUENCE_FEATURE_LIST) {
        addPropertyValue(getSEQUENCE_FEATURE_LISTProperty(), newSEQUENCE_FEATURE_LIST);
    }


    public void removeSEQUENCE_FEATURE_LIST(SequenceFeature oldSEQUENCE_FEATURE_LIST) {
        removePropertyValue(getSEQUENCE_FEATURE_LISTProperty(), oldSEQUENCE_FEATURE_LIST);
    }


    public void setSEQUENCE_FEATURE_LIST(Collection newSEQUENCE_FEATURE_LIST) {
        setPropertyValues(getSEQUENCE_FEATURE_LISTProperty(), newSEQUENCE_FEATURE_LIST);
    }
}
