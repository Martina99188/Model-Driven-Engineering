/**
 */
package NewGlot.ContentConcern.impl;

import NewGlot.ContentConcern.ContentConcernPackage;
import NewGlot.ContentConcern.ContentConcernTables;
import NewGlot.ContentConcern.Index;
import NewGlot.ContentConcern.Individual;

import NewGlot.DataConcern.Entity;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

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

import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

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
 * An implementation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link NewGlot.ContentConcern.impl.IndexImpl#getIndividuals <em>Individuals</em>}</li>
 *   <li>{@link NewGlot.ContentConcern.impl.IndexImpl#isIsNotEmpty <em>Is Not Empty</em>}</li>
 *   <li>{@link NewGlot.ContentConcern.impl.IndexImpl#getChildrenEntity <em>Children Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndexImpl extends DynamicContentImpl implements Index {
	/**
	 * The cached value of the '{@link #getIndividuals() <em>Individuals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividuals()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> individuals;

	/**
	 * The default value of the '{@link #isIsNotEmpty() <em>Is Not Empty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNotEmpty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NOT_EMPTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getChildrenEntity() <em>Children Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity childrenEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentConcernPackage.Literals.INDEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getIndividuals() {
		if (individuals == null) {
			individuals = new EObjectContainmentEList<Individual>(Individual.class, this, ContentConcernPackage.INDEX__INDIVIDUALS);
		}
		return individuals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNotEmpty() {
		/**
		 * countIndividual() > 0
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ BigInteger countIndividual = this.countIndividual();
		final /*@NonInvalid*/ IntegerValue BOXED_countIndividual = ValueUtil.integerValueOf(countIndividual);
		final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE.evaluate(executor, BOXED_countIndividual, ContentConcernTables.INT_0).booleanValue();
		return gt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNotEmpty(boolean newIsNotEmpty) {
		// TODO: implement this method to set the 'Is Not Empty' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getChildrenEntity() {
		if (childrenEntity != null && childrenEntity.eIsProxy()) {
			InternalEObject oldChildrenEntity = (InternalEObject)childrenEntity;
			childrenEntity = (Entity)eResolveProxy(oldChildrenEntity);
			if (childrenEntity != oldChildrenEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ContentConcernPackage.INDEX__CHILDREN_ENTITY, oldChildrenEntity, childrenEntity));
			}
		}
		return childrenEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetChildrenEntity() {
		return childrenEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildrenEntity(Entity newChildrenEntity) {
		Entity oldChildrenEntity = childrenEntity;
		childrenEntity = newChildrenEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentConcernPackage.INDEX__CHILDREN_ENTITY, oldChildrenEntity, childrenEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger countIndividual() {
		/**
		 * individuals->size()
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ List<Individual> individuals = this.getIndividuals();
		final /*@NonInvalid*/ OrderedSetValue BOXED_individuals = idResolver.createOrderedSetOfAll(ContentConcernTables.ORD_CLSSid_Individual, individuals);
		final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_individuals);
		final BigInteger ECORE_size = ValueUtil.bigIntegerValueOf(size);
		return ECORE_size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean IndividualNonUniqueId(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Index::IndividualNonUniqueId";
		try {
			/**
			 *
			 * inv IndividualNonUniqueId:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = Individual.allInstances()
			 *         ->forAll(ind |
			 *           individuals->select(i | (ind.id = i.id))
			 *           ->size() <= 1)
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ContentConcernPackage.Literals.INDEX___INDIVIDUAL_NON_UNIQUE_ID__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ContentConcernTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_NewGlot_c_c_ContentConcern_c_c_Individual = idResolver.getClass(ContentConcernTables.CLSSid_Individual, null);
				final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor, ContentConcernTables.SET_CLSSid_Individual, TYP_NewGlot_c_c_ContentConcern_c_c_Individual);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_ind = allInstances.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_ind.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						}
						else {
							throw (InvalidValueException)accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Individual ind = (Individual)ITERATOR_ind.next();
					/**
					 *
					 * individuals->select(i | (ind.id = i.id))
					 * ->size() <= 1
					 */
					final /*@NonInvalid*/ List<Individual> individuals = this.getIndividuals();
					final /*@NonInvalid*/ OrderedSetValue BOXED_individuals = idResolver.createOrderedSetOfAll(ContentConcernTables.ORD_CLSSid_Individual, individuals);
					/*@Thrown*/ Accumulator accumulator_0 = ValueUtil.createOrderedSetAccumulatorValue(ContentConcernTables.ORD_CLSSid_Individual);
					Iterator<Object> ITERATOR_i = BOXED_individuals.iterator();
					/*@NonInvalid*/ OrderedSetValue select;
					while (true) {
						if (!ITERATOR_i.hasNext()) {
							select = accumulator_0;
							break;
						}
						/*@NonInvalid*/ Individual i = (Individual)ITERATOR_i.next();
						/**
						 * ind.id = i.id
						 */
						final /*@NonInvalid*/ int id = ind.getId();
						final /*@NonInvalid*/ int id_0 = i.getId();
						final /*@NonInvalid*/ boolean eq = id == id_0;
						//
						if (eq) {
							accumulator_0.add(i);
						}
					}
					final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(select);
					final /*@NonInvalid*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, size, ContentConcernTables.INT_1).booleanValue();
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
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ContentConcernTables.INT_0).booleanValue();
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
			case ContentConcernPackage.INDEX__INDIVIDUALS:
				return ((InternalEList<?>)getIndividuals()).basicRemove(otherEnd, msgs);
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
			case ContentConcernPackage.INDEX__INDIVIDUALS:
				return getIndividuals();
			case ContentConcernPackage.INDEX__IS_NOT_EMPTY:
				return isIsNotEmpty();
			case ContentConcernPackage.INDEX__CHILDREN_ENTITY:
				if (resolve) return getChildrenEntity();
				return basicGetChildrenEntity();
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
			case ContentConcernPackage.INDEX__INDIVIDUALS:
				getIndividuals().clear();
				getIndividuals().addAll((Collection<? extends Individual>)newValue);
				return;
			case ContentConcernPackage.INDEX__IS_NOT_EMPTY:
				setIsNotEmpty((Boolean)newValue);
				return;
			case ContentConcernPackage.INDEX__CHILDREN_ENTITY:
				setChildrenEntity((Entity)newValue);
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
			case ContentConcernPackage.INDEX__INDIVIDUALS:
				getIndividuals().clear();
				return;
			case ContentConcernPackage.INDEX__IS_NOT_EMPTY:
				setIsNotEmpty(IS_NOT_EMPTY_EDEFAULT);
				return;
			case ContentConcernPackage.INDEX__CHILDREN_ENTITY:
				setChildrenEntity((Entity)null);
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
			case ContentConcernPackage.INDEX__INDIVIDUALS:
				return individuals != null && !individuals.isEmpty();
			case ContentConcernPackage.INDEX__IS_NOT_EMPTY:
				return isIsNotEmpty() != IS_NOT_EMPTY_EDEFAULT;
			case ContentConcernPackage.INDEX__CHILDREN_ENTITY:
				return childrenEntity != null;
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
			case ContentConcernPackage.INDEX___COUNT_INDIVIDUAL:
				return countIndividual();
			case ContentConcernPackage.INDEX___INDIVIDUAL_NON_UNIQUE_ID__DIAGNOSTICCHAIN_MAP:
				return IndividualNonUniqueId((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //IndexImpl
