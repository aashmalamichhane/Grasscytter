// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EBGFCAOBHJI.proto

package emu.grasscutter.net.proto;

public final class EBGFCAOBHJIOuterClass {
  private EBGFCAOBHJIOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EBGFCAOBHJIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EBGFCAOBHJI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 target_uid = 4;</code>
     * @return The targetUid.
     */
    int getTargetUid();

    /**
     * <code>bool FAEPBOIJFBG = 5;</code>
     * @return The fAEPBOIJFBG.
     */
    boolean getFAEPBOIJFBG();
  }
  /**
   * <pre>
   * CmdId: 28258
   * </pre>
   *
   * Protobuf type {@code EBGFCAOBHJI}
   */
  public static final class EBGFCAOBHJI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EBGFCAOBHJI)
      EBGFCAOBHJIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EBGFCAOBHJI.newBuilder() to construct.
    private EBGFCAOBHJI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EBGFCAOBHJI() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EBGFCAOBHJI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EBGFCAOBHJI(
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

              targetUid_ = input.readUInt32();
              break;
            }
            case 40: {

              fAEPBOIJFBG_ = input.readBool();
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
      return emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.internal_static_EBGFCAOBHJI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.internal_static_EBGFCAOBHJI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI.class, emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI.Builder.class);
    }

    public static final int TARGET_UID_FIELD_NUMBER = 4;
    private int targetUid_;
    /**
     * <code>uint32 target_uid = 4;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
    }

    public static final int FAEPBOIJFBG_FIELD_NUMBER = 5;
    private boolean fAEPBOIJFBG_;
    /**
     * <code>bool FAEPBOIJFBG = 5;</code>
     * @return The fAEPBOIJFBG.
     */
    @java.lang.Override
    public boolean getFAEPBOIJFBG() {
      return fAEPBOIJFBG_;
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
      if (targetUid_ != 0) {
        output.writeUInt32(4, targetUid_);
      }
      if (fAEPBOIJFBG_ != false) {
        output.writeBool(5, fAEPBOIJFBG_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, targetUid_);
      }
      if (fAEPBOIJFBG_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, fAEPBOIJFBG_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI other = (emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI) obj;

      if (getTargetUid()
          != other.getTargetUid()) return false;
      if (getFAEPBOIJFBG()
          != other.getFAEPBOIJFBG()) return false;
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
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (37 * hash) + FAEPBOIJFBG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getFAEPBOIJFBG());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI prototype) {
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
     * CmdId: 28258
     * </pre>
     *
     * Protobuf type {@code EBGFCAOBHJI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EBGFCAOBHJI)
        emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.internal_static_EBGFCAOBHJI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.internal_static_EBGFCAOBHJI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI.class, emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI.newBuilder()
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
        targetUid_ = 0;

        fAEPBOIJFBG_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.internal_static_EBGFCAOBHJI_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI build() {
        emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI buildPartial() {
        emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI result = new emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI(this);
        result.targetUid_ = targetUid_;
        result.fAEPBOIJFBG_ = fAEPBOIJFBG_;
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
        if (other instanceof emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI) {
          return mergeFrom((emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI other) {
        if (other == emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI.getDefaultInstance()) return this;
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
        }
        if (other.getFAEPBOIJFBG() != false) {
          setFAEPBOIJFBG(other.getFAEPBOIJFBG());
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
        emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 4;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 4;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        
        targetUid_ = 0;
        onChanged();
        return this;
      }

      private boolean fAEPBOIJFBG_ ;
      /**
       * <code>bool FAEPBOIJFBG = 5;</code>
       * @return The fAEPBOIJFBG.
       */
      @java.lang.Override
      public boolean getFAEPBOIJFBG() {
        return fAEPBOIJFBG_;
      }
      /**
       * <code>bool FAEPBOIJFBG = 5;</code>
       * @param value The fAEPBOIJFBG to set.
       * @return This builder for chaining.
       */
      public Builder setFAEPBOIJFBG(boolean value) {
        
        fAEPBOIJFBG_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool FAEPBOIJFBG = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearFAEPBOIJFBG() {
        
        fAEPBOIJFBG_ = false;
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


      // @@protoc_insertion_point(builder_scope:EBGFCAOBHJI)
    }

    // @@protoc_insertion_point(class_scope:EBGFCAOBHJI)
    private static final emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI();
    }

    public static emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EBGFCAOBHJI>
        PARSER = new com.google.protobuf.AbstractParser<EBGFCAOBHJI>() {
      @java.lang.Override
      public EBGFCAOBHJI parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EBGFCAOBHJI(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EBGFCAOBHJI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EBGFCAOBHJI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EBGFCAOBHJIOuterClass.EBGFCAOBHJI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EBGFCAOBHJI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EBGFCAOBHJI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021EBGFCAOBHJI.proto\"6\n\013EBGFCAOBHJI\022\022\n\nta" +
      "rget_uid\030\004 \001(\r\022\023\n\013FAEPBOIJFBG\030\005 \001(\010B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EBGFCAOBHJI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EBGFCAOBHJI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EBGFCAOBHJI_descriptor,
        new java.lang.String[] { "TargetUid", "FAEPBOIJFBG", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
