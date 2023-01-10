/**
 */
package Glot.ContentConcern;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Glot.ContentConcern.Index#getIndividuals <em>Individuals</em>}</li>
 * </ul>
 *
 * @see Glot.ContentConcern.ContentConcernPackage#getIndex()
 * @model
 * @generated
 */
public interface Index extends DynamicContent {
	/**
	 * Returns the value of the '<em><b>Individuals</b></em>' containment reference list.
	 * The list contents are of type {@link Glot.ContentConcern.Individual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individuals</em>' containment reference list.
	 * @see Glot.ContentConcern.ContentConcernPackage#getIndex_Individuals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Individual> getIndividuals();

} // Index
