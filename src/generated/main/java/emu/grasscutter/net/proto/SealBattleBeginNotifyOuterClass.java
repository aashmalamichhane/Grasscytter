// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SealBattleBeginNotify.proto

package emu.grasscutter.net.proto;

public final class SealBattleBeginNotifyOuterClass {
  private SealBattleBeginNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SealBattleBeginNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SealBattleBeginNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 CMPKIKADOJJ = 10;</code>
     * @return The cMPKIKADOJJ.
     */
    int getCMPKIKADOJJ();

    /**
     * <code>uint32 PDKCGAJOEPC = 11;</code>
     * @return The pDKCGAJOEPC.
     */
    int getPDKCGAJOEPC();

    /**
     * <code>.SealBattleType battle_type = 3;</code>
     * @return The enum numeric value on the wire for battleType.
     */
    int getBattleTypeValue();
    /**
     * <code>.SealBattleType battle_type = 3;</code>
     * @return The battleType.
     */
    emu.grasscutter.net.proto.SealBattleTypeOuterClass.SealBattleType getBattleType();

    /**
     * <code>uint32 seal_entity_id = 12;</code>
     * @return The sealEntityId.
     */
    int getSealEntityId();
  }
  /**
   * <pre>
   * CmdId: 5120
   * Obf: NFIKHEKALCG
   * </pre>
   *
   * Protobuf type {@code SealBattleBeginNotify}
   */
  public static final class SealBattleBeginNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SealBattleBeginNotify)
      SealBattleBeginNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SealBattleBeginNotify.newBuilder() to construct.
    private SealBattleBeginNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SealBattleBeginNotify() {
      battleType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SealBattleBeginNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SealBattleBeginNotify(
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
              int rawValue = input.readEnum();

              battleType_ = rawValue;
              break;
            }
            case 80: {

              cMPKIKADOJJ_ = input.readUInt32();
              break;
            }
            case 88: {

              pDKCGAJOEPC_ = input.readUInt32();
              break;
            }
            case 96: {

              sealEntityId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.internal_static_SealBattleBeginNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.internal_static_SealBattleBeginNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify.class, emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify.Builder.class);
    }

    public static final int CMPKIKADOJJ_FIELD_NUMBER = 10;
    private int cMPKIKADOJJ_;
    /**
     * <code>uint32 CMPKIKADOJJ = 10;</code>
     * @return The cMPKIKADOJJ.
     */
    @java.lang.Override
    public int getCMPKIKADOJJ() {
      return cMPKIKADOJJ_;
    }

    public static final int PDKCGAJOEPC_FIELD_NUMBER = 11;
    private int pDKCGAJOEPC_;
    /**
     * <code>uint32 PDKCGAJOEPC = 11;</code>
     * @return The pDKCGAJOEPC.
     */
    @java.lang.Override
    public int getPDKCGAJOEPC() {
      return pDKCGAJOEPC_;
    }

    public static final int BATTLE_TYPE_FIELD_NUMBER = 3;
    private int battleType_;
    /**
     * <code>.SealBattleType battle_type = 3;</code>
     * @return The enum numeric value on the wire for battleType.
     */
    @java.lang.Override public int getBattleTypeValue() {
      return battleType_;
    }
    /**
     * <code>.SealBattleType battle_type = 3;</code>
     * @return The battleType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.SealBattleTypeOuterClass.SealBattleType getBattleType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.SealBattleTypeOuterClass.SealBattleType result = emu.grasscutter.net.proto.SealBattleTypeOuterClass.SealBattleType.valueOf(battleType_);
      return result == null ? emu.grasscutter.net.proto.SealBattleTypeOuterClass.SealBattleType.UNRECOGNIZED : result;
    }

    public static final int SEAL_ENTITY_ID_FIELD_NUMBER = 12;
    private int sealEntityId_;
    /**
     * <code>uint32 seal_entity_id = 12;</code>
     * @return The sealEntityId.
     */
    @java.lang.Override
    public int getSealEntityId() {
      return sealEntityId_;
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
      if (battleType_ != emu.grasscutter.net.proto.SealBattleTypeOuterClass.SealBattleType.SEAL_BATTLE_KEEP_ALIVE.getNumber()) {
        output.writeEnum(3, battleType_);
      }
      if (cMPKIKADOJJ_ != 0) {
        output.writeUInt32(10, cMPKIKADOJJ_);
      }
      if (pDKCGAJOEPC_ != 0) {
        output.writeUInt32(11, pDKCGAJOEPC_);
      }
      if (sealEntityId_ != 0) {
        output.writeUInt32(12, sealEntityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (battleType_ != emu.grasscutter.net.proto.SealBattleTypeOuterClass.SealBattleType.SEAL_BATTLE_KEEP_ALIVE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, battleType_);
      }
      if (cMPKIKADOJJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, cMPKIKADOJJ_);
      }
      if (pDKCGAJOEPC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, pDKCGAJOEPC_);
      }
      if (sealEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, sealEntityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify other = (emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify) obj;

      if (getCMPKIKADOJJ()
          != other.getCMPKIKADOJJ()) return false;
      if (getPDKCGAJOEPC()
          != other.getPDKCGAJOEPC()) return false;
      if (battleType_ != other.battleType_) return false;
      if (getSealEntityId()
          != other.getSealEntityId()) return false;
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
      hash = (37 * hash) + CMPKIKADOJJ_FIELD_NUMBER;
      hash = (53 * hash) + getCMPKIKADOJJ();
      hash = (37 * hash) + PDKCGAJOEPC_FIELD_NUMBER;
      hash = (53 * hash) + getPDKCGAJOEPC();
      hash = (37 * hash) + BATTLE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + battleType_;
      hash = (37 * hash) + SEAL_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSealEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify prototype) {
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
     * CmdId: 5120
     * Obf: NFIKHEKALCG
     * </pre>
     *
     * Protobuf type {@code SealBattleBeginNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SealBattleBeginNotify)
        emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.internal_static_SealBattleBeginNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.internal_static_SealBattleBeginNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify.class, emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify.newBuilder()
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
        cMPKIKADOJJ_ = 0;

        pDKCGAJOEPC_ = 0;

        battleType_ = 0;

        sealEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.internal_static_SealBattleBeginNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify build() {
        emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify buildPartial() {
        emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify result = new emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify(this);
        result.cMPKIKADOJJ_ = cMPKIKADOJJ_;
        result.pDKCGAJOEPC_ = pDKCGAJOEPC_;
        result.battleType_ = battleType_;
        result.sealEntityId_ = sealEntityId_;
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
        if (other instanceof emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify) {
          return mergeFrom((emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify other) {
        if (other == emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify.getDefaultInstance()) return this;
        if (other.getCMPKIKADOJJ() != 0) {
          setCMPKIKADOJJ(other.getCMPKIKADOJJ());
        }
        if (other.getPDKCGAJOEPC() != 0) {
          setPDKCGAJOEPC(other.getPDKCGAJOEPC());
        }
        if (other.battleType_ != 0) {
          setBattleTypeValue(other.getBattleTypeValue());
        }
        if (other.getSealEntityId() != 0) {
          setSealEntityId(other.getSealEntityId());
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
        emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cMPKIKADOJJ_ ;
      /**
       * <code>uint32 CMPKIKADOJJ = 10;</code>
       * @return The cMPKIKADOJJ.
       */
      @java.lang.Override
      public int getCMPKIKADOJJ() {
        return cMPKIKADOJJ_;
      }
      /**
       * <code>uint32 CMPKIKADOJJ = 10;</code>
       * @param value The cMPKIKADOJJ to set.
       * @return This builder for chaining.
       */
      public Builder setCMPKIKADOJJ(int value) {
        
        cMPKIKADOJJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CMPKIKADOJJ = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearCMPKIKADOJJ() {
        
        cMPKIKADOJJ_ = 0;
        onChanged();
        return this;
      }

      private int pDKCGAJOEPC_ ;
      /**
       * <code>uint32 PDKCGAJOEPC = 11;</code>
       * @return The pDKCGAJOEPC.
       */
      @java.lang.Override
      public int getPDKCGAJOEPC() {
        return pDKCGAJOEPC_;
      }
      /**
       * <code>uint32 PDKCGAJOEPC = 11;</code>
       * @param value The pDKCGAJOEPC to set.
       * @return This builder for chaining.
       */
      public Builder setPDKCGAJOEPC(int value) {
        
        pDKCGAJOEPC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 PDKCGAJOEPC = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearPDKCGAJOEPC() {
        
        pDKCGAJOEPC_ = 0;
        onChanged();
        return this;
      }

      private int battleType_ = 0;
      /**
       * <code>.SealBattleType battle_type = 3;</code>
       * @return The enum numeric value on the wire for battleType.
       */
      @java.lang.Override public int getBattleTypeValue() {
        return battleType_;
      }
      /**
       * <code>.SealBattleType battle_type = 3;</code>
       * @param value The enum numeric value on the wire for battleType to set.
       * @return This builder for chaining.
       */
      public Builder setBattleTypeValue(int value) {
        
        battleType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.SealBattleType battle_type = 3;</code>
       * @return The battleType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.SealBattleTypeOuterClass.SealBattleType getBattleType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.SealBattleTypeOuterClass.SealBattleType result = emu.grasscutter.net.proto.SealBattleTypeOuterClass.SealBattleType.valueOf(battleType_);
        return result == null ? emu.grasscutter.net.proto.SealBattleTypeOuterClass.SealBattleType.UNRECOGNIZED : result;
      }
      /**
       * <code>.SealBattleType battle_type = 3;</code>
       * @param value The battleType to set.
       * @return This builder for chaining.
       */
      public Builder setBattleType(emu.grasscutter.net.proto.SealBattleTypeOuterClass.SealBattleType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        battleType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.SealBattleType battle_type = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBattleType() {
        
        battleType_ = 0;
        onChanged();
        return this;
      }

      private int sealEntityId_ ;
      /**
       * <code>uint32 seal_entity_id = 12;</code>
       * @return The sealEntityId.
       */
      @java.lang.Override
      public int getSealEntityId() {
        return sealEntityId_;
      }
      /**
       * <code>uint32 seal_entity_id = 12;</code>
       * @param value The sealEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setSealEntityId(int value) {
        
        sealEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 seal_entity_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearSealEntityId() {
        
        sealEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SealBattleBeginNotify)
    }

    // @@protoc_insertion_point(class_scope:SealBattleBeginNotify)
    private static final emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify();
    }

    public static emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SealBattleBeginNotify>
        PARSER = new com.google.protobuf.AbstractParser<SealBattleBeginNotify>() {
      @java.lang.Override
      public SealBattleBeginNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SealBattleBeginNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SealBattleBeginNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SealBattleBeginNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SealBattleBeginNotifyOuterClass.SealBattleBeginNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SealBattleBeginNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SealBattleBeginNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033SealBattleBeginNotify.proto\032\024SealBattl" +
      "eType.proto\"\177\n\025SealBattleBeginNotify\022\023\n\013" +
      "CMPKIKADOJJ\030\n \001(\r\022\023\n\013PDKCGAJOEPC\030\013 \001(\r\022$" +
      "\n\013battle_type\030\003 \001(\0162\017.SealBattleType\022\026\n\016" +
      "seal_entity_id\030\014 \001(\rB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.SealBattleTypeOuterClass.getDescriptor(),
        });
    internal_static_SealBattleBeginNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SealBattleBeginNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SealBattleBeginNotify_descriptor,
        new java.lang.String[] { "CMPKIKADOJJ", "PDKCGAJOEPC", "BattleType", "SealEntityId", });
    emu.grasscutter.net.proto.SealBattleTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
