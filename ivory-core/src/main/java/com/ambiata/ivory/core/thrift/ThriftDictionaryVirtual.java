/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ambiata.ivory.core.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThriftDictionaryVirtual implements org.apache.thrift.TBase<ThriftDictionaryVirtual, ThriftDictionaryVirtual._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftDictionaryVirtual> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftDictionaryVirtual");

  private static final org.apache.thrift.protocol.TField SOURCE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("sourceName", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField WINDOW_FIELD_DESC = new org.apache.thrift.protocol.TField("window", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField EXPRESSION_FIELD_DESC = new org.apache.thrift.protocol.TField("expression", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftDictionaryVirtualStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftDictionaryVirtualTupleSchemeFactory());
  }

  public ThriftDictionaryFeatureId sourceName; // required
  public ThriftDictionaryWindow window; // optional
  public ThriftDictionaryExpression expression; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SOURCE_NAME((short)1, "sourceName"),
    WINDOW((short)2, "window"),
    EXPRESSION((short)3, "expression");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SOURCE_NAME
          return SOURCE_NAME;
        case 2: // WINDOW
          return WINDOW;
        case 3: // EXPRESSION
          return EXPRESSION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private _Fields optionals[] = {_Fields.WINDOW,_Fields.EXPRESSION};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SOURCE_NAME, new org.apache.thrift.meta_data.FieldMetaData("sourceName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftDictionaryFeatureId.class)));
    tmpMap.put(_Fields.WINDOW, new org.apache.thrift.meta_data.FieldMetaData("window", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftDictionaryWindow.class)));
    tmpMap.put(_Fields.EXPRESSION, new org.apache.thrift.meta_data.FieldMetaData("expression", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftDictionaryExpression.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftDictionaryVirtual.class, metaDataMap);
  }

  public ThriftDictionaryVirtual() {
  }

  public ThriftDictionaryVirtual(
    ThriftDictionaryFeatureId sourceName)
  {
    this();
    this.sourceName = sourceName;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftDictionaryVirtual(ThriftDictionaryVirtual other) {
    if (other.isSetSourceName()) {
      this.sourceName = new ThriftDictionaryFeatureId(other.sourceName);
    }
    if (other.isSetWindow()) {
      this.window = new ThriftDictionaryWindow(other.window);
    }
    if (other.isSetExpression()) {
      this.expression = new ThriftDictionaryExpression(other.expression);
    }
  }

  public ThriftDictionaryVirtual deepCopy() {
    return new ThriftDictionaryVirtual(this);
  }

  @Override
  public void clear() {
    this.sourceName = null;
    this.window = null;
    this.expression = null;
  }

  public ThriftDictionaryFeatureId getSourceName() {
    return this.sourceName;
  }

  public ThriftDictionaryVirtual setSourceName(ThriftDictionaryFeatureId sourceName) {
    this.sourceName = sourceName;
    return this;
  }

  public void unsetSourceName() {
    this.sourceName = null;
  }

  /** Returns true if field sourceName is set (has been assigned a value) and false otherwise */
  public boolean isSetSourceName() {
    return this.sourceName != null;
  }

  public void setSourceNameIsSet(boolean value) {
    if (!value) {
      this.sourceName = null;
    }
  }

  public ThriftDictionaryWindow getWindow() {
    return this.window;
  }

  public ThriftDictionaryVirtual setWindow(ThriftDictionaryWindow window) {
    this.window = window;
    return this;
  }

  public void unsetWindow() {
    this.window = null;
  }

  /** Returns true if field window is set (has been assigned a value) and false otherwise */
  public boolean isSetWindow() {
    return this.window != null;
  }

  public void setWindowIsSet(boolean value) {
    if (!value) {
      this.window = null;
    }
  }

  public ThriftDictionaryExpression getExpression() {
    return this.expression;
  }

  public ThriftDictionaryVirtual setExpression(ThriftDictionaryExpression expression) {
    this.expression = expression;
    return this;
  }

  public void unsetExpression() {
    this.expression = null;
  }

  /** Returns true if field expression is set (has been assigned a value) and false otherwise */
  public boolean isSetExpression() {
    return this.expression != null;
  }

  public void setExpressionIsSet(boolean value) {
    if (!value) {
      this.expression = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SOURCE_NAME:
      if (value == null) {
        unsetSourceName();
      } else {
        setSourceName((ThriftDictionaryFeatureId)value);
      }
      break;

    case WINDOW:
      if (value == null) {
        unsetWindow();
      } else {
        setWindow((ThriftDictionaryWindow)value);
      }
      break;

    case EXPRESSION:
      if (value == null) {
        unsetExpression();
      } else {
        setExpression((ThriftDictionaryExpression)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SOURCE_NAME:
      return getSourceName();

    case WINDOW:
      return getWindow();

    case EXPRESSION:
      return getExpression();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SOURCE_NAME:
      return isSetSourceName();
    case WINDOW:
      return isSetWindow();
    case EXPRESSION:
      return isSetExpression();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftDictionaryVirtual)
      return this.equals((ThriftDictionaryVirtual)that);
    return false;
  }

  public boolean equals(ThriftDictionaryVirtual that) {
    if (that == null)
      return false;

    boolean this_present_sourceName = true && this.isSetSourceName();
    boolean that_present_sourceName = true && that.isSetSourceName();
    if (this_present_sourceName || that_present_sourceName) {
      if (!(this_present_sourceName && that_present_sourceName))
        return false;
      if (!this.sourceName.equals(that.sourceName))
        return false;
    }

    boolean this_present_window = true && this.isSetWindow();
    boolean that_present_window = true && that.isSetWindow();
    if (this_present_window || that_present_window) {
      if (!(this_present_window && that_present_window))
        return false;
      if (!this.window.equals(that.window))
        return false;
    }

    boolean this_present_expression = true && this.isSetExpression();
    boolean that_present_expression = true && that.isSetExpression();
    if (this_present_expression || that_present_expression) {
      if (!(this_present_expression && that_present_expression))
        return false;
      if (!this.expression.equals(that.expression))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ThriftDictionaryVirtual other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSourceName()).compareTo(other.isSetSourceName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSourceName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sourceName, other.sourceName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWindow()).compareTo(other.isSetWindow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWindow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.window, other.window);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExpression()).compareTo(other.isSetExpression());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpression()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expression, other.expression);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftDictionaryVirtual(");
    boolean first = true;

    sb.append("sourceName:");
    if (this.sourceName == null) {
      sb.append("null");
    } else {
      sb.append(this.sourceName);
    }
    first = false;
    if (isSetWindow()) {
      if (!first) sb.append(", ");
      sb.append("window:");
      if (this.window == null) {
        sb.append("null");
      } else {
        sb.append(this.window);
      }
      first = false;
    }
    if (isSetExpression()) {
      if (!first) sb.append(", ");
      sb.append("expression:");
      if (this.expression == null) {
        sb.append("null");
      } else {
        sb.append(this.expression);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (sourceName != null) {
      sourceName.validate();
    }
    if (window != null) {
      window.validate();
    }
    if (expression != null) {
      expression.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftDictionaryVirtualStandardSchemeFactory implements SchemeFactory {
    public ThriftDictionaryVirtualStandardScheme getScheme() {
      return new ThriftDictionaryVirtualStandardScheme();
    }
  }

  private static class ThriftDictionaryVirtualStandardScheme extends StandardScheme<ThriftDictionaryVirtual> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftDictionaryVirtual struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SOURCE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.sourceName = new ThriftDictionaryFeatureId();
              struct.sourceName.read(iprot);
              struct.setSourceNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // WINDOW
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.window = new ThriftDictionaryWindow();
              struct.window.read(iprot);
              struct.setWindowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXPRESSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.expression = new ThriftDictionaryExpression();
              struct.expression.read(iprot);
              struct.setExpressionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftDictionaryVirtual struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.sourceName != null) {
        oprot.writeFieldBegin(SOURCE_NAME_FIELD_DESC);
        struct.sourceName.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.window != null) {
        if (struct.isSetWindow()) {
          oprot.writeFieldBegin(WINDOW_FIELD_DESC);
          struct.window.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.expression != null) {
        if (struct.isSetExpression()) {
          oprot.writeFieldBegin(EXPRESSION_FIELD_DESC);
          struct.expression.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftDictionaryVirtualTupleSchemeFactory implements SchemeFactory {
    public ThriftDictionaryVirtualTupleScheme getScheme() {
      return new ThriftDictionaryVirtualTupleScheme();
    }
  }

  private static class ThriftDictionaryVirtualTupleScheme extends TupleScheme<ThriftDictionaryVirtual> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftDictionaryVirtual struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSourceName()) {
        optionals.set(0);
      }
      if (struct.isSetWindow()) {
        optionals.set(1);
      }
      if (struct.isSetExpression()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetSourceName()) {
        struct.sourceName.write(oprot);
      }
      if (struct.isSetWindow()) {
        struct.window.write(oprot);
      }
      if (struct.isSetExpression()) {
        struct.expression.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftDictionaryVirtual struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.sourceName = new ThriftDictionaryFeatureId();
        struct.sourceName.read(iprot);
        struct.setSourceNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.window = new ThriftDictionaryWindow();
        struct.window.read(iprot);
        struct.setWindowIsSet(true);
      }
      if (incoming.get(2)) {
        struct.expression = new ThriftDictionaryExpression();
        struct.expression.read(iprot);
        struct.setExpressionIsSet(true);
      }
    }
  }

}

