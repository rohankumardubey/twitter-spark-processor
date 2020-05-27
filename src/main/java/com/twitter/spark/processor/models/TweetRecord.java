/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.twitter.spark.processor.models;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

import java.io.Serializable;

/** * A Tweet Record */
@org.apache.avro.specific.AvroGenerated
public class TweetRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4792376315524327733L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TweetRecord\",\"namespace\":\"com.twitter.spark.processor.models\",\"doc\":\"* A Tweet Record\",\"fields\":[{\"name\":\"tweetID\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"* ID of the Tweet\"},{\"name\":\"tweetDescription\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"* Text Description of the Tweet\",\"default\":null},{\"name\":\"creationDtTm\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"* Text Description of the Tweet\",\"default\":null},{\"name\":\"tweetUserID\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"* Text Description of the Tweet\",\"default\":null},{\"name\":\"tweetUserName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"* Text Description of the Tweet\",\"default\":null},{\"name\":\"tweetUserLocation\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"* Text Description of the Tweet\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TweetRecord> ENCODER =
      new BinaryMessageEncoder<TweetRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TweetRecord> DECODER =
      new BinaryMessageDecoder<TweetRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TweetRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TweetRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TweetRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<TweetRecord>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TweetRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TweetRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TweetRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TweetRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** * ID of the Tweet */
  @Deprecated public java.lang.String tweetID;
  /** * Text Description of the Tweet */
  @Deprecated public java.lang.String tweetDescription;
  /** * Text Description of the Tweet */
  @Deprecated public java.lang.String creationDtTm;
  /** * Text Description of the Tweet */
  @Deprecated public java.lang.String tweetUserID;
  /** * Text Description of the Tweet */
  @Deprecated public java.lang.String tweetUserName;
  /** * Text Description of the Tweet */
  @Deprecated public java.lang.String tweetUserLocation;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TweetRecord() {}

  /**
   * All-args constructor.
   * @param tweetID * ID of the Tweet
   * @param tweetDescription * Text Description of the Tweet
   * @param creationDtTm * Text Description of the Tweet
   * @param tweetUserID * Text Description of the Tweet
   * @param tweetUserName * Text Description of the Tweet
   * @param tweetUserLocation * Text Description of the Tweet
   */
  public TweetRecord(java.lang.String tweetID, java.lang.String tweetDescription, java.lang.String creationDtTm, java.lang.String tweetUserID, java.lang.String tweetUserName, java.lang.String tweetUserLocation) {
    this.tweetID = tweetID;
    this.tweetDescription = tweetDescription;
    this.creationDtTm = creationDtTm;
    this.tweetUserID = tweetUserID;
    this.tweetUserName = tweetUserName;
    this.tweetUserLocation = tweetUserLocation;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return tweetID;
    case 1: return tweetDescription;
    case 2: return creationDtTm;
    case 3: return tweetUserID;
    case 4: return tweetUserName;
    case 5: return tweetUserLocation;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: tweetID = value$ != null ? value$.toString() : null; break;
    case 1: tweetDescription = value$ != null ? value$.toString() : null; break;
    case 2: creationDtTm = value$ != null ? value$.toString() : null; break;
    case 3: tweetUserID = value$ != null ? value$.toString() : null; break;
    case 4: tweetUserName = value$ != null ? value$.toString() : null; break;
    case 5: tweetUserLocation = value$ != null ? value$.toString() : null; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'tweetID' field.
   * @return * ID of the Tweet
   */
  public java.lang.String getTweetID() {
    return tweetID;
  }



  /**
   * Gets the value of the 'tweetDescription' field.
   * @return * Text Description of the Tweet
   */
  public java.lang.String getTweetDescription() {
    return tweetDescription;
  }



  /**
   * Gets the value of the 'creationDtTm' field.
   * @return * Text Description of the Tweet
   */
  public java.lang.String getCreationDtTm() {
    return creationDtTm;
  }



  /**
   * Gets the value of the 'tweetUserID' field.
   * @return * Text Description of the Tweet
   */
  public java.lang.String getTweetUserID() {
    return tweetUserID;
  }



  /**
   * Gets the value of the 'tweetUserName' field.
   * @return * Text Description of the Tweet
   */
  public java.lang.String getTweetUserName() {
    return tweetUserName;
  }



  /**
   * Gets the value of the 'tweetUserLocation' field.
   * @return * Text Description of the Tweet
   */
  public java.lang.String getTweetUserLocation() {
    return tweetUserLocation;
  }



  /**
   * Creates a new TweetRecord RecordBuilder.
   * @return A new TweetRecord RecordBuilder
   */
  public static com.twitter.spark.processor.models.TweetRecord.Builder newBuilder() {
    return new com.twitter.spark.processor.models.TweetRecord.Builder();
  }

  /**
   * Creates a new TweetRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TweetRecord RecordBuilder
   */
  public static com.twitter.spark.processor.models.TweetRecord.Builder newBuilder(com.twitter.spark.processor.models.TweetRecord.Builder other) {
    if (other == null) {
      return new com.twitter.spark.processor.models.TweetRecord.Builder();
    } else {
      return new com.twitter.spark.processor.models.TweetRecord.Builder(other);
    }
  }

  /**
   * Creates a new TweetRecord RecordBuilder by copying an existing TweetRecord instance.
   * @param other The existing instance to copy.
   * @return A new TweetRecord RecordBuilder
   */
  public static com.twitter.spark.processor.models.TweetRecord.Builder newBuilder(com.twitter.spark.processor.models.TweetRecord other) {
    if (other == null) {
      return new com.twitter.spark.processor.models.TweetRecord.Builder();
    } else {
      return new com.twitter.spark.processor.models.TweetRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for TweetRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TweetRecord>
    implements org.apache.avro.data.RecordBuilder<TweetRecord> {

    /** * ID of the Tweet */
    private java.lang.String tweetID;
    /** * Text Description of the Tweet */
    private java.lang.String tweetDescription;
    /** * Text Description of the Tweet */
    private java.lang.String creationDtTm;
    /** * Text Description of the Tweet */
    private java.lang.String tweetUserID;
    /** * Text Description of the Tweet */
    private java.lang.String tweetUserName;
    /** * Text Description of the Tweet */
    private java.lang.String tweetUserLocation;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.twitter.spark.processor.models.TweetRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.tweetID)) {
        this.tweetID = data().deepCopy(fields()[0].schema(), other.tweetID);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.tweetDescription)) {
        this.tweetDescription = data().deepCopy(fields()[1].schema(), other.tweetDescription);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.creationDtTm)) {
        this.creationDtTm = data().deepCopy(fields()[2].schema(), other.creationDtTm);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.tweetUserID)) {
        this.tweetUserID = data().deepCopy(fields()[3].schema(), other.tweetUserID);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.tweetUserName)) {
        this.tweetUserName = data().deepCopy(fields()[4].schema(), other.tweetUserName);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.tweetUserLocation)) {
        this.tweetUserLocation = data().deepCopy(fields()[5].schema(), other.tweetUserLocation);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing TweetRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(com.twitter.spark.processor.models.TweetRecord other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.tweetID)) {
        this.tweetID = data().deepCopy(fields()[0].schema(), other.tweetID);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.tweetDescription)) {
        this.tweetDescription = data().deepCopy(fields()[1].schema(), other.tweetDescription);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.creationDtTm)) {
        this.creationDtTm = data().deepCopy(fields()[2].schema(), other.creationDtTm);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.tweetUserID)) {
        this.tweetUserID = data().deepCopy(fields()[3].schema(), other.tweetUserID);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.tweetUserName)) {
        this.tweetUserName = data().deepCopy(fields()[4].schema(), other.tweetUserName);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.tweetUserLocation)) {
        this.tweetUserLocation = data().deepCopy(fields()[5].schema(), other.tweetUserLocation);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'tweetID' field.
      * * ID of the Tweet
      * @return The value.
      */
    public java.lang.String getTweetID() {
      return tweetID;
    }


    /**
      * Sets the value of the 'tweetID' field.
      * * ID of the Tweet
      * @param value The value of 'tweetID'.
      * @return This builder.
      */
    public com.twitter.spark.processor.models.TweetRecord.Builder setTweetID(java.lang.String value) {
      validate(fields()[0], value);
      this.tweetID = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'tweetID' field has been set.
      * * ID of the Tweet
      * @return True if the 'tweetID' field has been set, false otherwise.
      */
    public boolean hasTweetID() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'tweetID' field.
      * * ID of the Tweet
      * @return This builder.
      */
    public com.twitter.spark.processor.models.TweetRecord.Builder clearTweetID() {
      tweetID = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'tweetDescription' field.
      * * Text Description of the Tweet
      * @return The value.
      */
    public java.lang.String getTweetDescription() {
      return tweetDescription;
    }


    /**
      * Sets the value of the 'tweetDescription' field.
      * * Text Description of the Tweet
      * @param value The value of 'tweetDescription'.
      * @return This builder.
      */
    public com.twitter.spark.processor.models.TweetRecord.Builder setTweetDescription(java.lang.String value) {
      validate(fields()[1], value);
      this.tweetDescription = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'tweetDescription' field has been set.
      * * Text Description of the Tweet
      * @return True if the 'tweetDescription' field has been set, false otherwise.
      */
    public boolean hasTweetDescription() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'tweetDescription' field.
      * * Text Description of the Tweet
      * @return This builder.
      */
    public com.twitter.spark.processor.models.TweetRecord.Builder clearTweetDescription() {
      tweetDescription = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'creationDtTm' field.
      * * Text Description of the Tweet
      * @return The value.
      */
    public java.lang.String getCreationDtTm() {
      return creationDtTm;
    }


    /**
      * Sets the value of the 'creationDtTm' field.
      * * Text Description of the Tweet
      * @param value The value of 'creationDtTm'.
      * @return This builder.
      */
    public com.twitter.spark.processor.models.TweetRecord.Builder setCreationDtTm(java.lang.String value) {
      validate(fields()[2], value);
      this.creationDtTm = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'creationDtTm' field has been set.
      * * Text Description of the Tweet
      * @return True if the 'creationDtTm' field has been set, false otherwise.
      */
    public boolean hasCreationDtTm() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'creationDtTm' field.
      * * Text Description of the Tweet
      * @return This builder.
      */
    public com.twitter.spark.processor.models.TweetRecord.Builder clearCreationDtTm() {
      creationDtTm = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'tweetUserID' field.
      * * Text Description of the Tweet
      * @return The value.
      */
    public java.lang.String getTweetUserID() {
      return tweetUserID;
    }


    /**
      * Sets the value of the 'tweetUserID' field.
      * * Text Description of the Tweet
      * @param value The value of 'tweetUserID'.
      * @return This builder.
      */
    public com.twitter.spark.processor.models.TweetRecord.Builder setTweetUserID(java.lang.String value) {
      validate(fields()[3], value);
      this.tweetUserID = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'tweetUserID' field has been set.
      * * Text Description of the Tweet
      * @return True if the 'tweetUserID' field has been set, false otherwise.
      */
    public boolean hasTweetUserID() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'tweetUserID' field.
      * * Text Description of the Tweet
      * @return This builder.
      */
    public com.twitter.spark.processor.models.TweetRecord.Builder clearTweetUserID() {
      tweetUserID = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'tweetUserName' field.
      * * Text Description of the Tweet
      * @return The value.
      */
    public java.lang.String getTweetUserName() {
      return tweetUserName;
    }


    /**
      * Sets the value of the 'tweetUserName' field.
      * * Text Description of the Tweet
      * @param value The value of 'tweetUserName'.
      * @return This builder.
      */
    public com.twitter.spark.processor.models.TweetRecord.Builder setTweetUserName(java.lang.String value) {
      validate(fields()[4], value);
      this.tweetUserName = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'tweetUserName' field has been set.
      * * Text Description of the Tweet
      * @return True if the 'tweetUserName' field has been set, false otherwise.
      */
    public boolean hasTweetUserName() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'tweetUserName' field.
      * * Text Description of the Tweet
      * @return This builder.
      */
    public com.twitter.spark.processor.models.TweetRecord.Builder clearTweetUserName() {
      tweetUserName = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'tweetUserLocation' field.
      * * Text Description of the Tweet
      * @return The value.
      */
    public java.lang.String getTweetUserLocation() {
      return tweetUserLocation;
    }


    /**
      * Sets the value of the 'tweetUserLocation' field.
      * * Text Description of the Tweet
      * @param value The value of 'tweetUserLocation'.
      * @return This builder.
      */
    public com.twitter.spark.processor.models.TweetRecord.Builder setTweetUserLocation(java.lang.String value) {
      validate(fields()[5], value);
      this.tweetUserLocation = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'tweetUserLocation' field has been set.
      * * Text Description of the Tweet
      * @return True if the 'tweetUserLocation' field has been set, false otherwise.
      */
    public boolean hasTweetUserLocation() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'tweetUserLocation' field.
      * * Text Description of the Tweet
      * @return This builder.
      */
    public com.twitter.spark.processor.models.TweetRecord.Builder clearTweetUserLocation() {
      tweetUserLocation = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TweetRecord build() {
      try {
        TweetRecord record = new TweetRecord();
        record.tweetID = fieldSetFlags()[0] ? this.tweetID : (java.lang.String) defaultValue(fields()[0]);
        record.tweetDescription = fieldSetFlags()[1] ? this.tweetDescription : (java.lang.String) defaultValue(fields()[1]);
        record.creationDtTm = fieldSetFlags()[2] ? this.creationDtTm : (java.lang.String) defaultValue(fields()[2]);
        record.tweetUserID = fieldSetFlags()[3] ? this.tweetUserID : (java.lang.String) defaultValue(fields()[3]);
        record.tweetUserName = fieldSetFlags()[4] ? this.tweetUserName : (java.lang.String) defaultValue(fields()[4]);
        record.tweetUserLocation = fieldSetFlags()[5] ? this.tweetUserLocation : (java.lang.String) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TweetRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<TweetRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TweetRecord>
    READER$ = (org.apache.avro.io.DatumReader<TweetRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.tweetID);

    if (this.tweetDescription == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.tweetDescription);
    }

    if (this.creationDtTm == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.creationDtTm);
    }

    if (this.tweetUserID == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.tweetUserID);
    }

    if (this.tweetUserName == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.tweetUserName);
    }

    if (this.tweetUserLocation == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.tweetUserLocation);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.tweetID = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.tweetDescription = null;
      } else {
        this.tweetDescription = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.creationDtTm = null;
      } else {
        this.creationDtTm = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.tweetUserID = null;
      } else {
        this.tweetUserID = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.tweetUserName = null;
      } else {
        this.tweetUserName = in.readString();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.tweetUserLocation = null;
      } else {
        this.tweetUserLocation = in.readString();
      }

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.tweetID = in.readString();
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.tweetDescription = null;
          } else {
            this.tweetDescription = in.readString();
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.creationDtTm = null;
          } else {
            this.creationDtTm = in.readString();
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.tweetUserID = null;
          } else {
            this.tweetUserID = in.readString();
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.tweetUserName = null;
          } else {
            this.tweetUserName = in.readString();
          }
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.tweetUserLocation = null;
          } else {
            this.tweetUserLocation = in.readString();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









