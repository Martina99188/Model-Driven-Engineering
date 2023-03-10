/**
 */
package NewGlot.ContentConcern.impl;

import NewGlot.ContentConcern.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentConcernFactoryImpl extends EFactoryImpl implements ContentConcernFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContentConcernFactory init() {
		try {
			ContentConcernFactory theContentConcernFactory = (ContentConcernFactory)EPackage.Registry.INSTANCE.getEFactory(ContentConcernPackage.eNS_URI);
			if (theContentConcernFactory != null) {
				return theContentConcernFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ContentConcernFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentConcernFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ContentConcernPackage.PAGE: return createPage();
			case ContentConcernPackage.INDEX: return createIndex();
			case ContentConcernPackage.INDIVIDUAL: return createIndividual();
			case ContentConcernPackage.DYNAMIC_FORM: return createDynamicForm();
			case ContentConcernPackage.ADVERTISMENT: return createAdvertisment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Index createIndex() {
		IndexImpl index = new IndexImpl();
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual createIndividual() {
		IndividualImpl individual = new IndividualImpl();
		return individual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicForm createDynamicForm() {
		DynamicFormImpl dynamicForm = new DynamicFormImpl();
		return dynamicForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Advertisment createAdvertisment() {
		AdvertismentImpl advertisment = new AdvertismentImpl();
		return advertisment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentConcernPackage getContentConcernPackage() {
		return (ContentConcernPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ContentConcernPackage getPackage() {
		return ContentConcernPackage.eINSTANCE;
	}

} //ContentConcernFactoryImpl
