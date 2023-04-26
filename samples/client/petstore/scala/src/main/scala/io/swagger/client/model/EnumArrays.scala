/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model


/**
 * @param justSymbol 
 * @param arrayEnum 
 */
case class EnumArrays (
  justSymbol: Option[EnumArrays.JustSymbol] = None,
  arrayEnum: Option[EnumArrays.List[ArrayEnum]] = None
)

object EnumArrays {
  type JustSymbol = JustSymbol.Value
  type List[ArrayEnum] = List[ArrayEnum].Value

  object JustSymbol extends Enumeration {
    val Gtx3D = Value("&gt;&#x3D;")
    val Value = Value("$")
  }

  object List[ArrayEnum] extends Enumeration {
  }

}
