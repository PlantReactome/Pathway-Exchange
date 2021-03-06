/* Copyright (c) 2011 European Bioinformatics Institute and Cold Spring Harbor Laboratory. */

package org.gk.sbml.model.elements;

/**
 * Wraps org.sbml.libsbml.ModifierSpeciesReference and its analogs in other packages.
 * 
 * @author David Croft
 *
 */
public interface ModifierSpeciesReference extends SBase {
	public int setSpecies(String speciesId);
	public int setId(String id);
}
