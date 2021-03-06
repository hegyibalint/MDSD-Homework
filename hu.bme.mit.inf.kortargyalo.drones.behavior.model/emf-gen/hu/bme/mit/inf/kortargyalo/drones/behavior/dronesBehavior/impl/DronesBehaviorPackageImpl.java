/**
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.impl;

import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.AtomicStatement;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Charge;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.ComplexWait;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Cooperate;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorFactory;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Move;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Reaction;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Scan;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Script;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendMap;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendSignal;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Signal;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SimpleWait;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Statement;
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Wait;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructurePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xtype.XtypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DronesBehaviorPackageImpl extends EPackageImpl implements DronesBehaviorPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dronesBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cooperateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleWaitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexWaitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chargeEClass = null;

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
	 * @see hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DronesBehaviorPackageImpl() {
		super(eNS_URI, DronesBehaviorFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DronesBehaviorPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DronesBehaviorPackage init() {
		if (isInited) return (DronesBehaviorPackage)EPackage.Registry.INSTANCE.getEPackage(DronesBehaviorPackage.eNS_URI);

		// Obtain or create and register package
		DronesBehaviorPackageImpl theDronesBehaviorPackage = (DronesBehaviorPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DronesBehaviorPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DronesBehaviorPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		DronesStructurePackage.eINSTANCE.eClass();
		XtypePackage.eINSTANCE.eClass();
		XbasePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDronesBehaviorPackage.createPackageContents();

		// Initialize created meta-data
		theDronesBehaviorPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDronesBehaviorPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DronesBehaviorPackage.eNS_URI, theDronesBehaviorPackage);
		return theDronesBehaviorPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDronesBehavior() {
		return dronesBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDronesBehavior_Scripts() {
		return (EReference)dronesBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDronesBehavior_Signals() {
		return (EReference)dronesBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDronesBehavior_Scenario() {
		return (EReference)dronesBehaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDronesBehavior_Imports() {
		return (EReference)dronesBehaviorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScript() {
		return scriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScript_Statement() {
		return (EReference)scriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScript_Drone() {
		return (EReference)scriptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicStatement() {
		return atomicStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCooperate() {
		return cooperateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCooperate_Role() {
		return (EReference)cooperateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCooperate_Task() {
		return (EReference)cooperateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMove() {
		return moveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMove_Destination() {
		return (EReference)moveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWait() {
		return waitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWait_Timeout() {
		return (EAttribute)waitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendSignal() {
		return sendSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendSignal_Signal() {
		return (EReference)sendSignalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendSignal_Recipent() {
		return (EReference)sendSignalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleWait() {
		return simpleWaitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleWait_Signal() {
		return (EReference)simpleWaitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexWait() {
		return complexWaitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexWait_Reactions() {
		return (EReference)complexWaitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexWait_OnTimeout() {
		return (EReference)complexWaitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReaction() {
		return reactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReaction_Statement() {
		return (EReference)reactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReaction_Signal() {
		return (EReference)reactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignal() {
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendMap() {
		return sendMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendMap_Recipent() {
		return (EReference)sendMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScan() {
		return scanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharge() {
		return chargeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DronesBehaviorFactory getDronesBehaviorFactory() {
		return (DronesBehaviorFactory)getEFactoryInstance();
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
		dronesBehaviorEClass = createEClass(DRONES_BEHAVIOR);
		createEReference(dronesBehaviorEClass, DRONES_BEHAVIOR__SCRIPTS);
		createEReference(dronesBehaviorEClass, DRONES_BEHAVIOR__SIGNALS);
		createEReference(dronesBehaviorEClass, DRONES_BEHAVIOR__SCENARIO);
		createEReference(dronesBehaviorEClass, DRONES_BEHAVIOR__IMPORTS);

		scriptEClass = createEClass(SCRIPT);
		createEReference(scriptEClass, SCRIPT__STATEMENT);
		createEReference(scriptEClass, SCRIPT__DRONE);

		statementEClass = createEClass(STATEMENT);

		atomicStatementEClass = createEClass(ATOMIC_STATEMENT);

		cooperateEClass = createEClass(COOPERATE);
		createEReference(cooperateEClass, COOPERATE__ROLE);
		createEReference(cooperateEClass, COOPERATE__TASK);

		moveEClass = createEClass(MOVE);
		createEReference(moveEClass, MOVE__DESTINATION);

		waitEClass = createEClass(WAIT);
		createEAttribute(waitEClass, WAIT__TIMEOUT);

		sendSignalEClass = createEClass(SEND_SIGNAL);
		createEReference(sendSignalEClass, SEND_SIGNAL__SIGNAL);
		createEReference(sendSignalEClass, SEND_SIGNAL__RECIPENT);

		simpleWaitEClass = createEClass(SIMPLE_WAIT);
		createEReference(simpleWaitEClass, SIMPLE_WAIT__SIGNAL);

		complexWaitEClass = createEClass(COMPLEX_WAIT);
		createEReference(complexWaitEClass, COMPLEX_WAIT__REACTIONS);
		createEReference(complexWaitEClass, COMPLEX_WAIT__ON_TIMEOUT);

		reactionEClass = createEClass(REACTION);
		createEReference(reactionEClass, REACTION__STATEMENT);
		createEReference(reactionEClass, REACTION__SIGNAL);

		signalEClass = createEClass(SIGNAL);

		sendMapEClass = createEClass(SEND_MAP);
		createEReference(sendMapEClass, SEND_MAP__RECIPENT);

		scanEClass = createEClass(SCAN);

		chargeEClass = createEClass(CHARGE);
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
		DronesStructurePackage theDronesStructurePackage = (DronesStructurePackage)EPackage.Registry.INSTANCE.getEPackage(DronesStructurePackage.eNS_URI);
		XtypePackage theXtypePackage = (XtypePackage)EPackage.Registry.INSTANCE.getEPackage(XtypePackage.eNS_URI);
		XbasePackage theXbasePackage = (XbasePackage)EPackage.Registry.INSTANCE.getEPackage(XbasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		statementEClass.getESuperTypes().add(theXbasePackage.getXExpression());
		atomicStatementEClass.getESuperTypes().add(this.getStatement());
		cooperateEClass.getESuperTypes().add(this.getAtomicStatement());
		moveEClass.getESuperTypes().add(this.getAtomicStatement());
		waitEClass.getESuperTypes().add(this.getStatement());
		sendSignalEClass.getESuperTypes().add(this.getAtomicStatement());
		simpleWaitEClass.getESuperTypes().add(this.getWait());
		complexWaitEClass.getESuperTypes().add(this.getWait());
		signalEClass.getESuperTypes().add(theDronesStructurePackage.getNamedElement());
		sendMapEClass.getESuperTypes().add(this.getAtomicStatement());
		scanEClass.getESuperTypes().add(this.getAtomicStatement());
		chargeEClass.getESuperTypes().add(this.getAtomicStatement());

		// Initialize classes, features, and operations; add parameters
		initEClass(dronesBehaviorEClass, DronesBehavior.class, "DronesBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDronesBehavior_Scripts(), this.getScript(), null, "scripts", null, 0, -1, DronesBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDronesBehavior_Signals(), this.getSignal(), null, "signals", null, 0, -1, DronesBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDronesBehavior_Scenario(), theDronesStructurePackage.getScenario(), null, "scenario", null, 0, 1, DronesBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDronesBehavior_Imports(), theXtypePackage.getXImportSection(), null, "imports", null, 0, 1, DronesBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScript_Statement(), theXbasePackage.getXExpression(), null, "statement", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getScript_Drone(), theDronesStructurePackage.getDrone(), null, "drone", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atomicStatementEClass, AtomicStatement.class, "AtomicStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cooperateEClass, Cooperate.class, "Cooperate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCooperate_Role(), theDronesStructurePackage.getRole(), null, "role", null, 0, 1, Cooperate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCooperate_Task(), theDronesStructurePackage.getTask(), null, "task", null, 0, 1, Cooperate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveEClass, Move.class, "Move", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMove_Destination(), theDronesStructurePackage.getPosition(), null, "destination", null, 0, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waitEClass, Wait.class, "Wait", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWait_Timeout(), ecorePackage.getEInt(), "timeout", null, 0, 1, Wait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendSignalEClass, SendSignal.class, "SendSignal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendSignal_Signal(), this.getSignal(), null, "signal", null, 0, 1, SendSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSendSignal_Recipent(), theDronesStructurePackage.getDrone(), null, "recipent", null, 0, 1, SendSignal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleWaitEClass, SimpleWait.class, "SimpleWait", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleWait_Signal(), this.getSignal(), null, "signal", null, 0, 1, SimpleWait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(complexWaitEClass, ComplexWait.class, "ComplexWait", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComplexWait_Reactions(), this.getReaction(), null, "reactions", null, 0, -1, ComplexWait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplexWait_OnTimeout(), theXbasePackage.getXExpression(), null, "onTimeout", null, 0, 1, ComplexWait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reactionEClass, Reaction.class, "Reaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReaction_Statement(), theXbasePackage.getXExpression(), null, "statement", null, 0, 1, Reaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReaction_Signal(), this.getSignal(), null, "signal", null, 0, 1, Reaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sendMapEClass, SendMap.class, "SendMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendMap_Recipent(), theDronesStructurePackage.getDrone(), null, "recipent", null, 0, 1, SendMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scanEClass, Scan.class, "Scan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chargeEClass, Charge.class, "Charge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DronesBehaviorPackageImpl
