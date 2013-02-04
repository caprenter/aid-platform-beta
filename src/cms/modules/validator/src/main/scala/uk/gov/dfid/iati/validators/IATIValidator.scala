package uk.gov.dfid.iati.validators


/**
 * Simple trait for providing validation of the IATI Sources
 */
trait IATIValidator {

  /**
   * Validates a given source against a particular version of the IATI Standard
   * @param source The source XML
   * @param version The version to validate against
   * @return True if valid; False Otherwise
   */
  def validate(source: String, version: String): Boolean
}


