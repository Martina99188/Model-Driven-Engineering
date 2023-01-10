/**
 */
package NewGlot.ContentConcern;

import NewGlot.NamedElement;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NewGlot.ContentConcern.Page#getLinks <em>Links</em>}</li>
 *   <li>{@link NewGlot.ContentConcern.Page#getIndexes <em>Indexes</em>}</li>
 *   <li>{@link NewGlot.ContentConcern.Page#getForms <em>Forms</em>}</li>
 *   <li>{@link NewGlot.ContentConcern.Page#getLinkNumber <em>Link Number</em>}</li>
 *   <li>{@link NewGlot.ContentConcern.Page#getTitle <em>Title</em>}</li>
 *   <li>{@link NewGlot.ContentConcern.Page#getAdvertisements <em>Advertisements</em>}</li>
 * </ul>
 *
 * @see NewGlot.ContentConcern.ContentConcernPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link NewGlot.ContentConcern.Page}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see NewGlot.ContentConcern.ContentConcernPackage#getPage_Links()
	 * @model
	 * @generated
	 */
	EList<Page> getLinks();

	/**
	 * Returns the value of the '<em><b>Indexes</b></em>' containment reference list.
	 * The list contents are of type {@link NewGlot.ContentConcern.Index}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexes</em>' containment reference list.
	 * @see NewGlot.ContentConcern.ContentConcernPackage#getPage_Indexes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Index> getIndexes();

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link NewGlot.ContentConcern.DynamicForm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see NewGlot.ContentConcern.ContentConcernPackage#getPage_Forms()
	 * @model containment="true"
	 * @generated
	 */
	EList<DynamicForm> getForms();

	/**
	 * Returns the value of the '<em><b>Link Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Number</em>' attribute.
	 * @see #setLinkNumber(BigInteger)
	 * @see NewGlot.ContentConcern.ContentConcernPackage#getPage_LinkNumber()
	 * @model required="true" volatile="true" derived="true"
	 * @generated
	 */
	BigInteger getLinkNumber();

	/**
	 * Sets the value of the '{@link NewGlot.ContentConcern.Page#getLinkNumber <em>Link Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Number</em>' attribute.
	 * @see #getLinkNumber()
	 * @generated
	 */
	void setLinkNumber(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see NewGlot.ContentConcern.ContentConcernPackage#getPage_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link NewGlot.ContentConcern.Page#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Advertisements</b></em>' containment reference list.
	 * The list contents are of type {@link NewGlot.ContentConcern.Advertisment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Advertisements</em>' containment reference list.
	 * @see NewGlot.ContentConcern.ContentConcernPackage#getPage_Advertisements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Advertisment> getAdvertisements();

} // Page
