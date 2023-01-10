/**
 */
package NewGlot.ContentConcern;

import NewGlot.NewGlotPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see NewGlot.ContentConcern.ContentConcernFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface ContentConcernPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ContentConcern";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://it.disim.mde/glot/contentConcern";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContentConcernPackage eINSTANCE = NewGlot.ContentConcern.impl.ContentConcernPackageImpl.init();

	/**
	 * The meta object id for the '{@link NewGlot.ContentConcern.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NewGlot.ContentConcern.impl.PageImpl
	 * @see NewGlot.ContentConcern.impl.ContentConcernPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = NewGlotPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LINKS = NewGlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__INDEXES = NewGlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__FORMS = NewGlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LINK_NUMBER = NewGlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = NewGlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Advertisements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ADVERTISEMENTS = NewGlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = NewGlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = NewGlotPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NewGlot.ContentConcern.impl.DynamicContentImpl <em>Dynamic Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NewGlot.ContentConcern.impl.DynamicContentImpl
	 * @see NewGlot.ContentConcern.impl.ContentConcernPackageImpl#getDynamicContent()
	 * @generated
	 */
	int DYNAMIC_CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTENT__NAME = NewGlotPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Dynamic Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTENT_FEATURE_COUNT = NewGlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dynamic Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTENT_OPERATION_COUNT = NewGlotPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NewGlot.ContentConcern.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NewGlot.ContentConcern.impl.IndexImpl
	 * @see NewGlot.ContentConcern.impl.ContentConcernPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__NAME = DYNAMIC_CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Individuals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__INDIVIDUALS = DYNAMIC_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Not Empty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__IS_NOT_EMPTY = DYNAMIC_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__CHILDREN_ENTITY = DYNAMIC_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = DYNAMIC_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Count Individual</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX___COUNT_INDIVIDUAL = DYNAMIC_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Individual Non Unique Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX___INDIVIDUAL_NON_UNIQUE_ID__DIAGNOSTICCHAIN_MAP = DYNAMIC_CONTENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = DYNAMIC_CONTENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link NewGlot.ContentConcern.impl.IndividualImpl <em>Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NewGlot.ContentConcern.impl.IndividualImpl
	 * @see NewGlot.ContentConcern.impl.ContentConcernPackageImpl#getIndividual()
	 * @generated
	 */
	int INDIVIDUAL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__NAME = DYNAMIC_CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__ID = DYNAMIC_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Enity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL__ENITY = DYNAMIC_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_FEATURE_COUNT = DYNAMIC_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Individual</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_OPERATION_COUNT = DYNAMIC_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NewGlot.ContentConcern.impl.DynamicFormImpl <em>Dynamic Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NewGlot.ContentConcern.impl.DynamicFormImpl
	 * @see NewGlot.ContentConcern.impl.ContentConcernPackageImpl#getDynamicForm()
	 * @generated
	 */
	int DYNAMIC_FORM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FORM__NAME = NewGlotPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FORM__FORM = NewGlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dynamic Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FORM_FEATURE_COUNT = NewGlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dynamic Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FORM_OPERATION_COUNT = NewGlotPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link NewGlot.ContentConcern.impl.AdvertismentImpl <em>Advertisment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see NewGlot.ContentConcern.impl.AdvertismentImpl
	 * @see NewGlot.ContentConcern.impl.ContentConcernPackageImpl#getAdvertisment()
	 * @generated
	 */
	int ADVERTISMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISMENT__NAME = DYNAMIC_CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISMENT__IMAGE = DYNAMIC_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Advertisment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISMENT_FEATURE_COUNT = DYNAMIC_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Advertisment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADVERTISMENT_OPERATION_COUNT = DYNAMIC_CONTENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link NewGlot.ContentConcern.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see NewGlot.ContentConcern.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the reference list '{@link NewGlot.ContentConcern.Page#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see NewGlot.ContentConcern.Page#getLinks()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link NewGlot.ContentConcern.Page#getIndexes <em>Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indexes</em>'.
	 * @see NewGlot.ContentConcern.Page#getIndexes()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Indexes();

	/**
	 * Returns the meta object for the containment reference list '{@link NewGlot.ContentConcern.Page#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forms</em>'.
	 * @see NewGlot.ContentConcern.Page#getForms()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Forms();

	/**
	 * Returns the meta object for the attribute '{@link NewGlot.ContentConcern.Page#getLinkNumber <em>Link Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Link Number</em>'.
	 * @see NewGlot.ContentConcern.Page#getLinkNumber()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_LinkNumber();

	/**
	 * Returns the meta object for the attribute '{@link NewGlot.ContentConcern.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see NewGlot.ContentConcern.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link NewGlot.ContentConcern.Page#getAdvertisements <em>Advertisements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Advertisements</em>'.
	 * @see NewGlot.ContentConcern.Page#getAdvertisements()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Advertisements();

	/**
	 * Returns the meta object for class '{@link NewGlot.ContentConcern.DynamicContent <em>Dynamic Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Content</em>'.
	 * @see NewGlot.ContentConcern.DynamicContent
	 * @generated
	 */
	EClass getDynamicContent();

	/**
	 * Returns the meta object for class '{@link NewGlot.ContentConcern.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see NewGlot.ContentConcern.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link NewGlot.ContentConcern.Index#getIndividuals <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individuals</em>'.
	 * @see NewGlot.ContentConcern.Index#getIndividuals()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_Individuals();

	/**
	 * Returns the meta object for the attribute '{@link NewGlot.ContentConcern.Index#isIsNotEmpty <em>Is Not Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Not Empty</em>'.
	 * @see NewGlot.ContentConcern.Index#isIsNotEmpty()
	 * @see #getIndex()
	 * @generated
	 */
	EAttribute getIndex_IsNotEmpty();

	/**
	 * Returns the meta object for the reference '{@link NewGlot.ContentConcern.Index#getChildrenEntity <em>Children Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Children Entity</em>'.
	 * @see NewGlot.ContentConcern.Index#getChildrenEntity()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_ChildrenEntity();

	/**
	 * Returns the meta object for the '{@link NewGlot.ContentConcern.Index#countIndividual() <em>Count Individual</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count Individual</em>' operation.
	 * @see NewGlot.ContentConcern.Index#countIndividual()
	 * @generated
	 */
	EOperation getIndex__CountIndividual();

	/**
	 * Returns the meta object for the '{@link NewGlot.ContentConcern.Index#IndividualNonUniqueId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Individual Non Unique Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Individual Non Unique Id</em>' operation.
	 * @see NewGlot.ContentConcern.Index#IndividualNonUniqueId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getIndex__IndividualNonUniqueId__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link NewGlot.ContentConcern.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual</em>'.
	 * @see NewGlot.ContentConcern.Individual
	 * @generated
	 */
	EClass getIndividual();

	/**
	 * Returns the meta object for the attribute '{@link NewGlot.ContentConcern.Individual#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see NewGlot.ContentConcern.Individual#getId()
	 * @see #getIndividual()
	 * @generated
	 */
	EAttribute getIndividual_Id();

	/**
	 * Returns the meta object for the reference '{@link NewGlot.ContentConcern.Individual#getEnity <em>Enity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enity</em>'.
	 * @see NewGlot.ContentConcern.Individual#getEnity()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_Enity();

	/**
	 * Returns the meta object for class '{@link NewGlot.ContentConcern.DynamicForm <em>Dynamic Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Form</em>'.
	 * @see NewGlot.ContentConcern.DynamicForm
	 * @generated
	 */
	EClass getDynamicForm();

	/**
	 * Returns the meta object for the reference '{@link NewGlot.ContentConcern.DynamicForm#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Form</em>'.
	 * @see NewGlot.ContentConcern.DynamicForm#getForm()
	 * @see #getDynamicForm()
	 * @generated
	 */
	EReference getDynamicForm_Form();

	/**
	 * Returns the meta object for class '{@link NewGlot.ContentConcern.Advertisment <em>Advertisment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Advertisment</em>'.
	 * @see NewGlot.ContentConcern.Advertisment
	 * @generated
	 */
	EClass getAdvertisment();

	/**
	 * Returns the meta object for the attribute '{@link NewGlot.ContentConcern.Advertisment#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see NewGlot.ContentConcern.Advertisment#getImage()
	 * @see #getAdvertisment()
	 * @generated
	 */
	EAttribute getAdvertisment_Image();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContentConcernFactory getContentConcernFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link NewGlot.ContentConcern.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NewGlot.ContentConcern.impl.PageImpl
		 * @see NewGlot.ContentConcern.impl.ContentConcernPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__LINKS = eINSTANCE.getPage_Links();

		/**
		 * The meta object literal for the '<em><b>Indexes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__INDEXES = eINSTANCE.getPage_Indexes();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__FORMS = eINSTANCE.getPage_Forms();

		/**
		 * The meta object literal for the '<em><b>Link Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__LINK_NUMBER = eINSTANCE.getPage_LinkNumber();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '<em><b>Advertisements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__ADVERTISEMENTS = eINSTANCE.getPage_Advertisements();

		/**
		 * The meta object literal for the '{@link NewGlot.ContentConcern.impl.DynamicContentImpl <em>Dynamic Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NewGlot.ContentConcern.impl.DynamicContentImpl
		 * @see NewGlot.ContentConcern.impl.ContentConcernPackageImpl#getDynamicContent()
		 * @generated
		 */
		EClass DYNAMIC_CONTENT = eINSTANCE.getDynamicContent();

		/**
		 * The meta object literal for the '{@link NewGlot.ContentConcern.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NewGlot.ContentConcern.impl.IndexImpl
		 * @see NewGlot.ContentConcern.impl.ContentConcernPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>Individuals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX__INDIVIDUALS = eINSTANCE.getIndex_Individuals();

		/**
		 * The meta object literal for the '<em><b>Is Not Empty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEX__IS_NOT_EMPTY = eINSTANCE.getIndex_IsNotEmpty();

		/**
		 * The meta object literal for the '<em><b>Children Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX__CHILDREN_ENTITY = eINSTANCE.getIndex_ChildrenEntity();

		/**
		 * The meta object literal for the '<em><b>Count Individual</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INDEX___COUNT_INDIVIDUAL = eINSTANCE.getIndex__CountIndividual();

		/**
		 * The meta object literal for the '<em><b>Individual Non Unique Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INDEX___INDIVIDUAL_NON_UNIQUE_ID__DIAGNOSTICCHAIN_MAP = eINSTANCE.getIndex__IndividualNonUniqueId__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link NewGlot.ContentConcern.impl.IndividualImpl <em>Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NewGlot.ContentConcern.impl.IndividualImpl
		 * @see NewGlot.ContentConcern.impl.ContentConcernPackageImpl#getIndividual()
		 * @generated
		 */
		EClass INDIVIDUAL = eINSTANCE.getIndividual();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIVIDUAL__ID = eINSTANCE.getIndividual_Id();

		/**
		 * The meta object literal for the '<em><b>Enity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL__ENITY = eINSTANCE.getIndividual_Enity();

		/**
		 * The meta object literal for the '{@link NewGlot.ContentConcern.impl.DynamicFormImpl <em>Dynamic Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NewGlot.ContentConcern.impl.DynamicFormImpl
		 * @see NewGlot.ContentConcern.impl.ContentConcernPackageImpl#getDynamicForm()
		 * @generated
		 */
		EClass DYNAMIC_FORM = eINSTANCE.getDynamicForm();

		/**
		 * The meta object literal for the '<em><b>Form</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DYNAMIC_FORM__FORM = eINSTANCE.getDynamicForm_Form();

		/**
		 * The meta object literal for the '{@link NewGlot.ContentConcern.impl.AdvertismentImpl <em>Advertisment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see NewGlot.ContentConcern.impl.AdvertismentImpl
		 * @see NewGlot.ContentConcern.impl.ContentConcernPackageImpl#getAdvertisment()
		 * @generated
		 */
		EClass ADVERTISMENT = eINSTANCE.getAdvertisment();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADVERTISMENT__IMAGE = eINSTANCE.getAdvertisment_Image();

	}

} //ContentConcernPackage
