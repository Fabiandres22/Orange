

  # fabian andres villalba
    #23-05-2022

  @Regresion
    Feature: Ingreso a la pagina

      @Login
      Scenario Outline: login credenciales exitosas
          Given open browser
        And diligenciar user <user> y contrasena <pass>


        Examples:
        | user | pass |
        | Admin | admin123 |



      @AddEmployee
      Scenario Outline: agregar empleado
        Given open browser
        And diligenciar user <user> y contrasena <pass>
        And al hacer click en el boton pim y add a visualizar formularios
        When nombre <PrimerNombre> y apellido <Apellido>

        Examples:
          | user  | pass       | PrimerNombre | Apellido |
          | Admin | admin123   | Andres       | Villa    |
          | Admin | admin123   | fabian        | Torres    |
