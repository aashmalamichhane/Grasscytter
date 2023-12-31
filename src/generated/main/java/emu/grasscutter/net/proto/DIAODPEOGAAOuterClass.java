// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DIAODPEOGAA.proto

package emu.grasscutter.net.proto;

public final class DIAODPEOGAAOuterClass {
  private DIAODPEOGAAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DIAODPEOGAAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DIAODPEOGAA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 use_time = 2;</code>
     * @return The useTime.
     */
    int getUseTime();

    /**
     * <code>bool is_open = 4;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();

    /**
     * <code>bool is_finish = 6;</code>
     * @return The isFinish.
     */
    boolean getIsFinish();

    /**
     * <code>uint32 level_id = 13;</code>
     * @return The levelId.
     */
    int getLevelId();
  }
  /**
   * Protobuf type {@code DIAODPEOGAA}
   */
  public static final class DIAODPEOGAA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DIAODPEOGAA)
      DIAODPEOGAAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DIAODPEOGAA.newBuilder() to construct.
    private DIAODPEOGAA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DIAODPEOGAA() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DIAODPEOGAA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DIAODPEOGAA(
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
            case 16: {

              useTime_ = input.readUInt32();
              break;
            }
            case 32: {

              isOpen_ = input.readBool();
              break;
            }
            case 48: {

              isFinish_ = input.readBool();
              break;
            }
            case 104: {

              levelId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.internal_static_DIAODPEOGAA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.internal_static_DIAODPEOGAA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA.class, emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA.Builder.class);
    }

    public static final int USE_TIME_FIELD_NUMBER = 2;
    private int useTime_;
    /**
     * <code>uint32 use_time = 2;</code>
     * @return The useTime.
     */
    @java.lang.Override
    public int getUseTime() {
      return useTime_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 4;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 4;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }

    public static final int IS_FINISH_FIELD_NUMBER = 6;
    private boolean isFinish_;
    /**
     * <code>bool is_finish = 6;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 13;
    private int levelId_;
    /**
     * <code>uint32 level_id = 13;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
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
      if (useTime_ != 0) {
        output.writeUInt32(2, useTime_);
      }
      if (isOpen_ != false) {
        output.writeBool(4, isOpen_);
      }
      if (isFinish_ != false) {
        output.writeBool(6, isFinish_);
      }
      if (levelId_ != 0) {
        output.writeUInt32(13, levelId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (useTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, useTime_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, isOpen_);
      }
      if (isFinish_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isFinish_);
      }
      if (levelId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, levelId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA other = (emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA) obj;

      if (getUseTime()
          != other.getUseTime()) return false;
      if (getIsOpen()
          != other.getIsOpen()) return false;
      if (getIsFinish()
          != other.getIsFinish()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
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
      hash = (37 * hash) + USE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUseTime();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsOpen());
      hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinish());
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA prototype) {
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
     * Protobuf type {@code DIAODPEOGAA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DIAODPEOGAA)
        emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.internal_static_DIAODPEOGAA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.internal_static_DIAODPEOGAA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA.class, emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA.newBuilder()
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
        useTime_ = 0;

        isOpen_ = false;

        isFinish_ = false;

        levelId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.internal_static_DIAODPEOGAA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA build() {
        emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA buildPartial() {
        emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA result = new emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA(this);
        result.useTime_ = useTime_;
        result.isOpen_ = isOpen_;
        result.isFinish_ = isFinish_;
        result.levelId_ = levelId_;
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
        if (other instanceof emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA) {
          return mergeFrom((emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA other) {
        if (other == emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA.getDefaultInstance()) return this;
        if (other.getUseTime() != 0) {
          setUseTime(other.getUseTime());
        }
        if (other.getIsOpen() != false) {
          setIsOpen(other.getIsOpen());
        }
        if (other.getIsFinish() != false) {
          setIsFinish(other.getIsFinish());
        }
        if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
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
        emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int useTime_ ;
      /**
       * <code>uint32 use_time = 2;</code>
       * @return The useTime.
       */
      @java.lang.Override
      public int getUseTime() {
        return useTime_;
      }
      /**
       * <code>uint32 use_time = 2;</code>
       * @param value The useTime to set.
       * @return This builder for chaining.
       */
      public Builder setUseTime(int value) {
        
        useTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 use_time = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUseTime() {
        
        useTime_ = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code>bool is_open = 4;</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return isOpen_;
      }
      /**
       * <code>bool is_open = 4;</code>
       * @param value The isOpen to set.
       * @return This builder for chaining.
       */
      public Builder setIsOpen(boolean value) {
        
        isOpen_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_open = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }

      private boolean isFinish_ ;
      /**
       * <code>bool is_finish = 6;</code>
       * @return The isFinish.
       */
      @java.lang.Override
      public boolean getIsFinish() {
        return isFinish_;
      }
      /**
       * <code>bool is_finish = 6;</code>
       * @param value The isFinish to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinish(boolean value) {
        
        isFinish_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finish = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinish() {
        
        isFinish_ = false;
        onChanged();
        return this;
      }

      private int levelId_ ;
      /**
       * <code>uint32 level_id = 13;</code>
       * @return The levelId.
       */
      @java.lang.Override
      public int getLevelId() {
        return levelId_;
      }
      /**
       * <code>uint32 level_id = 13;</code>
       * @param value The levelId to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DIAODPEOGAA)
    }

    // @@protoc_insertion_point(class_scope:DIAODPEOGAA)
    private static final emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA();
    }

    public static emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DIAODPEOGAA>
        PARSER = new com.google.protobuf.AbstractParser<DIAODPEOGAA>() {
      @java.lang.Override
      public DIAODPEOGAA parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DIAODPEOGAA(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DIAODPEOGAA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DIAODPEOGAA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DIAODPEOGAAOuterClass.DIAODPEOGAA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DIAODPEOGAA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DIAODPEOGAA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021DIAODPEOGAA.proto\"U\n\013DIAODPEOGAA\022\020\n\010us" +
      "e_time\030\002 \001(\r\022\017\n\007is_open\030\004 \001(\010\022\021\n\tis_fini" +
      "sh\030\006 \001(\010\022\020\n\010level_id\030\r \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DIAODPEOGAA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DIAODPEOGAA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DIAODPEOGAA_descriptor,
        new java.lang.String[] { "UseTime", "IsOpen", "IsFinish", "LevelId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
