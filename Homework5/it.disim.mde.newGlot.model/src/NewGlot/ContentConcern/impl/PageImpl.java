/**
 */
package NewGlot.ContentConcern.impl;

import NewGlot.ContentConcern.Advertisment;
import NewGlot.ContentConcern.ContentConcernPackage;
import NewGlot.ContentConcern.ContentConcernTables;
import NewGlot.ContentConcern.DynamicForm;
import NewGlot.ContentConcern.Index;
import NewGlot.ContentConcern.Page;

import NewGlot.impl.NamedElementImpl;

import java.math.BigInteger;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NewGlot.ContentConcern.impl.PageImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link NewGlot.ContentConcern.impl.PageImpl#getIndexes <em>Indexes</em>}</li>
 *   <li>{@link NewGlot.ContentConcern.impl.PageImpl#getForms <em>Forms</em>}</li>
 *   <li>{@link NewGlot.ContentConcern.impl.PageImpl#getLinkNumber <em>Link Number</em>}</li>
 *   <li>{@link NewGlot.ContentConcern.impl.PageImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link NewGlot.ContentConcern.impl.PageImpl#getAdvertisements <em>Advertisements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends NamedElementImpl implements Page {
	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> links;

	/**
	 * The cached value of the '{@link #getIndexes() <em>Indexes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexes()
	 * @generated
	 * @ordered
	 */
	protected EList<Index> indexes;

	/**
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected EList<DynamicForm> forms;

	/**
	 * The default value of the '{@link #getLinkNumber() <em>Link Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkNumber()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger LINK_NUMBER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAdvertisements() <em>Advertisements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvertisements()
	 * @generated
	 * @ordered
	 */
	protected EList<Advertisment> advertisements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentConcernPackage.Literals.PAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getLinks() {
		if (links == null) {
			links = new EObjectResolvingEList<Page>(Page.class, this, ContentConcernPackage.PAGE__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Index> getIndexes() {
		if (indexes == null) {
			indexes = new EObjectContainmentEList<Index>(Index.class, this, ContentConcernPackage.PAGE__INDEXES);
		}
		return indexes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DynamicForm> getForms() {
		if (forms == null) {
			forms = new EObjectContainmentEList<DynamicForm>(DynamicForm.class, this, ContentConcernPackage.PAGE__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getLinkNumber() {
		/**
		 * links->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Page> links = this.getLinks();
		final /*@NonInvalid*/ OrderedSetValue BOXED_links = idResolver.createOrderedSetOfAll(ContentConcernTables.ORD_CLSSid_Page, links);
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_links);
		final BigInteger ECORE_size = ValueUtil.bigIntegerValueOf(size);
		return ECORE_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkNumber(BigInteger newLinkNumber) {
		// TODO: implement this method to set the 'Link Number' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentConcernPackage.PAGE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Advertisment> getAdvertisements() {
		if (advertisements == null) {
			advertisements = new EObjectContainmentEList<Advertisment>(Advertisment.class, this, ContentConcernPackage.PAGE__ADVERTISEMENTS);
		}
		return advertisements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ContentConcernPackage.PAGE__INDEXES:
				return ((InternalEList<?>)getIndexes()).basicRemove(otherEnd, msgs);
			case ContentConcernPackage.PAGE__FORMS:
				return ((InternalEList<?>)getForms()).basicRemove(otherEnd, msgs);
			case ContentConcernPackage.PAGE__ADVERTISEMENTS:
				return ((InternalEList<?>)getAdvertisements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentConcernPackage.PAGE__LINKS:
				return getLinks();
			case ContentConcernPackage.PAGE__INDEXES:
				return getIndexes();
			case ContentConcernPackage.PAGE__FORMS:
				return getForms();
			case ContentConcernPackage.PAGE__LINK_NUMBER:
				return getLinkNumber();
			case ContentConcernPackage.PAGE__TITLE:
				return getTitle();
			case ContentConcernPackage.PAGE__ADVERTISEMENTS:
				return getAdvertisements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContentConcernPackage.PAGE__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Page>)newValue);
				return;
			case ContentConcernPackage.PAGE__INDEXES:
				getIndexes().clear();
				getIndexes().addAll((Collection<? extends Index>)newValue);
				return;
			case ContentConcernPackage.PAGE__FORMS:
				getForms().clear();
				getForms().addAll((Collection<? extends DynamicForm>)newValue);
				return;
			case ContentConcernPackage.PAGE__LINK_NUMBER:
				setLinkNumber((BigInteger)newValue);
				return;
			case ContentConcernPackage.PAGE__TITLE:
				setTitle((String)newValue);
				return;
			case ContentConcernPackage.PAGE__ADVERTISEMENTS:
				getAdvertisements().clear();
				getAdvertisements().addAll((Collection<? extends Advertisment>)newValue);
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
			case ContentConcernPackage.PAGE__LINKS:
				getLinks().clear();
				return;
			case ContentConcernPackage.PAGE__INDEXES:
				getIndexes().clear();
				return;
			case ContentConcernPackage.PAGE__FORMS:
				getForms().clear();
				return;
			case ContentConcernPackage.PAGE__LINK_NUMBER:
				setLinkNumber(LINK_NUMBER_EDEFAULT);
				return;
			case ContentConcernPackage.PAGE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ContentConcernPackage.PAGE__ADVERTISEMENTS:
				getAdvertisements().clear();
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
			case ContentConcernPackage.PAGE__LINKS:
				return links != null && !links.isEmpty();
			case ContentConcernPackage.PAGE__INDEXES:
				return indexes != null && !indexes.isEmpty();
			case ContentConcernPackage.PAGE__FORMS:
				return forms != null && !forms.isEmpty();
			case ContentConcernPackage.PAGE__LINK_NUMBER:
				return LINK_NUMBER_EDEFAULT == null ? getLinkNumber() != null : !LINK_NUMBER_EDEFAULT.equals(getLinkNumber());
			case ContentConcernPackage.PAGE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ContentConcernPackage.PAGE__ADVERTISEMENTS:
				return advertisements != null && !advertisements.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //PageImpl
