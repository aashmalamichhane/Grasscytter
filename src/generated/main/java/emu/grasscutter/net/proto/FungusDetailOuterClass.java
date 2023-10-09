// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FungusDetail.proto

package emu.grasscutter.net.proto;

public final class FungusDetailOuterClass {
  private FungusDetailOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FungusDetailOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FungusDetail)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 fungus_id = 6;</code>
     * @return The fungusId.
     */
    int getFungusId();

    /**
     * <code>uint32 POHAEGNNKFE = 15;</code>
     * @return The pOHAEGNNKFE.
     */
    int getPOHAEGNNKFE();

    /**
     * <code>bool is_cultivate = 7;</code>
     * @return The isCultivate.
     */
    boolean getIsCultivate();

    /**
     * <code>uint32 name_id = 3;</code>
     * @return The nameId.
     */
    int getNameId();

    /**
     * <code>uint32 EPEECFNCAJE = 9;</code>
     * @return The ePEECFNCAJE.
     */
    int getEPEECFNCAJE();
  }
  /**
   * <pre>
   * Obf: CGJNHNHCIIB
   * </pre>
   *
   * Protobuf type {@code FungusDetail}
   */
  public static final class FungusDetail extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FungusDetail)
      FungusDetailOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FungusDetail.newBuilder() to construct.
    private FungusDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FungusDetail() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FungusDetail();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FungusDetail(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 24: {

              nameId_ = input.readUInt32();
              break;
            }
            case 48: {

              fungusId_ = input.readUInt32();
              break;
            }
            case 56: {

              isCultivate_ = input.readBool();
              break;
            }
            case 72: {

              ePEECFNCAJE_ = input.readUInt32();
              break;
            }
            case 120: {

              pOHAEGNNKFE_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FungusDetailOuterClass.internal_static_FungusDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FungusDetailOuterClass.internal_static_FungusDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail.class, emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail.Builder.class);
    }

    public static final int FUNGUS_ID_FIELD_NUMBER = 6;
    private int fungusId_;
    /**
     * <code>uint32 fungus_id = 6;</code>
     * @return The fungusId.
     */
    @java.lang.Override
    public int getFungusId() {
      return fungusId_;
    }

    public static final int POHAEGNNKFE_FIELD_NUMBER = 15;
    private int pOHAEGNNKFE_;
    /**
     * <code>uint32 POHAEGNNKFE = 15;</code>
     * @return The pOHAEGNNKFE.
     */
    @java.lang.Override
    public int getPOHAEGNNKFE() {
      return pOHAEGNNKFE_;
    }

    public static final int IS_CULTIVATE_FIELD_NUMBER = 7;
    private boolean isCultivate_;
    /**
     * <code>bool is_cultivate = 7;</code>
     * @return The isCultivate.
     */
    @java.lang.Override
    public boolean getIsCultivate() {
      return isCultivate_;
    }

    public static final int NAME_ID_FIELD_NUMBER = 3;
    private int nameId_;
    /**
     * <code>uint32 name_id = 3;</code>
     * @return The nameId.
     */
    @java.lang.Override
    public int getNameId() {
      return nameId_;
    }

    public static final int EPEECFNCAJE_FIELD_NUMBER = 9;
    private int ePEECFNCAJE_;
    /**
     * <code>uint32 EPEECFNCAJE = 9;</code>
     * @return The ePEECFNCAJE.
     */
    @java.lang.Override
    public int getEPEECFNCAJE() {
      return ePEECFNCAJE_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (nameId_ != 0) {
        output.writeUInt32(3, nameId_);
      }
      if (fungusId_ != 0) {
        output.writeUInt32(6, fungusId_);
      }
      if (isCultivate_ != false) {
        output.writeBool(7, isCultivate_);
      }
      if (ePEECFNCAJE_ != 0) {
        output.writeUInt32(9, ePEECFNCAJE_);
      }
      if (pOHAEGNNKFE_ != 0) {
        output.writeUInt32(15, pOHAEGNNKFE_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (nameId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, nameId_);
      }
      if (fungusId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, fungusId_);
      }
      if (isCultivate_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isCultivate_);
      }
      if (ePEECFNCAJE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, ePEECFNCAJE_);
      }
      if (pOHAEGNNKFE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, pOHAEGNNKFE_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail other = (emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail) obj;

      if (getFungusId()
          != other.getFungusId()) return false;
      if (getPOHAEGNNKFE()
          != other.getPOHAEGNNKFE()) return false;
      if (getIsCultivate()
          != other.getIsCultivate()) return false;
      if (getNameId()
          != other.getNameId()) return false;
      if (getEPEECFNCAJE()
          != other.getEPEECFNCAJE()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + FUNGUS_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFungusId();
      hash = (37 * hash) + POHAEGNNKFE_FIELD_NUMBER;
      hash = (53 * hash) + getPOHAEGNNKFE();
      hash = (37 * hash) + IS_CULTIVATE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsCultivate());
      hash = (37 * hash) + NAME_ID_FIELD_NUMBER;
      hash = (53 * hash) + getNameId();
      hash = (37 * hash) + EPEECFNCAJE_FIELD_NUMBER;
      hash = (53 * hash) + getEPEECFNCAJE();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Obf: CGJNHNHCIIB
     * </pre>
     *
     * Protobuf type {@code FungusDetail}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FungusDetail)
        emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetailOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FungusDetailOuterClass.internal_static_FungusDetail_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FungusDetailOuterClass.internal_static_FungusDetail_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail.class, emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        fungusId_ = 0;

        pOHAEGNNKFE_ = 0;

        isCultivate_ = false;

        nameId_ = 0;

        ePEECFNCAJE_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FungusDetailOuterClass.internal_static_FungusDetail_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail build() {
        emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail buildPartial() {
        emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail result = new emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail(this);
        result.fungusId_ = fungusId_;
        result.pOHAEGNNKFE_ = pOHAEGNNKFE_;
        result.isCultivate_ = isCultivate_;
        result.nameId_ = nameId_;
        result.ePEECFNCAJE_ = ePEECFNCAJE_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail) {
          return mergeFrom((emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail other) {
        if (other == emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail.getDefaultInstance()) return this;
        if (other.getFungusId() != 0) {
          setFungusId(other.getFungusId());
        }
        if (other.getPOHAEGNNKFE() != 0) {
          setPOHAEGNNKFE(other.getPOHAEGNNKFE());
        }
        if (other.getIsCultivate() != false) {
          setIsCultivate(other.getIsCultivate());
        }
        if (other.getNameId() != 0) {
          setNameId(other.getNameId());
        }
        if (other.getEPEECFNCAJE() != 0) {
          setEPEECFNCAJE(other.getEPEECFNCAJE());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int fungusId_ ;
      /**
       * <code>uint32 fungus_id = 6;</code>
       * @return The fungusId.
       */
      @java.lang.Override
      public int getFungusId() {
        return fungusId_;
      }
      /**
       * <code>uint32 fungus_id = 6;</code>
       * @param value The fungusId to set.
       * @return This builder for chaining.
       */
      public Builder setFungusId(int value) {
        
        fungusId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 fungus_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearFungusId() {
        
        fungusId_ = 0;
        onChanged();
        return this;
      }

      private int pOHAEGNNKFE_ ;
      /**
       * <code>uint32 POHAEGNNKFE = 15;</code>
       * @return The pOHAEGNNKFE.
       */
      @java.lang.Override
      public int getPOHAEGNNKFE() {
        return pOHAEGNNKFE_;
      }
      /**
       * <code>uint32 POHAEGNNKFE = 15;</code>
       * @param value The pOHAEGNNKFE to set.
       * @return This builder for chaining.
       */
      public Builder setPOHAEGNNKFE(int value) {
        
        pOHAEGNNKFE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 POHAEGNNKFE = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearPOHAEGNNKFE() {
        
        pOHAEGNNKFE_ = 0;
        onChanged();
        return this;
      }

      private boolean isCultivate_ ;
      /**
       * <code>bool is_cultivate = 7;</code>
       * @return The isCultivate.
       */
      @java.lang.Override
      public boolean getIsCultivate() {
        return isCultivate_;
      }
      /**
       * <code>bool is_cultivate = 7;</code>
       * @param value The isCultivate to set.
       * @return This builder for chaining.
       */
      public Builder setIsCultivate(boolean value) {
        
        isCultivate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_cultivate = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsCultivate() {
        
        isCultivate_ = false;
        onChanged();
        return this;
      }

      private int nameId_ ;
      /**
       * <code>uint32 name_id = 3;</code>
       * @return The nameId.
       */
      @java.lang.Override
      public int getNameId() {
        return nameId_;
      }
      /**
       * <code>uint32 name_id = 3;</code>
       * @param value The nameId to set.
       * @return This builder for chaining.
       */
      public Builder setNameId(int value) {
        
        nameId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 name_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearNameId() {
        
        nameId_ = 0;
        onChanged();
        return this;
      }

      private int ePEECFNCAJE_ ;
      /**
       * <code>uint32 EPEECFNCAJE = 9;</code>
       * @return The ePEECFNCAJE.
       */
      @java.lang.Override
      public int getEPEECFNCAJE() {
        return ePEECFNCAJE_;
      }
      /**
       * <code>uint32 EPEECFNCAJE = 9;</code>
       * @param value The ePEECFNCAJE to set.
       * @return This builder for chaining.
       */
      public Builder setEPEECFNCAJE(int value) {
        
        ePEECFNCAJE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 EPEECFNCAJE = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearEPEECFNCAJE() {
        
        ePEECFNCAJE_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:FungusDetail)
    }

    // @@protoc_insertion_point(class_scope:FungusDetail)
    private static final emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail();
    }

    public static emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FungusDetail>
        PARSER = new com.google.protobuf.AbstractParser<FungusDetail>() {
      @java.lang.Override
      public FungusDetail parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FungusDetail(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FungusDetail> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FungusDetail> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FungusDetailOuterClass.FungusDetail getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FungusDetail_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FungusDetail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022FungusDetail.proto\"r\n\014FungusDetail\022\021\n\t" +
      "fungus_id\030\006 \001(\r\022\023\n\013POHAEGNNKFE\030\017 \001(\r\022\024\n\014" +
      "is_cultivate\030\007 \001(\010\022\017\n\007name_id\030\003 \001(\r\022\023\n\013E" +
      "PEECFNCAJE\030\t \001(\rB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FungusDetail_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FungusDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FungusDetail_descriptor,
        new java.lang.String[] { "FungusId", "POHAEGNNKFE", "IsCultivate", "NameId", "EPEECFNCAJE", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}