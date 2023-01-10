/**
 */
package NewGlot.FormConcern;

import NewGlot.DataConcern.Entity;

import NewGlot.NamedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NewGlot.FormConcern.Form#getMethod <em>Method</em>}</li>
 *   <li>{@link NewGlot.FormConcern.Form#getElements <em>Elements</em>}</li>
 *   <li>{@link NewGlot.FormConcern.Form#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see NewGlot.FormConcern.FormConcernPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link NewGlot.FormConcern._MethodType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see NewGlot.FormConcern._MethodType
	 * @see #setMethod(_MethodType)
	 * @see NewGlot.FormConcern.FormConcernPackage#getForm_Method()
	 * @model required="true"
	 * @generated
	 */
	_MethodType getMethod();

	/**
	 * Sets the value of the '{@link NewGlot.FormConcern.Form#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see NewGlot.FormConcern._MethodType
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(_MethodType value);

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link NewGlot.FormConcern.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see NewGlot.FormConcern.FormConcernPackage#getForm_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see NewGlot.FormConcern.FormConcernPackage#getForm_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link NewGlot.FormConcern.Form#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

} // Form
