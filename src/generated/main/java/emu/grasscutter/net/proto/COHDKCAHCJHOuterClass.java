// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: COHDKCAHCJH.proto

package emu.grasscutter.net.proto;

public final class COHDKCAHCJHOuterClass {
  private COHDKCAHCJHOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface COHDKCAHCJHOrBuilder extends
      // @@protoc_insertion_point(interface_extends:COHDKCAHCJH)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 JODKDAPEEIC = 15;</code>
     * @return The jODKDAPEEIC.
     */
    int getJODKDAPEEIC();

    /**
     * <code>.GCGGameBriefData EAICNLGBIAH = 7;</code>
     * @return Whether the eAICNLGBIAH field is set.
     */
    boolean hasEAICNLGBIAH();
    /**
     * <code>.GCGGameBriefData EAICNLGBIAH = 7;</code>
     * @return The eAICNLGBIAH.
     */
    emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData getEAICNLGBIAH();
    /**
     * <code>.GCGGameBriefData EAICNLGBIAH = 7;</code>
     */
    emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefDataOrBuilder getEAICNLGBIAHOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 24014
   * </pre>
   *
   * Protobuf type {@code COHDKCAHCJH}
   */
  public static final class COHDKCAHCJH extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:COHDKCAHCJH)
      COHDKCAHCJHOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use COHDKCAHCJH.newBuilder() to construct.
    private COHDKCAHCJH(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private COHDKCAHCJH() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new COHDKCAHCJH();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private COHDKCAHCJH(
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
            case 58: {
              emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData.Builder subBuilder = null;
              if (eAICNLGBIAH_ != null) {
                subBuilder = eAICNLGBIAH_.toBuilder();
              }
              eAICNLGBIAH_ = input.readMessage(emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(eAICNLGBIAH_);
                eAICNLGBIAH_ = subBuilder.buildPartial();
              }

              break;
            }
            case 120: {

              jODKDAPEEIC_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.internal_static_COHDKCAHCJH_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.internal_static_COHDKCAHCJH_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH.class, emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH.Builder.class);
    }

    public static final int JODKDAPEEIC_FIELD_NUMBER = 15;
    private int jODKDAPEEIC_;
    /**
     * <code>uint32 JODKDAPEEIC = 15;</code>
     * @return The jODKDAPEEIC.
     */
    @java.lang.Override
    public int getJODKDAPEEIC() {
      return jODKDAPEEIC_;
    }

    public static final int EAICNLGBIAH_FIELD_NUMBER = 7;
    private emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData eAICNLGBIAH_;
    /**
     * <code>.GCGGameBriefData EAICNLGBIAH = 7;</code>
     * @return Whether the eAICNLGBIAH field is set.
     */
    @java.lang.Override
    public boolean hasEAICNLGBIAH() {
      return eAICNLGBIAH_ != null;
    }
    /**
     * <code>.GCGGameBriefData EAICNLGBIAH = 7;</code>
     * @return The eAICNLGBIAH.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData getEAICNLGBIAH() {
      return eAICNLGBIAH_ == null ? emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData.getDefaultInstance() : eAICNLGBIAH_;
    }
    /**
     * <code>.GCGGameBriefData EAICNLGBIAH = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefDataOrBuilder getEAICNLGBIAHOrBuilder() {
      return getEAICNLGBIAH();
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
      if (eAICNLGBIAH_ != null) {
        output.writeMessage(7, getEAICNLGBIAH());
      }
      if (jODKDAPEEIC_ != 0) {
        output.writeUInt32(15, jODKDAPEEIC_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (eAICNLGBIAH_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getEAICNLGBIAH());
      }
      if (jODKDAPEEIC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, jODKDAPEEIC_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH other = (emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH) obj;

      if (getJODKDAPEEIC()
          != other.getJODKDAPEEIC()) return false;
      if (hasEAICNLGBIAH() != other.hasEAICNLGBIAH()) return false;
      if (hasEAICNLGBIAH()) {
        if (!getEAICNLGBIAH()
            .equals(other.getEAICNLGBIAH())) return false;
      }
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
      hash = (37 * hash) + JODKDAPEEIC_FIELD_NUMBER;
      hash = (53 * hash) + getJODKDAPEEIC();
      if (hasEAICNLGBIAH()) {
        hash = (37 * hash) + EAICNLGBIAH_FIELD_NUMBER;
        hash = (53 * hash) + getEAICNLGBIAH().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH prototype) {
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
     * CmdId: 24014
     * </pre>
     *
     * Protobuf type {@code COHDKCAHCJH}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:COHDKCAHCJH)
        emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJHOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.internal_static_COHDKCAHCJH_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.internal_static_COHDKCAHCJH_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH.class, emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH.newBuilder()
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
        jODKDAPEEIC_ = 0;

        if (eAICNLGBIAHBuilder_ == null) {
          eAICNLGBIAH_ = null;
        } else {
          eAICNLGBIAH_ = null;
          eAICNLGBIAHBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.internal_static_COHDKCAHCJH_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH build() {
        emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH buildPartial() {
        emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH result = new emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH(this);
        result.jODKDAPEEIC_ = jODKDAPEEIC_;
        if (eAICNLGBIAHBuilder_ == null) {
          result.eAICNLGBIAH_ = eAICNLGBIAH_;
        } else {
          result.eAICNLGBIAH_ = eAICNLGBIAHBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH) {
          return mergeFrom((emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH other) {
        if (other == emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH.getDefaultInstance()) return this;
        if (other.getJODKDAPEEIC() != 0) {
          setJODKDAPEEIC(other.getJODKDAPEEIC());
        }
        if (other.hasEAICNLGBIAH()) {
          mergeEAICNLGBIAH(other.getEAICNLGBIAH());
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
        emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int jODKDAPEEIC_ ;
      /**
       * <code>uint32 JODKDAPEEIC = 15;</code>
       * @return The jODKDAPEEIC.
       */
      @java.lang.Override
      public int getJODKDAPEEIC() {
        return jODKDAPEEIC_;
      }
      /**
       * <code>uint32 JODKDAPEEIC = 15;</code>
       * @param value The jODKDAPEEIC to set.
       * @return This builder for chaining.
       */
      public Builder setJODKDAPEEIC(int value) {
        
        jODKDAPEEIC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JODKDAPEEIC = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearJODKDAPEEIC() {
        
        jODKDAPEEIC_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData eAICNLGBIAH_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData, emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData.Builder, emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefDataOrBuilder> eAICNLGBIAHBuilder_;
      /**
       * <code>.GCGGameBriefData EAICNLGBIAH = 7;</code>
       * @return Whether the eAICNLGBIAH field is set.
       */
      public boolean hasEAICNLGBIAH() {
        return eAICNLGBIAHBuilder_ != null || eAICNLGBIAH_ != null;
      }
      /**
       * <code>.GCGGameBriefData EAICNLGBIAH = 7;</code>
       * @return The eAICNLGBIAH.
       */
      public emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData getEAICNLGBIAH() {
        if (eAICNLGBIAHBuilder_ == null) {
          return eAICNLGBIAH_ == null ? emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData.getDefaultInstance() : eAICNLGBIAH_;
        } else {
          return eAICNLGBIAHBuilder_.getMessage();
        }
      }
      /**
       * <code>.GCGGameBriefData EAICNLGBIAH = 7;</code>
       */
      public Builder setEAICNLGBIAH(emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData value) {
        if (eAICNLGBIAHBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          eAICNLGBIAH_ = value;
          onChanged();
        } else {
          eAICNLGBIAHBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.GCGGameBriefData EAICNLGBIAH = 7;</code>
       */
      public Builder setEAICNLGBIAH(
          emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData.Builder builderForValue) {
        if (eAICNLGBIAHBuilder_ == null) {
          eAICNLGBIAH_ = builderForValue.build();
          onChanged();
        } else {
          eAICNLGBIAHBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.GCGGameBriefData EAICNLGBIAH = 7;</code>
       */
      public Builder mergeEAICNLGBIAH(emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData value) {
        if (eAICNLGBIAHBuilder_ == null) {
          if (eAICNLGBIAH_ != null) {
            eAICNLGBIAH_ =
              emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData.newBuilder(eAICNLGBIAH_).mergeFrom(value).buildPartial();
          } else {
            eAICNLGBIAH_ = value;
          }
          onChanged();
        } else {
          eAICNLGBIAHBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.GCGGameBriefData EAICNLGBIAH = 7;</code>
       */
      public Builder clearEAICNLGBIAH() {
        if (eAICNLGBIAHBuilder_ == null) {
          eAICNLGBIAH_ = null;
          onChanged();
        } else {
          eAICNLGBIAH_ = null;
          eAICNLGBIAHBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.GCGGameBriefData EAICNLGBIAH = 7;</code>
       */
      public emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData.Builder getEAICNLGBIAHBuilder() {
        
        onChanged();
        return getEAICNLGBIAHFieldBuilder().getBuilder();
      }
      /**
       * <code>.GCGGameBriefData EAICNLGBIAH = 7;</code>
       */
      public emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefDataOrBuilder getEAICNLGBIAHOrBuilder() {
        if (eAICNLGBIAHBuilder_ != null) {
          return eAICNLGBIAHBuilder_.getMessageOrBuilder();
        } else {
          return eAICNLGBIAH_ == null ?
              emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData.getDefaultInstance() : eAICNLGBIAH_;
        }
      }
      /**
       * <code>.GCGGameBriefData EAICNLGBIAH = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData, emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData.Builder, emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefDataOrBuilder> 
          getEAICNLGBIAHFieldBuilder() {
        if (eAICNLGBIAHBuilder_ == null) {
          eAICNLGBIAHBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData, emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefData.Builder, emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.GCGGameBriefDataOrBuilder>(
                  getEAICNLGBIAH(),
                  getParentForChildren(),
                  isClean());
          eAICNLGBIAH_ = null;
        }
        return eAICNLGBIAHBuilder_;
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


      // @@protoc_insertion_point(builder_scope:COHDKCAHCJH)
    }

    // @@protoc_insertion_point(class_scope:COHDKCAHCJH)
    private static final emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH();
    }

    public static emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<COHDKCAHCJH>
        PARSER = new com.google.protobuf.AbstractParser<COHDKCAHCJH>() {
      @java.lang.Override
      public COHDKCAHCJH parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new COHDKCAHCJH(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<COHDKCAHCJH> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<COHDKCAHCJH> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.COHDKCAHCJHOuterClass.COHDKCAHCJH getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_COHDKCAHCJH_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_COHDKCAHCJH_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021COHDKCAHCJH.proto\032\026GCGGameBriefData.pr" +
      "oto\"J\n\013COHDKCAHCJH\022\023\n\013JODKDAPEEIC\030\017 \001(\r\022" +
      "&\n\013EAICNLGBIAH\030\007 \001(\0132\021.GCGGameBriefDataB" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.getDescriptor(),
        });
    internal_static_COHDKCAHCJH_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_COHDKCAHCJH_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_COHDKCAHCJH_descriptor,
        new java.lang.String[] { "JODKDAPEEIC", "EAICNLGBIAH", });
    emu.grasscutter.net.proto.GCGGameBriefDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
