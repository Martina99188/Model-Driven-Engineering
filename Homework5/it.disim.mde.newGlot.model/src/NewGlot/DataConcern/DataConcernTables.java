/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 * using:
 *   /it.disim.mde.newGlot.model/NewGlot.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package NewGlot.DataConcern;

import NewGlot.ContentConcern.ContentConcernPackage;
// import NewGlot.DataConcern.DataConcernPackage;
// import NewGlot.DataConcern.DataConcernTables;
import NewGlot.FormConcern.FormConcernPackage;
import NewGlot.NewGlotPackage;
import NewGlot.NewGlotTables;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

/**
 * DataConcernTables provides the dispatch tables for the DataConcern for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class DataConcernTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(DataConcernPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_it_disim_mde_s_newGlot = IdManager.getNsURIPackageId("http://it.disim.mde/newGlot", null, NewGlotPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_disim_mde_s_glot_s_contentConcern = IdManager.getNsURIPackageId("https://it.disim.mde/glot/contentConcern", null, ContentConcernPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_disim_mde_s_glot_s_dataConcern = IdManager.getNsURIPackageId("https://it.disim.mde/glot/dataConcern", null, DataConcernPackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_it_disim_mde_s_glot_s_formConcern = IdManager.getNsURIPackageId("https://it.disim.mde/glot/formConcern", null, FormConcernPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Attribute = DataConcernTables.PACKid_https_c_s_s_it_disim_mde_s_glot_s_dataConcern.getClassId("Attribute", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Element = DataConcernTables.PACKid_https_c_s_s_it_disim_mde_s_glot_s_formConcern.getClassId("Element", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Entity = DataConcernTables.PACKid_https_c_s_s_it_disim_mde_s_glot_s_dataConcern.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Form = DataConcernTables.PACKid_https_c_s_s_it_disim_mde_s_glot_s_formConcern.getClassId("Form", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Index = DataConcernTables.PACKid_https_c_s_s_it_disim_mde_s_glot_s_contentConcern.getClassId("Index", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Individual = DataConcernTables.PACKid_https_c_s_s_it_disim_mde_s_glot_s_contentConcern.getClassId("Individual", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Reference = DataConcernTables.PACKid_https_c_s_s_it_disim_mde_s_glot_s_dataConcern.getClassId("Reference", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_System = DataConcernTables.PACKid_http_c_s_s_it_disim_mde_s_newGlot.getClassId("System", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid__DataType = DataConcernTables.PACKid_https_c_s_s_it_disim_mde_s_glot_s_dataConcern.getEnumerationId("_DataType");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Element = TypeId.BAG.getSpecializedId(DataConcernTables.CLSSid_Element, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Form = TypeId.BAG.getSpecializedId(DataConcernTables.CLSSid_Form, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Index = TypeId.BAG.getSpecializedId(DataConcernTables.CLSSid_Index, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Individual = TypeId.BAG.getSpecializedId(DataConcernTables.CLSSid_Individual, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Reference = TypeId.BAG.getSpecializedId(DataConcernTables.CLSSid_Reference, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Attribute = TypeId.ORDERED_SET.getSpecializedId(DataConcernTables.CLSSid_Attribute, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Reference = TypeId.ORDERED_SET.getSpecializedId(DataConcernTables.CLSSid_Reference, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			DataConcernTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataConcernTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Attribute = new EcoreExecutorType(DataConcernPackage.Literals.ATTRIBUTE, PACKAGE, 0);
		public static final EcoreExecutorType _Entity = new EcoreExecutorType(DataConcernPackage.Literals.ENTITY, PACKAGE, 0);
		public static final EcoreExecutorType _Reference = new EcoreExecutorType(DataConcernPackage.Literals.REFERENCE, PACKAGE, 0);
		public static final EcoreExecutorEnumeration __DataType = new EcoreExecutorEnumeration(DataConcernPackage.Literals._DATA_TYPE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Attribute,
			_Entity,
			_Reference,
			__DataType
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataConcernTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Attribute__Attribute = new ExecutorFragment(Types._Attribute, DataConcernTables.Types._Attribute);
		private static final ExecutorFragment _Attribute__NamedElement = new ExecutorFragment(Types._Attribute, NewGlotTables.Types._NamedElement);
		private static final ExecutorFragment _Attribute__OclAny = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Attribute__OclElement = new ExecutorFragment(Types._Attribute, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Entity__Entity = new ExecutorFragment(Types._Entity, DataConcernTables.Types._Entity);
		private static final ExecutorFragment _Entity__NamedElement = new ExecutorFragment(Types._Entity, NewGlotTables.Types._NamedElement);
		private static final ExecutorFragment _Entity__OclAny = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Entity__OclElement = new ExecutorFragment(Types._Entity, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Reference__NamedElement = new ExecutorFragment(Types._Reference, NewGlotTables.Types._NamedElement);
		private static final ExecutorFragment _Reference__OclAny = new ExecutorFragment(Types._Reference, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Reference__OclElement = new ExecutorFragment(Types._Reference, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Reference__Reference = new ExecutorFragment(Types._Reference, DataConcernTables.Types._Reference);

		private static final ExecutorFragment __DataType__OclAny = new ExecutorFragment(Types.__DataType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment __DataType__OclElement = new ExecutorFragment(Types.__DataType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment __DataType__OclEnumeration = new ExecutorFragment(Types.__DataType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment __DataType__OclType = new ExecutorFragment(Types.__DataType, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment __DataType___DataType = new ExecutorFragment(Types.__DataType, DataConcernTables.Types.__DataType);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataConcernTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataConcernTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataConcernTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Attribute__isPrimaryKey = new EcoreExecutorProperty(DataConcernPackage.Literals.ATTRIBUTE__IS_PRIMARY_KEY, Types._Attribute, 0);
		public static final ExecutorProperty _Attribute__type = new EcoreExecutorProperty(DataConcernPackage.Literals.ATTRIBUTE__TYPE, Types._Attribute, 1);
		public static final ExecutorProperty _Attribute__Element__attribute = new ExecutorPropertyWithImplementation("Element", Types._Attribute, 2, new EcoreLibraryOppositeProperty(FormConcernPackage.Literals.ELEMENT__ATTRIBUTE));
		public static final ExecutorProperty _Attribute__Entity__attributes = new ExecutorPropertyWithImplementation("Entity", Types._Attribute, 3, new EcoreLibraryOppositeProperty(DataConcernPackage.Literals.ENTITY__ATTRIBUTES));

		public static final ExecutorProperty _Entity__attributes = new EcoreExecutorProperty(DataConcernPackage.Literals.ENTITY__ATTRIBUTES, Types._Entity, 0);
		public static final ExecutorProperty _Entity__references = new EcoreExecutorProperty(DataConcernPackage.Literals.ENTITY__REFERENCES, Types._Entity, 1);
		public static final ExecutorProperty _Entity__Form__entity = new ExecutorPropertyWithImplementation("Form", Types._Entity, 2, new EcoreLibraryOppositeProperty(FormConcernPackage.Literals.FORM__ENTITY));
		public static final ExecutorProperty _Entity__Index__childrenEntity = new ExecutorPropertyWithImplementation("Index", Types._Entity, 3, new EcoreLibraryOppositeProperty(ContentConcernPackage.Literals.INDEX__CHILDREN_ENTITY));
		public static final ExecutorProperty _Entity__Individual__enity = new ExecutorPropertyWithImplementation("Individual", Types._Entity, 4, new EcoreLibraryOppositeProperty(ContentConcernPackage.Literals.INDIVIDUAL__ENITY));
		public static final ExecutorProperty _Entity__Reference__foreignKey = new ExecutorPropertyWithImplementation("Reference", Types._Entity, 5, new EcoreLibraryOppositeProperty(DataConcernPackage.Literals.REFERENCE__FOREIGN_KEY));
		public static final ExecutorProperty _Entity__System__entities = new ExecutorPropertyWithImplementation("System", Types._Entity, 6, new EcoreLibraryOppositeProperty(NewGlotPackage.Literals.SYSTEM__ENTITIES));

		public static final ExecutorProperty _Reference__foreignKey = new EcoreExecutorProperty(DataConcernPackage.Literals.REFERENCE__FOREIGN_KEY, Types._Reference, 0);
		public static final ExecutorProperty _Reference__Entity__references = new ExecutorPropertyWithImplementation("Entity", Types._Reference, 1, new EcoreLibraryOppositeProperty(DataConcernPackage.Literals.ENTITY__REFERENCES));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataConcernTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Attribute =
			{
				Fragments._Attribute__OclAny /* 0 */,
				Fragments._Attribute__OclElement /* 1 */,
				Fragments._Attribute__NamedElement /* 2 */,
				Fragments._Attribute__Attribute /* 3 */
			};
		private static final int /*@NonNull*/ [] __Attribute = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Entity =
			{
				Fragments._Entity__OclAny /* 0 */,
				Fragments._Entity__OclElement /* 1 */,
				Fragments._Entity__NamedElement /* 2 */,
				Fragments._Entity__Entity /* 3 */
			};
		private static final int /*@NonNull*/ [] __Entity = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Reference =
			{
				Fragments._Reference__OclAny /* 0 */,
				Fragments._Reference__OclElement /* 1 */,
				Fragments._Reference__NamedElement /* 2 */,
				Fragments._Reference__Reference /* 3 */
			};
		private static final int /*@NonNull*/ [] __Reference = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] __DataType =
			{
				Fragments.__DataType__OclAny /* 0 */,
				Fragments.__DataType__OclElement /* 1 */,
				Fragments.__DataType__OclType /* 2 */,
				Fragments.__DataType__OclEnumeration /* 3 */,
				Fragments.__DataType___DataType /* 4 */
			};
		private static final int /*@NonNull*/ [] ___DataType = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Attribute.initFragments(_Attribute, __Attribute);
			Types._Entity.initFragments(_Entity, __Entity);
			Types._Reference.initFragments(_Reference, __Reference);
			Types.__DataType.initFragments(__DataType, ___DataType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataConcernTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__Attribute = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Attribute__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Entity__Entity = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Entity__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Reference__Reference = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Reference__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Reference__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Reference__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] __DataType___DataType = {};
		private static final ExecutorOperation /*@NonNull*/ [] __DataType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] __DataType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] __DataType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] __DataType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Attribute__Attribute.initOperations(_Attribute__Attribute);
			Fragments._Attribute__NamedElement.initOperations(_Attribute__NamedElement);
			Fragments._Attribute__OclAny.initOperations(_Attribute__OclAny);
			Fragments._Attribute__OclElement.initOperations(_Attribute__OclElement);

			Fragments._Entity__Entity.initOperations(_Entity__Entity);
			Fragments._Entity__NamedElement.initOperations(_Entity__NamedElement);
			Fragments._Entity__OclAny.initOperations(_Entity__OclAny);
			Fragments._Entity__OclElement.initOperations(_Entity__OclElement);

			Fragments._Reference__NamedElement.initOperations(_Reference__NamedElement);
			Fragments._Reference__OclAny.initOperations(_Reference__OclAny);
			Fragments._Reference__OclElement.initOperations(_Reference__OclElement);
			Fragments._Reference__Reference.initOperations(_Reference__Reference);

			Fragments.__DataType__OclAny.initOperations(__DataType__OclAny);
			Fragments.__DataType__OclElement.initOperations(__DataType__OclElement);
			Fragments.__DataType__OclEnumeration.initOperations(__DataType__OclEnumeration);
			Fragments.__DataType__OclType.initOperations(__DataType__OclType);
			Fragments.__DataType___DataType.initOperations(__DataType___DataType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataConcernTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Attribute = {
			DataConcernTables.Properties._Attribute__isPrimaryKey,
			NewGlotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataConcernTables.Properties._Attribute__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Entity = {
			DataConcernTables.Properties._Entity__attributes,
			NewGlotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DataConcernTables.Properties._Entity__references
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Reference = {
			DataConcernTables.Properties._Reference__foreignKey,
			NewGlotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] __DataType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Attribute__Attribute.initProperties(_Attribute);
			Fragments._Entity__Entity.initProperties(_Entity);
			Fragments._Reference__Reference.initProperties(_Reference);
			Fragments.__DataType___DataType.initProperties(__DataType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataConcernTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral __DataType__String = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("String"), Types.__DataType, 0);
		public static final EcoreExecutorEnumerationLiteral __DataType__int = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("int"), Types.__DataType, 1);
		public static final EcoreExecutorEnumerationLiteral __DataType__Text = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("Text"), Types.__DataType, 2);
		public static final EcoreExecutorEnumerationLiteral __DataType__boolean = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("boolean"), Types.__DataType, 3);
		public static final EcoreExecutorEnumerationLiteral __DataType__Date = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("Date"), Types.__DataType, 4);
		public static final EcoreExecutorEnumerationLiteral __DataType__File = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("File"), Types.__DataType, 5);
		public static final EcoreExecutorEnumerationLiteral __DataType__Currency = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("Currency"), Types.__DataType, 6);
		public static final EcoreExecutorEnumerationLiteral __DataType__Percent = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("Percent"), Types.__DataType, 7);
		public static final EcoreExecutorEnumerationLiteral __DataType__Image = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("Image"), Types.__DataType, 8);
		public static final EcoreExecutorEnumerationLiteral __DataType__Images = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("Images"), Types.__DataType, 9);
		public static final EcoreExecutorEnumerationLiteral __DataType__double = new EcoreExecutorEnumerationLiteral(DataConcernPackage.Literals._DATA_TYPE.getEEnumLiteral("double"), Types.__DataType, 10);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] __DataType = {
			__DataType__String,
			__DataType__int,
			__DataType__Text,
			__DataType__boolean,
			__DataType__Date,
			__DataType__File,
			__DataType__Currency,
			__DataType__Percent,
			__DataType__Image,
			__DataType__Images,
			__DataType__double
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types.__DataType.initLiterals(__DataType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DataConcernTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new DataConcernTables();
	}

	private DataConcernTables() {
		super(DataConcernPackage.eNS_URI);
	}
}
