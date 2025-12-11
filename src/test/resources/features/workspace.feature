Feature: Obtener todos los workspaces


  Scenario Outline: Obtener todos los workspaces con una consulta
    Given Mi cuenta creada en clockify y mi apikey '<token>' generada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained


    Examples:
      | jsonName           | statusCode | operation | entity         | token                                                |
      | getAllMyWorkspaces | 200        | GET       | WORKSPACES     | ZGQ0NzdkYjktOWM4ZS00YWVmLWJiMjUtZjZhMjgwZWQ1NDkx     |

