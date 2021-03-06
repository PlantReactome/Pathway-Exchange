package org.biopax.model;

import java.util.Collection;
import java.util.Iterator;

import edu.stanford.smi.protegex.owl.model.RDFProperty;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.biopax.org/release/biopax-level2.owl#dna
 *
 * @version generated on Mon May 23 15:40:06 EDT 2005
 */
public interface DNA extends PhysicalEntity {

    // Property http://www.biopax.org/release/biopax-level2.owl#ORGANISM

    Collection getORGANISM();

    RDFProperty getORGANISMProperty();

    boolean hasORGANISM();

    Iterator listORGANISM();

    void addORGANISM(BioSource newORGANISM);

    void removeORGANISM(BioSource oldORGANISM);

    void setORGANISM(Collection newORGANISM);


    // Property http://www.biopax.org/release/biopax-level2.owl#SEQUENCE

    Collection getSEQUENCE();

    RDFProperty getSEQUENCEProperty();

    boolean hasSEQUENCE();

    Iterator listSEQUENCE();

    void addSEQUENCE(String newSEQUENCE);

    void removeSEQUENCE(String oldSEQUENCE);

    void setSEQUENCE(Collection newSEQUENCE);
}
