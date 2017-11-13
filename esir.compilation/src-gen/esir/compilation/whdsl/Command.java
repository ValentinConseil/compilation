/**
 * generated by Xtext 2.13.0
 */
package esir.compilation.whdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esir.compilation.whdsl.Command#getNop <em>Nop</em>}</li>
 *   <li>{@link esir.compilation.whdsl.Command#getVars <em>Vars</em>}</li>
 *   <li>{@link esir.compilation.whdsl.Command#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see esir.compilation.whdsl.WhdslPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
{
  /**
   * Returns the value of the '<em><b>Nop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nop</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nop</em>' attribute.
   * @see #setNop(String)
   * @see esir.compilation.whdsl.WhdslPackage#getCommand_Nop()
   * @model
   * @generated
   */
  String getNop();

  /**
   * Sets the value of the '{@link esir.compilation.whdsl.Command#getNop <em>Nop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nop</em>' attribute.
   * @see #getNop()
   * @generated
   */
  void setNop(String value);

  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference.
   * @see #setVars(Vars)
   * @see esir.compilation.whdsl.WhdslPackage#getCommand_Vars()
   * @model containment="true"
   * @generated
   */
  Vars getVars();

  /**
   * Sets the value of the '{@link esir.compilation.whdsl.Command#getVars <em>Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vars</em>' containment reference.
   * @see #getVars()
   * @generated
   */
  void setVars(Vars value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Exprs)
   * @see esir.compilation.whdsl.WhdslPackage#getCommand_Expression()
   * @model containment="true"
   * @generated
   */
  Exprs getExpression();

  /**
   * Sets the value of the '{@link esir.compilation.whdsl.Command#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Exprs value);

} // Command
