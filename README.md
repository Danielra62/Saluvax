# Saluvax
## Descripción
SaluVax Manager es una solución que facilita la gestión y registro de vacunas en centros de vacunación pequeños, donde el proceso aún se lleva a cabo de forma manual. El sistema está diseñado para asegurar que la información sobre pacientes, vacunas y personal médico se registre de manera eficiente, reduciendo el riesgo de pérdida de datos y mejorando los tiempos de espera en instalaciones de salud.

## Problema Encontrado
En muchos centros de vacunación pequeños, el registro de vacunas y pacientes se realiza manualmente, lo que conlleva el riesgo de perder información antes de que los datos sean transferidos a un registro electrónico. Este método aumenta la probabilidad de errores y puede provocar demoras en la atención médica.

## Objetivo General
Incrementar la eficacia en la logística de distribución de vacunas, resultando en una reducción de los tiempos de espera en instalaciones de atención médica. SaluVax Manager busca desarrollar e implementar un sistema que permita al personal médico registrar y consultar la administración de vacunas e inyecciones de manera eficiente.

## Objetivos Específicos
Facilitar el registro eficiente de pacientes, asegurando que la información básica esté disponible para el personal médico.
Proporcionar acceso rápido al historial de vacunación e inyecciones de un paciente específico.
Establecer un sistema de alertas automáticas para recordar al personal médico sobre las próximas fechas de vacunación programadas.
Implementar un sistema de acceso controlado por roles, garantizando que solo el personal autorizado pueda agregar o modificar información médica.

## Alcance del Proyecto
El proyecto está diseñado para registrar los datos más importantes relacionados con las vacunas, los pacientes y el personal médico encargado de administrarlas. Permitirá asociar cada vacuna con el paciente que la recibe, según las necesidades del personal médico, mejorando así el control y el seguimiento de las inmunizaciones.

# CORRECIONES
## NUMERO 1: VIOLACION CODE SMELL

### CODIGO ORIGINAL: 

try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormRegistrarNueboUsuarioTest.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegistrarNueboUsuarioTest.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegistrarNueboUsuarioTest.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegistrarNueboUsuarioTest.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
### REPORTE DE SONARLINT:
Resource	/	Description
FormRegistrarNueboUsuarioTest.java	/	Combine this catch with the one at line 322, which has the same body.


### CODIGO CORREGIDO SEGUN SONARLINT:
try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegistrarNueboUsuarioTest.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }   

## NÚMERO 2: VIOLACION CODE SMELL

### CODIGO ORIGINAL:
private void btnVacunarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacunarActionPerformed
        // TODO add your handling code here:
        //        ConexionAlumnos objetoALumnos=new ConexionAlumnos();
        //        objetoALumnos.insertarAlumno(txtKit, txtLote, txtEnfermedad, txtDosis, txtCaduca);
        //        //        objetoALumnos.reiniciarJTable(tbTotalAlumnos);
        //        objetoALumnos.mostrarAlumnos(tbTotalAlumnos);
//        ConexionVacunasDisponibles objetoVacuna=new ConexionVacunasDisponibles();
//        if (objetoVacuna.registroCaducado(txtFechaNac)) {
//            objetoVacuna.registrarVacunaDisponible(txtDni, txtNombre, txtApellido, txtDireccion, txtFechaNac);
//            objetoVacuna.mostrarVacunasDisponibles(tbHistorialMedico);
//        }
        ConexionPacVac objetoPacVac=new ConexionPacVac();
        objetoPacVac.vacunarPaciente(txtDni, txtNombre, txtApellido, txtDireccion, txtCelular, txtFechaNac, txtKit, txtLote, txtEnfermedad, txtDosis);
        objetoPacVac.mostrarPacVac(tbHistorialMedico);
        ConexionVacunasDisponibles objetoVacuna=new ConexionVacunasDisponibles();
        objetoVacuna.eliminarRegistro(txtKit);
        objetoVacuna.mostrarVacunasDisponibles(tbTotalVacunasDisponibles);
    }//GEN-LAST:event_btnVacunarActionPerformed
    
