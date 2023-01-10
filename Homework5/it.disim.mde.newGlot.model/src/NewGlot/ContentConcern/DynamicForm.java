/**
 */
package NewGlot.ContentConcern;

import NewGlot.FormConcern.Form;

import NewGlot.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NewGlot.ContentConcern.DynamicForm#getForm <em>Form</em>}</li>
 * </ul>
 *
 * @see NewGlot.ContentConcern.ContentConcernPackage#getDynamicForm()
 * @model
 * @generated
 */
public interface DynamicForm extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form</em>' reference.
	 * @see #setForm(Form)
	 * @see NewGlot.ContentConcern.ContentConcernPackage#getDynamicForm_Form()
	 * @model required="true"
	 * @generated
	 */
	Form getForm();

	/**
	 * Sets the value of the '{@link NewGlot.ContentConcern.DynamicForm#getForm <em>Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Form</em>' reference.
	 * @see #getForm()
	 * @generated
	 */
	void setForm(Form value);

} // DynamicForm
