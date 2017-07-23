package aima.extra.probability;

import aima.extra.probability.domain.Domain;

/**
 * Variables in probability theory are called random variables and their names
 * begin with an uppercase letter. Every random variable has a domain - the set
 * of possible values it can take on.
 * 
 * @author Ciaran O'Reilly
 */
public interface RandomVariable {
    /**
     * 
     * @return the name used to uniquely identify this variable.
     */
    String getName();

    /**
     * 
     * @return the Set of possible values the Random Variable can take on.
     */
    Domain getDomain();
}
