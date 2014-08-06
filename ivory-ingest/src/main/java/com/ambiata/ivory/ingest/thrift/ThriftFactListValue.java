/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.ambiata.ivory.ingest.thrift;

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

public class ThriftFactListValue extends org.apache.thrift.TUnion<ThriftFactListValue, ThriftFactListValue._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftFactListValue");
  private static final org.apache.thrift.protocol.TField P_FIELD_DESC = new org.apache.thrift.protocol.TField("p", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField S_FIELD_DESC = new org.apache.thrift.protocol.TField("s", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    P((short)1, "p"),
    S((short)2, "s");

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
        case 1: // P
          return P;
        case 2: // S
          return S;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.P, new org.apache.thrift.meta_data.FieldMetaData("p", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftFactPrimitiveValue.class)));
    tmpMap.put(_Fields.S, new org.apache.thrift.meta_data.FieldMetaData("s", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftFactStruct.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftFactListValue.class, metaDataMap);
  }

  public ThriftFactListValue() {
    super();
  }

  public ThriftFactListValue(_Fields setField, Object value) {
    super(setField, value);
  }

  public ThriftFactListValue(ThriftFactListValue other) {
    super(other);
  }
  public ThriftFactListValue deepCopy() {
    return new ThriftFactListValue(this);
  }

  public static ThriftFactListValue p(ThriftFactPrimitiveValue value) {
    ThriftFactListValue x = new ThriftFactListValue();
    x.setP(value);
    return x;
  }

  public static ThriftFactListValue s(ThriftFactStruct value) {
    ThriftFactListValue x = new ThriftFactListValue();
    x.setS(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case P:
        if (value instanceof ThriftFactPrimitiveValue) {
          break;
        }
        throw new ClassCastException("Was expecting value of type ThriftFactPrimitiveValue for field 'p', but got " + value.getClass().getSimpleName());
      case S:
        if (value instanceof ThriftFactStruct) {
          break;
        }
        throw new ClassCastException("Was expecting value of type ThriftFactStruct for field 's', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case P:
          if (field.type == P_FIELD_DESC.type) {
            ThriftFactPrimitiveValue p;
            p = new ThriftFactPrimitiveValue();
            p.read(iprot);
            return p;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case S:
          if (field.type == S_FIELD_DESC.type) {
            ThriftFactStruct s;
            s = new ThriftFactStruct();
            s.read(iprot);
            return s;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case P:
        ThriftFactPrimitiveValue p = (ThriftFactPrimitiveValue)value_;
        p.write(oprot);
        return;
      case S:
        ThriftFactStruct s = (ThriftFactStruct)value_;
        s.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case P:
          ThriftFactPrimitiveValue p;
          p = new ThriftFactPrimitiveValue();
          p.read(iprot);
          return p;
        case S:
          ThriftFactStruct s;
          s = new ThriftFactStruct();
          s.read(iprot);
          return s;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case P:
        ThriftFactPrimitiveValue p = (ThriftFactPrimitiveValue)value_;
        p.write(oprot);
        return;
      case S:
        ThriftFactStruct s = (ThriftFactStruct)value_;
        s.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case P:
        return P_FIELD_DESC;
      case S:
        return S_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public ThriftFactPrimitiveValue getP() {
    if (getSetField() == _Fields.P) {
      return (ThriftFactPrimitiveValue)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'p' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setP(ThriftFactPrimitiveValue value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.P;
    value_ = value;
  }

  public ThriftFactStruct getS() {
    if (getSetField() == _Fields.S) {
      return (ThriftFactStruct)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 's' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setS(ThriftFactStruct value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.S;
    value_ = value;
  }

  public boolean isSetP() {
    return setField_ == _Fields.P;
  }


  public boolean isSetS() {
    return setField_ == _Fields.S;
  }


  public boolean equals(Object other) {
    if (other instanceof ThriftFactListValue) {
      return equals((ThriftFactListValue)other);
    } else {
      return false;
    }
  }

  public boolean equals(ThriftFactListValue other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(ThriftFactListValue other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  /**
   * If you'd like this to perform more respectably, use the hashcode generator option.
   */
  @Override
  public int hashCode() {
    return 0;
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


}