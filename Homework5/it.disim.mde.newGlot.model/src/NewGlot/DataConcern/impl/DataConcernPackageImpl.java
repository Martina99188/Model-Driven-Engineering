/**
 */
package NewGlot.DataConcern.impl;

import NewGlot.ContentConcern.ContentConcernPackage;

import NewGlot.ContentConcern.impl.ContentConcernPackageImpl;

import NewGlot.DataConcern.Attribute;
import NewGlot.DataConcern.DataConcernFactory;
import NewGlot.DataConcern.DataConcernPackage;
import NewGlot.DataConcern.Entity;
import NewGlot.DataConcern.Reference;
import NewGlot.DataConcern._DataType;

import NewGlot.FormConcern.FormConcernPackage;

import NewGlot.FormConcern.impl.FormConcernPackageImpl;

import NewGlot.NewGlotPackage;

import NewGlot.impl.NewGlotPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataConcernPackageImpl extends EPackageImpl implements DataConcernPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum _DataTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see NewGlot.DataConcern.DataConcernPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataConcernPackageImpl() {
		super(eNS_URI, DataConcernFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DataConcernPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataConcernPackage init() {
		if (isInited) return (DataConcernPackage)EPackage.Registry.INSTANCE.getEPackage(DataConcernPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataConcernPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataConcernPackageImpl theDataConcernPackage = registeredDataConcernPackage instanceof DataConcernPackageImpl ? (DataConcernPackageImpl)registeredDataConcernPackage : new DataConcernPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NewGlotPackage.eNS_URI);
		NewGlotPackageImpl theNewGlotPackage = (NewGlotPackageImpl)(registeredPackage instanceof NewGlotPackageImpl ? registeredPackage : NewGlotPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentConcernPackage.eNS_URI);
		ContentConcernPackageImpl theContentConcernPackage = (ContentConcernPackageImpl)(registeredPackage instanceof ContentConcernPackageImpl ? registeredPackage : ContentConcernPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FormConcernPackage.eNS_URI);
		FormConcernPackageImpl theFormConcernPackage = (FormConcernPackageImpl)(registeredPackage instanceof FormConcernPackageImpl ? registeredPackage : FormConcernPackage.eINSTANCE);

		// Create package meta-data objects
		theDataConcernPackage.createPackageContents();
		theNewGlotPackage.createPackageContents();
		theContentConcernPackage.createPackageContents();
		theFormConcernPackage.createPackageContents();

		// Initialize created meta-data
		theDataConcernPackage.initializePackageContents();
		theNewGlotPackage.initializePackageContents();
		theContentConcernPackage.initializePackageContents();
		theFormConcernPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataConcernPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataConcernPackage.eNS_URI, theDataConcernPackage);
		return theDataConcernPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_IsPrimaryKey() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_Attributes() {
		return (EReference)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntity_References() {
		return (EReference)entityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReference_ForeignKey() {
		return (EReference)referenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum get_DataType() {
		return _DataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConcernFactory getDataConcernFactory() {
		return (DataConcernFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__IS_PRIMARY_KEY);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);

		entityEClass = createEClass(ENTITY);
		createEReference(entityEClass, ENTITY__ATTRIBUTES);
		createEReference(entityEClass, ENTITY__REFERENCES);

		referenceEClass = createEClass(REFERENCE);
		createEReference(referenceEClass, REFERENCE__FOREIGN_KEY);

		// Create enums
		_DataTypeEEnum = createEEnum(_DATA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NewGlotPackage theNewGlotPackage = (NewGlotPackage)EPackage.Registry.INSTANCE.getEPackage(NewGlotPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		attributeEClass.getESuperTypes().add(theNewGlotPackage.getNamedElement());
		entityEClass.getESuperTypes().add(theNewGlotPackage.getNamedElement());
		referenceEClass.getESuperTypes().add(theNewGlotPackage.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_IsPrimaryKey(), ecorePackage.getEBoolean(), "isPrimaryKey", "false", 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Type(), this.get_DataType(), "type", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntity_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntity_References(), this.getReference(), null, "references", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReference_ForeignKey(), this.getEntity(), null, "foreignKey", null, 0, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(_DataTypeEEnum, _DataType.class, "_DataType");
		addEEnumLiteral(_DataTypeEEnum, _DataType.STRING);
		addEEnumLiteral(_DataTypeEEnum, _DataType.INT);
		addEEnumLiteral(_DataTypeEEnum, _DataType.TEXT);
		addEEnumLiteral(_DataTypeEEnum, _DataType.BOOLEAN);
		addEEnumLiteral(_DataTypeEEnum, _DataType.DATE);
		addEEnumLiteral(_DataTypeEEnum, _DataType.FILE);
		addEEnumLiteral(_DataTypeEEnum, _DataType.CURRENCY);
		addEEnumLiteral(_DataTypeEEnum, _DataType.PERCENT);
		addEEnumLiteral(_DataTypeEEnum, _DataType.IMAGE);
		addEEnumLiteral(_DataTypeEEnum, _DataType.IMAGES);
		addEEnumLiteral(_DataTypeEEnum, _DataType.DOUBLE);
	}

} //DataConcernPackageImpl
