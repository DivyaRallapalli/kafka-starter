/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.kafka.schema;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

/** Schema for representing pet information */
@org.apache.avro.specific.AvroGenerated
public class petInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2820612590380003868L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"petInfo\",\"namespace\":\"com.example.kafka.schema\",\"doc\":\"Schema for representing pet information\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"default\":\"dog\"},{\"name\":\"age\",\"type\":\"int\",\"default\":3},{\"name\":\"color\",\"type\":\"string\",\"default\":\"black\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<petInfo> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<petInfo> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<petInfo> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<petInfo> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<petInfo> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this petInfo to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a petInfo from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a petInfo instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static petInfo fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence name;
  private int age;
  private java.lang.CharSequence color;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public petInfo() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param age The new value for age
   * @param color The new value for color
   */
  public petInfo(java.lang.CharSequence name, java.lang.Integer age, java.lang.CharSequence color) {
    this.name = name;
    this.age = age;
    this.color = color;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return age;
    case 2: return color;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: age = (java.lang.Integer)value$; break;
    case 2: color = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public int getAge() {
    return age;
  }


  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(int value) {
    this.age = value;
  }

  /**
   * Gets the value of the 'color' field.
   * @return The value of the 'color' field.
   */
  public java.lang.CharSequence getColor() {
    return color;
  }


  /**
   * Sets the value of the 'color' field.
   * @param value the value to set.
   */
  public void setColor(java.lang.CharSequence value) {
    this.color = value;
  }

  /**
   * Creates a new petInfo RecordBuilder.
   * @return A new petInfo RecordBuilder
   */
  public static com.example.kafka.schema.petInfo.Builder newBuilder() {
    return new com.example.kafka.schema.petInfo.Builder();
  }

  /**
   * Creates a new petInfo RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new petInfo RecordBuilder
   */
  public static com.example.kafka.schema.petInfo.Builder newBuilder(com.example.kafka.schema.petInfo.Builder other) {
    if (other == null) {
      return new com.example.kafka.schema.petInfo.Builder();
    } else {
      return new com.example.kafka.schema.petInfo.Builder(other);
    }
  }

  /**
   * Creates a new petInfo RecordBuilder by copying an existing petInfo instance.
   * @param other The existing instance to copy.
   * @return A new petInfo RecordBuilder
   */
  public static com.example.kafka.schema.petInfo.Builder newBuilder(com.example.kafka.schema.petInfo other) {
    if (other == null) {
      return new com.example.kafka.schema.petInfo.Builder();
    } else {
      return new com.example.kafka.schema.petInfo.Builder(other);
    }
  }

  /**
   * RecordBuilder for petInfo instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<petInfo>
    implements org.apache.avro.data.RecordBuilder<petInfo> {

    private java.lang.CharSequence name;
    private int age;
    private java.lang.CharSequence color;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.kafka.schema.petInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.age)) {
        this.age = data().deepCopy(fields()[1].schema(), other.age);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.color)) {
        this.color = data().deepCopy(fields()[2].schema(), other.color);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing petInfo instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.kafka.schema.petInfo other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.age)) {
        this.age = data().deepCopy(fields()[1].schema(), other.age);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.color)) {
        this.color = data().deepCopy(fields()[2].schema(), other.color);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.example.kafka.schema.petInfo.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.example.kafka.schema.petInfo.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public int getAge() {
      return age;
    }


    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public com.example.kafka.schema.petInfo.Builder setAge(int value) {
      validate(fields()[1], value);
      this.age = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public com.example.kafka.schema.petInfo.Builder clearAge() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'color' field.
      * @return The value.
      */
    public java.lang.CharSequence getColor() {
      return color;
    }


    /**
      * Sets the value of the 'color' field.
      * @param value The value of 'color'.
      * @return This builder.
      */
    public com.example.kafka.schema.petInfo.Builder setColor(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.color = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'color' field has been set.
      * @return True if the 'color' field has been set, false otherwise.
      */
    public boolean hasColor() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'color' field.
      * @return This builder.
      */
    public com.example.kafka.schema.petInfo.Builder clearColor() {
      color = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public petInfo build() {
      try {
        petInfo record = new petInfo();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.age = fieldSetFlags()[1] ? this.age : (java.lang.Integer) defaultValue(fields()[1]);
        record.color = fieldSetFlags()[2] ? this.color : (java.lang.CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<petInfo>
    WRITER$ = (org.apache.avro.io.DatumWriter<petInfo>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<petInfo>
    READER$ = (org.apache.avro.io.DatumReader<petInfo>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.name);

    out.writeInt(this.age);

    out.writeString(this.color);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      this.age = in.readInt();

      this.color = in.readString(this.color instanceof Utf8 ? (Utf8)this.color : null);

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 1:
          this.age = in.readInt();
          break;

        case 2:
          this.color = in.readString(this.color instanceof Utf8 ? (Utf8)this.color : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










