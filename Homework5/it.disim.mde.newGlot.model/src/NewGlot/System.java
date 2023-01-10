/**
 */
package NewGlot;

import NewGlot.ContentConcern.Page;

import NewGlot.DataConcern.Entity;

import NewGlot.FormConcern.Form;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NewGlot.System#getVersion <em>Version</em>}</li>
 *   <li>{@link NewGlot.System#getSubversion <em>Subversion</em>}</li>
 *   <li>{@link NewGlot.System#getConcatVersion <em>Concat Version</em>}</li>
 *   <li>{@link NewGlot.System#getEntities <em>Entities</em>}</li>
 *   <li>{@link NewGlot.System#getPages <em>Pages</em>}</li>
 *   <li>{@link NewGlot.System#getForms <em>Forms</em>}</li>
 * </ul>
 *
 * @see NewGlot.NewGlotPackage#getSystem()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NonUniqueEntityName'"
 * @generated
 */
public interface System extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(int)
	 * @see NewGlot.NewGlotPackage#getSystem_Version()
	 * @model required="true"
	 * @generated
	 */
	int getVersion();

	/**
	 * Sets the value of the '{@link NewGlot.System#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(int value);

	/**
	 * Returns the value of the '<em><b>Subversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subversion</em>' attribute.
	 * @see #setSubversion(int)
	 * @see NewGlot.NewGlotPackage#getSystem_Subversion()
	 * @model required="true"
	 * @generated
	 */
	int getSubversion();

	/**
	 * Sets the value of the '{@link NewGlot.System#getSubversion <em>Subversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subversion</em>' attribute.
	 * @see #getSubversion()
	 * @generated
	 */
	void setSubversion(int value);

	/**
	 * Returns the value of the '<em><b>Concat Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concat Version</em>' attribute.
	 * @see #setConcatVersion(String)
	 * @see NewGlot.NewGlotPackage#getSystem_ConcatVersion()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	String getConcatVersion();

	/**
	 * Sets the value of the '{@link NewGlot.System#getConcatVersion <em>Concat Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concat Version</em>' attribute.
	 * @see #getConcatVersion()
	 * @generated
	 */
	void setConcatVersion(String value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link NewGlot.DataConcern.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see NewGlot.NewGlotPackage#getSystem_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link NewGlot.ContentConcern.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see NewGlot.NewGlotPackage#getSystem_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link NewGlot.FormConcern.Form}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see NewGlot.NewGlotPackage#getSystem_Forms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Form> getForms();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='version.toString().concat(\'.\').concat(subversion.toString())'"
	 * @generated
	 */
	String concatVersionSubversion();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='ContentConcern::Page.allInstances()-&gt;forAll(page | pages-&gt;select(p |\n\t\t\t\t\t\t\tpage.name = p.name)-&gt;size() &lt;= 1)'"
	 * @generated
	 */
	boolean NonUniquePageName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='FormConcern::Form.allInstances()-&gt;forAll(form | forms-&gt;select(f |\n\t\t\t\t\t\t\tform.name = f.name)-&gt;size() &lt;= 1)'"
	 * @generated
	 */
	boolean NonUniqueFormName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='DataConcern::Entity.allInstances()-&gt;forAll(ent | entities-&gt;select(e |\n\t\t\t\t\t\t\tent.name = e.name)-&gt;size() &lt;= 1)'"
	 * @generated
	 */
	boolean NonUniqueEntityName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // System
