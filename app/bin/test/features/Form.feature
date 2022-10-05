
Feature: Como usuario quiero ingresar al formulario y hacer uso de sus secciones

    @Case1
    Scenario Outline:  Ingresar en la seccion  Caso 1
        Given El usuario ingresa al formulario con la url del caso 1
        And Se dirige a la seccion Caso 1
        Then Se visualiza el formulario del caso 1


    @Case2
    Scenario Outline: Ingresar a la seccion Caso 2
        Given Como usuario ingreso al formulario con la url del caso 2
        And Doy click a la seccion de caso 2
        Then Se visualiza el formulario correspondiente al caso 2

    @ValidateForm
    Scenario Outline: verificar validaciones para campos vacios
        Given Como usuario ingreso al formulario con la url del formulario del caso 1 
        And Se dejan los campos vacios
        Then Se visualizan comentarios de aviso que no permiten dejar el campo vacio

    @Signin
    Scenario Outline: Ingresaremos a la seccion de registro
        Given Como usuario ingreso al formulario con el link de este
        When Se dirige a la seccion de registro
        Then Se visualiza un formulario de registro

    @Login
    Scenario Outline: Ingresaremos a la seccion de inicio de sesion
        Given Como usuario ingreso al formulario por medio de la url
        When Se dirige a la seccion dando click en inicio de sesion
        Then Se visualiza un formulario de inicio de sesion