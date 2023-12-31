// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GadgetStateChange.proto

package emu.grasscutter.net.proto;

public final class GadgetStateChangeOuterClass {
  private GadgetStateChangeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GadgetStateChangeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GadgetStateChange)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gadget_state = 4;</code>
     * @return The gadgetState.
     */
    int getGadgetState();

    /**
     * <code>uint32 ABGKFCBNDIE = 6;</code>
     * @return The aBGKFCBNDIE.
     */
    int getABGKFCBNDIE();
  }
  /**
   * <pre>
   * Obf: FKMCPLNLGJO
   * </pre>
   *
   * Protobuf type {@code GadgetStateChange}
   */
  public static final class GadgetStateChange extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GadgetStateChange)
      GadgetStateChangeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GadgetStateChange.newBuilder() to construct.
    private GadgetStateChange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GadgetStateChange() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GadgetStateChange();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GadgetStateChange(
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
            case 32: {

              gadgetState_ = input.readUInt32();
              break;
            }
            case 48: {

              aBGKFCBNDIE_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GadgetStateChangeOuterClass.internal_static_GadgetStateChange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GadgetStateChangeOuterClass.internal_static_GadgetStateChange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange.class, emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange.Builder.class);
    }

    public static final int GADGET_STATE_FIELD_NUMBER = 4;
    private int gadgetState_;
    /**
     * <code>uint32 gadget_state = 4;</code>
     * @return The gadgetState.
     */
    @java.lang.Override
    public int getGadgetState() {
      return gadgetState_;
    }

    public static final int ABGKFCBNDIE_FIELD_NUMBER = 6;
    private int aBGKFCBNDIE_;
    /**
     * <code>uint32 ABGKFCBNDIE = 6;</code>
     * @return The aBGKFCBNDIE.
     */
    @java.lang.Override
    public int getABGKFCBNDIE() {
      return aBGKFCBNDIE_;
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
      if (gadgetState_ != 0) {
        output.writeUInt32(4, gadgetState_);
      }
      if (aBGKFCBNDIE_ != 0) {
        output.writeUInt32(6, aBGKFCBNDIE_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gadgetState_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, gadgetState_);
      }
      if (aBGKFCBNDIE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, aBGKFCBNDIE_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange other = (emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange) obj;

      if (getGadgetState()
          != other.getGadgetState()) return false;
      if (getABGKFCBNDIE()
          != other.getABGKFCBNDIE()) return false;
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
      hash = (37 * hash) + GADGET_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetState();
      hash = (37 * hash) + ABGKFCBNDIE_FIELD_NUMBER;
      hash = (53 * hash) + getABGKFCBNDIE();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange prototype) {
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
     * Obf: FKMCPLNLGJO
     * </pre>
     *
     * Protobuf type {@code GadgetStateChange}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GadgetStateChange)
        emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChangeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GadgetStateChangeOuterClass.internal_static_GadgetStateChange_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GadgetStateChangeOuterClass.internal_static_GadgetStateChange_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange.class, emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange.newBuilder()
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
        gadgetState_ = 0;

        aBGKFCBNDIE_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GadgetStateChangeOuterClass.internal_static_GadgetStateChange_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange build() {
        emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange buildPartial() {
        emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange result = new emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange(this);
        result.gadgetState_ = gadgetState_;
        result.aBGKFCBNDIE_ = aBGKFCBNDIE_;
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
        if (other instanceof emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange) {
          return mergeFrom((emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange other) {
        if (other == emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange.getDefaultInstance()) return this;
        if (other.getGadgetState() != 0) {
          setGadgetState(other.getGadgetState());
        }
        if (other.getABGKFCBNDIE() != 0) {
          setABGKFCBNDIE(other.getABGKFCBNDIE());
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
        emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int gadgetState_ ;
      /**
       * <code>uint32 gadget_state = 4;</code>
       * @return The gadgetState.
       */
      @java.lang.Override
      public int getGadgetState() {
        return gadgetState_;
      }
      /**
       * <code>uint32 gadget_state = 4;</code>
       * @param value The gadgetState to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetState(int value) {
        
        gadgetState_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_state = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetState() {
        
        gadgetState_ = 0;
        onChanged();
        return this;
      }

      private int aBGKFCBNDIE_ ;
      /**
       * <code>uint32 ABGKFCBNDIE = 6;</code>
       * @return The aBGKFCBNDIE.
       */
      @java.lang.Override
      public int getABGKFCBNDIE() {
        return aBGKFCBNDIE_;
      }
      /**
       * <code>uint32 ABGKFCBNDIE = 6;</code>
       * @param value The aBGKFCBNDIE to set.
       * @return This builder for chaining.
       */
      public Builder setABGKFCBNDIE(int value) {
        
        aBGKFCBNDIE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 ABGKFCBNDIE = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearABGKFCBNDIE() {
        
        aBGKFCBNDIE_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GadgetStateChange)
    }

    // @@protoc_insertion_point(class_scope:GadgetStateChange)
    private static final emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange();
    }

    public static emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GadgetStateChange>
        PARSER = new com.google.protobuf.AbstractParser<GadgetStateChange>() {
      @java.lang.Override
      public GadgetStateChange parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GadgetStateChange(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GadgetStateChange> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GadgetStateChange> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GadgetStateChangeOuterClass.GadgetStateChange getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GadgetStateChange_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GadgetStateChange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GadgetStateChange.proto\">\n\021GadgetState" +
      "Change\022\024\n\014gadget_state\030\004 \001(\r\022\023\n\013ABGKFCBN" +
      "DIE\030\006 \001(\rB\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GadgetStateChange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GadgetStateChange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GadgetStateChange_descriptor,
        new java.lang.String[] { "GadgetState", "ABGKFCBNDIE", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
