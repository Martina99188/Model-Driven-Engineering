/**
 */
package NewGlot.ContentConcern.impl;

import NewGlot.ContentConcern.ContentConcernPackage;
import NewGlot.ContentConcern.Individual;

import NewGlot.DataConcern.Entity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NewGlot.ContentConcern.impl.IndividualImpl#getId <em>Id</em>}</li>
 *   <li>{@link NewGlot.ContentConcern.impl.IndividualImpl#getEnity <em>Enity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndividualImpl extends DynamicContentImpl implements Individual {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnity() <em>Enity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnity()
	 * @generated
	 * @ordered
	 */
	protected Entity enity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentConcernPackage.Literals.INDIVIDUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentConcernPackage.INDIVIDUAL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEnity() {
		if (enity != null && enity.eIsProxy()) {
			InternalEObject oldEnity = (InternalEObject)enity;
			enity = (Entity)eResolveProxy(oldEnity);
			if (enity != oldEnity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentConcernPackage.INDIVIDUAL__ENITY, oldEnity, enity));
			}
		}
		return enity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetEnity() {
		return enity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnity(Entity newEnity) {
		Entity oldEnity = enity;
		enity = newEnity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentConcernPackage.INDIVIDUAL__ENITY, oldEnity, enity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentConcernPackage.INDIVIDUAL__ID:
				return getId();
			case ContentConcernPackage.INDIVIDUAL__ENITY:
				if (resolve) return getEnity();
				return basicGetEnity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContentConcernPackage.INDIVIDUAL__ID:
				setId((Integer)newValue);
				return;
			case ContentConcernPackage.INDIVIDUAL__ENITY:
				setEnity((Entity)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContentConcernPackage.INDIVIDUAL__ID:
				setId(ID_EDEFAULT);
				return;
			case ContentConcernPackage.INDIVIDUAL__ENITY:
				setEnity((Entity)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContentConcernPackage.INDIVIDUAL__ID:
				return id != ID_EDEFAULT;
			case ContentConcernPackage.INDIVIDUAL__ENITY:
				return enity != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //IndividualImpl
