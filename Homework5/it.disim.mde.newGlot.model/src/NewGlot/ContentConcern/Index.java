/**
 */
package NewGlot.ContentConcern;

import NewGlot.DataConcern.Entity;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
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
 *   <li>{@link NewGlot.ContentConcern.Index#getIndividuals <em>Individuals</em>}</li>
 *   <li>{@link NewGlot.ContentConcern.Index#isIsNotEmpty <em>Is Not Empty</em>}</li>
 *   <li>{@link NewGlot.ContentConcern.Index#getChildrenEntity <em>Children Entity</em>}</li>
 * </ul>
 *
 * @see NewGlot.ContentConcern.ContentConcernPackage#getIndex()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IndividualNonUniqueId'"
 * @generated
 */
public interface Index extends DynamicContent {
	/**
	 * Returns the value of the '<em><b>Individuals</b></em>' containment reference list.
	 * The list contents are of type {@link NewGlot.ContentConcern.Individual}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Individuals</em>' containment reference list.
	 * @see NewGlot.ContentConcern.ContentConcernPackage#getIndex_Individuals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Individual> getIndividuals();

	/**
	 * Returns the value of the '<em><b>Is Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Not Empty</em>' attribute.
	 * @see #setIsNotEmpty(boolean)
	 * @see NewGlot.ContentConcern.ContentConcernPackage#getIndex_IsNotEmpty()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	boolean isIsNotEmpty();

	/**
	 * Sets the value of the '{@link NewGlot.ContentConcern.Index#isIsNotEmpty <em>Is Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Not Empty</em>' attribute.
	 * @see #isIsNotEmpty()
	 * @generated
	 */
	void setIsNotEmpty(boolean value);

	/**
	 * Returns the value of the '<em><b>Children Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children Entity</em>' reference.
	 * @see #setChildrenEntity(Entity)
	 * @see NewGlot.ContentConcern.ContentConcernPackage#getIndex_ChildrenEntity()
	 * @model
	 * @generated
	 */
	Entity getChildrenEntity();

	/**
	 * Sets the value of the '{@link NewGlot.ContentConcern.Index#getChildrenEntity <em>Children Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Children Entity</em>' reference.
	 * @see #getChildrenEntity()
	 * @generated
	 */
	void setChildrenEntity(Entity value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='individuals-&gt;size()'"
	 * @generated
	 */
	BigInteger countIndividual();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Individual.allInstances()-&gt;forAll(ind | individuals-&gt;select(i |\n\t\t\t\t\t\t\t\tind.id = i.id)-&gt;size() &lt;= 1)'"
	 * @generated
	 */
	boolean IndividualNonUniqueId(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Index
