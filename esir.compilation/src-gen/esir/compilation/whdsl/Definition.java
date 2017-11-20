/**
 * generated by Xtext 2.10.0
 */
package esir.compilation.whdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link esir.compilation.whdsl.Definition#getInputs <em>Inputs</em>}</li>
 *   <li>{@link esir.compilation.whdsl.Definition#getCommandes <em>Commandes</em>}</li>
 *   <li>{@link esir.compilation.whdsl.Definition#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see esir.compilation.whdsl.WhdslPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends EObject
{
  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference.
   * @see #setInputs(Input)
   * @see esir.compilation.whdsl.WhdslPackage#getDefinition_Inputs()
   * @model containment="true"
   * @generated
   */
  Input getInputs();

  /**
   * Sets the value of the '{@link esir.compilation.whdsl.Definition#getInputs <em>Inputs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inputs</em>' containment reference.
   * @see #getInputs()
   * @generated
   */
  void setInputs(Input value);

  /**
   * Returns the value of the '<em><b>Commandes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commandes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commandes</em>' containment reference.
   * @see #setCommandes(Commands)
   * @see esir.compilation.whdsl.WhdslPackage#getDefinition_Commandes()
   * @model containment="true"
   * @generated
   */
  Commands getCommandes();

  /**
   * Sets the value of the '{@link esir.compilation.whdsl.Definition#getCommandes <em>Commandes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Commandes</em>' containment reference.
   * @see #getCommandes()
   * @generated
   */
  void setCommandes(Commands value);

  /**
   * Returns the value of the '<em><b>Outputs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outputs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outputs</em>' containment reference.
   * @see #setOutputs(Output)
   * @see esir.compilation.whdsl.WhdslPackage#getDefinition_Outputs()
   * @model containment="true"
   * @generated
   */
  Output getOutputs();

  /**
   * Sets the value of the '{@link esir.compilation.whdsl.Definition#getOutputs <em>Outputs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outputs</em>' containment reference.
   * @see #getOutputs()
   * @generated
   */
  void setOutputs(Output value);

} // Definition
