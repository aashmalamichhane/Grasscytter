// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DKFNIBLOCIJ.proto

package emu.grasscutter.net.proto;

public final class DKFNIBLOCIJOuterClass {
  private DKFNIBLOCIJOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DKFNIBLOCIJOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DKFNIBLOCIJ)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool HOBCGFAPLKN = 9;</code>
     * @return The hOBCGFAPLKN.
     */
    boolean getHOBCGFAPLKN();

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 id = 8;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * <pre>
   * CmdId: 4982
   * </pre>
   *
   * Protobuf type {@code DKFNIBLOCIJ}
   */
  public static final class DKFNIBLOCIJ extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DKFNIBLOCIJ)
      DKFNIBLOCIJOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DKFNIBLOCIJ.newBuilder() to construct.
    private DKFNIBLOCIJ(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DKFNIBLOCIJ() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DKFNIBLOCIJ();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DKFNIBLOCIJ(
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
            case 48: {

              retcode_ = input.readInt32();
              break;
            }
            case 64: {

              id_ = input.readUInt32();
              break;
            }
            case 72: {

              hOBCGFAPLKN_ = input.readBool();
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
      return emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.internal_static_DKFNIBLOCIJ_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.internal_static_DKFNIBLOCIJ_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ.class, emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ.Builder.class);
    }

    public static final int HOBCGFAPLKN_FIELD_NUMBER = 9;
    private boolean hOBCGFAPLKN_;
    /**
     * <code>bool HOBCGFAPLKN = 9;</code>
     * @return The hOBCGFAPLKN.
     */
    @java.lang.Override
    public boolean getHOBCGFAPLKN() {
      return hOBCGFAPLKN_;
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int ID_FIELD_NUMBER = 8;
    private int id_;
    /**
     * <code>uint32 id = 8;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
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
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (id_ != 0) {
        output.writeUInt32(8, id_);
      }
      if (hOBCGFAPLKN_ != false) {
        output.writeBool(9, hOBCGFAPLKN_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, id_);
      }
      if (hOBCGFAPLKN_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, hOBCGFAPLKN_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ other = (emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ) obj;

      if (getHOBCGFAPLKN()
          != other.getHOBCGFAPLKN()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getId()
          != other.getId()) return false;
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
      hash = (37 * hash) + HOBCGFAPLKN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHOBCGFAPLKN());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ prototype) {
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
     * CmdId: 4982
     * </pre>
     *
     * Protobuf type {@code DKFNIBLOCIJ}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DKFNIBLOCIJ)
        emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.internal_static_DKFNIBLOCIJ_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.internal_static_DKFNIBLOCIJ_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ.class, emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ.newBuilder()
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
        hOBCGFAPLKN_ = false;

        retcode_ = 0;

        id_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.internal_static_DKFNIBLOCIJ_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ build() {
        emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ buildPartial() {
        emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ result = new emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ(this);
        result.hOBCGFAPLKN_ = hOBCGFAPLKN_;
        result.retcode_ = retcode_;
        result.id_ = id_;
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
        if (other instanceof emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ) {
          return mergeFrom((emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ other) {
        if (other == emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ.getDefaultInstance()) return this;
        if (other.getHOBCGFAPLKN() != false) {
          setHOBCGFAPLKN(other.getHOBCGFAPLKN());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getId() != 0) {
          setId(other.getId());
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
        emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean hOBCGFAPLKN_ ;
      /**
       * <code>bool HOBCGFAPLKN = 9;</code>
       * @return The hOBCGFAPLKN.
       */
      @java.lang.Override
      public boolean getHOBCGFAPLKN() {
        return hOBCGFAPLKN_;
      }
      /**
       * <code>bool HOBCGFAPLKN = 9;</code>
       * @param value The hOBCGFAPLKN to set.
       * @return This builder for chaining.
       */
      public Builder setHOBCGFAPLKN(boolean value) {
        
        hOBCGFAPLKN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool HOBCGFAPLKN = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearHOBCGFAPLKN() {
        
        hOBCGFAPLKN_ = false;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>uint32 id = 8;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint32 id = 8;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DKFNIBLOCIJ)
    }

    // @@protoc_insertion_point(class_scope:DKFNIBLOCIJ)
    private static final emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ();
    }

    public static emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DKFNIBLOCIJ>
        PARSER = new com.google.protobuf.AbstractParser<DKFNIBLOCIJ>() {
      @java.lang.Override
      public DKFNIBLOCIJ parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DKFNIBLOCIJ(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DKFNIBLOCIJ> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DKFNIBLOCIJ> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DKFNIBLOCIJOuterClass.DKFNIBLOCIJ getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DKFNIBLOCIJ_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DKFNIBLOCIJ_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DKFNIBLOCIJ.proto\"?\n\013DKFNIBLOCIJ\022\023\n\013HO" +
      "BCGFAPLKN\030\t \001(\010\022\017\n\007retcode\030\006 \001(\005\022\n\n\002id\030\010" +
      " \001(\rB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DKFNIBLOCIJ_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DKFNIBLOCIJ_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DKFNIBLOCIJ_descriptor,
        new java.lang.String[] { "HOBCGFAPLKN", "Retcode", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
