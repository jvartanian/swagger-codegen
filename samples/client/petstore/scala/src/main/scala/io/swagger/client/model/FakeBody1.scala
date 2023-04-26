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

import java.math.BigDecimal
import java.util.Date

/**
 * @param integer None
 * @param int32 None
 * @param int64 None
 * @param number None
 * @param float None
 * @param double None
 * @param string None
 * @param patternWithoutDelimiter None
 * @param byte None
 * @param binary None
 * @param date None
 * @param dateTime None
 * @param password None
 * @param callback None
 */
case class FakeBody1 (
  integer: Option[Integer] = None,
  int32: Option[Integer] = None,
  int64: Option[Long] = None,
  number: BigDecimal,
  float: Option[Float] = None,
  double: Double,
  string: Option[String] = None,
  patternWithoutDelimiter: String,
  byte: Array[Byte],
  binary: Option[Array[Byte]] = None,
  date: Option[date] = None,
  dateTime: Option[Date] = None,
  password: Option[String] = None,
  callback: Option[String] = None
)

