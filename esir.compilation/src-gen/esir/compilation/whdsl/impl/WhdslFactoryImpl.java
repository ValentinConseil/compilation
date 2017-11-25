/**
 * generated by Xtext 2.13.0
 */
package esir.compilation.whdsl.impl;

import esir.compilation.whdsl.*;

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
public class WhdslFactoryImpl extends EFactoryImpl implements WhdslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WhdslFactory init()
  {
    try
    {
      WhdslFactory theWhdslFactory = (WhdslFactory)EPackage.Registry.INSTANCE.getEFactory(WhdslPackage.eNS_URI);
      if (theWhdslFactory != null)
      {
        return theWhdslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WhdslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhdslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case WhdslPackage.PROGRAM: return createProgram();
      case WhdslPackage.FUNCTION: return createFunction();
      case WhdslPackage.DEFINITION: return createDefinition();
      case WhdslPackage.INPUT: return createInput();
      case WhdslPackage.OUTPUT: return createOutput();
      case WhdslPackage.VARS: return createVars();
      case WhdslPackage.COMMANDS: return createCommands();
      case WhdslPackage.COMMAND: return createCommand();
      case WhdslPackage.IF: return createIf();
      case WhdslPackage.AFFECT: return createAffect();
      case WhdslPackage.FOR: return createFor();
      case WhdslPackage.WHILE: return createWhile();
      case WhdslPackage.NOP: return createNop();
      case WhdslPackage.FOR_EACH: return createForEach();
      case WhdslPackage.EXPRS: return createExprs();
      case WhdslPackage.LEXPR: return createLExpr();
      case WhdslPackage.EXPR: return createExpr();
      case WhdslPackage.EXPR_SIMPLE: return createExprSimple();
      case WhdslPackage.EXPR_AND: return createExprAnd();
      case WhdslPackage.EXPR_OR: return createExprOr();
      case WhdslPackage.EXPR_NOT: return createExprNot();
      case WhdslPackage.EXPR_EQ: return createExprEq();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Program createProgram()
  {
    ProgramImpl program = new ProgramImpl();
    return program;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Input createInput()
  {
    InputImpl input = new InputImpl();
    return input;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Output createOutput()
  {
    OutputImpl output = new OutputImpl();
    return output;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vars createVars()
  {
    VarsImpl vars = new VarsImpl();
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Commands createCommands()
  {
    CommandsImpl commands = new CommandsImpl();
    return commands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If createIf()
  {
    IfImpl if_ = new IfImpl();
    return if_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Affect createAffect()
  {
    AffectImpl affect = new AffectImpl();
    return affect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For createFor()
  {
    ForImpl for_ = new ForImpl();
    return for_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While createWhile()
  {
    WhileImpl while_ = new WhileImpl();
    return while_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Nop createNop()
  {
    NopImpl nop = new NopImpl();
    return nop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ForEach createForEach()
  {
    ForEachImpl forEach = new ForEachImpl();
    return forEach;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exprs createExprs()
  {
    ExprsImpl exprs = new ExprsImpl();
    return exprs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LExpr createLExpr()
  {
    LExprImpl lExpr = new LExprImpl();
    return lExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprSimple createExprSimple()
  {
    ExprSimpleImpl exprSimple = new ExprSimpleImpl();
    return exprSimple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprAnd createExprAnd()
  {
    ExprAndImpl exprAnd = new ExprAndImpl();
    return exprAnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprOr createExprOr()
  {
    ExprOrImpl exprOr = new ExprOrImpl();
    return exprOr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprNot createExprNot()
  {
    ExprNotImpl exprNot = new ExprNotImpl();
    return exprNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprEq createExprEq()
  {
    ExprEqImpl exprEq = new ExprEqImpl();
    return exprEq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhdslPackage getWhdslPackage()
  {
    return (WhdslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WhdslPackage getPackage()
  {
    return WhdslPackage.eINSTANCE;
  }

} //WhdslFactoryImpl
