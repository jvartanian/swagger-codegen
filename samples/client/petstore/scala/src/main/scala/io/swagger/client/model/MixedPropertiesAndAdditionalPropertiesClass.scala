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

import java.util.Date
import java.util.UUID

/**
 * @param uuid 
 * @param dateTime 
 * @param map 
 */
case class MixedPropertiesAndAdditionalPropertiesClass (
  uuid: Option[UUID] = None,
  dateTime: Option[Date] = None,
  map: Option[Map[String, Animal]] = None
)
