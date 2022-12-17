/**
 */
package Glot.ContentConcern;

import Glot.GlotPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see Glot.ContentConcern.ContentConcernFactory
 * @model kind="package"
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
	ContentConcernPackage eINSTANCE = Glot.ContentConcern.impl.ContentConcernPackageImpl.init();

	/**
	 * The meta object id for the '{@link Glot.ContentConcern.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Glot.ContentConcern.impl.PageImpl
	 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getPage()
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
	int PAGE__NAME = GlotPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LINKS = GlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__INDEXES = GlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__FORMS = GlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = GlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = GlotPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Glot.ContentConcern.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Glot.ContentConcern.impl.ContentImpl
	 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__NAME = GlotPackage.NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = GlotPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = GlotPackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Glot.ContentConcern.impl.DynamicContentImpl <em>Dynamic Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Glot.ContentConcern.impl.DynamicContentImpl
	 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getDynamicContent()
	 * @generated
	 */
	int DYNAMIC_CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTENT__NAME = CONTENT__NAME;

	/**
	 * The number of structural features of the '<em>Dynamic Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTENT_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dynamic Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CONTENT_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Glot.ContentConcern.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Glot.ContentConcern.impl.IndexImpl
	 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 3;

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
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = DYNAMIC_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = DYNAMIC_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Glot.ContentConcern.impl.IndividualImpl <em>Individual</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Glot.ContentConcern.impl.IndividualImpl
	 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getIndividual()
	 * @generated
	 */
	int INDIVIDUAL = 4;

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
	 * The meta object id for the '{@link Glot.ContentConcern.impl.DynamicFormImpl <em>Dynamic Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Glot.ContentConcern.impl.DynamicFormImpl
	 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getDynamicForm()
	 * @generated
	 */
	int DYNAMIC_FORM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FORM__NAME = CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FORM__FORM = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dynamic Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FORM_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dynamic Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_FORM_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Glot.ContentConcern.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see Glot.ContentConcern.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the reference list '{@link Glot.ContentConcern.Page#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see Glot.ContentConcern.Page#getLinks()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link Glot.ContentConcern.Page#getIndexes <em>Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indexes</em>'.
	 * @see Glot.ContentConcern.Page#getIndexes()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Indexes();

	/**
	 * Returns the meta object for the containment reference list '{@link Glot.ContentConcern.Page#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forms</em>'.
	 * @see Glot.ContentConcern.Page#getForms()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Forms();

	/**
	 * Returns the meta object for class '{@link Glot.ContentConcern.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see Glot.ContentConcern.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for class '{@link Glot.ContentConcern.DynamicContent <em>Dynamic Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Content</em>'.
	 * @see Glot.ContentConcern.DynamicContent
	 * @generated
	 */
	EClass getDynamicContent();

	/**
	 * Returns the meta object for class '{@link Glot.ContentConcern.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see Glot.ContentConcern.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link Glot.ContentConcern.Index#getIndividuals <em>Individuals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individuals</em>'.
	 * @see Glot.ContentConcern.Index#getIndividuals()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_Individuals();

	/**
	 * Returns the meta object for class '{@link Glot.ContentConcern.Individual <em>Individual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual</em>'.
	 * @see Glot.ContentConcern.Individual
	 * @generated
	 */
	EClass getIndividual();

	/**
	 * Returns the meta object for the attribute '{@link Glot.ContentConcern.Individual#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Glot.ContentConcern.Individual#getId()
	 * @see #getIndividual()
	 * @generated
	 */
	EAttribute getIndividual_Id();

	/**
	 * Returns the meta object for the reference '{@link Glot.ContentConcern.Individual#getEnity <em>Enity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enity</em>'.
	 * @see Glot.ContentConcern.Individual#getEnity()
	 * @see #getIndividual()
	 * @generated
	 */
	EReference getIndividual_Enity();

	/**
	 * Returns the meta object for class '{@link Glot.ContentConcern.DynamicForm <em>Dynamic Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Form</em>'.
	 * @see Glot.ContentConcern.DynamicForm
	 * @generated
	 */
	EClass getDynamicForm();

	/**
	 * Returns the meta object for the reference '{@link Glot.ContentConcern.DynamicForm#getForm <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Form</em>'.
	 * @see Glot.ContentConcern.DynamicForm#getForm()
	 * @see #getDynamicForm()
	 * @generated
	 */
	EReference getDynamicForm_Form();

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
		 * The meta object literal for the '{@link Glot.ContentConcern.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Glot.ContentConcern.impl.PageImpl
		 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getPage()
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
		 * The meta object literal for the '{@link Glot.ContentConcern.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Glot.ContentConcern.impl.ContentImpl
		 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '{@link Glot.ContentConcern.impl.DynamicContentImpl <em>Dynamic Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Glot.ContentConcern.impl.DynamicContentImpl
		 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getDynamicContent()
		 * @generated
		 */
		EClass DYNAMIC_CONTENT = eINSTANCE.getDynamicContent();

		/**
		 * The meta object literal for the '{@link Glot.ContentConcern.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Glot.ContentConcern.impl.IndexImpl
		 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getIndex()
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
		 * The meta object literal for the '{@link Glot.ContentConcern.impl.IndividualImpl <em>Individual</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Glot.ContentConcern.impl.IndividualImpl
		 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getIndividual()
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
		 * The meta object literal for the '{@link Glot.ContentConcern.impl.DynamicFormImpl <em>Dynamic Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Glot.ContentConcern.impl.DynamicFormImpl
		 * @see Glot.ContentConcern.impl.ContentConcernPackageImpl#getDynamicForm()
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

	}

} //ContentConcernPackage
