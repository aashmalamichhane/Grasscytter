// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ODHOAOAKEFG.proto

package emu.grasscutter.net.proto;

public final class ODHOAOAKEFGOuterClass {
  private ODHOAOAKEFGOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ODHOAOAKEFGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ODHOAOAKEFG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 BDOMGHGDNCC = 10;</code>
     * @return The bDOMGHGDNCC.
     */
    int getBDOMGHGDNCC();

    /**
     * <code>uint32 EHKDOAMAOBK = 1;</code>
     * @return The eHKDOAMAOBK.
     */
    int getEHKDOAMAOBK();

    /**
     * <code>uint32 KLBBEDHBBIO = 3;</code>
     * @return The kLBBEDHBBIO.
     */
    int getKLBBEDHBBIO();

    /**
     * <code>uint32 FELHGEPLMCP = 8;</code>
     * @return The fELHGEPLMCP.
     */
    int getFELHGEPLMCP();
  }
  /**
   * Protobuf type {@code ODHOAOAKEFG}
   */
  public static final class ODHOAOAKEFG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ODHOAOAKEFG)
      ODHOAOAKEFGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ODHOAOAKEFG.newBuilder() to construct.
    private ODHOAOAKEFG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ODHOAOAKEFG() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ODHOAOAKEFG();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ODHOAOAKEFG(
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

              eHKDOAMAOBK_ = input.readUInt32();
              break;
            }
            case 24: {

              kLBBEDHBBIO_ = input.readUInt32();
              break;
            }
            case 64: {

              fELHGEPLMCP_ = input.readUInt32();
              break;
            }
            case 80: {

              bDOMGHGDNCC_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.internal_static_ODHOAOAKEFG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.internal_static_ODHOAOAKEFG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG.class, emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG.Builder.class);
    }

    public static final int BDOMGHGDNCC_FIELD_NUMBER = 10;
    private int bDOMGHGDNCC_;
    /**
     * <code>uint32 BDOMGHGDNCC = 10;</code>
     * @return The bDOMGHGDNCC.
     */
    @java.lang.Override
    public int getBDOMGHGDNCC() {
      return bDOMGHGDNCC_;
    }

    public static final int EHKDOAMAOBK_FIELD_NUMBER = 1;
    private int eHKDOAMAOBK_;
    /**
     * <code>uint32 EHKDOAMAOBK = 1;</code>
     * @return The eHKDOAMAOBK.
     */
    @java.lang.Override
    public int getEHKDOAMAOBK() {
      return eHKDOAMAOBK_;
    }

    public static final int KLBBEDHBBIO_FIELD_NUMBER = 3;
    private int kLBBEDHBBIO_;
    /**
     * <code>uint32 KLBBEDHBBIO = 3;</code>
     * @return The kLBBEDHBBIO.
     */
    @java.lang.Override
    public int getKLBBEDHBBIO() {
      return kLBBEDHBBIO_;
    }

    public static final int FELHGEPLMCP_FIELD_NUMBER = 8;
    private int fELHGEPLMCP_;
    /**
     * <code>uint32 FELHGEPLMCP = 8;</code>
     * @return The fELHGEPLMCP.
     */
    @java.lang.Override
    public int getFELHGEPLMCP() {
      return fELHGEPLMCP_;
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
      if (eHKDOAMAOBK_ != 0) {
        output.writeUInt32(1, eHKDOAMAOBK_);
      }
      if (kLBBEDHBBIO_ != 0) {
        output.writeUInt32(3, kLBBEDHBBIO_);
      }
      if (fELHGEPLMCP_ != 0) {
        output.writeUInt32(8, fELHGEPLMCP_);
      }
      if (bDOMGHGDNCC_ != 0) {
        output.writeUInt32(10, bDOMGHGDNCC_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (eHKDOAMAOBK_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, eHKDOAMAOBK_);
      }
      if (kLBBEDHBBIO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, kLBBEDHBBIO_);
      }
      if (fELHGEPLMCP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, fELHGEPLMCP_);
      }
      if (bDOMGHGDNCC_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, bDOMGHGDNCC_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG other = (emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG) obj;

      if (getBDOMGHGDNCC()
          != other.getBDOMGHGDNCC()) return false;
      if (getEHKDOAMAOBK()
          != other.getEHKDOAMAOBK()) return false;
      if (getKLBBEDHBBIO()
          != other.getKLBBEDHBBIO()) return false;
      if (getFELHGEPLMCP()
          != other.getFELHGEPLMCP()) return false;
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
      hash = (37 * hash) + BDOMGHGDNCC_FIELD_NUMBER;
      hash = (53 * hash) + getBDOMGHGDNCC();
      hash = (37 * hash) + EHKDOAMAOBK_FIELD_NUMBER;
      hash = (53 * hash) + getEHKDOAMAOBK();
      hash = (37 * hash) + KLBBEDHBBIO_FIELD_NUMBER;
      hash = (53 * hash) + getKLBBEDHBBIO();
      hash = (37 * hash) + FELHGEPLMCP_FIELD_NUMBER;
      hash = (53 * hash) + getFELHGEPLMCP();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG prototype) {
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
     * Protobuf type {@code ODHOAOAKEFG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ODHOAOAKEFG)
        emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.internal_static_ODHOAOAKEFG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.internal_static_ODHOAOAKEFG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG.class, emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG.newBuilder()
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
        bDOMGHGDNCC_ = 0;

        eHKDOAMAOBK_ = 0;

        kLBBEDHBBIO_ = 0;

        fELHGEPLMCP_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.internal_static_ODHOAOAKEFG_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG build() {
        emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG buildPartial() {
        emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG result = new emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG(this);
        result.bDOMGHGDNCC_ = bDOMGHGDNCC_;
        result.eHKDOAMAOBK_ = eHKDOAMAOBK_;
        result.kLBBEDHBBIO_ = kLBBEDHBBIO_;
        result.fELHGEPLMCP_ = fELHGEPLMCP_;
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
        if (other instanceof emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG) {
          return mergeFrom((emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG other) {
        if (other == emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG.getDefaultInstance()) return this;
        if (other.getBDOMGHGDNCC() != 0) {
          setBDOMGHGDNCC(other.getBDOMGHGDNCC());
        }
        if (other.getEHKDOAMAOBK() != 0) {
          setEHKDOAMAOBK(other.getEHKDOAMAOBK());
        }
        if (other.getKLBBEDHBBIO() != 0) {
          setKLBBEDHBBIO(other.getKLBBEDHBBIO());
        }
        if (other.getFELHGEPLMCP() != 0) {
          setFELHGEPLMCP(other.getFELHGEPLMCP());
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
        emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bDOMGHGDNCC_ ;
      /**
       * <code>uint32 BDOMGHGDNCC = 10;</code>
       * @return The bDOMGHGDNCC.
       */
      @java.lang.Override
      public int getBDOMGHGDNCC() {
        return bDOMGHGDNCC_;
      }
      /**
       * <code>uint32 BDOMGHGDNCC = 10;</code>
       * @param value The bDOMGHGDNCC to set.
       * @return This builder for chaining.
       */
      public Builder setBDOMGHGDNCC(int value) {
        
        bDOMGHGDNCC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BDOMGHGDNCC = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearBDOMGHGDNCC() {
        
        bDOMGHGDNCC_ = 0;
        onChanged();
        return this;
      }

      private int eHKDOAMAOBK_ ;
      /**
       * <code>uint32 EHKDOAMAOBK = 1;</code>
       * @return The eHKDOAMAOBK.
       */
      @java.lang.Override
      public int getEHKDOAMAOBK() {
        return eHKDOAMAOBK_;
      }
      /**
       * <code>uint32 EHKDOAMAOBK = 1;</code>
       * @param value The eHKDOAMAOBK to set.
       * @return This builder for chaining.
       */
      public Builder setEHKDOAMAOBK(int value) {
        
        eHKDOAMAOBK_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 EHKDOAMAOBK = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearEHKDOAMAOBK() {
        
        eHKDOAMAOBK_ = 0;
        onChanged();
        return this;
      }

      private int kLBBEDHBBIO_ ;
      /**
       * <code>uint32 KLBBEDHBBIO = 3;</code>
       * @return The kLBBEDHBBIO.
       */
      @java.lang.Override
      public int getKLBBEDHBBIO() {
        return kLBBEDHBBIO_;
      }
      /**
       * <code>uint32 KLBBEDHBBIO = 3;</code>
       * @param value The kLBBEDHBBIO to set.
       * @return This builder for chaining.
       */
      public Builder setKLBBEDHBBIO(int value) {
        
        kLBBEDHBBIO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 KLBBEDHBBIO = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearKLBBEDHBBIO() {
        
        kLBBEDHBBIO_ = 0;
        onChanged();
        return this;
      }

      private int fELHGEPLMCP_ ;
      /**
       * <code>uint32 FELHGEPLMCP = 8;</code>
       * @return The fELHGEPLMCP.
       */
      @java.lang.Override
      public int getFELHGEPLMCP() {
        return fELHGEPLMCP_;
      }
      /**
       * <code>uint32 FELHGEPLMCP = 8;</code>
       * @param value The fELHGEPLMCP to set.
       * @return This builder for chaining.
       */
      public Builder setFELHGEPLMCP(int value) {
        
        fELHGEPLMCP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 FELHGEPLMCP = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearFELHGEPLMCP() {
        
        fELHGEPLMCP_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ODHOAOAKEFG)
    }

    // @@protoc_insertion_point(class_scope:ODHOAOAKEFG)
    private static final emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG();
    }

    public static emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ODHOAOAKEFG>
        PARSER = new com.google.protobuf.AbstractParser<ODHOAOAKEFG>() {
      @java.lang.Override
      public ODHOAOAKEFG parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ODHOAOAKEFG(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ODHOAOAKEFG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ODHOAOAKEFG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ODHOAOAKEFGOuterClass.ODHOAOAKEFG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ODHOAOAKEFG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ODHOAOAKEFG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ODHOAOAKEFG.proto\"a\n\013ODHOAOAKEFG\022\023\n\013BD" +
      "OMGHGDNCC\030\n \001(\r\022\023\n\013EHKDOAMAOBK\030\001 \001(\r\022\023\n\013" +
      "KLBBEDHBBIO\030\003 \001(\r\022\023\n\013FELHGEPLMCP\030\010 \001(\rB\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ODHOAOAKEFG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ODHOAOAKEFG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ODHOAOAKEFG_descriptor,
        new java.lang.String[] { "BDOMGHGDNCC", "EHKDOAMAOBK", "KLBBEDHBBIO", "FELHGEPLMCP", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
