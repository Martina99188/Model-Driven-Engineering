/**
 */
package NewGlot.ContentConcern;

import NewGlot.DataConcern.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NewGlot.ContentConcern.Individual#getId <em>Id</em>}</li>
 *   <li>{@link NewGlot.ContentConcern.Individual#getEnity <em>Enity</em>}</li>
 * </ul>
 *
 * @see NewGlot.ContentConcern.ContentConcernPackage#getIndividual()
 * @model
 * @generated
 */
public interface Individual extends DynamicContent {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see NewGlot.ContentConcern.ContentConcernPackage#getIndividual_Id()
	 * @model required="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link NewGlot.ContentConcern.Individual#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Enity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enity</em>' reference.
	 * @see #setEnity(Entity)
	 * @see NewGlot.ContentConcern.ContentConcernPackage#getIndividual_Enity()
	 * @model required="true"
	 * @generated
	 */
	Entity getEnity();

	/**
	 * Sets the value of the '{@link NewGlot.ContentConcern.Individual#getEnity <em>Enity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enity</em>' reference.
	 * @see #getEnity()
	 * @generated
	 */
	void setEnity(Entity value);

} // Individual
