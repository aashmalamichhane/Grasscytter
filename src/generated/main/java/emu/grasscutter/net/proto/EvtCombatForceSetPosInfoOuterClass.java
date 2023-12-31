// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtCombatForceSetPosInfo.proto

package emu.grasscutter.net.proto;

public final class EvtCombatForceSetPosInfoOuterClass {
  private EvtCombatForceSetPosInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtCombatForceSetPosInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtCombatForceSetPosInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 CMJGEIMODDO = 12;</code>
     * @return The cMJGEIMODDO.
     */
    int getCMJGEIMODDO();

    /**
     * <code>.Vector target_pos = 5;</code>
     * @return Whether the targetPos field is set.
     */
    boolean hasTargetPos();
    /**
     * <code>.Vector target_pos = 5;</code>
     * @return The targetPos.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getTargetPos();
    /**
     * <code>.Vector target_pos = 5;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getTargetPosOrBuilder();

    /**
     * <code>uint32 JIKEAELPDOC = 3;</code>
     * @return The jIKEAELPDOC.
     */
    int getJIKEAELPDOC();

    /**
     * <code>uint32 entity_id = 1;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * Obf: DLAHFFBOIFA
   * </pre>
   *
   * Protobuf type {@code EvtCombatForceSetPosInfo}
   */
  public static final class EvtCombatForceSetPosInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtCombatForceSetPosInfo)
      EvtCombatForceSetPosInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtCombatForceSetPosInfo.newBuilder() to construct.
    private EvtCombatForceSetPosInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtCombatForceSetPosInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtCombatForceSetPosInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EvtCombatForceSetPosInfo(
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
            case 8: {

              entityId_ = input.readUInt32();
              break;
            }
            case 24: {

              jIKEAELPDOC_ = input.readUInt32();
              break;
            }
            case 42: {
              emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder subBuilder = null;
              if (targetPos_ != null) {
                subBuilder = targetPos_.toBuilder();
              }
              targetPos_ = input.readMessage(emu.grasscutter.net.proto.VectorOuterClass.Vector.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(targetPos_);
                targetPos_ = subBuilder.buildPartial();
              }

              break;
            }
            case 96: {

              cMJGEIMODDO_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.internal_static_EvtCombatForceSetPosInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.internal_static_EvtCombatForceSetPosInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo.class, emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo.Builder.class);
    }

    public static final int CMJGEIMODDO_FIELD_NUMBER = 12;
    private int cMJGEIMODDO_;
    /**
     * <code>uint32 CMJGEIMODDO = 12;</code>
     * @return The cMJGEIMODDO.
     */
    @java.lang.Override
    public int getCMJGEIMODDO() {
      return cMJGEIMODDO_;
    }

    public static final int TARGET_POS_FIELD_NUMBER = 5;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector targetPos_;
    /**
     * <code>.Vector target_pos = 5;</code>
     * @return Whether the targetPos field is set.
     */
    @java.lang.Override
    public boolean hasTargetPos() {
      return targetPos_ != null;
    }
    /**
     * <code>.Vector target_pos = 5;</code>
     * @return The targetPos.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getTargetPos() {
      return targetPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : targetPos_;
    }
    /**
     * <code>.Vector target_pos = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getTargetPosOrBuilder() {
      return getTargetPos();
    }

    public static final int JIKEAELPDOC_FIELD_NUMBER = 3;
    private int jIKEAELPDOC_;
    /**
     * <code>uint32 JIKEAELPDOC = 3;</code>
     * @return The jIKEAELPDOC.
     */
    @java.lang.Override
    public int getJIKEAELPDOC() {
      return jIKEAELPDOC_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 1;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 1;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
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
      if (entityId_ != 0) {
        output.writeUInt32(1, entityId_);
      }
      if (jIKEAELPDOC_ != 0) {
        output.writeUInt32(3, jIKEAELPDOC_);
      }
      if (targetPos_ != null) {
        output.writeMessage(5, getTargetPos());
      }
      if (cMJGEIMODDO_ != 0) {
        output.writeUInt32(12, cMJGEIMODDO_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, entityId_);
      }
      if (jIKEAELPDOC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, jIKEAELPDOC_);
      }
      if (targetPos_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getTargetPos());
      }
      if (cMJGEIMODDO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, cMJGEIMODDO_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo other = (emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo) obj;

      if (getCMJGEIMODDO()
          != other.getCMJGEIMODDO()) return false;
      if (hasTargetPos() != other.hasTargetPos()) return false;
      if (hasTargetPos()) {
        if (!getTargetPos()
            .equals(other.getTargetPos())) return false;
      }
      if (getJIKEAELPDOC()
          != other.getJIKEAELPDOC()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
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
      hash = (37 * hash) + CMJGEIMODDO_FIELD_NUMBER;
      hash = (53 * hash) + getCMJGEIMODDO();
      if (hasTargetPos()) {
        hash = (37 * hash) + TARGET_POS_FIELD_NUMBER;
        hash = (53 * hash) + getTargetPos().hashCode();
      }
      hash = (37 * hash) + JIKEAELPDOC_FIELD_NUMBER;
      hash = (53 * hash) + getJIKEAELPDOC();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo prototype) {
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
     * Obf: DLAHFFBOIFA
     * </pre>
     *
     * Protobuf type {@code EvtCombatForceSetPosInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtCombatForceSetPosInfo)
        emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.internal_static_EvtCombatForceSetPosInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.internal_static_EvtCombatForceSetPosInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo.class, emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo.newBuilder()
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
        cMJGEIMODDO_ = 0;

        if (targetPosBuilder_ == null) {
          targetPos_ = null;
        } else {
          targetPos_ = null;
          targetPosBuilder_ = null;
        }
        jIKEAELPDOC_ = 0;

        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.internal_static_EvtCombatForceSetPosInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo build() {
        emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo buildPartial() {
        emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo result = new emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo(this);
        result.cMJGEIMODDO_ = cMJGEIMODDO_;
        if (targetPosBuilder_ == null) {
          result.targetPos_ = targetPos_;
        } else {
          result.targetPos_ = targetPosBuilder_.build();
        }
        result.jIKEAELPDOC_ = jIKEAELPDOC_;
        result.entityId_ = entityId_;
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
        if (other instanceof emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo) {
          return mergeFrom((emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo other) {
        if (other == emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo.getDefaultInstance()) return this;
        if (other.getCMJGEIMODDO() != 0) {
          setCMJGEIMODDO(other.getCMJGEIMODDO());
        }
        if (other.hasTargetPos()) {
          mergeTargetPos(other.getTargetPos());
        }
        if (other.getJIKEAELPDOC() != 0) {
          setJIKEAELPDOC(other.getJIKEAELPDOC());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
        emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cMJGEIMODDO_ ;
      /**
       * <code>uint32 CMJGEIMODDO = 12;</code>
       * @return The cMJGEIMODDO.
       */
      @java.lang.Override
      public int getCMJGEIMODDO() {
        return cMJGEIMODDO_;
      }
      /**
       * <code>uint32 CMJGEIMODDO = 12;</code>
       * @param value The cMJGEIMODDO to set.
       * @return This builder for chaining.
       */
      public Builder setCMJGEIMODDO(int value) {
        
        cMJGEIMODDO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CMJGEIMODDO = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearCMJGEIMODDO() {
        
        cMJGEIMODDO_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VectorOuterClass.Vector targetPos_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> targetPosBuilder_;
      /**
       * <code>.Vector target_pos = 5;</code>
       * @return Whether the targetPos field is set.
       */
      public boolean hasTargetPos() {
        return targetPosBuilder_ != null || targetPos_ != null;
      }
      /**
       * <code>.Vector target_pos = 5;</code>
       * @return The targetPos.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getTargetPos() {
        if (targetPosBuilder_ == null) {
          return targetPos_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : targetPos_;
        } else {
          return targetPosBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector target_pos = 5;</code>
       */
      public Builder setTargetPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (targetPosBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          targetPos_ = value;
          onChanged();
        } else {
          targetPosBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.Vector target_pos = 5;</code>
       */
      public Builder setTargetPos(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (targetPosBuilder_ == null) {
          targetPos_ = builderForValue.build();
          onChanged();
        } else {
          targetPosBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.Vector target_pos = 5;</code>
       */
      public Builder mergeTargetPos(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (targetPosBuilder_ == null) {
          if (targetPos_ != null) {
            targetPos_ =
              emu.grasscutter.net.proto.VectorOuterClass.Vector.newBuilder(targetPos_).mergeFrom(value).buildPartial();
          } else {
            targetPos_ = value;
          }
          onChanged();
        } else {
          targetPosBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.Vector target_pos = 5;</code>
       */
      public Builder clearTargetPos() {
        if (targetPosBuilder_ == null) {
          targetPos_ = null;
          onChanged();
        } else {
          targetPos_ = null;
          targetPosBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.Vector target_pos = 5;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getTargetPosBuilder() {
        
        onChanged();
        return getTargetPosFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector target_pos = 5;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getTargetPosOrBuilder() {
        if (targetPosBuilder_ != null) {
          return targetPosBuilder_.getMessageOrBuilder();
        } else {
          return targetPos_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : targetPos_;
        }
      }
      /**
       * <code>.Vector target_pos = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getTargetPosFieldBuilder() {
        if (targetPosBuilder_ == null) {
          targetPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getTargetPos(),
                  getParentForChildren(),
                  isClean());
          targetPos_ = null;
        }
        return targetPosBuilder_;
      }

      private int jIKEAELPDOC_ ;
      /**
       * <code>uint32 JIKEAELPDOC = 3;</code>
       * @return The jIKEAELPDOC.
       */
      @java.lang.Override
      public int getJIKEAELPDOC() {
        return jIKEAELPDOC_;
      }
      /**
       * <code>uint32 JIKEAELPDOC = 3;</code>
       * @param value The jIKEAELPDOC to set.
       * @return This builder for chaining.
       */
      public Builder setJIKEAELPDOC(int value) {
        
        jIKEAELPDOC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JIKEAELPDOC = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearJIKEAELPDOC() {
        
        jIKEAELPDOC_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 1;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 1;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:EvtCombatForceSetPosInfo)
    }

    // @@protoc_insertion_point(class_scope:EvtCombatForceSetPosInfo)
    private static final emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo();
    }

    public static emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtCombatForceSetPosInfo>
        PARSER = new com.google.protobuf.AbstractParser<EvtCombatForceSetPosInfo>() {
      @java.lang.Override
      public EvtCombatForceSetPosInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EvtCombatForceSetPosInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EvtCombatForceSetPosInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtCombatForceSetPosInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EvtCombatForceSetPosInfoOuterClass.EvtCombatForceSetPosInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtCombatForceSetPosInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtCombatForceSetPosInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036EvtCombatForceSetPosInfo.proto\032\014Vector" +
      ".proto\"t\n\030EvtCombatForceSetPosInfo\022\023\n\013CM" +
      "JGEIMODDO\030\014 \001(\r\022\033\n\ntarget_pos\030\005 \001(\0132\007.Ve" +
      "ctor\022\023\n\013JIKEAELPDOC\030\003 \001(\r\022\021\n\tentity_id\030\001" +
      " \001(\rB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_EvtCombatForceSetPosInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtCombatForceSetPosInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtCombatForceSetPosInfo_descriptor,
        new java.lang.String[] { "CMJGEIMODDO", "TargetPos", "JIKEAELPDOC", "EntityId", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