### REPORTE DE SONARLINT:
Resource /	Description
FormVacunarPacienteRespaldo.java /	This block of commented-out lines of code should be removed. [+8 locations]

### CODIGO CORREGIDO:
 private void btnVacunarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacunarActionPerformed
        ConexionPacVac objetoPacVac=new ConexionPacVac();
        objetoPacVac.vacunarPaciente(txtDni, txtNombre, txtApellido, txtDireccion, txtCelular, txtFechaNac, txtKit, txtLote, txtEnfermedad, txtDosis);
        objetoPacVac.mostrarPacVac(tbHistorialMedico);
        ConexionVacunasDisponibles objetoVacuna=new ConexionVacunasDisponibles();
        objetoVacuna.eliminarRegistro(txtKit);
        objetoVacuna.mostrarVacunasDisponibles(tbTotalVacunasDisponibles);
    }//GEN-LAST:event_btnVacunarActionPerformed
    
## NÚMERO 3: VIOLACIÓN CODE SMELL

### CODIGO ORIGINAL:
   private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        if (!txtDni.getText().equals("Digiete el DNI del paciente")) {
            if (!txtNombre.getText().equals("Digite el nombre(s) del paciente")) {
                if (!txtApellido.getText().equals("Digite los apellidos del paciente")) {
                    if (!txtDireccion.getText().equals("Digite la direccion del paciente")) {
                        if (!txtCelular.getText().equals("Digite algun telefono de contacto del paciente")) {
                            if (!txtFechaNac.getText().equals("Fecha de nacimeinto")) {
                                ConexionPacVac pacVac = new ConexionPacVac(txtDni.getText(), txtNombre.getText(),
                                        txtApellido.getText(), txtDireccion.getText(), txtCelular.getText(),
                                        txtFechaNac.getText());
                                FormVacunarPaciente.showJPanel(new VacunasDIsponibles(pacVac));
                            } else {
                                JOptionPane.showMessageDialog(null, "Alguno de los campos aun no a sido rellenado");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Alguno de los campos aun no a sido rellenado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Alguno de los campos aun no a sido rellenado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Alguno de los campos aun no a sido rellenado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Alguno de los campos aun no a sido rellenado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Alguno de los campos aun no a sido rellenado");
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed
    
### REPORTE DE SONARLINT
Resource	/	Description
NuevoPaciente.java	/ Refactor this method to reduce its Cognitive Complexity from 27 to the 15 allowed. [+12 locations]

### CODIGO CORREGIDO:
  
 private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
    // TODO add your handling code here:
    String mensajeError = "Alguno de los campos aún no ha sido rellenado";
    if (!txtDni.getText().equals("Digite el DNI del paciente") &&
        !txtNombre.getText().equals("Digite el nombre(s) del paciente") &&
        !txtApellido.getText().equals("Digite los apellidos del paciente") &&
        !txtDireccion.getText().equals("Digite la direccion del paciente") &&
        !txtCelular.getText().equals("Digite algun telefono de contacto del paciente") &&
        !txtFechaNac.getText().equals("Fecha de nacimiento")) {
        // Si todas las validaciones son correctas, procedemos
        ConexionPacVac pacVac = new ConexionPacVac(
            txtDni.getText(),
            txtNombre.getText(),
            txtApellido.getText(),
            txtDireccion.getText(),
            txtCelular.getText(),
            txtFechaNac.getText()
        );
        FormVacunarPaciente.showJPanel(new VacunasDIsponibles(pacVac));
    } else {
        // Si alguna de las validaciones falla, mostramos el mensaje de error
        JOptionPane.showMessageDialog(null, mensajeError);
    }
}//GEN-LAST:event_btnConfirmarActionPerformed


