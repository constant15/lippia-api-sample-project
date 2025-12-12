Feature: Obtener todos los workspaces

@Success
  Scenario Outline: Obtener todos los workspaces con una consulta
    Given Mi cuenta creada en clockify y mi apikey '<token>' generada
    When Hago una '<operation>' hacia el endpoint '<entity>' con el '<jsonName>' y ''
    Then se obtuvo el status code <statusCode>


    Examples:
      | jsonName           | statusCode | operation | entity         | token                                                |
      | getAllMyWorkspaces | 200        | GET       | WORKSPACES     | ZGQ0NzdkYjktOWM4ZS00YWVmLWJiMjUtZjZhMjgwZWQ1NDkx     |

