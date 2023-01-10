/**
 */
package NewGlot.ContentConcern;

import NewGlot.DataConcern._DataType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advertisment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NewGlot.ContentConcern.Advertisment#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see NewGlot.ContentConcern.ContentConcernPackage#getAdvertisment()
 * @model
 * @generated
 */
public interface Advertisment extends DynamicContent {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * The literals are from the enumeration {@link NewGlot.DataConcern._DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see NewGlot.DataConcern._DataType
	 * @see #setImage(_DataType)
	 * @see NewGlot.ContentConcern.ContentConcernPackage#getAdvertisment_Image()
	 * @model
	 * @generated
	 */
	_DataType getImage();

	/**
	 * Sets the value of the '{@link NewGlot.ContentConcern.Advertisment#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see NewGlot.DataConcern._DataType
	 * @see #getImage()
	 * @generated
	 */
	void setImage(_DataType value);

} // Advertisment
