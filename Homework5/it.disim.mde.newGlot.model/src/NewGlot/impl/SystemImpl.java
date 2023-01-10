/**
 */
package NewGlot.impl;

import NewGlot.ContentConcern.Page;

import NewGlot.DataConcern.Entity;

import NewGlot.FormConcern.Form;

import NewGlot.NewGlotPackage;
import NewGlot.NewGlotTables;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyToStringOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.library.string.StringConcatOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;

import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NewGlot.impl.SystemImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link NewGlot.impl.SystemImpl#getSubversion <em>Subversion</em>}</li>
 *   <li>{@link NewGlot.impl.SystemImpl#getConcatVersion <em>Concat Version</em>}</li>
 *   <li>{@link NewGlot.impl.SystemImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link NewGlot.impl.SystemImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link NewGlot.impl.SystemImpl#getForms <em>Forms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImpl extends NamedElementImpl implements NewGlot.System {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final int VERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected int version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubversion() <em>Subversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubversion()
	 * @generated
	 * @ordered
	 */
	protected static final int SUBVERSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSubversion() <em>Subversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubversion()
	 * @generated
	 * @ordered
	 */
	protected int subversion = SUBVERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getConcatVersion() <em>Concat Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcatVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String CONCAT_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected EList<Form> forms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewGlotPackage.Literals.SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(int newVersion) {
		int oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewGlotPackage.SYSTEM__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSubversion() {
		return subversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubversion(int newSubversion) {
		int oldSubversion = subversion;
		subversion = newSubversion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewGlotPackage.SYSTEM__SUBVERSION, oldSubversion, subversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConcatVersion() {
		/**
		 * concatVersionSubversion()
		 */
		final /*@NonInvalid*/ String concatVersionSubversion = this.concatVersionSubversion();
		return concatVersionSubversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcatVersion(String newConcatVersion) {
		// TODO: implement this method to set the 'Concat Version' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, NewGlotPackage.SYSTEM__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, NewGlotPackage.SYSTEM__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Form> getForms() {
		if (forms == null) {
			forms = new EObjectContainmentEList<Form>(Form.class, this, NewGlotPackage.SYSTEM__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String concatVersionSubversion() {
		/**
		 *
		 * version.toString()
		 * .concat('.')
		 * .concat(subversion.toString())
		 */
		final /*@NonInvalid*/ int version = this.getVersion();
		final /*@NonInvalid*/ IntegerValue BOXED_version = ValueUtil.integerValueOf(version);
		final /*@NonInvalid*/ String toString = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_version);
		final /*@NonInvalid*/ String concat = StringConcatOperation.INSTANCE.evaluate(toString, NewGlotTables.STR_);
		final /*@NonInvalid*/ int subversion = this.getSubversion();
		final /*@NonInvalid*/ IntegerValue BOXED_subversion = ValueUtil.integerValueOf(subversion);
		final /*@NonInvalid*/ String toString_0 = OclAnyToStringOperation.INSTANCE.evaluate(BOXED_subversion);
		final /*@NonInvalid*/ String concat_0 = StringConcatOperation.INSTANCE.evaluate(concat, toString_0);
		return concat_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NonUniquePageName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "System::NonUniquePageName";
		try {
			/**
			 *
			 * inv NonUniquePageName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = ContentConcern::Page.allInstances()
			 *         ->forAll(page |
			 *           pages->select(p | (page.name = p.name))
			 *           ->size() <= 1)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, NewGlotPackage.Literals.SYSTEM___NON_UNIQUE_PAGE_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, NewGlotTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_NewGlot_c_c_ContentConcern_c_c_Page = idResolver.getClass(NewGlotTables.CLSSid_Page, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, NewGlotTables.SET_CLSSid_Page, TYP_NewGlot_c_c_ContentConcern_c_c_Page);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_page = allInstances.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_page.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Page page = (Page)ITERATOR_page.next();
					/**
					 *
					 * pages->select(p | (page.name = p.name))
					 * ->size() <= 1
					 */
					final /*@NonInvalid*/ List<Page> pages = this.getPages();
					final /*@NonInvalid*/ OrderedSetValue BOXED_pages = idResolver.createOrderedSetOfAll(NewGlotTables.ORD_CLSSid_Page, pages);
					/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createOrderedSetAccumulatorValue(NewGlotTables.ORD_CLSSid_Page);
					Iterator<Object> ITERATOR_p = BOXED_pages.iterator();
					/*@NonInvalid*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_p.hasNext()) {
							select = accumulator_0;
							break;
						}
						/*@NonInvalid*/ Page p = (Page)ITERATOR_p.next();
						/**
						 * page.name = p.name
						 */
						final /*@NonInvalid*/ String name = page.getName();
						final /*@NonInvalid*/ String name_0 = p.getName();
						final /*@NonInvalid*/ boolean eq = name.equals(name_0);
						//
						if (eq) {
							accumulator_0.add(p);
						}
					}
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
					final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, NewGlotTables.INT_1).booleanValue();
					//
					if (!le_0) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (le_0) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, NewGlotTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NonUniqueFormName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "System::NonUniqueFormName";
		try {
			/**
			 *
			 * inv NonUniqueFormName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = FormConcern::Form.allInstances()
			 *         ->forAll(form |
			 *           forms->select(f | (form.name = f.name))
			 *           ->size() <= 1)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, NewGlotPackage.Literals.SYSTEM___NON_UNIQUE_FORM_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, NewGlotTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_NewGlot_c_c_FormConcern_c_c_Form = idResolver.getClass(NewGlotTables.CLSSid_Form, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, NewGlotTables.SET_CLSSid_Form, TYP_NewGlot_c_c_FormConcern_c_c_Form);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_form = allInstances.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_form.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Form form = (Form)ITERATOR_form.next();
					/**
					 *
					 * forms->select(f | (form.name = f.name))
					 * ->size() <= 1
					 */
					final /*@NonInvalid*/ List<Form> forms = this.getForms();
					final /*@NonInvalid*/ OrderedSetValue BOXED_forms = idResolver.createOrderedSetOfAll(NewGlotTables.ORD_CLSSid_Form, forms);
					/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createOrderedSetAccumulatorValue(NewGlotTables.ORD_CLSSid_Form);
					Iterator<Object> ITERATOR_f = BOXED_forms.iterator();
					/*@NonInvalid*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_f.hasNext()) {
							select = accumulator_0;
							break;
						}
						/*@NonInvalid*/ Form f = (Form)ITERATOR_f.next();
						/**
						 * form.name = f.name
						 */
						final /*@NonInvalid*/ String name = form.getName();
						final /*@NonInvalid*/ String name_0 = f.getName();
						final /*@NonInvalid*/ boolean eq = name.equals(name_0);
						//
						if (eq) {
							accumulator_0.add(f);
						}
					}
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
					final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, NewGlotTables.INT_1).booleanValue();
					//
					if (!le_0) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (le_0) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, NewGlotTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NonUniqueEntityName(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "System::NonUniqueEntityName";
		try {
			/**
			 *
			 * inv NonUniqueEntityName:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = DataConcern::Entity.allInstances()
			 *         ->forAll(ent |
			 *           entities->select(e | (ent.name = e.name))
			 *           ->size() <= 1)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, NewGlotPackage.Literals.SYSTEM___NON_UNIQUE_ENTITY_NAME__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, NewGlotTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_NewGlot_c_c_DataConcern_c_c_Entity = idResolver.getClass(NewGlotTables.CLSSid_Entity, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, NewGlotTables.SET_CLSSid_Entity, TYP_NewGlot_c_c_DataConcern_c_c_Entity);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_ent = allInstances.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_ent.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Entity ent = (Entity)ITERATOR_ent.next();
					/**
					 *
					 * entities->select(e | (ent.name = e.name))
					 * ->size() <= 1
					 */
					final /*@NonInvalid*/ List<Entity> entities = this.getEntities();
					final /*@NonInvalid*/ OrderedSetValue BOXED_entities = idResolver.createOrderedSetOfAll(NewGlotTables.ORD_CLSSid_Entity, entities);
					/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createOrderedSetAccumulatorValue(NewGlotTables.ORD_CLSSid_Entity);
					Iterator<Object> ITERATOR_e_0 = BOXED_entities.iterator();
					/*@NonInvalid*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_e_0.hasNext()) {
							select = accumulator_0;
							break;
						}
						/*@NonInvalid*/ Entity e_0 = (Entity)ITERATOR_e_0.next();
						/**
						 * ent.name = e.name
						 */
						final /*@NonInvalid*/ String name = ent.getName();
						final /*@NonInvalid*/ String name_0 = e_0.getName();
						final /*@NonInvalid*/ boolean eq = name.equals(name_0);
						//
						if (eq) {
							accumulator_0.add(e_0);
						}
					}
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
					final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, NewGlotTables.INT_1).booleanValue();
					//
					if (!le_0) {					// Normal unsuccessful body evaluation result
						result = ValueUtil.FALSE_VALUE;
						break;														// Stop immediately
					}
					else if (le_0) {				// Normal successful body evaluation result
						;															// Carry on
					}
					else {															// Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, NewGlotTables.INT_0).booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		}
		catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NewGlotPackage.SYSTEM__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case NewGlotPackage.SYSTEM__PAGES:
				return ((InternalEList<?>)getPages()).basicRemove(otherEnd, msgs);
			case NewGlotPackage.SYSTEM__FORMS:
				return ((InternalEList<?>)getForms()).basicRemove(otherEnd, msgs);
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
			case NewGlotPackage.SYSTEM__VERSION:
				return getVersion();
			case NewGlotPackage.SYSTEM__SUBVERSION:
				return getSubversion();
			case NewGlotPackage.SYSTEM__CONCAT_VERSION:
				return getConcatVersion();
			case NewGlotPackage.SYSTEM__ENTITIES:
				return getEntities();
			case NewGlotPackage.SYSTEM__PAGES:
				return getPages();
			case NewGlotPackage.SYSTEM__FORMS:
				return getForms();
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
			case NewGlotPackage.SYSTEM__VERSION:
				setVersion((Integer)newValue);
				return;
			case NewGlotPackage.SYSTEM__SUBVERSION:
				setSubversion((Integer)newValue);
				return;
			case NewGlotPackage.SYSTEM__CONCAT_VERSION:
				setConcatVersion((String)newValue);
				return;
			case NewGlotPackage.SYSTEM__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case NewGlotPackage.SYSTEM__PAGES:
				getPages().clear();
				getPages().addAll((Collection<? extends Page>)newValue);
				return;
			case NewGlotPackage.SYSTEM__FORMS:
				getForms().clear();
				getForms().addAll((Collection<? extends Form>)newValue);
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
			case NewGlotPackage.SYSTEM__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case NewGlotPackage.SYSTEM__SUBVERSION:
				setSubversion(SUBVERSION_EDEFAULT);
				return;
			case NewGlotPackage.SYSTEM__CONCAT_VERSION:
				setConcatVersion(CONCAT_VERSION_EDEFAULT);
				return;
			case NewGlotPackage.SYSTEM__ENTITIES:
				getEntities().clear();
				return;
			case NewGlotPackage.SYSTEM__PAGES:
				getPages().clear();
				return;
			case NewGlotPackage.SYSTEM__FORMS:
				getForms().clear();
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
			case NewGlotPackage.SYSTEM__VERSION:
				return version != VERSION_EDEFAULT;
			case NewGlotPackage.SYSTEM__SUBVERSION:
				return subversion != SUBVERSION_EDEFAULT;
			case NewGlotPackage.SYSTEM__CONCAT_VERSION:
				return CONCAT_VERSION_EDEFAULT == null ? getConcatVersion() != null : !CONCAT_VERSION_EDEFAULT.equals(getConcatVersion());
			case NewGlotPackage.SYSTEM__ENTITIES:
				return entities != null && !entities.isEmpty();
			case NewGlotPackage.SYSTEM__PAGES:
				return pages != null && !pages.isEmpty();
			case NewGlotPackage.SYSTEM__FORMS:
				return forms != null && !forms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case NewGlotPackage.SYSTEM___CONCAT_VERSION_SUBVERSION:
				return concatVersionSubversion();
			case NewGlotPackage.SYSTEM___NON_UNIQUE_PAGE_NAME__DIAGNOSTICCHAIN_MAP:
				return NonUniquePageName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case NewGlotPackage.SYSTEM___NON_UNIQUE_FORM_NAME__DIAGNOSTICCHAIN_MAP:
				return NonUniqueFormName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case NewGlotPackage.SYSTEM___NON_UNIQUE_ENTITY_NAME__DIAGNOSTICCHAIN_MAP:
				return NonUniqueEntityName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (version: ");
		result.append(version);
		result.append(", subversion: ");
		result.append(subversion);
		result.append(')');
		return result.toString();
	}

} //SystemImpl
