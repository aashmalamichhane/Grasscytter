// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GFAHHOAABGD.proto

package emu.grasscutter.net.proto;

public final class GFAHHOAABGDOuterClass {
  private GFAHHOAABGDOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GFAHHOAABGDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GFAHHOAABGD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 guid = 15;</code>
     * @return The guid.
     */
    long getGuid();

    /**
     * <code>.JOGGPMEEOEL JEHCBHFBMIF = 13;</code>
     * @return Whether the jEHCBHFBMIF field is set.
     */
    boolean hasJEHCBHFBMIF();
    /**
     * <code>.JOGGPMEEOEL JEHCBHFBMIF = 13;</code>
     * @return The jEHCBHFBMIF.
     */
    emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL getJEHCBHFBMIF();
    /**
     * <code>.JOGGPMEEOEL JEHCBHFBMIF = 13;</code>
     */
    emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOELOrBuilder getJEHCBHFBMIFOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 27271
   * </pre>
   *
   * Protobuf type {@code GFAHHOAABGD}
   */
  public static final class GFAHHOAABGD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GFAHHOAABGD)
      GFAHHOAABGDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GFAHHOAABGD.newBuilder() to construct.
    private GFAHHOAABGD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GFAHHOAABGD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GFAHHOAABGD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GFAHHOAABGD(
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
            case 106: {
              emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL.Builder subBuilder = null;
              if (jEHCBHFBMIF_ != null) {
                subBuilder = jEHCBHFBMIF_.toBuilder();
              }
              jEHCBHFBMIF_ = input.readMessage(emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(jEHCBHFBMIF_);
                jEHCBHFBMIF_ = subBuilder.buildPartial();
              }

              break;
            }
            case 120: {

              guid_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.internal_static_GFAHHOAABGD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.internal_static_GFAHHOAABGD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD.class, emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD.Builder.class);
    }

    public static final int GUID_FIELD_NUMBER = 15;
    private long guid_;
    /**
     * <code>uint64 guid = 15;</code>
     * @return The guid.
     */
    @java.lang.Override
    public long getGuid() {
      return guid_;
    }

    public static final int JEHCBHFBMIF_FIELD_NUMBER = 13;
    private emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL jEHCBHFBMIF_;
    /**
     * <code>.JOGGPMEEOEL JEHCBHFBMIF = 13;</code>
     * @return Whether the jEHCBHFBMIF field is set.
     */
    @java.lang.Override
    public boolean hasJEHCBHFBMIF() {
      return jEHCBHFBMIF_ != null;
    }
    /**
     * <code>.JOGGPMEEOEL JEHCBHFBMIF = 13;</code>
     * @return The jEHCBHFBMIF.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL getJEHCBHFBMIF() {
      return jEHCBHFBMIF_ == null ? emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL.getDefaultInstance() : jEHCBHFBMIF_;
    }
    /**
     * <code>.JOGGPMEEOEL JEHCBHFBMIF = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOELOrBuilder getJEHCBHFBMIFOrBuilder() {
      return getJEHCBHFBMIF();
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
      if (jEHCBHFBMIF_ != null) {
        output.writeMessage(13, getJEHCBHFBMIF());
      }
      if (guid_ != 0L) {
        output.writeUInt64(15, guid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (jEHCBHFBMIF_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, getJEHCBHFBMIF());
      }
      if (guid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(15, guid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD other = (emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD) obj;

      if (getGuid()
          != other.getGuid()) return false;
      if (hasJEHCBHFBMIF() != other.hasJEHCBHFBMIF()) return false;
      if (hasJEHCBHFBMIF()) {
        if (!getJEHCBHFBMIF()
            .equals(other.getJEHCBHFBMIF())) return false;
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
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGuid());
      if (hasJEHCBHFBMIF()) {
        hash = (37 * hash) + JEHCBHFBMIF_FIELD_NUMBER;
        hash = (53 * hash) + getJEHCBHFBMIF().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD prototype) {
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
     * CmdId: 27271
     * </pre>
     *
     * Protobuf type {@code GFAHHOAABGD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GFAHHOAABGD)
        emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.internal_static_GFAHHOAABGD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.internal_static_GFAHHOAABGD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD.class, emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD.newBuilder()
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
        guid_ = 0L;

        if (jEHCBHFBMIFBuilder_ == null) {
          jEHCBHFBMIF_ = null;
        } else {
          jEHCBHFBMIF_ = null;
          jEHCBHFBMIFBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.internal_static_GFAHHOAABGD_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD build() {
        emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD buildPartial() {
        emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD result = new emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD(this);
        result.guid_ = guid_;
        if (jEHCBHFBMIFBuilder_ == null) {
          result.jEHCBHFBMIF_ = jEHCBHFBMIF_;
        } else {
          result.jEHCBHFBMIF_ = jEHCBHFBMIFBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD) {
          return mergeFrom((emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD other) {
        if (other == emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD.getDefaultInstance()) return this;
        if (other.getGuid() != 0L) {
          setGuid(other.getGuid());
        }
        if (other.hasJEHCBHFBMIF()) {
          mergeJEHCBHFBMIF(other.getJEHCBHFBMIF());
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
        emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long guid_ ;
      /**
       * <code>uint64 guid = 15;</code>
       * @return The guid.
       */
      @java.lang.Override
      public long getGuid() {
        return guid_;
      }
      /**
       * <code>uint64 guid = 15;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(long value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 guid = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0L;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL jEHCBHFBMIF_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL, emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL.Builder, emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOELOrBuilder> jEHCBHFBMIFBuilder_;
      /**
       * <code>.JOGGPMEEOEL JEHCBHFBMIF = 13;</code>
       * @return Whether the jEHCBHFBMIF field is set.
       */
      public boolean hasJEHCBHFBMIF() {
        return jEHCBHFBMIFBuilder_ != null || jEHCBHFBMIF_ != null;
      }
      /**
       * <code>.JOGGPMEEOEL JEHCBHFBMIF = 13;</code>
       * @return The jEHCBHFBMIF.
       */
      public emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL getJEHCBHFBMIF() {
        if (jEHCBHFBMIFBuilder_ == null) {
          return jEHCBHFBMIF_ == null ? emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL.getDefaultInstance() : jEHCBHFBMIF_;
        } else {
          return jEHCBHFBMIFBuilder_.getMessage();
        }
      }
      /**
       * <code>.JOGGPMEEOEL JEHCBHFBMIF = 13;</code>
       */
      public Builder setJEHCBHFBMIF(emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL value) {
        if (jEHCBHFBMIFBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          jEHCBHFBMIF_ = value;
          onChanged();
        } else {
          jEHCBHFBMIFBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.JOGGPMEEOEL JEHCBHFBMIF = 13;</code>
       */
      public Builder setJEHCBHFBMIF(
          emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL.Builder builderForValue) {
        if (jEHCBHFBMIFBuilder_ == null) {
          jEHCBHFBMIF_ = builderForValue.build();
          onChanged();
        } else {
          jEHCBHFBMIFBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.JOGGPMEEOEL JEHCBHFBMIF = 13;</code>
       */
      public Builder mergeJEHCBHFBMIF(emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL value) {
        if (jEHCBHFBMIFBuilder_ == null) {
          if (jEHCBHFBMIF_ != null) {
            jEHCBHFBMIF_ =
              emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL.newBuilder(jEHCBHFBMIF_).mergeFrom(value).buildPartial();
          } else {
            jEHCBHFBMIF_ = value;
          }
          onChanged();
        } else {
          jEHCBHFBMIFBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.JOGGPMEEOEL JEHCBHFBMIF = 13;</code>
       */
      public Builder clearJEHCBHFBMIF() {
        if (jEHCBHFBMIFBuilder_ == null) {
          jEHCBHFBMIF_ = null;
          onChanged();
        } else {
          jEHCBHFBMIF_ = null;
          jEHCBHFBMIFBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.JOGGPMEEOEL JEHCBHFBMIF = 13;</code>
       */
      public emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL.Builder getJEHCBHFBMIFBuilder() {
        
        onChanged();
        return getJEHCBHFBMIFFieldBuilder().getBuilder();
      }
      /**
       * <code>.JOGGPMEEOEL JEHCBHFBMIF = 13;</code>
       */
      public emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOELOrBuilder getJEHCBHFBMIFOrBuilder() {
        if (jEHCBHFBMIFBuilder_ != null) {
          return jEHCBHFBMIFBuilder_.getMessageOrBuilder();
        } else {
          return jEHCBHFBMIF_ == null ?
              emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL.getDefaultInstance() : jEHCBHFBMIF_;
        }
      }
      /**
       * <code>.JOGGPMEEOEL JEHCBHFBMIF = 13;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL, emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL.Builder, emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOELOrBuilder> 
          getJEHCBHFBMIFFieldBuilder() {
        if (jEHCBHFBMIFBuilder_ == null) {
          jEHCBHFBMIFBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL, emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOEL.Builder, emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.JOGGPMEEOELOrBuilder>(
                  getJEHCBHFBMIF(),
                  getParentForChildren(),
                  isClean());
          jEHCBHFBMIF_ = null;
        }
        return jEHCBHFBMIFBuilder_;
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


      // @@protoc_insertion_point(builder_scope:GFAHHOAABGD)
    }

    // @@protoc_insertion_point(class_scope:GFAHHOAABGD)
    private static final emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD();
    }

    public static emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GFAHHOAABGD>
        PARSER = new com.google.protobuf.AbstractParser<GFAHHOAABGD>() {
      @java.lang.Override
      public GFAHHOAABGD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GFAHHOAABGD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GFAHHOAABGD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GFAHHOAABGD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GFAHHOAABGDOuterClass.GFAHHOAABGD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GFAHHOAABGD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GFAHHOAABGD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GFAHHOAABGD.proto\032\021JOGGPMEEOEL.proto\">" +
      "\n\013GFAHHOAABGD\022\014\n\004guid\030\017 \001(\004\022!\n\013JEHCBHFBM" +
      "IF\030\r \001(\0132\014.JOGGPMEEOELB\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.getDescriptor(),
        });
    internal_static_GFAHHOAABGD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GFAHHOAABGD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GFAHHOAABGD_descriptor,
        new java.lang.String[] { "Guid", "JEHCBHFBMIF", });
    emu.grasscutter.net.proto.JOGGPMEEOELOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
