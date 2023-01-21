package io.jmix.bookstore.product.supplier;

import java.util.Objects;
import org.assertj.core.api.AbstractObjectAssert;

/**
 * {@link SupplierOrderLine} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class SupplierOrderLineAssert extends AbstractObjectAssert<SupplierOrderLineAssert, SupplierOrderLine> {

  /**
   * Creates a new <code>{@link SupplierOrderLineAssert}</code> to make assertions on actual SupplierOrderLine.
   * @param actual the SupplierOrderLine we want to make assertions on.
   */
  public SupplierOrderLineAssert(SupplierOrderLine actual) {
    super(actual, SupplierOrderLineAssert.class);
  }

  /**
   * An entry point for SupplierOrderLineAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(mySupplierOrderLine)</code> and get specific assertion with code completion.
   * @param actual the SupplierOrderLine we want to make assertions on.
   * @return a new <code>{@link SupplierOrderLineAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static SupplierOrderLineAssert assertThat(SupplierOrderLine actual) {
    return new SupplierOrderLineAssert(actual);
  }

  /**
   * Verifies that the actual SupplierOrderLine's createdBy is equal to the given one.
   * @param createdBy the given createdBy to compare the actual SupplierOrderLine's createdBy to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SupplierOrderLine's createdBy is not equal to the given one.
   */
  public SupplierOrderLineAssert hasCreatedBy(String createdBy) {
    // check that actual SupplierOrderLine we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting createdBy of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCreatedBy = actual.getCreatedBy();
    if (!Objects.deepEquals(actualCreatedBy, createdBy)) {
      failWithMessage(assertjErrorMessage, actual, createdBy, actualCreatedBy);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SupplierOrderLine's createdDate is equal to the given one.
   * @param createdDate the given createdDate to compare the actual SupplierOrderLine's createdDate to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SupplierOrderLine's createdDate is not equal to the given one.
   */
  public SupplierOrderLineAssert hasCreatedDate(java.util.Date createdDate) {
    // check that actual SupplierOrderLine we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting createdDate of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    java.util.Date actualCreatedDate = actual.getCreatedDate();
    if (!Objects.deepEquals(actualCreatedDate, createdDate)) {
      failWithMessage(assertjErrorMessage, actual, createdDate, actualCreatedDate);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SupplierOrderLine's deletedBy is equal to the given one.
   * @param deletedBy the given deletedBy to compare the actual SupplierOrderLine's deletedBy to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SupplierOrderLine's deletedBy is not equal to the given one.
   */
  public SupplierOrderLineAssert hasDeletedBy(String deletedBy) {
    // check that actual SupplierOrderLine we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting deletedBy of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualDeletedBy = actual.getDeletedBy();
    if (!Objects.deepEquals(actualDeletedBy, deletedBy)) {
      failWithMessage(assertjErrorMessage, actual, deletedBy, actualDeletedBy);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SupplierOrderLine's deletedDate is equal to the given one.
   * @param deletedDate the given deletedDate to compare the actual SupplierOrderLine's deletedDate to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SupplierOrderLine's deletedDate is not equal to the given one.
   */
  public SupplierOrderLineAssert hasDeletedDate(java.util.Date deletedDate) {
    // check that actual SupplierOrderLine we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting deletedDate of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    java.util.Date actualDeletedDate = actual.getDeletedDate();
    if (!Objects.deepEquals(actualDeletedDate, deletedDate)) {
      failWithMessage(assertjErrorMessage, actual, deletedDate, actualDeletedDate);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SupplierOrderLine's id is equal to the given one.
   * @param id the given id to compare the actual SupplierOrderLine's id to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SupplierOrderLine's id is not equal to the given one.
   */
  public SupplierOrderLineAssert hasId(java.util.UUID id) {
    // check that actual SupplierOrderLine we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting id of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    java.util.UUID actualId = actual.getId();
    if (!Objects.deepEquals(actualId, id)) {
      failWithMessage(assertjErrorMessage, actual, id, actualId);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SupplierOrderLine's lastModifiedBy is equal to the given one.
   * @param lastModifiedBy the given lastModifiedBy to compare the actual SupplierOrderLine's lastModifiedBy to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SupplierOrderLine's lastModifiedBy is not equal to the given one.
   */
  public SupplierOrderLineAssert hasLastModifiedBy(String lastModifiedBy) {
    // check that actual SupplierOrderLine we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting lastModifiedBy of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualLastModifiedBy = actual.getLastModifiedBy();
    if (!Objects.deepEquals(actualLastModifiedBy, lastModifiedBy)) {
      failWithMessage(assertjErrorMessage, actual, lastModifiedBy, actualLastModifiedBy);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SupplierOrderLine's lastModifiedDate is equal to the given one.
   * @param lastModifiedDate the given lastModifiedDate to compare the actual SupplierOrderLine's lastModifiedDate to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SupplierOrderLine's lastModifiedDate is not equal to the given one.
   */
  public SupplierOrderLineAssert hasLastModifiedDate(java.util.Date lastModifiedDate) {
    // check that actual SupplierOrderLine we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting lastModifiedDate of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    java.util.Date actualLastModifiedDate = actual.getLastModifiedDate();
    if (!Objects.deepEquals(actualLastModifiedDate, lastModifiedDate)) {
      failWithMessage(assertjErrorMessage, actual, lastModifiedDate, actualLastModifiedDate);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SupplierOrderLine's product is equal to the given one.
   * @param product the given product to compare the actual SupplierOrderLine's product to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SupplierOrderLine's product is not equal to the given one.
   */
  public SupplierOrderLineAssert hasProduct(io.jmix.bookstore.product.Product product) {
    // check that actual SupplierOrderLine we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting product of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    io.jmix.bookstore.product.Product actualProduct = actual.getProduct();
    if (!Objects.deepEquals(actualProduct, product)) {
      failWithMessage(assertjErrorMessage, actual, product, actualProduct);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SupplierOrderLine's quantity is equal to the given one.
   * @param quantity the given quantity to compare the actual SupplierOrderLine's quantity to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SupplierOrderLine's quantity is not equal to the given one.
   */
  public SupplierOrderLineAssert hasQuantity(Integer quantity) {
    // check that actual SupplierOrderLine we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting quantity of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Integer actualQuantity = actual.getQuantity();
    if (!Objects.deepEquals(actualQuantity, quantity)) {
      failWithMessage(assertjErrorMessage, actual, quantity, actualQuantity);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SupplierOrderLine's request is equal to the given one.
   * @param request the given request to compare the actual SupplierOrderLine's request to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SupplierOrderLine's request is not equal to the given one.
   */
  public SupplierOrderLineAssert hasRequest(SupplierOrderRequest request) {
    // check that actual SupplierOrderLine we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting request of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    SupplierOrderRequest actualRequest = actual.getRequest();
    if (!Objects.deepEquals(actualRequest, request)) {
      failWithMessage(assertjErrorMessage, actual, request, actualRequest);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SupplierOrderLine's supplierOrder is equal to the given one.
   * @param supplierOrder the given supplierOrder to compare the actual SupplierOrderLine's supplierOrder to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SupplierOrderLine's supplierOrder is not equal to the given one.
   */
  public SupplierOrderLineAssert hasSupplierOrder(SupplierOrder supplierOrder) {
    // check that actual SupplierOrderLine we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting supplierOrder of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    SupplierOrder actualSupplierOrder = actual.getSupplierOrder();
    if (!Objects.deepEquals(actualSupplierOrder, supplierOrder)) {
      failWithMessage(assertjErrorMessage, actual, supplierOrder, actualSupplierOrder);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SupplierOrderLine's tenant is equal to the given one.
   * @param tenant the given tenant to compare the actual SupplierOrderLine's tenant to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SupplierOrderLine's tenant is not equal to the given one.
   */
  public SupplierOrderLineAssert hasTenant(String tenant) {
    // check that actual SupplierOrderLine we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting tenant of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualTenant = actual.getTenant();
    if (!Objects.deepEquals(actualTenant, tenant)) {
      failWithMessage(assertjErrorMessage, actual, tenant, actualTenant);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual SupplierOrderLine's version is equal to the given one.
   * @param version the given version to compare the actual SupplierOrderLine's version to.
   * @return this assertion object.
   * @throws AssertionError - if the actual SupplierOrderLine's version is not equal to the given one.
   */
  public SupplierOrderLineAssert hasVersion(Integer version) {
    // check that actual SupplierOrderLine we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting version of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Integer actualVersion = actual.getVersion();
    if (!Objects.deepEquals(actualVersion, version)) {
      failWithMessage(assertjErrorMessage, actual, version, actualVersion);
    }

    // return the current assertion for method chaining
    return this;
  }

}